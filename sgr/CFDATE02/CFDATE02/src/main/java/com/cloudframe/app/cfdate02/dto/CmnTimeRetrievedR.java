package com.cloudframe.app.cfdate02.dto;

/**
*  The class CmnTimeRetrievedR is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:41. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class CmnTimeRetrievedR extends CmnTimeRetrievedRSerialized { 
   

						@Getter @Setter private char[] cmnTimeRetSs = Field.fillLowValue(2);
	
	/**
	* Constructor for CmnTimeRetrievedR
	**/
    public CmnTimeRetrievedR() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for CmnTimeRetrievedR. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnTimeRetrievedR(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
