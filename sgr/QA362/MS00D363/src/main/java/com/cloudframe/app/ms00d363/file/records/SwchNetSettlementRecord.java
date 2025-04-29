package com.cloudframe.app.ms00d363.file.records;

/**
*  The class SwchNetSettlementRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class SwchNetSettlementRecord extends SwchNetSettlementRecordSerialized {
   
				@Getter @Setter private SwchSortField300010 swchSortField300010 = new SwchSortField300010();
				@Getter @Setter private SwchAccumFields300010 swchAccumFields300010 = new SwchAccumFields300010();
	
	/**
	* Constructor for SwchNetSettlementRecord
	**/
    public SwchNetSettlementRecord() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getSwchSortField300010().setParent(this,getStartOffset() + 0);
					getSwchAccumFields300010().setParent(this,getStartOffset() + 107);
	   	/*  end of offset */
    }





}
  
