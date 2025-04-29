package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse18bT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Wse18bT extends Wse18bTSerialized { 
   

						@Getter @Setter private char[] wse18bTFld1 = Field.fillLowValue(10);

						@Getter @Setter private char[] wse18bTFld2 = Field.fillLowValue(20);

						@Getter @Setter private char[] wse18bTFld3 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse18bT
	**/
    public Wse18bT() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Wse18bT. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse18bT(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Wse18bT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse18bTFld1(CONSTANTS.SPACE_10);
         setWse18bTFld2(CONSTANTS.SPACE_20);
         setWse18bTFld3(CONSTANTS.SPACE_30);
   }


}
  
