

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/secondServlet")
public class secondServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		out.println("Data of our Cookie");
		
		Cookie [] cookies = request.getCookies();			// access the ddata of cookie
		
		if(cookies == null) {
			out.println("No Cookies");
		}
		else {
		
			for(int i = 0; i < cookies.length; i++) {
				out.println(cookies[i].getName() + "   " + cookies[i].getValue());
			}
		
			out.println("Cookies are Readed");
	
		}
		}
	



}
