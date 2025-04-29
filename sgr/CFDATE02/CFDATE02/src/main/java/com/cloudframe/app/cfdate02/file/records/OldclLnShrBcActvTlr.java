package com.cloudframe.app.cfdate02.file.records;

/**
*  The class OldclLnShrBcActvTlr is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:41. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class OldclLnShrBcActvTlr extends OldclLnShrBcActvTlrSerialized { 
   

						@Getter @Setter private char[] oldclFiller = Field.fillLowValue(311);
	
	/**
	* Constructor for OldclLnShrBcActvTlr
	**/
    public OldclLnShrBcActvTlr() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for OldclLnShrBcActvTlr. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public OldclLnShrBcActvTlr(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
