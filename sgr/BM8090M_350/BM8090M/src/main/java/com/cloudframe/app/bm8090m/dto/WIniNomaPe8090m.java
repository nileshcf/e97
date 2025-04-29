package com.cloudframe.app.bm8090m.dto;

/**
*  The class WIniNomaPe8090m is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class WIniNomaPe8090m extends WIniNomaPe8090mSerialized { 
   

						@Getter @Setter private char[] wIni1NomPe8090m = Field.fillLowValue(1);

	
	/**
	* Constructor for WIniNomaPe8090m
	**/
    public WIniNomaPe8090m() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for WIniNomaPe8090m. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WIniNomaPe8090m(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes WIniNomaPe8090m
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWIni1NomPe8090m(CONSTANTS.SPACE);
   }


}
  
