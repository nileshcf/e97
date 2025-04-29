package com.cloudframe.app.o529351u.dto;

/**
*  The class FesaDateTimestamp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class FesaDateTimestamp extends FesaDateTimestampSerialized { 
   

								@Getter @Setter private int fesaDatestamp;

								@Getter @Setter private int fesaTimestamp;
	
	/**
	* Constructor for FesaDateTimestamp
	**/
    public FesaDateTimestamp() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for FesaDateTimestamp. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FesaDateTimestamp(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
