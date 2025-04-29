package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse16bT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Wse16bT extends Wse16bTSerialized { 
   

						@Getter @Setter private char[] wse16bTFld1 = Field.fillLowValue(10);

						@Getter @Setter private char[] wse16bTFld2 = Field.fillLowValue(20);

						@Getter @Setter private char[] wse16bTFld3 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse16bT
	**/
    public Wse16bT() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Wse16bT. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse16bT(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Wse16bT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse16bTFld1(CONSTANTS.SPACE_10);
         setWse16bTFld2(CONSTANTS.SPACE_20);
         setWse16bTFld3(CONSTANTS.SPACE_30);
   }


}
  
