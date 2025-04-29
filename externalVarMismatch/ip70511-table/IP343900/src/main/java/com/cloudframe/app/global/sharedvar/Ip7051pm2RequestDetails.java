package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip7051pm2RequestDetails is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip7051pm2RequestDetails extends Ip7051pm2RequestDetailsSerialized { 
   

						@Getter @Setter private char[] ip7051pm2ReqQMgrName = Field.fillLowValue(48);

						@Getter @Setter private char[] ip7051pm2ReqQName = Field.fillLowValue(48);
	
	/**
	* Constructor for Ip7051pm2RequestDetails
	**/
    public Ip7051pm2RequestDetails() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip7051pm2RequestDetails. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip7051pm2RequestDetails(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip7051pm2RequestDetails
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp7051pm2ReqQMgrName(CONSTANTS.SPACE_48);
         setIp7051pm2ReqQName(CONSTANTS.SPACE_48);
   }


}
  
