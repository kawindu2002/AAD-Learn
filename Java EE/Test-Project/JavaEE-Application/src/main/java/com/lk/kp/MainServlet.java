package com.lk.kp;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

// This servlet will respond to requests sent to the URL "/hello".
@WebServlet("/hello")
// We are creating a servlet class named 'Servlet' that inherits from 'HttpServlet'.
public class MainServlet extends HttpServlet {
     // We are overriding the doGet() method to handle GET requests.
     @Override
     protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
          //System.out.println(req.getHeader("Age"));
          
          // We can change the content type
          //resp.setContentType("application/json");
          
          resp.setHeader("Name","Kawindu");
          
          // We send a simple text response saying "Get Method Invoked" to the client.
          resp.getWriter().println("Get Method Invoked");
          
     }
}

