package com.cloudframe.app.ar640010.dto;

/**
*  The class CyclNum1000Redefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class CyclNum1000Redefined extends CyclNum1000RedefinedSerialized { 
   

							@Getter @Setter private char[] requestParms1000ConditionGroup2 = fillLowValue(1);

						@Getter @Setter private char[] cyclNumFtssSeq1000 = Field.fillLowValue(2);
	
	/**
	* Constructor for CyclNum1000Redefined
	**/
    public CyclNum1000Redefined() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for CyclNum1000Redefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CyclNum1000Redefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
