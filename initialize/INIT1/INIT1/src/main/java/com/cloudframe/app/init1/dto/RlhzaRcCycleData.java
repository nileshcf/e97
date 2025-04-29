package com.cloudframe.app.init1.dto;

/**
*  The class RlhzaRcCycleData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class RlhzaRcCycleData extends RlhzaRcCycleDataSerialized {
   
				@Getter @Setter private RlhzaGenericRecord rlhzaGenericRecord = new RlhzaGenericRecord();
				@Getter @Setter private RlhzaDtlRecord rlhzaDtlRecord = new RlhzaDtlRecord();
				@Getter @Setter private RlhzaHdrRecord rlhzaHdrRecord = new RlhzaHdrRecord();
				@Getter @Setter private RlhzaTlrRecord rlhzaTlrRecord = new RlhzaTlrRecord();
	
	/**
	* Constructor for RlhzaRcCycleData
	**/
    public RlhzaRcCycleData() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getRlhzaGenericRecord().setParent(this,getStartOffset() + 0);
					getRlhzaDtlRecord().setParent(this,getStartOffset() + 0);
					getRlhzaHdrRecord().setParent(this,getStartOffset() + 0);
					getRlhzaTlrRecord().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
