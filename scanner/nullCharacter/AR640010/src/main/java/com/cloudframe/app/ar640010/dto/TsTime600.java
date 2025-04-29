package com.cloudframe.app.ar640010.dto;

/**
*  The class TsTime600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class TsTime600 extends TsTime600Serialized { 
   

						@Getter @Setter private char[] tsHour600 = new char[2];


						@Getter @Setter private char[] tsMinute600 = new char[2];


						@Getter @Setter private char[] tsSecond600 = new char[2];
	
	/**
	* Constructor for TsTime600
	**/
    public TsTime600() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for TsTime600. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TsTime600(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setTsHour600(fillSpace(2));
       replaceValue( // serialize and save the value
             (".").toCharArray()
             , getStartOffset() + 2
             ,1
             );
								setTsMinute600(fillSpace(2));
       replaceValue( // serialize and save the value
             (".").toCharArray()
             , getStartOffset() + 5
             ,1
             );
								setTsSecond600(fillSpace(2));
    } 



}
  
