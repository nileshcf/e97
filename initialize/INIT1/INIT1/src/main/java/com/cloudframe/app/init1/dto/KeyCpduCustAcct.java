package com.cloudframe.app.init1.dto;

/**
*  The class KeyCpduCustAcct is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:22. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class KeyCpduCustAcct extends KeyCpduCustAcctSerialized { 
   

								private int cpduCustIdNo;

								private int cpduAcctNo;
	
	/**
	* Constructor for KeyCpduCustAcct
	**/
    public KeyCpduCustAcct() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for KeyCpduCustAcct. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public KeyCpduCustAcct(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setCpduCustIdNo(0);
								setCpduAcctNo(0);
    } 

	/**
	 *	Returns the value of cpduCustIdNo
	 *	@return cpduCustIdNo
	 */
	public int getCpduCustIdNo() throws CFException {
        if (isCpduCustIdNoModified()) { 
           cpduCustIdNo = refreshCpduCustIdNo();
        }
   		return cpduCustIdNo;
	}
	
	/**
	 * 	Update CpduCustIdNo with the passed value
	 *  Corresponding COBOL Variable is WS-CPDU-CUST-ID-NO
	 *	@param number
	 */
	public void setCpduCustIdNo(int number) {
	     // Truncate if the number is beyond +/- Max range
	    cpduCustIdNo = checkCpduCustIdNoMaxLimit(number); 
		serializeCpduCustIdNo(cpduCustIdNo);
	}


	public void setCpduCustIdNo(long number) {
	    number = checkCpduCustIdNoMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCpduCustIdNo((int)number);
	}
	
	/**
	 *	Returns the value of cpduAcctNo
	 *	@return cpduAcctNo
	 */
	public int getCpduAcctNo() throws CFException {
        if (isCpduAcctNoModified()) { 
           cpduAcctNo = refreshCpduAcctNo();
        }
   		return cpduAcctNo;
	}
	
	/**
	 * 	Update CpduAcctNo with the passed value
	 *  Corresponding COBOL Variable is WS-CPDU-ACCT-NO
	 *	@param number
	 */
	public void setCpduAcctNo(int number) {
	     // Truncate if the number is beyond +/- Max range
	    cpduAcctNo = checkCpduAcctNoMaxLimit(number); 
		serializeCpduAcctNo(cpduAcctNo);
	}


	public void setCpduAcctNo(long number) {
	    number = checkCpduAcctNoMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCpduAcctNo((int)number);
	}
	

	
	
	
	/**
	 * 	initializes KeyCpduCustAcct
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setCpduCustIdNo(0);
                     setCpduAcctNo(0);
   }

		public static int getKeyCpduCustAcctFieldLength() {
			return KEY_CPDU_CUST_ACCT_LENGTH;
		}

}
  
