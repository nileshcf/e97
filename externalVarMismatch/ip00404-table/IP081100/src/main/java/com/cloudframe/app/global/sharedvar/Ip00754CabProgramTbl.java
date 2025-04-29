package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip00754CabProgramTbl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip00754CabProgramTbl extends Ip00754CabProgramTblSerialized { 
   

						@Getter @Setter private char[] ip00754CabProgram = Field.fillLowValue(4);

						@Getter @Setter private char[] ip00754CabPgmLifecycleInd = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip00754CabProgramTbl
	**/
    public Ip00754CabProgramTbl() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip00754CabProgramTbl. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00754CabProgramTbl(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip00754CabProgramTbl
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp00754CabProgram(CONSTANTS.SPACE_4);
         setIp00754CabPgmLifecycleInd(CONSTANTS.SPACE);
   }


}
  
