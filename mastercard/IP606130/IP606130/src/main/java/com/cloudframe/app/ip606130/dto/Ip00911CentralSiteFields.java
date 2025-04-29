package com.cloudframe.app.ip606130.dto;

/**
*  The class Ip00911CentralSiteFields is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:29. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip00911CentralSiteFields extends Ip00911CentralSiteFieldsSerialized { 
   

						@Getter @Setter private char[] ip00911IsoBinInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00911Filler = Field.fillLowValue(3);
	
	/**
	* Constructor for Ip00911CentralSiteFields
	**/
    public Ip00911CentralSiteFields() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip00911CentralSiteFields. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00911CentralSiteFields(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip00911CentralSiteFields
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp00911IsoBinInd(CONSTANTS.SPACE);
         setIp00911Filler(CONSTANTS.SPACE_3);
   }


}
  
