package com.cloudframe.app.db2func.dto;

/**
*  The class Bdms01MultAdpNoData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.List;
import com.cloudframe.app.data.Field;
import java.util.ArrayList;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Bdms01MultAdpNoData extends Bdms01MultAdpNoDataSerialized { 
   

								@Getter @Setter private int bdms01MultAdpNoQty;
      private List<char[]> bdms01MultAdpNo; 

      private List<char[]> bdms01MultCountry; 

	
	/**
	* Constructor for Bdms01MultAdpNoData
	**/
    public Bdms01MultAdpNoData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Bdms01MultAdpNoData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01MultAdpNoData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Bdms01MultAdpNoData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setBdms01MultAdpNoQty(0);
         for (int index =0; index < BDMS_01_MULT_ADP_NO_SIZE;index++) {
             setBdms01MultAdpNo(index, CONSTANTS.SPACE_7);
         }
         for (int index =0; index < BDMS_01_MULT_COUNTRY_SIZE;index++) {
             setBdms01MultCountry(index, CONSTANTS.SPACE_2);
         }
   }


}
  
