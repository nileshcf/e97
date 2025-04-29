package com.cloudframe.app.cfdate02.dto;

/**
*  The class CmnPgmArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:41. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class CmnPgmArea extends CmnPgmAreaSerialized { 
   

						@Getter @Setter private char[] cmnErrMsgArea = Field.fillLowValue(512);

						@Getter @Setter private char[] cmnErrMsgBytes = Field.fillLowValue(512);
				@Getter @Setter private CmnApplMsgArea cmnApplMsgArea = new CmnApplMsgArea();
	
	/**
	* Constructor for CmnPgmArea
	**/
    public CmnPgmArea() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for CmnPgmArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnPgmArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getCmnApplMsgArea().setParent(this,getStartOffset() + 91);
    } 



}
  
