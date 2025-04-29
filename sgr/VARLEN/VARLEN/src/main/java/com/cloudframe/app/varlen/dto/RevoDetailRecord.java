package com.cloudframe.app.varlen.dto;

/**
*  The class RevoDetailRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:40. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class RevoDetailRecord extends RevoDetailRecordSerialized { 
   

						@Getter @Setter private char[] revoEmailAddr = Field.fillLowValue(60);
	
	/**
	* Constructor for RevoDetailRecord
	**/
    public RevoDetailRecord() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for RevoDetailRecord. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RevoDetailRecord(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
