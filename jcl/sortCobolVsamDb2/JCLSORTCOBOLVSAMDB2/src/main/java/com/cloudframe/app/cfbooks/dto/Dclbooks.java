package com.cloudframe.app.cfbooks.dto;

/**
*  The class Dclbooks is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


@Data
public class Dclbooks extends DclbooksSerialized {
   

								@Getter @Setter private int booksBookId;
				@Getter @Setter private BooksTitle booksTitle = new BooksTitle();

								@Getter @Setter private int booksTotalPages;

								@Getter @Setter private BigDecimal booksRating = BigDecimal.ZERO;
				@Getter @Setter private BooksIsbn booksIsbn = new BooksIsbn();

						@Getter @Setter private char[] booksPublishedDate = Field.fillLowValue(10);

								@Getter @Setter private int booksPublisherId;
	
	/**
	* Constructor for Dclbooks
	**/
    public Dclbooks() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getBooksTitle().setParent(this,getStartOffset() + 4);
					getBooksIsbn().setParent(this,getStartOffset() + 268);
	   	/*  end of offset */
    }





}
  
