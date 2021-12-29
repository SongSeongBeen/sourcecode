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