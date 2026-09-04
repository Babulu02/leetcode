# Write your MySQL query statement below
select t.request_at as 'Day',
    round(sum(case when t.status like 'cancelled%' then 1 else 0 end) / count(t.status), 2) as 'Cancellation Rate'
from trips t
where t.client_id not in (select users_id from users where banned = 'Yes')
and t.driver_id not in (select users_id from users where banned = 'Yes')
and t.request_at between '2013-10-01' and '2013-10-03'
group by Day;