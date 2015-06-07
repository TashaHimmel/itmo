package com;

import java.io.IOException;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class SecondSecondServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/html; charset=cp1251");
		String sNum1 = req.getParameter("inputNum1");
		String sNum2 = req.getParameter("inputNum2");
		String sNum3 = req.getParameter("inputNum3");
		double dNum1 = Integer.parseInt(sNum1);
		double dNum2 = Integer.parseInt(sNum2);
		double dNum3 = Integer.parseInt(sNum3);
		double discriminant;
		double x1;
		double x2;
		
		discriminant=dNum2*dNum2-4*dNum1*dNum3;
		if (discriminant > 0) {
			x1 = (-dNum2+Math.sqrt(discriminant))/(2*dNum1);
			x2 = (-dNum2-Math.sqrt(discriminant))/(2*dNum1);
			resp.getWriter().println("<p>x1 = "+x1+"</p>");
			resp.getWriter().println("<p>x2 = "+x2+"</p>");
		}
		else if (discriminant==0) {
			x1=(-dNum2)/(2*dNum1);
			resp.getWriter().println("<p>x = "+x1+"</p>");
		}
		else if (discriminant < 0) {
			resp.getWriter().println("D < 0");
		}
		
		
	}
}
