package com.cloudframe.app.cfdate02.dto;

/**
*  The class TLnshrgrpInit is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:41. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class TLnshrgrpInit extends TLnshrgrpInitSerialized { 
   








	
	/**
	* Constructor for TLnshrgrpInit
	**/
    public TLnshrgrpInit() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for TLnshrgrpInit. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TLnshrgrpInit(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue( // serialize and save the value
             getBinaryString((int)0,4)
             , getStartOffset() + 0
             ,4
             );
       replaceValue( // serialize and save the value
             getBinaryString((int)0,4)
             , getStartOffset() + 4
             ,4
             );
       replaceValue( // serialize and save the value
             ("01/01/0001").toCharArray()
             , getStartOffset() + 8
             ,10
             );
       replaceValue( // serialize and save the value
             ("01/01/0001").toCharArray()
             , getStartOffset() + 18
             ,10
             );
       replaceValue( // serialize and save the value
             getBinaryString((short)0,2)
             , getStartOffset() + 28
             ,2
             );
       replaceValue( // serialize and save the value
             getBinaryString((int)0,4)
             , getStartOffset() + 30
             ,4
             );
       replaceValue(pad(8,"10101L","0",LEFT_PAD),getStartOffset() + 34,8);
       replaceValue(pad(8,"10101L","0",LEFT_PAD),getStartOffset() + 42,8);
    } 



}
  
