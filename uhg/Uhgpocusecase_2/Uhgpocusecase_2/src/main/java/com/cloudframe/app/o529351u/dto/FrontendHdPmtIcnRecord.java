package com.cloudframe.app.o529351u.dto;

/**
*  The class FrontendHdPmtIcnRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class FrontendHdPmtIcnRecord extends FrontendHdPmtIcnRecordSerialized {
   
				@Getter @Setter private HdVariableDetailData hdVariableDetailData = new HdVariableDetailData();
	
	/**
	* Constructor for FrontendHdPmtIcnRecord
	**/
    public FrontendHdPmtIcnRecord() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getHdVariableDetailData().setParent(this,getStartOffset() + 31);
	   	/*  end of offset */
    }





}
  
