package com.cloudframe.app.init1.dto;

/**
*  The class CpduPrvCustAcct is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class CpduPrvCustAcct extends CpduPrvCustAcctSerialized { 
   

								@Getter @Setter private int cpduPrvCustIdNo;

								@Getter @Setter private int cpduPrvAcctNo;
	
	/**
	* Constructor for CpduPrvCustAcct
	**/
    public CpduPrvCustAcct() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for CpduPrvCustAcct. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CpduPrvCustAcct(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setCpduPrvCustIdNo(0);
								setCpduPrvAcctNo(0);
    } 

	/**
	 * 	initializes CpduPrvCustAcct
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setCpduPrvCustIdNo(0);
                     setCpduPrvAcctNo(0);
   }


}
  
