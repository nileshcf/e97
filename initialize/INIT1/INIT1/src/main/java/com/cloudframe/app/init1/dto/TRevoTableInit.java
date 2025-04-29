package com.cloudframe.app.init1.dto;

/**
*  The class TRevoTableInit is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:22. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;


public class TRevoTableInit extends TRevoTableInitSerialized {
   




	
	/**
	* Constructor for TRevoTableInit
	**/
    public TRevoTableInit() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             fillSpace(3)
             , getStartOffset() + 0
             ,3
             );
       replaceValue( // serialize and save the value
             fillSpace(40)
             , getStartOffset() + 3
             ,40
             );
       replaceValue( // serialize and save the value
             getBinaryString((int)0,4)
             , getStartOffset() + 43
             ,4
             );
       replace( // serialize and save the value
             getPackedString(BigDecimal.ZERO,10,11,true)
             , 47
             ,10
             );
    }


 


	
	
	

		public static int getTRevoTableInitFieldLength() {
			return T_REVO_TABLE_INIT_LENGTH;
		}

}
  
