package com.cloudframe.app.db2varch.dto;

/**
*  The class Dclbook is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:40. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Dclbook extends DclbookSerialized {
   

								@Getter @Setter private int bookId;

								@Getter @Setter private int isbn;
				@Getter @Setter private PublishedDate publishedDate = new PublishedDate();

								@Getter @Setter private int publisherId;

								@Getter @Setter private int rating;
				@Getter @Setter private TitleGrp titleGrp = new TitleGrp();

								@Getter @Setter private int totalPages;
	
	/**
	* Constructor for Dclbook
	**/
    public Dclbook() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getPublishedDate().setParent(this,getStartOffset() + 8);
					getTitleGrp().setParent(this,getStartOffset() + 273);
	   	/*  end of offset */
    }



	/**
	 * 	initializes Dclbook
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setBookId(0);
                     setIsbn(0);
          getPublishedDate().initialize();
     
                     setPublisherId(0);
                     setRating(0);
          getTitleGrp().initialize();
     
                     setTotalPages(0);
   }


}
  
