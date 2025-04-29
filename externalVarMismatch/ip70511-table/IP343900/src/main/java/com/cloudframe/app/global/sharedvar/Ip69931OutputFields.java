package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip69931OutputFields is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip69931OutputFields extends Ip69931OutputFieldsSerialized { 
   

						@Getter @Setter private char[] ip69931DatabaseId = Field.fillLowValue(18);

						@Getter @Setter private char[] ip69931CollectionId = Field.fillLowValue(18);

								@Getter @Setter private short ip69931WherePaProcessedSw;

								@Getter @Setter private short ip69931ResponseStatus;

						@Getter @Setter private char[] ip69931ErrorMsg = Field.fillLowValue(80);
	
	/**
	* Constructor for Ip69931OutputFields
	**/
    public Ip69931OutputFields() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip69931OutputFields. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip69931OutputFields(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip69931OutputFields
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp69931DatabaseId(CONSTANTS.SPACE_18);
         setIp69931CollectionId(CONSTANTS.SPACE_18);
         	setIp69931WherePaProcessedSw((short)0);
         	setIp69931ResponseStatus((short)0);
         setIp69931ErrorMsg(CONSTANTS.SPACE_80);
   }


}
  
