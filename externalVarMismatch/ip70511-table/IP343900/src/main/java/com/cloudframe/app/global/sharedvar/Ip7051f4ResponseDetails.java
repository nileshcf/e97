package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip7051f4ResponseDetails is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip7051f4ResponseDetails extends Ip7051f4ResponseDetailsSerialized { 
   

						@Getter @Setter private char[] ip7051f4ResQMgrName = Field.fillLowValue(48);

						@Getter @Setter private char[] ip7051f4ResQName = Field.fillLowValue(48);
	
	/**
	* Constructor for Ip7051f4ResponseDetails
	**/
    public Ip7051f4ResponseDetails() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip7051f4ResponseDetails. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip7051f4ResponseDetails(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip7051f4ResponseDetails
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp7051f4ResQMgrName(CONSTANTS.SPACE_48);
         setIp7051f4ResQName(CONSTANTS.SPACE_48);
   }


}
  
