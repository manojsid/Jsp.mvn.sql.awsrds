package tk.manojsid.web;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import tk.manojsid.web.dao.AlienDao;
import tk.manojsid.web.model.Alien;

/**
 * Servlet implementation class GetAlienController
 */
public class GetAlienControl extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int aid = Integer.parseInt(request.getParameter("aid"));
		AlienDao dao  = new AlienDao();
		Alien a1 = dao.getAlien(aid);
		
		request.setAttribute("alien", a1);
		
		RequestDispatcher rd =request.getRequestDispatcher("ShowAlien.jsp");
		rd.forward(request, response);
		
		//HttpSession session = request.getSession();
		//session.setAttribute("alien", a1);
		
		//response.sendRedirect("showAlien.jsp");
	}

	

}
