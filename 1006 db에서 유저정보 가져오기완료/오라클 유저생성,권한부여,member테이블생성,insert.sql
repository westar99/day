SELECT SYSDATE FROM DUAL;

---- 유저 생성후 권한 부여 ----
ALTER SESSION SET "_ORACLE_SCRIPT" = TRUE; --C##안써도되게
CREATE USER ora_user IDENTIFIED BY evan;   -- 유저생성
GRANT CONNECT, RESOURCE, DBA TO ora_user ; -- 권한부여


---    MEMBER 테이블    ---
DROP TABLE MEMBER;
CREATE TABLE MEMBER(
   name VARCHAR2(40),
   userid VARCHAR2(40) PRIMARY KEY,
   pwd VARCHAR2(40),
   email VARCHAR2(40),
   phone VARCHAR2(20),
   admin CHAR(1)
);
INSERT INTO MEMBER(name, userid, pwd, email, phone, admin) VALUES('강감찬', 'gangGamChan', '1234', 'testGang@naver.com', '010-1234-1234', 0);
INSERT INTO MEMBER(name, userid, pwd, email, phone, admin) VALUES('세종대왕', 'kingseJong', '1234', 'testKing@naver.com', '010-1111-1111', 1);
INSERT INTO MEMBER(name, userid, pwd, email, phone, admin) VALUES('이순신', 'generalLee', '1234', 'lee@google.com', '010-5555-5678', 0);
INSERT INTO MEMBER(name, userid, pwd, email, phone, admin) VALUES('정약용', 'misterJeong', '1234', 'jeong@yahoo.com', '010-0909-5252', 1);

DELETE FROM MEMBER;
SELECT * FROM MEMBER;
COMMIT;