package com.cloudframe.app.db2func.dto;

/**
*  The class MsdCashDivPay1Mmddyycc is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class MsdCashDivPay1Mmddyycc extends MsdCashDivPay1MmddyyccSerialized { 
   

								@Getter @Setter private long msdCashDivPay1Mmddyy;

								@Getter @Setter private int msdCashDivPay1Cc;
	
	/**
	* Constructor for MsdCashDivPay1Mmddyycc
	**/
    public MsdCashDivPay1Mmddyycc() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for MsdCashDivPay1Mmddyycc. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdCashDivPay1Mmddyycc(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes MsdCashDivPay1Mmddyycc
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setMsdCashDivPay1Mmddyy(0);
                     setMsdCashDivPay1Cc(0);
   }


}
  
