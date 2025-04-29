package com.cloudframe.app.ip200090.dto;

/**
*  The class BslId800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class BslId800 extends BslId800Serialized { 
   

						@Getter @Setter private char[] bsl800 = new char[1];

						@Getter @Setter private char[] bsid800 = new char[6];
	
	/**
	* Constructor for BslId800
	**/
    public BslId800() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for BslId800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BslId800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setBsl800(fillSpace(1));
								setBsid800(fillSpace(6));
    } 



}
  
