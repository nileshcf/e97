package com.cloudframe.app.init1.dto;

/**
*  The class CmnTimeConvInput is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class CmnTimeConvInput extends CmnTimeConvInputSerialized { 
   
				@Getter @Setter private CmnIsoTime cmnIsoTime = new CmnIsoTime();
				@Getter @Setter private CmnJisTime cmnJisTime = new CmnJisTime();
				@Getter @Setter private CmnNumTime cmnNumTime = new CmnNumTime();
	
	/**
	* Constructor for CmnTimeConvInput
	**/
    public CmnTimeConvInput() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for CmnTimeConvInput. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnTimeConvInput(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getCmnIsoTime().setParent(this,getStartOffset() + 0);
					getCmnJisTime().setParent(this,getStartOffset() + 8);
					getCmnNumTime().setParent(this,getStartOffset() + 16);
    } 



}
  
