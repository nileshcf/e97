package com.cloudframe.app.init1.dto;

/**
*  The class WvExtrDchBblX is used to handle fields declared in it
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
public class WvExtrDchBblX extends WvExtrDchBblXSerialized { 
   

								@Getter @Setter private char[] wvExtrDchBbl = Field.fillLowValue(13);
	
	/**
	* Constructor for WvExtrDchBblX
	**/
    public WvExtrDchBblX() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for WvExtrDchBblX. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WvExtrDchBblX(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes WvExtrDchBblX
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                    setWvExtrDchBbl(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_175840736,"0".toCharArray()));
   }


}
  
