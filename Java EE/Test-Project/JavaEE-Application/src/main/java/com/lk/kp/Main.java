package com.lk.kp;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

// This servlet will respond to requests sent to the URL "/hello".
@WebServlet("/hello")
// We are creating a servlet class named 'Main' that inherits from 'HttpServlet'.
public class Main extends HttpServlet {
     // We are overriding the doGet() method to handle GET requests.
     @Override
     protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
          resp.getWriter().println("Get Method Invoked");
          // We send a simple text response saying "Get Method Invoked" to the client.
     }
}

