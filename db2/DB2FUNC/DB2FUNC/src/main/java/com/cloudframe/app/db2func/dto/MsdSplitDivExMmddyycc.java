package com.cloudframe.app.db2func.dto;

/**
*  The class MsdSplitDivExMmddyycc is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class MsdSplitDivExMmddyycc extends MsdSplitDivExMmddyyccSerialized { 
   

								@Getter @Setter private long msdSplitDivExMmddyy;

								@Getter @Setter private int msdSplitDivExCc;
	
	/**
	* Constructor for MsdSplitDivExMmddyycc
	**/
    public MsdSplitDivExMmddyycc() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for MsdSplitDivExMmddyycc. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdSplitDivExMmddyycc(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes MsdSplitDivExMmddyycc
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setMsdSplitDivExMmddyy(0);
                     setMsdSplitDivExCc(0);
   }


}
  
