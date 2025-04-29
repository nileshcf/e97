package com.cloudframe.app.ip798030.dto;

/**
*  The class LrmStatTable630 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class LrmStatTable630 extends LrmStatTable630Serialized { 
   

						@Getter @Setter private char[] lrmStatError630 = Field.fillLowValue(66);
	
	/**
	* Constructor for LrmStatTable630
	**/
    public LrmStatTable630() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for LrmStatTable630. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public LrmStatTable630(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
