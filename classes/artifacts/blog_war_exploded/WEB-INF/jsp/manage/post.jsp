<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/jsp/common/tag.jsp" %>
<html lang="zh-cn">
<head>
    <%@include file="/WEB-INF/jsp/common/head.jsp" %>
    <link href="/resources/css/simditor.css" rel="stylesheet"/>
    <link href="/resources/css/dashboard.css" rel="stylesheet"/>
    <title>LiN--Blog</title>
</head>
<body>
<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar"
                    aria-expanded="false" aria-controls="navbar">
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
                <li><a href="/manage/list">List</a></li>
                <li><a href="#">Comments</a></li>
                <li><a href="#">Messages</a></li>
            </ul>
            <ul class="nav nav-sidebar">
                <li class="active"><a href="">Post Article</a></li>
                <li><a href="">Manage User</a></li>
            </ul>
        </div>
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
            <h2 class="sub-header">Post Article</h2>
            <div class="input-group input-group-lg">
                <span class="input-group-addon">Title</span>
                <input type="text" class="form-control" placeholder="Title" id="title"/>
            </div>
            <textarea class="form-control" rows="20" placeholder="正文" id="content"></textarea>
            <button type="button" class="btn btn-sm btn-default" id="upload" onclick="manage.upload($('#title').val(),editor.getValue())">上传</button>
            <button type="button" class="btn btn-sm btn-default" id="publish" onclick="manage.publish($('#title').val(),editor.getValue())">上传并发布</button>
        </div>
    </div>
</div>
<script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
<script src="http://cdn.bootcss.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="/resources/js/manage.js"></script>
<script type="text/javascript" src="/resources/js/module.min.js"></script>
<script type="text/javascript" src="/resources/js/hotkeys.min.js"></script>
<script type="text/javascript" src="/resources/js/uploader.min.js"></script>
<script type="text/javascript" src="/resources/js/simditor.min.js"></script>
<script>
    var editor = new Simditor({
        textarea: $('#content'),
        toolbar: [
            'title',
            'bold',
            'italic',
            'underline',
            'strikethrough',
            'fontScale',
            'color',
            'ol',
            'ul',
            'blockquote',
            'code',
            'link',
            'image',
            'hr',
            'indent',
            'outdent',
            'alignment'],
        upload: {
            url: "/manage/uploadForSimditor",
            params: {
                fileElementId: "filePath",
                dateType: "text"
            },
            fileKey: "filePath",
            leaveConfirm: '正在上传...'
        },
        pasteImage: true
    });
    editor.focus();
    editor.on('valuechanged', function (e, src) {
        $('img').addClass('img-responsive');
    });
//    $(function () {
//        $('#upload').one("click",manage.upload($('#title').innerText,editor.getValue()));
//        $('#publish').bind("click",manage.publish($('#title').innerText,editor.getValue()));
//    });
</script>
</body>
</html>
