package com.cloudframe.app.init1.dto;

/**
*  The class CpduPrvCustAcct is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:18. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CpduPrvCustAcct extends CpduPrvCustAcctSerialized { 
   

								private int cpduPrvCustIdNo;

								private int cpduPrvAcctNo;
	
	/**
	* Constructor for CpduPrvCustAcct
	**/
    public CpduPrvCustAcct() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CpduPrvCustAcct. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CpduPrvCustAcct(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setCpduPrvCustIdNo(0);
								setCpduPrvAcctNo(0);
    } 

	/**
	 *	Returns the value of cpduPrvCustIdNo
	 *	@return cpduPrvCustIdNo
	 */
	public int getCpduPrvCustIdNo() throws CFException {
        if (isCpduPrvCustIdNoModified()) { 
           cpduPrvCustIdNo = refreshCpduPrvCustIdNo();
        }
   		return cpduPrvCustIdNo;
	}
	
	/**
	 * 	Update CpduPrvCustIdNo with the passed value
	 *  Corresponding COBOL Variable is WS-CPDU-PRV-CUST-ID-NO
	 *	@param number
	 */
	public void setCpduPrvCustIdNo(int number) {
	     // Truncate if the number is beyond +/- Max range
	    cpduPrvCustIdNo = checkCpduPrvCustIdNoMaxLimit(number); 
		serializeCpduPrvCustIdNo(cpduPrvCustIdNo);
	}


	public void setCpduPrvCustIdNo(long number) {
	    number = checkCpduPrvCustIdNoMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCpduPrvCustIdNo((int)number);
	}
	
	/**
	 *	Returns the value of cpduPrvAcctNo
	 *	@return cpduPrvAcctNo
	 */
	public int getCpduPrvAcctNo() throws CFException {
        if (isCpduPrvAcctNoModified()) { 
           cpduPrvAcctNo = refreshCpduPrvAcctNo();
        }
   		return cpduPrvAcctNo;
	}
	
	/**
	 * 	Update CpduPrvAcctNo with the passed value
	 *  Corresponding COBOL Variable is WS-CPDU-PRV-ACCT-NO
	 *	@param number
	 */
	public void setCpduPrvAcctNo(int number) {
	     // Truncate if the number is beyond +/- Max range
	    cpduPrvAcctNo = checkCpduPrvAcctNoMaxLimit(number); 
		serializeCpduPrvAcctNo(cpduPrvAcctNo);
	}


	public void setCpduPrvAcctNo(long number) {
	    number = checkCpduPrvAcctNoMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCpduPrvAcctNo((int)number);
	}
	

	
	
	
	/**
	 * 	initializes CpduPrvCustAcct
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setCpduPrvCustIdNo(0);
                     setCpduPrvAcctNo(0);
   }

		public static int getCpduPrvCustAcctFieldLength() {
			return CPDU_PRV_CUST_ACCT_LENGTH;
		}

}
  
