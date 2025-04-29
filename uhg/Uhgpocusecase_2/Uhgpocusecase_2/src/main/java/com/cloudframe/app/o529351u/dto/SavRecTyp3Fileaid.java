package com.cloudframe.app.o529351u.dto;

/**
*  The class SavRecTyp3Fileaid is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class SavRecTyp3Fileaid extends SavRecTyp3FileaidSerialized { 
   
				@Getter @Setter private SavMcdsVariable savMcdsVariable = new SavMcdsVariable();
	
	/**
	* Constructor for SavRecTyp3Fileaid
	**/
    public SavRecTyp3Fileaid() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for SavRecTyp3Fileaid. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SavRecTyp3Fileaid(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getSavMcdsVariable().setParent(this,getStartOffset() + 85);
    } 



}
  
