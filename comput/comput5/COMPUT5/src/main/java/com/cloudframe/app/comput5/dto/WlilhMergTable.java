package com.cloudframe.app.comput5.dto;

/**
*  The class WlilhMergTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;


@Data
public class WlilhMergTable extends WlilhMergTableSerialized {
   
			@Getter @Setter private List<WlilhMrTbl> wlilhMrTbl = new ArrayList<>();
    	
	
	/**
	* Constructor for WlilhMergTable
	**/
    public WlilhMergTable() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < WLILH_MR_TBL_SIZE;arrayIndex++) {
						getWlilhMrTbl().add(new WlilhMrTbl(this, beginWlilhMrTbl + 
						arrayIndex * WlilhMrTbl.getWlilhMrTblFieldLength()));
				}
	   	/*  end of offset */
    }





}
  
