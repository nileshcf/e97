package com.cloudframe.app.d5427dt1.dto;

/**
*  The class QueryFilterFln is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:07. using version 5.0.0.256
**/


import com.cloudframe.app.d5427dt1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class QueryFilterFln extends QueryFilterFlnSerialized { 
   


	
	/**
	* Constructor for QueryFilterFln
	**/
    public QueryFilterFln() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             (" AND REF.FLN_JULIAN_DT_NBR = CAST(? AS CHAR(5))").toCharArray()
             , getStartOffset() + 0
             ,47
             );
       replaceValue( // serialize and save the value
             (" AND REF.FLN_SRL_NBR = CAST(? AS CHAR(5)) ").toCharArray()
             , getStartOffset() + 47
             ,42
             );
    }


 


	
	
	

		public static int getQueryFilterFlnFieldLength() {
			return QUERY_FILTER_FLN_LENGTH;
		}

}
  
