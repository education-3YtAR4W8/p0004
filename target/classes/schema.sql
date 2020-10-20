drop table if exists user_tbl;
create table user_tbl (
    id char(36) not null,
    name varchar(256) not null,
    primary key (id)
);

drop table if exists room_tbl;
create table room_tbl (
    id char(36) not null,
    name varchar(256) not null,
    primary key (id)
);

drop table if exists reserve_tbl;
create table reserve_tbl (
    id char(36) not null,
    user_id char(36) not null,
    room_id char(36) not null,
    used_begin_time datetime not null,
    used_end_time datetime not null,
    primary key (id)
);