package com.cloudframe.app.ar640010.dto;

/**
*  The class PgmMillisecond800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class PgmMillisecond800 extends PgmMillisecond800Serialized { 
   

								@Getter @Setter private int pgmHundredth800;

	
	/**
	* Constructor for PgmMillisecond800
	**/
    public PgmMillisecond800() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for PgmMillisecond800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public PgmMillisecond800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setPgmHundredth800(0);
       replaceValue(pad(4,"0","0",LEFT_PAD),getStartOffset() + 2,4);
    } 



}
  
