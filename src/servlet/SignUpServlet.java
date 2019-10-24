package servlet;

import Db.DbConnection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SignUpServlet")

public class SignUpServlet extends HttpServlet {



    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String studentid = request.getParameter("studentid");


        String uname = request.getParameter("username");


        String paswrd = request.getParameter("password");

        String emailid = request.getParameter("email");

        String dbirth = request.getParameter("dateofbirth");


        String phone = request.getParameter("phonenumber");


        String fee = request.getParameter("fee");


        String course = request.getParameter("courses");


        String gender = request.getParameter("gender");


        String qualification = request.getParameter("qualification");


        PrintWriter res = response.getWriter();

        if (studentid == "" || uname == "" || paswrd == " " || emailid == " " || phone == " " || dbirth == " " || fee == "" || gender == " " || qualification == " ") {
            RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");


            res.write("<p style='color:blue;text-align:center;'><i>Please Enter All the Field </i></p>");
            dispatcher.include(request, response);

        } else if (!ValidateEmail()) {
            RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");

            res.write("<p style='color:blue;text-align:center;'><i>Please Enter valid Email </i></p>");
            dispatcher.include(request, response);
        } else {
            DbConnection obj = new DbConnection();

            obj.insertData(studentid, uname, paswrd, emailid, dbirth, phone, fee, course, gender, qualification);
            res.write("Record Saved");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }


    public bool ValidateEmail()
    {
        String emailid = request.getParameter("email");
        var email=document.getElementById("email").value;
        if (/^\w+@[a-zA-Z_]+?\.[a-zA-Z]{2,3}/.test(email))
        {
            return (true)
        }
        alert("You have entered an invalid email address!")
        return (false)
    }
}
