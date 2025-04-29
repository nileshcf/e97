package com.cloudframe.app.mcsort02.file.records;

/**
*  The class SortRec5 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:29. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class SortRec5 extends SortRec5Serialized { 
   

						@Getter @Setter private char[] sort5TableId = Field.fillLowValue(8);

						@Getter @Setter private char[] sort5Key = Field.fillLowValue(99);

						@Getter @Setter private char[] sort5TableEffDate = Field.fillLowValue(10);
	
	/**
	* Constructor for SortRec5
	**/
    public SortRec5() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for SortRec5. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SortRec5(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
