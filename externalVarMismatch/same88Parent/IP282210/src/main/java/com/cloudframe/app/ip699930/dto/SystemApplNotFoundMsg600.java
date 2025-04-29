package com.cloudframe.app.ip699930.dto;

/**
*  The class SystemApplNotFoundMsg600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class SystemApplNotFoundMsg600 extends SystemApplNotFoundMsg600Serialized {
   


						@Getter @Setter private char[] noSystemApplIdsApplId600 = Field.fillLowValue(3);


						@Getter @Setter private char[] noSystemApplIdsPa600 = Field.fillLowValue(11);
	
	/**
	* Constructor for SystemApplNotFoundMsg600
	**/
    public SystemApplNotFoundMsg600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("SYSTEM APPLICATION ID ").toCharArray()
             , getStartOffset() + 0
             ,22
             );
       replaceValue( // serialize and save the value
             ("NOT FOUND FOR PROCESSING AGREEMENT: ").toCharArray()
             , getStartOffset() + 25
             ,36
             );
    }





}
  
