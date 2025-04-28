package com.cloudframe.app.o529351u.dto;

/**
*  The class McrCheckTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:54. using version 5.0.0.256
**/


import com.cloudframe.app.o529351u.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


public class McrCheckTable extends McrCheckTableSerialized { 
   

								private int mcrLineNbr;

								private BigDecimal mcrLineCharge = BigDecimal.ZERO;
	
	/**
	* Constructor for McrCheckTable
	**/
    public McrCheckTable() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for McrCheckTable. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public McrCheckTable(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of mcrLineNbr
	 *	@return mcrLineNbr
	 */
	public int getMcrLineNbr() throws CFException {
       if (isMcrLineNbrModified()) { 
           mcrLineNbr = refreshMcrLineNbr();
        }
   		return mcrLineNbr;
	}
	

	
	   
	/**
	 * 	Update McrLineNbr with the passed value
	 *  Corresponding COBOL Variable is MCR-LINE-NBR
	 *	@param number
	 */
	public void setMcrLineNbr(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    mcrLineNbr = checkMcrLineNbrMaxLimit(number); 
		serializeMcrLineNbr(mcrLineNbr);
	}
	

	public void setMcrLineNbr(long number) {
	    number = checkMcrLineNbrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMcrLineNbr((int)number);
	}
	
	/**
	 * 	Update McrLineNbr with the passed value
	 *	@param value (String or char[])
	 */
	public void setMcrLineNbr(char[] value) throws CFException {
		 mcrLineNbr = serializeMcrLineNbr(value);
	}
	/**
	 * 	Update McrLineNbr with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMcrLineNbrString(char[] value) throws CFException {
		 setMcrLineNbr(value);
	}
	/**
	 *	Returns the value of mcrLineCharge
	 *	@return mcrLineCharge
	 */
	public BigDecimal getMcrLineCharge() throws CFException {
       if (isMcrLineChargeModified()) { 
           mcrLineCharge = refreshMcrLineCharge();
        }
   		return mcrLineCharge;
	}
	

    /**
	 *	Returns the String value of mcrLineCharge
	 *	@return mcrLineCharge
	 */
	public char[]  getMcrLineChargeActualString() {
	    String value = String.valueOf(mcrLineCharge).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update McrLineCharge with the passed number
	 *  Corresponding COBOL Variable is MCR-LINE-CHARGE
	 *	@param number
	 */
	public void setMcrLineCharge(BigDecimal number) {
       mcrLineCharge = checkMcrLineChargeMaxLimit(number);
	    serializeMcrLineCharge(mcrLineCharge);
   }
	/**
	 * 	Update McrLineCharge with the passed value
	 *	@param value (String or char[])
	 */
	public void setMcrLineCharge(char[] value) throws CFException {
		 mcrLineCharge = serializeMcrLineCharge(value);
	}   

	
	
	

		public static int getMcrCheckTableFieldLength() {
			return MCR_CHECK_TABLE_LENGTH;
		}

}
  
