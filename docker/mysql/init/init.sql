
drop table if exists sys_user;

/*==============================================================*/
/* Table: sys_user                                              */
/*==============================================================*/
create table sys_user
(
   id                   int(32) not null auto_increment,
   login_name           varchar(64) not null comment '用户名',
   password             varchar(64) not null comment '密码',
   chinese_name         varchar(64) not null comment '中文姓名',
   primary key (id)
);

alter table sys_user comment '用户表';

INSERT INTO dev.sys_user (id, login_name, password, chinese_name) VALUES (1, '1', '1', '1');
ALTER TABLE sys_user ADD dst varchar(100) NULL;

