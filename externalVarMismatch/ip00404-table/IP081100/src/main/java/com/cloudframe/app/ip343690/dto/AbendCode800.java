package com.cloudframe.app.ip343690.dto;

/**
*  The class AbendCode800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class AbendCode800 extends AbendCode800Serialized { 
   


								@Getter @Setter private short abend800;
	
	/**
	* Constructor for AbendCode800
	**/
    public AbendCode800() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for AbendCode800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AbendCode800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 0
             ,2
             );
								setAbend800((short)0);
    } 



}
  
