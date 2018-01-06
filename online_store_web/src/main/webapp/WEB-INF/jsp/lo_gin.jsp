<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/resources/";
%>
<!doctype html>
<html>

	<head>
		<meta charset="UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<link rel="icon" href="<%=basePath%>img/logom.png" type=" image/png" >
		<title>登录</title>
		<link rel="stylesheet" type="text/css" href="<%=basePath%>css/styles.css">
		<style type="text/css">
			@-webkit-keyframes translation {
				0% {
					-webkit-transform: translateX(0);
					transform: translateX(0);
				}
				100% {
					-webkit-transform: translateX(230px);
					transform: translateX(230px);
				}
			}
			
			.child {
				top: 240px;
				width: 20px;
				height: 20px;
				border-radius: 10px;
				border-width: 2px;
				border-color: white;
				border-style: solid;
				position: absolute;
				visibility: hidden;
				-webkit-appearance:;
			}
			
			.child0 {
				-webkit-animation-name: translation;
				-webkit-animation-duration: 4s;
				-webkit-animation-timing-function: ease;
				-webkit-animation-iteration-count: infinite;
				-webkit-transition-timing-function: linear;
				visibility: visible;
			}
		</style>
	</head>

	<body>
		<div class="htmleaf-container">
			<div class="wrapper">
				<div class="main">
					<div class="logo">
						<img src="<%=basePath%>img/logo.png" />
					</div>
					<div class="input_form">
						<div class="container">
							<h1>Welcome&nbsp;</h1>
							<form action="https://www.baidu.com" class="form">
								<input type="text" placeholder="Username">
								<input type="password" placeholder="Password">
								<button type="submit" id="login-button">Login</button>
							</form>
							<div class="connecting">
								<div class="child child1">

								</div>
								<div class="child child2">

								</div>
								<div class="child child3">

								</div>
								<div class="child child4">

								</div>
							</div>
						</div>
					</div>
				</div>

				<ul class="bg-bubbles">
					<li></li>
					<li></li>
					<li></li>
					<li></li>
					<li></li>
					<li></li>
					<li></li>
					<li></li>
					<li></li>
					<li></li>
				</ul>
			</div>
		</div>

		<script src="<%=basePath%>js/jquery-2.1.1.min.js" type="text/javascript"></script>
		<script>
			$(function() {
			});

			$('#login-button').click(function(event) {
				event.preventDefault();
				$('form').fadeOut(500);
				$('.wrapper').addClass('form-success');
				window.setTimeout(function() {
					$(".child1").addClass("child0")
				}, 1000);
				window.setTimeout(function() {
					$(".child2").addClass("child0");
				}, 1250);
				window.setTimeout(function() {
					$(".child3").addClass("child0");
				}, 1500);
				window.setTimeout(function() {
					$(".child4").addClass("child0");
				}, 1750);
				window.setTimeout(function(){
					$(".child1").addClass("child0")
				}, 4500);
			});
		</script>

		<div style="text-align:center;margin:50px 0; font:normal 16px/26px;color:#000000">
			<h1>数据管理系统</h1>
		</div>
	</body>

</html>