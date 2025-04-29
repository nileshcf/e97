package com.cloudframe.app.db2funci.dto;

/**
*  The class MsdCashDivEx2Mmddyycc is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class MsdCashDivEx2Mmddyycc extends MsdCashDivEx2MmddyyccSerialized { 
   

								@Getter @Setter private long msdCashDivEx2Mmddyy;

								@Getter @Setter private int msdCashDivEx2Cc;
	
	/**
	* Constructor for MsdCashDivEx2Mmddyycc
	**/
    public MsdCashDivEx2Mmddyycc() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for MsdCashDivEx2Mmddyycc. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdCashDivEx2Mmddyycc(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes MsdCashDivEx2Mmddyycc
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setMsdCashDivEx2Mmddyy(0);
                     setMsdCashDivEx2Cc(0);
   }


}
  
