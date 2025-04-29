package com.cloudframe.app.ar640010.dto;

/**
*  The class Tarasts is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Tarasts extends TarastsSerialized {
   

						@Getter @Setter private char[] tarastsStatRefId = Field.fillLowValue(4);

						@Getter @Setter private char[] tarastsStatRefDesc = Field.fillLowValue(80);
	
	/**
	* Constructor for Tarasts
	**/
    public Tarasts() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
