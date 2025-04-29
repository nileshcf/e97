package com.cloudframe.app.ar640010.dto;

/**
*  The class SpecFile530 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class SpecFile530 extends SpecFile530Serialized { 
   

						@Getter @Setter private char[] specDsn530 = new char[44];

						@Getter @Setter private char[] specExt530 = new char[8];
				@Getter @Setter private SpecExt530Redefined specExt530Redefined = new SpecExt530Redefined();
	
	/**
	* Constructor for SpecFile530
	**/
    public SpecFile530() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for SpecFile530. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SpecFile530(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getSpecExt530Redefined().setParent(this,getStartOffset() + 44);
								setSpecDsn530(fillSpace(44));
								setSpecExt530(fillSpace(8));
							getSpecExt530Redefined().setString(fillSpace(8));
    } 



}
  
