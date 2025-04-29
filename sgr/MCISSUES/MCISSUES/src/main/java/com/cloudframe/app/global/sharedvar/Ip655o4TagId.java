package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip655o4TagId is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ip655o4TagId extends Ip655o4TagIdSerialized { 
   

								@Getter @Setter private short ip655o4TagType;

								@Getter @Setter private short ip655o4TagNo;
	
	/**
	* Constructor for Ip655o4TagId
	**/
    public Ip655o4TagId() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip655o4TagId. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip655o4TagId(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip655o4TagId
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setIp655o4TagType((short)0);
         	setIp655o4TagNo((short)0);
   }


}
  
