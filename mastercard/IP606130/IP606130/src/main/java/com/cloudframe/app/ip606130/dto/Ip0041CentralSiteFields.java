package com.cloudframe.app.ip606130.dto;

/**
*  The class Ip0041CentralSiteFields is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:29. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip0041CentralSiteFields extends Ip0041CentralSiteFieldsSerialized { 
   

						@Getter @Setter private char[] ip0041IsoBinInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0041Filler = Field.fillLowValue(5);
	
	/**
	* Constructor for Ip0041CentralSiteFields
	**/
    public Ip0041CentralSiteFields() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip0041CentralSiteFields. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip0041CentralSiteFields(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip0041CentralSiteFields
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp0041IsoBinInd(CONSTANTS.SPACE);
         setIp0041Filler(CONSTANTS.SPACE_5);
   }


}
  
