package com.cloudframe.app.sf320010.dto;

/**
*  The class RpC7Detail is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:43. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class RpC7Detail extends RpC7DetailSerialized {
   

						@Getter @Setter private char[] rpC7DetCc = Field.fillLowValue(1);


						@Getter @Setter private char[] rpC7DetLogType = Field.fillLowValue(1);


						@Getter @Setter private char[] rpC7DetLogDesc = Field.fillLowValue(45);


								@Getter @Setter private char[] rpC7DetTotal = Field.fillLowValue(9);

	
	/**
	* Constructor for RpC7Detail
	**/
    public RpC7Detail() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             fillSpace(8)
             , getStartOffset() + 1
             ,8
             );
       replaceValue( // serialize and save the value
             fillSpace(9)
             , getStartOffset() + 10
             ,9
             );
       replaceValue( // serialize and save the value
             fillSpace(7)
             , getStartOffset() + 64
             ,7
             );
       replaceValue( // serialize and save the value
             fillSpace(52)
             , getStartOffset() + 80
             ,52
             );
    }





}
  
