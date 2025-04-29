package com.cloudframe.app.ip606130.dto;

/**
*  The class InavalidDateMsg600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:29. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class InavalidDateMsg600 extends InavalidDateMsg600Serialized {
   


						@Getter @Setter private char[] invalidJulianDate600 = new char[5];
	
	/**
	* Constructor for InavalidDateMsg600
	**/
    public InavalidDateMsg600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("INVALID DATE FOUND - ").toCharArray()
             , getStartOffset() + 0
             ,21
             );
								setInvalidJulianDate600(fillSpace(5));
    }





}
  
