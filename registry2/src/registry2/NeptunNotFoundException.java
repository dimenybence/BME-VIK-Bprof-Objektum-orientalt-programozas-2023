package registry2;

public class NeptunNotFoundException extends CourseException{
	public NeptunNotFoundException(Course course) {
        super(course);
    }
}
