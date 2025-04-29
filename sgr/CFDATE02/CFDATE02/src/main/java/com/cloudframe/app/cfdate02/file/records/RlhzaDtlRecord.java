package com.cloudframe.app.cfdate02.file.records;

/**
*  The class RlhzaDtlRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:41. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class RlhzaDtlRecord extends RlhzaDtlRecordSerialized { 
   

						@Getter @Setter private char[] rlhzaFiller01 = Field.fillLowValue(114);
	
	/**
	* Constructor for RlhzaDtlRecord
	**/
    public RlhzaDtlRecord() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for RlhzaDtlRecord. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RlhzaDtlRecord(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
