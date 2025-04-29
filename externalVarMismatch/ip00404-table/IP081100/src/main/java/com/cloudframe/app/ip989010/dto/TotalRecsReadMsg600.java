package com.cloudframe.app.ip989010.dto;

/**
*  The class TotalRecsReadMsg600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.utility.CFUtil;


@Data
public class TotalRecsReadMsg600 extends TotalRecsReadMsg600Serialized {
   




						@Getter @Setter private char[] recsReadDd600 = new char[6];


								@Getter @Setter private char[] recsReadCount600 = new char[11];
							
	
	/**
	* Constructor for TotalRecsReadMsg600
	**/
    public TotalRecsReadMsg600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("IP989010").toCharArray()
             , getStartOffset() + 0
             ,8
             );
       replaceValue( // serialize and save the value
             ("-0900-").toCharArray()
             , getStartOffset() + 8
             ,6
             );
       replaceValue( // serialize and save the value
             ("TOTAL RECORDS READ FROM ").toCharArray()
             , getStartOffset() + 14
             ,24
             );
								setRecsReadDd600(fillSpace(6));
       replaceValue( // serialize and save the value
             (" : ").toCharArray()
             , getStartOffset() + 44
             ,3
             );
								setRecsReadCount600(CFUtil.cobolNumberFormatter("ZZZ,ZZZ,ZZ9".toCharArray(),"0".toCharArray()));
    }





}
  
