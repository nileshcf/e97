package com.cloudframe.app.cfbooks.dto;

/**
*  The class HeaderTime is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class HeaderTime extends HeaderTimeSerialized {
   


								@Getter @Setter private int pageNo;


						@Getter @Setter private char[] timeR = new char[12];

	
	/**
	* Constructor for HeaderTime
	**/
    public HeaderTime() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("PAGE NO. ").toCharArray()
             , getStartOffset() + 0
             ,9
             );
								setPageNo(0);
       replaceValue( // serialize and save the value
             pad(106," ".toCharArray(),' ',RIGHT_PAD)
             , getStartOffset() + 13
             ,106
             );
								setTimeR(("-           ").toCharArray());
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 131
             ,1
             );
    }





}
  
