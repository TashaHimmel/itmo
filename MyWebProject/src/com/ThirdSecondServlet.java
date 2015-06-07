package com;

import java.io.IOException;
import java.util.Random;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class ThirdSecondServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/html; charset=cp1251");
		String sNum1=req.getParameter("inputNum1");
		String sNum2=req.getParameter("inputNum2");
		int iNum1=Integer.parseInt(sNum1);
		int iNum2=Integer.parseInt(sNum2);
		
		if (iNum1<0){
			resp.getWriter().println("Первое число меньше нуля Повторите попытку.");
		} else if (iNum2>65535) {
			resp.getWriter().println("Второе число больше 65535. Повторите попытку.");
		} else if (iNum1>iNum2) {
			resp.getWriter().println("Второе число больше первого. Повторите попытку.");
		} else {
			int br=1;
			resp.getWriter().println("<table><tr>");
			for (int i = iNum1; i <= iNum2; i++) {
				String iStr = Integer.toString(i);
				String hStr = Integer.toHexString(Integer.parseInt(iStr)).toUpperCase();
				resp.getWriter().println("<td><table><tr><td>&#"+Integer.toString(i)+"</td></tr><tr><td>"+iStr+"</td></tr><tr><td>"+hStr+"</td></tr></table>");
				if (br%10==0) resp.getWriter().println("</tr><tr>");
				br++;
			}
			resp.getWriter().println("</tr></table>");
		}
		
		
	}
}
