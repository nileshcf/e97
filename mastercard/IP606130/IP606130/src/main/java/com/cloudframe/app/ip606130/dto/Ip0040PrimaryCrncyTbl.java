package com.cloudframe.app.ip606130.dto;

/**
*  The class Ip0040PrimaryCrncyTbl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:29. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ip0040PrimaryCrncyTbl extends Ip0040PrimaryCrncyTblSerialized { 
   

								@Getter @Setter private int ip0040CardPrimeTxnCur;

								@Getter @Setter private int ip0040CardPrimeBlngCur;

								@Getter @Setter private int ip0040CardPrimeBlngExp;
	
	/**
	* Constructor for Ip0040PrimaryCrncyTbl
	**/
    public Ip0040PrimaryCrncyTbl() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip0040PrimaryCrncyTbl. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip0040PrimaryCrncyTbl(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip0040PrimaryCrncyTbl
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp0040CardPrimeTxnCur(0);
                     setIp0040CardPrimeBlngCur(0);
                     setIp0040CardPrimeBlngExp(0);
   }


}
  
