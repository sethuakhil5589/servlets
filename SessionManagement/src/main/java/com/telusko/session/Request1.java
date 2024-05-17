package com.telusko.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Request1")
public class Request1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Control is in first Request");
		response.setContentType("text/html");
		String name=request.getParameter("empName");
		String city=request.getParameter("empCity");
		
		PrintWriter writer = response.getWriter();
		
		HttpSession session = request.getSession();
		
		
		session.setAttribute("name", name);
		session.setAttribute("city", city);
		if(session.isNew()) {
			writer.println("<h2> New Session created with ID"+session.getId()+"<h2>");
		}
		else {
			writer.println("<h2> New Session created with ID"+session.getId()+"<h2>");
		}
		
		request.getRequestDispatcher("/Request2").include(request, response);
	}

}
