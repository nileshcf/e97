package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip00404RegionSubreg is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip00404RegionSubreg extends Ip00404RegionSubregSerialized { 
   

						@Getter @Setter private char[] ip00404Region = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip00404RegionSubreg
	**/
    public Ip00404RegionSubreg() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip00404RegionSubreg. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00404RegionSubreg(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip00404RegionSubreg
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp00404Region(CONSTANTS.SPACE);
   }


}
  
