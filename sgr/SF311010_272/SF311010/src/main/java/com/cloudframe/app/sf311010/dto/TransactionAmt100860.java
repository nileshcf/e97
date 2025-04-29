package com.cloudframe.app.sf311010.dto;

/**
*  The class TransactionAmt100860 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


@Data
public class TransactionAmt100860 extends TransactionAmt100860Serialized { 
   

								@Getter @Setter private BigDecimal tranAmt100d860 = BigDecimal.ZERO;
	
	/**
	* Constructor for TransactionAmt100860
	**/
    public TransactionAmt100860() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for TransactionAmt100860. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TransactionAmt100860(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
