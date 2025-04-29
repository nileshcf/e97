package com.cloudframe.app.db2funci.dto;

/**
*  The class MsdSplitDivPayMmddyycc is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class MsdSplitDivPayMmddyycc extends MsdSplitDivPayMmddyyccSerialized { 
   

								@Getter @Setter private long msdSplitDivPayMmddyy;

								@Getter @Setter private int msdSplitDivPayCc;
	
	/**
	* Constructor for MsdSplitDivPayMmddyycc
	**/
    public MsdSplitDivPayMmddyycc() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for MsdSplitDivPayMmddyycc. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdSplitDivPayMmddyycc(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes MsdSplitDivPayMmddyycc
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setMsdSplitDivPayMmddyy(0);
                     setMsdSplitDivPayCc(0);
   }


}
  
