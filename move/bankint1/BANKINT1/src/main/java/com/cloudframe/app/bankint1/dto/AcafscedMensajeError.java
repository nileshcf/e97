package com.cloudframe.app.bankint1.dto;

/**
*  The class AcafscedMensajeError is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:33. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class AcafscedMensajeError extends AcafscedMensajeErrorSerialized { 
   

						@Getter @Setter private char[] acafscedSituacion = Field.fillLowValue(4);

						@Getter @Setter private char[] acafscedFiller = Field.fillLowValue(1);

						@Getter @Setter private char[] acafscedRestoMensaje = Field.fillLowValue(75);
	
	/**
	* Constructor for AcafscedMensajeError
	**/
    public AcafscedMensajeError() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for AcafscedMensajeError. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AcafscedMensajeError(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes AcafscedMensajeError
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setAcafscedSituacion(CONSTANTS.SPACE_4);
         setAcafscedFiller(CONSTANTS.SPACE);
         setAcafscedRestoMensaje(CONSTANTS.SPACE_75);
   }


}
  
