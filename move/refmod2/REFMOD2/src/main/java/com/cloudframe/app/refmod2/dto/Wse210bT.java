package com.cloudframe.app.refmod2.dto;

/**
*  The class Wse210bT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Wse210bT extends Wse210bTSerialized { 
   

						@Getter @Setter private char[] wse210bTFld1 = Field.fillLowValue(10);

						@Getter @Setter private char[] wse210bTFld2 = Field.fillLowValue(20);

						@Getter @Setter private char[] wse210bTFld3 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse210bT
	**/
    public Wse210bT() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Wse210bT. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse210bT(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Wse210bT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse210bTFld1(CONSTANTS.SPACE_10);
         setWse210bTFld2(CONSTANTS.SPACE_20);
         setWse210bTFld3(CONSTANTS.SPACE_30);
   }


}
  
