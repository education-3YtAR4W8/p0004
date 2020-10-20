select
  /*%expand*/*
from
  reserve_tbl
where
  room_id = /* roomId */'r1'
order by
  reservation_date