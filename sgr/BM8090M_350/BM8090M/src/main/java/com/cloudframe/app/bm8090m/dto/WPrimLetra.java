package com.cloudframe.app.bm8090m.dto;

/**
*  The class WPrimLetra is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class WPrimLetra extends WPrimLetraSerialized {
   

						@Getter @Setter private char[] wLetra = new char[1];

	
	/**
	* Constructor for WPrimLetra
	**/
    public WPrimLetra() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setWLetra(fillSpace(1));
       replaceValue( // serialize and save the value
             fillSpace(19)
             , getStartOffset() + 1
             ,19
             );
    }





}
  
