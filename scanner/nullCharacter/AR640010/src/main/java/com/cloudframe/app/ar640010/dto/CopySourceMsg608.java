package com.cloudframe.app.ar640010.dto;

/**
*  The class CopySourceMsg608 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.utility.CFUtil;


@Data
public class CopySourceMsg608 extends CopySourceMsg608Serialized {
   


							@Getter @Setter private char[] copySourceMsg608ConditionGroup2 = new char[11];
						


								@Getter @Setter private char[] copySourceRecords608 = new char[13];
							


								@Getter @Setter private char[] copySourceBytes608 = new char[13];
							
	
	/**
	* Constructor for CopySourceMsg608
	**/
    public CopySourceMsg608() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("0081-SOURCE ").toCharArray()
             , getStartOffset() + 0
             ,12
             );
       replaceValue( // serialize and save the value
             fillSpace(11)
             , getStartOffset() + 12
             ,11
             );
       replaceValue( // serialize and save the value
             (" RECORDS: ").toCharArray()
             , getStartOffset() + 23
             ,10
             );
								setCopySourceRecords608(fillSpace(13));
       replaceValue( // serialize and save the value
             ("; BYTES: ").toCharArray()
             , getStartOffset() + 46
             ,9
             );
								setCopySourceBytes608(fillSpace(13));
    }





}
  
