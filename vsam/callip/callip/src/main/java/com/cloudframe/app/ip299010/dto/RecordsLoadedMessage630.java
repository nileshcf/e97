package com.cloudframe.app.ip299010.dto;

/**
*  The class RecordsLoadedMessage630 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.utility.CFUtil;


@Data
public class RecordsLoadedMessage630 extends RecordsLoadedMessage630Serialized {
   




								@Getter @Setter private char[] recLoadedCnt630 = new char[4];
							

	
	/**
	* Constructor for RecordsLoadedMessage630
	**/
    public RecordsLoadedMessage630() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("IP299010").toCharArray()
             , getStartOffset() + 0
             ,8
             );
       replaceValue( // serialize and save the value
             ("-").toCharArray()
             , getStartOffset() + 8
             ,1
             );
       replaceValue( // serialize and save the value
             ("IP0005T1 RECORDS LOADED =  ").toCharArray()
             , getStartOffset() + 9
             ,27
             );
								setRecLoadedCnt630(CFUtil.cobolNumberFormatter("ZZZ9".toCharArray(),"0".toCharArray()));
       replaceValue( // serialize and save the value
             fillSpace(29)
             , getStartOffset() + 40
             ,29
             );
    }





}
  
