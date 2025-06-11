package via.doc1.spring_boot_docker_app1.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;

@Entity(name = "DepartmentEntity")
@Table(name = "department")
public class Department {
    @Id
    private Long id;
    private String name;

    @OneToMany(mappedBy = "department", fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Story> stories = new ArrayList<>();

    public Department() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}