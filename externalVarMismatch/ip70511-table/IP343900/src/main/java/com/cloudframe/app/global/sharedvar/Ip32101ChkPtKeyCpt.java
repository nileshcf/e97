package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip32101ChkPtKeyCpt is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip32101ChkPtKeyCpt extends Ip32101ChkPtKeyCptSerialized { 
   

						@Getter @Setter private char[] ip32101ChkJobGrpName = Field.fillLowValue(6);

						@Getter @Setter private char[] ip32101ChkJobGrpNum = Field.fillLowValue(2);

						@Getter @Setter private char[] ip32101ChkLrmFiller = Field.fillLowValue(9);
	
	/**
	* Constructor for Ip32101ChkPtKeyCpt
	**/
    public Ip32101ChkPtKeyCpt() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip32101ChkPtKeyCpt. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip32101ChkPtKeyCpt(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip32101ChkPtKeyCpt
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp32101ChkJobGrpName(CONSTANTS.SPACE_6);
         setIp32101ChkJobGrpNum(CONSTANTS.SPACE_2);
         setIp32101ChkLrmFiller(CONSTANTS.SPACE_9);
   }


}
  
