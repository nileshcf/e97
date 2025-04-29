package com.cloudframe.app.varlen.dto;

/**
*  The class Revo3ExtractRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:40. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Revo3ExtractRecord extends Revo3ExtractRecordSerialized {
   

						@Getter @Setter private char[] revo3FixedPartOfRecord = Field.fillLowValue(32);
				@Getter @Setter private Revo3HeaderRecord revo3HeaderRecord = new Revo3HeaderRecord();
				@Getter @Setter private Revo3DetailRecord revo3DetailRecord = new Revo3DetailRecord();
				@Getter @Setter private Revo3TrailerRecord revo3TrailerRecord = new Revo3TrailerRecord();
	
	/**
	* Constructor for Revo3ExtractRecord
	**/
    public Revo3ExtractRecord() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getRevo3HeaderRecord().setParent(this,getStartOffset() + 2);
					getRevo3DetailRecord().setParent(this,getStartOffset() + 2);
					getRevo3TrailerRecord().setParent(this,getStartOffset() + 2);
	   	/*  end of offset */
    }





}
  
