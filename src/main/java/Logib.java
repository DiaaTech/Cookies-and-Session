

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/login")
public class Logib extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		
		String name = request.getParameter("userName");
		String password = request.getParameter("password");
		
		// It will check if session of this user already exist or not
		// if it's not exist then it will create a new session
		HttpSession session = request.getSession(true);			// create my session
		
		session.setAttribute("login", "true");
		session.setAttribute("name", name);
		session.setAttribute("password", password);

		
		// It will check if session of this user already exist or not
		// it will not create new session
		//HttpSession session2 = request.getSession(false);		 	
		
	}

	

}
