package com.cloudframe.app.refmod1.dto;

/**
*  The class Wse1bT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Wse1bT extends Wse1bTSerialized { 
   

						@Getter @Setter private char[] wse1bTFld1 = Field.fillLowValue(10);

						@Getter @Setter private char[] wse1bTFld2 = Field.fillLowValue(20);

						@Getter @Setter private char[] wse1bTFld3 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse1bT
	**/
    public Wse1bT() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Wse1bT. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse1bT(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Wse1bT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse1bTFld1(CONSTANTS.SPACE_10);
         setWse1bTFld2(CONSTANTS.SPACE_20);
         setWse1bTFld3(CONSTANTS.SPACE_30);
   }


}
  
