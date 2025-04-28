package com.cloudframe.app.cfdate02.dto;

/**
*  The class TM2mPromoTableInit is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:05. using version 5.0.0.256
**/


import com.cloudframe.app.cfdate02.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class TM2mPromoTableInit extends TM2mPromoTableInitSerialized {
   
















	
	/**
	* Constructor for TM2mPromoTableInit
	**/
    public TM2mPromoTableInit() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             fillSpace(10)
             , getStartOffset() + 0
             ,10
             );
       replaceValue( // serialize and save the value
             getBinaryString((int)0,4)
             , getStartOffset() + 10
             ,4
             );
       replaceValue( // serialize and save the value
             getBinaryString((int)0,4)
             , getStartOffset() + 16
             ,4
             );
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 20
             ,2
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 22
             ,1
             );
       replaceValue( // serialize and save the value
             ("01/01/0001").toCharArray()
             , getStartOffset() + 23
             ,10
             );
       replaceValue( // serialize and save the value
             ("01/01/0001").toCharArray()
             , getStartOffset() + 33
             ,10
             );
       replace( // serialize and save the value
             getPackedString(0L,10,0,true)
             , 43
             ,10
             );
       replaceValue( // serialize and save the value
             getBinaryString((int)0,4)
             , getStartOffset() + 53
             ,4
             );
       replaceValue( // serialize and save the value
             getBinaryString((long)0L,8)
             , getStartOffset() + 57
             ,8
             );
       replace( // serialize and save the value
             getPackedString(0,4,0,true)
             , 65
             ,4
             );
       replaceValue( // serialize and save the value
             fillSpace(26)
             , getStartOffset() + 69
             ,26
             );
       replaceValue( // serialize and save the value
             fillSpace(26)
             , getStartOffset() + 95
             ,26
             );
       replaceValue( // serialize and save the value
             ("00010101").toCharArray()
             , getStartOffset() + 121
             ,8
             );
       replaceValue( // serialize and save the value
             ("00010101").toCharArray()
             , getStartOffset() + 129
             ,8
             );
       replaceValue( // serialize and save the value
             getBinaryString((int)0,4)
             , getStartOffset() + 137
             ,4
             );
    }


 


	
	
	

		public static int getTM2mPromoTableInitFieldLength() {
			return T_M_2M_PROMO_TABLE_INIT_LENGTH;
		}

}
  
