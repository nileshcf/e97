package com.cloudframe.app.init1.dto;

/**
*  The class WvExtrValueX is used to handle fields declared in it
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
public class WvExtrValueX extends WvExtrValueXSerialized { 
   

								@Getter @Setter private char[] wvExtrValue = Field.fillLowValue(12);
	
	/**
	* Constructor for WvExtrValueX
	**/
    public WvExtrValueX() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for WvExtrValueX. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WvExtrValueX(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes WvExtrValueX
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                    setWvExtrValue(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1391145579,"0".toCharArray()));
   }


}
  
