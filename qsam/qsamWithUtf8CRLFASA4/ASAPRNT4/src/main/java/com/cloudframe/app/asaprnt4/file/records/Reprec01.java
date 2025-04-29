package com.cloudframe.app.asaprnt4.file.records;

/**
*  The class Reprec01 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Reprec01 extends Reprec01Serialized {
   

						@Getter @Setter private char[] reprecString = Field.fillLowValue(287);
	
	/**
	* Constructor for Reprec01
	**/
    public Reprec01() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
