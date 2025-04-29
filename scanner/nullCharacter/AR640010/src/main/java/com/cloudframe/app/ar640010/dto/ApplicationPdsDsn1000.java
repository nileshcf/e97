package com.cloudframe.app.ar640010.dto;

/**
*  The class ApplicationPdsDsn1000 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class ApplicationPdsDsn1000 extends ApplicationPdsDsn1000Serialized { 
   

						@Getter @Setter private char[] applicationPdsDd1000 = new char[8];

	
	/**
	* Constructor for ApplicationPdsDsn1000
	**/
    public ApplicationPdsDsn1000() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for ApplicationPdsDsn1000. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ApplicationPdsDsn1000(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setApplicationPdsDd1000(fillSpace(8));
       replaceValue( // serialize and save the value
             fillSpace(46)
             , getStartOffset() + 8
             ,46
             );
    } 



}
  
