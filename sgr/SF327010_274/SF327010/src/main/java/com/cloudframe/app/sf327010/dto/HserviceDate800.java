package com.cloudframe.app.sf327010.dto;

/**
*  The class HserviceDate800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:33. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class HserviceDate800 extends HserviceDate800Serialized { 
   

						@Getter @Setter private char[] hserviceCc800 = new char[2];

						@Getter @Setter private char[] hserviceYy800 = new char[2];

						@Getter @Setter private char[] hserviceMm800 = new char[2];

						@Getter @Setter private char[] hserviceDd800 = new char[2];
	
	/**
	* Constructor for HserviceDate800
	**/
    public HserviceDate800() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for HserviceDate800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public HserviceDate800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setHserviceCc800(fillSpace(2));
								setHserviceYy800(fillSpace(2));
								setHserviceMm800(fillSpace(2));
								setHserviceDd800(fillSpace(2));
    } 



}
  
