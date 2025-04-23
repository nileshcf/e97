package com.cloudframe.app.mcissues.dto;

/**
*  The class Ip90354L1CtldataInd is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:11. using version 5.0.0.254
**/


import com.cloudframe.app.mcissues.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip90354L1CtldataInd extends Ip90354L1CtldataIndSerialized { 
   

								private int ip90354L1IndFld;
	
	/**
	* Constructor for Ip90354L1CtldataInd
	**/
    public Ip90354L1CtldataInd() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip90354L1CtldataInd. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip90354L1CtldataInd(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip90354L1IndFld
	 *	@return ip90354L1IndFld
	 */
	public int getIp90354L1IndFld() throws CFException {
        if (isIp90354L1IndFldModified()) { 
           ip90354L1IndFld = refreshIp90354L1IndFld();
        }
   		return ip90354L1IndFld;
	}
	
	/**
	 * 	Update Ip90354L1IndFld with the passed value
	 *  Corresponding COBOL Variable is IP90354-L1-IND-FLD
	 *	@param number
	 */
	public void setIp90354L1IndFld(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ip90354L1IndFld = checkIp90354L1IndFldMaxLimit(number); 
		serializeIp90354L1IndFld(ip90354L1IndFld);
	}


	public void setIp90354L1IndFld(long number) {
	    number = checkIp90354L1IndFldMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp90354L1IndFld((int)number);
	}
	

	
	
	

		public static int getIp90354L1CtldataIndFieldLength() {
			return IP_90354_L_1_CTLDATA_IND_LENGTH;
		}

}
  
