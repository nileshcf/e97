package com.cloudframe.app.ar640010.dto;

/**
*  The class FileDcbSpecMsg602 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class FileDcbSpecMsg602 extends FileDcbSpecMsg602Serialized {
   


						@Getter @Setter private char[] fileRecfm602 = new char[3];


								@Getter @Setter private long fileLrecl602;


								@Getter @Setter private long fileBlksz602;
	
	/**
	* Constructor for FileDcbSpecMsg602
	**/
    public FileDcbSpecMsg602() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("0021-FILE DCB SPEC: RECFM=").toCharArray()
             , getStartOffset() + 0
             ,26
             );
								setFileRecfm602(fillSpace(3));
       replaceValue( // serialize and save the value
             ("   LRECL=").toCharArray()
             , getStartOffset() + 29
             ,9
             );
								setFileLrecl602(0L);
       replaceValue( // serialize and save the value
             ("   BLKSIZE=").toCharArray()
             , getStartOffset() + 47
             ,11
             );
								setFileBlksz602(0L);
    }





}
  
