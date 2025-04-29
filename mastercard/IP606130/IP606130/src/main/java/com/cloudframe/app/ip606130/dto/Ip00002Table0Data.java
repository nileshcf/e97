package com.cloudframe.app.ip606130.dto;

/**
*  The class Ip00002Table0Data is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:29. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;


@Data
public class Ip00002Table0Data extends Ip00002Table0DataSerialized {
   
			@Getter @Setter private List<Ip00002Table0Entry> ip00002Table0Entry = new ArrayList<>();
    	
	
	/**
	* Constructor for Ip00002Table0Data
	**/
    public Ip00002Table0Data() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < IP_00002_TABLE_0_ENTRY_SIZE;arrayIndex++) {
						getIp00002Table0Entry().add(new Ip00002Table0Entry(this, beginIp00002Table0Entry + 
						arrayIndex * Ip00002Table0Entry.getIp00002Table0EntryFieldLength()));
				}
	   	/*  end of offset */
    }





}
  
