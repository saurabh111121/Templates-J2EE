<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
  <!DOCTYPE html>
  <html>

  <head>
    <meta charset="ISO-8859-1">
    <title>Users</title>
    <jsp:include page="header.jsp"></jsp:include>
  </head>
  <header>
    <jsp:include page="navbar.jsp"></jsp:include>
  </header>

  <body>


    <br>
    <div class="container-fluid">
      <div class="row">
        <div class="col-sm-4 sidebar">

        </div>

        <div class="col-sm-4">
          <div class="jumbotron">
            <h2 class="text-center">Sign Up</h2>
            <h5 class="text-muted text-center">It's quick and easy.</h5><br />
            <form action="usersServlet" method="POST" class="needs-validation" novalidate>
              <div class="form-group">
                <input type="text" name="uname" id="" placeholder="Name" class="form-control" required>
              </div>
              <div class="form-group">
                <input type="email" name="uemail" id="" placeholder="Email-address" class="form-control" required>
              </div>
              <div class="form-group">
                <input type="password" name="upass" id="" placeholder="Password" class="form-control" required>
              </div>
              <div class="form-group text-center">
                <button class="btn btn-success">Sign-Up</button>
              </div>

            </form>
          </div>
        </div>
      </div>
    </div>


  </body>
  <jsp:include page="footer.jsp"></jsp:include>
  <script>
    (function () {
      'use strict'
      var forms = document.querySelectorAll('.needs-validation')
      Array.prototype.slice.call(forms)
        .forEach(function (form) {
          form.addEventListener('submit', function (event) {
            if (!form.checkValidity()) {
              event.preventDefault()
              event.stopPropagation()
            }

            form.classList.add('was-validated')
          }, false)
        })
    })()
  </script>

  </html>