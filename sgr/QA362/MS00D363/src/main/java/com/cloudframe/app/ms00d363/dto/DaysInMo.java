package com.cloudframe.app.ms00d363.dto;

/**
*  The class DaysInMo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class DaysInMo extends DaysInMoSerialized { 
   

						@Getter @Setter private char[] daysActive = Field.fillLowValue(1);
	
	/**
	* Constructor for DaysInMo
	**/
    public DaysInMo() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for DaysInMo. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DaysInMo(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
