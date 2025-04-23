package com.cloudframe.app.init1.dto;

/**
*  The class RcCycleDateInit is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:18. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class RcCycleDateInit extends RcCycleDateInitSerialized {
   










	
	/**
	* Constructor for RcCycleDateInit
	**/
    public RcCycleDateInit() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 0
             ,2
             );
       replaceValue( // serialize and save the value
             fillSpace(6)
             , getStartOffset() + 2
             ,6
             );
       replaceValue( // serialize and save the value
             fillSpace(20)
             , getStartOffset() + 8
             ,20
             );
       replaceValue(pad(16,"0L","0",LEFT_PAD),getStartOffset() + 28,16);
       replaceValue( // serialize and save the value
             fillSpace(20)
             , getStartOffset() + 44
             ,20
             );
       replaceValue(pad(16,"0L","0",LEFT_PAD),getStartOffset() + 64,16);
       replaceValue( // serialize and save the value
             fillSpace(20)
             , getStartOffset() + 80
             ,20
             );
       replaceValue(pad(16,"0L","0",LEFT_PAD),getStartOffset() + 100,16);
       replaceValue( // serialize and save the value
             fillSpace(20)
             , getStartOffset() + 116
             ,20
             );
       replaceValue(pad(16,"0L","0",LEFT_PAD),getStartOffset() + 136,16);
    }


 


	
	
	

		public static int getRcCycleDateInitFieldLength() {
			return RC_CYCLE_DATE_INIT_LENGTH;
		}

}
  
