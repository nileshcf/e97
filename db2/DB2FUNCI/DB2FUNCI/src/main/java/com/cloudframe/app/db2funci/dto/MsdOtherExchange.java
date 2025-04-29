package com.cloudframe.app.db2funci.dto;

/**
*  The class MsdOtherExchange is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.List;
import com.cloudframe.app.data.Field;
import java.util.ArrayList;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class MsdOtherExchange extends MsdOtherExchangeSerialized { 
   
      private List<char[]> msdOthExch; 

	
	/**
	* Constructor for MsdOtherExchange
	**/
    public MsdOtherExchange() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for MsdOtherExchange. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdOtherExchange(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes MsdOtherExchange
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         for (int index =0; index < MSD_OTH_EXCH_SIZE;index++) {
             setMsdOthExch(index, CONSTANTS.SPACE);
         }
   }


}
  
