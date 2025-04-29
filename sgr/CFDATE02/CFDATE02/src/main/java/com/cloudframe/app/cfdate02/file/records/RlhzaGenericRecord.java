package com.cloudframe.app.cfdate02.file.records;

/**
*  The class RlhzaGenericRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:41. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class RlhzaGenericRecord extends RlhzaGenericRecordSerialized { 
   

						@Getter @Setter private char[] rlhzaFiller = Field.fillLowValue(1698);
	
	/**
	* Constructor for RlhzaGenericRecord
	**/
    public RlhzaGenericRecord() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for RlhzaGenericRecord. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RlhzaGenericRecord(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
