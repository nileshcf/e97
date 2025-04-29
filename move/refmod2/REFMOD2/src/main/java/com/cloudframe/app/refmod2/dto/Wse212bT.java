package com.cloudframe.app.refmod2.dto;

/**
*  The class Wse212bT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Wse212bT extends Wse212bTSerialized { 
   

						@Getter @Setter private char[] wse212bTFld1 = Field.fillLowValue(10);

						@Getter @Setter private char[] wse212bTFld2 = Field.fillLowValue(20);

						@Getter @Setter private char[] wse212bTFld3 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse212bT
	**/
    public Wse212bT() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Wse212bT. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse212bT(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Wse212bT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse212bTFld1(CONSTANTS.SPACE_10);
         setWse212bTFld2(CONSTANTS.SPACE_20);
         setWse212bTFld3(CONSTANTS.SPACE_30);
   }


}
  
