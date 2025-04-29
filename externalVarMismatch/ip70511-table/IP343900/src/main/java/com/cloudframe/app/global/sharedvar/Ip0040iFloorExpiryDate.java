package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip0040iFloorExpiryDate is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ip0040iFloorExpiryDate extends Ip0040iFloorExpiryDateSerialized { 
   

								@Getter @Setter private int ip0040iFloorExpiryCcyy;

								@Getter @Setter private int ip0040iFloorExpiryMm;
	
	/**
	* Constructor for Ip0040iFloorExpiryDate
	**/
    public Ip0040iFloorExpiryDate() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip0040iFloorExpiryDate. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip0040iFloorExpiryDate(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip0040iFloorExpiryDate
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp0040iFloorExpiryCcyy(0);
                     setIp0040iFloorExpiryMm(0);
   }


}
  
