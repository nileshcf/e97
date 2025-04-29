package com.cloudframe.app.ip989010.dto;

/**
*  The class CurrentDate800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class CurrentDate800 extends CurrentDate800Serialized { 
   

						@Getter @Setter private char[] curDtCc800 = new char[2];
				@Getter @Setter private CurDtYymmdd800 curDtYymmdd800 = new CurDtYymmdd800();
	
	/**
	* Constructor for CurrentDate800
	**/
    public CurrentDate800() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for CurrentDate800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CurrentDate800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getCurDtYymmdd800().setParent(this,getStartOffset() + 2);
								setCurDtCc800(fillSpace(2));
    } 



}
  
