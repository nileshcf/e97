package com.cloudframe.app.mcissues.dto;

/**
*  The class Ip43501EiData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip43501EiData extends Ip43501EiDataSerialized { 
   

						@Getter @Setter private char[] ip43501EiInvalidData = Field.fillLowValue(50);

						@Getter @Setter private char[] ip43501RejMsgData = Field.fillLowValue(949);
	
	/**
	* Constructor for Ip43501EiData
	**/
    public Ip43501EiData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip43501EiData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip43501EiData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip43501EiData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp43501EiInvalidData(CONSTANTS.SPACE_50);
         setIp43501RejMsgData(CONSTANTS.SPACE_949);
   }


}
  
