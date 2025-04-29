package com.cloudframe.app.init1.dto;

/**
*  The class KeyInvCustAcct is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class KeyInvCustAcct extends KeyInvCustAcctSerialized { 
   

								@Getter @Setter private int invCustIdNo;

								@Getter @Setter private int invAcctNo;
	
	/**
	* Constructor for KeyInvCustAcct
	**/
    public KeyInvCustAcct() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for KeyInvCustAcct. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public KeyInvCustAcct(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setInvCustIdNo(0);
								setInvAcctNo(0);
    } 

	/**
	 * 	initializes KeyInvCustAcct
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setInvCustIdNo(0);
                     setInvAcctNo(0);
   }


}
  
