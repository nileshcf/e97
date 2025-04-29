package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse7bT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Wse7bT extends Wse7bTSerialized { 
   

						@Getter @Setter private char[] wse7bTFld1 = Field.fillLowValue(10);

						@Getter @Setter private char[] wse7bTFld2 = Field.fillLowValue(20);

						@Getter @Setter private char[] wse7bTFld3 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse7bT
	**/
    public Wse7bT() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Wse7bT. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse7bT(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Wse7bT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse7bTFld1(CONSTANTS.SPACE_10);
         setWse7bTFld2(CONSTANTS.SPACE_20);
         setWse7bTFld3(CONSTANTS.SPACE_30);
   }


}
  
