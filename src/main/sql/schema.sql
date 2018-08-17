--数据库初始化脚本

--创建数据库
CREATE DATABASE seckill;
--使用数据库
use seckill;
--创建秒杀库存表
CREATE TABLE seckill(
`seckill_id` bigint NOT NULL AUTO_INCREMENT COMMENT '商品库存id',
`name` varchar(120) NOT NULL COMMENT '商品名称',
`number` int NOT NULL COMMENT '商品库存',
`start_time` timestamp NOT NULL COMMENT '秒杀开启时间',
`end_time` timestamp NOT NULL COMMENT '秒杀结束时间',
`create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '秒杀创建时间',
PRIMARY KEY (seckill_id),
key idx_start_time(start_time),
key idx_end_time(end_time),
key idx_create_time(create_time)
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='秒杀库存表';

--初始化数据
insert into
  seckill(name,number,start_time,end_time)
values
  ('1000元秒杀iphone6',100,'2018-07-25 00:00:00','2018-07-29 00:00:00'),
  ('500元秒杀ipad2',200,'2018-07-25 00:00:00','2018-07-29 00:00:00'),
  ('300元秒杀小米4',300,'2018-07-25 00:00:00','2018-07-29 00:00:00'),
  ('200元秒杀红米note',400,'2018-07-25 00:00:00','2018-07-29 00:00:00');

--秒杀成功明细表
--用户登录认证相关的信息
create table success_killed(
`seckill_id` bigint NOT NULL  COMMENT '秒杀商品id',
`user_phone` bigint NOT NULL  COMMENT '用户手机号',
`state` tinyint NOT NULL  DEFAULT -1 COMMENT '状态表示：-1无效，0成功，1已付款，2已发货',
`create_time` timestamp NOT NULL COMMENT '创建时间',
primary key (seckill_id,user_phone),/*联合主键*/
key idx_create_time(create_time)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='秒杀成功明细表';

--连接数据库控制台
mysql -uroot -p

--为什么手写DDL
--需要记录每次上线的DDL修改
--上线v1.1->v1.2的改变