package com.cloudframe.app.cfbooksl.dto;

/**
*  The class HeaderTitle is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:41. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class HeaderTitle extends HeaderTitleSerialized {
   




						@Getter @Setter private char[] dateR = new char[10];

	
	/**
	* Constructor for HeaderTitle
	**/
    public HeaderTitle() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             fillSpace(50)
             , getStartOffset() + 0
             ,50
             );
       replaceValue( // serialize and save the value
             ("generated book report        ").toCharArray()
             , getStartOffset() + 50
             ,29
             );
       replaceValue( // serialize and save the value
             fillSpace(42)
             , getStartOffset() + 79
             ,42
             );
								setDateR(fillSpace(10));
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 131
             ,1
             );
    }





}
  
