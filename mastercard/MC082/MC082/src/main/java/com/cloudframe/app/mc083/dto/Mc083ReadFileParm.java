package com.cloudframe.app.mc083.dto;

/**
*  The class Mc083ReadFileParm is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Mc083ReadFileParm extends Mc083ReadFileParmSerialized {
   

						@Getter @Setter private char[] mc083FileStatus = Field.fillLowValue(2);

						@Getter @Setter private char[] mc083Data = Field.fillLowValue(80);
	
	/**
	* Constructor for Mc083ReadFileParm
	**/
    public Mc083ReadFileParm() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
