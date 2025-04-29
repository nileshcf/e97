package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip67002DateRedefined02 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip67002DateRedefined02 extends Ip67002DateRedefined02Serialized { 
   


						@Getter @Setter private char[] ip67002Yymmdd = Field.fillLowValue(6);
	
	/**
	* Constructor for Ip67002DateRedefined02
	**/
    public Ip67002DateRedefined02() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip67002DateRedefined02. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip67002DateRedefined02(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip67002DateRedefined02
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp67002Yymmdd(CONSTANTS.SPACE_6);
   }


}
  
