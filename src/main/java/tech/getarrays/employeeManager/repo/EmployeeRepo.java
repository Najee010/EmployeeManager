package tech.getarrays.employeeManager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.getarrays.employeeManager.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

    void deleteEmployeeById(Long id);

    Employee findEmployeeById(Long id);
}
