package com.cloudframe.app.sf320010.file.records;

/**
*  The class SdSortWorkFileRcd is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:43. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class SdSortWorkFileRcd extends SdSortWorkFileRcdSerialized {
   
				@Getter @Setter private SdSortKey sdSortKey = new SdSortKey();

						@Getter @Setter private char[] sdSortClass = Field.fillLowValue(1);
				@Getter @Setter private SdSortKey2 sdSortKey2 = new SdSortKey2();
	
	/**
	* Constructor for SdSortWorkFileRcd
	**/
    public SdSortWorkFileRcd() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getSdSortKey().setParent(this,getStartOffset() + 0);
					getSdSortKey2().setParent(this,getStartOffset() + 18);
	   	/*  end of offset */
    }





}
  
