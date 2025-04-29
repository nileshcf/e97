package com.cloudframe.app.mcsort01.dto;

/**
*  The class SortKeyLthEntry700 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class SortKeyLthEntry700 extends SortKeyLthEntry700Serialized { 
   

								@Getter @Setter private long tableLt700;
	
	/**
	* Constructor for SortKeyLthEntry700
	**/
    public SortKeyLthEntry700() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for SortKeyLthEntry700. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SortKeyLthEntry700(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setTableLt700(0L);
    } 



}
  
