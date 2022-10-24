package Kodlama.io.entities;

public class Course {
	private int id;
	private String name;
	private String explanation;
	private String instructorName;
	private double coursePrice;
	
	public Course() {
		super();
	}
	
	public Course(int id, String name, String explanation, String instructorName, double coursePrice) {
		super();
		this.id=id;
		this.name=name;
		this.explanation=explanation;
		this.instructorName=instructorName;
		this.coursePrice=coursePrice;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getExplanation() {
		return explanation;
	}
	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}
	public String getInstructorName() {
		return instructorName;
	}
	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}

	public double getCoursePrice() {
		return coursePrice;
	}

	public void setCoursePrice(double coursePrice) {
		this.coursePrice = coursePrice;
	}
}
