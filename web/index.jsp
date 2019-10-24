<%--
  Created by IntelliJ IDEA.
  User: LUCKY
  Date: 10/17/2019
  Time: 8:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Sign Up Authentication</title>
  <link href="bootstrap.css" rel="stylesheet" type="text/css">
</head>
<body background="background.jpg">
<marquee style="color:white" bgcolor=green direction=right behavior=alternate scrollamount=7><h2><b><i>I CAN is 100 <span style="color:red">times more important than  IQ</span></i></b></h2></marquee></center>

<h1 style="color: fuchsia;text-align: center"><b> Registration Form</b></h1>
<hr style="background-color: white">
<div class="row">
  <div class="col-lg-4"></div>
  <div class="col-lg-4">
    <form action="signup"method="post"style="text-align: center;color: white;background-color: #4f1a15" >

      Student Id <input type="text"style="margin-left: 40px;margin-top: 10px" name="id"/><br>


      User Name <input type="text"style="margin-left: 40px;margin-top: 10px" name="username"/><br>

      Password <input type="password"style="margin-left: 40px;margin-top: 10px" name="password"/><br>

      Email <input type="text" style="margin-left: 71px;margin-top: 10px" name="email"/><br>

      DOB <input type="text" style="margin-left: 71px;margin-top: 10px" name="dateofbirth"/><br>

      Phone Number <input type="text"style="margin-left: 13px;margin-top: 10px" name="phonenumber"/><br>


      Fee <input type="text" style="margin-left: 71px;margin-top: 10px" name="fee"/><br>

      <div>
      <label>Course</label>
     <input type="checkbox" name="vehicle1" value="Bike"> JAVA
        <input type="checkbox" name="vehicle2" value="Car"> jdbc
        <input type="checkbox" name="vehicle3" value="Boat" > EJB
        <input type="checkbox" name="vehicle3" value="Boat" > JSP
      </div>
      <div>
   <label>Gender</label>

      <input type="radio" name="gender" value="male"> Male<br>
      <input type="radio" name="gender" value="female"> Female<br>
</div>

<label> Qualification</label>
      <select name="Qualification">
        <option value="matric">Matriculation</option>
        <option value="fsc">FSc</option>
        <option value="bs">BS</option>
        <option value="ms">MS</option>
        <option value="phd">PHD</option>
      </select>

      <br>
      <div>
        <button type="submit"  style="background-color:black;margin-left: 29px;color: antiquewhite;">Submit</button>
      </div>
      <hr style="background-color: black;">
    </form >
  </div>
  <div class="col-lg-4"></div>
</body>
</html>
