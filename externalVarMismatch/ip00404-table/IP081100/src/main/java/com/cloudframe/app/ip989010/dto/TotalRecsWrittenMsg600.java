package com.cloudframe.app.ip989010.dto;

/**
*  The class TotalRecsWrittenMsg600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.utility.CFUtil;


@Data
public class TotalRecsWrittenMsg600 extends TotalRecsWrittenMsg600Serialized {
   




						@Getter @Setter private char[] recsWritDd600 = new char[6];


								@Getter @Setter private char[] recsWritCount600 = new char[11];
							
	
	/**
	* Constructor for TotalRecsWrittenMsg600
	**/
    public TotalRecsWrittenMsg600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("IP989010").toCharArray()
             , getStartOffset() + 0
             ,8
             );
       replaceValue( // serialize and save the value
             ("-0901-").toCharArray()
             , getStartOffset() + 8
             ,6
             );
       replaceValue( // serialize and save the value
             ("TOTAL RECORDS WRITTEN TO ").toCharArray()
             , getStartOffset() + 14
             ,25
             );
								setRecsWritDd600(fillSpace(6));
       replaceValue( // serialize and save the value
             (": ").toCharArray()
             , getStartOffset() + 45
             ,2
             );
								setRecsWritCount600(CFUtil.cobolNumberFormatter("ZZZ,ZZZ,ZZ9".toCharArray(),"0".toCharArray()));
    }





}
  
