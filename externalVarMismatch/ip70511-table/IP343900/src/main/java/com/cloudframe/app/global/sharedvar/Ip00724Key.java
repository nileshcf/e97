package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip00724Key is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ip00724Key extends Ip00724KeySerialized { 
   

								@Getter @Setter private long ip00724Ica;

						@Getter @Setter private char[] ip00724IcaRedX = Field.fillLowValue(11);
	
	/**
	* Constructor for Ip00724Key
	**/
    public Ip00724Key() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip00724Key. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00724Key(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip00724Key
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp00724Ica(0);
   }


}
  
