package springboot_demo_crud_controller;

public class topic {
	private String name;
	private String course;
	private String lesson;
	
	public topic() {}
	
	public topic(String name, String course, String lesson) {
		super();
		this.name = name;
		this.course = course;
		this.lesson = lesson;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getLesson() {
		return lesson;
	}
	public void setLesson(String lesson) {
		this.lesson = lesson;
	}
	
	

}
