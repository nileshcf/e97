package com.cloudframe.app.ar640010.dto;

/**
*  The class SeqioRdw200 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class SeqioRdw200 extends SeqioRdw200Serialized { 
   

								@Getter @Setter private short seqioLrecl200;

	
	/**
	* Constructor for SeqioRdw200
	**/
    public SeqioRdw200() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for SeqioRdw200. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SeqioRdw200(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setSeqioLrecl200((short)0);
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 2
             ,2
             );
    } 



}
  
