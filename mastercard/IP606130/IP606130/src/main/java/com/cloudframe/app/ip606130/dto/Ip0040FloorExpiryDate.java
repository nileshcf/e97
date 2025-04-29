package com.cloudframe.app.ip606130.dto;

/**
*  The class Ip0040FloorExpiryDate is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:29. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ip0040FloorExpiryDate extends Ip0040FloorExpiryDateSerialized { 
   

								@Getter @Setter private int ip0040FloorExpiryCcyy;

								@Getter @Setter private int ip0040FloorExpiryMm;
	
	/**
	* Constructor for Ip0040FloorExpiryDate
	**/
    public Ip0040FloorExpiryDate() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip0040FloorExpiryDate. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip0040FloorExpiryDate(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip0040FloorExpiryDate
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp0040FloorExpiryCcyy(0);
                     setIp0040FloorExpiryMm(0);
   }


}
  
