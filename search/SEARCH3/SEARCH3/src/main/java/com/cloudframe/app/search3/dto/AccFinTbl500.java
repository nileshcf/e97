package com.cloudframe.app.search3.dto;

/**
*  The class AccFinTbl500 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:41. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class AccFinTbl500 extends AccFinTbl500Serialized { 
   

						@Getter @Setter private char[] accFinNfInd500 = Field.fillLowValue(2);

								@Getter @Setter private int accFinNfAmt500;
	
	/**
	* Constructor for AccFinTbl500
	**/
    public AccFinTbl500() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for AccFinTbl500. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AccFinTbl500(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
