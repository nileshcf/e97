package com.cloudframe.app.ar640010.dto;

/**
*  The class ResponseMessage1000Redefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class ResponseMessage1000Redefined extends ResponseMessage1000RedefinedSerialized { 
   

								@Getter @Setter private int responseEndptId1000;

								@Getter @Setter private short responseCyclNum1000;

						@Getter @Setter private char[] responseGftDsn1000 = Field.fillLowValue(44);
	
	/**
	* Constructor for ResponseMessage1000Redefined
	**/
    public ResponseMessage1000Redefined() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for ResponseMessage1000Redefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ResponseMessage1000Redefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
