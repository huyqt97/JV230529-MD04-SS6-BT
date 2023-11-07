package com.ss6bt;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "ProductDiscountCalculator", value = "/display-discount")
public class ProductDiscountCalculator extends HttpServlet {
    @Override
    public void init() {

    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String description = req.getParameter("description");
        int price = Integer.parseInt(req.getParameter("price"));
        int percent = Integer.parseInt(req.getParameter("percent"));
        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<h4>Description: "+ description + "</h4>");
        writer.println("<h4>Price: "+ price + "</h4>");
        writer.println("<h4>Percent: "+ percent + "</h4>");
        writer.println("<h4>Price-Percent: "+ percent*price*0.01+ "</h4>");
        writer.println("</html>");
    }

}