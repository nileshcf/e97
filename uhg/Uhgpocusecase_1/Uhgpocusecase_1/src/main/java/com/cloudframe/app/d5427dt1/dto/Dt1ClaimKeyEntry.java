package com.cloudframe.app.d5427dt1.dto;

/**
*  The class Dt1ClaimKeyEntry is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Dt1ClaimKeyEntry extends Dt1ClaimKeyEntrySerialized { 
   

						@Getter @Setter private char[] dt1ClaimKey = Field.fillLowValue(51);
	
	/**
	* Constructor for Dt1ClaimKeyEntry
	**/
    public Dt1ClaimKeyEntry() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Dt1ClaimKeyEntry. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Dt1ClaimKeyEntry(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
