package com.cloudframe.app.varchar1.dto;

/**
*  The class Vchar1NickName is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:40. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Vchar1NickName extends Vchar1NickNameSerialized { 
   

								@Getter @Setter private short vchar1NickNameLen;

						@Getter @Setter private char[] vchar1NickNameData = Field.fillLowValue(15);
	
	/**
	* Constructor for Vchar1NickName
	**/
    public Vchar1NickName() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Vchar1NickName. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Vchar1NickName(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
