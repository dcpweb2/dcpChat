  <!-- sample.jsp -->
<html xmlns:th="http://www.thymeleaf.org">
<link href="css/bootstrap.min.css" th:href="@{/css/bootstrap.min.css}" rel="stylesheet"></link>
<link href="css/bootstrap-grid.css" th:href="@{/css/bootstrap-grid.css}" rel="stylesheet"></link>
<link href="css/navbar.css" th:href="@{/css/navbar.css}" rel="stylesheet"></link>
<link href="css/commmon.css" th:href="@{/css/common.css}" rel="stylesheet"></link>
<script src="js/jquery-3.2.1.min.js" th:src="@{/js/jquery-3.2.1.min.js}"></script>
<script src="js/bootstrap.min.js" th:src="@{/js/bootstrap.min.js}"></script>
<script src="js/popper.min.js" th:src="@{/js/popper.min.js}"></script>

<head>
<title>チャット画面</title>
</head>
<body>

    <nav class="navbar navbar-expand-sm navbar-dark bg-dark">
        <a class="navbar-brand" href="#">DCP Chat</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExample03" aria-controls="navbarsExample03" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarsExample03">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item active"><a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a></li>
                <li class="nav-item"><a class="nav-link" href="#">Link</a></li>
                <li class="nav-item"><a class="nav-link disabled" href="#">Disabled</a></li>
            </ul>
        </div>
    </nav>

    <h1>チャット画面</h1>

    <div class="container">
        <form auction="memberRegister" method="post">
            <div class="form-group">
                <label>名前</label> <input type="text" name="email" class="form-control" />
            </div>
            <div class="form-group">
                <label>パスワード</label> <input type="text" name="password" class="form-control" />
            </div>
            <a href="/memberRegister
            " class="btn btn-primary btn-lg">ログイン</a>
        </form>
    </div>
</body>
</html>