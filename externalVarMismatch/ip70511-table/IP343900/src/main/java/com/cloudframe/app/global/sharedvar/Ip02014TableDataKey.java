package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip02014TableDataKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip02014TableDataKey extends Ip02014TableDataKeySerialized { 
   

						@Getter @Setter private char[] ip02014PrcssAgrmtId = Field.fillLowValue(11);
	
	/**
	* Constructor for Ip02014TableDataKey
	**/
    public Ip02014TableDataKey() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip02014TableDataKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip02014TableDataKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip02014TableDataKey
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp02014PrcssAgrmtId(CONSTANTS.SPACE_11);
   }


}
  
