package com.cloudframe.app.bm8090m.dto;

/**
*  The class WIniNomrPe8090m is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class WIniNomrPe8090m extends WIniNomrPe8090mSerialized { 
   

						@Getter @Setter private char[] wIni2NomPe8090m = Field.fillLowValue(2);

	
	/**
	* Constructor for WIniNomrPe8090m
	**/
    public WIniNomrPe8090m() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for WIniNomrPe8090m. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WIniNomrPe8090m(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
