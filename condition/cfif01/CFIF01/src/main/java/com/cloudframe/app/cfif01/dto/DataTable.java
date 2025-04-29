package com.cloudframe.app.cfif01.dto;

/**
*  The class DataTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:26. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;


@Data
public class DataTable extends DataTableSerialized {
   
			@Getter @Setter private List<DataTableArray> dataTableArray = new ArrayList<>();
    	
	
	/**
	* Constructor for DataTable
	**/
    public DataTable() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < DATA_TABLE_ARRAY_SIZE;arrayIndex++) {
						getDataTableArray().add(new DataTableArray(this, beginDataTableArray + 
						arrayIndex * DataTableArray.getDataTableArrayFieldLength()));
				}
	   	/*  end of offset */
    }





}
  
