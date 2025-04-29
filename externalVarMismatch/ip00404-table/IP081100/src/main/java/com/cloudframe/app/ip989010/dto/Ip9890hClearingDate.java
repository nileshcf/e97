package com.cloudframe.app.ip989010.dto;

/**
*  The class Ip9890hClearingDate is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip9890hClearingDate extends Ip9890hClearingDateSerialized { 
   

						@Getter @Setter private char[] ip9890hClrDateYy = Field.fillLowValue(2);

						@Getter @Setter private char[] ip9890hClrDateMm = Field.fillLowValue(2);

						@Getter @Setter private char[] ip9890hClrDateDd = Field.fillLowValue(2);
	
	/**
	* Constructor for Ip9890hClearingDate
	**/
    public Ip9890hClearingDate() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip9890hClearingDate. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip9890hClearingDate(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip9890hClearingDate
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp9890hClrDateYy(CONSTANTS.SPACE_2);
         setIp9890hClrDateMm(CONSTANTS.SPACE_2);
         setIp9890hClrDateDd(CONSTANTS.SPACE_2);
   }


}
  
