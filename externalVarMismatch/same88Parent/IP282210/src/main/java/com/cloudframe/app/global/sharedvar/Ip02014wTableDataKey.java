package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip02014wTableDataKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip02014wTableDataKey extends Ip02014wTableDataKeySerialized { 
   

						@Getter @Setter private char[] ip02014wPrcssAgrmtId = Field.fillLowValue(11);
	
	/**
	* Constructor for Ip02014wTableDataKey
	**/
    public Ip02014wTableDataKey() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip02014wTableDataKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip02014wTableDataKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip02014wTableDataKey
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp02014wPrcssAgrmtId(CONSTANTS.SPACE_11);
   }


}
  
