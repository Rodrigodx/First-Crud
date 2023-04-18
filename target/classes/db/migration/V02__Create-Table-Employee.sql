CREATE TABLE crud.employee (
	id BIGINT auto_increment NOT NULL,
	name varchar(60) NOT NULL,
	department_id BIGINT NOT NULL,
	CONSTRAINT employee_pk PRIMARY KEY (id)
)

ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4
COLLATE=utf8mb4_0900_ai_ci;