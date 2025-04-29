package com.cloudframe.app.bankint1.dto;

/**
*  The class AcafscedControl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:33. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class AcafscedControl extends AcafscedControlSerialized { 
   

						@Getter @Setter private char[] acafscedNombreRutinaError = Field.fillLowValue(8);
				@Getter @Setter private AcafscedMensajeError acafscedMensajeError = new AcafscedMensajeError();
				@Getter @Setter private AcafscedErrorDb2 acafscedErrorDb2 = new AcafscedErrorDb2();

						@Getter @Setter private char[] acafscedCodigoRetorno = Field.fillLowValue(2);
	
	/**
	* Constructor for AcafscedControl
	**/
    public AcafscedControl() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for AcafscedControl. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AcafscedControl(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getAcafscedMensajeError().setParent(this,getStartOffset() + 8);
					getAcafscedErrorDb2().setParent(this,getStartOffset() + 88);
    } 

	/**
	 * 	initializes AcafscedControl
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setAcafscedNombreRutinaError(CONSTANTS.SPACE_8);
          getAcafscedMensajeError().initialize();
     
          getAcafscedErrorDb2().initialize();
     
         setAcafscedCodigoRetorno(CONSTANTS.SPACE_2);
   }


}
  
