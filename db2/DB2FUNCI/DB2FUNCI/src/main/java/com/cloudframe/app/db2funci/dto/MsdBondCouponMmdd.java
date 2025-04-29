package com.cloudframe.app.db2funci.dto;

/**
*  The class MsdBondCouponMmdd is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class MsdBondCouponMmdd extends MsdBondCouponMmddSerialized { 
   

								@Getter @Setter private int msdBondCouponMm;

								@Getter @Setter private int msdBondCouponDd;
	
	/**
	* Constructor for MsdBondCouponMmdd
	**/
    public MsdBondCouponMmdd() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for MsdBondCouponMmdd. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdBondCouponMmdd(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes MsdBondCouponMmdd
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setMsdBondCouponMm(0);
                     setMsdBondCouponDd(0);
   }


}
  
