package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip02014lTableDataKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip02014lTableDataKey extends Ip02014lTableDataKeySerialized { 
   

						@Getter @Setter private char[] ip02014lPrcssAgrmtId = Field.fillLowValue(11);
	
	/**
	* Constructor for Ip02014lTableDataKey
	**/
    public Ip02014lTableDataKey() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip02014lTableDataKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip02014lTableDataKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip02014lTableDataKey
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp02014lPrcssAgrmtId(CONSTANTS.SPACE_11);
   }


}
  
