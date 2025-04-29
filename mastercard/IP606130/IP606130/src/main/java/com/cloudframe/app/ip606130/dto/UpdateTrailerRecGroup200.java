package com.cloudframe.app.ip606130.dto;

/**
*  The class UpdateTrailerRecGroup200 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:29. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class UpdateTrailerRecGroup200 extends UpdateTrailerRecGroup200Serialized {
   
					@Getter @Setter private UpdateTrailerRec200 updateTrailerRec200 = new UpdateTrailerRec200();
					@Getter @Setter private UpdateTrailerRec200Redefined updateTrailerRec200Redefined = new UpdateTrailerRec200Redefined();
	
	/**
	* Constructor for UpdateTrailerRecGroup200
	**/
    public UpdateTrailerRecGroup200() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getUpdateTrailerRec200().setParent(this,getStartOffset() + 0);
					getUpdateTrailerRec200Redefined().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
