package com.cloudframe.app.ms00d363.dto;

/**
*  The class TransTable1 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;


@Data
public class TransTable1 extends TransTable1Serialized { 
   

								@Getter @Setter private int tb1TrnId;

						@Getter @Setter private char[] tb1TrnDesc = Field.fillLowValue(18);

								@Getter @Setter private int tb1ImpDec;

								@Getter @Setter private int tb1ImpDecEp;

								@Getter @Setter private int tb1TrnSurchgFreeCntIss;

								@Getter @Setter private int tb1TrnSurchgFreeCntAcq;

								@Getter @Setter private int tb1TrnAtmAcchrgCntICr;

								@Getter @Setter private int tb1TrnAtmAcchrgCntIDb;

								@Getter @Setter private BigDecimal tb1TrnAtmAcchrgAmtICr = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal tb1TrnAtmAcchrgAmtIDb = BigDecimal.ZERO;

								@Getter @Setter private int tb1TrnPosAcchrgACntICr;

								@Getter @Setter private int tb1TrnPosAcchrgACntIDb;

								@Getter @Setter private BigDecimal tb1TrnPosAcchrgAmtICr = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal tb1TrnPosAcchrgAmtIDb = BigDecimal.ZERO;

								@Getter @Setter private int tb1TrnAtmAcchrgRCntICr;

								@Getter @Setter private int tb1TrnAtmAcchrgRCntIDb;

								@Getter @Setter private BigDecimal tb1TrnAtmAcchrgRAmtICr = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal tb1TrnAtmAcchrgRAmtIDb = BigDecimal.ZERO;

								@Getter @Setter private int tb1TrnPosAcchrgRCntICr;

								@Getter @Setter private int tb1TrnPosAcchrgRCntIDb;

								@Getter @Setter private BigDecimal tb1TrnPosAcchrgRAmtICr = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal tb1TrnPosAcchrgRAmtIDb = BigDecimal.ZERO;

								@Getter @Setter private int tb1TrnFFinAppCntICr;

								@Getter @Setter private int tb1TrnFFinAppCntIDb;

								@Getter @Setter private int tb1TrnFFinDenCntICr;

								@Getter @Setter private int tb1TrnFFinDenCntIDb;

								@Getter @Setter private long tb1TrnFFinAmtICr;

								@Getter @Setter private long tb1TrnFFinAmtIDb;

								@Getter @Setter private int tb1TrnFFinFeeCntI;

								@Getter @Setter private int tb1TrnFPctFeeCntI;

								@Getter @Setter private int tb1TrnFNfinFeeCntI;

								@Getter @Setter private int tb1TrnFNbilFeeCntI;

								@Getter @Setter private long tb1TrnFFeeAmtICr;

								@Getter @Setter private long tb1TrnFFeeAmtIDb;

								@Getter @Setter private long tb1TrnFMcrAmtICr;

								@Getter @Setter private long tb1TrnFMcrAmtIDb;

								@Getter @Setter private long tb1TrnFIcrAmtICr;

								@Getter @Setter private long tb1TrnFIcrAmtIDb;

								@Getter @Setter private int tb1TrnEFinAppCntICr;

								@Getter @Setter private int tb1TrnEFinAppCntIDb;

								@Getter @Setter private int tb1TrnENsdA15CntICr;

								@Getter @Setter private int tb1TrnENsdA15CntIDb;

								@Getter @Setter private int tb1TrnEFinA09CntICr;

								@Getter @Setter private int tb1TrnEFinA09CntIDb;

								@Getter @Setter private int tb1TrnEFinDenCntICr;

								@Getter @Setter private int tb1TrnEFinDenCntIDb;

								@Getter @Setter private long tb1TrnEFinAmtICr;

								@Getter @Setter private long tb1TrnEFinAmtIDb;

								@Getter @Setter private long tb1TrnEFinA09AmtICr;

								@Getter @Setter private long tb1TrnEFinA09AmtIDb;

								@Getter @Setter private int tb1TrnEFinFeeCntI;

								@Getter @Setter private int tb1TrnEPctFeeCntI;

								@Getter @Setter private int tb1TrnENfinFeeCntI;

								@Getter @Setter private int tb1TrnENbilFeeCntI;

								@Getter @Setter private long tb1TrnEFeeAmtICr;

								@Getter @Setter private long tb1TrnEFeeAmtIDb;

								@Getter @Setter private long tb1TrnEMcrAmtICr;

								@Getter @Setter private long tb1TrnEMcrAmtIDb;

								@Getter @Setter private long tb1TrnEIcrAmtICr;

								@Getter @Setter private long tb1TrnEIcrAmtIDb;

								@Getter @Setter private int tb1TrnAtmAcchrgCntACr;

								@Getter @Setter private int tb1TrnAtmAcchrgCntADb;

								@Getter @Setter private BigDecimal tb1TrnAtmAcchrgAmtACr = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal tb1TrnAtmAcchrgAmtADb = BigDecimal.ZERO;

								@Getter @Setter private int tb1TrnPosAcchrgCntACr;

								@Getter @Setter private int tb1TrnPosAcchrgCntADb;

								@Getter @Setter private BigDecimal tb1TrnPosAcchrgAmtACr = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal tb1TrnPosAcchrgAmtADb = BigDecimal.ZERO;

								@Getter @Setter private int tb1TrnAtmAcchrgRCntACr;

								@Getter @Setter private int tb1TrnAtmAcchrgRCntADb;

								@Getter @Setter private BigDecimal tb1TrnAtmAcchrgRAmtACr = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal tb1TrnAtmAcchrgRAmtADb = BigDecimal.ZERO;

								@Getter @Setter private int tb1TrnPosAcchrgRCntACr;

								@Getter @Setter private int tb1TrnPosAcchrgRCntADb;

								@Getter @Setter private BigDecimal tb1TrnPosAcchrgRAmtACr = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal tb1TrnPosAcchrgRAmtADb = BigDecimal.ZERO;

								@Getter @Setter private int tb1TrnFFinAppCntACr;

								@Getter @Setter private int tb1TrnFFinAppCntADb;

								@Getter @Setter private int tb1TrnFFinDenCntACr;

								@Getter @Setter private int tb1TrnFFinDenCntADb;

								@Getter @Setter private long tb1TrnFFinAmtACr;

								@Getter @Setter private long tb1TrnFFinAmtADb;

								@Getter @Setter private int tb1TrnFFinFeeCntA;

								@Getter @Setter private int tb1TrnFPctFeeCntA;

								@Getter @Setter private int tb1TrnFNfinFeeCntA;

								@Getter @Setter private int tb1TrnFNbilFeeCntA;

								@Getter @Setter private long tb1TrnFFeeAmtACr;

								@Getter @Setter private long tb1TrnFFeeAmtADb;

								@Getter @Setter private int tb1TrnEFinAppCntACr;

								@Getter @Setter private int tb1TrnEFinAppCntADb;

								@Getter @Setter private int tb1TrnEFinA09CntACr;

								@Getter @Setter private int tb1TrnEFinA09CntADb;

								@Getter @Setter private int tb1TrnENsdA15CntACr;

								@Getter @Setter private int tb1TrnENsdA15CntADb;

								@Getter @Setter private int tb1TrnEFinDenCntACr;

								@Getter @Setter private int tb1TrnEFinDenCntADb;

								@Getter @Setter private long tb1TrnEFinAmtACr;

								@Getter @Setter private long tb1TrnEFinAmtADb;

								@Getter @Setter private long tb1TrnEFinA09AmtACr;

								@Getter @Setter private long tb1TrnEFinA09AmtADb;

								@Getter @Setter private int tb1TrnEFinFeeCntA;

								@Getter @Setter private int tb1TrnEPctFeeCntA;

								@Getter @Setter private int tb1TrnENfinFeeCntA;

								@Getter @Setter private int tb1TrnENbilFeeCntA;

								@Getter @Setter private long tb1TrnEFeeAmtACr;

								@Getter @Setter private long tb1TrnEFeeAmtADb;
	
	/**
	* Constructor for TransTable1
	**/
    public TransTable1() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for TransTable1. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TransTable1(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
