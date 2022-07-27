# select Email from
# (
# select email,count(email) as num
# from Person
# group by email
# )
# as statastic
# where num>1;
select Email 
from Person
group by email
Having count(email)>1;