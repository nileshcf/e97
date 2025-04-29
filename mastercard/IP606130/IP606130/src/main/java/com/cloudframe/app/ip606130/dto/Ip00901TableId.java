package com.cloudframe.app.ip606130.dto;

/**
*  The class Ip00901TableId is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:29. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip00901TableId extends Ip00901TableIdSerialized { 
   


						@Getter @Setter private char[] ip00901TableNo = Field.fillLowValue(4);

	
	/**
	* Constructor for Ip00901TableId
	**/
    public Ip00901TableId() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip00901TableId. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00901TableId(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip00901TableId
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp00901TableNo(CONSTANTS.SPACE_4);
   }


}
  
