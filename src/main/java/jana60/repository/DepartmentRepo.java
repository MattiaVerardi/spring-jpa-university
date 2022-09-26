package jana60.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import jana60.model.Departments;

public interface DepartmentRepo extends CrudRepository<Departments, Integer> {

	List<Departments> findAllByOrderByName();

	List<Departments> findAllByOrderByNameDesc();

}
