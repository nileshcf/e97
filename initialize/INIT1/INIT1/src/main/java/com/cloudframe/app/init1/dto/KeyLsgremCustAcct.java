package com.cloudframe.app.init1.dto;

/**
*  The class KeyLsgremCustAcct is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class KeyLsgremCustAcct extends KeyLsgremCustAcctSerialized { 
   

								@Getter @Setter private int lsgremCustIdNo;

								@Getter @Setter private int lsgremAcctNo;
	
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
	 * 	initializes KeyLsgremCustAcct
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setLsgremCustIdNo(0);
                     setLsgremAcctNo(0);
   }


}
  
