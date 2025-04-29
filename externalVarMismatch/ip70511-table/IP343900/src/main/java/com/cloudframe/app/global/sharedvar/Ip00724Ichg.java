package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip00724Ichg is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip00724Ichg extends Ip00724IchgSerialized { 
   

						@Getter @Setter private char[] ip00724IchgRegion = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip00724Ichg
	**/
    public Ip00724Ichg() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip00724Ichg. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00724Ichg(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip00724Ichg
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp00724IchgRegion(CONSTANTS.SPACE);
   }


}
  
