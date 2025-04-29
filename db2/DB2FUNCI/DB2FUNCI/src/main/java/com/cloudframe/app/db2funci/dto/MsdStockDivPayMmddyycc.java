package com.cloudframe.app.db2funci.dto;

/**
*  The class MsdStockDivPayMmddyycc is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class MsdStockDivPayMmddyycc extends MsdStockDivPayMmddyyccSerialized { 
   

								@Getter @Setter private long msdStockDivPayMmddyy;

								@Getter @Setter private int msdStockDivPayCc;
	
	/**
	* Constructor for MsdStockDivPayMmddyycc
	**/
    public MsdStockDivPayMmddyycc() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for MsdStockDivPayMmddyycc. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdStockDivPayMmddyycc(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes MsdStockDivPayMmddyycc
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setMsdStockDivPayMmddyy(0);
                     setMsdStockDivPayCc(0);
   }


}
  
