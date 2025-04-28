package com.cloudframe.app.init1.dto;

/**
*  The class KeyLsbcaCustAcct is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:55. using version 5.0.0.256
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class KeyLsbcaCustAcct extends KeyLsbcaCustAcctSerialized { 
   

								private int lsbcaCustIdNo;

								private int lsbcaAcctNo;
	
	/**
	* Constructor for KeyLsbcaCustAcct
	**/
    public KeyLsbcaCustAcct() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for KeyLsbcaCustAcct. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public KeyLsbcaCustAcct(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setLsbcaCustIdNo(0);
								setLsbcaAcctNo(0);
    } 

	/**
	 *	Returns the value of lsbcaCustIdNo
	 *	@return lsbcaCustIdNo
	 */
	public int getLsbcaCustIdNo() throws CFException {
        if (isLsbcaCustIdNoModified()) { 
           lsbcaCustIdNo = refreshLsbcaCustIdNo();
        }
   		return lsbcaCustIdNo;
	}
	
	/**
	 * 	Update LsbcaCustIdNo with the passed value
	 *  Corresponding COBOL Variable is WS-LSBCA-CUST-ID-NO
	 *	@param number
	 */
	public void setLsbcaCustIdNo(int number) {
	     // Truncate if the number is beyond +/- Max range
	    lsbcaCustIdNo = checkLsbcaCustIdNoMaxLimit(number); 
		serializeLsbcaCustIdNo(lsbcaCustIdNo);
	}


	public void setLsbcaCustIdNo(long number) {
	    number = checkLsbcaCustIdNoMaxLimit(number); // Truncate if value is beyond +/- Max range
		setLsbcaCustIdNo((int)number);
	}
	
	/**
	 *	Returns the value of lsbcaAcctNo
	 *	@return lsbcaAcctNo
	 */
	public int getLsbcaAcctNo() throws CFException {
        if (isLsbcaAcctNoModified()) { 
           lsbcaAcctNo = refreshLsbcaAcctNo();
        }
   		return lsbcaAcctNo;
	}
	
	/**
	 * 	Update LsbcaAcctNo with the passed value
	 *  Corresponding COBOL Variable is WS-LSBCA-ACCT-NO
	 *	@param number
	 */
	public void setLsbcaAcctNo(int number) {
	     // Truncate if the number is beyond +/- Max range
	    lsbcaAcctNo = checkLsbcaAcctNoMaxLimit(number); 
		serializeLsbcaAcctNo(lsbcaAcctNo);
	}


	public void setLsbcaAcctNo(long number) {
	    number = checkLsbcaAcctNoMaxLimit(number); // Truncate if value is beyond +/- Max range
		setLsbcaAcctNo((int)number);
	}
	

	
	
	
	/**
	 * 	initializes KeyLsbcaCustAcct
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setLsbcaCustIdNo(0);
                     setLsbcaAcctNo(0);
   }

		public static int getKeyLsbcaCustAcctFieldLength() {
			return KEY_LSBCA_CUST_ACCT_LENGTH;
		}

}
  
