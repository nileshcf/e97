package com.cloudframe.app.cfdate02.file.records;

/**
*  The class Rl001HdrRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:41. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Rl001HdrRecord extends Rl001HdrRecordSerialized { 
   

						@Getter @Setter private char[] rl001CustomerHeaderRec = Field.fillLowValue(681);
	
	/**
	* Constructor for Rl001HdrRecord
	**/
    public Rl001HdrRecord() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Rl001HdrRecord. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Rl001HdrRecord(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
