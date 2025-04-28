package com.cloudframe.app.ip989010.file.records;

/**
*  The class Sys005InRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:03. using version 5.0.0.256
**/


import com.cloudframe.app.ip989010.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Sys005InRec extends Sys005InRecSerialized {
   

	
	/**
	* Constructor for Sys005InRec
	**/
    public Sys005InRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 


	
	
	

		public static int getSys005InRecFieldLength() {
			return SYS_005_IN_REC_LENGTH;
		}

}
  
