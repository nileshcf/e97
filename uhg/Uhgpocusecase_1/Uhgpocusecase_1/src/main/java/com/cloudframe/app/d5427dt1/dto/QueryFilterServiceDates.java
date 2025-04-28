package com.cloudframe.app.d5427dt1.dto;

/**
*  The class QueryFilterServiceDates is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:01. using version 5.0.0.256
**/


import com.cloudframe.app.d5427dt1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class QueryFilterServiceDates extends QueryFilterServiceDatesSerialized {
   


	
	/**
	* Constructor for QueryFilterServiceDates
	**/
    public QueryFilterServiceDates() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             (" AND CAST(? AS DATE) >= REF.FST_DT").toCharArray()
             , getStartOffset() + 0
             ,34
             );
       replaceValue( // serialize and save the value
             (" AND CAST(? AS DATE) <= REF.LST_SRVC_DT").toCharArray()
             , getStartOffset() + 34
             ,39
             );
    }


 


	
	
	

		public static int getQueryFilterServiceDatesFieldLength() {
			return QUERY_FILTER_SERVICE_DATES_LENGTH;
		}

}
  
