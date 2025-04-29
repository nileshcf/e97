package com.cloudframe.app.ar640010.dto;

/**
*  The class FileAllocMsg650 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class FileAllocMsg650 extends FileAllocMsg650Serialized {
   


						@Getter @Setter private char[] fileAllocType650 = new char[3];

	
	/**
	* Constructor for FileAllocMsg650
	**/
    public FileAllocMsg650() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("5100-FILE ALLOC TYPE UNACCEPTABLE, TYPE: ").toCharArray()
             , getStartOffset() + 0
             ,41
             );
								setFileAllocType650(fillSpace(3));
       replaceValue( // serialize and save the value
             (", DSN: ").toCharArray()
             , getStartOffset() + 44
             ,7
             );
    }





}
  
