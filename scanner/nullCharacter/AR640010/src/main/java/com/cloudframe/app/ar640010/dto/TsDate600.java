package com.cloudframe.app.ar640010.dto;

/**
*  The class TsDate600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class TsDate600 extends TsDate600Serialized { 
   

						@Getter @Setter private char[] tsYear600 = new char[4];


						@Getter @Setter private char[] tsMonth600 = new char[2];


						@Getter @Setter private char[] tsDay600 = new char[2];
	
	/**
	* Constructor for TsDate600
	**/
    public TsDate600() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for TsDate600. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TsDate600(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setTsYear600(fillSpace(4));
       replaceValue( // serialize and save the value
             ("-").toCharArray()
             , getStartOffset() + 4
             ,1
             );
								setTsMonth600(fillSpace(2));
       replaceValue( // serialize and save the value
             ("-").toCharArray()
             , getStartOffset() + 7
             ,1
             );
								setTsDay600(fillSpace(2));
    } 



}
  
