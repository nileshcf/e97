package com.cloudframe.app.ip299010.dto;

/**
*  The class OneDayRecLengthError620 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.utility.CFUtil;


@Data
public class OneDayRecLengthError620 extends OneDayRecLengthError620Serialized {
   


								@Getter @Setter private char[] errorLength620 = new char[5];
							
	
	/**
	* Constructor for OneDayRecLengthError620
	**/
    public OneDayRecLengthError620() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             (" TBL IP0005T1 RECORD LENGTH ERROR; LENGTH = ").toCharArray()
             , getStartOffset() + 0
             ,44
             );
								setErrorLength620(CFUtil.cobolNumberFormatter("ZZZZ9".toCharArray(),"0".toCharArray()));
    }





}
  
