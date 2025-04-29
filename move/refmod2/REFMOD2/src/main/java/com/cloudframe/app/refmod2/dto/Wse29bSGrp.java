package com.cloudframe.app.refmod2.dto;

/**
*  The class Wse29bSGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Wse29bSGrp extends Wse29bSGrpSerialized {
   
				@Getter @Setter private Wse29bS wse29bS = new Wse29bS();
	
	/**
	* Constructor for Wse29bSGrp
	**/
    public Wse29bSGrp() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getWse29bS().setParent(this,getStartOffset() + 3);
	   	/*  end of offset */
    }





}
  
