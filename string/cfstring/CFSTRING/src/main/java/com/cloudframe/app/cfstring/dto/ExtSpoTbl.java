package com.cloudframe.app.cfstring.dto;

/**
*  The class ExtSpoTbl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:40. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class ExtSpoTbl extends ExtSpoTblSerialized { 
   

						@Getter @Setter private char[] extMfgNm = Field.fillLowValue(4);

						@Getter @Setter private char[] extPrdNme = Field.fillLowValue(12);

						@Getter @Setter private char[] extMacid = Field.fillLowValue(20);

						@Getter @Setter private char[] extActivationDate = Field.fillLowValue(10);
	
	/**
	* Constructor for ExtSpoTbl
	**/
    public ExtSpoTbl() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for ExtSpoTbl. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ExtSpoTbl(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
