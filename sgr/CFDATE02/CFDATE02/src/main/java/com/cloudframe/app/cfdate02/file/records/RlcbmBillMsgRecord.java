package com.cloudframe.app.cfdate02.file.records;

/**
*  The class RlcbmBillMsgRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:41. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class RlcbmBillMsgRecord extends RlcbmBillMsgRecordSerialized {
   
				@Getter @Setter private RlcbmBillMsgDtl rlcbmBillMsgDtl = new RlcbmBillMsgDtl();
				@Getter @Setter private RlcbmBillMsgHdr rlcbmBillMsgHdr = new RlcbmBillMsgHdr();
				@Getter @Setter private RlcbmBillMsgTlr rlcbmBillMsgTlr = new RlcbmBillMsgTlr();
	
	/**
	* Constructor for RlcbmBillMsgRecord
	**/
    public RlcbmBillMsgRecord() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getRlcbmBillMsgDtl().setParent(this,getStartOffset() + 0);
					getRlcbmBillMsgHdr().setParent(this,getStartOffset() + 0);
					getRlcbmBillMsgTlr().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
