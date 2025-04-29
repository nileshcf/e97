package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip50004iReadTableIdRedefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ip50004iReadTableIdRedefined extends Ip50004iReadTableIdRedefinedSerialized { 
   


								@Getter @Setter private int ip50004iReadTableNum;

	
	/**
	* Constructor for Ip50004iReadTableIdRedefined
	**/
    public Ip50004iReadTableIdRedefined() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip50004iReadTableIdRedefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip50004iReadTableIdRedefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip50004iReadTableIdRedefined
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp50004iReadTableNum(0);
   }


}
  
