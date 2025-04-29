package com.cloudframe.app.ip305710.dto;

/**
*  The class Ip005704TableData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:46. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Ip005704TableData extends Ip005704TableDataSerialized {
   
				@Getter @Setter private Ip005704Tbl57Data ip005704Tbl57Data = new Ip005704Tbl57Data();
	
	/**
	* Constructor for Ip005704TableData
	**/
    public Ip005704TableData() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getIp005704Tbl57Data().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
