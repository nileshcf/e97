package com.cloudframe.app.init1.dto;

/**
*  The class CmnPeriodOutputArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class CmnPeriodOutputArea extends CmnPeriodOutputAreaSerialized { 
   

								@Getter @Setter private int cmnPeriodReturnCode;
				@Getter @Setter private CmnPeriodOutputYyyymm cmnPeriodOutputYyyymm = new CmnPeriodOutputYyyymm();
				@Getter @Setter private CmnPeriodOutputMonthYyyy cmnPeriodOutputMonthYyyy = new CmnPeriodOutputMonthYyyy();
	
	/**
	* Constructor for CmnPeriodOutputArea
	**/
    public CmnPeriodOutputArea() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for CmnPeriodOutputArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnPeriodOutputArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getCmnPeriodOutputYyyymm().setParent(this,getStartOffset() + 1);
					getCmnPeriodOutputMonthYyyy().setParent(this,getStartOffset() + 7);
    } 



}
  
