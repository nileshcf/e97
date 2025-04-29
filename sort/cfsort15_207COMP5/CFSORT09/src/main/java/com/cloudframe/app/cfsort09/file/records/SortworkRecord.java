package com.cloudframe.app.cfsort09.file.records;

/**
*  The class SortworkRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class SortworkRecord extends SortworkRecordSerialized {
   

								@Getter @Setter private long sortworkKeyZoneDec;

								@Getter @Setter private long sortworkKeyComp3;

								@Getter @Setter private int sortworkKeyBinary;

								@Getter @Setter private int sortworkKeyComp;

								@Getter @Setter private int sortworkKeyComp4;

								@Getter @Setter private int sortworkKeyComp5;
	
	/**
	* Constructor for SortworkRecord
	**/
    public SortworkRecord() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
