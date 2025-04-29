package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip67002Ccyy2Redefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ip67002Ccyy2Redefined extends Ip67002Ccyy2RedefinedSerialized { 
   

								@Getter @Setter private int ip67002Cc2;

								@Getter @Setter private int ip67002Yy2;
	
	/**
	* Constructor for Ip67002Ccyy2Redefined
	**/
    public Ip67002Ccyy2Redefined() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip67002Ccyy2Redefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip67002Ccyy2Redefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip67002Ccyy2Redefined
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp67002Cc2(0);
                     setIp67002Yy2(0);
   }


}
  
