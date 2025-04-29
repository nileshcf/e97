package com.cloudframe.app.ip662010.dto;

/**
*  The class TooManyTags600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class TooManyTags600 extends TooManyTags600Serialized {
   


								@Getter @Setter private int maxTagNo600;

	
	/**
	* Constructor for TooManyTags600
	**/
    public TooManyTags600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("MORE THAN ").toCharArray()
             , getStartOffset() + 0
             ,10
             );
       replaceValue( // serialize and save the value
             ("TAGS IN MAPPING TABLE").toCharArray()
             , getStartOffset() + 14
             ,21
             );
    }





}
  
