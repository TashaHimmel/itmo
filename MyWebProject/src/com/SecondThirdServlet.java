package com;

import java.io.IOException;
import java.util.Random;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class SecondThirdServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/html; charset=cp1251");
		Random rand=new Random();
		resp.getWriter().println("<table>");
		for (int i=0;i<8;i++) {
			resp.getWriter().println("<tr>");
			for (int j=0;j<5;j++) {
				int iRand=rand.nextInt((99-10)+1)+10;
				String sRand=Integer.toString(iRand);
				resp.getWriter().println("<td>"+sRand+"</td>");
			}
			resp.getWriter().println("</tr>");
		}
		resp.getWriter().println("</table>");
		
		
	}
}
