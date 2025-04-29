package com.cloudframe.app.bm8090m.dto;

/**
*  The class WIniNomPe8090m is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class WIniNomPe8090m extends WIniNomPe8090mSerialized { 
   

						@Getter @Setter private char[] wIniPe8090m = Field.fillLowValue(1);

	
	/**
	* Constructor for WIniNomPe8090m
	**/
    public WIniNomPe8090m() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for WIniNomPe8090m. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WIniNomPe8090m(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes WIniNomPe8090m
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWIniPe8090m(CONSTANTS.SPACE);
   }


}
  
