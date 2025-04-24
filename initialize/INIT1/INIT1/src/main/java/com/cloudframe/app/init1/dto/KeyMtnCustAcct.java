package com.cloudframe.app.init1.dto;

/**
*  The class KeyMtnCustAcct is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:30. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class KeyMtnCustAcct extends KeyMtnCustAcctSerialized { 
   

								private int keyMtnCustIdNo;

								private int keyMtnAcctNo;
	
	/**
	* Constructor for KeyMtnCustAcct
	**/
    public KeyMtnCustAcct() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for KeyMtnCustAcct. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public KeyMtnCustAcct(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setKeyMtnCustIdNo(0);
								setKeyMtnAcctNo(0);
    } 

	/**
	 *	Returns the value of keyMtnCustIdNo
	 *	@return keyMtnCustIdNo
	 */
	public int getKeyMtnCustIdNo() throws CFException {
        if (isKeyMtnCustIdNoModified()) { 
           keyMtnCustIdNo = refreshKeyMtnCustIdNo();
        }
   		return keyMtnCustIdNo;
	}
	
	/**
	 * 	Update KeyMtnCustIdNo with the passed value
	 *  Corresponding COBOL Variable is WS-KEY-MTN-CUST-ID-NO
	 *	@param number
	 */
	public void setKeyMtnCustIdNo(int number) {
	     // Truncate if the number is beyond +/- Max range
	    keyMtnCustIdNo = checkKeyMtnCustIdNoMaxLimit(number); 
		serializeKeyMtnCustIdNo(keyMtnCustIdNo);
	}


	public void setKeyMtnCustIdNo(long number) {
	    number = checkKeyMtnCustIdNoMaxLimit(number); // Truncate if value is beyond +/- Max range
		setKeyMtnCustIdNo((int)number);
	}
	
	/**
	 *	Returns the value of keyMtnAcctNo
	 *	@return keyMtnAcctNo
	 */
	public int getKeyMtnAcctNo() throws CFException {
        if (isKeyMtnAcctNoModified()) { 
           keyMtnAcctNo = refreshKeyMtnAcctNo();
        }
   		return keyMtnAcctNo;
	}
	
	/**
	 * 	Update KeyMtnAcctNo with the passed value
	 *  Corresponding COBOL Variable is WS-KEY-MTN-ACCT-NO
	 *	@param number
	 */
	public void setKeyMtnAcctNo(int number) {
	     // Truncate if the number is beyond +/- Max range
	    keyMtnAcctNo = checkKeyMtnAcctNoMaxLimit(number); 
		serializeKeyMtnAcctNo(keyMtnAcctNo);
	}


	public void setKeyMtnAcctNo(long number) {
	    number = checkKeyMtnAcctNoMaxLimit(number); // Truncate if value is beyond +/- Max range
		setKeyMtnAcctNo((int)number);
	}
	

	
	
	
	/**
	 * 	initializes KeyMtnCustAcct
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setKeyMtnCustIdNo(0);
                     setKeyMtnAcctNo(0);
   }

		public static int getKeyMtnCustAcctFieldLength() {
			return KEY_MTN_CUST_ACCT_LENGTH;
		}

}
  
