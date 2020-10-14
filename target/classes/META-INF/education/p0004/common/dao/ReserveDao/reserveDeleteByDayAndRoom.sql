delete
  /*%expand*/*
from
  reserve_tbl
where day = /* reserveDelete.day */'2020-09-01'
  and room_number = /* reserveDelete.room */1
  and id = /* reserveDelete.id */1
