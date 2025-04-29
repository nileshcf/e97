package com.cloudframe.app.ms00d363.dto;

/**
*  The class X360AdditionalSortingFields is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class X360AdditionalSortingFields extends X360AdditionalSortingFieldsSerialized { 
   
				@Getter @Setter private X360InterType1Srt x360InterType1Srt = new X360InterType1Srt();
				@Getter @Setter private X360InterType2Srt x360InterType2Srt = new X360InterType2Srt();
	
	/**
	* Constructor for X360AdditionalSortingFields
	**/
    public X360AdditionalSortingFields() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for X360AdditionalSortingFields. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360AdditionalSortingFields(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getX360InterType1Srt().setParent(this,getStartOffset() + 0);
					getX360InterType2Srt().setParent(this,getStartOffset() + 0);
    } 



}
  
