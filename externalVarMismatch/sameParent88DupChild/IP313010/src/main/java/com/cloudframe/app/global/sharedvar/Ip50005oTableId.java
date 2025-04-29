package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip50005oTableId is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip50005oTableId extends Ip50005oTableIdSerialized { 
   


						@Getter @Setter private char[] ip50005oTableNo = Field.fillLowValue(4);

						@Getter @Setter private char[] ip50005oTableVersion = Field.fillLowValue(2);
	
	/**
	* Constructor for Ip50005oTableId
	**/
    public Ip50005oTableId() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip50005oTableId. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip50005oTableId(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip50005oTableId
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp50005oTableNo(CONSTANTS.SPACE_4);
         setIp50005oTableVersion(CONSTANTS.SPACE_2);
   }


}
  
