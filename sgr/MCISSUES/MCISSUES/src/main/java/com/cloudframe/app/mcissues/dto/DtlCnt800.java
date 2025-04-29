package com.cloudframe.app.mcissues.dto;

/**
*  The class DtlCnt800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class DtlCnt800 extends DtlCnt800Serialized {
   

						@Getter @Setter private char[] dtlCntA800 = Field.fillLowValue(10);
				@Getter @Setter private DtlCntZ800 dtlCntZ800 = new DtlCntZ800();
	
	/**
	* Constructor for DtlCnt800
	**/
    public DtlCnt800() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getDtlCntZ800().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
