package com.cloudframe.app.ip670010.dto;

/**
*  The class FormatedJulDate800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:29. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class FormatedJulDate800 extends FormatedJulDate800Serialized {
   

								@Getter @Setter private long julianDate800;

	
	/**
	* Constructor for FormatedJulDate800
	**/
    public FormatedJulDate800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setJulianDate800(0L);
       replaceValue( // serialize and save the value
             ("0").toCharArray()
             , getStartOffset() + 7
             ,1
             );
    }





}
  
