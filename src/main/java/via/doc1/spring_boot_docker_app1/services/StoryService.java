package via.doc1.spring_boot_docker_app1.services;

import java.util.List;
import org.springframework.stereotype.Service;
import via.doc1.spring_boot_docker_app1.repository.StoryRepository;
import via.doc1.spring_boot_docker_app1.model.Story;

@Service
public class StoryService {

    private final StoryRepository storyRepository;

    public StoryService(StoryRepository storyRepository) {
        this.storyRepository = storyRepository;
    }

    public Story addStory(Story story) {
        return storyRepository.save(story);
    }

    public List<Story> getAllStories() {
        return storyRepository.findAll();
    }
}
