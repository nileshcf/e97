package com.cloudframe.app.mcindex.dto;

/**
*  The class ErrorInfoTableEntries315 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:33. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class ErrorInfoTableEntries315 extends ErrorInfoTableEntries315Serialized { 
   








	
	/**
	* Constructor for ErrorInfoTableEntries315
	**/
    public ErrorInfoTableEntries315() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for ErrorInfoTableEntries315. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ErrorInfoTableEntries315(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue(pad(2,"99","0",LEFT_PAD),getStartOffset() + 0,2);
       replaceValue(pad(2,"88","0",LEFT_PAD),getStartOffset() + 2,2);
       replaceValue(pad(4,"77","0",LEFT_PAD),getStartOffset() + 4,4);
       replaceValue(pad(4,"0","0",LEFT_PAD),getStartOffset() + 8,4);
       replaceValue( // serialize and save the value
             ("A").toCharArray()
             , getStartOffset() + 12
             ,1
             );
       replaceValue( // serialize and save the value
             getBinaryString((long)1234L,4)
             , getStartOffset() + 13
             ,4
             );
       replaceValue( // serialize and save the value
             getBinaryString((long)5678L,4)
             , getStartOffset() + 17
             ,4
             );
       replaceValue( // serialize and save the value
             pad(150,"ABCD".toCharArray(),' ',RIGHT_PAD)
             , getStartOffset() + 21
             ,150
             );
    } 



}
  
