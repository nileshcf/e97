package com.cloudframe.app.search3.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:41. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Work extends WorkSerialized {
   

								@Getter @Setter private int lastDeTag800;

								@Getter @Setter private int srchval;

								@Getter @Setter private short i;

								@Getter @Setter private short start;

								@Getter @Setter private short len;

						@Getter @Setter private char[] valueCr300 = new char[2];

						@Getter @Setter private char[] valueDr300 = new char[2];

								@Getter @Setter private short accAmount801;

						@Getter @Setter private char[] accFinNonFinInd400 = new char[2];

								@Getter @Setter private short accFinNonFinAmt400;

						@Getter @Setter private char[] entryFoundFlg = Field.fillLowValue(1);

								@Getter @Setter private short ip66601UserTagType01;

								@Getter @Setter private short ip66601UserTagNo01;

								@Getter @Setter private short ip66601UserTagOccurrence01;

								@Getter @Setter private short ip66601UserTagSubfldNo01;

								@Getter @Setter private short ip66601UserTagStart01;

								@Getter @Setter private short ip66601UserTagLngth01;

						@Getter @Setter private char[] ip66601UserTagStatus01 = Field.fillLowValue(1);
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setValueCr300(("CR").toCharArray());
								setValueDr300(("DR").toCharArray());
								setAccFinNonFinInd400(fillSpace(2));
    }





}
  
