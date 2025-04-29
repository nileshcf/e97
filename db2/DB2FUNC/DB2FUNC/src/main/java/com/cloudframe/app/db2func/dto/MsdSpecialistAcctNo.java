package com.cloudframe.app.db2func.dto;

/**
*  The class MsdSpecialistAcctNo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class MsdSpecialistAcctNo extends MsdSpecialistAcctNoSerialized { 
   

						@Getter @Setter private char[] msdSpecBranch = Field.fillLowValue(3);

						@Getter @Setter private char[] msdSpecAcct = Field.fillLowValue(5);

						@Getter @Setter private char[] msdSpecAcctType = Field.fillLowValue(1);
	
	/**
	* Constructor for MsdSpecialistAcctNo
	**/
    public MsdSpecialistAcctNo() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for MsdSpecialistAcctNo. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdSpecialistAcctNo(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
