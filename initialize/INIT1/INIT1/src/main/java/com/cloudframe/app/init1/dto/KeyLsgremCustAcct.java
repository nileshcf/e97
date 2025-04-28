package com.cloudframe.app.init1.dto;

/**
*  The class KeyLsgremCustAcct is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:52. using version 5.0.0.256
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class KeyLsgremCustAcct extends KeyLsgremCustAcctSerialized { 
   

								private int lsgremCustIdNo;

								private int lsgremAcctNo;
	
	/**
	* Constructor for KeyLsgremCustAcct
	**/
    public KeyLsgremCustAcct() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for KeyLsgremCustAcct. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public KeyLsgremCustAcct(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setLsgremCustIdNo(0);
								setLsgremAcctNo(0);
    } 

	/**
	 *	Returns the value of lsgremCustIdNo
	 *	@return lsgremCustIdNo
	 */
	public int getLsgremCustIdNo() throws CFException {
        if (isLsgremCustIdNoModified()) { 
           lsgremCustIdNo = refreshLsgremCustIdNo();
        }
   		return lsgremCustIdNo;
	}
	
	/**
	 * 	Update LsgremCustIdNo with the passed value
	 *  Corresponding COBOL Variable is WS-LSGREM-CUST-ID-NO
	 *	@param number
	 */
	public void setLsgremCustIdNo(int number) {
	     // Truncate if the number is beyond +/- Max range
	    lsgremCustIdNo = checkLsgremCustIdNoMaxLimit(number); 
		serializeLsgremCustIdNo(lsgremCustIdNo);
	}


	public void setLsgremCustIdNo(long number) {
	    number = checkLsgremCustIdNoMaxLimit(number); // Truncate if value is beyond +/- Max range
		setLsgremCustIdNo((int)number);
	}
	
	/**
	 *	Returns the value of lsgremAcctNo
	 *	@return lsgremAcctNo
	 */
	public int getLsgremAcctNo() throws CFException {
        if (isLsgremAcctNoModified()) { 
           lsgremAcctNo = refreshLsgremAcctNo();
        }
   		return lsgremAcctNo;
	}
	
	/**
	 * 	Update LsgremAcctNo with the passed value
	 *  Corresponding COBOL Variable is WS-LSGREM-ACCT-NO
	 *	@param number
	 */
	public void setLsgremAcctNo(int number) {
	     // Truncate if the number is beyond +/- Max range
	    lsgremAcctNo = checkLsgremAcctNoMaxLimit(number); 
		serializeLsgremAcctNo(lsgremAcctNo);
	}


	public void setLsgremAcctNo(long number) {
	    number = checkLsgremAcctNoMaxLimit(number); // Truncate if value is beyond +/- Max range
		setLsgremAcctNo((int)number);
	}
	

	
	
	
	/**
	 * 	initializes KeyLsgremCustAcct
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setLsgremCustIdNo(0);
                     setLsgremAcctNo(0);
   }

		public static int getKeyLsgremCustAcctFieldLength() {
			return KEY_LSGREM_CUST_ACCT_LENGTH;
		}

}
  
