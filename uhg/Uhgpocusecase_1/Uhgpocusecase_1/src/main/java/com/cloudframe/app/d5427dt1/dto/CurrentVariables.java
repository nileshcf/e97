package com.cloudframe.app.d5427dt1.dto;

/**
*  The class CurrentVariables is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class CurrentVariables extends CurrentVariablesSerialized { 
   

						@Getter @Setter private char[] currentChannelName = Field.fillLowValue(16);

						@Getter @Setter private char[] currentContainerName = Field.fillLowValue(16);

								@Getter @Setter private int currentContainerLength;

						@Getter @Setter private char[] currentContainerLayout = Field.fillLowValue(8);

								@Getter @Setter private int cicsresp;

								@Getter @Setter private int cicsresp2;
	
	/**
	* Constructor for CurrentVariables
	**/
    public CurrentVariables() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for CurrentVariables. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CurrentVariables(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
