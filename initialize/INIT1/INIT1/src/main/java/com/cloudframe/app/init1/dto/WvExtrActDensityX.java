package com.cloudframe.app.init1.dto;

/**
*  The class WvExtrActDensityX is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.utility.CFUtil;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class WvExtrActDensityX extends WvExtrActDensityXSerialized { 
   

								@Getter @Setter private char[] wvExtrActDensity = Field.fillLowValue(12);
	
	/**
	* Constructor for WvExtrActDensityX
	**/
    public WvExtrActDensityX() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for WvExtrActDensityX. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WvExtrActDensityX(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes WvExtrActDensityX
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                    setWvExtrActDensity(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1172135329,"0".toCharArray()));
   }


}
  
