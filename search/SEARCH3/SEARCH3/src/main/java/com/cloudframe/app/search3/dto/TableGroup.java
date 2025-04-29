package com.cloudframe.app.search3.dto;

/**
*  The class TableGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:41. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class TableGroup extends TableGroupSerialized {
   
				@Getter @Setter private Table table = new Table();
	
	/**
	* Constructor for TableGroup
	**/
    public TableGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getTable().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
