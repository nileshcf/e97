package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip00174CurrCdKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ip00174CurrCdKey extends Ip00174CurrCdKeySerialized { 
   

								@Getter @Setter private int ip00174CurrCdCode;
	
	/**
	* Constructor for Ip00174CurrCdKey
	**/
    public Ip00174CurrCdKey() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip00174CurrCdKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00174CurrCdKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip00174CurrCdKey
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp00174CurrCdCode(0);
   }


}
  
