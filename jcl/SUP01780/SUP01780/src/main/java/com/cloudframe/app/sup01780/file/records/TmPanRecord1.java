package com.cloudframe.app.sup01780.file.records;

/**
*  The class TmPanRecord1 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class TmPanRecord1 extends TmPanRecord1Serialized {
   

						@Getter @Setter private char[] panKey1 = Field.fillLowValue(19);
	
	/**
	* Constructor for TmPanRecord1
	**/
    public TmPanRecord1() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
