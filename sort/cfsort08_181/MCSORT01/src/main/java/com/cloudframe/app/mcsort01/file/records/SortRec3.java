package com.cloudframe.app.mcsort01.file.records;

/**
*  The class SortRec3 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class SortRec3 extends SortRec3Serialized { 
   

						@Getter @Setter private char[] sort3TableData = Field.fillLowValue(27865);
	
	/**
	* Constructor for SortRec3
	**/
    public SortRec3() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for SortRec3. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SortRec3(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
