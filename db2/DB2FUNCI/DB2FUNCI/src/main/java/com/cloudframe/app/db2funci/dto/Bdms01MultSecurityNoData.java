package com.cloudframe.app.db2funci.dto;

/**
*  The class Bdms01MultSecurityNoData is used to handle fields declared in it
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
public class Bdms01MultSecurityNoData extends Bdms01MultSecurityNoDataSerialized { 
   

								@Getter @Setter private int bdms01MultSecNoQty;
      private List<char[]> bdms01MultSecNo; 

      private List<char[]> bdms01MultSecType; 

	
	/**
	* Constructor for Bdms01MultSecurityNoData
	**/
    public Bdms01MultSecurityNoData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Bdms01MultSecurityNoData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01MultSecurityNoData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Bdms01MultSecurityNoData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setBdms01MultSecNoQty(0);
         for (int index =0; index < BDMS_01_MULT_SEC_NO_SIZE;index++) {
             setBdms01MultSecNo(index, CONSTANTS.SPACE_7);
         }
         for (int index =0; index < BDMS_01_MULT_SEC_TYPE_SIZE;index++) {
             setBdms01MultSecType(index, CONSTANTS.SPACE_2);
         }
   }


}
  
