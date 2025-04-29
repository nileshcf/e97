package com.cloudframe.app.ar640010.dto;

/**
*  The class Ar629MsgTextGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ar629MsgTextGroup extends Ar629MsgTextGroupSerialized { 
   

						@Getter @Setter private char[] ar629MsgText = new char[115];
	
	/**
	* Constructor for Ar629MsgTextGroup
	**/
    public Ar629MsgTextGroup() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ar629MsgTextGroup. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ar629MsgTextGroup(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setAr629MsgText(pad(115," ".toCharArray(),' ',RIGHT_PAD));
    } 



}
  
