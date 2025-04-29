package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip38201Disposition is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip38201Disposition extends Ip38201DispositionSerialized { 
   

						@Getter @Setter private char[] ip38201DispBeginParm = Field.fillLowValue(1);

						@Getter @Setter private char[] ip38201DispNormalParm = Field.fillLowValue(1);

						@Getter @Setter private char[] ip38201DispAbnormalParm = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip38201Disposition
	**/
    public Ip38201Disposition() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip38201Disposition. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip38201Disposition(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip38201Disposition
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp38201DispBeginParm(CONSTANTS.SPACE);
         setIp38201DispNormalParm(CONSTANTS.SPACE);
         setIp38201DispAbnormalParm(CONSTANTS.SPACE);
   }


}
  
