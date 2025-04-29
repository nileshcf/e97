package com.cloudframe.app.sup01751.dto;

/**
*  The class Sqlerrm is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Sqlerrm extends SqlerrmSerialized { 
   

								@Getter @Setter private short sqlerrml;

						@Getter @Setter private char[] sqlerrmc = Field.fillLowValue(70);
	
	/**
	* Constructor for Sqlerrm
	**/
    public Sqlerrm() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Sqlerrm. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sqlerrm(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
