package com.test.servlet;

import com.test.helper.ServletHelper;
import com.test.model.Person;
import com.test.service.PersonService;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/servlet/person")
public class PersonServlet extends HttpServlet {

    @Inject
    PersonService personService;

    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {

        List<Person> people = personService.getAllPeople();
        request.setAttribute("people", people);

        ServletHelper.renderView(request, response, "./view/jsp/person/index.jsp");
    }

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws IOException {

        response.sendRedirect("/person");
    }
}
