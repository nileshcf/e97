package com.cloudframe.app.db2funci.dto;

/**
*  The class MsdCashDivPay2Mmddyycc is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class MsdCashDivPay2Mmddyycc extends MsdCashDivPay2MmddyyccSerialized { 
   

								@Getter @Setter private long msdCashDivPay2Mmddyy;

								@Getter @Setter private int msdCashDivPay2Cc;
	
	/**
	* Constructor for MsdCashDivPay2Mmddyycc
	**/
    public MsdCashDivPay2Mmddyycc() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for MsdCashDivPay2Mmddyycc. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdCashDivPay2Mmddyycc(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes MsdCashDivPay2Mmddyycc
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setMsdCashDivPay2Mmddyy(0);
                     setMsdCashDivPay2Cc(0);
   }


}
  
