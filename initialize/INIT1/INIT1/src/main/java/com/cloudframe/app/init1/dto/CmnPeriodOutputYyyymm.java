package com.cloudframe.app.init1.dto;

/**
*  The class CmnPeriodOutputYyyymm is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class CmnPeriodOutputYyyymm extends CmnPeriodOutputYyyymmSerialized { 
   
				@Getter @Setter private CmnPeriodOutputYyyy cmnPeriodOutputYyyy = new CmnPeriodOutputYyyy();

								@Getter @Setter private int cmnPeriodOutputMm;
	
	/**
	* Constructor for CmnPeriodOutputYyyymm
	**/
    public CmnPeriodOutputYyyymm() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for CmnPeriodOutputYyyymm. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnPeriodOutputYyyymm(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getCmnPeriodOutputYyyy().setParent(this,getStartOffset() + 0);
    } 



}
  
