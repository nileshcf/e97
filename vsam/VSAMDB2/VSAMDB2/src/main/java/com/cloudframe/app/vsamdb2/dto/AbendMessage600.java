package com.cloudframe.app.vsamdb2.dto;

/**
*  The class AbendMessage600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:29. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class AbendMessage600 extends AbendMessage600Serialized {
   

						@Getter @Setter private char[] abendDescription600 = new char[42];


						@Getter @Setter private char[] fileStatus600 = Field.fillLowValue(2);
	
	/**
	* Constructor for AbendMessage600
	**/
    public AbendMessage600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setAbendDescription600(fillSpace(42));
       replaceValue( // serialize and save the value
             ("FILE STATUS=").toCharArray()
             , getStartOffset() + 42
             ,12
             );
    }





}
  
