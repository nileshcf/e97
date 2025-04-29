package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip50201ExprYear is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip50201ExprYear extends Ip50201ExprYearSerialized { 
   

						@Getter @Setter private char[] ip50201ExprCc = Field.fillLowValue(2);

						@Getter @Setter private char[] ip50201ExprYy = Field.fillLowValue(2);
	
	/**
	* Constructor for Ip50201ExprYear
	**/
    public Ip50201ExprYear() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip50201ExprYear. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip50201ExprYear(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip50201ExprYear
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp50201ExprCc(CONSTANTS.SPACE_2);
         setIp50201ExprYy(CONSTANTS.SPACE_2);
   }


}
  
