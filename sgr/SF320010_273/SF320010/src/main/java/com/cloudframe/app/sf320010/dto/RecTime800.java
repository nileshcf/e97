package com.cloudframe.app.sf320010.dto;

/**
*  The class RecTime800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:43. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class RecTime800 extends RecTime800Serialized { 
   

						@Getter @Setter private char[] recTimeHh800 = new char[2];


						@Getter @Setter private char[] recTimeMm800 = new char[2];


						@Getter @Setter private char[] recTimeSs800 = new char[2];
	
	/**
	* Constructor for RecTime800
	**/
    public RecTime800() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for RecTime800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RecTime800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setRecTimeHh800(fillSpace(2));
       replaceValue( // serialize and save the value
             (":").toCharArray()
             , getStartOffset() + 2
             ,1
             );
								setRecTimeMm800(fillSpace(2));
       replaceValue( // serialize and save the value
             (":").toCharArray()
             , getStartOffset() + 5
             ,1
             );
								setRecTimeSs800(fillSpace(2));
    } 



}
  
