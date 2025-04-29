package com.cloudframe.app.ms00d363.dto;

/**
*  The class CurcyTable2 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class CurcyTable2 extends CurcyTable2Serialized { 
   

						@Getter @Setter private char[] tb2CurId = Field.fillLowValue(3);

						@Getter @Setter private char[] tb2CurDesc = Field.fillLowValue(30);
	
	/**
	* Constructor for CurcyTable2
	**/
    public CurcyTable2() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for CurcyTable2. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CurcyTable2(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
