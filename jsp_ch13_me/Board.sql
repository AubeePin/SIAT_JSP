drop table board;

create table board(
NUM NUMBER(10),
AUTHOR VARCHAR2(100),
EMAIL VARCHAR2(200),
TITLE VARCHAR2(500),
CONTENT VARCHAR2(4000),
PASSWD VARCHAR2(12),
WRITEDAY  DATE,
READCNT NUMBER(10),
REP_ROOT NUMBER(10),
REP_STEP NUMBER(10),
REP_INDENT NUMBER(10)
);
--rep은 답글용

create sequence board_seq start with 1 increment by 1;
 
insert into board(NUM, TITLE, AUTHOR, EMAIL, WRITEDAY)
values(board_seq.nextval, '테스트', '테스트', 'abc@aaa.com', sysdate);

insert into board(NUM, TITLE, AUTHOR, EMAIL, WRITEDAY)
values(board_seq.nextval, '테스트2', '테스트2', 'bbb@aaa.com', sysdate);

insert into board(NUM, TITLE, AUTHOR, EMAIL, WRITEDAY)
values(board_seq.nextval, '테스트3', '테스트3', 'ccc@aaa.com', sysdate);

insert into board(NUM, TITLE, AUTHOR, EMAIL, WRITEDAY)
values(board_seq.nextval, '테스트4', '테스트4', 'ddd@aaa.com', sysdate);

insert into board(NUM, TITLE, AUTHOR, EMAIL, WRITEDAY)
values(board_seq.nextval, '테스트5', '테스트5', 'eee@aaa.com', sysdate);

select * from board;


select * from board;

commit