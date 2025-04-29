package com.cloudframe.app.init1.dto;

/**
*  The class WvExtrQuantityX is used to handle fields declared in it
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
public class WvExtrQuantityX extends WvExtrQuantityXSerialized { 
   

								@Getter @Setter private char[] wvExtrQuantity = Field.fillLowValue(9);
	
	/**
	* Constructor for WvExtrQuantityX
	**/
    public WvExtrQuantityX() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for WvExtrQuantityX. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WvExtrQuantityX(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes WvExtrQuantityX
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                    setWvExtrQuantity(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1514747093,"0".toCharArray()));
   }


}
  
