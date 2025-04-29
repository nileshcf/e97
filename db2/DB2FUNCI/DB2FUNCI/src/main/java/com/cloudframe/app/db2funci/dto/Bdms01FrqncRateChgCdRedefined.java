package com.cloudframe.app.db2funci.dto;

/**
*  The class Bdms01FrqncRateChgCdRedefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Bdms01FrqncRateChgCdRedefined extends Bdms01FrqncRateChgCdRedefinedSerialized { 
   

						@Getter @Setter private char[] msdFloatingRateInd = Field.fillLowValue(1);
	
	/**
	* Constructor for Bdms01FrqncRateChgCdRedefined
	**/
    public Bdms01FrqncRateChgCdRedefined() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Bdms01FrqncRateChgCdRedefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01FrqncRateChgCdRedefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
