package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip00404PrimaryCrncyTbl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ip00404PrimaryCrncyTbl extends Ip00404PrimaryCrncyTblSerialized { 
   

								@Getter @Setter private int ip00404CardPrimeTxnCur;

								@Getter @Setter private int ip00404CardPrimeBlngCur;

								@Getter @Setter private int ip00404CardPrimeBlngExp;
	
	/**
	* Constructor for Ip00404PrimaryCrncyTbl
	**/
    public Ip00404PrimaryCrncyTbl() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip00404PrimaryCrncyTbl. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00404PrimaryCrncyTbl(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip00404PrimaryCrncyTbl
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp00404CardPrimeTxnCur(0);
                     setIp00404CardPrimeBlngCur(0);
                     setIp00404CardPrimeBlngExp(0);
   }


}
  
