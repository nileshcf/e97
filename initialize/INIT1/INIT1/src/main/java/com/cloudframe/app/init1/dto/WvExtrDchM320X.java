package com.cloudframe.app.init1.dto;

/**
*  The class WvExtrDchM320X is used to handle fields declared in it
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
public class WvExtrDchM320X extends WvExtrDchM320XSerialized { 
   

								@Getter @Setter private char[] wvExtrDchM320 = Field.fillLowValue(12);
	
	/**
	* Constructor for WvExtrDchM320X
	**/
    public WvExtrDchM320X() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for WvExtrDchM320X. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WvExtrDchM320X(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes WvExtrDchM320X
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                    setWvExtrDchM320(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1782754550,"0".toCharArray()));
   }


}
  
