package com.cloudframe.app.ip809050.dto;

/**
*  The class TxnAmt1800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class TxnAmt1800 extends TxnAmt1800Serialized { 
   

						@Getter @Setter private char[] txnAmt800 = new char[10];


						@Getter @Setter private char[] txnAmtDec800 = new char[2];
	
	/**
	* Constructor for TxnAmt1800
	**/
    public TxnAmt1800() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for TxnAmt1800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TxnAmt1800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setTxnAmt800("0000000000".toCharArray());
       replaceValue( // serialize and save the value
             (".").toCharArray()
             , getStartOffset() + 10
             ,1
             );
								setTxnAmtDec800("00".toCharArray());
    } 



}
  
