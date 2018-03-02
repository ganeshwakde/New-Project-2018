package io.javaBrains.SpringBootStarter.Topics;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		
		return Arrays.asList(
				
				
				new Topic(1,"Java"," description 1"),
				new Topic(2,"Oracle", "Oracle description"),
				new Topic(3,"Spring","Spring description")
				);
	}
	
}
