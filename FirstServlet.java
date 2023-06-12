import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
// No Annotation
public class FirstServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		try {

			response.setContentType("text/html");
			PrintWriter out = response.getWriter();

			String n = request.getParameter("userName");
			out.print("Welcome " + n);

			HttpSession session = request.getSession(true);
			session.setAttribute("uname", n);

			out.print("<a href='servlet2'>visit</a>");

			out.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	
	/*
	 * public HttpSession getSession(){ // get session value // if presnet -> return
	 * that session // if not presnet -> create new session HttpSession session =
	 * new HttpSession(); return session; }
	 * 
	 * public HttpSession getSession(boolean value){ if(value) { // get session
	 * value // if presnet -> return that session // if not presnet -> create new
	 * session HttpSession session = new HttpSession(); return session; } else { //
	 * get session value // if presnet -> return that session // if not presnet ->
	 * return null } }
	 */

}
