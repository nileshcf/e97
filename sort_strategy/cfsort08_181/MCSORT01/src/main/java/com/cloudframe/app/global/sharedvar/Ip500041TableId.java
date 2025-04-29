package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip500041TableId is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip500041TableId extends Ip500041TableIdSerialized { 
   


						@Getter @Setter private char[] ip500041TableNo = Field.fillLowValue(4);

						@Getter @Setter private char[] ip500041TableVersion = Field.fillLowValue(2);
	
	/**
	* Constructor for Ip500041TableId
	**/
    public Ip500041TableId() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip500041TableId. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip500041TableId(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip500041TableId
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp500041TableNo(CONSTANTS.SPACE_4);
         setIp500041TableVersion(CONSTANTS.SPACE_2);
   }


}
  
