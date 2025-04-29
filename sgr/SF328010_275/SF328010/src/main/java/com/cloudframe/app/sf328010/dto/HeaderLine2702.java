package com.cloudframe.app.sf328010.dto;

/**
*  The class HeaderLine2702 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:33. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class HeaderLine2702 extends HeaderLine2702Serialized {
   






								@Getter @Setter private char[] pageNum702 = Field.fillLowValue(11);

	
	/**
	* Constructor for HeaderLine2702
	**/
    public HeaderLine2702() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("SERVER ID:ALL").toCharArray()
             , getStartOffset() + 0
             ,13
             );
       replaceValue( // serialize and save the value
             fillSpace(23)
             , getStartOffset() + 13
             ,23
             );
       replaceValue( // serialize and save the value
             (" ASA SERVICE ACTIVITY SUMMARY REPORT ").toCharArray()
             , getStartOffset() + 36
             ,37
             );
       replaceValue( // serialize and save the value
             fillSpace(34)
             , getStartOffset() + 73
             ,34
             );
       replaceValue( // serialize and save the value
             ("PAGE     :").toCharArray()
             , getStartOffset() + 107
             ,10
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 128
             ,1
             );
    }





}
  
