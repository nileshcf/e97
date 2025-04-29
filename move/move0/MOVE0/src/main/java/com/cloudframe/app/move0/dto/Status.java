package com.cloudframe.app.move0.dto;

/**
*  The class Status is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Status extends StatusSerialized {
   


						@Getter @Setter private char[] gnpHHeaderTimeSs1 = Field.fillLowValue(2);


						@Getter @Setter private char[] gnpHHeaderTimeSs2 = Field.fillLowValue(2);


						@Getter @Setter private char[] gnpHHeaderTimeSs3 = Field.fillLowValue(2);

	
	/**
	* Constructor for Status
	**/
    public Status() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             (">>").toCharArray()
             , getStartOffset() + 0
             ,2
             );
       replaceValue( // serialize and save the value
             ("|").toCharArray()
             , getStartOffset() + 4
             ,1
             );
       replaceValue( // serialize and save the value
             ("|").toCharArray()
             , getStartOffset() + 7
             ,1
             );
       replaceValue( // serialize and save the value
             ("<<").toCharArray()
             , getStartOffset() + 10
             ,2
             );
    }





}
  
