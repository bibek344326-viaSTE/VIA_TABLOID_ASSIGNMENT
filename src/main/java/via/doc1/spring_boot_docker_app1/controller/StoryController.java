package via.doc1.spring_boot_docker_app1.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import via.doc1.spring_boot_docker_app1.model.Story;
import via.doc1.spring_boot_docker_app1.services.StoryService;

@RestController
public class StoryController {

    private final StoryService storyService;

    public StoryController(StoryService storyService) {
        this.storyService = storyService;
    }

    @PostMapping("/stories")
    public Story addStory(@RequestBody Story story) {
        return storyService.addStory(story);
    }

    @GetMapping("/stories")
    public List<Story> getAllStories() {
        return storyService.getAllStories();
    }
}
