<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Login And Registration Form - Service Your Vehicle</title>
	
	
	<style>

*{
	margin: 0;
	padding: 0;
	font-family: sans-serif;
}
	
.hero{
	height: 100%;
	width: 100%;
    background-image:url('CarInterior.jpg');
	background-position: center;
	background-size: cover;
	position: absolute;
}

.form-box{
	width: 380px;
	height: 500px;
	position: relative;
	margin: 6% auto;
	background: white;
	padding: 5px;
	overflow: hidden;
}

.button-box{
	width: 220px;
	margin: 35px auto;
	position: relative;
	box-shadow: 0 0 20px #ff61241f;
	border-radius: 30px;
}

.toggle-btn{
	padding: 10px 30px;
	cursor: pointer;
	background: transparent;
	border: 0;
	outline: none;
	position: relative;
}

#btn{
	top: 0;
	left:0;
	position: absolute;
	width: 110px;
	height: 100%;
	background: linear-gradient(to right, #ff105f, #ffad06);
	border-radius: 30px;
	transition: .5s;
}

.input-group{
   top: 180px;
   position: absolute;
   width: 280px;
   transition: .5s
}

.input-field{
   width: 100%;
   padding: 10px 0;
   margin:5px 0;
   border-left: 0;
   border-top: 0;
   border-right: 0;
   border-bottom: 1px solid #999;
   outline: none;
   background: transparent;
}

.submit-btn{
   width: 85%;
   padding: 10px 30px;
   cursor: pointer;
   display: block;
   background:linear-gradient(to right, #ff105f, #ffad06);
   border: 0;
   outline: 0;
   border-radius: 30px;
}

.check-box{
   margin: 30px 10px 30px 0;
}

span{
   color: #777;
   font-size: 12px;
   bottom: 68px;
   position: absolute;
}


#login{
left:50px;
}

#register{
left:450px;
}
	</style>
	
</head>
<body>
<img>
    <div class="hero">
	    <div class="form-box">
	        <div class="button-box">
			    <div id="btn"></div>
			    <button type="button" class="toggle-btn" onclick="login()">Log In</button>
				<button type="button" class="toggle-btn" onclick="register()">Register</button>
			</div>
			<form id="login" class="input-group">
			<input type="text" class="input-field" placeholder="User Id" required>
			<input type="text" class="input-field" placeholder="Enter Password" required>
			<input type="checkbox" class="check-box"><span>Remember Password</span>
			<button type="submit" class="submit-btn">Login</button>
			</form>
			
			<form id="register" class="input-group">
			<input type="text" class="input-field" placeholder="Name" required>
			<input type="email" class="input-field" placeholder="User Name" required>
			<input type="password" class="input-field" placeholder="Passwword" required>
			<input type="password" class="input-field" placeholder="Phone Number" required>
			<input type="text" class="input-field" placeholder="Address">
			<button type="submit" class="submit-btn">Register</button> 
			
		</form>
		</div>
	</div>
	
<script>
var x = document.getElementById("login");
var y = document.getElementById("register");
var z = document.getElementById("btn");
function register()
{
x.style.left = "-400px";
y.style.left = "50px";
z.style.left = "110px";
}

function login()
{
x.style.left = "50px";
y.style.left = "450px";
z.style.left = "0px";
}

</script>
</body>


</html>