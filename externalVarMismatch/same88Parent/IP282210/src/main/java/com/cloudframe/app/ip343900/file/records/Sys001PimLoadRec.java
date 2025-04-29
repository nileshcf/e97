package com.cloudframe.app.ip343900.file.records;

/**
*  The class Sys001PimLoadRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Sys001PimLoadRec extends Sys001PimLoadRecSerialized {
   

						@Getter @Setter private char[] sys001StatCd = Field.fillLowValue(1);
	
	/**
	* Constructor for Sys001PimLoadRec
	**/
    public Sys001PimLoadRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
