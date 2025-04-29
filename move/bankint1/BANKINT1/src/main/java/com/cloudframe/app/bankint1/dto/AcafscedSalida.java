package com.cloudframe.app.bankint1.dto;

/**
*  The class AcafscedSalida is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:33. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.utility.CFUtil;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class AcafscedSalida extends AcafscedSalidaSerialized { 
   

								@Getter @Setter private char[] acafscedSSaldoCedido = Field.fillLowValue(16);

								@Getter @Setter private char[] acafscedSSaldoTomado = Field.fillLowValue(16);

								@Getter @Setter private char[] acafscedSSalPrcedido = Field.fillLowValue(16);

								@Getter @Setter private char[] acafscedSSalPrtomado = Field.fillLowValue(16);

								@Getter @Setter private char[] acafscedSSalTraspaso = Field.fillLowValue(16);
				@Getter @Setter private AcafscedControl acafscedControl = new AcafscedControl();
	
	/**
	* Constructor for AcafscedSalida
	**/
    public AcafscedSalida() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for AcafscedSalida. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AcafscedSalida(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getAcafscedControl().setParent(this,getStartOffset() + 80);
    } 

	/**
	 * 	initializes AcafscedSalida
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                    setAcafscedSSaldoCedido(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_117551354,CONSTANTS.ZERO_16));
                    setAcafscedSSaldoTomado(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_117551354,CONSTANTS.ZERO_16));
                    setAcafscedSSalPrcedido(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_117551354,CONSTANTS.ZERO_16));
                    setAcafscedSSalPrtomado(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_117551354,CONSTANTS.ZERO_16));
                    setAcafscedSSalTraspaso(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_117551354,CONSTANTS.ZERO_16));
          getAcafscedControl().initialize();
     
   }


}
  
