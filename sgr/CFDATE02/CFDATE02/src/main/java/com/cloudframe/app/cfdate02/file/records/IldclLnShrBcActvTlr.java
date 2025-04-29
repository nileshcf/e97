package com.cloudframe.app.cfdate02.file.records;

/**
*  The class IldclLnShrBcActvTlr is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:41. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class IldclLnShrBcActvTlr extends IldclLnShrBcActvTlrSerialized { 
   

						@Getter @Setter private char[] ildclFiller = Field.fillLowValue(311);
	
	/**
	* Constructor for IldclLnShrBcActvTlr
	**/
    public IldclLnShrBcActvTlr() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for IldclLnShrBcActvTlr. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public IldclLnShrBcActvTlr(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
