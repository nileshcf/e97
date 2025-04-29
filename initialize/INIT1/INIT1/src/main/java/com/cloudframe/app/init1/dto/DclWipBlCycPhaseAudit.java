package com.cloudframe.app.init1.dto;

/**
*  The class DclWipBlCycPhaseAudit is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class DclWipBlCycPhaseAudit extends DclWipBlCycPhaseAuditSerialized {
   

								@Getter @Setter private short tb33006BlSegregateNo;

						@Getter @Setter private char[] tb33006BlCycNo = Field.fillLowValue(2);

						@Getter @Setter private char[] tb33006BlStreamCd = Field.fillLowValue(1);

								@Getter @Setter private short tb33006JobIterationNo;

						@Getter @Setter private char[] tb33006PhaseTyp = Field.fillLowValue(2);

						@Getter @Setter private char[] tb33006CycMthYr = Field.fillLowValue(6);

						@Getter @Setter private char[] tb33006RptTypCd = Field.fillLowValue(5);

						@Getter @Setter private char[] tb33006RptAttrCd = Field.fillLowValue(3);

								@Getter @Setter private int tb33006RptAttrIdNo;

						@Getter @Setter private char[] tb33006RptColNameCd = Field.fillLowValue(3);

						@Getter @Setter private char[] tb33006RptColTypCd = Field.fillLowValue(1);

								@Getter @Setter private BigDecimal tb33006RptColValue = BigDecimal.ZERO;

						@Getter @Setter private char[] tb33006DbUserid = Field.fillLowValue(8);

						@Getter @Setter private char[] tb33006DbTmstamp = Field.fillLowValue(26);
	
	/**
	* Constructor for DclWipBlCycPhaseAudit
	**/
    public DclWipBlCycPhaseAudit() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }



	/**
	 * 	initializes DclWipBlCycPhaseAudit
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setTb33006BlSegregateNo((short)0);
         setTb33006BlCycNo(CONSTANTS.SPACE_2);
         setTb33006BlStreamCd(CONSTANTS.SPACE);
         	setTb33006JobIterationNo((short)0);
         setTb33006PhaseTyp(CONSTANTS.SPACE_2);
         setTb33006CycMthYr(CONSTANTS.SPACE_6);
         setTb33006RptTypCd(CONSTANTS.SPACE_5);
         setTb33006RptAttrCd(CONSTANTS.SPACE_3);
                     setTb33006RptAttrIdNo(0);
         setTb33006RptColNameCd(CONSTANTS.SPACE_3);
         setTb33006RptColTypCd(CONSTANTS.SPACE);
			setTb33006RptColValue(BigDecimal.ZERO);
         setTb33006DbUserid(CONSTANTS.SPACE_8);
         setTb33006DbTmstamp(CONSTANTS.SPACE_26);
   }


}
  
