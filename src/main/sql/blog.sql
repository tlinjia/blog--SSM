CREATE DATABASE blog;
use blog;

CREATE TABLE article(
  article_id int NOT NULL AUTO_INCREMENT COMMENT 'id',
  article_title VARCHAR(60) NOT NULL COMMENT '标题',
  article_content TEXT NOT NULL COMMENT '内容',
  article_dateline TIMESTAMP NOT NULL DEFAULT current_timestamp COMMENT '发表时间',
  article_modify_time TIMESTAMP NOT NULL DEFAULT current_timestamp COMMENT '最后修改时间',
  article_state TINYINT NOT NULL DEFAULT 0 COMMENT '状态:0未发布，1已发布',
  PRIMARY KEY (article_id),
  key idx_article_title(article_title),
  key idx_article_dateline(article_dateline),
  key idx_article_modify_time(article_modify_time)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT ='文章表';



CREATE TABLE comment(
  comment_id int NOT NULL AUTO_INCREMENT COMMENT 'id',
  fk_article_id int NOT NULL COMMENT '文章id',
  comment_username VARCHAR(24) NOT NULL COMMENT '用户名',
  comment_content TEXT NOT NULL COMMENT '内容',
  comment_dateline TIMESTAMP NOT NULL DEFAULT current_timestamp COMMENT '发表时间',
  PRIMARY KEY (comment_id),
  FOREIGN KEY (fk_article_id) REFERENCES article(article_id)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT ='评论表';


CREATE TABLE message(
  message_id int NOT NULL AUTO_INCREMENT COMMENT 'id',
  message_username VARCHAR(24) NOT NULL COMMENT '用户名',
  message_content TEXT NOT NULL COMMENT '内容',
  message_dateline TIMESTAMP NOT NULL DEFAULT current_timestamp COMMENT '发表时间',
  PRIMARY KEY (message_id)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT ='留言表';
