package com.cloudframe.app.db2set3.dto;

/**
*  The class Vars is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:43. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Vars extends VarsSerialized {
   

						@Getter @Setter private char[] firstDayMnth = Field.fillLowValue(10);

						@Getter @Setter private char[] inputDate = Field.fillLowValue(10);

						@Getter @Setter private char[] effEndDateCalc = Field.fillLowValue(10);

						@Getter @Setter private char[] effEndDateBuild = Field.fillLowValue(10);

						@Getter @Setter private char[] lastDate = Field.fillLowValue(10);
	
	/**
	* Constructor for Vars
	**/
    public Vars() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
