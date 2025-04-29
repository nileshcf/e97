package com.cloudframe.app.ip989010.dto;

/**
*  The class ParmData1000 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class ParmData1000 extends ParmData1000Serialized { 
   

						@Getter @Setter private char[] displayMsgTblsSw1000 = Field.fillLowValue(1);

						@Getter @Setter private char[] writeXmlSw1000 = Field.fillLowValue(1);

						@Getter @Setter private char[] writePsipmSw1000 = Field.fillLowValue(1);

						@Getter @Setter private char[] writeIpmSw1000 = Field.fillLowValue(1);

	
	/**
	* Constructor for ParmData1000
	**/
    public ParmData1000() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for ParmData1000. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ParmData1000(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
