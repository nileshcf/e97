package com.cloudframe.app.cfdate02.dto;

/**
*  The class CmnTimeCalcInputArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:41. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class CmnTimeCalcInputArea extends CmnTimeCalcInputAreaSerialized { 
   

								@Getter @Setter private long cmnTimeCalcStart;
				@Getter @Setter private CmnTimeCalcStartR cmnTimeCalcStartR = new CmnTimeCalcStartR();

								@Getter @Setter private long cmnTimeCalcEnd;
				@Getter @Setter private CmnTimeCalcEndR cmnTimeCalcEndR = new CmnTimeCalcEndR();
	
	/**
	* Constructor for CmnTimeCalcInputArea
	**/
    public CmnTimeCalcInputArea() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for CmnTimeCalcInputArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnTimeCalcInputArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getCmnTimeCalcStartR().setParent(this,getStartOffset() + 1);
					getCmnTimeCalcEndR().setParent(this,getStartOffset() + 7);
    } 



}
  
