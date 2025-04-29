package com.cloudframe.app.init1.dto;

/**
*  The class FlguuInEocUsgBlTlr is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class FlguuInEocUsgBlTlr extends FlguuInEocUsgBlTlrSerialized { 
   

						@Getter @Setter private char[] flguuFiller = Field.fillLowValue(971);
	
	/**
	* Constructor for FlguuInEocUsgBlTlr
	**/
    public FlguuInEocUsgBlTlr() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for FlguuInEocUsgBlTlr. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FlguuInEocUsgBlTlr(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
