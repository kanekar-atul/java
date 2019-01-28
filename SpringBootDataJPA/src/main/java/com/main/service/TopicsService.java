package com.main.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.main.model.Topic;

@Service
public class TopicsService {

	private List<Topic> topics = new ArrayList<>();

	public List<Topic> getAllTopics() {
		return topics;
	}

	public List<Topic> addTopics(Topic t) {
		this.topics.add(t);
		return this.getAllTopics();
	}

	public Topic getTopicByName(String name) {
		return topics.stream().filter(t -> t.getId().equals(name)).findFirst().get();
	}

	public void updateTopic(Topic t) {
		int i=0;
		for (Topic topic : topics) {
			if(topic.getId() == t.getId()) {
				topics.add(i, t);
				return;
			}
			i++;
		} 
	}

	public void removeTopic(Topic t) {
		this.topics.remove(t);
	}

}
