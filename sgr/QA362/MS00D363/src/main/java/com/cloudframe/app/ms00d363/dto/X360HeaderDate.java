package com.cloudframe.app.ms00d363.dto;

/**
*  The class X360HeaderDate is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class X360HeaderDate extends X360HeaderDateSerialized { 
   

								private int x360HeaderDateYy;

								private int x360HeaderDateMm;

								private int x360HeaderDateDd;
	
	/**
	* Constructor for X360HeaderDate
	**/
    public X360HeaderDate() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for X360HeaderDate. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360HeaderDate(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of x360HeaderDateYy
	 *	@return x360HeaderDateYy
	 */
	public int getX360HeaderDateYy() throws CFException {
       if (isX360HeaderDateYyModified()) { 
           x360HeaderDateYy = refreshX360HeaderDateYy();
        }
   		return x360HeaderDateYy;
	}
	

	
	   
	/**
	 * 	Update X360HeaderDateYy with the passed value
	 *  Corresponding COBOL Variable is X360-HEADER-DATE-YY
	 *	@param number
	 */
	public void setX360HeaderDateYy(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    x360HeaderDateYy = checkX360HeaderDateYyMaxLimit(number); 
		serializeX360HeaderDateYy(x360HeaderDateYy);
	}
	

	public void setX360HeaderDateYy(long number) {
	    number = checkX360HeaderDateYyMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360HeaderDateYy((int)number);
	}
	
	/**
	 * 	Update X360HeaderDateYy with the passed value
	 *	@param value (String or char[])
	 */
	public void setX360HeaderDateYy(char[] value) throws CFException {
		 x360HeaderDateYy = serializeX360HeaderDateYy(value);
	}
	/**
	 * 	Update X360HeaderDateYy with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setX360HeaderDateYyString(char[] value) throws CFException {
		 setX360HeaderDateYy(value);
	}
	/**
	 *	Returns the value of x360HeaderDateMm
	 *	@return x360HeaderDateMm
	 */
	public int getX360HeaderDateMm() throws CFException {
       if (isX360HeaderDateMmModified()) { 
           x360HeaderDateMm = refreshX360HeaderDateMm();
        }
   		return x360HeaderDateMm;
	}
	

	
	   
	/**
	 * 	Update X360HeaderDateMm with the passed value
	 *  Corresponding COBOL Variable is X360-HEADER-DATE-MM
	 *	@param number
	 */
	public void setX360HeaderDateMm(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    x360HeaderDateMm = checkX360HeaderDateMmMaxLimit(number); 
		serializeX360HeaderDateMm(x360HeaderDateMm);
	}
	

	public void setX360HeaderDateMm(long number) {
	    number = checkX360HeaderDateMmMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360HeaderDateMm((int)number);
	}
	
	/**
	 * 	Update X360HeaderDateMm with the passed value
	 *	@param value (String or char[])
	 */
	public void setX360HeaderDateMm(char[] value) throws CFException {
		 x360HeaderDateMm = serializeX360HeaderDateMm(value);
	}
	/**
	 * 	Update X360HeaderDateMm with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setX360HeaderDateMmString(char[] value) throws CFException {
		 setX360HeaderDateMm(value);
	}
	/**
	 *	Returns the value of x360HeaderDateDd
	 *	@return x360HeaderDateDd
	 */
	public int getX360HeaderDateDd() throws CFException {
       if (isX360HeaderDateDdModified()) { 
           x360HeaderDateDd = refreshX360HeaderDateDd();
        }
   		return x360HeaderDateDd;
	}
	

	
	   
	/**
	 * 	Update X360HeaderDateDd with the passed value
	 *  Corresponding COBOL Variable is X360-HEADER-DATE-DD
	 *	@param number
	 */
	public void setX360HeaderDateDd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    x360HeaderDateDd = checkX360HeaderDateDdMaxLimit(number); 
		serializeX360HeaderDateDd(x360HeaderDateDd);
	}
	

	public void setX360HeaderDateDd(long number) {
	    number = checkX360HeaderDateDdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360HeaderDateDd((int)number);
	}
	
	/**
	 * 	Update X360HeaderDateDd with the passed value
	 *	@param value (String or char[])
	 */
	public void setX360HeaderDateDd(char[] value) throws CFException {
		 x360HeaderDateDd = serializeX360HeaderDateDd(value);
	}
	/**
	 * 	Update X360HeaderDateDd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setX360HeaderDateDdString(char[] value) throws CFException {
		 setX360HeaderDateDd(value);
	}

	
	
	
	/**
	 * 	initializes X360HeaderDate
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setX360HeaderDateYy(0);
                     setX360HeaderDateMm(0);
                     setX360HeaderDateDd(0);
   }

		public static int getX360HeaderDateFieldLength() {
			return X_360_HEADER_DATE_LENGTH;
		}

}
  
