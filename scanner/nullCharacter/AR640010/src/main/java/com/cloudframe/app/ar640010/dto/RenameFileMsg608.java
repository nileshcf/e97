package com.cloudframe.app.ar640010.dto;

/**
*  The class RenameFileMsg608 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.utility.CFUtil;


@Data
public class RenameFileMsg608 extends RenameFileMsg608Serialized {
   


								@Getter @Setter private char[] renameFileRecords608 = new char[13];
							


								@Getter @Setter private char[] renameFileBytes608 = new char[13];
							
	
	/**
	* Constructor for RenameFileMsg608
	**/
    public RenameFileMsg608() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("0081-SOURCE/TARGET RECORDS: ").toCharArray()
             , getStartOffset() + 0
             ,28
             );
								setRenameFileRecords608(fillSpace(13));
       replaceValue( // serialize and save the value
             ("; BYTES: ").toCharArray()
             , getStartOffset() + 41
             ,9
             );
								setRenameFileBytes608(fillSpace(13));
    }





}
  
