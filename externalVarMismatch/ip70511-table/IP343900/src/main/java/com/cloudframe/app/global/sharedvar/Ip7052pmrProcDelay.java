package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip7052pmrProcDelay is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip7052pmrProcDelay extends Ip7052pmrProcDelaySerialized { 
   

								@Getter @Setter private long ip7052pmrNoOfTrans;

						@Getter @Setter private char[] ip7052pmrTimeDelay = Field.fillLowValue(8);
	
	/**
	* Constructor for Ip7052pmrProcDelay
	**/
    public Ip7052pmrProcDelay() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip7052pmrProcDelay. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip7052pmrProcDelay(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip7052pmrProcDelay
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp7052pmrNoOfTrans(0);
         setIp7052pmrTimeDelay(CONSTANTS.SPACE_8);
   }


}
  
