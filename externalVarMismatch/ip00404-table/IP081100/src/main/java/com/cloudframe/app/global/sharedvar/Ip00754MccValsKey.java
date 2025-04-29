package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip00754MccValsKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ip00754MccValsKey extends Ip00754MccValsKeySerialized { 
   

								@Getter @Setter private int ip00754MccVals;
	
	/**
	* Constructor for Ip00754MccValsKey
	**/
    public Ip00754MccValsKey() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip00754MccValsKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00754MccValsKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip00754MccValsKey
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp00754MccVals(0);
   }


}
  
