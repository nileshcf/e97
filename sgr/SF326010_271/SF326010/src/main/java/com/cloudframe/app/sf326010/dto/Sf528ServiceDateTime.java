package com.cloudframe.app.sf326010.dto;

/**
*  The class Sf528ServiceDateTime is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Sf528ServiceDateTime extends Sf528ServiceDateTimeSerialized { 
   
				@Getter @Setter private Sf528ServiceDate sf528ServiceDate = new Sf528ServiceDate();
				@Getter @Setter private Sf528ServiceTime sf528ServiceTime = new Sf528ServiceTime();
	
	/**
	* Constructor for Sf528ServiceDateTime
	**/
    public Sf528ServiceDateTime() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Sf528ServiceDateTime. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf528ServiceDateTime(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getSf528ServiceDate().setParent(this,getStartOffset() + 0);
					getSf528ServiceTime().setParent(this,getStartOffset() + 8);
    } 



}
  
