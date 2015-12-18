package QuestionA;

import java.util.Date;

public interface iPersonRead {

	/* (non-Javadoc)
	 * @see QuestionA.iPersonReadWrite#getFirstName()
	 */
	String getFirstName();

	/* (non-Javadoc)
	 * @see QuestionA.iPersonReadWrite#getMiddleName()
	 */
	String getMiddleName();

	/* (non-Javadoc)
	 * @see QuestionA.iPersonReadWrite#getLastName()
	 */
	String getLastName();

	/* (non-Javadoc)
	 * @see QuestionA.iPersonReadWrite#getDOB()
	 */
	Date getDOB();

	/* (non-Javadoc)
	 * @see QuestionA.iPersonReadWrite#getAddress()
	 */
	String getAddress();

	/* (non-Javadoc)
	 * @see QuestionA.iPersonReadWrite#getPhone()
	 */
	String getPhone();

	/* (non-Javadoc)
	 * @see QuestionA.iPersonReadWrite#getEmail()
	 */
	String getEmail();

	/* (non-Javadoc)
	 * @see QuestionA.iPersonReadWrite#PrintName()
	 */
	void PrintName();

	/* (non-Javadoc)
	 * @see QuestionA.iPersonReadWrite#PrintDOB()
	 */
	void PrintDOB();

	/* (non-Javadoc)
	 * @see QuestionA.iPersonReadWrite#PrintAge()
	 */
	int PrintAge();

}