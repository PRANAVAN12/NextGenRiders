package com.nextgen.web.bikes;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nextgen.dao.BikesDao;
import com.nextgen.model.Bikes;

@WebServlet("/BikesUpdate")
public class BikesUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private BikesDao bikesDao;

	public void init() {

		bikesDao = new BikesDao();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String bikename = request.getParameter("bikename");
		String description = request.getParameter("rent_date");
		int Quantity = Integer.parseInt("Quantity");
		Float Price = Float.parseFloat("Price");
		String img = request.getParameter("img");

		Bikes user = new Bikes(id, bikename, description, Quantity, Price,img);
		bikesDao.updateUser(user);
		response.sendRedirect("list");

	}

}
