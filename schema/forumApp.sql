create database forumApp;
use forumApp;
-- 怎么设置必填，默认值和注释
-- 论坛版块表
create table t_board(
	board_id int not null primary key COMMENT'论坛版块ID',
    board_name varchar(150) not null default '' COMMENT'论坛版块名',
    board_desc varchar(255) default null COMMENT'论坛版块描述',
    topic_num int not null default 0 COMMENT'帖子数目'
);
-- 用户管理版块关联表
create table t_board_manager(
	board_id int(11) not null primary key,
    user_id int(11) primary key
);
-- 话题表
create table t_topic(
	topic_id int primary key,
    board_id int,
    topic_title varchar(100),
    user_id int,
    create_time datetime,
    last_post datetime,
    topic_views int,
    topic_replies int,
    digest int
);
-- 帖子表
create table t_post(
	post_id int primary key,
    board_id int,
    topic_id int,
    user_id int,
    post_type tinyint,
    post_title varchar(50),
    post_text text,
    create_time datetime
);
-- 论坛用户表
create table t_user(
	user_id int primary key,
    user_name varchar(30),
    password varchar(30),
    user_type tinyint,
    locked tinyint,
    credit int
);
-- 登录日志表
create table t_login_log(
	login_log_id int primary key,
    user_id int,
    ip varchar(30),
    login_datetime datetime
);