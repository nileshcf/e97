package com.cloudframe.app.sorttbl.dto;

/**
*  The class Ip00854wTableData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Ip00854wTableData extends Ip00854wTableDataSerialized {
   
				@Getter @Setter private Ip00854wTable ip00854wTable = new Ip00854wTable();
	
	/**
	* Constructor for Ip00854wTableData
	**/
    public Ip00854wTableData() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getIp00854wTable().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
