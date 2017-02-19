package com.example.bootdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topicList = new ArrayList<Topic>(Arrays.asList((new Topic(1,"Branding")),
			 (new Topic(2,"Preferences"))));

	public List<Topic> getTopicList() {
		return topicList;
	}

	public void setTopicList(List<Topic> topicList) {
		this.topicList = topicList;
	}
	
	public Topic getTopicById(int id){
		Iterator<Topic> itr = topicList.iterator();
		Topic tp = null;
		while(itr.hasNext()){
			tp = itr.next(); 
			if(tp.getId() == id)
				break; 
		}	
		return tp;
	}
	
	public void addTopic(Topic topic){
		topicList.add(topic);
	}
	
	public void editTopic(Topic topic, int id){
		for(int i=1; i<=topicList.size();i++){
			if(topicList.get(i).getId() == id){
				topicList.get(i).setId(topic.getId());
				topicList.get(i).setTopicName(topic.getTopicName());
				return;
			}
		}
	}
	
	public void deleteTopic(int id){
		for(int i=0;i<topicList.size(); i++){
			if(topicList.get(i).getId() == id){
				topicList.remove(i);
				return;
			}	
		}		
	}
}
