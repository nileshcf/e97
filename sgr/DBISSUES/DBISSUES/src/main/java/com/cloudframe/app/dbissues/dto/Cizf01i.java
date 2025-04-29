package com.cloudframe.app.dbissues.dto;

/**
*  The class Cizf01i is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:43. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Cizf01i extends Cizf01iSerialized {
   
				@Getter @Setter private F01iParteFija f01iParteFija = new F01iParteFija();
	
	/**
	* Constructor for Cizf01i
	**/
    public Cizf01i() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getF01iParteFija().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
