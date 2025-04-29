package com.cloudframe.app.refmod3.dto;

/**
*  The class Wse218bT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:32. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Wse218bT extends Wse218bTSerialized { 
   

						@Getter @Setter private char[] wse218bTFld1 = Field.fillLowValue(10);

						@Getter @Setter private char[] wse218bTFld2 = Field.fillLowValue(20);

						@Getter @Setter private char[] wse218bTFld3 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse218bT
	**/
    public Wse218bT() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Wse218bT. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse218bT(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Wse218bT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse218bTFld1(CONSTANTS.SPACE_10);
         setWse218bTFld2(CONSTANTS.SPACE_20);
         setWse218bTFld3(CONSTANTS.SPACE_30);
   }


}
  
