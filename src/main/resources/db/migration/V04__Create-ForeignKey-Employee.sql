ALTER TABLE crud.employee ADD CONSTRAINT employee_FK FOREIGN KEY (department_id) REFERENCES crud.department(id);
