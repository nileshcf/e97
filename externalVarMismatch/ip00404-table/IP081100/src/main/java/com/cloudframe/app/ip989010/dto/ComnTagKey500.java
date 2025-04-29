package com.cloudframe.app.ip989010.dto;

/**
*  The class ComnTagKey500 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class ComnTagKey500 extends ComnTagKey500Serialized { 
   

						@Getter @Setter private char[] comnTagType500 = Field.fillLowValue(1);

								@Getter @Setter private int comnTagNum500;

								@Getter @Setter private int comnTagSubfldNo500;

								@Getter @Setter private int comnTagOccur500;
	
	/**
	* Constructor for ComnTagKey500
	**/
    public ComnTagKey500() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for ComnTagKey500. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ComnTagKey500(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
