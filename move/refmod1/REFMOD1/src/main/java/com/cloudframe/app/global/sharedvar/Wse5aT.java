package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse5aT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Wse5aT extends Wse5aTSerialized { 
   

						@Getter @Setter private char[] wse5aTFld1 = Field.fillLowValue(20);

						@Getter @Setter private char[] wse5aTFld2 = Field.fillLowValue(40);
	
	/**
	* Constructor for Wse5aT
	**/
    public Wse5aT() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Wse5aT. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse5aT(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Wse5aT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse5aTFld1(CONSTANTS.SPACE_20);
         setWse5aTFld2(CONSTANTS.SPACE_40);
   }


}
  
