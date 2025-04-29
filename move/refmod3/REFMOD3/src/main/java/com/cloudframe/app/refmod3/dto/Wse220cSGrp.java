package com.cloudframe.app.refmod3.dto;

/**
*  The class Wse220cSGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:32. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Wse220cSGrp extends Wse220cSGrpSerialized {
   
				@Getter @Setter private Wse220cS wse220cS = new Wse220cS();
	
	/**
	* Constructor for Wse220cSGrp
	**/
    public Wse220cSGrp() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getWse220cS().setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }





}
  
