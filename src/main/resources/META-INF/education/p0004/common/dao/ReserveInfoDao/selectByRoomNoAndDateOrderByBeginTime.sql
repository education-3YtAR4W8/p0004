select
    /*%expand*/*
from
    reserve_info_tbl
where
      room_no = /* roomNo */'abc'
  and reserve_date = /* reserveDate */'00000000'
order by
    begin_time ASC