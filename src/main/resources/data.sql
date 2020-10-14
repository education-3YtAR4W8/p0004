insert into room_tbl (room_id) values (1);
insert into room_tbl (room_id) values (2);

insert into user_tbl (user_id) values ('user1');
insert into user_tbl (user_id) values ('user2');

insert into reserve_tbl (id, room_id, reservation_date, user_id, start_time, end_time) values ('1', '1', '2020-08-20', 'user2', '15:00:00', '15:45:00');
insert into reserve_tbl (id, room_id, reservation_date, user_id, start_time, end_time) values ('2', '1', '2020-08-20', 'user1', '16:30:00', '17:00:00');