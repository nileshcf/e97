package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip67002UtcOffsetHhmm is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ip67002UtcOffsetHhmm extends Ip67002UtcOffsetHhmmSerialized { 
   

								@Getter @Setter private int ip67002UtcOffsetHh;

								@Getter @Setter private int ip67002UtcOffsetMm;
	
	/**
	* Constructor for Ip67002UtcOffsetHhmm
	**/
    public Ip67002UtcOffsetHhmm() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip67002UtcOffsetHhmm. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip67002UtcOffsetHhmm(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip67002UtcOffsetHhmm
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp67002UtcOffsetHh(0);
                     setIp67002UtcOffsetMm(0);
   }


}
  
