package com.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.main.model.Topic;
import com.main.service.TopicsService;

@RestController
public class TopicController {

	@Autowired
	private TopicsService topicsService;

	@GetMapping("/getAllTopics")
	public List<Topic> getAllTopics() {
		return this.topicsService.getAllTopics();
	}

	@PostMapping("/addTopic")
	public List<Topic> addTopics(@RequestBody Topic t) {
		return this.topicsService.addTopics(t);
	}

	@GetMapping("/getTopicByName/{name}")
	public Topic getTopicByName(@PathVariable String name) {
		return this.topicsService.getTopicByName(name);
	}

	@PostMapping("/updateTopic")
	public void updateTopic(@RequestBody Topic t) {
		this.topicsService.updateTopic(t);
		this.getAllTopics();
	}

	@PostMapping("/removeTopic")
	public void removeTopic(@RequestBody Topic t) {
		this.topicsService.removeTopic(t);
		this.getAllTopics();
	}

}
