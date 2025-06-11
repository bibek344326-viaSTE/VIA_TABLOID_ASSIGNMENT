package via.doc1.spring_boot_docker_app1.ControllerTest;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;

import via.doc1.spring_boot_docker_app1.model.Story;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class StoryControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void testGetAllStories() {
        ResponseEntity<Story[]> response = restTemplate.getForEntity("/stories", Story[].class);
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
    }
}
