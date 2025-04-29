package com.cloudframe.app.cpsc4.dto;

/**
*  The class DriftData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:41. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class DriftData extends DriftDataSerialized { 
   

						@Getter @Setter private char[] mdlDriftBandTyCd = Field.fillLowValue(1);


						@Getter @Setter private char[] mdlDriftTyCd = Field.fillLowValue(1);


								@Getter @Setter private char[] allocTrgtFromPct = Field.fillLowValue(3);


								@Getter @Setter private char[] allocTrgtToPct = Field.fillLowValue(3);


								@Getter @Setter private char[] minDriftPct = Field.fillLowValue(7);


								@Getter @Setter private char[] maxDriftPct = Field.fillLowValue(7);

	
	/**
	* Constructor for DriftData
	**/
    public DriftData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for DriftData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DriftData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue( // serialize and save the value
             (";").toCharArray()
             , getStartOffset() + 1
             ,1
             );
       replaceValue( // serialize and save the value
             (";").toCharArray()
             , getStartOffset() + 3
             ,1
             );
       replaceValue( // serialize and save the value
             (";").toCharArray()
             , getStartOffset() + 7
             ,1
             );
       replaceValue( // serialize and save the value
             (";").toCharArray()
             , getStartOffset() + 11
             ,1
             );
       replaceValue( // serialize and save the value
             (";").toCharArray()
             , getStartOffset() + 19
             ,1
             );
       replaceValue( // serialize and save the value
             (";").toCharArray()
             , getStartOffset() + 27
             ,1
             );
    } 



}
  
