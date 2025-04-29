package com.cloudframe.app.ar640010.dto;

/**
*  The class Ar629MsgTypeGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ar629MsgTypeGroup extends Ar629MsgTypeGroupSerialized { 
   

						@Getter @Setter private char[] ar629MsgType = new char[1];
	
	/**
	* Constructor for Ar629MsgTypeGroup
	**/
    public Ar629MsgTypeGroup() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ar629MsgTypeGroup. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ar629MsgTypeGroup(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setAr629MsgType(("1").toCharArray());
    } 



}
  
