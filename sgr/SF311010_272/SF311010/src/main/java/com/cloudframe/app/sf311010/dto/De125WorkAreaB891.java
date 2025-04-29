package com.cloudframe.app.sf311010.dto;

/**
*  The class De125WorkAreaB891 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class De125WorkAreaB891 extends De125WorkAreaB891Serialized { 
   

								@Getter @Setter private long bytes516891;

						@Getter @Setter private char[] bytes1718891 = Field.fillLowValue(2);

								@Getter @Setter private long bytes2128891;

						@Getter @Setter private char[] bytes2930891 = Field.fillLowValue(2);

								@Getter @Setter private int bytes3336891;

						@Getter @Setter private char[] bytes3738891 = Field.fillLowValue(2);

								@Getter @Setter private int bytes4143891;
	
	/**
	* Constructor for De125WorkAreaB891
	**/
    public De125WorkAreaB891() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for De125WorkAreaB891. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public De125WorkAreaB891(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
