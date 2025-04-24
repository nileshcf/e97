package com.cloudframe.app.divide0.dto;

/**
*  The class DaTblEntries is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:44. using version 5.0.0.254
**/


import com.cloudframe.app.divide0.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


public class DaTblEntries extends DaTblEntriesSerialized { 
   

								private BigDecimal daPercent = BigDecimal.ZERO;
	
	/**
	* Constructor for DaTblEntries
	**/
    public DaTblEntries() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for DaTblEntries. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DaTblEntries(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of daPercent
	 *	@return daPercent
	 */
	public BigDecimal getDaPercent() throws CFException {
       if (isDaPercentModified()) { 
           daPercent = refreshDaPercent();
        }
   		return daPercent;
	}
	

	
	   
	/**
	 * 	Update DaPercent with the passed number
	 *  Corresponding COBOL Variable is DA-PERCENT
	 *	@param number
	 */
	public void setDaPercent(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       daPercent = checkDaPercentMaxLimit(number);
	    serializeDaPercent(daPercent);
   }
	/**
	 * 	Update DaPercent with the passed value
	 *	@param value (String or char[])
	 */
	public void setDaPercent(char[] value) throws CFException {
		 daPercent = serializeDaPercent(value);
	}   

	
	
	

		public static int getDaTblEntriesFieldLength() {
			return DA_TBL_ENTRIES_LENGTH;
		}

}
  
