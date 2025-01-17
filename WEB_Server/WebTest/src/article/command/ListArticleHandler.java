package article.command;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import article.service.ArticlePage;
import article.service.ListArticleService;


/**
 * Servlet implementation class ListArticleHandler
 */
@WebServlet("/ListArticle")
public class ListArticleHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ArticlePage articlePage;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListArticleHandler() {
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
		String url=null;
		try {
		 url=process(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
				dispatcher.forward(request, response);
		
		//response.sendRedirect(url);
	}
	
	
	
	private String process(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub


		
		
		ListArticleService listService = new ListArticleService();
		String pageNoVal = request.getParameter("pageNo");
		int pageNo=1;
		if(pageNoVal!=null) {
			pageNo = Integer.parseInt(pageNoVal);
			
		}
		 articlePage = listService.getArticlePage(pageNo);
		request.setAttribute("articlePage", articlePage);
		return "webTest/View/article/listArticle.jsp";
		
	}

}
