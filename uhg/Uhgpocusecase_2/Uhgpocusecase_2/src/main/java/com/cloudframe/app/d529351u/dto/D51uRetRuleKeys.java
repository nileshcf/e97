package com.cloudframe.app.d529351u.dto;

/**
*  The class D51uRetRuleKeys is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class D51uRetRuleKeys extends D51uRetRuleKeysSerialized { 
   

						@Getter @Setter private char[] d51uRetDrvPos = Field.fillLowValue(2);

						@Getter @Setter private char[] d51uRetDrvSvc = Field.fillLowValue(6);

						@Getter @Setter private char[] d51uRetDrvCau = Field.fillLowValue(1);

						@Getter @Setter private char[] d51uRetRuleSw = Field.fillLowValue(8);
	
	/**
	* Constructor for D51uRetRuleKeys
	**/
    public D51uRetRuleKeys() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for D51uRetRuleKeys. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public D51uRetRuleKeys(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes D51uRetRuleKeys
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setD51uRetDrvPos(CONSTANTS.SPACE_2);
         setD51uRetDrvSvc(CONSTANTS.SPACE_6);
         setD51uRetDrvCau(CONSTANTS.SPACE);
         setD51uRetRuleSw(CONSTANTS.SPACE_8);
   }


}
  
