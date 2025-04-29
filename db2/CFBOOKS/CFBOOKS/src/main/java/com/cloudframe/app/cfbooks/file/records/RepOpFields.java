package com.cloudframe.app.cfbooks.file.records;

/**
*  The class RepOpFields is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class RepOpFields extends RepOpFieldsSerialized {
   

						@Getter @Setter private char[] opBookid = Field.fillLowValue(8);

						@Getter @Setter private char[] opTitle = Field.fillLowValue(77);

						@Getter @Setter private char[] opPages = Field.fillLowValue(4);

						@Getter @Setter private char[] opRating = Field.fillLowValue(4);

						@Getter @Setter private char[] opIsbn = Field.fillLowValue(13);

						@Getter @Setter private char[] opPubdate = Field.fillLowValue(10);

						@Getter @Setter private char[] opPubid = Field.fillLowValue(4);
	
	/**
	* Constructor for RepOpFields
	**/
    public RepOpFields() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
