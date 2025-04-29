package com.cloudframe.app.o529351u.dto;

/**
*  The class DsmRecDetailsArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class DsmRecDetailsArea extends DsmRecDetailsAreaSerialized { 
   

						@Getter @Setter private char[] dsmRecIcn = Field.fillLowValue(10);

						@Getter @Setter private char[] dsmRecIcnSufxCd = Field.fillLowValue(2);

								@Getter @Setter private int dsmRecVersNbr;

						@Getter @Setter private char[] dsmRecProcDate = Field.fillLowValue(10);

						@Getter @Setter private char[] dsmRecProcTime = Field.fillLowValue(8);
	
	/**
	* Constructor for DsmRecDetailsArea
	**/
    public DsmRecDetailsArea() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for DsmRecDetailsArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DsmRecDetailsArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes DsmRecDetailsArea
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setDsmRecIcn(CONSTANTS.SPACE_10);
         setDsmRecIcnSufxCd(CONSTANTS.SPACE_2);
                     setDsmRecVersNbr(0);
         setDsmRecProcDate(CONSTANTS.SPACE_10);
         setDsmRecProcTime(CONSTANTS.SPACE_8);
   }


}
  
