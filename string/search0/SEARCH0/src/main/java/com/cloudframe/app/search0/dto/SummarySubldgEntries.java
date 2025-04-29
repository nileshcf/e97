package com.cloudframe.app.search0.dto;

/**
*  The class SummarySubldgEntries is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:40. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class SummarySubldgEntries extends SummarySubldgEntriesSerialized { 
   

								@Getter @Setter private int summaryFinEvntNo;

								@Getter @Setter private int summaryFinCat;

						@Getter @Setter private char[] summaryFinMktId = Field.fillLowValue(3);
	
	/**
	* Constructor for SummarySubldgEntries
	**/
    public SummarySubldgEntries() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for SummarySubldgEntries. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SummarySubldgEntries(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
