package com.cloudframe.app.init1.dto;

/**
*  The class Rlu5fStartDate is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Rlu5fStartDate extends Rlu5fStartDateSerialized { 
   

						@Getter @Setter private char[] rlu5fStartDateMm = Field.fillLowValue(2);

						@Getter @Setter private char[] rlu5fStartDateDd = Field.fillLowValue(2);

						@Getter @Setter private char[] rlu5fStartDateCc = Field.fillLowValue(2);

						@Getter @Setter private char[] rlu5fStartDateYy = Field.fillLowValue(2);
	
	/**
	* Constructor for Rlu5fStartDate
	**/
    public Rlu5fStartDate() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Rlu5fStartDate. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Rlu5fStartDate(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Rlu5fStartDate
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setRlu5fStartDateMm(CONSTANTS.SPACE_2);
         setRlu5fStartDateDd(CONSTANTS.SPACE_2);
         setRlu5fStartDateCc(CONSTANTS.SPACE_2);
         setRlu5fStartDateYy(CONSTANTS.SPACE_2);
   }


}
  
