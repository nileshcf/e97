package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip00404FloorExpiryDate is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ip00404FloorExpiryDate extends Ip00404FloorExpiryDateSerialized { 
   

								@Getter @Setter private int ip00404FloorExpiryCcyy;

								@Getter @Setter private int ip00404FloorExpiryMm;
	
	/**
	* Constructor for Ip00404FloorExpiryDate
	**/
    public Ip00404FloorExpiryDate() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip00404FloorExpiryDate. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00404FloorExpiryDate(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip00404FloorExpiryDate
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp00404FloorExpiryCcyy(0);
                     setIp00404FloorExpiryMm(0);
   }


}
  
