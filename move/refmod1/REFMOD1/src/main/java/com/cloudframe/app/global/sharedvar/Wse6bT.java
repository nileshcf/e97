package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse6bT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Wse6bT extends Wse6bTSerialized { 
   

						@Getter @Setter private char[] wse6bTFld1 = Field.fillLowValue(10);

						@Getter @Setter private char[] wse6bTFld2 = Field.fillLowValue(20);

						@Getter @Setter private char[] wse6bTFld3 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse6bT
	**/
    public Wse6bT() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Wse6bT. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse6bT(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Wse6bT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse6bTFld1(CONSTANTS.SPACE_10);
         setWse6bTFld2(CONSTANTS.SPACE_20);
         setWse6bTFld3(CONSTANTS.SPACE_30);
   }


}
  
