select *
from book;

select *
from author;

drop table author;
drop table book;

drop sequence seq_author_id;
drop sequence seq_book_id;

CREATE TABLE    author(
    author_id   number(10),
    author_name varchar2(100),
    author_desc varchar2(100),
    PRIMARY KEY (author_id)
);

CREATE TABLE    book( 
    book_id     number(20),
    title       varchar2(100),
    pubs        varchar2(100),
    pub_date    date,
    author_id   number(20) not null,
    PRIMARY KEY (book_id),
    CONSTRAINT  book_fk FOREIGN KEY (author_id)
    REFERENCES  author(author_id)
);

    
create sequence seq_book_id
increment by 1
start with 1
nocache;

--실행순서-- 1-2(순번 자동 생성) 
create sequence seq_author_id     
increment by 1
start with 1
nocache; --디폴트

select book_id,
       title,
       pubs,
       pub_date,
       au.author_name
from book bo, author au
where bo.author_id = au.author_id
and   (title, pubs, author_name) in (select bo.title,
                                            bo.pubs,
                                            au.author_name
                                     from book bo, author au
                                     where title like '%문%' 
                                     or pubs like '%문%'
                                     or author_name like '%문%')
order by book_id asc;

-----------------------------------------------------------------

--테이블 삭제
drop table guestbook;

--시퀀스 삭제
drop sequence seq_guestbook;


create table guestbook(
    no	     number(10),
    name  	 varchar2(20),
    password varchar2(20),
    content	 varchar2(2000),
    reg_date date,
    PRIMARY KEY(no)	
);

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

select no,
       name,
       password,
       content,
       to_char(reg_date, 'YYYY-MM-DD hh:mi:ss') reg_date
from guestbook
order by reg_date desc;

-----------------------------------------------------------------

--테이블 삭제
drop table person;

--시퀀스 삭제
drop sequence seq_person_id;

--테이블 생성
create table person(
    person_id	number(5),
    name   	varchar2(20)     NOT NULL,
    hp		varchar2(20),
    company	varchar2(20),
    PRIMARY KEY(person_id)	
);

--시퀀스 생성
CREATE SEQUENCE seq_person_id
INCREMENT BY 1 
START WITH 1 ;

--insert문
insert into person values(seq_person_id.nextval, '이효리', '010-1111-1111', '02-1111-1111');
insert into person values(seq_person_id.nextval, '정우성', '010-2222-2222', '02-2222-2222');
insert into person values(seq_person_id.nextval, '유재석', '010-3333-3333', '02-3333-3333');
insert into person values(seq_person_id.nextval, '이정재', '010-4444-4444', '02-4444-4444');
insert into person values(seq_person_id.nextval, '서장훈', '010-5555-5555', '02-5555-5555');

commit;


