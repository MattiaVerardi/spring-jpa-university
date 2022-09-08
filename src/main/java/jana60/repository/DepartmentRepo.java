package jana60.repository;

import org.springframework.data.repository.CrudRepository;

import jana60.model.Department;

public interface DepartmentRepo extends CrudRepository<Department, Integer> {

}
