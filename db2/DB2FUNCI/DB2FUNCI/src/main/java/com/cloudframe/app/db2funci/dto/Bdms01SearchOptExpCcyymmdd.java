package com.cloudframe.app.db2funci.dto;

/**
*  The class Bdms01SearchOptExpCcyymmdd is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Bdms01SearchOptExpCcyymmdd extends Bdms01SearchOptExpCcyymmddSerialized { 
   

						@Getter @Setter private char[] bdms01SearchOptExpCc = Field.fillLowValue(2);

						@Getter @Setter private char[] bdms01SearchOptExpYy = Field.fillLowValue(2);

						@Getter @Setter private char[] bdms01SearchOptExpMm = Field.fillLowValue(2);

						@Getter @Setter private char[] bdms01SearchOptExpDd = Field.fillLowValue(2);
	
	/**
	* Constructor for Bdms01SearchOptExpCcyymmdd
	**/
    public Bdms01SearchOptExpCcyymmdd() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Bdms01SearchOptExpCcyymmdd. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01SearchOptExpCcyymmdd(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
