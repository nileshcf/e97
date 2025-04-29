package com.cloudframe.app.ar640010.dto;

/**
*  The class GftRetrieveDsn1000 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class GftRetrieveDsn1000 extends GftRetrieveDsn1000Serialized { 
   

						@Getter @Setter private char[] gftRetrieveDd1000 = Field.fillLowValue(8);

	
	/**
	* Constructor for GftRetrieveDsn1000
	**/
    public GftRetrieveDsn1000() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for GftRetrieveDsn1000. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public GftRetrieveDsn1000(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
