package com.cloudframe.app.ar640010.dto;

/**
*  The class FileAllocateMsg602 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class FileAllocateMsg602 extends FileAllocateMsg602Serialized {
   


						@Getter @Setter private char[] fileAtype602 = new char[3];


								@Getter @Setter private long fileUnits602;
	
	/**
	* Constructor for FileAllocateMsg602
	**/
    public FileAllocateMsg602() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("0022-FILE ALLOCATE: TYPE=").toCharArray()
             , getStartOffset() + 0
             ,25
             );
								setFileAtype602(fillSpace(3));
       replaceValue( // serialize and save the value
             ("    SPACE=").toCharArray()
             , getStartOffset() + 28
             ,10
             );
								setFileUnits602(0L);
    }





}
  
