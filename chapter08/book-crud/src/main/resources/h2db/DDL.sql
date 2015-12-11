DROP TABLE IF EXISTS book CASCADE ;

CREATE TABLE book (
  id   bigint auto_increment primary key,
  title varchar(100) NOT NULL,
  isbn varchar(13) NOT NULL
)
;