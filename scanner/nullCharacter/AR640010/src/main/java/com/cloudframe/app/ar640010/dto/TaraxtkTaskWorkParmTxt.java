package com.cloudframe.app.ar640010.dto;

/**
*  The class TaraxtkTaskWorkParmTxt is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class TaraxtkTaskWorkParmTxt extends TaraxtkTaskWorkParmTxtSerialized { 
   

								@Getter @Setter private short taraxtkTaskWorkParmTxtLen;

						@Getter @Setter private char[] taraxtkTaskWorkParmTxtTxt = Field.fillLowValue(1024);
	
	/**
	* Constructor for TaraxtkTaskWorkParmTxt
	**/
    public TaraxtkTaskWorkParmTxt() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for TaraxtkTaskWorkParmTxt. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TaraxtkTaskWorkParmTxt(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes TaraxtkTaskWorkParmTxt
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setTaraxtkTaskWorkParmTxtLen((short)0);
         setTaraxtkTaskWorkParmTxtTxt(CONSTANTS.SPACE_1024);
   }


}
  
