package com;

import java.io.IOException;
import java.lang.reflect.Field;

import javax.servlet.http.*;

import cls.CoffeeClass;
import exc.FifthThirdException;

@SuppressWarnings("serial")
public class FourthServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/html; charset=cp1251");
		CoffeeClass cappuccino = new CoffeeClass();
		cappuccino.setName("Капуччино");
		cappuccino.setCost(275.0);
		cappuccino.setVolume(350.0);
		CoffeeClass latte = new CoffeeClass();
		latte.setName("Латте");
		latte.setCost(255.0);
		latte.setVolume(300.0);
		CoffeeClass espresso = new CoffeeClass();
		espresso.setName("Эспрессо");
		espresso.setCost(159.0);
		espresso.setVolume(60.0);
		CoffeeClass icecoffee = new CoffeeClass();
		icecoffee.setName("Глясе");
		icecoffee.setCost(225.0);
		icecoffee.setVolume(230.0);
		CoffeeClass mocco = new CoffeeClass();
		mocco.setName("Мокко");
		mocco.setCost(260.0);
		mocco.setVolume(275.0);

		double dMin = Double.parseDouble(req.getParameter("inputNum1"));
		double dMax = Double.parseDouble(req.getParameter("inputNum2"));
		CoffeeClass[] coffeeList = new CoffeeClass[] { cappuccino, latte, espresso, icecoffee, mocco };
		resp.getWriter().print("<table>");
		resp.getWriter().print("<tr>");
		resp.getWriter().print(
				"<th>Наименование</th><th>Стоимость</th><th>Объем</th>");
		resp.getWriter().print("</tr>");
		for (int i = 0; i < coffeeList.length; i++) {
			resp.getWriter().print("<tr>");
			for (Field field : coffeeList[i].getClass().getDeclaredFields()) {
				try {
					if (coffeeList[i].getCost() > dMin && coffeeList[i].getCost() < dMax) {
						resp.getWriter().print(
								"<td>" + field.get(coffeeList[i]) + "</td>");
					}
				} catch (IllegalArgumentException | IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			resp.getWriter().print("</tr>");
		}
		resp.getWriter().print("</table>");
	}
}