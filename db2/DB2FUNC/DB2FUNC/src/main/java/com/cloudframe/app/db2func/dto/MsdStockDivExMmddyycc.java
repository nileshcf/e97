package com.cloudframe.app.db2func.dto;

/**
*  The class MsdStockDivExMmddyycc is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class MsdStockDivExMmddyycc extends MsdStockDivExMmddyyccSerialized { 
   

								@Getter @Setter private long msdStockDivExMmddyy;

								@Getter @Setter private int msdStockDivExCc;
	
	/**
	* Constructor for MsdStockDivExMmddyycc
	**/
    public MsdStockDivExMmddyycc() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for MsdStockDivExMmddyycc. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdStockDivExMmddyycc(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes MsdStockDivExMmddyycc
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setMsdStockDivExMmddyy(0);
                     setMsdStockDivExCc(0);
   }


}
  
