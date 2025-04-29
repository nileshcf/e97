package com.cloudframe.app.init1.dto;

/**
*  The class KeyCpduPrev is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class KeyCpduPrev extends KeyCpduPrevSerialized { 
   

						@Getter @Setter private char[] cpduPrvRefRecType = new char[1];
				@Getter @Setter private CpduPrvCustAcct cpduPrvCustAcct = new CpduPrvCustAcct();
				@Getter @Setter private CpduPrvMtn cpduPrvMtn = new CpduPrvMtn();

						@Getter @Setter private char[] cpduPrvOffrTypeCd = new char[2];

								@Getter @Setter private int cpduPrvOffrTypeId;

						@Getter @Setter private char[] cpduPrvProdSeq = new char[9];

						@Getter @Setter private char[] cpduPrvEventDiscId = new char[9];

						@Getter @Setter private char[] cpduPrvPeriodNum = new char[9];

						@Getter @Setter private char[] cpduPrvEventDiscCd = new char[3];

						@Getter @Setter private char[] cpduPrvUbOrigInstance = new char[3];

						@Getter @Setter private char[] cpduPrvPlanStartDt = new char[10];

						@Getter @Setter private char[] cpduPrvPlanEndDt = new char[10];

								@Getter @Setter private long cpduPrvTotalDiscUsage;
	
	/**
	* Constructor for KeyCpduPrev
	**/
    public KeyCpduPrev() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for KeyCpduPrev. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public KeyCpduPrev(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getCpduPrvCustAcct().setParent(this,getStartOffset() + 1);
					getCpduPrvMtn().setParent(this,getStartOffset() + 9);
								setCpduPrvRefRecType(fillSpace(1));
								setCpduPrvOffrTypeCd(fillSpace(2));
								setCpduPrvOffrTypeId(0);
								setCpduPrvProdSeq(fillSpace(9));
								setCpduPrvEventDiscId(fillSpace(9));
								setCpduPrvPeriodNum(fillSpace(9));
								setCpduPrvEventDiscCd(fillSpace(3));
								setCpduPrvUbOrigInstance(fillSpace(3));
								setCpduPrvPlanStartDt(fillSpace(10));
								setCpduPrvPlanEndDt(fillSpace(10));
								setCpduPrvTotalDiscUsage(0L);
    } 

	/**
	 * 	initializes KeyCpduPrev
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setCpduPrvRefRecType(CONSTANTS.SPACE);
          getCpduPrvCustAcct().initialize();
     
          getCpduPrvMtn().initialize();
     
         setCpduPrvOffrTypeCd(CONSTANTS.SPACE_2);
                     setCpduPrvOffrTypeId(0);
         setCpduPrvProdSeq(CONSTANTS.SPACE_9);
         setCpduPrvEventDiscId(CONSTANTS.SPACE_9);
         setCpduPrvPeriodNum(CONSTANTS.SPACE_9);
         setCpduPrvEventDiscCd(CONSTANTS.SPACE_3);
         setCpduPrvUbOrigInstance(CONSTANTS.SPACE_3);
         setCpduPrvPlanStartDt(CONSTANTS.SPACE_10);
         setCpduPrvPlanEndDt(CONSTANTS.SPACE_10);
                     setCpduPrvTotalDiscUsage(0);
   }


}
  
