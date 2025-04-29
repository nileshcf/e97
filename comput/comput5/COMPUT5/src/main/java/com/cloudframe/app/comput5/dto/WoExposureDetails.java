package com.cloudframe.app.comput5.dto;

/**
*  The class WoExposureDetails is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class WoExposureDetails extends WoExposureDetailsSerialized { 
   


						@Getter @Setter private char[] woExposure = Field.fillLowValue(9);

								@Getter @Setter private char[] woExposureS = Field.fillLowValue(9);
	
	/**
	* Constructor for WoExposureDetails
	**/
    public WoExposureDetails() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for WoExposureDetails. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WoExposureDetails(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 0
             ,1
             );
    } 



}
  
