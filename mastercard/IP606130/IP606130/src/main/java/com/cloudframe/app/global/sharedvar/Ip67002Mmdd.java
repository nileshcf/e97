package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip67002Mmdd is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:29. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ip67002Mmdd extends Ip67002MmddSerialized { 
   

								@Getter @Setter private int ip67002Mm;

								@Getter @Setter private int ip67002Dd;
	
	/**
	* Constructor for Ip67002Mmdd
	**/
    public Ip67002Mmdd() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip67002Mmdd. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip67002Mmdd(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip67002Mmdd
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp67002Mm(0);
                     setIp67002Dd(0);
   }


}
  
