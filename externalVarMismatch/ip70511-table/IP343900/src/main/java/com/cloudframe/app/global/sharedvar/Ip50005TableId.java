package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip50005TableId is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip50005TableId extends Ip50005TableIdSerialized { 
   


						@Getter @Setter private char[] ip50005TableNo = Field.fillLowValue(4);

						@Getter @Setter private char[] ip50005TableVersion = Field.fillLowValue(2);
	
	/**
	* Constructor for Ip50005TableId
	**/
    public Ip50005TableId() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip50005TableId. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip50005TableId(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip50005TableId
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp50005TableNo(CONSTANTS.SPACE_4);
         setIp50005TableVersion(CONSTANTS.SPACE_2);
   }


}
  
