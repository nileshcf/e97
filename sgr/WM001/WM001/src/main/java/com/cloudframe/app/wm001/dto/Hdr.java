package com.cloudframe.app.wm001.dto;

/**
*  The class Hdr is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Hdr extends HdrSerialized {
   


						@Getter @Setter private char[] hdrL2 = Field.fillLowValue(35);


								@Getter @Setter private int hdrCnt;


						@Getter @Setter private char[] hdrL3 = Field.fillLowValue(35);

	
	/**
	* Constructor for Hdr
	**/
    public Hdr() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("*").toCharArray()
             , getStartOffset() + 0
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 36
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 39
             ,1
             );
       replaceValue( // serialize and save the value
             ("*").toCharArray()
             , getStartOffset() + 75
             ,1
             );
    }





}
  
