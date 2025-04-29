package com.cloudframe.app.search0.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:40. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Work extends WorkSerialized {
   

						@Getter @Setter private char[] search = Field.fillLowValue(3);

								@Getter @Setter private long tb05323FinEvntNo;

						@Getter @Setter private char[] tb05323FinMktId = Field.fillLowValue(3);

								@Getter @Setter private int financialCategory;

								@Getter @Setter private short finShortCategory;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
