package com.cloudframe.app.d529351u.dto;

/**
*  The class D51uRetRuleIcd is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class D51uRetRuleIcd extends D51uRetRuleIcdSerialized { 
   

						@Getter @Setter private char[] d51uRicdDrvPos = Field.fillLowValue(2);

						@Getter @Setter private char[] d51uRicdDrvSvc = Field.fillLowValue(6);

						@Getter @Setter private char[] d51uRicdDrvCau = Field.fillLowValue(1);

						@Getter @Setter private char[] d51uRicdClmIcdInd = Field.fillLowValue(1);

						@Getter @Setter private char[] d51uRicdClmIcdFromCd = Field.fillLowValue(7);

						@Getter @Setter private char[] d51uRicdClmIcdToCd = Field.fillLowValue(7);
	
	/**
	* Constructor for D51uRetRuleIcd
	**/
    public D51uRetRuleIcd() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for D51uRetRuleIcd. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public D51uRetRuleIcd(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes D51uRetRuleIcd
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setD51uRicdDrvPos(CONSTANTS.SPACE_2);
         setD51uRicdDrvSvc(CONSTANTS.SPACE_6);
         setD51uRicdDrvCau(CONSTANTS.SPACE);
         setD51uRicdClmIcdInd(CONSTANTS.SPACE);
         setD51uRicdClmIcdFromCd(CONSTANTS.SPACE_7);
         setD51uRicdClmIcdToCd(CONSTANTS.SPACE_7);
   }


}
  
