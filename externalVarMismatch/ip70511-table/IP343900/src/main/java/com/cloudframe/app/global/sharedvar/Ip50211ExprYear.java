package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip50211ExprYear is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip50211ExprYear extends Ip50211ExprYearSerialized { 
   

						@Getter @Setter private char[] ip50211ExprCc = Field.fillLowValue(2);

						@Getter @Setter private char[] ip50211ExprYy = Field.fillLowValue(2);
	
	/**
	* Constructor for Ip50211ExprYear
	**/
    public Ip50211ExprYear() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip50211ExprYear. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip50211ExprYear(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip50211ExprYear
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp50211ExprCc(CONSTANTS.SPACE_2);
         setIp50211ExprYy(CONSTANTS.SPACE_2);
   }


}
  
