select
  /*%expand*/*
from
  reserve_tbl
where
  room_id = /* roomId */1
and
  reservation_date = /* reservationDate */'2020-01-01'
order by
  start_time