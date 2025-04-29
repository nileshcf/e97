package com.cloudframe.app.bankint1.dto;

/**
*  The class AcafscedErrorDb2 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:33. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class AcafscedErrorDb2 extends AcafscedErrorDb2Serialized { 
   

								@Getter @Setter private int acafscedSqlcode;

						@Getter @Setter private char[] acafscedSqlca = Field.fillLowValue(136);

						@Getter @Setter private char[] acafscedClaveAcceso = Field.fillLowValue(200);
	
	/**
	* Constructor for AcafscedErrorDb2
	**/
    public AcafscedErrorDb2() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for AcafscedErrorDb2. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AcafscedErrorDb2(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes AcafscedErrorDb2
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setAcafscedSqlcode(0);
         setAcafscedSqlca(CONSTANTS.SPACE_136);
         setAcafscedClaveAcceso(CONSTANTS.SPACE_200);
   }


}
  
