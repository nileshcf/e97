package com.cloudframe.app.init1.dto;

/**
*  The class CmnDateRetrievedR is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class CmnDateRetrievedR extends CmnDateRetrievedRSerialized { 
   

						@Getter @Setter private char[] cmnDateRetMm = Field.fillLowValue(2);

						@Getter @Setter private char[] cmnDateRetSep1 = Field.fillLowValue(1);

						@Getter @Setter private char[] cmnDateRetDd = Field.fillLowValue(2);

						@Getter @Setter private char[] cmnDateRetSep2 = Field.fillLowValue(1);
				@Getter @Setter private CmnDateRetYyyy cmnDateRetYyyy = new CmnDateRetYyyy();
	
	/**
	* Constructor for CmnDateRetrievedR
	**/
    public CmnDateRetrievedR() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for CmnDateRetrievedR. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnDateRetrievedR(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getCmnDateRetYyyy().setParent(this,getStartOffset() + 6);
    } 



}
  
