if not exists table_name 'account'
create table account(
id int(10) primary key auto_increment,
accno varchar (18) unique ,
password int(6),
balance double,
name varchar (20)
);
insert into account values(default ,'3','4',1000,'李四');

create table teacher(
  id int(10) not null auto_increment primary key,
  name varchar (20)
);

create table student(
  id int(10) primary key not null auto_increment,
  name varchar (20),
  age int(10),
  tid int (20),
  constraint fk_teacher foreign key(tid) references teacher(id)
);
create table menu(
id int(10) primary key auto_increment,
name varchar (20),
pid int(10)
);

insert into menu values (default ,"系统设置",0);
insert into menu values (default ,"销售设置",0);
insert into menu values (default ,"添加记录",1);
insert into menu values (default ,"修改密码",1);
insert into menu values (default ,"销售人员新增",2);
insert into menu values (default ,"销售人员删除",2);






