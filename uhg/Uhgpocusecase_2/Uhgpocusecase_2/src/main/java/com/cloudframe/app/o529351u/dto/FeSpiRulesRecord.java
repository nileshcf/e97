package com.cloudframe.app.o529351u.dto;

/**
*  The class FeSpiRulesRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;


@Data
public class FeSpiRulesRecord extends FeSpiRulesRecordSerialized {
   
				@Getter @Setter private FesrKey01 fesrKey01 = new FesrKey01();
				@Getter @Setter private FesrDateTimestamp fesrDateTimestamp = new FesrDateTimestamp();

								@Getter @Setter private int fesrUpdateId;
			@Getter @Setter private List<FesrFromCondPs> fesrFromCondPs = new ArrayList<>();
    	
			@Getter @Setter private List<FesrFromCondFrToSvc> fesrFromCondFrToSvc = new ArrayList<>();
    	
			@Getter @Setter private List<FesrFromCondPrvTyp> fesrFromCondPrvTyp = new ArrayList<>();
    	
			@Getter @Setter private List<FesrFromCondFrToIcd9> fesrFromCondFrToIcd9 = new ArrayList<>();
    	
			@Getter @Setter private List<FesrFromCondCause> fesrFromCondCause = new ArrayList<>();
    	
			@Getter @Setter private List<FesrIpaCode> fesrIpaCode = new ArrayList<>();
    	
	
	/**
	* Constructor for FeSpiRulesRecord
	**/
    public FeSpiRulesRecord() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getFesrKey01().setParent(this,getStartOffset() + 0);
					getFesrDateTimestamp().setParent(this,getStartOffset() + 13);
				for (int arrayIndex = 0; arrayIndex < FESR_FROM_COND_PS_SIZE;arrayIndex++) {
						getFesrFromCondPs().add(new FesrFromCondPs(this, beginFesrFromCondPs + 
						arrayIndex * FesrFromCondPs.getFesrFromCondPsFieldLength()));
				}
				for (int arrayIndex = 0; arrayIndex < FESR_FROM_COND_FR_TO_SVC_SIZE;arrayIndex++) {
						getFesrFromCondFrToSvc().add(new FesrFromCondFrToSvc(this, beginFesrFromCondFrToSvc + 
						arrayIndex * FesrFromCondFrToSvc.getFesrFromCondFrToSvcFieldLength()));
				}
				for (int arrayIndex = 0; arrayIndex < FESR_FROM_COND_PRV_TYP_SIZE;arrayIndex++) {
						getFesrFromCondPrvTyp().add(new FesrFromCondPrvTyp(this, beginFesrFromCondPrvTyp + 
						arrayIndex * FesrFromCondPrvTyp.getFesrFromCondPrvTypFieldLength()));
				}
				for (int arrayIndex = 0; arrayIndex < FESR_FROM_COND_FR_TO_ICD_9_SIZE;arrayIndex++) {
						getFesrFromCondFrToIcd9().add(new FesrFromCondFrToIcd9(this, beginFesrFromCondFrToIcd9 + 
						arrayIndex * FesrFromCondFrToIcd9.getFesrFromCondFrToIcd9FieldLength()));
				}
				for (int arrayIndex = 0; arrayIndex < FESR_FROM_COND_CAUSE_SIZE;arrayIndex++) {
						getFesrFromCondCause().add(new FesrFromCondCause(this, beginFesrFromCondCause + 
						arrayIndex * FesrFromCondCause.getFesrFromCondCauseFieldLength()));
				}
				for (int arrayIndex = 0; arrayIndex < FESR_IPA_CODE_SIZE;arrayIndex++) {
						getFesrIpaCode().add(new FesrIpaCode(this, beginFesrIpaCode + 
						arrayIndex * FesrIpaCode.getFesrIpaCodeFieldLength()));
				}
	   	/*  end of offset */
    }





}
  
