package com.cloudframe.app.o529351u.dto;

/**
*  The class D51uOtherReq is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class D51uOtherReq extends D51uOtherReqSerialized { 
   

						@Getter @Setter private char[] d51uReqDosDate = Field.fillLowValue(8);
	
	/**
	* Constructor for D51uOtherReq
	**/
    public D51uOtherReq() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for D51uOtherReq. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public D51uOtherReq(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes D51uOtherReq
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setD51uReqDosDate(CONSTANTS.SPACE_8);
   }


}
  
