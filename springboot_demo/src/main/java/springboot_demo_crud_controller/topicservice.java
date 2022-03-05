package springboot_demo_crud_controller;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class topicservice {
	private List<topic> lk = new ArrayList<topic>(Arrays.asList(
			new topic("java", "spring", "springboot"), 
			new topic("angular", "frontend", "developer")
			
			));
	
	public List<topic> getalltopics(){
		return lk;
	}
	
	public topic gettopicbyname(String name) {
		return lk.stream().filter(t -> t.getName().equals(name)).findFirst().get();
	}
	
	public void addtopic(topic t){
		 lk.add(t);
		
	}
	
	public void updatetopic(String name, topic t) {
		for(int i = 0; i< lk.size(); i++) {
			topic n = lk.get(i);
			if(n.getName().equals(name)) {
				lk.set(i, t);
				return;
			}
			
		}
		
		
	}
	
	
	public void deletetopic(String name) {
		lk.removeIf(t-> t.getName().equals(name));
	}

}
