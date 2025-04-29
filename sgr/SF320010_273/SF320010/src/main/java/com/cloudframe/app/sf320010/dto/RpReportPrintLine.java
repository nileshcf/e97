package com.cloudframe.app.sf320010.dto;

/**
*  The class RpReportPrintLine is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:43. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class RpReportPrintLine extends RpReportPrintLineSerialized {
   

						@Getter @Setter private char[] rpReportCode = Field.fillLowValue(1);

						@Getter @Setter private char[] rpPrintLine = Field.fillLowValue(133);

	
	/**
	* Constructor for RpReportPrintLine
	**/
    public RpReportPrintLine() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             fillSpace(11)
             , getStartOffset() + 134
             ,11
             );
    }





}
  
