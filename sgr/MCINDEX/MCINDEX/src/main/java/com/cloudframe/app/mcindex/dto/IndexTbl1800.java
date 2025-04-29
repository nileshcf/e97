package com.cloudframe.app.mcindex.dto;

/**
*  The class IndexTbl1800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:33. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class IndexTbl1800 extends IndexTbl1800Serialized { 
   

								@Getter @Setter private int zeroIdx5800;
	
	/**
	* Constructor for IndexTbl1800
	**/
    public IndexTbl1800() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for IndexTbl1800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public IndexTbl1800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
