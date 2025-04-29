package com.cloudframe.app.init1.dto;

/**
*  The class CmnErrMsgArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.List;
import com.cloudframe.app.data.Field;
import java.util.ArrayList;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class CmnErrMsgArea extends CmnErrMsgAreaSerialized { 
   
      private List<char[]> cmnErrText; 

	
	/**
	* Constructor for CmnErrMsgArea
	**/
    public CmnErrMsgArea() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for CmnErrMsgArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnErrMsgArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes CmnErrMsgArea
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         for (int index =0; index < CMN_ERR_TEXT_SIZE;index++) {
             setCmnErrText(index, CONSTANTS.SPACE_64);
         }
   }


}
  
