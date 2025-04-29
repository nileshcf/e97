package com.cloudframe.app.ar640010.dto;

/**
*  The class PgmTs800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class PgmTs800 extends PgmTs800Serialized { 
   
				@Getter @Setter private PgmDate800 pgmDate800 = new PgmDate800();

				@Getter @Setter private PgmTime800 pgmTime800 = new PgmTime800();
	
	/**
	* Constructor for PgmTs800
	**/
    public PgmTs800() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for PgmTs800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public PgmTs800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getPgmDate800().setParent(this,getStartOffset() + 0);
					getPgmTime800().setParent(this,getStartOffset() + 11);
       replaceValue( // serialize and save the value
             ("-").toCharArray()
             , getStartOffset() + 10
             ,1
             );
    } 



}
  
