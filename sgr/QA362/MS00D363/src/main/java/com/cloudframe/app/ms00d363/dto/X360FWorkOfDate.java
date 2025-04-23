package com.cloudframe.app.ms00d363.dto;

/**
*  The class X360FWorkOfDate is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:32. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class X360FWorkOfDate extends X360FWorkOfDateSerialized { 
   

								private int x360FWoYy;

								private int x360FWoMm;

								private int x360FWoDd;
	
	/**
	* Constructor for X360FWorkOfDate
	**/
    public X360FWorkOfDate() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for X360FWorkOfDate. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360FWorkOfDate(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of x360FWoYy
	 *	@return x360FWoYy
	 */
	public int getX360FWoYy() throws CFException {
       if (isX360FWoYyModified()) { 
           x360FWoYy = refreshX360FWoYy();
        }
   		return x360FWoYy;
	}
	

	
	   
	/**
	 * 	Update X360FWoYy with the passed value
	 *  Corresponding COBOL Variable is X360-F-WO-YY
	 *	@param number
	 */
	public void setX360FWoYy(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    x360FWoYy = checkX360FWoYyMaxLimit(number); 
		serializeX360FWoYy(x360FWoYy);
	}
	

	public void setX360FWoYy(long number) {
	    number = checkX360FWoYyMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360FWoYy((int)number);
	}
	
	/**
	 * 	Update X360FWoYy with the passed value
	 *	@param value (String or char[])
	 */
	public void setX360FWoYy(char[] value) throws CFException {
		 x360FWoYy = serializeX360FWoYy(value);
	}
	/**
	 * 	Update X360FWoYy with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setX360FWoYyString(char[] value) throws CFException {
		 setX360FWoYy(value);
	}
	/**
	 *	Returns the value of x360FWoMm
	 *	@return x360FWoMm
	 */
	public int getX360FWoMm() throws CFException {
       if (isX360FWoMmModified()) { 
           x360FWoMm = refreshX360FWoMm();
        }
   		return x360FWoMm;
	}
	

	
	   
	/**
	 * 	Update X360FWoMm with the passed value
	 *  Corresponding COBOL Variable is X360-F-WO-MM
	 *	@param number
	 */
	public void setX360FWoMm(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    x360FWoMm = checkX360FWoMmMaxLimit(number); 
		serializeX360FWoMm(x360FWoMm);
	}
	

	public void setX360FWoMm(long number) {
	    number = checkX360FWoMmMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360FWoMm((int)number);
	}
	
	/**
	 * 	Update X360FWoMm with the passed value
	 *	@param value (String or char[])
	 */
	public void setX360FWoMm(char[] value) throws CFException {
		 x360FWoMm = serializeX360FWoMm(value);
	}
	/**
	 * 	Update X360FWoMm with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setX360FWoMmString(char[] value) throws CFException {
		 setX360FWoMm(value);
	}
	/**
	 *	Returns the value of x360FWoDd
	 *	@return x360FWoDd
	 */
	public int getX360FWoDd() throws CFException {
       if (isX360FWoDdModified()) { 
           x360FWoDd = refreshX360FWoDd();
        }
   		return x360FWoDd;
	}
	

	
	   
	/**
	 * 	Update X360FWoDd with the passed value
	 *  Corresponding COBOL Variable is X360-F-WO-DD
	 *	@param number
	 */
	public void setX360FWoDd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    x360FWoDd = checkX360FWoDdMaxLimit(number); 
		serializeX360FWoDd(x360FWoDd);
	}
	

	public void setX360FWoDd(long number) {
	    number = checkX360FWoDdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360FWoDd((int)number);
	}
	
	/**
	 * 	Update X360FWoDd with the passed value
	 *	@param value (String or char[])
	 */
	public void setX360FWoDd(char[] value) throws CFException {
		 x360FWoDd = serializeX360FWoDd(value);
	}
	/**
	 * 	Update X360FWoDd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setX360FWoDdString(char[] value) throws CFException {
		 setX360FWoDd(value);
	}

	
	
	

		public static int getX360FWorkOfDateFieldLength() {
			return X_360_FWORK_OF_DATE_LENGTH;
		}

}
  
