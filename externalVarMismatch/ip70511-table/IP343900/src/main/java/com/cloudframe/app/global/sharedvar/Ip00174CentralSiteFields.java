package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip00174CentralSiteFields is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip00174CentralSiteFields extends Ip00174CentralSiteFieldsSerialized { 
   

						@Getter @Setter private char[] ip00174CryptoFlagInd = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip00174CentralSiteFields
	**/
    public Ip00174CentralSiteFields() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip00174CentralSiteFields. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00174CentralSiteFields(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip00174CentralSiteFields
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp00174CryptoFlagInd(CONSTANTS.SPACE);
   }


}
  
