<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>qdev-注册</title>
    <link href="css/bootstrap.min.css" rel="stylesheet"/>
    <link href="css/login.css" rel="stylesheet"/>
</head>
<body>
		<div id="form" class="row">
		<div class="container">
			<div class="col-md-3"></div>
			<div class="col-md-6">
				<form class="form-horizontal" role="form">
					<div class="form-group">
						<label for="inputEmail3" class="col-sm-2 control-label">邮箱</label>
						<div class="col-sm-8">
							<input type="email" class="form-control" id="inputEmail3" placeholder="Email">
						</div>
					</div>
					<div class="form-group">
						<label for="inputPassword3" class="col-sm-2 control-label">密码</label>
						<div class="col-sm-8">
							<input type="password" class="form-control" id="inputPassword3" placeholder="Password">
						</div>
					</div>
					<div class="form-group">
						<label for="inputPassword3" class="col-sm-2 control-label">确认密码</label>
						<div class="col-sm-8">
							<input type="password" class="form-control" id="inputPassword3" placeholder="ConfirmPassword">
						</div>
					</div>
					<div class="form-group">
						<label for="inputPassword3" class="col-sm-2 control-label">您的姓名</label>
						<div class="col-sm-8">
							<input type="text" class="form-control" id="inputPassword3" placeholder="name">
						</div>
					</div>

					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10 text-left">
							<button type="submit" class="btn btn-success">确认注册</button>
						</div>

					</div>
				</form>
			</div>
			<div class="col-md-3"></div>
		</div>
	</div>
	
	<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
</body>
</html>