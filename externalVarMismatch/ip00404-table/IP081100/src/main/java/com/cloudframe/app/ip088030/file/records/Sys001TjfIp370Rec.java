package com.cloudframe.app.ip088030.file.records;

/**
*  The class Sys001TjfIp370Rec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Sys001TjfIp370Rec extends Sys001TjfIp370RecSerialized {
   
				@Getter @Setter private Ip98151RecordPart1 ip98151RecordPart1 = new Ip98151RecordPart1();
				@Getter @Setter private Ip98152RecordPart2 ip98152RecordPart2 = new Ip98152RecordPart2();
	
	/**
	* Constructor for Sys001TjfIp370Rec
	**/
    public Sys001TjfIp370Rec() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getIp98151RecordPart1().setParent(this,getStartOffset() + 0);
					getIp98152RecordPart2().setParent(this,getStartOffset() + 255);
	   	/*  end of offset */
    }





}
  
