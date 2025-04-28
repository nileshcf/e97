package com.cloudframe.app.ms00d363.dto;

/**
*  The class X360FCurrentDateFil is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:06. using version 5.0.0.256
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class X360FCurrentDateFil extends X360FCurrentDateFilSerialized { 
   

								private int x360FCurYyFil;

								private int x360FCurMmFil;

								private int x360FCurDdFil;
	
	/**
	* Constructor for X360FCurrentDateFil
	**/
    public X360FCurrentDateFil() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for X360FCurrentDateFil. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360FCurrentDateFil(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of x360FCurYyFil
	 *	@return x360FCurYyFil
	 */
	public int getX360FCurYyFil() throws CFException {
       if (isX360FCurYyFilModified()) { 
           x360FCurYyFil = refreshX360FCurYyFil();
        }
   		return x360FCurYyFil;
	}
	

	
	   
	/**
	 * 	Update X360FCurYyFil with the passed value
	 *  Corresponding COBOL Variable is X360-F-CUR-YY-FIL
	 *	@param number
	 */
	public void setX360FCurYyFil(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    x360FCurYyFil = checkX360FCurYyFilMaxLimit(number); 
		serializeX360FCurYyFil(x360FCurYyFil);
	}
	

	public void setX360FCurYyFil(long number) {
	    number = checkX360FCurYyFilMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360FCurYyFil((int)number);
	}
	
	/**
	 * 	Update X360FCurYyFil with the passed value
	 *	@param value (String or char[])
	 */
	public void setX360FCurYyFil(char[] value) throws CFException {
		 x360FCurYyFil = serializeX360FCurYyFil(value);
	}
	/**
	 * 	Update X360FCurYyFil with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setX360FCurYyFilString(char[] value) throws CFException {
		 setX360FCurYyFil(value);
	}
	/**
	 *	Returns the value of x360FCurMmFil
	 *	@return x360FCurMmFil
	 */
	public int getX360FCurMmFil() throws CFException {
       if (isX360FCurMmFilModified()) { 
           x360FCurMmFil = refreshX360FCurMmFil();
        }
   		return x360FCurMmFil;
	}
	

	
	   
	/**
	 * 	Update X360FCurMmFil with the passed value
	 *  Corresponding COBOL Variable is X360-F-CUR-MM-FIL
	 *	@param number
	 */
	public void setX360FCurMmFil(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    x360FCurMmFil = checkX360FCurMmFilMaxLimit(number); 
		serializeX360FCurMmFil(x360FCurMmFil);
	}
	

	public void setX360FCurMmFil(long number) {
	    number = checkX360FCurMmFilMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360FCurMmFil((int)number);
	}
	
	/**
	 * 	Update X360FCurMmFil with the passed value
	 *	@param value (String or char[])
	 */
	public void setX360FCurMmFil(char[] value) throws CFException {
		 x360FCurMmFil = serializeX360FCurMmFil(value);
	}
	/**
	 * 	Update X360FCurMmFil with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setX360FCurMmFilString(char[] value) throws CFException {
		 setX360FCurMmFil(value);
	}
	/**
	 *	Returns the value of x360FCurDdFil
	 *	@return x360FCurDdFil
	 */
	public int getX360FCurDdFil() throws CFException {
       if (isX360FCurDdFilModified()) { 
           x360FCurDdFil = refreshX360FCurDdFil();
        }
   		return x360FCurDdFil;
	}
	

	
	   
	/**
	 * 	Update X360FCurDdFil with the passed value
	 *  Corresponding COBOL Variable is X360-F-CUR-DD-FIL
	 *	@param number
	 */
	public void setX360FCurDdFil(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    x360FCurDdFil = checkX360FCurDdFilMaxLimit(number); 
		serializeX360FCurDdFil(x360FCurDdFil);
	}
	

	public void setX360FCurDdFil(long number) {
	    number = checkX360FCurDdFilMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360FCurDdFil((int)number);
	}
	
	/**
	 * 	Update X360FCurDdFil with the passed value
	 *	@param value (String or char[])
	 */
	public void setX360FCurDdFil(char[] value) throws CFException {
		 x360FCurDdFil = serializeX360FCurDdFil(value);
	}
	/**
	 * 	Update X360FCurDdFil with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setX360FCurDdFilString(char[] value) throws CFException {
		 setX360FCurDdFil(value);
	}

	
	
	

		public static int getX360FCurrentDateFilFieldLength() {
			return X_360_FCURRENT_DATE_FIL_LENGTH;
		}

}
  
