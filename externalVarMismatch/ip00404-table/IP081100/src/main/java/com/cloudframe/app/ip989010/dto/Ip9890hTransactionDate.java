package com.cloudframe.app.ip989010.dto;

/**
*  The class Ip9890hTransactionDate is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip9890hTransactionDate extends Ip9890hTransactionDateSerialized { 
   

						@Getter @Setter private char[] ip9890hTxnDateYy = Field.fillLowValue(2);

						@Getter @Setter private char[] ip9890hTxnDateMm = Field.fillLowValue(2);

						@Getter @Setter private char[] ip9890hTxnDateDd = Field.fillLowValue(2);
	
	/**
	* Constructor for Ip9890hTransactionDate
	**/
    public Ip9890hTransactionDate() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip9890hTransactionDate. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip9890hTransactionDate(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip9890hTransactionDate
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp9890hTxnDateYy(CONSTANTS.SPACE_2);
         setIp9890hTxnDateMm(CONSTANTS.SPACE_2);
         setIp9890hTxnDateDd(CONSTANTS.SPACE_2);
   }


}
  
