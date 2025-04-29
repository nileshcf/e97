package com.cloudframe.app.ip989010.dto;

/**
*  The class Ip16911RewardFileIdRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ip16911RewardFileIdRecord extends Ip16911RewardFileIdRecordSerialized {
   

						@Getter @Setter private char[] ip16911FileCreateDate = Field.fillLowValue(8);

						@Getter @Setter private char[] ip16911RewardFileId = Field.fillLowValue(25);

						@Getter @Setter private char[] ip16911FileMsgCnt = Field.fillLowValue(8);
	
	/**
	* Constructor for Ip16911RewardFileIdRecord
	**/
    public Ip16911RewardFileIdRecord() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
