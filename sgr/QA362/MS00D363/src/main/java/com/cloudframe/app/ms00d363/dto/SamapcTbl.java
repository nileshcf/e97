package com.cloudframe.app.ms00d363.dto;

/**
*  The class SamapcTbl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;


@Data
public class SamapcTbl extends SamapcTblSerialized {
   
			@Getter @Setter private List<SamapcTable> samapcTable = new ArrayList<>();
    	
	
	/**
	* Constructor for SamapcTbl
	**/
    public SamapcTbl() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < SAMAPC_TABLE_SIZE;arrayIndex++) {
						getSamapcTable().add(new SamapcTable(this, beginSamapcTable + 
						arrayIndex * SamapcTable.getSamapcTableFieldLength()));
				}
	   	/*  end of offset */
    }





}
  
