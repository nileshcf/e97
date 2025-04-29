package com.cloudframe.app.sf320010.dto;

/**
*  The class GeneralWorkArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:43. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class GeneralWorkArea extends GeneralWorkAreaSerialized {
   

						@Getter @Setter private char[] generalWorkId = new char[3];

						@Getter @Setter private char[] generalWorkDate = new char[6];

						@Getter @Setter private char[] generalWorkTime = new char[6];

						@Getter @Setter private char[] generalWorkClass = new char[1];

						@Getter @Setter private char[] generalWorkRest = new char[8176];
	
	/**
	* Constructor for GeneralWorkArea
	**/
    public GeneralWorkArea() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setGeneralWorkId(fillSpace(3));
								setGeneralWorkDate(fillSpace(6));
								setGeneralWorkTime(fillSpace(6));
								setGeneralWorkClass(fillSpace(1));
								setGeneralWorkRest(pad(8176," ".toCharArray(),' ',RIGHT_PAD));
    }





}
  
