package com.cloudframe.app.cfdate02.file.records;

/**
*  The class RldusInEocRefBlHdr is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:41. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class RldusInEocRefBlHdr extends RldusInEocRefBlHdrSerialized { 
   

						@Getter @Setter private char[] rldusCustomerHeaderRec = Field.fillLowValue(141);
	
	/**
	* Constructor for RldusInEocRefBlHdr
	**/
    public RldusInEocRefBlHdr() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for RldusInEocRefBlHdr. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RldusInEocRefBlHdr(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
