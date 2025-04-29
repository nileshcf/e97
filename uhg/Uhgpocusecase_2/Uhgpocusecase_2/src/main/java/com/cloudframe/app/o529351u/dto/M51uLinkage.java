package com.cloudframe.app.o529351u.dto;

/**
*  The class M51uLinkage is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import java.util.List;
import java.util.*;


@Data
public class M51uLinkage extends M51uLinkageSerialized { 
   

						@Getter @Setter private char[] uIcn51 = Field.fillLowValue(10);

						@Getter @Setter private char[] uIoRequest51 = Field.fillLowValue(1);

						@Getter @Setter private char[] uCauseCd51 = Field.fillLowValue(1);

						@Getter @Setter private char[] uProvType51 = Field.fillLowValue(2);

								@Getter @Setter private short uPlanVar51;

						@Getter @Setter private char[] uPolicyNo51 = Field.fillLowValue(6);
      private List<char[]> uDiagnosisCode51; 


						@Getter @Setter private char[] uIcdVerNbr51 = Field.fillLowValue(1);

						@Getter @Setter private char[] uMedicalClaim51 = Field.fillLowValue(1);

						@Getter @Setter private char[] uSourceInd51 = Field.fillLowValue(1);

								@Getter @Setter private long uEarliestDos51;

								@Getter @Setter private short uNbrOfLines51;
			@Getter @Setter private List<ULineData51> uLineData51 = new ArrayList<>();
    	

						@Getter @Setter private char[] uCpeDescCd51 = Field.fillLowValue(4);
			@Getter @Setter private List<UOutLineData51> uOutLineData51 = new ArrayList<>();
    	

						@Getter @Setter private char[] uStopAutoSw51 = Field.fillLowValue(1);

						@Getter @Setter private char[] uOutCauseCd51 = Field.fillLowValue(1);

								@Getter @Setter private short uSlotPlanVar51;

						@Getter @Setter private char[] uSlotPolicyNo51 = Field.fillLowValue(6);
	
	/**
	* Constructor for M51uLinkage
	**/
    public M51uLinkage() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for M51uLinkage. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public M51uLinkage(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
