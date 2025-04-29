package com.cloudframe.app.d5427dt1.dto;

/**
*  The class ClaimKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class ClaimKey extends ClaimKeySerialized {
   

						@Getter @Setter private char[] claimKeyFln = Field.fillLowValue(10);

						@Getter @Setter private char[] claimKeyIcn = Field.fillLowValue(10);

						@Getter @Setter private char[] claimKeySuffixCd = Field.fillLowValue(2);

						@Getter @Setter private char[] claimKeyProviderNo = Field.fillLowValue(15);

						@Getter @Setter private char[] claimKeyDraftNo = Field.fillLowValue(10);

						@Getter @Setter private char[] claimKeyHeaderCt = Field.fillLowValue(4);
	
	/**
	* Constructor for ClaimKey
	**/
    public ClaimKey() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
