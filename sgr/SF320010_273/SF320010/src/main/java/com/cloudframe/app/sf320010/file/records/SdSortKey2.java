package com.cloudframe.app.sf320010.file.records;

/**
*  The class SdSortKey2 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:43. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class SdSortKey2 extends SdSortKey2Serialized { 
   

						@Getter @Setter private char[] sdSk2RemMipId = Field.fillLowValue(3);

						@Getter @Setter private char[] sdSk2OperatorId = Field.fillLowValue(7);

						@Getter @Setter private char[] sdSk2TimeStamp = Field.fillLowValue(6);

						@Getter @Setter private char[] sdSk2DateStamp = Field.fillLowValue(6);
	
	/**
	* Constructor for SdSortKey2
	**/
    public SdSortKey2() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for SdSortKey2. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SdSortKey2(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
