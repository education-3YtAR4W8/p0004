select
    /*%expand*/*
from
    reserve_info_tbl
where
        room_no = /* roomNo */'123'
    and reserve_date = /* reserveDate */'123'
    and not begin_time = /* endTime */123
    and not end_time = /* beginTime */123
    and ((/* beginTime */123 between begin_time and end_time)
      or (/* endTime */123 between begin_time and end_time)
      or ((begin_time between /* beginTime */123 and /* endTime */123)
      and (end_time between /* beginTime */123 and /* endTime */123)))