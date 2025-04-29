package com.cloudframe.app.d5427dt1.dto;

/**
*  The class QueryBaseMainSqlGroup107 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class QueryBaseMainSqlGroup107 extends QueryBaseMainSqlGroup107Serialized { 
   




	
	/**
	* Constructor for QueryBaseMainSqlGroup107
	**/
    public QueryBaseMainSqlGroup107() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for QueryBaseMainSqlGroup107. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public QueryBaseMainSqlGroup107(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue( // serialize and save the value
             ("'").toCharArray()
             , getStartOffset() + 0
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(7)
             , getStartOffset() + 1
             ,7
             );
       replaceValue( // serialize and save the value
             ("'").toCharArray()
             , getStartOffset() + 8
             ,1
             );
       replaceValue( // serialize and save the value
             (")").toCharArray()
             , getStartOffset() + 9
             ,1
             );
    } 



}
  
