package com.cloudframe.app.bm8090m.dto;

/**
*  The class WAstPapPe8090m is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class WAstPapPe8090m extends WAstPapPe8090mSerialized { 
   

						@Getter @Setter private char[] wAstPe8090m = Field.fillLowValue(1);

						@Getter @Setter private char[] wPapPe8090m = Field.fillLowValue(19);
	
	/**
	* Constructor for WAstPapPe8090m
	**/
    public WAstPapPe8090m() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for WAstPapPe8090m. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WAstPapPe8090m(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes WAstPapPe8090m
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWAstPe8090m(CONSTANTS.SPACE);
         setWPapPe8090m(CONSTANTS.SPACE_19);
   }


}
  
