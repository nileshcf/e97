package com.cloudframe.app.divide0.dto;

/**
*  The class BaPrefixVolumeTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;


@Data
public class BaPrefixVolumeTable extends BaPrefixVolumeTableSerialized {
   
			@Getter @Setter private List<BaVolumeEntry> baVolumeEntry = new ArrayList<>();
    	
	
	/**
	* Constructor for BaPrefixVolumeTable
	**/
    public BaPrefixVolumeTable() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < BA_VOLUME_ENTRY_SIZE;arrayIndex++) {
						getBaVolumeEntry().add(new BaVolumeEntry(this, beginBaVolumeEntry + 
						arrayIndex * BaVolumeEntry.getBaVolumeEntryFieldLength()));
				}
	   	/*  end of offset */
    }





}
  
