package com.cloudframe.app.o529351u.dto;

/**
*  The class FesrFromCondPs is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class FesrFromCondPs extends FesrFromCondPsSerialized { 
   

						@Getter @Setter private char[] fesrFromPs = Field.fillLowValue(3);
	
	/**
	* Constructor for FesrFromCondPs
	**/
    public FesrFromCondPs() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for FesrFromCondPs. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FesrFromCondPs(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
