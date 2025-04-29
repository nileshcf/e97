package com.cloudframe.app.ms00d363.dto;

/**
*  The class AmtepGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class AmtepGroup extends AmtepGroupSerialized {
   

						@Getter @Setter private char[] amtep = Field.fillLowValue(20);

								@Getter @Setter private char[] amtep0 = Field.fillLowValue(20);

								@Getter @Setter private char[] amtep1 = Field.fillLowValue(20);

								@Getter @Setter private char[] amtep2 = Field.fillLowValue(20);

								@Getter @Setter private char[] amtep3 = Field.fillLowValue(20);

								@Getter @Setter private char[] amtep4 = Field.fillLowValue(20);

								@Getter @Setter private char[] amtep5 = Field.fillLowValue(20);

								@Getter @Setter private char[] amtep6 = Field.fillLowValue(20);

								@Getter @Setter private char[] amtep7 = Field.fillLowValue(20);
	
	/**
	* Constructor for AmtepGroup
	**/
    public AmtepGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
