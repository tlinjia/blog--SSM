<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../common/tag.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <%@include file="../common/head.jsp" %>
    <title>LiN_Blog---List</title>
</head>
<body>
<nav class="navbar navbar-default navbar-fixed-top" role="navigation">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse"
                    data-target="#bs-example-navbar-collapse-1">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="/blog/index">LiN</a>
        </div>

        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav ">
                <li><a href="/blog/index">Index</a></li>
                <li class="active"><a href="/blog/list">Essays</a></li>
                <li><a href="/blog/message">Messages</a></li>
                <li><a href="/blog/about">About</a></li>
            </ul>
            <form class="navbar-form navbar-right" role="search">
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="Search">
                </div>
                <button type="submit" class="btn btn-default">Submit</button>
            </form>

        </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
</nav>
<div class="container">
    <div class="row">
        <div class="list-group col-sm-8">
            <div class="panel panel-info">
                <div class="panel-heading">
                    <h3 class="panel-title">List</h3>
                </div>
                <div class="panel-body">
                    <c:forEach var="article" items="${articles}">
                        <a href="/blog/${article.articleId}/detail" class="list-group-item">${article.articleTitle}</a>
                    </c:forEach>
                </div>
            </div>
        </div>
    </div>
</div>
<%@include file="../common/footer.jsp" %>
</body>
</html>
