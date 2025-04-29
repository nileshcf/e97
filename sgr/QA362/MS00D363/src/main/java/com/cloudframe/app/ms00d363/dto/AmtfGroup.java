package com.cloudframe.app.ms00d363.dto;

/**
*  The class AmtfGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class AmtfGroup extends AmtfGroupSerialized {
   

						@Getter @Setter private char[] amtf = Field.fillLowValue(11);

								@Getter @Setter private char[] amtf0 = Field.fillLowValue(11);

								@Getter @Setter private char[] amtf1 = Field.fillLowValue(11);

								@Getter @Setter private char[] amtf2 = Field.fillLowValue(11);

								@Getter @Setter private char[] amtf3 = Field.fillLowValue(11);

								@Getter @Setter private char[] amtf4 = Field.fillLowValue(11);

								@Getter @Setter private char[] amtf5 = Field.fillLowValue(11);

								@Getter @Setter private char[] amtf6 = Field.fillLowValue(11);

								@Getter @Setter private char[] amtf7 = Field.fillLowValue(11);
	
	/**
	* Constructor for AmtfGroup
	**/
    public AmtfGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
