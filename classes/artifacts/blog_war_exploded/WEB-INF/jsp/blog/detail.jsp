<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../common/tag.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <%@include file="../common/head.jsp" %>
    <title>LiN_Blog---<c:out value="${article.articleTitle}"/></title>

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
                <li><a href="/blog/list">Essays</a></li>
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
        <div class="col-sm-8 blog-main blog-main-detail">
            <div class="blog-post">
                <h2 class="blog-post-title"><c:out value="${article.articleTitle}" escapeXml="false"/></h2>
                <br />
                <c:out value="${article.articleContent}" escapeXml="false"/>
                <p class="blog-post-meta blog-post-time">最后修改于<fmt:formatDate
                        value="${article.articleModifyTime}" pattern="yyyy-MM-dd HH:mm:s"/></p>
            </div>
        </div>
        <div class="col-sm-8">
            <hr/>
            <div class="panel panel-info">
                <div class="panel-heading"><h2 class="panel-title">评论</h2></div>
                <div class="panel-body">
                    <div class="ds-thread" data-thread-key="${article.articleId}" data-title="${article.articleTitle}" data-url="/blog/${article.articleId}/detail"></div>
                </div>
            </div>
        </div>
    </div>
</div>
<%@include file="../common/footer.jsp" %>
<script type="text/javascript">
    var duoshuoQuery = {short_name:"tlinjia"};
    (function() {
        var ds = document.createElement('script');
        ds.type = 'text/javascript';ds.async = true;
        ds.src = (document.location.protocol == 'https:' ? 'https:' : 'http:') + '//static.duoshuo.com/embed.js';
        ds.charset = 'UTF-8';
        (document.getElementsByTagName('head')[0]
        || document.getElementsByTagName('body')[0]).appendChild(ds);
    })();
</script>
</body>
</html>
