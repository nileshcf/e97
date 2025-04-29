package com.cloudframe.app.ar640010.dto;

/**
*  The class SeqioVarRecord200 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class SeqioVarRecord200 extends SeqioVarRecord200Serialized { 
   
				@Getter @Setter private SeqioRdw200 seqioRdw200 = new SeqioRdw200();
				@Getter @Setter private SeqioDataGroup200 seqioDataGroup200 = new SeqioDataGroup200();
	
	/**
	* Constructor for SeqioVarRecord200
	**/
    public SeqioVarRecord200() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for SeqioVarRecord200. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SeqioVarRecord200(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getSeqioRdw200().setParent(this,getStartOffset() + 0);
					getSeqioDataGroup200().setParent(this,getStartOffset() + 4);
    } 



}
  
