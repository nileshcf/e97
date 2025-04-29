package com.cloudframe.app.ip305710.dto;

/**
*  The class Ip005703TableData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:46. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Ip005703TableData extends Ip005703TableDataSerialized {
   

								@Getter @Setter private long ip005703Tbl57PcCabGrpPtr;
				@Getter @Setter private Ip005703Tbl57Data ip005703Tbl57Data = new Ip005703Tbl57Data();
	
	/**
	* Constructor for Ip005703TableData
	**/
    public Ip005703TableData() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getIp005703Tbl57Data().setParent(this,getStartOffset() + 22);
	   	/*  end of offset */
    }





}
  
