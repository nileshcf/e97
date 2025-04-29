package com.cloudframe.app.cfsort05.file.records;

/**
*  The class StudentNameORedefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class StudentNameORedefined extends StudentNameORedefinedSerialized { 
   

								@Getter @Setter private int studentSeqNo01;
	
	/**
	* Constructor for StudentNameORedefined
	**/
    public StudentNameORedefined() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for StudentNameORedefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public StudentNameORedefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
