package com.cloudframe.app.ar640010.dto;

/**
*  The class FtssDupeFileMsg607 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class FtssDupeFileMsg607 extends FtssDupeFileMsg607Serialized {
   


						@Getter @Setter private char[] ftssDupeFileId607 = new char[14];

	
	/**
	* Constructor for FtssDupeFileMsg607
	**/
    public FtssDupeFileMsg607() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("0071-FTSS FILE ALREADY POSTED FOR FILEID: ").toCharArray()
             , getStartOffset() + 0
             ,42
             );
								setFtssDupeFileId607(fillSpace(14));
       replaceValue( // serialize and save the value
             (", ENDPOINT BYPASSED").toCharArray()
             , getStartOffset() + 56
             ,19
             );
    }





}
  
