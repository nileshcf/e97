package com.cloudframe.app.o529351u.dto;

/**
*  The class CetCicsErrorTableRedefined01 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class CetCicsErrorTableRedefined01 extends CetCicsErrorTableRedefined01Serialized { 
   

						@Getter @Setter private char[] cetEibrcdByte3 = Field.fillLowValue(1);
	
	/**
	* Constructor for CetCicsErrorTableRedefined01
	**/
    public CetCicsErrorTableRedefined01() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for CetCicsErrorTableRedefined01. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CetCicsErrorTableRedefined01(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
