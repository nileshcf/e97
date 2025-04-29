package com.cloudframe.app.sf326010.dto;

/**
*  The class BinDecoder800Redefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class BinDecoder800Redefined extends BinDecoder800RedefinedSerialized { 
   

						@Getter @Setter private char[] binDecoderByt2800 = Field.fillLowValue(1);
	
	/**
	* Constructor for BinDecoder800Redefined
	**/
    public BinDecoder800Redefined() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for BinDecoder800Redefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BinDecoder800Redefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
