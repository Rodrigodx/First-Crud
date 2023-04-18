CREATE TABLE crud.department (
	id BIGINT auto_increment NOT NULL,
	name varchar(60) NOT NULL,
	employee_id BIGINT NOT NULL,
	CONSTRAINT department_pk PRIMARY KEY (id)
)

ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4
COLLATE=utf8mb4_0900_ai_ci;