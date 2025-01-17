package article.command;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import article.model.Writer;
import article.service.WriteArticleService;
import article.service.WriteRequest;
import auth.service.User;

/**
 * Servlet implementation class WriteArticleHandler
 */
@WebServlet("/WriteArticle")
public class WriteArticleHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String FORM_VIEW = "webTest/View/article/newArticleForm.jsp";
    private WriteArticleService writeArticleService = new WriteArticleService();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WriteArticleHandler() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processSbumit(request,  response);
		
//		Map<String, Boolean> errors = new HashMap<>();
//		
//		User user= (User)request.getSession(false).getAttribute("authUser");
//		WriteRequest writeRequest = createWriteRequest(user, request);
//		writeRequest.validate(errors);
//		if(!errors.isEmpty()) {
//		response.sendRedirect( FORM_VIEW);
//		}
//		int newArticleNo = writeArticleService.write(writeRequest);
//		request.setAttribute("newArticleNo", newArticleNo);
//		response.sendRedirect("webTest/View/article/newArticleSuccess.jsp");
		
	}

	private  void processSbumit(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		Map<String, Boolean> errors = new HashMap<>();
		
		User user= (User)request.getSession(false).getAttribute("authUser");
		WriteRequest writeRequest = createWriteRequest(user, request);
		writeRequest.validate(errors);
		if(!errors.isEmpty()) {
			//return FORM_VIEW;
			response.sendRedirect(FORM_VIEW);
			
		}
		int newArticleNo = writeArticleService.write(writeRequest);
		request.setAttribute("newArticleNo", newArticleNo);
		//return "webTest/View/article/newArticleSuccess.jsp";
		response.sendRedirect("webTest/View/article/newArticleSuccess.jsp");
	}

	
	
	
	
	private WriteRequest createWriteRequest(User user, HttpServletRequest request) {
		return new WriteRequest(new Writer(user.getId(), user.getName()),
		request.getParameter("title"),
		request.getParameter("content"));
	}

}
