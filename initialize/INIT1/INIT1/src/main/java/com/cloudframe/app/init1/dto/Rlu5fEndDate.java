package com.cloudframe.app.init1.dto;

/**
*  The class Rlu5fEndDate is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Rlu5fEndDate extends Rlu5fEndDateSerialized { 
   

						@Getter @Setter private char[] rlu5fEndDateMm = Field.fillLowValue(2);

						@Getter @Setter private char[] rlu5fEndDateDd = Field.fillLowValue(2);

						@Getter @Setter private char[] rlu5fEndDateCc = Field.fillLowValue(2);

						@Getter @Setter private char[] rlu5fEndDateYy = Field.fillLowValue(2);
	
	/**
	* Constructor for Rlu5fEndDate
	**/
    public Rlu5fEndDate() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Rlu5fEndDate. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Rlu5fEndDate(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Rlu5fEndDate
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setRlu5fEndDateMm(CONSTANTS.SPACE_2);
         setRlu5fEndDateDd(CONSTANTS.SPACE_2);
         setRlu5fEndDateCc(CONSTANTS.SPACE_2);
         setRlu5fEndDateYy(CONSTANTS.SPACE_2);
   }


}
  
