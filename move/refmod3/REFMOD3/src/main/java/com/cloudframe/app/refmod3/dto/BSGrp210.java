package com.cloudframe.app.refmod3.dto;

/**
*  The class BSGrp210 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:32. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class BSGrp210 extends BSGrp210Serialized {
   

						@Getter @Setter private char[] bS210 = Field.fillLowValue(70);
	
	/**
	* Constructor for BSGrp210
	**/
    public BSGrp210() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
