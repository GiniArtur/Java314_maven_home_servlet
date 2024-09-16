package org.example.homeservlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/first")
public class HomeServletDZ extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("Hello my first servlet HomeWork!!!!");
        System.out.println("Method INIT");
    }

    @Override
    public void destroy() {
        System.out.println("Destroy");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h1> Привет Сервлет!!!</h1>");
    }
}
