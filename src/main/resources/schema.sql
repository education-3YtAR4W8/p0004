drop table if exists reserve_tbl;
create table reserve_tbl (
    id char(36) not null,
    room_id char(36) not null,
    reservation_date DATE not null,
    user_id char(36) not null,
    start_time time not null,
    end_time time not null,
    primary key(id)
);

drop table if exists room_tbl;
create table room_tbl (
    room_id char(36) not null,
    primary key(room_id)
 );

drop table if exists user_tbl;
create table user_tbl (
    user_id char(36) not null,
    primary key(user_id)
 );