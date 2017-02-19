package com.example.bootdemo;

import java.util.Arrays;
import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
 
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics(){
		return topicService.getTopicList(); 
	}
	
	@RequestMapping("/topics/{id}")
	public Topic getTopicById(@PathVariable int id){
		return topicService.getTopicById(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/topics")
	public void addTopic(@RequestBody Topic topic){
		topicService.addTopic(topic);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/topics/{id}")
	public void editTopic(@RequestBody Topic topic, @PathVariable int id){
		topicService.editTopic(topic, id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}")
	public void deleteTopic(@PathVariable int id){
		topicService.deleteTopic(id);
	}
}
