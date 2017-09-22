<!-- sample.jsp -->
<html xmlns:th="http://www.thymeleaf.org">
<link href="resources/static/css/bootstrap.min.css" th:href="@{/css/bootstrap.min.css}" rel="stylesheet"></link>
<link href="resources/static/css/commmon.css" th:href="@{/css/common.css}" rel="stylesheet"></link>
<script src="resources/static/js/jquery-3.2.1.min.js" th:src="@{/js/jquery-3.2.1.min.js}"></script>
<script src="resources/static/js/bootstrap.min.js" th:src="@{/js/bootstrap.min.js}"></script>
<script src="resources/static/js/popper.min.js" th:src="@{/js/popper.min.js}"></script>

<head>
<title>Home</title>
</head>
<body>
    <h1>ログイン画面</h1>
    <div class="container">
        <form>
            <div class="form-group">
                <label>name</label> <input type="text" name="email" class="form-control" />
            </div>
            <div class="form-group">
                <label>password</label> <input type="text" name="password" class="form-control" />
            </div>
            <button type="submit">ログイン</button>
        </form>
    </div>
</body>
</html>