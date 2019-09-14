package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class CalculatorServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	
		PrintWriter pw=null;
		String s=null;
		float v1=0;
		float v2=0;
		//genral setting
		pw=res.getWriter();
		res.setContentType("text/html");
		//read
		s=req.getParameter("s1");
		v1=Integer.parseInt(req.getParameter("v1"));
		v2=Integer.parseInt(req.getParameter("v2"));
		if(s.equalsIgnoreCase("add")) {
			float c=v1+v2;
			pw.println("add two number::"+c);
			
		}
		else if(s.equalsIgnoreCase("sub")) {
			float c=v1-v2;
			pw.println("sub two number::"+c);
			
		}
		else if(s.equalsIgnoreCase("mul")) {
			float c=v1*v2;
			pw.println("mul two number::"+c);
			
		}
		else {
			float c=v1/v2;
			pw.println("div two number::"+c);
			
		}
		pw.println("<a href='index.html'>Home</a>");
	}

}
