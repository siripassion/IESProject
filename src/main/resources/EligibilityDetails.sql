DECLARE
i number:=1;
ed_trace_id number:=100;
case_no number:=1;
BEGIN
WHILE i <=100 LOOP
    insert into ELIGIBILITY_DETAILS values(ed_trace_id,'$600',case_no,sysdate,null,null,'SNAP',sysdate,'AP',null);
    i:= i + 1;
    ed_trace_id:=ed_trace_id +1;
    case_no:=case_no+1;
  END LOOP;
END;
/