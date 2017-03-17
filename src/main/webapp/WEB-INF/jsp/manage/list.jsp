<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/jsp/common/tag.jsp"%>
<html>
<head>

    <%@include file="/WEB-INF/jsp/common/head.jsp"%>
    <link href="/resources/css/dashboard.css" rel="stylesheet"/>
    <link href="/resources/css/simditor.css" rel="stylesheet"/>
    <title>LiN---Blog</title>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="http://cdn.bootcss.com/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="http://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="/manage/list">LiN</a>
        </div>
    </div>
</nav>
<div class="container-fluid">
    <div class="row">
        <div class="col-sm-3 col-md-2 sidebar">
            <ul class="nav nav-sidebar">
                <li class="active"><a href="/manage/list">List</a></li>
                <li><a href="#">Comments</a></li>
                <li><a href="#">Messages</a></li>
            </ul>
            <ul class="nav nav-sidebar">
                <li><a href="\manage\post">Post Article</a></li>
                <li><a href="">Manage User</a></li>
            </ul>
        </div>
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
            <h2 class="sub-header">Article List</h2>
            <div class="table-responsive">
                <table class="table table-striped">
                    <thead>
                    <tr>
                        <th>Id</th>
                        <th>Title</th>
                        <th>Dateline</th>
                        <th>State</th>
                        <th>Operation</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="article" items="${articles}">
                        <tr>
                            <th>${article.articleId}</th>
                            <th>${article.articleTitle}</th>
                            <th>${article.articleDateline}</th>
                            <th>${article.articleState}</th>
                            <th><button type="button" class="btn btn-sm btn-default" onclick="manage.changeState(${article.articleId})">Change State</button>
                                <button type="button" class="btn btn-sm btn-default "onclick="manage.modify(${article.articleId})">Modify</button>
                                <button type="button" class="btn btn-sm btn-default" onclick="manage.delete(${article.articleId})">Delete</button>
                            </th>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</div>
<script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
<script src="http://cdn.bootcss.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="/resources/js/manage.js"></script>
</body>
</html>
