package com.cloudframe.app.refmod2.dto;

/**
*  The class Wse214bSGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Wse214bSGrp extends Wse214bSGrpSerialized {
   

						@Getter @Setter private char[] wse214bS = Field.fillLowValue(60);
	
	/**
	* Constructor for Wse214bSGrp
	**/
    public Wse214bSGrp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
