package com.cloudframe.app.ip343900.dto;

/**
*  The class Parms is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Parms extends ParmsSerialized {
   

								@Getter @Setter private short parmLength800;

						@Getter @Setter private char[] parmJobgroup800 = Field.fillLowValue(6);

								@Getter @Setter private int parmJobgrpNum800;


								@Getter @Setter private int commitCnt800;


						@Getter @Setter private char[] cloneOwnerId800 = Field.fillLowValue(3);
	
	/**
	* Constructor for Parms
	**/
    public Parms() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
