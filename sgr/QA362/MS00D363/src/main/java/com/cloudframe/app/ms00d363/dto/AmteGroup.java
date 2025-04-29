package com.cloudframe.app.ms00d363.dto;

/**
*  The class AmteGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class AmteGroup extends AmteGroupSerialized {
   

						@Getter @Setter private char[] amte = Field.fillLowValue(16);

								@Getter @Setter private char[] amte0 = Field.fillLowValue(16);

								@Getter @Setter private char[] amte1 = Field.fillLowValue(16);

								@Getter @Setter private char[] amte2 = Field.fillLowValue(16);

								@Getter @Setter private char[] amte3 = Field.fillLowValue(16);

								@Getter @Setter private char[] amte4 = Field.fillLowValue(16);

								@Getter @Setter private char[] amte5 = Field.fillLowValue(16);

								@Getter @Setter private char[] amte6 = Field.fillLowValue(16);

								@Getter @Setter private char[] amte7 = Field.fillLowValue(16);
	
	/**
	* Constructor for AmteGroup
	**/
    public AmteGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
