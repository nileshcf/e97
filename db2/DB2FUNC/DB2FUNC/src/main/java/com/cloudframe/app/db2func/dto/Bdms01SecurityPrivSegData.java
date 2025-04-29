package com.cloudframe.app.db2func.dto;

/**
*  The class Bdms01SecurityPrivSegData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Bdms01SecurityPrivSegData extends Bdms01SecurityPrivSegDataSerialized { 
   

						@Getter @Setter private char[] bdms01PrivateSecInd = Field.fillLowValue(1);
	
	/**
	* Constructor for Bdms01SecurityPrivSegData
	**/
    public Bdms01SecurityPrivSegData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Bdms01SecurityPrivSegData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01SecurityPrivSegData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Bdms01SecurityPrivSegData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBdms01PrivateSecInd(CONSTANTS.SPACE);
   }


}
  
