package dataRetrieval;

public class StudentPojo {
	
	
	private String name;
	private int enrollmentNo;
	private int grade;
	private boolean isVaccinated;
	private boolean needsSpecialAccomodation;
	
	
	@Override
	public String toString() {
		return "StudentPojo [name=" + name + ", enrollmentNo=" + enrollmentNo + ", grade=" + grade + ", isVaccinated=" + isVaccinated + ", needsSpecialAccomodation=" + needsSpecialAccomodation + "]";
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEnrollmentNo() {
		return enrollmentNo;
	}
	public void setEnrollmentNo(int enrollmentNo) {
		this.enrollmentNo = enrollmentNo;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
		
	public boolean getIsVaccinated() {
		return isVaccinated;
	}


	public void setIsVaccinated(boolean isVaccinated) {
		this.isVaccinated = isVaccinated;
	}
	


	public boolean getNeedsSpecialAccomodation() {
		return needsSpecialAccomodation;
	}


	public void setNeedsSpecialAccomodation(boolean needsSpecialAccomodation) {
		this.needsSpecialAccomodation = needsSpecialAccomodation;
	}

		
		public boolean isEquals(StudentPojo student1, StudentPojo copy) {
		if((student1.getName()==copy.getName())&&(student1.getEnrollmentNo()==copy.getEnrollmentNo())){
			return true;
		}
		else {
			return false;
			
		}
					
	}
	}
	
	
	


