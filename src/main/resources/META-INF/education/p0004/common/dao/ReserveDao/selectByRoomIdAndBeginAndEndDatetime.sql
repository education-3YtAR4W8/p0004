select
  /*%expand*/*
from
  reserve_tbl
where
  room_id = /* roomId */'r100'
and
  end_datetime > /* begin */'2020-01-01 12:30:00'
and
  begin_datetime <= /* end */'2020-01-01 13:45:00'
