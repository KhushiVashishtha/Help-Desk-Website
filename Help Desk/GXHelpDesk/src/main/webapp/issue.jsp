<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Issue Page</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
    href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
<link href="adminstyle.css" rel="stylesheet">
<!-- jQuery library -->
<script
    src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"></script>

<!-- Popper JS -->
<script
    src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
    src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
<style>
#div1 {
    width: 600px;
    height: 520px;
    margin: auto;
    margin-top: 100px;
 box-shadow: 4px 4px 4px 4px gray;
    
    
}

.card-header{
background-color: rgb(255, 85, 0);
}
</style>



</head>
<body class="container-fluid">

 <div class="card" id="div1">
        <h2 class="card-header text-center text-light ">Issue Report
            Form</h2>
        <form class="form" action="IssueServlet" method="post">
            <table class="table table-hover table-striped">
                <tr>
                    <td>Name:</td>
                    <td><input type="text" name="name"></td>
                </tr>
                <tr>
                    <td>Email Id:</td>
                    <td><input type="email" name="email"></td>
                </tr>
                <tr>
                    <td>Mobile:</td>
                    <td><input type="text" name="mobile"></td>
                </tr>
                 <tr>
                    <td>City:</td>
                    <td><input type="text" name="city"></td>
                </tr>
                <tr>
                    <td>DOB:</td>
                    <td><input type="date" name="dob"></td>
                </tr>
                <tr>
                <td>  Issue :  </td>
               <td>   <select id="area" name="issue" required>
            <option value="plumbing">Plumbing</option>
            <option value="cleaning">Cleaning</option>
            <option value="electricity">Electricity</option> 
        </select></td> <br>
        </tr>
               <tr>
               <td>State : </td>
               <td>   <select id="state" name="state" required>
            <option value="new">New</option>
               
               </tr>
            <!--      <td>Your Issue:</td>
                    <td> <textarea name="issue" rows="5" cols="50"></textarea></td>   -->
                </tr>
                <tr>
                    <td><input type="submit" value="register"
                        class="btn btn-outline-success"></td>
                    <td><input type="reset" value="reset"
                        class="btn btn-outline-danger"></td>
                </tr>
                  <tr>
                   
            </table>
        </form>
    </div>


</body>
</html>