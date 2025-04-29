package com.cloudframe.app.init1.dto;

/**
*  The class KeyUsgCustAcct is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class KeyUsgCustAcct extends KeyUsgCustAcctSerialized { 
   

								@Getter @Setter private int usgCustIdNo;

								@Getter @Setter private int usgAcctNo;
	
	/**
	* Constructor for KeyUsgCustAcct
	**/
    public KeyUsgCustAcct() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for KeyUsgCustAcct. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public KeyUsgCustAcct(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setUsgCustIdNo(0);
								setUsgAcctNo(0);
    } 

	/**
	 * 	initializes KeyUsgCustAcct
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setUsgCustIdNo(0);
                     setUsgAcctNo(0);
   }


}
  
