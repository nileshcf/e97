package com.cloudframe.app.init1.dto;

/**
*  The class CmnTimeCalcOutputArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class CmnTimeCalcOutputArea extends CmnTimeCalcOutputAreaSerialized { 
   

								@Getter @Setter private int cmnTimeCalcReturnCode;

								@Getter @Setter private long cmnTimeCalcNewTime;
				@Getter @Setter private CmnTimeCalcNewTimeR cmnTimeCalcNewTimeR = new CmnTimeCalcNewTimeR();

								@Getter @Setter private int cmnTimeCalcNumOfSecElap;
	
	/**
	* Constructor for CmnTimeCalcOutputArea
	**/
    public CmnTimeCalcOutputArea() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for CmnTimeCalcOutputArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnTimeCalcOutputArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getCmnTimeCalcNewTimeR().setParent(this,getStartOffset() + 1);
    } 



}
  
