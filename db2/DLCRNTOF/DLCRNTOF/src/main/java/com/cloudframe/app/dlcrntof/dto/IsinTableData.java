package com.cloudframe.app.dlcrntof.dto;

/**
*  The class IsinTableData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:43. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class IsinTableData extends IsinTableDataSerialized {
   
				@Getter @Setter private IsinTable isinTable = new IsinTable();
	
	/**
	* Constructor for IsinTableData
	**/
    public IsinTableData() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getIsinTable().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
