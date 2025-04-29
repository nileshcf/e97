package com.cloudframe.app.o529351u.dto;

/**
*  The class SavRecTyp4Fileaid is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class SavRecTyp4Fileaid extends SavRecTyp4FileaidSerialized { 
   
				@Getter @Setter private SaveRecType4Fixed saveRecType4Fixed = new SaveRecType4Fixed();
	
	/**
	* Constructor for SavRecTyp4Fileaid
	**/
    public SavRecTyp4Fileaid() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for SavRecTyp4Fileaid. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SavRecTyp4Fileaid(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getSaveRecType4Fixed().setParent(this,getStartOffset() + 0);
    } 



}
  
