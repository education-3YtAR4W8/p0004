select
  /*%expand*/*
from
  reserve_tbl
where day = /* reserveInfo.day */'2020-09-01'
  and room_number = /* reserveInfo.room */1
Order by start_time
