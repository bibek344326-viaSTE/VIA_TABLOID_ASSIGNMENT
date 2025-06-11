package via.doc1.spring_boot_docker_app1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import via.doc1.spring_boot_docker_app1.model.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}


