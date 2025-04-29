package com.cloudframe.app.init1.dto;

/**
*  The class KeyMtnCustAcct is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class KeyMtnCustAcct extends KeyMtnCustAcctSerialized { 
   

								@Getter @Setter private int keyMtnCustIdNo;

								@Getter @Setter private int keyMtnAcctNo;
	
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
	 * 	initializes KeyMtnCustAcct
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setKeyMtnCustIdNo(0);
                     setKeyMtnAcctNo(0);
   }


}
  
