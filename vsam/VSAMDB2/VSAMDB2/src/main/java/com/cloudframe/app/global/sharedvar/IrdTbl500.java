package com.cloudframe.app.global.sharedvar;

/**
*  The class IrdTbl500 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:29. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class IrdTbl500 extends IrdTbl500Serialized { 
   

						@Getter @Setter private char[] ird500 = Field.fillLowValue(2);

						@Getter @Setter private char[] irdResStatus500 = Field.fillLowValue(1);
	
	/**
	* Constructor for IrdTbl500
	**/
    public IrdTbl500() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for IrdTbl500. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public IrdTbl500(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes IrdTbl500
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIrd500(CONSTANTS.SPACE_2);
         setIrdResStatus500(CONSTANTS.SPACE);
   }


}
  
