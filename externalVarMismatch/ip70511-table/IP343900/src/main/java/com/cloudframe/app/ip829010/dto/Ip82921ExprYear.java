package com.cloudframe.app.ip829010.dto;

/**
*  The class Ip82921ExprYear is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip82921ExprYear extends Ip82921ExprYearSerialized { 
   

						@Getter @Setter private char[] ip82921ExprCc = Field.fillLowValue(2);

						@Getter @Setter private char[] ip82921ExprYy = Field.fillLowValue(2);
	
	/**
	* Constructor for Ip82921ExprYear
	**/
    public Ip82921ExprYear() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip82921ExprYear. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip82921ExprYear(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip82921ExprYear
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp82921ExprCc(CONSTANTS.SPACE_2);
         setIp82921ExprYy(CONSTANTS.SPACE_2);
   }


}
  
