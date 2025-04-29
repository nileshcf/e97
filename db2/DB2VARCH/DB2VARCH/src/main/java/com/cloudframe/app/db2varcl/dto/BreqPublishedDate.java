package com.cloudframe.app.db2varcl.dto;

/**
*  The class BreqPublishedDate is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:40. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class BreqPublishedDate extends BreqPublishedDateSerialized { 
   

								@Getter @Setter private short breqPublishedDateLen;

						@Getter @Setter private char[] breqPublishedDateText = Field.fillLowValue(255);
	
	/**
	* Constructor for BreqPublishedDate
	**/
    public BreqPublishedDate() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for BreqPublishedDate. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BreqPublishedDate(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
