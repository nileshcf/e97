package com.cloudframe.app.sf311010.dto;

/**
*  The class TotalMessage650 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class TotalMessage650 extends TotalMessage650Serialized {
   


						@Getter @Setter private char[] totalDescription650 = new char[40];

								@Getter @Setter private char[] total650 = Field.fillLowValue(14);
	
	/**
	* Constructor for TotalMessage650
	**/
    public TotalMessage650() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("SF311010  ").toCharArray()
             , getStartOffset() + 0
             ,10
             );
								setTotalDescription650(fillSpace(40));
    }





}
  
