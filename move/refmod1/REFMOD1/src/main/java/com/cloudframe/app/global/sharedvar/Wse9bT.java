package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse9bT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Wse9bT extends Wse9bTSerialized { 
   

						@Getter @Setter private char[] wse9bTFld1 = Field.fillLowValue(10);

						@Getter @Setter private char[] wse9bTFld2 = Field.fillLowValue(20);

						@Getter @Setter private char[] wse9bTFld3 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse9bT
	**/
    public Wse9bT() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Wse9bT. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse9bT(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Wse9bT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse9bTFld1(CONSTANTS.SPACE_10);
         setWse9bTFld2(CONSTANTS.SPACE_20);
         setWse9bTFld3(CONSTANTS.SPACE_30);
   }


}
  
