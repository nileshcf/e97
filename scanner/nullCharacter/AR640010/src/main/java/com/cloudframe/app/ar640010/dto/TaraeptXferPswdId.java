package com.cloudframe.app.ar640010.dto;

/**
*  The class TaraeptXferPswdId is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class TaraeptXferPswdId extends TaraeptXferPswdIdSerialized { 
   

								@Getter @Setter private short taraeptXferPswdIdLen;

						@Getter @Setter private char[] taraeptXferPswdIdTxt = Field.fillLowValue(64);
	
	/**
	* Constructor for TaraeptXferPswdId
	**/
    public TaraeptXferPswdId() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for TaraeptXferPswdId. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TaraeptXferPswdId(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes TaraeptXferPswdId
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setTaraeptXferPswdIdLen((short)0);
         setTaraeptXferPswdIdTxt(CONSTANTS.SPACE_64);
   }


}
  
