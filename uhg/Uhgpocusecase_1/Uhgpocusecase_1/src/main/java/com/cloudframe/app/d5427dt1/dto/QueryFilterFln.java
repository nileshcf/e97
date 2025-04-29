package com.cloudframe.app.d5427dt1.dto;

/**
*  The class QueryFilterFln is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
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





}
  
