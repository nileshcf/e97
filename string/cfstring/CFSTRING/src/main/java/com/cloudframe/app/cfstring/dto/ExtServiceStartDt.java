package com.cloudframe.app.cfstring.dto;

/**
*  The class ExtServiceStartDt is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:40. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class ExtServiceStartDt extends ExtServiceStartDtSerialized { 
   

						@Getter @Setter private char[] slash3 = new char[1];

						@Getter @Setter private char[] slash4 = new char[1];
	
	/**
	* Constructor for ExtServiceStartDt
	**/
    public ExtServiceStartDt() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for ExtServiceStartDt. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ExtServiceStartDt(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setSlash3(("/").toCharArray());
								setSlash4(("/").toCharArray());
    } 



}
  
