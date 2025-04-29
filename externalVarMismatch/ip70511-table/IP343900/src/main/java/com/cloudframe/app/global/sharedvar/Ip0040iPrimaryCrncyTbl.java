package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip0040iPrimaryCrncyTbl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ip0040iPrimaryCrncyTbl extends Ip0040iPrimaryCrncyTblSerialized { 
   

								@Getter @Setter private int ip0040iCardPrimeTxnCur;

								@Getter @Setter private int ip0040iCardPrimeBlngCur;

								@Getter @Setter private int ip0040iCardPrimeBlngExp;
	
	/**
	* Constructor for Ip0040iPrimaryCrncyTbl
	**/
    public Ip0040iPrimaryCrncyTbl() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip0040iPrimaryCrncyTbl. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip0040iPrimaryCrncyTbl(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip0040iPrimaryCrncyTbl
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp0040iCardPrimeTxnCur(0);
                     setIp0040iCardPrimeBlngCur(0);
                     setIp0040iCardPrimeBlngExp(0);
   }


}
  
