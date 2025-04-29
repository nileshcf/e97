package com.cloudframe.app.cfcard.file.records;

/**
*  The class WfRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:44. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;


@Data
public class WfRecord extends WfRecordSerialized {
   

						@Getter @Setter private char[] wfInCardNumber = Field.fillLowValue(16);
				@Getter @Setter private WfInServiceDate wfInServiceDate = new WfInServiceDate();

								@Getter @Setter private BigDecimal wfInBalance = BigDecimal.ZERO;
	
	/**
	* Constructor for WfRecord
	**/
    public WfRecord() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getWfInServiceDate().setParent(this,getStartOffset() + 16);
	   	/*  end of offset */
    }





}
  
