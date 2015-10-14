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

@WebServlet("/servlet/create")
public class CreatePersonServlet extends HttpServlet {

    @Inject
    PersonService personService;

    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        ServletHelper.renderView(request, response, "./view/jsp/person/create.jsp");
    }

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws IOException {

        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");

        Person person = new Person(firstName, lastName);
        personService.addPerson(person);

        response.sendRedirect("./person");
    }
}
