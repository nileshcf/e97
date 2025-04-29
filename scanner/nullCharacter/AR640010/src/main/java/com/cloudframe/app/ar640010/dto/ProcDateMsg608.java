package com.cloudframe.app.ar640010.dto;

/**
*  The class ProcDateMsg608 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class ProcDateMsg608 extends ProcDateMsg608Serialized {
   


						@Getter @Setter private char[] procDate608 = new char[10];


								@Getter @Setter private int procJulDay608;

	
	/**
	* Constructor for ProcDateMsg608
	**/
    public ProcDateMsg608() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             (", PROCESS DATE: ").toCharArray()
             , getStartOffset() + 0
             ,16
             );
								setProcDate608(fillSpace(10));
       replaceValue( // serialize and save the value
             (" (").toCharArray()
             , getStartOffset() + 26
             ,2
             );
								setProcJulDay608(0);
       replaceValue( // serialize and save the value
             (")").toCharArray()
             , getStartOffset() + 31
             ,1
             );
    }





}
  
