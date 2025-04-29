package com.cloudframe.app.asaprnt.dto;

/**
*  The class Header2a700 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:48. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Header2a700 extends Header2a700Serialized {
   





						@Getter @Setter private char[] h2aTimeRun700 = new char[8];
	
	/**
	* Constructor for Header2a700
	**/
    public Header2a700() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             fillSpace(51)
             , getStartOffset() + 0
             ,51
             );
       replaceValue( // serialize and save the value
             ("IPM FILE MESSAGE LEVEL DETAIL").toCharArray()
             , getStartOffset() + 51
             ,29
             );
       replaceValue( // serialize and save the value
             fillSpace(29)
             , getStartOffset() + 80
             ,29
             );
       replaceValue( // serialize and save the value
             ("RUN TIME : ").toCharArray()
             , getStartOffset() + 109
             ,11
             );
								setH2aTimeRun700(fillSpace(8));
    }





}
  
