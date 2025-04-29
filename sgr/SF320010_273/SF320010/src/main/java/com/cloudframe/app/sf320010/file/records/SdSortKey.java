package com.cloudframe.app.sf320010.file.records;

/**
*  The class SdSortKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:43. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class SdSortKey extends SdSortKeySerialized { 
   

						@Getter @Setter private char[] sdSortId = Field.fillLowValue(3);

						@Getter @Setter private char[] sdSortCc = Field.fillLowValue(2);

						@Getter @Setter private char[] sdSortDate = Field.fillLowValue(6);

						@Getter @Setter private char[] sdSortTime = Field.fillLowValue(6);
	
	/**
	* Constructor for SdSortKey
	**/
    public SdSortKey() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for SdSortKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SdSortKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
