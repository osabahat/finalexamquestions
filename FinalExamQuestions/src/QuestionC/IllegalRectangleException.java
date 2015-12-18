package QuestionC;

import java.io.*;

public class IllegalRectangleException extends Exception{
	private double coordinate;
	   /**
	    * Create an instance of the InsufficientFundsException class, to be thrown to the caller
	    * @param amount
	    */
	   public IllegalRectangleException(double coordinate)
	   {
	      this.coordinate = coordinate;
	     
	   } 
	   public double getCoordinate()
	   {
	      return this.coordinate;
	   }
	   
		   
	   
}
   

