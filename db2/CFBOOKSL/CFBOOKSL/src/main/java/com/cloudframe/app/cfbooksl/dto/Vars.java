package com.cloudframe.app.cfbooksl.dto;

/**
*  The class Vars is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:41. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.utility.CFUtil;


@Data
public class Vars extends VarsSerialized {
   

						@Getter @Setter private char[] timestamp = new char[23];

								@Getter @Setter private long bookid;

								@Getter @Setter private char[] rating = new char[4];
							

								@Getter @Setter private int pages;

								@Getter @Setter private int pubid;

								@Getter @Setter private int recCount;

						@Getter @Setter private char[] recBuffer = new char[132];
	
	/**
	* Constructor for Vars
	**/
    public Vars() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setTimestamp(fillSpace(23));
								setBookid(0L);
								setRating(CFUtil.cobolNumberFormatter("9.99".toCharArray(),"0".toCharArray()));
								setPages(0);
								setPubid(0);
								setRecCount(0);
								setRecBuffer(pad(132," ".toCharArray(),' ',RIGHT_PAD));
    }





}
  
