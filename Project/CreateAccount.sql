CREATE PROCEDURE `new_procedure` ()
BEGIN
insert into accounts (Cust_id, Acct_type, balance) values (?, ?, ?);

END
