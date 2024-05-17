package com.telusko.session;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Request2")
public class Request2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Control is in Second Request..");
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		    
		writer.println("<h2>In second Request<h2>");
		HttpSession session = request.getSession(false);
		
		String name=(String) session.getAttribute("name");
		String city=(String) session.getAttribute("city");
		
		
		Date creationTime=new Date(session.getCreationTime());
		Date accessedTime=new Date(session.getLastAccessedTime());
		writer.println("<h2>"+name+" : "+city+"<h2>");
		writer.println("<h2> Creation Time : "+creationTime+"<h2>");
		writer.println("<h2> Accessed Time : "+accessedTime+"<h2>");
		
		
	}

}
