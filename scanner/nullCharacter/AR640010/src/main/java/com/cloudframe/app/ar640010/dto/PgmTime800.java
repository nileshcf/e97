package com.cloudframe.app.ar640010.dto;

/**
*  The class PgmTime800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class PgmTime800 extends PgmTime800Serialized { 
   

								@Getter @Setter private int pgmHour800;


								@Getter @Setter private int pgmMinute800;


								@Getter @Setter private int pgmSecond800;

				@Getter @Setter private PgmMillisecond800 pgmMillisecond800 = new PgmMillisecond800();
	
	/**
	* Constructor for PgmTime800
	**/
    public PgmTime800() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for PgmTime800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public PgmTime800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getPgmMillisecond800().setParent(this,getStartOffset() + 9);
								setPgmHour800(0);
       replaceValue( // serialize and save the value
             (".").toCharArray()
             , getStartOffset() + 2
             ,1
             );
								setPgmMinute800(0);
       replaceValue( // serialize and save the value
             (".").toCharArray()
             , getStartOffset() + 5
             ,1
             );
								setPgmSecond800(0);
       replaceValue( // serialize and save the value
             (".").toCharArray()
             , getStartOffset() + 8
             ,1
             );
    } 



}
  
