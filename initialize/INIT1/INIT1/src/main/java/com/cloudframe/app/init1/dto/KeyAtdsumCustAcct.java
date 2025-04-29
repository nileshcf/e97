package com.cloudframe.app.init1.dto;

/**
*  The class KeyAtdsumCustAcct is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:13. using version 5.0.0.257
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class KeyAtdsumCustAcct extends KeyAtdsumCustAcctSerialized { 
   

								private int atdsumCustIdNo;

								private int atdsumAcctNo;
	
	/**
	* Constructor for KeyAtdsumCustAcct
	**/
    public KeyAtdsumCustAcct() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for KeyAtdsumCustAcct. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public KeyAtdsumCustAcct(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setAtdsumCustIdNo(0);
								setAtdsumAcctNo(0);
    } 

	/**
	 *	Returns the value of atdsumCustIdNo
	 *	@return atdsumCustIdNo
	 */
	public int getAtdsumCustIdNo() throws CFException {
        if (isAtdsumCustIdNoModified()) { 
           atdsumCustIdNo = refreshAtdsumCustIdNo();
        }
   		return atdsumCustIdNo;
	}
	
	/**
	 * 	Update AtdsumCustIdNo with the passed value
	 *  Corresponding COBOL Variable is WS-ATDSUM-CUST-ID-NO
	 *	@param number
	 */
	public void setAtdsumCustIdNo(int number) {
	     // Truncate if the number is beyond +/- Max range
	    atdsumCustIdNo = checkAtdsumCustIdNoMaxLimit(number); 
		serializeAtdsumCustIdNo(atdsumCustIdNo);
	}


	public void setAtdsumCustIdNo(long number) {
	    number = checkAtdsumCustIdNoMaxLimit(number); // Truncate if value is beyond +/- Max range
		setAtdsumCustIdNo((int)number);
	}
	
	/**
	 *	Returns the value of atdsumAcctNo
	 *	@return atdsumAcctNo
	 */
	public int getAtdsumAcctNo() throws CFException {
        if (isAtdsumAcctNoModified()) { 
           atdsumAcctNo = refreshAtdsumAcctNo();
        }
   		return atdsumAcctNo;
	}
	
	/**
	 * 	Update AtdsumAcctNo with the passed value
	 *  Corresponding COBOL Variable is WS-ATDSUM-ACCT-NO
	 *	@param number
	 */
	public void setAtdsumAcctNo(int number) {
	     // Truncate if the number is beyond +/- Max range
	    atdsumAcctNo = checkAtdsumAcctNoMaxLimit(number); 
		serializeAtdsumAcctNo(atdsumAcctNo);
	}


	public void setAtdsumAcctNo(long number) {
	    number = checkAtdsumAcctNoMaxLimit(number); // Truncate if value is beyond +/- Max range
		setAtdsumAcctNo((int)number);
	}
	

	
	
	
	/**
	 * 	initializes KeyAtdsumCustAcct
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setAtdsumCustIdNo(0);
                     setAtdsumAcctNo(0);
   }

		public static int getKeyAtdsumCustAcctFieldLength() {
			return KEY_ATDSUM_CUST_ACCT_LENGTH;
		}

}
  
