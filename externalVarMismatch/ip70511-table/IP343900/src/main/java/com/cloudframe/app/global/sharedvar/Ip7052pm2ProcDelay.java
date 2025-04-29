package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip7052pm2ProcDelay is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip7052pm2ProcDelay extends Ip7052pm2ProcDelaySerialized { 
   

								@Getter @Setter private long ip7052pm2NoOfTrans;

						@Getter @Setter private char[] ip7052pm2TimeDelay = Field.fillLowValue(8);
	
	/**
	* Constructor for Ip7052pm2ProcDelay
	**/
    public Ip7052pm2ProcDelay() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip7052pm2ProcDelay. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip7052pm2ProcDelay(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip7052pm2ProcDelay
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp7052pm2NoOfTrans(0);
         setIp7052pm2TimeDelay(CONSTANTS.SPACE_8);
   }


}
  
