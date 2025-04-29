package com.cloudframe.app.ar640010.dto;

/**
*  The class Ar629ParmArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Ar629ParmArea extends Ar629ParmAreaSerialized {
   

						@Getter @Setter private char[] ar629ProgramId = new char[8];
				@Getter @Setter private Ar629MsgTypeGroup ar629MsgTypeGroup = new Ar629MsgTypeGroup();
				@Getter @Setter private Ar629MsgTextGroup ar629MsgTextGroup = new Ar629MsgTextGroup();
	
	/**
	* Constructor for Ar629ParmArea
	**/
    public Ar629ParmArea() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getAr629MsgTypeGroup().setParent(this,getStartOffset() + 8);
					getAr629MsgTextGroup().setParent(this,getStartOffset() + 9);
	   	/*  end of offset */
								setAr629ProgramId(("AR629010").toCharArray());
    }





}
  
