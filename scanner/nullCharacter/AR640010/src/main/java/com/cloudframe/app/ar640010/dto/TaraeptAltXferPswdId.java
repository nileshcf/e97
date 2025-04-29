package com.cloudframe.app.ar640010.dto;

/**
*  The class TaraeptAltXferPswdId is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class TaraeptAltXferPswdId extends TaraeptAltXferPswdIdSerialized { 
   

								@Getter @Setter private short taraeptAltXferPswdIdLen;

						@Getter @Setter private char[] taraeptAltXferPswdIdTxt = Field.fillLowValue(64);
	
	/**
	* Constructor for TaraeptAltXferPswdId
	**/
    public TaraeptAltXferPswdId() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for TaraeptAltXferPswdId. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TaraeptAltXferPswdId(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes TaraeptAltXferPswdId
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setTaraeptAltXferPswdIdLen((short)0);
         setTaraeptAltXferPswdIdTxt(CONSTANTS.SPACE_64);
   }


}
  
