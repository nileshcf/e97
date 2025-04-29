package com.cloudframe.app.init1.dto;

/**
*  The class Rlu5fDeviceTax is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Rlu5fDeviceTax extends Rlu5fDeviceTaxSerialized { 
   

						@Getter @Setter private char[] rlu5fDeviceTaxDesc = Field.fillLowValue(50);

								@Getter @Setter private BigDecimal rlu5fDeviceTaxAmt = BigDecimal.ZERO;
	
	/**
	* Constructor for Rlu5fDeviceTax
	**/
    public Rlu5fDeviceTax() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Rlu5fDeviceTax. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Rlu5fDeviceTax(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Rlu5fDeviceTax
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setRlu5fDeviceTaxDesc(CONSTANTS.SPACE_50);
			setRlu5fDeviceTaxAmt(BigDecimal.ZERO);
   }


}
  
