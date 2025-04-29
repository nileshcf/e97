package com.cloudframe.app.comput5.dto;

/**
*  The class WvNumInpItem is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class WvNumInpItem extends WvNumInpItemSerialized { 
   

						@Getter @Setter private char[] wvNumInp = Field.fillLowValue(1);
	
	/**
	* Constructor for WvNumInpItem
	**/
    public WvNumInpItem() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for WvNumInpItem. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WvNumInpItem(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
