package com.cloudframe.app.init1.dto;

/**
*  The class CmnDateCalcNewDateCalcR is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class CmnDateCalcNewDateCalcR extends CmnDateCalcNewDateCalcRSerialized { 
   

								@Getter @Setter private int cmnDateCalcNewDateMm;

						@Getter @Setter private char[] cmnDateCalcNewDateSep1 = Field.fillLowValue(1);

								@Getter @Setter private int cmnDateCalcNewDateDd;

						@Getter @Setter private char[] cmnDateCalcNewDateSep2 = Field.fillLowValue(1);
				@Getter @Setter private CmnDateCalcNewDateYyyy cmnDateCalcNewDateYyyy = new CmnDateCalcNewDateYyyy();
	
	/**
	* Constructor for CmnDateCalcNewDateCalcR
	**/
    public CmnDateCalcNewDateCalcR() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for CmnDateCalcNewDateCalcR. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnDateCalcNewDateCalcR(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getCmnDateCalcNewDateYyyy().setParent(this,getStartOffset() + 6);
    } 



}
  
