<!-- sample.jsp -->
<html xmlns:th="http://www.thymeleaf.org">
<!-- Bootstrap core CSS -->
<link href="resources/css/bootstrap-3.3.2-dist/bootstrap.min.css" rel="stylesheet" />
<!-- Custom styles for this template -->
<link href="resources/css/signin.css" rel="stylesheet" />
<head>
<title>Home</title>
</head>
<body>
    <h1>ログイン画面</h1>
    <div class="container">
        <form>
            <div class="form-group">
                <label>name</label> <input type="text" name="email" class="form-control"/>
            </div>
            <div class="form-group">
                <label>password</label> <input type="text" name="password" class="form-control"/>
            </div>
            <button type="submit">ログイン</button>
        </form>
    </div>
</body>
</html>