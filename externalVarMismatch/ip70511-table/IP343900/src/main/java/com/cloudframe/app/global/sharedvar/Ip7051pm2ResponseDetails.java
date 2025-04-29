package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip7051pm2ResponseDetails is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip7051pm2ResponseDetails extends Ip7051pm2ResponseDetailsSerialized { 
   

						@Getter @Setter private char[] ip7051pm2ResQMgrName = Field.fillLowValue(48);

						@Getter @Setter private char[] ip7051pm2ResQName = Field.fillLowValue(48);
	
	/**
	* Constructor for Ip7051pm2ResponseDetails
	**/
    public Ip7051pm2ResponseDetails() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip7051pm2ResponseDetails. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip7051pm2ResponseDetails(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip7051pm2ResponseDetails
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp7051pm2ResQMgrName(CONSTANTS.SPACE_48);
         setIp7051pm2ResQName(CONSTANTS.SPACE_48);
   }


}
  
