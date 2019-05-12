CREATE TABLE employees(
        e_id NUMBER(10) PRIMARY KEY,
        e_username VARCHAR2(255) NOT NULL,
        e_firstname VARCHAR2(255) NOT NULL,
        e_lastname VARCHAR2(255) NOT NULL
        );

CREATE TABLE expensekit (
        t_id NUMBER(10) PRIMARY KEY,
        exp_amount NUMBER(4),
        sub_date DATE,
        res_date DATE,
        t_status INT(2), --Create status table.. pending and approved 
        t_description VARCHAR2(255),
        req_type INT(4), -- 
        e_id NUMBER(10) FOREIGN KEY
        );
        
CREATE TABLE req_type (
    t_id number(255) PRIMARY KEY
    logding varchar2(250) not null
    travel varchar2(250) not null
    food varchar2(255) not null
    other varchar2(255) not null
    );
        
        
