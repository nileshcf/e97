package com.cloudframe.app.sf327010.dto;

/**
*  The class HdrLine2202 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:33. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.utility.CFUtil;


@Data
public class HdrLine2202 extends HdrLine2202Serialized {
   



						@Getter @Setter private char[] serverId202 = new char[3];






								@Getter @Setter private char[] pageCount202 = new char[11];
							
	
	/**
	* Constructor for HdrLine2202
	**/
    public HdrLine2202() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("SERVER ID:").toCharArray()
             , getStartOffset() + 0
             ,10
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 10
             ,1
             );
								setServerId202(fillSpace(3));
       replaceValue( // serialize and save the value
             fillSpace(28)
             , getStartOffset() + 14
             ,28
             );
       replaceValue( // serialize and save the value
             ("ASA SERVER ACTIVITY SUMMARY REPORT").toCharArray()
             , getStartOffset() + 42
             ,34
             );
       replaceValue( // serialize and save the value
             fillSpace(27)
             , getStartOffset() + 76
             ,27
             );
       replaceValue( // serialize and save the value
             ("PAGE    :").toCharArray()
             , getStartOffset() + 103
             ,9
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 112
             ,1
             );
								setPageCount202(CFUtil.cobolNumberFormatter("ZZZ,ZZZ,ZZ9".toCharArray(),"0".toCharArray()));
    }





}
  
