package com.cloudframe.app.cfbooks.dto;

/**
*  The class BooksIsbn is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class BooksIsbn extends BooksIsbnSerialized { 
   

								@Getter @Setter private short booksIsbnLen;

						@Getter @Setter private char[] booksIsbnText = Field.fillLowValue(13);
	
	/**
	* Constructor for BooksIsbn
	**/
    public BooksIsbn() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for BooksIsbn. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BooksIsbn(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
