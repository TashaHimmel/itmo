package com;

import java.io.IOException;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class SecondFirstServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/html; charset=cp1251");
		String sNum1 = req.getParameter("inputNum1");
		String sNum2 = req.getParameter("inputNum2");
		int iNum1 = Integer.parseInt(sNum1);
		int iNum2 = Integer.parseInt(sNum2);

		if (Math.abs(10 - iNum1) < Math.abs(10 - iNum2)) {
			resp.getWriter().println(sNum1);
		} else if (Math.abs(10 - iNum1) > Math.abs(10 - iNum2)) {
			resp.getWriter().println(sNum2);

		} else {
			resp.getWriter().println(sNum1 + " è " + sNum2);
		}
	}
}
