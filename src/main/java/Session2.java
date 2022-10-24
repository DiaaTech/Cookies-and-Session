

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/session2")
public class Session2 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		HttpSession session2 = request.getSession(false);
		if(session2 == null) {
			out.print("Error | User is not logged In");
		}
		else {
			String nameString = (String) session2.getAttribute("name");
			String passwordString = (String) session2.getAttribute("password");
			
			
			out.println("ID: "+ session2.getId());
			out.println("ID: "+ session2.getCreationTime());
			
			out.println(nameString);
			out.println(passwordString);
			
		}
		
	}


}
