package com.cloudframe.app.cfdate02.dto;

/**
*  The class CmnDateTimeOutputArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:41. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class CmnDateTimeOutputArea extends CmnDateTimeOutputAreaSerialized { 
   

						@Getter @Setter private char[] cmnDateRetrieved = Field.fillLowValue(10);

						@Getter @Setter private char[] cmnDateRetrievedR = Field.fillLowValue(10);

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
					getCmnTimeRetrievedR().setParent(this,getStartOffset() + 11);
    } 



}
  
