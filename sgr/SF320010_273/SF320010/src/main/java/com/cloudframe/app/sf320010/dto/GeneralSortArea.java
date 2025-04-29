package com.cloudframe.app.sf320010.dto;

/**
*  The class GeneralSortArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:43. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class GeneralSortArea extends GeneralSortAreaSerialized {
   

						@Getter @Setter private char[] generalSortId = new char[3];

						@Getter @Setter private char[] generalSortCc = new char[2];

						@Getter @Setter private char[] generalSortDate = new char[6];

						@Getter @Setter private char[] generalSortTime = new char[6];

						@Getter @Setter private char[] generalSortClass = new char[1];

						@Getter @Setter private char[] generalSortRest = new char[8176];
	
	/**
	* Constructor for GeneralSortArea
	**/
    public GeneralSortArea() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setGeneralSortId(fillSpace(3));
								setGeneralSortCc(fillSpace(2));
								setGeneralSortDate(fillSpace(6));
								setGeneralSortTime(fillSpace(6));
								setGeneralSortClass(fillSpace(1));
								setGeneralSortRest(pad(8176," ".toCharArray(),' ',RIGHT_PAD));
    }





}
  
