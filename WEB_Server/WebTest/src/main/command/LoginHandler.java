package main.command;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import auth.service.LoginFailException;
import auth.service.LoginService;
import auth.service.User;

/**
 * Servlet implementation class LoginHandler
 */
@WebServlet("/Login")
public class LoginHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private LoginService loginService = new LoginService();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginHandler() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			processSubmit(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void processSubmit(HttpServletRequest request, HttpServletResponse response) throws Exception {

		Map<String, Boolean> errors = new HashMap<>();
		request.setAttribute("errors", errors);
		//RequestDispatcher dispatcher = null;
		String url = null;

		try {

			String id = trim(request.getParameter("id"));
			String password = trim(request.getParameter("password"));

			if (id == null || id.isEmpty()) {
				errors.put("id", Boolean.TRUE);
				request.setAttribute("아이디를 입력해주십시오", id);
				url = "/webTest/View/login/login.jsp?id=idIsEmpty";
				response.sendRedirect(url);

			} else if (password == null || password.isEmpty()) {
				url = "/webTest/View/login/login.jsp?pwd=pwdIsEmpty";
				response.sendRedirect(url);
			}

			// 에러날시
			if (!errors.isEmpty()) {
//				dispatcher = request.getRequestDispatcher("/webTest/View/login/login.jsp");
//				 dispatcher.forward(request, response);
				response.sendRedirect(url);
			}

			User user = loginService.login(id, password);
			request.getSession().setAttribute("authUser", user);
			response.sendRedirect("/webTest/View/login/index.jsp");
//			ServletContext context = this.getServletContext();
//			dispatcher = context.getRequestDispatcher("/webTest/View/login/index.jsp");
//			dispatcher.forward(request, response);

		} catch (LoginFailException e) {
			// TODO: handle exception
			response.sendRedirect("/webTest/View/login/login.jsp?pwd=pwdIsNotMatch");
		}
	}

	private String trim(String parameter) {
		// TODO Auto-generated method stub
		return parameter == null ? null : parameter.trim();

	}
}
