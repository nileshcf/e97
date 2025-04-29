package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip32101ChkPointDataText is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip32101ChkPointDataText extends Ip32101ChkPointDataTextSerialized { 
   

								@Getter @Setter private short ip32101ChkPointDataTxtLen;

						@Getter @Setter private char[] ip32101ChkPointDataTxtTxt = Field.fillLowValue(254);
	
	/**
	* Constructor for Ip32101ChkPointDataText
	**/
    public Ip32101ChkPointDataText() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip32101ChkPointDataText. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip32101ChkPointDataText(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip32101ChkPointDataText
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setIp32101ChkPointDataTxtLen((short)0);
         setIp32101ChkPointDataTxtTxt(CONSTANTS.SPACE_254);
   }


}
  
