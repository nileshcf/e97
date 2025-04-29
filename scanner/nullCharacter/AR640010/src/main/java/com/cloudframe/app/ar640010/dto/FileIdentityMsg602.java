package com.cloudframe.app.ar640010.dto;

/**
*  The class FileIdentityMsg602 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class FileIdentityMsg602 extends FileIdentityMsg602Serialized {
   


						@Getter @Setter private char[] fileDd602 = new char[8];


						@Getter @Setter private char[] fileDsn602 = new char[54];
	
	/**
	* Constructor for FileIdentityMsg602
	**/
    public FileIdentityMsg602() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("0020-FILE IDENTITY: DD=").toCharArray()
             , getStartOffset() + 0
             ,23
             );
								setFileDd602(fillSpace(8));
       replaceValue( // serialize and save the value
             (" DSN=").toCharArray()
             , getStartOffset() + 31
             ,5
             );
								setFileDsn602(fillSpace(54));
    }





}
  
