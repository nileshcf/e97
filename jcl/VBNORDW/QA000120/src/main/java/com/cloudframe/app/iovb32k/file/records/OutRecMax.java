package com.cloudframe.app.iovb32k.file.records;

/**
*  The class OutRecMax is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class OutRecMax extends OutRecMaxSerialized {
   

						@Getter @Setter private char[] outRecMaxString = Field.fillLowValue(32752);
	
	/**
	* Constructor for OutRecMax
	**/
    public OutRecMax() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
