package com.cloudframe.app.ms00d363.dto;

/**
*  The class X360FCurrentDate is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class X360FCurrentDate extends X360FCurrentDateSerialized { 
   

								private int x360FCurYy;

								private int x360FCurMm;

								private int x360FCurDd;
	
	/**
	* Constructor for X360FCurrentDate
	**/
    public X360FCurrentDate() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for X360FCurrentDate. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360FCurrentDate(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of x360FCurYy
	 *	@return x360FCurYy
	 */
	public int getX360FCurYy() throws CFException {
       if (isX360FCurYyModified()) { 
           x360FCurYy = refreshX360FCurYy();
        }
   		return x360FCurYy;
	}
	

	
	   
	/**
	 * 	Update X360FCurYy with the passed value
	 *  Corresponding COBOL Variable is X360-F-CUR-YY
	 *	@param number
	 */
	public void setX360FCurYy(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    x360FCurYy = checkX360FCurYyMaxLimit(number); 
		serializeX360FCurYy(x360FCurYy);
	}
	

	public void setX360FCurYy(long number) {
	    number = checkX360FCurYyMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360FCurYy((int)number);
	}
	
	/**
	 * 	Update X360FCurYy with the passed value
	 *	@param value (String or char[])
	 */
	public void setX360FCurYy(char[] value) throws CFException {
		 x360FCurYy = serializeX360FCurYy(value);
	}
	/**
	 * 	Update X360FCurYy with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setX360FCurYyString(char[] value) throws CFException {
		 setX360FCurYy(value);
	}
	/**
	 *	Returns the value of x360FCurMm
	 *	@return x360FCurMm
	 */
	public int getX360FCurMm() throws CFException {
       if (isX360FCurMmModified()) { 
           x360FCurMm = refreshX360FCurMm();
        }
   		return x360FCurMm;
	}
	

	
	   
	/**
	 * 	Update X360FCurMm with the passed value
	 *  Corresponding COBOL Variable is X360-F-CUR-MM
	 *	@param number
	 */
	public void setX360FCurMm(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    x360FCurMm = checkX360FCurMmMaxLimit(number); 
		serializeX360FCurMm(x360FCurMm);
	}
	

	public void setX360FCurMm(long number) {
	    number = checkX360FCurMmMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360FCurMm((int)number);
	}
	
	/**
	 * 	Update X360FCurMm with the passed value
	 *	@param value (String or char[])
	 */
	public void setX360FCurMm(char[] value) throws CFException {
		 x360FCurMm = serializeX360FCurMm(value);
	}
	/**
	 * 	Update X360FCurMm with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setX360FCurMmString(char[] value) throws CFException {
		 setX360FCurMm(value);
	}
	/**
	 *	Returns the value of x360FCurDd
	 *	@return x360FCurDd
	 */
	public int getX360FCurDd() throws CFException {
       if (isX360FCurDdModified()) { 
           x360FCurDd = refreshX360FCurDd();
        }
   		return x360FCurDd;
	}
	

	
	   
	/**
	 * 	Update X360FCurDd with the passed value
	 *  Corresponding COBOL Variable is X360-F-CUR-DD
	 *	@param number
	 */
	public void setX360FCurDd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    x360FCurDd = checkX360FCurDdMaxLimit(number); 
		serializeX360FCurDd(x360FCurDd);
	}
	

	public void setX360FCurDd(long number) {
	    number = checkX360FCurDdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360FCurDd((int)number);
	}
	
	/**
	 * 	Update X360FCurDd with the passed value
	 *	@param value (String or char[])
	 */
	public void setX360FCurDd(char[] value) throws CFException {
		 x360FCurDd = serializeX360FCurDd(value);
	}
	/**
	 * 	Update X360FCurDd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setX360FCurDdString(char[] value) throws CFException {
		 setX360FCurDd(value);
	}

	
	
	

		public static int getX360FCurrentDateFieldLength() {
			return X_360_FCURRENT_DATE_LENGTH;
		}

}
  
