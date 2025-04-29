package com.cloudframe.app.ip088030.file.records;

/**
*  The class Sys201OutputRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Sys201OutputRecord extends Sys201OutputRecordSerialized {
   

						@Getter @Setter private char[] sys201RecordPart1 = Field.fillLowValue(255);
				@Getter @Setter private Sys201RecordPart2 sys201RecordPart2 = new Sys201RecordPart2();
				@Getter @Setter private Sys201RecordPart3 sys201RecordPart3 = new Sys201RecordPart3();
	
	/**
	* Constructor for Sys201OutputRecord
	**/
    public Sys201OutputRecord() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getSys201RecordPart2().setParent(this,getStartOffset() + 255);
					getSys201RecordPart3().setParent(this,getStartOffset() + 750);
	   	/*  end of offset */
    }





}
  
