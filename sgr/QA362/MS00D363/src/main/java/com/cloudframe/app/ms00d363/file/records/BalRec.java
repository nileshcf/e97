package com.cloudframe.app.ms00d363.file.records;

/**
*  The class BalRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:35. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;


public class BalRec extends BalRecSerialized {
   

	
	/**
	* Constructor for BalRec
	**/
    public BalRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 


	
	
	

		public static int getBalRecFieldLength() {
			return BAL_REC_LENGTH;
		}

}
  
