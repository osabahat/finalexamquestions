package QuestionA;

import java.util.Date;

public interface iPersonReadWrite {

	String getFirstName();

	void setFirstName(String FirstName);

	String getMiddleName();

	void setMiddleName(String MiddleName);

	String getLastName();

	void setLastName(String LastName);

	Date getDOB();

	void setDOB(Date DOB);

	void setAddress(String newAddress);

	String getAddress();

	void setPhone(String newPhone_number);

	String getPhone();

	void setEmail(String newEmail);

	String getEmail();

	void PrintName();

	void PrintDOB();

	int PrintAge();

}