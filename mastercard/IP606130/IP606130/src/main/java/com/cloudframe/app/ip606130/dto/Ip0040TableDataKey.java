package com.cloudframe.app.ip606130.dto;

/**
*  The class Ip0040TableDataKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:29. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip0040TableDataKey extends Ip0040TableDataKeySerialized { 
   

						@Getter @Setter private char[] ip0040AccRangeL = Field.fillLowValue(19);

						@Getter @Setter private char[] ip0040ProdId = Field.fillLowValue(3);
	
	/**
	* Constructor for Ip0040TableDataKey
	**/
    public Ip0040TableDataKey() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip0040TableDataKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip0040TableDataKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip0040TableDataKey
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp0040AccRangeL(CONSTANTS.SPACE_19);
         setIp0040ProdId(CONSTANTS.SPACE_3);
   }


}
  
