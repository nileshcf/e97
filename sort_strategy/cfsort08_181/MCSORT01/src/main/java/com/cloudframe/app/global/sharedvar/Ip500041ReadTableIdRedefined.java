package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip500041ReadTableIdRedefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ip500041ReadTableIdRedefined extends Ip500041ReadTableIdRedefinedSerialized { 
   


								@Getter @Setter private int ip500041ReadTableNum;

	
	/**
	* Constructor for Ip500041ReadTableIdRedefined
	**/
    public Ip500041ReadTableIdRedefined() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip500041ReadTableIdRedefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip500041ReadTableIdRedefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip500041ReadTableIdRedefined
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp500041ReadTableNum(0);
   }


}
  
