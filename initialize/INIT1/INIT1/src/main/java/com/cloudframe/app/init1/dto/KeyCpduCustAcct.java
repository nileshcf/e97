package com.cloudframe.app.init1.dto;

/**
*  The class KeyCpduCustAcct is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class KeyCpduCustAcct extends KeyCpduCustAcctSerialized { 
   

								@Getter @Setter private int cpduCustIdNo;

								@Getter @Setter private int cpduAcctNo;
	
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
	 * 	initializes KeyCpduCustAcct
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setCpduCustIdNo(0);
                     setCpduAcctNo(0);
   }


}
  
