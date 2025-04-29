package com.cloudframe.app.refmod2.dto;

/**
*  The class Wse211bT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Wse211bT extends Wse211bTSerialized { 
   

						@Getter @Setter private char[] wse211bTFld1 = Field.fillLowValue(10);

						@Getter @Setter private char[] wse211bTFld2 = Field.fillLowValue(20);

						@Getter @Setter private char[] wse211bTFld3 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse211bT
	**/
    public Wse211bT() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Wse211bT. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse211bT(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Wse211bT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse211bTFld1(CONSTANTS.SPACE_10);
         setWse211bTFld2(CONSTANTS.SPACE_20);
         setWse211bTFld3(CONSTANTS.SPACE_30);
   }


}
  
