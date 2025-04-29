package com.cloudframe.app.mcsort02.file.records;

/**
*  The class SortRec4 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:33. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class SortRec4 extends SortRec4Serialized { 
   

						@Getter @Setter private char[] sort4TableId = Field.fillLowValue(8);

						@Getter @Setter private char[] sort4Key = Field.fillLowValue(99);

						@Getter @Setter private char[] sort4TableEffDate = Field.fillLowValue(10);
	
	/**
	* Constructor for SortRec4
	**/
    public SortRec4() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for SortRec4. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SortRec4(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
