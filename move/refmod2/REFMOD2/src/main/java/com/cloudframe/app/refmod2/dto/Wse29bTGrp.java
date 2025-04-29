package com.cloudframe.app.refmod2.dto;

/**
*  The class Wse29bTGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Wse29bTGrp extends Wse29bTGrpSerialized {
   
				@Getter @Setter private Wse29bT wse29bT = new Wse29bT();
	
	/**
	* Constructor for Wse29bTGrp
	**/
    public Wse29bTGrp() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getWse29bT().setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }





}
  
