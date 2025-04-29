package com.cloudframe.app.ar640010.dto;

/**
*  The class FileXferMsg609 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class FileXferMsg609 extends FileXferMsg609Serialized {
   


						@Getter @Setter private char[] gftFileName609 = new char[44];
	
	/**
	* Constructor for FileXferMsg609
	**/
    public FileXferMsg609() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("0090-FILE NAME:   ").toCharArray()
             , getStartOffset() + 0
             ,18
             );
								setGftFileName609(fillSpace(44));
    }





}
  
