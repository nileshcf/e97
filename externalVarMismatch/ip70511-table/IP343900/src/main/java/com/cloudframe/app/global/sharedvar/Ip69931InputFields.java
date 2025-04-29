package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip69931InputFields is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip69931InputFields extends Ip69931InputFieldsSerialized { 
   

						@Getter @Setter private char[] ip69931ProcessingAgreement = Field.fillLowValue(11);

						@Getter @Setter private char[] ip69931ApplicationSystemId = Field.fillLowValue(3);
	
	/**
	* Constructor for Ip69931InputFields
	**/
    public Ip69931InputFields() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip69931InputFields. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip69931InputFields(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip69931InputFields
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp69931ProcessingAgreement(CONSTANTS.SPACE_11);
         setIp69931ApplicationSystemId(CONSTANTS.SPACE_3);
   }


}
  
