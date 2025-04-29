package com.cloudframe.app.ar640010.dto;

/**
*  The class ApplicationDsn1000 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class ApplicationDsn1000 extends ApplicationDsn1000Serialized { 
   

						@Getter @Setter private char[] applicationDd1000 = new char[8];

	
	/**
	* Constructor for ApplicationDsn1000
	**/
    public ApplicationDsn1000() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for ApplicationDsn1000. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ApplicationDsn1000(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setApplicationDd1000(fillSpace(8));
       replaceValue( // serialize and save the value
             fillSpace(36)
             , getStartOffset() + 8
             ,36
             );
    } 



}
  
