package com.cloudframe.app.init1.dto;

/**
*  The class BmdCdrInfo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class BmdCdrInfo extends BmdCdrInfoSerialized {
   
				@Getter @Setter private BmdCdrTable bmdCdrTable = new BmdCdrTable();
	
	/**
	* Constructor for BmdCdrInfo
	**/
    public BmdCdrInfo() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getBmdCdrTable().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
