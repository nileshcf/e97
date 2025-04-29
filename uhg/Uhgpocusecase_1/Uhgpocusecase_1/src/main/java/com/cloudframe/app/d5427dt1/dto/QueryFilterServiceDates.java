package com.cloudframe.app.d5427dt1.dto;

/**
*  The class QueryFilterServiceDates is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
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





}
  
