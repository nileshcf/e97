package com.cloudframe.app.mc155.file.records;

/**
*  The class Sys109UniqueFileIdRecGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:32. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Sys109UniqueFileIdRecGroup extends Sys109UniqueFileIdRecGroupSerialized {
   
					@Getter @Setter private Sys109UniqueFileIdRec sys109UniqueFileIdRec = new Sys109UniqueFileIdRec();
					@Getter @Setter private Sys109UniqueFileIdRec1 sys109UniqueFileIdRec1 = new Sys109UniqueFileIdRec1();
	
	/**
	* Constructor for Sys109UniqueFileIdRecGroup
	**/
    public Sys109UniqueFileIdRecGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getSys109UniqueFileIdRec().setParent(this,getStartOffset() + 0);
					getSys109UniqueFileIdRec1().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
