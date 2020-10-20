select
  count(*)
from
  reserve_tbl
where
  room_id = /* reserve.roomId */1
and
  reservation_date = /* reserve.reservationDate */'2020-01-01'
and
  start_time > /* reserve.start_time */'10:00:00'
and
  end_time < /* reserve.end_time */'12:00:00'