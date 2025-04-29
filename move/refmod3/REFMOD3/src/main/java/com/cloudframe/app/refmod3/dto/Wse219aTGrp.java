package com.cloudframe.app.refmod3.dto;

/**
*  The class Wse219aTGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:32. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Wse219aTGrp extends Wse219aTGrpSerialized {
   
				@Getter @Setter private Wse219aT wse219aT = new Wse219aT();
	
	/**
	* Constructor for Wse219aTGrp
	**/
    public Wse219aTGrp() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getWse219aT().setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }





}
  
