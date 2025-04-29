package com.cloudframe.app.init1.dto;

/**
*  The class RlcbmBillMsgDtlGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class RlcbmBillMsgDtlGroup extends RlcbmBillMsgDtlGroupSerialized {
   
					@Getter @Setter private RlcbmBillMsgDtl rlcbmBillMsgDtl = new RlcbmBillMsgDtl();

						@Getter @Setter private char[] rlcbmBillMsgHdr = Field.fillLowValue(162);
					@Getter @Setter private RlcbmBillMsgTlr rlcbmBillMsgTlr = new RlcbmBillMsgTlr();
	
	/**
	* Constructor for RlcbmBillMsgDtlGroup
	**/
    public RlcbmBillMsgDtlGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getRlcbmBillMsgDtl().setParent(this,getStartOffset() + 0);
					getRlcbmBillMsgTlr().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
