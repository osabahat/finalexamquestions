package QuestionE;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Student_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void Student_Test() {
		
		Date dBirthDate = null;
		try {
			dBirthDate = new SimpleDateFormat("yyyy-MM-dd").parse("1972-07-31");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Student stu1 = new Student("Bert", "Randall", "Gibbons", dBirthDate, "214 Labrador Lane", "302-893-6889", "bgibbons@udel.edu","MIS");
		Student stu2 = new Student("John", "Jacob", "Something", dBirthDate, "123 Dalmation Lane", "302-897-4235", "jsomething@udel.edu","MIS");
		Student stu3 = new Student("Very", "Crazy", "Dude", dBirthDate, "456 Retriever Lane", "302-756-234", "vdude@udel.edu","MIS");
		Student stu4 = new Student("Really", "Funny", "Girl", dBirthDate, "789 Chihuahua Lane", "302-542-3462", "rgirl@udel.edu","MIS");
		Student stu5 = new Student("Kinda", "Boring", "Guy", dBirthDate, "101 Dachsund Lane", "302-744-2432", "kguy@udel.edu","MIS");

		HashMap students = new HashMap(); 
		
		students.put(stu1, stu1.getPersonID());
		students.put(stu2, stu2.getPersonID());
		students.put(stu3, stu3.getPersonID());
		students.put(stu4, stu4.getPersonID());
		students.put(stu5, stu5.getPersonID());
		
		assertTrue(students.size() == 5);
	}

}
