package com.cloudframe.app.ar640010.dto;

/**
*  The class TsSuffix600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class TsSuffix600 extends TsSuffix600Serialized { 
   

				@Getter @Setter private TsDate600 tsDate600 = new TsDate600();

				@Getter @Setter private TsTime600 tsTime600 = new TsTime600();


						@Getter @Setter private char[] tsHundredth600 = new char[2];
	
	/**
	* Constructor for TsSuffix600
	**/
    public TsSuffix600() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for TsSuffix600. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TsSuffix600(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getTsDate600().setParent(this,getStartOffset() + 9);
					getTsTime600().setParent(this,getStartOffset() + 27);
       replaceValue( // serialize and save the value
             (" - DATE: ").toCharArray()
             , getStartOffset() + 0
             ,9
             );
       replaceValue( // serialize and save the value
             (", TIME: ").toCharArray()
             , getStartOffset() + 19
             ,8
             );
       replaceValue( // serialize and save the value
             (".").toCharArray()
             , getStartOffset() + 35
             ,1
             );
								setTsHundredth600(fillSpace(2));
    } 



}
  
