package com.cloudframe.app.ip299010.dto;

/**
*  The class Ip00054wTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;


@Data
public class Ip00054wTable extends Ip00054wTableSerialized {
   
			@Getter @Setter private List<Ip00054wEntry> ip00054wEntry = new ArrayList<>();
    	
	
	/**
	* Constructor for Ip00054wTable
	**/
    public Ip00054wTable() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < IP_00054W_ENTRY_SIZE;arrayIndex++) {
						getIp00054wEntry().add(new Ip00054wEntry(this, beginIp00054wEntry + 
						arrayIndex * Ip00054wEntry.getIp00054wEntryFieldLength()));
				}
	   	/*  end of offset */
    }





}
  
