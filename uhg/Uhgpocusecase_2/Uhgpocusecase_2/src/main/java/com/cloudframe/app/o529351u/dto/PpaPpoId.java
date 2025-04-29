package com.cloudframe.app.o529351u.dto;

/**
*  The class PpaPpoId is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class PpaPpoId extends PpaPpoIdSerialized { 
   
				@Getter @Setter private PpaOccurrence ppaOccurrence = new PpaOccurrence();
	
	/**
	* Constructor for PpaPpoId
	**/
    public PpaPpoId() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for PpaPpoId. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public PpaPpoId(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getPpaOccurrence().setParent(this,getStartOffset() + 0);
    } 



}
  
