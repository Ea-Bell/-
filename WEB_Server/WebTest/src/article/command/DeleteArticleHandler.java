package article.command;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import article.service.ArticleData;
import article.service.ArticleNotFoundException;
import article.service.DeleteArticleService;
import article.service.ModifyArticleService;
import article.service.DeleteRequest;
import article.service.ReadArticleService;
import auth.service.User;

/**
 * Servlet implementation class DeleteArticleHandler
 */
@WebServlet("/delete")
public class DeleteArticleHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static final String FORM_VIEW = "/webTest/View/article/deleteForm.jsp";
    private ReadArticleService readService= new ReadArticleService();
    private DeleteArticleService deleteService = new DeleteArticleService();   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteArticleHandler() {
        super();
        // TODO Auto-generated constructor stub
    }
    /*
     * GET: 수정할 게시글 데이터를 읽어와 폼에 보여준다.->processForm(req, res);
     * POST: 전송한 요청 파라미터를 이용해서 게시글을 수정한다. 파라미터가 값이 잘못 된 경우
     * 전송한 데이터를 이용해서 폼을 다시 보여준다. processSubmit(req,res);
     * 
     * */
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		if(request.getMethod().equalsIgnoreCase("GET")) {
			//processForm(request, response);	
			try {
				processSubmit(request,response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else
			
		doPost(request, response);		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

//		try {			 
//			 //값이 안넘어 오는거 확인됨 처리 요망후 삭제
//			processSubmit(request,response);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}	
	}
	
	
	private void processSubmit(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		
		User authUser =(User)req.getSession().getAttribute("authUser");
		//test
		String noVal =req.getParameter("no");
		int no = Integer.parseInt(noVal);
		
		DeleteRequest delReq= new DeleteRequest(authUser.getId(),no);
		req.setAttribute("modReq", delReq);
		
		try {
			deleteService.Dlete(delReq);
//			RequestDispatcher dispatcher = req.getRequestDispatcher("/ListArticle");
//			dispatcher.forward(req, res);
			res.sendRedirect("/ListArticle");
		}catch (Exception e) {
			// TODO: handle exception
			res.sendError(HttpServletResponse.SC_NOT_FOUND);
		}
		
		
	}
	private void processForm(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		// TODO Auto-generated method stub
		try {
			String noVal= req.getParameter("no");
			int no = Integer.parseInt(noVal);
			ArticleData articleData = readService.getArticle(no, false);
			User authUser =(User)req.getSession().getAttribute("authUser");
			if(!canModify(authUser, articleData)) {
				res.sendError(HttpServletResponse.SC_FORBIDDEN);
			}
			DeleteRequest delReq= new DeleteRequest(authUser.getId(), no);
			req.setAttribute("modReq", delReq);
			
			RequestDispatcher dispatcher = req.getRequestDispatcher(FORM_VIEW);
			dispatcher.forward(req, res);
			//res.sendRedirect(FORM_VIEW);
			
		}catch(ArticleNotFoundException e) {
			res.sendError(HttpServletResponse.SC_NOT_FOUND);
		}
	}
	private boolean canModify(User authUser, ArticleData articleData) {
		// TODO Auto-generated method stub
		String writerId = articleData.getArticle().getWriter().getId();
		return authUser.getId().equals(writerId);
	}

}
