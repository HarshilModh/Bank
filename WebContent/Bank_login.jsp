<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>


 <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link href="https://fonts.googleapis.com/css?family=Roboto:300,400&display=swap" rel="stylesheet">
 <jsp:include page="Header.jsp"></jsp:include>

    <title>Login</title>
  </head>
  <body>
  

  
  <div class="content">
  <form action="Bank_Login" method="post">
    <div class="container">
      <div class="row">
        <div class="col-md-6 order-md-2">
          <img src="Assets/images/undraw_file_sync_ot38.svg" alt="Image" class="img-fluid">
        </div>
        <div class="col-md-6 contents">
          <div class="row justify-content-center">
            <div class="col-md-8">
              <div class="mb-4">
              <h3>Sign In to <strong>Bank</strong></h3>
              <p class="mb-4"></p>
            </div>
            <form action="Bank_Login" method="post">
              <div class="form-group first">
                <label for="username">Username</label>
                <input type="text" class="form-control" id="username"name="email">

              </div>
              <div class="form-group last mb-4">
                <label for="password">Password</label>
                <input type="password" class="form-control" id="password" name="Password">
                
              </div>
              
              <div class="d-flex mb-5 align-items-center">
                <label class="control control--checkbox mb-0"><span class="caption">Remember me</span>
                  <input type="checkbox" checked="checked"/>
                  <div class="control__indicator"></div>
                </label>
                <span class="ml-auto"><a href="#" class="forgot-pass">Forgot Password</a></span> 
              </div>

              <input type="submit" value="Log In" class="btn text-white btn-block btn-primary">

              <span class="d-block text-left my-4 text-muted"> or sign in with</span>
              
              <div class="social-login">
                <a href="#" class="facebook">
                  <span class="icon-facebook mr-3"></span> 
                </a>
                <a href="#" class="twitter">
                  <span class="icon-twitter mr-3"></span> 
                </a>
                <a href="#" class="google">
                  <span class="icon-google mr-3"></span> 
                </a>
              </div>
            </form>
            </div>
          </div>
          
        </div>
        
      </div>
    </div>
    </form>
  </div>
 <jsp:include page="Footer.jsp"></jsp:include>
  </body>
<%-- <head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- <link rel="stylesheet" href="Assets/bootstrap.min.css"> -->
<jsp:include page="Header.jsp"></jsp:include>

</head>
<body>
<div class="container-fluid">
<form action="Bank_Login" method="post">


<div class="row">
    <div class="col-md-4">
         <div class="form-group">
            <label>Email</label>
            <input type="email"  class="form-control" name="email"> 
        </div>

        <div class="form-group">
            <label>Password</label>
            <input type="password" class="form-control" name="Password">
        </div>

        <input  class="btn btn-primary"  type="submit" value="Login"> 
        

       

    </div>
</div>
</form>
</div>
</body> --%>
</html>