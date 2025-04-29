package com.cloudframe.app.ms00d363.dto;

/**
*  The class AmtdGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class AmtdGroup extends AmtdGroupSerialized {
   

						@Getter @Setter private char[] amtd = Field.fillLowValue(18);

								@Getter @Setter private char[] amtd0 = Field.fillLowValue(18);

								@Getter @Setter private char[] amtd1 = Field.fillLowValue(18);

								@Getter @Setter private char[] amtd2 = Field.fillLowValue(18);

								@Getter @Setter private char[] amtd3 = Field.fillLowValue(18);

								@Getter @Setter private char[] amtd4 = Field.fillLowValue(18);

								@Getter @Setter private char[] amtd5 = Field.fillLowValue(18);

								@Getter @Setter private char[] amtd6 = Field.fillLowValue(18);

								@Getter @Setter private char[] amtd7 = Field.fillLowValue(18);
	
	/**
	* Constructor for AmtdGroup
	**/
    public AmtdGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
