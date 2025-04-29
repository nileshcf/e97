package com.cloudframe.app.dbissues.dto;

/**
*  The class Cizf01o is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:43. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Cizf01o extends Cizf01oSerialized {
   
				@Getter @Setter private F01oParteFija f01oParteFija = new F01oParteFija();
	
	/**
	* Constructor for Cizf01o
	**/
    public Cizf01o() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getF01oParteFija().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
