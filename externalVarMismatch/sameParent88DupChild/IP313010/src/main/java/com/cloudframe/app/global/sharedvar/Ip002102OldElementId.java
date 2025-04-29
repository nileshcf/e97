package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip002102OldElementId is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ip002102OldElementId extends Ip002102OldElementIdSerialized { 
   

								@Getter @Setter private short ip002102OldElementType;

								@Getter @Setter private short ip002102OldElementNo;
	
	/**
	* Constructor for Ip002102OldElementId
	**/
    public Ip002102OldElementId() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip002102OldElementId. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip002102OldElementId(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip002102OldElementId
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setIp002102OldElementType((short)0);
         	setIp002102OldElementNo((short)0);
   }


}
  
