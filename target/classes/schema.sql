drop table if exists room_info_tbl;
create table room_info_tbl (
    room_no char(36) not null,
    reservation_no varchar(256),
    primary key(room_no)
);

drop table if exists reserve_info_tbl;
create table reserve_info_tbl (
    reservation_no varchar(256) not null,
    room_no char(36),
    user_id char(36),
    begin_time int,
    end_time int,
    reserve_date char(36),
    primary key(reservation_no)
);