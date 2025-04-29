package com.cloudframe.app.init1.dto;

/**
*  The class KeyGlbCustAcct is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class KeyGlbCustAcct extends KeyGlbCustAcctSerialized { 
   

								@Getter @Setter private int glbCustIdNo;

								@Getter @Setter private int glbAcctNo;
	
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
	 * 	initializes KeyGlbCustAcct
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setGlbCustIdNo(0);
                     setGlbAcctNo(0);
   }


}
  
