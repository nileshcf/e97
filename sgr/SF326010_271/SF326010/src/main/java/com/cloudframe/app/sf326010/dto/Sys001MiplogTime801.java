package com.cloudframe.app.sf326010.dto;

/**
*  The class Sys001MiplogTime801 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Sys001MiplogTime801 extends Sys001MiplogTime801Serialized { 
   

						@Getter @Setter private char[] sys001MiplogTimeHh801 = Field.fillLowValue(1);

						@Getter @Setter private char[] sys001MiplogTimeMm801 = Field.fillLowValue(1);

						@Getter @Setter private char[] sys001MiplogTimeSs801 = Field.fillLowValue(1);
	
	/**
	* Constructor for Sys001MiplogTime801
	**/
    public Sys001MiplogTime801() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Sys001MiplogTime801. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sys001MiplogTime801(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
