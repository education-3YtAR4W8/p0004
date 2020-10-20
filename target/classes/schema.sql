drop table if exists reserve_tbl;
create table reserve_tbl (
  `id` integer identity not null,
  `user` varchar(256) not null,
  `day` date not null,
  `start_time` time  not null,
  `end_time` time  not null,
  `room_number` int not null,
primary key(id)
);
