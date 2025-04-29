package com.cloudframe.app.db2funci.dto;

/**
*  The class MsdCashDivRec1Mmddyycc is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class MsdCashDivRec1Mmddyycc extends MsdCashDivRec1MmddyyccSerialized { 
   

								@Getter @Setter private long msdCashDivRec1Mmddyy;

								@Getter @Setter private int msdCashDivRec1Cc;
	
	/**
	* Constructor for MsdCashDivRec1Mmddyycc
	**/
    public MsdCashDivRec1Mmddyycc() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for MsdCashDivRec1Mmddyycc. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdCashDivRec1Mmddyycc(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes MsdCashDivRec1Mmddyycc
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setMsdCashDivRec1Mmddyy(0);
                     setMsdCashDivRec1Cc(0);
   }


}
  
