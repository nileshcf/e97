package com.cloudframe.app.sf311010.dto;

/**
*  The class Sf501LogRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Sf501LogRecord extends Sf501LogRecordSerialized {
   

						@Getter @Setter private char[] sf501Record = Field.fillLowValue(8000);
				@Getter @Setter private Sf501RecordRedefined sf501RecordRedefined = new Sf501RecordRedefined();
				@Getter @Setter private Sf5019Record sf5019Record = new Sf5019Record();

						@Getter @Setter private char[] sf501RRecord = Field.fillLowValue(8000);
				@Getter @Setter private Sf501IRecord sf501IRecord = new Sf501IRecord();
				@Getter @Setter private Sf501PRecord sf501PRecord = new Sf501PRecord();
				@Getter @Setter private Sf501NRecord sf501NRecord = new Sf501NRecord();
	
	/**
	* Constructor for Sf501LogRecord
	**/
    public Sf501LogRecord() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getSf501RecordRedefined().setParent(this,getStartOffset() + 0);
					getSf5019Record().setParent(this,getStartOffset() + 0);
					getSf501IRecord().setParent(this,getStartOffset() + 0);
					getSf501PRecord().setParent(this,getStartOffset() + 0);
					getSf501NRecord().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
