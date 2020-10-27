drop table if exists `user_tbl`;
create table `user_tbl` (
    `user_id` varchar(64) not null,
    `name` varchar(256) not null,
    primary key(`user_id`)
);

drop table if exists `reserve_tbl`;
create table `reserve_tbl` (
    `reserve_id` int auto_increment,
    `user_id` varchar(64) not null,
    `room_id` varchar(64) not null,
    `begin_datetime` datetime not null,
    `end_datetime` datetime not null,
    primary key(`reserve_id`)
);
create index on `reserve_tbl` (`room_id`, `end_datetime`);