package com.cloudframe.app.vsammon1.file.records;

/**
*  The class MonXcdtTskStrtDt is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:31. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class MonXcdtTskStrtDt extends MonXcdtTskStrtDtSerialized { 
   

						@Getter @Setter private char[] monXcdtTskStrtDtYyyy = Field.fillLowValue(4);


						@Getter @Setter private char[] monXcdtTskStrtDtMm = Field.fillLowValue(2);


						@Getter @Setter private char[] monXcdtTskStrtDtDd = Field.fillLowValue(2);
	
	/**
	* Constructor for MonXcdtTskStrtDt
	**/
    public MonXcdtTskStrtDt() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for MonXcdtTskStrtDt. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MonXcdtTskStrtDt(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes MonXcdtTskStrtDt
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setMonXcdtTskStrtDtYyyy(CONSTANTS.SPACE_4);
         setMonXcdtTskStrtDtMm(CONSTANTS.SPACE_2);
         setMonXcdtTskStrtDtDd(CONSTANTS.SPACE_2);
   }


}
  
