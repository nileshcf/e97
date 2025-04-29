package com.cloudframe.app.db2func.dto;

/**
*  The class MsdStockDivRecMmddyycc is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class MsdStockDivRecMmddyycc extends MsdStockDivRecMmddyyccSerialized { 
   

								@Getter @Setter private long msdStockDivRecMmddyy;

								@Getter @Setter private int msdStockDivRecCc;
	
	/**
	* Constructor for MsdStockDivRecMmddyycc
	**/
    public MsdStockDivRecMmddyycc() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for MsdStockDivRecMmddyycc. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdStockDivRecMmddyycc(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes MsdStockDivRecMmddyycc
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setMsdStockDivRecMmddyy(0);
                     setMsdStockDivRecCc(0);
   }


}
  
