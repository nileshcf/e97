package com.cloudframe.app.refmod3.dto;

/**
*  The class Wse25aSGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:32. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Wse25aSGrp extends Wse25aSGrpSerialized {
   
				@Getter @Setter private Wse25aS wse25aS = new Wse25aS();
	
	/**
	* Constructor for Wse25aSGrp
	**/
    public Wse25aSGrp() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getWse25aS().setParent(this,getStartOffset() + 3);
	   	/*  end of offset */
    }





}
  
