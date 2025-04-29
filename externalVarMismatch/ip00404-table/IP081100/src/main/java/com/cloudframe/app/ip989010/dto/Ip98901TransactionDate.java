package com.cloudframe.app.ip989010.dto;

/**
*  The class Ip98901TransactionDate is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip98901TransactionDate extends Ip98901TransactionDateSerialized { 
   

						@Getter @Setter private char[] ip98901TxnDateYy = Field.fillLowValue(2);

						@Getter @Setter private char[] ip98901TxnDateMm = Field.fillLowValue(2);

						@Getter @Setter private char[] ip98901TxnDateDd = Field.fillLowValue(2);
	
	/**
	* Constructor for Ip98901TransactionDate
	**/
    public Ip98901TransactionDate() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip98901TransactionDate. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip98901TransactionDate(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip98901TransactionDate
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp98901TxnDateYy(CONSTANTS.SPACE_2);
         setIp98901TxnDateMm(CONSTANTS.SPACE_2);
         setIp98901TxnDateDd(CONSTANTS.SPACE_2);
   }


}
  
