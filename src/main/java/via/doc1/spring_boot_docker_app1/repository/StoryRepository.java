package via.doc1.spring_boot_docker_app1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import via.doc1.spring_boot_docker_app1.model.Story;

public interface StoryRepository extends JpaRepository<Story, Long> {

}
