package com.cloudframe.app.cfsort06.file.records;

/**
*  The class StudentNameIRedefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:33. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class StudentNameIRedefined extends StudentNameIRedefinedSerialized { 
   

								@Getter @Setter private int studentSeqNo01;
	
	/**
	* Constructor for StudentNameIRedefined
	**/
    public StudentNameIRedefined() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for StudentNameIRedefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public StudentNameIRedefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
