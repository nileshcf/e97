package com.cloudframe.app.o529351u.dto;

/**
*  The class LsSaveRec1Clminf is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;
import com.cloudframe.app.data.Field;


@Data
public class LsSaveRec1Clminf extends LsSaveRec1ClminfSerialized {
   
			@Getter @Setter private List<SavProviderArea> savProviderArea = new ArrayList<>();
    	
				@Getter @Setter private SavDiagnosisCodePoa savDiagnosisCodePoa = new SavDiagnosisCodePoa();

						@Getter @Setter private char[] savDiagCodePoa = Field.fillLowValue(54);
				@Getter @Setter private SavInputProcId savInputProcId = new SavInputProcId();

								@Getter @Setter private long savInputProcIdNum;

						@Getter @Setter private char[] savOncologyInd = new char[1];

						@Getter @Setter private char[] savReferingNpi = Field.fillLowValue(10);

						@Getter @Setter private char[] savAttendingNpi = Field.fillLowValue(10);
	
	/**
	* Constructor for LsSaveRec1Clminf
	**/
    public LsSaveRec1Clminf() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < SAV_PROVIDER_AREA_SIZE;arrayIndex++) {
						getSavProviderArea().add(new SavProviderArea(this, beginSavProviderArea + 
						arrayIndex * SavProviderArea.getSavProviderAreaFieldLength()));
				}
					getSavDiagnosisCodePoa().setParent(this,getStartOffset() + 121);
					getSavInputProcId().setParent(this,getStartOffset() + 237);
	   	/*  end of offset */
								setSavOncologyInd(fillSpace(1));
    }





}
  
