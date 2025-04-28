package com.cloudframe.app.init1.dto;

/**
*  The class CmnDateValidR is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:55. using version 5.0.0.256
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CmnDateValidR extends CmnDateValidRSerialized { 
   

								private int cmnDateValidYyyy;

								private int cmnDateValidMm;

								private int cmnDateValidDd;
	
	/**
	* Constructor for CmnDateValidR
	**/
    public CmnDateValidR() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CmnDateValidR. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnDateValidR(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of cmnDateValidYyyy
	 *	@return cmnDateValidYyyy
	 */
	public int getCmnDateValidYyyy() throws CFException {
       if (isCmnDateValidYyyyModified()) { 
           cmnDateValidYyyy = refreshCmnDateValidYyyy();
        }
   		return cmnDateValidYyyy;
	}
	

	
	   
	/**
	 * 	Update CmnDateValidYyyy with the passed value
	 *  Corresponding COBOL Variable is CMN-DATE-VALID-YYYY
	 *	@param number
	 */
	public void setCmnDateValidYyyy(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    cmnDateValidYyyy = checkCmnDateValidYyyyMaxLimit(number); 
		serializeCmnDateValidYyyy(cmnDateValidYyyy);
	}
	

	public void setCmnDateValidYyyy(long number) {
	    number = checkCmnDateValidYyyyMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCmnDateValidYyyy((int)number);
	}
	
	/**
	 * 	Update CmnDateValidYyyy with the passed value
	 *	@param value (String or char[])
	 */
	public void setCmnDateValidYyyy(char[] value) throws CFException {
		 cmnDateValidYyyy = serializeCmnDateValidYyyy(value);
	}
	/**
	 * 	Update CmnDateValidYyyy with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCmnDateValidYyyyString(char[] value) throws CFException {
		 setCmnDateValidYyyy(value);
	}
	/**
	 *	Returns the value of cmnDateValidMm
	 *	@return cmnDateValidMm
	 */
	public int getCmnDateValidMm() throws CFException {
       if (isCmnDateValidMmModified()) { 
           cmnDateValidMm = refreshCmnDateValidMm();
        }
   		return cmnDateValidMm;
	}
	

	
	   
	/**
	 * 	Update CmnDateValidMm with the passed value
	 *  Corresponding COBOL Variable is CMN-DATE-VALID-MM
	 *	@param number
	 */
	public void setCmnDateValidMm(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    cmnDateValidMm = checkCmnDateValidMmMaxLimit(number); 
		serializeCmnDateValidMm(cmnDateValidMm);
	}
	

	public void setCmnDateValidMm(long number) {
	    number = checkCmnDateValidMmMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCmnDateValidMm((int)number);
	}
	
	/**
	 * 	Update CmnDateValidMm with the passed value
	 *	@param value (String or char[])
	 */
	public void setCmnDateValidMm(char[] value) throws CFException {
		 cmnDateValidMm = serializeCmnDateValidMm(value);
	}
	/**
	 * 	Update CmnDateValidMm with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCmnDateValidMmString(char[] value) throws CFException {
		 setCmnDateValidMm(value);
	}
	/**
	 *	Returns the value of cmnDateValidDd
	 *	@return cmnDateValidDd
	 */
	public int getCmnDateValidDd() throws CFException {
       if (isCmnDateValidDdModified()) { 
           cmnDateValidDd = refreshCmnDateValidDd();
        }
   		return cmnDateValidDd;
	}
	

	
	   
	/**
	 * 	Update CmnDateValidDd with the passed value
	 *  Corresponding COBOL Variable is CMN-DATE-VALID-DD
	 *	@param number
	 */
	public void setCmnDateValidDd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    cmnDateValidDd = checkCmnDateValidDdMaxLimit(number); 
		serializeCmnDateValidDd(cmnDateValidDd);
	}
	

	public void setCmnDateValidDd(long number) {
	    number = checkCmnDateValidDdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCmnDateValidDd((int)number);
	}
	
	/**
	 * 	Update CmnDateValidDd with the passed value
	 *	@param value (String or char[])
	 */
	public void setCmnDateValidDd(char[] value) throws CFException {
		 cmnDateValidDd = serializeCmnDateValidDd(value);
	}
	/**
	 * 	Update CmnDateValidDd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCmnDateValidDdString(char[] value) throws CFException {
		 setCmnDateValidDd(value);
	}

	
	
	

		public static int getCmnDateValidRFieldLength() {
			return CMN_DATE_VALID_R_LENGTH;
		}

}
  
