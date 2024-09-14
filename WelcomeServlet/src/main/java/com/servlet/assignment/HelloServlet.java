package com.servlet.assignment;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/annotation")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String var1 = request.getParameter("var1");
		String var2 = request.getParameter("var2");
		response.setContentType("text/html");
		
		PrintWriter w = response.getWriter();
		w.append("welcome " + var1 + " " + var2);
		w.close();		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
}
