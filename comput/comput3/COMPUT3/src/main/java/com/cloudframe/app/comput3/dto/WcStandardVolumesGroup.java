package com.cloudframe.app.comput3.dto;

/**
*  The class WcStandardVolumesGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:26. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class WcStandardVolumesGroup extends WcStandardVolumesGroupSerialized {
   
					@Getter @Setter private WcStandardVolumes wcStandardVolumes = new WcStandardVolumes();
					@Getter @Setter private WcVolumeTable wcVolumeTable = new WcVolumeTable();
	
	/**
	* Constructor for WcStandardVolumesGroup
	**/
    public WcStandardVolumesGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getWcStandardVolumes().setParent(this,getStartOffset() + 0);
					getWcVolumeTable().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
