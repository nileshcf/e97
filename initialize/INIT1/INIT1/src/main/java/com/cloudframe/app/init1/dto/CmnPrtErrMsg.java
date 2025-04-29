package com.cloudframe.app.init1.dto;

/**
*  The class CmnPrtErrMsg is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class CmnPrtErrMsg extends CmnPrtErrMsgSerialized { 
   

						@Getter @Setter private char[] cmnPrtErrHdrText = new char[26];
	
	/**
	* Constructor for CmnPrtErrMsg
	**/
    public CmnPrtErrMsg() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for CmnPrtErrMsg. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnPrtErrMsg(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setCmnPrtErrHdrText(fillSpace(26));
    } 



}
  
