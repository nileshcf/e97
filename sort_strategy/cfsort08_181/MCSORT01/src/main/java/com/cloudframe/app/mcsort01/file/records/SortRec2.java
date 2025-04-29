package com.cloudframe.app.mcsort01.file.records;

/**
*  The class SortRec2 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class SortRec2 extends SortRec2Serialized { 
   

						@Getter @Setter private char[] sort2TableData = Field.fillLowValue(27964);
	
	/**
	* Constructor for SortRec2
	**/
    public SortRec2() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for SortRec2. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SortRec2(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
