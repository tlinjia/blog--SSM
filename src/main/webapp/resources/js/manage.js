var manage = {
    changeState:function (articleId) {
        $.get('/manage/'+articleId+'/changeState',{},function (result) {
            if(result && result['operateSuccess']){
                alert('修改成功');
                location.reload();
            }else{
                alert('修改失败');
            }
        });
    },
    modify:function (articleId) {
        location.href('/manage/'+articleId+'/modify');
    },
    delete:function (articleId) {
        var confirm = window.confirm("确定删除？");
        if(confirm){
            $.get('/manage/'+articleId+'/delete',{},function (result) {
                if(result && result['operateSuccess']){
                    alert('删除成功');
                    location.reload();
                }else{
                    alert('删除失败');
                }
            });
        }
    },
    upload:function (title,content) {
        $.ajax({
            type:"POST",
            url:"/manage/uploadArticle",
            dataType:"text",
            contentType:"application/json",
            data:'title:'+title+'//content:'+content,
            success:function(result){
                if(result && result['operateSuccess']){
                    alert('添加成功!');
                    location.href('/manage/list');
                }else{
                    alert('添加失败!');
                }
            }
        });
    },
    publish:function (title,content) {
        $.ajax({
            type:"POST",
            url:"/manage/publishArticle",
            dataType:"text",
            contentType:"application/json",
            data:'title:'+title+'//content:'+content,
            success:function(result){
                if(result && result['operateSuccess']){
                    alert('添加成功!');
                    location.href('/manage/list');
                }else{
                    alert('添加失败!');
                }
            }
        });
    }
}