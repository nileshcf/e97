package com.cloudframe.app.init1.dto;

/**
*  The class KeyGlbCustAcct is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:30. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class KeyGlbCustAcct extends KeyGlbCustAcctSerialized { 
   

								private int glbCustIdNo;

								private int glbAcctNo;
	
	/**
	* Constructor for KeyGlbCustAcct
	**/
    public KeyGlbCustAcct() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for KeyGlbCustAcct. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public KeyGlbCustAcct(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setGlbCustIdNo(0);
								setGlbAcctNo(0);
    } 

	/**
	 *	Returns the value of glbCustIdNo
	 *	@return glbCustIdNo
	 */
	public int getGlbCustIdNo() throws CFException {
        if (isGlbCustIdNoModified()) { 
           glbCustIdNo = refreshGlbCustIdNo();
        }
   		return glbCustIdNo;
	}
	
	/**
	 * 	Update GlbCustIdNo with the passed value
	 *  Corresponding COBOL Variable is WS-GLB-CUST-ID-NO
	 *	@param number
	 */
	public void setGlbCustIdNo(int number) {
	     // Truncate if the number is beyond +/- Max range
	    glbCustIdNo = checkGlbCustIdNoMaxLimit(number); 
		serializeGlbCustIdNo(glbCustIdNo);
	}


	public void setGlbCustIdNo(long number) {
	    number = checkGlbCustIdNoMaxLimit(number); // Truncate if value is beyond +/- Max range
		setGlbCustIdNo((int)number);
	}
	
	/**
	 *	Returns the value of glbAcctNo
	 *	@return glbAcctNo
	 */
	public int getGlbAcctNo() throws CFException {
        if (isGlbAcctNoModified()) { 
           glbAcctNo = refreshGlbAcctNo();
        }
   		return glbAcctNo;
	}
	
	/**
	 * 	Update GlbAcctNo with the passed value
	 *  Corresponding COBOL Variable is WS-GLB-ACCT-NO
	 *	@param number
	 */
	public void setGlbAcctNo(int number) {
	     // Truncate if the number is beyond +/- Max range
	    glbAcctNo = checkGlbAcctNoMaxLimit(number); 
		serializeGlbAcctNo(glbAcctNo);
	}


	public void setGlbAcctNo(long number) {
	    number = checkGlbAcctNoMaxLimit(number); // Truncate if value is beyond +/- Max range
		setGlbAcctNo((int)number);
	}
	

	
	
	
	/**
	 * 	initializes KeyGlbCustAcct
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setGlbCustIdNo(0);
                     setGlbAcctNo(0);
   }

		public static int getKeyGlbCustAcctFieldLength() {
			return KEY_GLB_CUST_ACCT_LENGTH;
		}

}
  
