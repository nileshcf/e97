package com.cloudframe.app.bm8090m.dto;

/**
*  The class WAstJurPe8090m is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class WAstJurPe8090m extends WAstJurPe8090mSerialized { 
   

						@Getter @Setter private char[] wEstPe8090m = Field.fillLowValue(1);

						@Getter @Setter private char[] wJurPe8090m = Field.fillLowValue(59);
	
	/**
	* Constructor for WAstJurPe8090m
	**/
    public WAstJurPe8090m() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for WAstJurPe8090m. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WAstJurPe8090m(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes WAstJurPe8090m
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWEstPe8090m(CONSTANTS.SPACE);
         setWJurPe8090m(CONSTANTS.SPACE_59);
   }


}
  
