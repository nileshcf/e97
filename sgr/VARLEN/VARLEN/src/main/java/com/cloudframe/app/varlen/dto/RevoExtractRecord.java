package com.cloudframe.app.varlen.dto;

/**
*  The class RevoExtractRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:40. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class RevoExtractRecord extends RevoExtractRecordSerialized {
   

						@Getter @Setter private char[] revoFixedPartOfRecord = Field.fillLowValue(674);
				@Getter @Setter private RevoHeaderRecord revoHeaderRecord = new RevoHeaderRecord();
				@Getter @Setter private RevoDetailRecord revoDetailRecord = new RevoDetailRecord();
				@Getter @Setter private RevoTrailerRecord revoTrailerRecord = new RevoTrailerRecord();
	
	/**
	* Constructor for RevoExtractRecord
	**/
    public RevoExtractRecord() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getRevoHeaderRecord().setParent(this,getStartOffset() + 2);
					getRevoDetailRecord().setParent(this,getStartOffset() + 2);
					getRevoTrailerRecord().setParent(this,getStartOffset() + 2);
	   	/*  end of offset */
    }





}
  
