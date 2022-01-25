-------------유저관리
--테이블 삭제
drop table users;

--시퀀스 삭제
drop sequence seq_users_no;

--테이블 생성
create table users(
    no          number,
    id          varchar2(20) unique not null,
    password    varchar2(20) not null,
    name        varchar2(20),
    gender      varchar2(10),
    primary key(no)
);

--시퀀스 생성
create sequence seq_users_no
increment by 1 start with 1
nocache;

--insert문 2개 male, female
insert into users
values (seq_users_no.nextval, 'hiy', '1234', '황일영', 'male');
insert into users
values (seq_users_no.nextval, 'lhl', '1234', '이효리', 'female');
insert into users
values (seq_users_no.nextval, 'apf', '1234', '송성빈', 'male');
insert into users
values (seq_users_no.nextval, 'fed', '1234', '장동건', 'female');
insert into users
values (seq_users_no.nextval, 'lgdf', '1234', '이효리', 'female');


commit;


select*
from users;

-------------게스트방명록
--테이블 삭제
drop table guestbook;

--시퀀스 삭제
drop sequence seq_guestbook;


create table guestbook(
    no        number,
    name      varchar2(20),
    password varchar2(20),
    content    varchar2(2000),
    reg_date date,
    PRIMARY KEY(no));

--시퀀스 생성
CREATE SEQUENCE seq_guestbook_no
INCREMENT BY 1 
start with 1 
nocache;

insert into guestbook
values(seq_guestbook_no.nextval, '송성빈', '1234', '출췍완료', sysdate);
insert into guestbook
values(seq_guestbook_no.nextval, '전지현', '1234', '출췍완료', sysdate);
insert into guestbook
values(seq_guestbook_no.nextval, '장동건', '1234', '출췍완료', sysdate);
insert into guestbook
values(seq_guestbook_no.nextval, '원빈', '1234', '출췍완료', sysdate);
insert into guestbook
values(seq_guestbook_no.nextval, '임수정', '1234', '출췍완료', sysdate);

commit;


--게시판
--테이블 삭제
drop table board;

--시퀀스 삭제
drop sequence seq_board_no;


create table board(
    no        number,
    title      varchar2(500) not null,
    content  varchar2(4000),
    hit        number,
    reg_date date,
    user_no  number not null,
    PRIMARY KEY(no),
    CONSTRAINT board_fk FOREIGN KEY (user_no)
    REFERENCES users(no));

--시퀀스 생성
CREATE SEQUENCE seq_board_no
INCREMENT BY 1 
start with 1 
nocache;

insert into board
values(seq_board_no.nextval, '안녕하세요', '만나서 반갑습니다', '0', sysdate, 1);

insert into board
values(seq_board_no.nextval, '안녕하세요', '만나서 반갑습니다', '0', sysdate, 2);

insert into board
values(seq_board_no.nextval, '안녕하세요', '만나서 반갑습니다', '0', sysdate, 3);

insert into board
values(seq_board_no.nextval, '안녕하세요', '만나서 반갑습니다', '0', sysdate, 4);

insert into board
values(seq_board_no.nextval, '안녕하세요', '만나서 반갑습니다', '0', sysdate, 1);

commit;

select  us.no no,
        bo.title title,
        bo.content content,
        us.name name,
        bo.hit hit,
        to_char(bo.reg_date, 'YYYY-MM-DD hh:mi:ss') reg_date
from board bo, users us
where bo.no = us.no;



--만들어진 전체 테이블 조회
SELECT 'DROP TABLE "' || TABLE_NAME || '" CASCADE CONSTRAINTS;' 
FROM user_tables; 


--테이블보기
select *
from users;