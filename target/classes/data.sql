insert into user_tbl (id, name) values ('u1', 'Ａさん');
insert into user_tbl (id, name) values ('u2', 'Ｂさん');
insert into user_tbl (id, name) values ('u3', 'Ｃさん');
insert into user_tbl (id, name) values ('u4', 'Ｄさん');

insert into room_tbl (id, name) values ('r1', '会議室Ａ');
insert into room_tbl (id, name) values ('r2', '会議室Ｂ');
insert into room_tbl (id, name) values ('r3', '事務室');
insert into room_tbl (id, name) values ('r4', '開発室');

insert into reserve_tbl (id, user_id, room_id, reservation_date, used_begin_time, used_end_time)
values ('1', 'u1', 'r1', '2020-09-01', '22:00','22:30');