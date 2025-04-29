package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse5bT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Wse5bT extends Wse5bTSerialized { 
   

						@Getter @Setter private char[] wse5bTFld1 = Field.fillLowValue(20);

						@Getter @Setter private char[] wse5bTFld2 = Field.fillLowValue(40);

						@Getter @Setter private char[] wse5bTFld3 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse5bT
	**/
    public Wse5bT() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Wse5bT. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse5bT(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Wse5bT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse5bTFld1(CONSTANTS.SPACE_20);
         setWse5bTFld2(CONSTANTS.SPACE_40);
         setWse5bTFld3(CONSTANTS.SPACE_30);
   }


}
  
