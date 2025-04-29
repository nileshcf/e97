package com.cloudframe.app.cfcard.file.records;

/**
*  The class WfOutput is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:44. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;


@Data
public class WfOutput extends WfOutputSerialized {
   

						@Getter @Setter private char[] wfOutCardNumber = Field.fillLowValue(16);

								@Getter @Setter private int wfOutServiceMm;

								@Getter @Setter private BigDecimal wfOutTotal = BigDecimal.ZERO;
	
	/**
	* Constructor for WfOutput
	**/
    public WfOutput() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
