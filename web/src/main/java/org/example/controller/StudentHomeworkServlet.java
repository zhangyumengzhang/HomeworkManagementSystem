package org.example.controller;


import org.example.jdbc.StudentHomeworkJdbc;
import org.example.model.StudentHomework;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/allStudentHomework")
public class StudentHomeworkServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<StudentHomework> list = StudentHomeworkJdbc.selectAll();

        req.setAttribute("studentHomeworklist", list);
        req.getRequestDispatcher("allStudentHomework.jsp").forward(req, resp);
    }
}