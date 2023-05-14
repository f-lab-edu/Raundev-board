CREATE TABLE rboard_db.ARTICLE (
                                   ARTICLE_ID BIGINT auto_increment NOT NULL PRIMARY KEY COMMENT '게시글 번호',
                                   ARTICLE_TYPE varchar(100) NOT NULL COMMENT '게시글 유형',
                                   ARTICLE_TITLE varchar(100) NOT NULL COMMENT '게시글의 제목',
                                   ARTICLE_CONTENTS varchar(10000) NULL COMMENT '게시글의 내용',
                                   REGISTER_ID varchar(100) NOT NULL COMMENT '등록한 사용자의 ID'
)
    ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4
COLLATE=utf8mb4_unicode_ci;

ALTER TABLE rboard_db.ARTICLE
    ADD FOREIGN KEY (REGISTER_ID) REFERENCES USERS(USER_ID);

CREATE TABLE rboard_db.USERS (
                                 USER_ID varchar(100) NOT NULL COMMENT '사용자 ID',
                                 PASSWORD varchar(100) NOT NULL COMMENT '비밀 번호',
                                 USER_TYPE varchar(100) NOT NULL COMMENT '게시글의 제목',
                                 USER_NAME varchar(10) NOT NULL COMMENT '게시글의 내용',
                                 PRIMARY KEY (USER_ID)
)
    ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4
COLLATE=utf8mb4_unicode_ci;