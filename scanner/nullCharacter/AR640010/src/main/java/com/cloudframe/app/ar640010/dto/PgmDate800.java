package com.cloudframe.app.ar640010.dto;

/**
*  The class PgmDate800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class PgmDate800 extends PgmDate800Serialized { 
   

								@Getter @Setter private int pgmYear800;


								@Getter @Setter private int pgmMonth800;


								@Getter @Setter private int pgmDay800;
	
	/**
	* Constructor for PgmDate800
	**/
    public PgmDate800() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for PgmDate800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public PgmDate800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setPgmYear800(0);
       replaceValue( // serialize and save the value
             ("-").toCharArray()
             , getStartOffset() + 4
             ,1
             );
								setPgmMonth800(0);
       replaceValue( // serialize and save the value
             ("-").toCharArray()
             , getStartOffset() + 7
             ,1
             );
								setPgmDay800(0);
    } 



}
  
