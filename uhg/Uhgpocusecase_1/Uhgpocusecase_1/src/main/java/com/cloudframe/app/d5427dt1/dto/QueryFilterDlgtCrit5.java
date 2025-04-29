package com.cloudframe.app.d5427dt1.dto;

/**
*  The class QueryFilterDlgtCrit5 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class QueryFilterDlgtCrit5 extends QueryFilterDlgtCrit5Serialized {
   




	
	/**
	* Constructor for QueryFilterDlgtCrit5
	**/
    public QueryFilterDlgtCrit5() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             (" AND DLGT.PRR_AUTH_NBR > ").toCharArray()
             , getStartOffset() + 0
             ,25
             );
       replaceValue( // serialize and save the value
             ("'").toCharArray()
             , getStartOffset() + 25
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 26
             ,1
             );
       replaceValue( // serialize and save the value
             ("'").toCharArray()
             , getStartOffset() + 27
             ,1
             );
    }





}
  
