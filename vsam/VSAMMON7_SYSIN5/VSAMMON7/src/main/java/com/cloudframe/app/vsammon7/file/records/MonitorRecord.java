package com.cloudframe.app.vsammon7.file.records;

/**
*  The class MonitorRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:29. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class MonitorRecord extends MonitorRecordSerialized {
   
				@Getter @Setter private MonPriKey monPriKey = new MonPriKey();
	
	/**
	* Constructor for MonitorRecord
	**/
    public MonitorRecord() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getMonPriKey().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
