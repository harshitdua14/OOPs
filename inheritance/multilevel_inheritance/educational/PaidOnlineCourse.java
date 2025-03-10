package inheritance.multilevel_inheritance.educational;

public class PaidOnlineCourse extends OnlineCourse{
	 private double fee;
	    private double discount;

	    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
	        super(courseName, duration, platform, isRecorded);
	        this.fee = fee;
	        this.discount = discount;
	    }

	    @Override
	    public void displayCourseDetails() {
	        super.displayCourseDetails();
	        System.out.println("Fee: $" + fee);
	        System.out.println("Discount: " + discount + "%");
	    }
}
