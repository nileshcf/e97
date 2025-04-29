package com.cloudframe.app.ip989010.dto;

/**
*  The class CurDtYymmdd800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class CurDtYymmdd800 extends CurDtYymmdd800Serialized { 
   

						@Getter @Setter private char[] curDtYy800 = new char[2];

						@Getter @Setter private char[] curDtMm800 = new char[2];

						@Getter @Setter private char[] curDtDd800 = new char[2];
	
	/**
	* Constructor for CurDtYymmdd800
	**/
    public CurDtYymmdd800() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for CurDtYymmdd800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CurDtYymmdd800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setCurDtYy800(fillSpace(2));
								setCurDtMm800(fillSpace(2));
								setCurDtDd800(fillSpace(2));
    } 



}
  
