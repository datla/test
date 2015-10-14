package com.test.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloWorld extends HttpServlet {

    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response) {
        System.out.println("jhkdsjfh");
    }
}
