package com.cloudframe.app.o529351u.dto;

/**
*  The class FesrIpaCode is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:54. using version 5.0.0.256
**/


import com.cloudframe.app.o529351u.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class FesrIpaCode extends FesrIpaCodeSerialized { 
   

								private int fesrIpaCd;
	
	/**
	* Constructor for FesrIpaCode
	**/
    public FesrIpaCode() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for FesrIpaCode. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FesrIpaCode(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of fesrIpaCd
	 *	@return fesrIpaCd
	 */
	public int getFesrIpaCd() throws CFException {
       if (isFesrIpaCdModified()) { 
           fesrIpaCd = refreshFesrIpaCd();
        }
   		return fesrIpaCd;
	}
	

	
	   
	/**
	 * 	Update FesrIpaCd with the passed value
	 *  Corresponding COBOL Variable is FESR-IPA-CD
	 *	@param number
	 */
	public void setFesrIpaCd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    fesrIpaCd = checkFesrIpaCdMaxLimit(number); 
		serializeFesrIpaCd(fesrIpaCd);
	}
	

	public void setFesrIpaCd(long number) {
	    number = checkFesrIpaCdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setFesrIpaCd((int)number);
	}
	
	/**
	 * 	Update FesrIpaCd with the passed value
	 *	@param value (String or char[])
	 */
	public void setFesrIpaCd(char[] value) throws CFException {
		 fesrIpaCd = serializeFesrIpaCd(value);
	}
	/**
	 * 	Update FesrIpaCd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setFesrIpaCdString(char[] value) throws CFException {
		 setFesrIpaCd(value);
	}

	
	
	

		public static int getFesrIpaCodeFieldLength() {
			return FESR_IPA_CODE_LENGTH;
		}

}
  
