package com.cloudframe.app.mcissues.dto;

/**
*  The class PeVersionNumMsg600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class PeVersionNumMsg600 extends PeVersionNumMsg600Serialized {
   


						@Getter @Setter private char[] peVersionNum600 = new char[7];


								@Getter @Setter private long mpeVersionNum600;

	
	/**
	* Constructor for PeVersionNumMsg600
	**/
    public PeVersionNumMsg600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("PREEDIT SOFTWARE VERSION=").toCharArray()
             , getStartOffset() + 0
             ,25
             );
								setPeVersionNum600(fillSpace(7));
       replaceValue( // serialize and save the value
             ("MEMBER PROFILE VERSION=  ").toCharArray()
             , getStartOffset() + 32
             ,25
             );
								setMpeVersionNum600(0L);
       replaceValue( // serialize and save the value
             (".").toCharArray()
             , getStartOffset() + 65
             ,1
             );
    }





}
  
