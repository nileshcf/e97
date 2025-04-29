package com.cloudframe.app.db2varch.dto;

/**
*  The class BookWorkArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:40. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class BookWorkArea extends BookWorkAreaSerialized {
   

						@Getter @Setter private char[] bookTableName = new char[4];

								@Getter @Setter private int bookIoStatus;
	
	/**
	* Constructor for BookWorkArea
	**/
    public BookWorkArea() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setBookTableName(("BOOK").toCharArray());
								setBookIoStatus(7);
    }





}
  
