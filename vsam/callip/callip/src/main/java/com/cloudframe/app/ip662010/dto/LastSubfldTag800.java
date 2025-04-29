package com.cloudframe.app.ip662010.dto;

/**
*  The class LastSubfldTag800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class LastSubfldTag800 extends LastSubfldTag800Serialized {
   

						@Getter @Setter private char[] lastSubId800 = Field.fillLowValue(4);

								@Getter @Setter private short lastSubfldNo800;

								@Getter @Setter private short lastSubStart800;

								@Getter @Setter private short lastSubLngth800;
	
	/**
	* Constructor for LastSubfldTag800
	**/
    public LastSubfldTag800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
