package com.cloudframe.app.db2func.dto;

/**
*  The class MsdCashDivEx1Mmddyycc is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class MsdCashDivEx1Mmddyycc extends MsdCashDivEx1MmddyyccSerialized { 
   

								@Getter @Setter private long msdCashDivEx1Mmddyy;

								@Getter @Setter private int msdCashDivEx1Cc;
	
	/**
	* Constructor for MsdCashDivEx1Mmddyycc
	**/
    public MsdCashDivEx1Mmddyycc() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for MsdCashDivEx1Mmddyycc. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdCashDivEx1Mmddyycc(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes MsdCashDivEx1Mmddyycc
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setMsdCashDivEx1Mmddyy(0);
                     setMsdCashDivEx1Cc(0);
   }


}
  
