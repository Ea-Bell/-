package auth.command;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginViewHandler
 */
@WebServlet("/login")
public class LoginViewHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
	   private String url="/webTest/View/login/login.jsp";
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginViewHandler() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if(request.getMethod().equalsIgnoreCase("GET")) {
		request.getRequestDispatcher(url).forward(request, response);
		}else
			doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	}

}
