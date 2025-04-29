package com.cloudframe.app.cfdate02.dto;

/**
*  The class CmnDateValidOutputArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:41. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class CmnDateValidOutputArea extends CmnDateValidOutputAreaSerialized { 
   

								@Getter @Setter private long cmnDateValid;
				@Getter @Setter private CmnDateValidR cmnDateValidR = new CmnDateValidR();
	
	/**
	* Constructor for CmnDateValidOutputArea
	**/
    public CmnDateValidOutputArea() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for CmnDateValidOutputArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnDateValidOutputArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getCmnDateValidR().setParent(this,getStartOffset() + 1);
    } 



}
  
