package com.cloudframe.app.cpsc4.dto;

/**
*  The class CatAvGeData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:41. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class CatAvGeData extends CatAvGeDataSerialized { 
   

						@Getter @Setter private char[] invstObjCd = Field.fillLowValue(1);


								@Getter @Setter private char[] invstPct = Field.fillLowValue(3);


								@Getter @Setter private char[] minTrgtDriftPct = Field.fillLowValue(6);


								@Getter @Setter private char[] maxTrgtDriftPct = Field.fillLowValue(6);

	
	/**
	* Constructor for CatAvGeData
	**/
    public CatAvGeData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for CatAvGeData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CatAvGeData(Field parent,int begin) {
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
             , getStartOffset() + 5
             ,1
             );
       replaceValue( // serialize and save the value
             (";").toCharArray()
             , getStartOffset() + 12
             ,1
             );
       replaceValue( // serialize and save the value
             (";").toCharArray()
             , getStartOffset() + 19
             ,1
             );
    } 



}
  
