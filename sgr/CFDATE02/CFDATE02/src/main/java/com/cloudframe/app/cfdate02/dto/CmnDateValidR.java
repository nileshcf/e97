package com.cloudframe.app.cfdate02.dto;

/**
*  The class CmnDateValidR is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:06. using version 5.0.0.256
**/


import com.cloudframe.app.cfdate02.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CmnDateValidR extends CmnDateValidRSerialized { 
   

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
  
