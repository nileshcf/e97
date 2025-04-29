package com.cloudframe.app.db2funci.dto;

/**
*  The class MsdSecTypeCodes is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class MsdSecTypeCodes extends MsdSecTypeCodesSerialized { 
   

						@Getter @Setter private char[] msdSecTypePos2 = Field.fillLowValue(1);

						@Getter @Setter private char[] msdSecTypePos3 = Field.fillLowValue(1);

						@Getter @Setter private char[] msdSecTypePos4 = Field.fillLowValue(1);

						@Getter @Setter private char[] msdSecTypePos5 = Field.fillLowValue(1);

						@Getter @Setter private char[] msdSecTypePos6 = Field.fillLowValue(1);

						@Getter @Setter private char[] msdSecTypePos7 = Field.fillLowValue(1);
	
	/**
	* Constructor for MsdSecTypeCodes
	**/
    public MsdSecTypeCodes() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for MsdSecTypeCodes. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdSecTypeCodes(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes MsdSecTypeCodes
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setMsdSecTypePos2(CONSTANTS.SPACE);
         setMsdSecTypePos3(CONSTANTS.SPACE);
         setMsdSecTypePos4(CONSTANTS.SPACE);
         setMsdSecTypePos5(CONSTANTS.SPACE);
         setMsdSecTypePos6(CONSTANTS.SPACE);
         setMsdSecTypePos7(CONSTANTS.SPACE);
   }


}
  
