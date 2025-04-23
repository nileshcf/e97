package com.cloudframe.app.alltype.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:28. using version 5.0.0.254
**/


import com.cloudframe.app.alltype.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Work extends WorkSerialized {
   
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 


	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
