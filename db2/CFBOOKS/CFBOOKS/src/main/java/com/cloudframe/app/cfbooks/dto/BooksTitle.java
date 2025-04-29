package com.cloudframe.app.cfbooks.dto;

/**
*  The class BooksTitle is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class BooksTitle extends BooksTitleSerialized { 
   

								@Getter @Setter private short booksTitleLen;

						@Getter @Setter private char[] booksTitleText = Field.fillLowValue(255);
	
	/**
	* Constructor for BooksTitle
	**/
    public BooksTitle() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for BooksTitle. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BooksTitle(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
