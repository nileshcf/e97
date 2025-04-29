package com.cloudframe.app.o529351u.dto;

/**
*  The class DsmEditErrorValueTxt is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.utility.CFUtil;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class DsmEditErrorValueTxt extends DsmEditErrorValueTxtSerialized { 
   

								@Getter @Setter private char[] dsmEditErrorValueInt = Field.fillLowValue(19);

								@Getter @Setter private char[] dsmEditErrorValueDec = Field.fillLowValue(19);

	
	/**
	* Constructor for DsmEditErrorValueTxt
	**/
    public DsmEditErrorValueTxt() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for DsmEditErrorValueTxt. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DsmEditErrorValueTxt(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes DsmEditErrorValueTxt
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                    setDsmEditErrorValueInt(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_467480023,"0".toCharArray()));
   }


}
  
