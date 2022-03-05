package springboot_demo_crud_controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class controller {
	@Autowired
	public topicservice tk;
	
	@RequestMapping("/topics")
	public List<topic> gettopic(){
		return tk.getalltopics();
		
	}
	
	@RequestMapping("/topic/{name}")
	public topic gettopicname(@PathVariable  String name) {
		return tk.gettopicbyname(name);
	}
	
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/add")
	public String addtopicbyname(@RequestBody  topic t) {
		tk.addtopic(t);
	return "successfully added " + t.getName();
	} 	
	
	
	@RequestMapping(method = RequestMethod.PUT, value = "/update/{name}")
	public String updatetopicbyname(@PathVariable String name, @RequestBody topic t) {
		tk.updatetopic(name, t);
		return "successfully update " + t.getName();  
		
	}
	
	@RequestMapping(method= RequestMethod.DELETE, value="/delete/{name}")
	public String deltopic(@PathVariable String name) {
		tk.deletetopic(name);
		return "sucessfully deleted ";
	}
	
}

