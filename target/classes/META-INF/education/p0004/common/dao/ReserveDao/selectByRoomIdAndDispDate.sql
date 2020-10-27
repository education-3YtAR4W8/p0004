select
  /*%expand*/*
from
  reserve_tbl
where
  room_id = /* roomId */'r100'
and
  end_datetime > /* dispDate */'2020-01-01'
and
  begin_datetime < dateadd(DAY, 1, /* dispDate */'2020-01-01')
