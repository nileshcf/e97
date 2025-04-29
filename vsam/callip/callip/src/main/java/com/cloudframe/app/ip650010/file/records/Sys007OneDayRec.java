package com.cloudframe.app.ip650010.file.records;

/**
*  The class Sys007OneDayRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Sys007OneDayRec extends Sys007OneDayRecSerialized { 
   
				@Getter @Setter private Sys007TableKeyAll sys007TableKeyAll = new Sys007TableKeyAll();
	
	/**
	* Constructor for Sys007OneDayRec
	**/
    public Sys007OneDayRec() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Sys007OneDayRec. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sys007OneDayRec(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getSys007TableKeyAll().setParent(this,getStartOffset() + 0);
    } 



}
  
