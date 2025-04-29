package com.cloudframe.app.refmod3.dto;

/**
*  The class Wse220bT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:32. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Wse220bT extends Wse220bTSerialized { 
   

						@Getter @Setter private char[] wse220bTFld1 = Field.fillLowValue(10);

						@Getter @Setter private char[] wse220bTFld2 = Field.fillLowValue(20);

						@Getter @Setter private char[] wse220bTFld3 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse220bT
	**/
    public Wse220bT() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Wse220bT. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse220bT(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Wse220bT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse220bTFld1(CONSTANTS.SPACE_10);
         setWse220bTFld2(CONSTANTS.SPACE_20);
         setWse220bTFld3(CONSTANTS.SPACE_30);
   }


}
  
