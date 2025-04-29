package com.cloudframe.app.sf311010.dto;

/**
*  The class TransactionAmt1860 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


@Data
public class TransactionAmt1860 extends TransactionAmt1860Serialized { 
   

								@Getter @Setter private BigDecimal transactionAmt860 = BigDecimal.ZERO;
	
	/**
	* Constructor for TransactionAmt1860
	**/
    public TransactionAmt1860() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for TransactionAmt1860. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TransactionAmt1860(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
