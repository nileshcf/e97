package com.cloudframe.app.db2func.dto;

/**
*  The class MsdSecurityNoRedefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class MsdSecurityNoRedefined extends MsdSecurityNoRedefinedSerialized { 
   

						@Getter @Setter private char[] msdSecurityNo1 = Field.fillLowValue(1);

						@Getter @Setter private char[] msdSecurityNo27 = Field.fillLowValue(6);
	
	/**
	* Constructor for MsdSecurityNoRedefined
	**/
    public MsdSecurityNoRedefined() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for MsdSecurityNoRedefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdSecurityNoRedefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
