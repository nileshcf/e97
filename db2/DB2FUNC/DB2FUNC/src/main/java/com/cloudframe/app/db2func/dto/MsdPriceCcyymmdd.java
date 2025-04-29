package com.cloudframe.app.db2func.dto;

/**
*  The class MsdPriceCcyymmdd is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class MsdPriceCcyymmdd extends MsdPriceCcyymmddSerialized { 
   

								@Getter @Setter private int msdPriceCc;

								@Getter @Setter private long msdPriceYymmdd;
	
	/**
	* Constructor for MsdPriceCcyymmdd
	**/
    public MsdPriceCcyymmdd() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for MsdPriceCcyymmdd. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdPriceCcyymmdd(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes MsdPriceCcyymmdd
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setMsdPriceCc(0);
                     setMsdPriceYymmdd(0);
   }


}
  
