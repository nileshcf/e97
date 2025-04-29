package com.cloudframe.app.ip343690.file.records;

/**
*  The class Db2cloneRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Db2cloneRec extends Db2cloneRecSerialized {
   

						@Getter @Setter private char[] db2cloneRecString = Field.fillLowValue(80);
	
	/**
	* Constructor for Db2cloneRec
	**/
    public Db2cloneRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
