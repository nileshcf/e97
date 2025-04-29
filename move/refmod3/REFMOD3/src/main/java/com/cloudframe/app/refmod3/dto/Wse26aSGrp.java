package com.cloudframe.app.refmod3.dto;

/**
*  The class Wse26aSGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:32. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Wse26aSGrp extends Wse26aSGrpSerialized {
   

						@Getter @Setter private char[] wse26aS = Field.fillLowValue(60);
	
	/**
	* Constructor for Wse26aSGrp
	**/
    public Wse26aSGrp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
