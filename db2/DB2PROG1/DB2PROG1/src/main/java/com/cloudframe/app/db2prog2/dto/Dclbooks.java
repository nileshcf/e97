package com.cloudframe.app.db2prog2.dto;

/**
*  The class Dclbooks is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:43. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Dclbooks extends DclbooksSerialized {
   

								@Getter @Setter private int booksBookId;
				@Getter @Setter private BooksTitle booksTitle = new BooksTitle();
	
	/**
	* Constructor for Dclbooks
	**/
    public Dclbooks() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getBooksTitle().setParent(this,getStartOffset() + 4);
	   	/*  end of offset */
    }





}
  
