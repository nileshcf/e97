package com.cloudframe.app.init1.dto;

/**
*  The class ErrCustAcct is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class ErrCustAcct extends ErrCustAcctSerialized { 
   

								@Getter @Setter private int errCustIdNo;

								@Getter @Setter private int errAcctNo;
	
	/**
	* Constructor for ErrCustAcct
	**/
    public ErrCustAcct() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for ErrCustAcct. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ErrCustAcct(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setErrCustIdNo(0);
								setErrAcctNo(0);
    } 

	/**
	 * 	initializes ErrCustAcct
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setErrCustIdNo(0);
                     setErrAcctNo(0);
   }


}
  
