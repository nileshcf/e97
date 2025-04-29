package com.cloudframe.app.ip650010.file.records;

/**
*  The class Sys007OptimizedParmRecGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Sys007OptimizedParmRecGroup extends Sys007OptimizedParmRecGroupSerialized {
   
					@Getter @Setter private Sys007OptimizedParmRec sys007OptimizedParmRec = new Sys007OptimizedParmRec();
					@Getter @Setter private Sys007OneDayRec sys007OneDayRec = new Sys007OneDayRec();
	
	/**
	* Constructor for Sys007OptimizedParmRecGroup
	**/
    public Sys007OptimizedParmRecGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getSys007OptimizedParmRec().setParent(this,getStartOffset() + 0);
					getSys007OneDayRec().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
