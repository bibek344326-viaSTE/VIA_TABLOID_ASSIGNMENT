package via.doc1.spring_boot_docker_app1.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import via.doc1.spring_boot_docker_app1.model.Department;
import via.doc1.spring_boot_docker_app1.services.DepartmentService;

@RestController
public class DepartmentController {

    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping("/departments")
    public String addDepartment(@RequestBody Department department) {
        departmentService.addDepartment(department);
        return "Department added successfully.";
    }

    @GetMapping("/")
    public String printSomething() {
        return "<body><h1>Hello World!</h1></body>";
    }

    @GetMapping("/departments")
    public List<Department> getAllDepartments() {
        return departmentService.getAllDepartments();
    }

    @GetMapping("/department/{id}")
    public Department getDepartmentById(@PathVariable("id") Long id) {
        return departmentService.getDepartmentById(id);
    }
}
