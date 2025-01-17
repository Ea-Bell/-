package article.service;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ReadArticleHandler
 */
@WebServlet("/read")
public class ReadArticleHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private ReadArticleService readArticleService = new ReadArticleService();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReadArticleHandler() {
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
		
		String noVal= request.getParameter("no");
		
		int articleNum = Integer.parseInt(noVal);
		//articleNum=0;
		try {
			ArticleData articleData = readArticleService.getArticle(articleNum, true);
			request.setAttribute("articleData", articleData);
			RequestDispatcher dispatcher = request.getRequestDispatcher("/webTest/View/article/readArticle.jsp");			
			dispatcher.forward(request, response);
			
		}catch (ArticleNotFoundException | ArticleContentNotFoundException e) {
			// TODO: handle exception
			request.getServletContext().log("no Article", e);
			response.sendError(HttpServletResponse.SC_NOT_FOUND); 			
		}
	}

}
