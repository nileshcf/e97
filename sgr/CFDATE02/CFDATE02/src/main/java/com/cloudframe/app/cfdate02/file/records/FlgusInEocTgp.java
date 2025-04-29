package com.cloudframe.app.cfdate02.file.records;

/**
*  The class FlgusInEocTgp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:41. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class FlgusInEocTgp extends FlgusInEocTgpSerialized { 
   

						@Getter @Setter private char[] flgusTgpRec = Field.fillLowValue(161);
	
	/**
	* Constructor for FlgusInEocTgp
	**/
    public FlgusInEocTgp() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for FlgusInEocTgp. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FlgusInEocTgp(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
