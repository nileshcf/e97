package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip70511RequestDetails is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip70511RequestDetails extends Ip70511RequestDetailsSerialized { 
   

						@Getter @Setter private char[] ip70511ReqQMgrName = Field.fillLowValue(48);

						@Getter @Setter private char[] ip70511ReqQName = Field.fillLowValue(48);
	
	/**
	* Constructor for Ip70511RequestDetails
	**/
    public Ip70511RequestDetails() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip70511RequestDetails. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip70511RequestDetails(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip70511RequestDetails
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp70511ReqQMgrName(CONSTANTS.SPACE_48);
         setIp70511ReqQName(CONSTANTS.SPACE_48);
   }


}
  
