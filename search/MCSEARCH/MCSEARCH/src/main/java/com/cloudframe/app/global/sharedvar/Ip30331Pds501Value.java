package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip30331Pds501Value is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:26. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip30331Pds501Value extends Ip30331Pds501ValueSerialized { 
   

						@Getter @Setter private char[] ip30331UsageCode = Field.fillLowValue(2);

						@Getter @Setter private char[] ip30331IndstyRefNum = Field.fillLowValue(3);
	
	/**
	* Constructor for Ip30331Pds501Value
	**/
    public Ip30331Pds501Value() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip30331Pds501Value. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip30331Pds501Value(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip30331Pds501Value
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp30331UsageCode(CONSTANTS.SPACE_2);
         setIp30331IndstyRefNum(CONSTANTS.SPACE_3);
   }


}
  
