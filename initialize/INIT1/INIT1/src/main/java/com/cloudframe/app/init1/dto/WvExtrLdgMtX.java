package com.cloudframe.app.init1.dto;

/**
*  The class WvExtrLdgMtX is used to handle fields declared in it
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
public class WvExtrLdgMtX extends WvExtrLdgMtXSerialized { 
   

								@Getter @Setter private char[] wvExtrLdgMt = Field.fillLowValue(13);
	
	/**
	* Constructor for WvExtrLdgMtX
	**/
    public WvExtrLdgMtX() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for WvExtrLdgMtX. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WvExtrLdgMtX(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes WvExtrLdgMtX
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                    setWvExtrLdgMt(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_175840736,"0".toCharArray()));
   }


}
  
