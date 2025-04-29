package com.cloudframe.app.db2varch.dto;

/**
*  The class BookReqArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:40. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class BookReqArea extends BookReqAreaSerialized {
   

								@Getter @Setter private int breqBookId;

								@Getter @Setter private int breqIsbn;
				@Getter @Setter private BreqPublishedDate breqPublishedDate = new BreqPublishedDate();

								@Getter @Setter private int breqPublisherId;

								@Getter @Setter private int breqRating;
				@Getter @Setter private BreqTitleGrp breqTitleGrp = new BreqTitleGrp();

								@Getter @Setter private int breqTotalPages;
	
	/**
	* Constructor for BookReqArea
	**/
    public BookReqArea() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getBreqPublishedDate().setParent(this,getStartOffset() + 8);
					getBreqTitleGrp().setParent(this,getStartOffset() + 273);
	   	/*  end of offset */
    }





}
  
