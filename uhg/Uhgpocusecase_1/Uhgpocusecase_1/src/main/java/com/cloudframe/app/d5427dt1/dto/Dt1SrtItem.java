package com.cloudframe.app.d5427dt1.dto;

/**
*  The class Dt1SrtItem is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Dt1SrtItem extends Dt1SrtItemSerialized { 
   

								@Getter @Setter private int dt1SrtFlnCent;

								@Getter @Setter private long dt1SrtFln;

						@Getter @Setter private char[] dt1SrtIcn = Field.fillLowValue(10);

								@Getter @Setter private long dt1SrtDate;

								@Getter @Setter private long dt1SrtTime;

								@Getter @Setter private int dt1SrtBankCode;

								@Getter @Setter private long dt1SrtDraft;

						@Getter @Setter private char[] dt1SrtPayeeCode = Field.fillLowValue(1);

								@Getter @Setter private int dt1SrtLineSequence;

						@Getter @Setter private char[] dt1SrtTranCode = Field.fillLowValue(2);

								@Getter @Setter private long dt1SrtApproverAltId;

								@Getter @Setter private short dt1SrtClmItem;

								@Getter @Setter private int dt1SrtSuffixCd;

								@Getter @Setter private long dt1SrtProviderId;

								@Getter @Setter private int dt1SrtHeaderCt;

						@Getter @Setter private char[] dt1SrtDivNbr = Field.fillLowValue(4);

						@Getter @Setter private char[] dt1SrtClsNbr = Field.fillLowValue(4);
	
	/**
	* Constructor for Dt1SrtItem
	**/
    public Dt1SrtItem() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Dt1SrtItem. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Dt1SrtItem(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
