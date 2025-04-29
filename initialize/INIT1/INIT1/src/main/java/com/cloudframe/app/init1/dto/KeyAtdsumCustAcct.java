package com.cloudframe.app.init1.dto;

/**
*  The class KeyAtdsumCustAcct is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class KeyAtdsumCustAcct extends KeyAtdsumCustAcctSerialized { 
   

								@Getter @Setter private int atdsumCustIdNo;

								@Getter @Setter private int atdsumAcctNo;
	
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
	 * 	initializes KeyAtdsumCustAcct
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setAtdsumCustIdNo(0);
                     setAtdsumAcctNo(0);
   }


}
  
