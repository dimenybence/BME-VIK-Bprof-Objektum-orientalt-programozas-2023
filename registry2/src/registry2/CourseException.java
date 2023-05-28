package registry2;

public class CourseException extends Exception{
	private Course course;
	
	public CourseException(Course course) {
		this.course = course;
	}

	public String getMessage() {
        return course.getName();
    }
}
