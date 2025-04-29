package com.cloudframe.app.d5427dt1.dto;

/**
*  The class AsnVariables is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class AsnVariables extends AsnVariablesSerialized { 
   

						@Getter @Setter private char[] asnAbcode = Field.fillLowValue(4);

						@Getter @Setter private char[] asnNetname = Field.fillLowValue(8);

						@Getter @Setter private char[] asnPrinsysid = Field.fillLowValue(4);

						@Getter @Setter private char[] asnInvokingprog = Field.fillLowValue(8);

						@Getter @Setter private char[] asnProgram = Field.fillLowValue(8);

						@Getter @Setter private char[] asnApplid = Field.fillLowValue(8);

						@Getter @Setter private char[] asnSysid = Field.fillLowValue(4);
	
	/**
	* Constructor for AsnVariables
	**/
    public AsnVariables() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for AsnVariables. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AsnVariables(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes AsnVariables
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setAsnAbcode(CONSTANTS.SPACE_4);
         setAsnNetname(CONSTANTS.SPACE_8);
         setAsnPrinsysid(CONSTANTS.SPACE_4);
         setAsnInvokingprog(CONSTANTS.SPACE_8);
         setAsnProgram(CONSTANTS.SPACE_8);
         setAsnApplid(CONSTANTS.SPACE_8);
         setAsnSysid(CONSTANTS.SPACE_4);
   }


}
  
