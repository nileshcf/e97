package com.cloudframe.app.o529351u.dto;

/**
*  The class DdEqisAlt is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class DdEqisAlt extends DdEqisAltSerialized {
   

						@Getter @Setter private char[] eqiAltId = Field.fillLowValue(1);

						@Getter @Setter private char[] eqiAltFillerWs = new char[7];
	
	/**
	* Constructor for DdEqisAlt
	**/
    public DdEqisAlt() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setEqiAltFillerWs(("REQPT00").toCharArray());
    }





}
  
