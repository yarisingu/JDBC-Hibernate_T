package servlet_demo;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Servelate_calculator implements Servlet{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void service(ServletRequest rq1, ServletResponse rs2) throws ServletException, IOException {
		String i= rq1.getParameter("num1");
		String i1= rq1.getParameter("num2");
		System.out.println(i+" "+i1);
		int num1=Integer.parseInt(i);
		int num2=Integer.parseInt(i1);
		
		rs2.getWriter().print("The sum of  "+num1+" + "+num2 +" = "+(num1+num2));
		
	}

}
