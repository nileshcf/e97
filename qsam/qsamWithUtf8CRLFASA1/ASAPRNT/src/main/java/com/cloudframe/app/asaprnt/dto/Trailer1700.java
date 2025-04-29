package com.cloudframe.app.asaprnt.dto;

/**
*  The class Trailer1700 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:48. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Trailer1700 extends Trailer1700Serialized {
   



								@Getter @Setter private char[] t1TotLen700 = Field.fillLowValue(7);

	
	/**
	* Constructor for Trailer1700
	**/
    public Trailer1700() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             fillSpace(16)
             , getStartOffset() + 0
             ,16
             );
       replaceValue( // serialize and save the value
             ("TOTAL MESSAGE LENGTH : ").toCharArray()
             , getStartOffset() + 16
             ,23
             );
       replaceValue( // serialize and save the value
             pad(93," ".toCharArray(),' ',RIGHT_PAD)
             , getStartOffset() + 46
             ,93
             );
    }





}
  
