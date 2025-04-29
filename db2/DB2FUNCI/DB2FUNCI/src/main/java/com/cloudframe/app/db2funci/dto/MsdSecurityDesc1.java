package com.cloudframe.app.db2funci.dto;

/**
*  The class MsdSecurityDesc1 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class MsdSecurityDesc1 extends MsdSecurityDesc1Serialized { 
   

						@Getter @Setter private char[] msdFiller = Field.fillLowValue(3);

						@Getter @Setter private char[] msdFiller2 = Field.fillLowValue(27);
	
	/**
	* Constructor for MsdSecurityDesc1
	**/
    public MsdSecurityDesc1() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for MsdSecurityDesc1. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdSecurityDesc1(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes MsdSecurityDesc1
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setMsdFiller(CONSTANTS.SPACE_3);
         setMsdFiller2(CONSTANTS.SPACE_27);
   }


}
  
