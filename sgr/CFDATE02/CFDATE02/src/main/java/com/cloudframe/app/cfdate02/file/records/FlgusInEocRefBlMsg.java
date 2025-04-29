package com.cloudframe.app.cfdate02.file.records;

/**
*  The class FlgusInEocRefBlMsg is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:41. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class FlgusInEocRefBlMsg extends FlgusInEocRefBlMsgSerialized { 
   

						@Getter @Setter private char[] flgusBillMessageRec = Field.fillLowValue(161);
	
	/**
	* Constructor for FlgusInEocRefBlMsg
	**/
    public FlgusInEocRefBlMsg() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for FlgusInEocRefBlMsg. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FlgusInEocRefBlMsg(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
