package com.cloudframe.app.db2varch.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:40. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Work extends WorkSerialized {
   

						@Getter @Setter private char[] db2varcl01 = new char[8];

								@Getter @Setter private char[] sqlcode_Ws = Field.fillLowValue(4);

						@Getter @Setter private char[] eofFlag = new char[1];

								@Getter @Setter private char[] prtBookId = Field.fillLowValue(10);

								@Getter @Setter private char[] prtIsbn = Field.fillLowValue(10);

								@Getter @Setter private int prtPublishedDateLen;

						@Getter @Setter private char[] prtPublishedDateText = Field.fillLowValue(255);

								@Getter @Setter private char[] prtPublisherId = Field.fillLowValue(10);

								@Getter @Setter private char[] prtRating = Field.fillLowValue(10);

								@Getter @Setter private int prtTitleLen;

						@Getter @Setter private char[] prtTitleText = Field.fillLowValue(255);

								@Getter @Setter private char[] prtTotalPages = Field.fillLowValue(10);
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setDb2varcl01(("DB2VARCL").toCharArray());
								setEofFlag(("N").toCharArray());
    }





}
  
