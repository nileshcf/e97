package com.cloudframe.app.sf320010.dto;

/**
*  The class Sf503OpOperatorTranLog is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:43. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Sf503OpOperatorTranLog extends Sf503OpOperatorTranLogSerialized { 
   

						@Getter @Setter private char[] sf503OpRecordType = Field.fillLowValue(1);

						@Getter @Setter private char[] sf503OpMsgHdr = Field.fillLowValue(8);

						@Getter @Setter private char[] sf503OpOperatorMessage = Field.fillLowValue(85);
	
	/**
	* Constructor for Sf503OpOperatorTranLog
	**/
    public Sf503OpOperatorTranLog() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Sf503OpOperatorTranLog. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf503OpOperatorTranLog(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
