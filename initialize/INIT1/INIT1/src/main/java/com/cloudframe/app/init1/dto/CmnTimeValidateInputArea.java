package com.cloudframe.app.init1.dto;

/**
*  The class CmnTimeValidateInputArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class CmnTimeValidateInputArea extends CmnTimeValidateInputAreaSerialized { 
   
				@Getter @Setter private CmnTimeValidInput cmnTimeValidInput = new CmnTimeValidInput();
	
	/**
	* Constructor for CmnTimeValidateInputArea
	**/
    public CmnTimeValidateInputArea() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for CmnTimeValidateInputArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnTimeValidateInputArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getCmnTimeValidInput().setParent(this,getStartOffset() + 0);
    } 



}
  
