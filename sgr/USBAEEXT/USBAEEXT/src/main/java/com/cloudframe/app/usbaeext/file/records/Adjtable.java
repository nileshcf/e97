package com.cloudframe.app.usbaeext.file.records;

/**
*  The class Adjtable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Adjtable extends AdjtableSerialized {
   

						@Getter @Setter private char[] adjtblColumn1 = Field.fillLowValue(1);

						@Getter @Setter private char[] adjtblCpcsSite = Field.fillLowValue(3);

						@Getter @Setter private char[] adjtblAdjustmentCode = Field.fillLowValue(3);

						@Getter @Setter private char[] adjtblSortType = Field.fillLowValue(3);

						@Getter @Setter private char[] adjtblBankNumber = Field.fillLowValue(3);

						@Getter @Setter private char[] adjtblDeptNumber = Field.fillLowValue(2);

						@Getter @Setter private char[] adjtblAccountCode = Field.fillLowValue(2);

						@Getter @Setter private char[] adjtblTypeCode = Field.fillLowValue(2);

						@Getter @Setter private char[] adjtblClerkId = Field.fillLowValue(8);

						@Getter @Setter private char[] adjtblSrcReceiptCd = Field.fillLowValue(6);

						@Getter @Setter private char[] adjtblSrcErrorCd = Field.fillLowValue(6);
	
	/**
	* Constructor for Adjtable
	**/
    public Adjtable() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
