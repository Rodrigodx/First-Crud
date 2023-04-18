ALTER TABLE crud.department ADD CONSTRAINT department_FK FOREIGN KEY (employee_id) REFERENCES crud.employee(id);
