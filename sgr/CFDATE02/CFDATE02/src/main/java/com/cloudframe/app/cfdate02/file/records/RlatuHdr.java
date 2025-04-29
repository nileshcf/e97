package com.cloudframe.app.cfdate02.file.records;

/**
*  The class RlatuHdr is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:41. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class RlatuHdr extends RlatuHdrSerialized { 
   

						@Getter @Setter private char[] rlatuCustomerHeaderRec = Field.fillLowValue(129);
	
	/**
	* Constructor for RlatuHdr
	**/
    public RlatuHdr() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for RlatuHdr. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RlatuHdr(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
