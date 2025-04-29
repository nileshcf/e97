package com.cloudframe.app.init1.dto;

/**
*  The class CmnDateTimeOutputArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class CmnDateTimeOutputArea extends CmnDateTimeOutputAreaSerialized { 
   

								@Getter @Setter private int cmnDateTimeReturnCode;

						@Getter @Setter private char[] cmnDateRetrieved = Field.fillLowValue(10);
				@Getter @Setter private CmnDateRetrievedR cmnDateRetrievedR = new CmnDateRetrievedR();

						@Getter @Setter private char[] cmnTimeRetrieved = Field.fillLowValue(8);
				@Getter @Setter private CmnTimeRetrievedR cmnTimeRetrievedR = new CmnTimeRetrievedR();
	
	/**
	* Constructor for CmnDateTimeOutputArea
	**/
    public CmnDateTimeOutputArea() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for CmnDateTimeOutputArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnDateTimeOutputArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getCmnDateRetrievedR().setParent(this,getStartOffset() + 1);
					getCmnTimeRetrievedR().setParent(this,getStartOffset() + 11);
    } 

	/**
	 * 	initializes CmnDateTimeOutputArea
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setCmnDateTimeReturnCode(0);
         setCmnDateRetrieved(CONSTANTS.SPACE_10);
         setCmnTimeRetrieved(CONSTANTS.SPACE_8);
   }


}
  
