package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip67002Yyddd is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:29. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ip67002Yyddd extends Ip67002YydddSerialized { 
   

								@Getter @Setter private int ip67002YyJul;

								@Getter @Setter private int ip67002Ddd;
	
	/**
	* Constructor for Ip67002Yyddd
	**/
    public Ip67002Yyddd() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip67002Yyddd. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip67002Yyddd(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip67002Yyddd
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp67002YyJul(0);
                     setIp67002Ddd(0);
   }


}
  
