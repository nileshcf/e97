package com.cloudframe.app.mcsort01.file.records;

/**
*  The class SortRec4 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:26. using version 5.0.0.254
**/


import com.cloudframe.app.mcsort01.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class SortRec4 extends SortRec4Serialized { 
   

	
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
    


	
	
	

		public static int getSortRec4FieldLength() {
			return SORT_REC_4_LENGTH;
		}

}
  
