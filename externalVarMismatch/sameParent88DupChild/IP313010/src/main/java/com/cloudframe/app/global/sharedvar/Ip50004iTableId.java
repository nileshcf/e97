package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip50004iTableId is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip50004iTableId extends Ip50004iTableIdSerialized { 
   


						@Getter @Setter private char[] ip50004iTableNo = Field.fillLowValue(4);

						@Getter @Setter private char[] ip50004iTableVersion = Field.fillLowValue(2);
	
	/**
	* Constructor for Ip50004iTableId
	**/
    public Ip50004iTableId() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip50004iTableId. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip50004iTableId(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip50004iTableId
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp50004iTableNo(CONSTANTS.SPACE_4);
         setIp50004iTableVersion(CONSTANTS.SPACE_2);
   }


}
  
