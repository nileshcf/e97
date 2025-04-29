package com.cloudframe.app.ms00d363.dto;

/**
*  The class CertificationHeaderLine is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class CertificationHeaderLine extends CertificationHeaderLineSerialized { 
   

						@Getter @Setter private char[] chlTitle1 = Field.fillLowValue(28);
	
	/**
	* Constructor for CertificationHeaderLine
	**/
    public CertificationHeaderLine() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for CertificationHeaderLine. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CertificationHeaderLine(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
