package com.cloudframe.app.sf311010.dto;

/**
*  The class EndOfReportLine366 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class EndOfReportLine366 extends EndOfReportLine366Serialized {
   

						@Getter @Setter private char[] endofrptReportId366 = new char[1];

						@Getter @Setter private char[] endofrptCarCon366 = new char[1];




	
	/**
	* Constructor for EndOfReportLine366
	**/
    public EndOfReportLine366() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setEndofrptReportId366(fillSpace(1));
								setEndofrptCarCon366(fillSpace(1));
       replaceValue( // serialize and save the value
             fillSpace(8)
             , getStartOffset() + 2
             ,8
             );
       replaceValue( // serialize and save the value
             ("* * * * *   E N D   O F   R E P O R T   ").toCharArray()
             , getStartOffset() + 10
             ,40
             );
       replaceValue( // serialize and save the value
             ("S F 3 1 1 0 1 0 - A A   * * * * *       ").toCharArray()
             , getStartOffset() + 50
             ,40
             );
       replaceValue( // serialize and save the value
             fillSpace(40)
             , getStartOffset() + 90
             ,40
             );
    }





}
  
