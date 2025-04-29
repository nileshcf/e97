package com.cloudframe.app.ip088030.dto;

/**
*  The class MsgsRead600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class MsgsRead600 extends MsgsRead600Serialized {
   


								@Getter @Setter private char[] readCnt600 = Field.fillLowValue(11);
	
	/**
	* Constructor for MsgsRead600
	**/
    public MsgsRead600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("IP088030-NO. OF RECS READ    =  ").toCharArray()
             , getStartOffset() + 0
             ,32
             );
    }





}
  
