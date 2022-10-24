

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet")
public class Servlet extends HttpServlet {

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out = response.getWriter();
		
		
		String name = request.getParameter("userName");
		String password = request.getParameter("password");
		
		String teString = request.getParameter("test");
				
		out.println(name + ", " + password + ", " + teString);
		
		
		Cookie cookie = new Cookie("userName", "Talha");		// creation of cookie
		
		Cookie cookie1 = new Cookie("item1", "Table");		// creation of cookie
		
		Cookie cookie2 = new Cookie("item2", "Chair");		// creation of cookie
		
		Cookie cookie3 = new Cookie("price", "100$");		// creation of cookie
		
		
		response.addCookie(cookie); 				// adding of cookie for client
		response.addCookie(cookie1);
		response.addCookie(cookie2);
		response.addCookie(cookie3);
		
		out.print("Cookie is created");
	}

	
}
