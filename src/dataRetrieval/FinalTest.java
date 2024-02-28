package dataRetrieval;

import java.util.ArrayList;

public class FinalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// In this module we are going to create a mock database instead of using a real database. This database represents a university's database. 
// Hence we are using the ArrayList class from the JDK to store student records.
		
		ArrayList<StudentPojo> ar1 = new ArrayList<StudentPojo>();

		// Creating individual objects of type StudentPojo.Now populating the values into each property of the StudentPojo class.
		// Creating multiple objects of StudentPojo class as each object represents a different student.
		StudentPojo s1 = new StudentPojo();
		s1.setName("Tom John");
		s1.setEnrollmentNo(1234);
		s1.setGrade(9);
		s1.setIsVaccinated(true);
		s1.setNeedsSpecialAccomodation(false);

		StudentPojo s2 = new StudentPojo();
		s2.setName("Olive Ben");
		s2.setEnrollmentNo(3556);
		s2.setGrade(7);
		s2.setIsVaccinated(true);
		s2.setNeedsSpecialAccomodation(true);

		StudentPojo s3 = new StudentPojo();
		s3.setName("Michael Ben");
		s3.setEnrollmentNo(5754);
		s3.setGrade(7);
		s3.setIsVaccinated(true);
		s3.setNeedsSpecialAccomodation(false);

		StudentPojo s4 = new StudentPojo();
		s4.setName("August James");
		s4.setEnrollmentNo(4567);
		s4.setGrade(8);
		s4.setIsVaccinated(false);
		s4.setNeedsSpecialAccomodation(true);

		StudentPojo s5 = new StudentPojo();
		s5.setName("Tiffany Brown");
		s5.setEnrollmentNo(5677);
		s5.setGrade(6);
		s5.setIsVaccinated(true);
		s5.setNeedsSpecialAccomodation(false);

		// Trying to store each of the above created objects inside the ArrayList bucket ar1.
		// Storing these objects inside the ArrayList ar1 so that our mock database can have information about each student.
		//The design of this application is done in this way so that all the student information is stored in the database.
		ar1.add(s1);
		ar1.add(s2);
		ar1.add(s3);
		ar1.add(s4);
		ar1.add(s5);

		// In the line below,studentPojoWithExpectedValues object contains values that we are searching for in the database.
		//This object will be used to identify a specific object from the database.
		//This represents the student that the state government wants more information about and we want to check if the same below student is represented in the database.
		StudentPojo studentPojoWithExpectedValues = new StudentPojo();

		// Populating the above object with the expected values to find if an object with the same values exists in our database.
		//Below information will be used to identify the specific object from the database.
		studentPojoWithExpectedValues.setName("Michael Ben");
		studentPojoWithExpectedValues.setEnrollmentNo(5754);

		
		// Writing a for loop to iterate through the ar1 ArrayList.
		// In this process, the complier will iterate through each object in the ArrayList ar1 and then it will compare each object with the studentPojoWithExpectedValues based on the above information on line 67
		// The reason for using the iteration is to compare the properties values from the database retrieved objects to the expected values object.
		
		for (int index = 0; index < ar1.size(); index++) {
			// Retrieving object from database and storing it in a new variable for further analysis.
			StudentPojo studentFromDatabase = ar1.get(index);
			
            //Checking if the object retrieved from the database is equal to the object that we created above. 
			// Calling the isEquals method which is the written in the StudentPojo class. 
			
			if (studentFromDatabase.isEquals(studentFromDatabase, studentPojoWithExpectedValues)) {
				System.out.println("The two values are same for both the objects. " + studentFromDatabase.toString());

			}

		} // End of for loop

	}
}
