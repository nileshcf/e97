package com.cloudframe.app.d5427dt1.dto;

/**
*  The class Dt1RequestArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import java.util.List;


@Data
public class Dt1RequestArea extends Dt1RequestAreaSerialized { 
   

						@Getter @Setter private char[] dt1ReqViewName = Field.fillLowValue(8);

						@Getter @Setter private char[] dt1ReqViewVersionNbr = Field.fillLowValue(2);

						@Getter @Setter private char[] dt1ReqSearchType = Field.fillLowValue(1);

						@Getter @Setter private char[] dt1ReqEmpid = Field.fillLowValue(10);

						@Getter @Setter private char[] dt1ReqPolicy = Field.fillLowValue(6);

								@Getter @Setter private int dt1ReqDepNbr;

						@Getter @Setter private char[] dt1ReqFirstName = Field.fillLowValue(16);

						@Getter @Setter private char[] dt1ReqRel = Field.fillLowValue(2);

						@Getter @Setter private char[] dt1ReqSystem = Field.fillLowValue(1);

								@Getter @Setter private int dt1ReqFilmOffice;

								@Getter @Setter private long dt1ReqFln;

						@Getter @Setter private char[] dt1ReqIcn = Field.fillLowValue(10);

								@Getter @Setter private long dt1ReqFirstServiceDate;

								@Getter @Setter private long dt1ReqLastServiceDate;

								@Getter @Setter private long dt1ReqProviderTin;

						@Getter @Setter private char[] dt1ReqFundingResp = Field.fillLowValue(1);

						@Getter @Setter private char[] dt1ReqAuthNbr = Field.fillLowValue(50);

						@Getter @Setter private char[] dt1ReqServiceCategory = Field.fillLowValue(2);
      private List<char[]> dt1ReqSpiCategoryCd; 


						@Getter @Setter private char[] dt1ReqNextKey = Field.fillLowValue(80);

						@Getter @Setter private char[] dt1ReqClmItemsRequested = Field.fillLowValue(5);

						@Getter @Setter private char[] dt1ReqCptFrom = Field.fillLowValue(7);

						@Getter @Setter private char[] dt1ReqCptThru = Field.fillLowValue(7);

						@Getter @Setter private char[] dt1ReqRevFrom = Field.fillLowValue(5);

						@Getter @Setter private char[] dt1ReqRevThru = Field.fillLowValue(5);

						@Getter @Setter private char[] dt1ReqRemarkCd = Field.fillLowValue(2);

						@Getter @Setter private char[] dt1ReqProvSpclCd = Field.fillLowValue(3);

						@Getter @Setter private char[] dt1ReqCauseCd = Field.fillLowValue(1);

						@Getter @Setter private char[] dt1ReqAppliedToOopInd = Field.fillLowValue(1);

						@Getter @Setter private char[] dt1ReqFillerArea = Field.fillLowValue(124);
	
	/**
	* Constructor for Dt1RequestArea
	**/
    public Dt1RequestArea() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Dt1RequestArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Dt1RequestArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
