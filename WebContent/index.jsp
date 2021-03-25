<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
<jsp:include page="header.jsp"></jsp:include>
<style>
.footer {
   position: fixed;
   left: 0;
   bottom: 0;
   width: 100%;
   color: white;
}
</style>
</head>
<header><jsp:include page="navbar.jsp"></jsp:include></header>
<body>

<br>
<div class="container-fluid">
  <div class="row">
    <div class="col-sm-3 sidebar">
        <div class="jumbotron">
       </div>
      
    </div>

    <div class="col-sm-9">
      <div class="jumbotron">
         <a class="text-muted" href="users.jsp">Insert Data</a><br/>
         <a class="text-muted" href="Image.jsp">Image Insertion</a><br/>
         <a class="text-muted" href="imageDisplay.jsp">Image Display</a><br/>
       </div>
    </div>
  </div>
</div>

<div class="footer navbar-dark bg-dark p-3">
    <div class="row">
      <div class="col-sm-3">Templates-J2EE © 2021</div>
      <div class="col-sm-8"></div>
      <div class="col-sm-1">
      <a class="text-light text-center" href="https://saurabh111121.github.io/contact.html">Contact</a>
      
      </div>
    </div>      
</div>
</body>
<jsp:include page="footer.jsp"></jsp:include>

</html>