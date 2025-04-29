package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip65504TagId is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ip65504TagId extends Ip65504TagIdSerialized { 
   

								@Getter @Setter private short ip65504TagType;

								@Getter @Setter private short ip65504TagNo;
	
	/**
	* Constructor for Ip65504TagId
	**/
    public Ip65504TagId() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip65504TagId. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504TagId(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip65504TagId
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setIp65504TagType((short)0);
         	setIp65504TagNo((short)0);
   }


}
  
