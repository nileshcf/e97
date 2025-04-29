package com.cloudframe.app.init1.dto;

/**
*  The class KeyLsbcaCustAcct is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class KeyLsbcaCustAcct extends KeyLsbcaCustAcctSerialized { 
   

								@Getter @Setter private int lsbcaCustIdNo;

								@Getter @Setter private int lsbcaAcctNo;
	
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
	 * 	initializes KeyLsbcaCustAcct
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setLsbcaCustIdNo(0);
                     setLsbcaAcctNo(0);
   }


}
  
