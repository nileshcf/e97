package com.cloudframe.app.sf328010.dto;

/**
*  The class Detail1705 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:33. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Detail1705 extends Detail1705Serialized { 
   


						@Getter @Setter private char[] serviceName705 = new char[64];

	
	/**
	* Constructor for Detail1705
	**/
    public Detail1705() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Detail1705. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Detail1705(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue( // serialize and save the value
             fillSpace(6)
             , getStartOffset() + 0
             ,6
             );
								setServiceName705(pad(64," ".toCharArray(),' ',RIGHT_PAD));
       replaceValue( // serialize and save the value
             fillSpace(8)
             , getStartOffset() + 70
             ,8
             );
    } 



}
  
