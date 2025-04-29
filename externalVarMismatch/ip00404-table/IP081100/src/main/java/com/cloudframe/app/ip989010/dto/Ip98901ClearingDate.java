package com.cloudframe.app.ip989010.dto;

/**
*  The class Ip98901ClearingDate is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip98901ClearingDate extends Ip98901ClearingDateSerialized { 
   

						@Getter @Setter private char[] ip98901ClrDateYy = Field.fillLowValue(2);

						@Getter @Setter private char[] ip98901ClrDateMm = Field.fillLowValue(2);

						@Getter @Setter private char[] ip98901ClrDateDd = Field.fillLowValue(2);
	
	/**
	* Constructor for Ip98901ClearingDate
	**/
    public Ip98901ClearingDate() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip98901ClearingDate. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip98901ClearingDate(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip98901ClearingDate
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp98901ClrDateYy(CONSTANTS.SPACE_2);
         setIp98901ClrDateMm(CONSTANTS.SPACE_2);
         setIp98901ClrDateDd(CONSTANTS.SPACE_2);
   }


}
  
