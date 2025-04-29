package com.cloudframe.app.mcissues.dto;

/**
*  The class Ip43501EiElemId is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip43501EiElemId extends Ip43501EiElemIdSerialized { 
   

						@Getter @Setter private char[] ip43501EiElementId = Field.fillLowValue(5);

						@Getter @Setter private char[] ip43501EiSubElementId = Field.fillLowValue(5);
	
	/**
	* Constructor for Ip43501EiElemId
	**/
    public Ip43501EiElemId() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip43501EiElemId. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip43501EiElemId(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip43501EiElemId
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp43501EiElementId(CONSTANTS.SPACE_5);
         setIp43501EiSubElementId(CONSTANTS.SPACE_5);
   }


}
  
