select
    reservation_no, begin_time, end_time
from
    reserve_info_tbl
where
    user_id = /* userId */'abc'
order by
    begin_time ASC