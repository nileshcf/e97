package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip002102NewElementId is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ip002102NewElementId extends Ip002102NewElementIdSerialized { 
   

								@Getter @Setter private short ip002102NewElementType;

								@Getter @Setter private short ip002102NewElementNo;
	
	/**
	* Constructor for Ip002102NewElementId
	**/
    public Ip002102NewElementId() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip002102NewElementId. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip002102NewElementId(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip002102NewElementId
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setIp002102NewElementType((short)0);
         	setIp002102NewElementNo((short)0);
   }


}
  
