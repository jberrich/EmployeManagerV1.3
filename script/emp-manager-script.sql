
CREATE TABLE DEPT
       (DEPTNO INTEGER PRIMARY KEY,
        DNAME VARCHAR(14),
        LOC VARCHAR(13));
 
INSERT INTO DEPT VALUES (10, 'ACCOUNTING', 'NEW YORK');
INSERT INTO DEPT VALUES (20, 'RESEARCH',   'DALLAS');
INSERT INTO DEPT VALUES (30, 'SALES',      'CHICAGO');
INSERT INTO DEPT VALUES (40, 'OPERATIONS', 'BOSTON');

CREATE TABLE EMP
       (EMPNO INTEGER AUTO_INCREMENT PRIMARY KEY,
        ENAME VARCHAR(64),
        JOB VARCHAR(9),
        AGE INTEGER,
        SAL DECIMAL(7, 2),
        DEPTNO INTEGER, 
        FOREIGN KEY(DEPTNO) REFERENCES DEPT(DEPTNO));
 
INSERT INTO EMP(ENAME, JOB, AGE, SAL, DEPTNO) VALUES ('SMITH', 'CLERK',    40, 800,  20);
INSERT INTO EMP(ENAME, JOB, AGE, SAL, DEPTNO) VALUES ('ALLEN', 'SALESMAN', 38, 1600, 30);
INSERT INTO EMP(ENAME, JOB, AGE, SAL, DEPTNO) VALUES ('WARD',  'SALESMAN', 46, 1250, 10);
 