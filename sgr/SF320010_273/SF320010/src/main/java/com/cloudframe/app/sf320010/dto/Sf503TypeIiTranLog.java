package com.cloudframe.app.sf320010.dto;

/**
*  The class Sf503TypeIiTranLog is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:43. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Sf503TypeIiTranLog extends Sf503TypeIiTranLogSerialized { 
   

						@Getter @Setter private char[] sf503T2RecordType = Field.fillLowValue(1);
	
	/**
	* Constructor for Sf503TypeIiTranLog
	**/
    public Sf503TypeIiTranLog() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Sf503TypeIiTranLog. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf503TypeIiTranLog(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
