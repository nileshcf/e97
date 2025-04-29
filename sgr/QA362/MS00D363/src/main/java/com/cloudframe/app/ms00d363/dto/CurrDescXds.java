package com.cloudframe.app.ms00d363.dto;

/**
*  The class CurrDescXds is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class CurrDescXds extends CurrDescXdsSerialized { 
   

						@Getter @Setter private char[] swchCerRecType = Field.fillLowValue(2);

						@Getter @Setter private char[] swchCerNumKey = Field.fillLowValue(3);
	
	/**
	* Constructor for CurrDescXds
	**/
    public CurrDescXds() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for CurrDescXds. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CurrDescXds(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
