package com.cloudframe.app.init2.dto;

/**
*  The class L6560InputParmInfo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:27. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class L6560InputParmInfo extends L6560InputParmInfoSerialized { 
   

						@Getter @Setter private char[] l6560RqstCd = Field.fillLowValue(2);

						@Getter @Setter private char[] l6560EffDt = Field.fillLowValue(10);

								@Getter @Setter private short l6560Cvg;

								@Getter @Setter private BigDecimal l6560SurrAmt = BigDecimal.ZERO;

						@Getter @Setter private char[] l6560SurrChrgTypCd = Field.fillLowValue(1);

								@Getter @Setter private BigDecimal l6560PolAcumValuAmt = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal l6560CvgAcumValuAmt = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal l6560MthvAdjAmt = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal l6560MktvalAdjPct = BigDecimal.ZERO;

						@Getter @Setter private char[] l6560CalcIfTerminatedSw = Field.fillLowValue(1);

						@Getter @Setter private char[] l6560FreeWthAppliedInd = Field.fillLowValue(1);
				@Getter @Setter private L6560DbscInfo l6560DbscInfo = new L6560DbscInfo();

						@Getter @Setter private char[] l6560SurrChrgOvridInd = Field.fillLowValue(1);

	
	/**
	* Constructor for L6560InputParmInfo
	**/
    public L6560InputParmInfo() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for L6560InputParmInfo. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public L6560InputParmInfo(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getL6560DbscInfo().setParent(this,getStartOffset() + 56);
    } 

	/**
	 * 	initializes L6560InputParmInfo
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setL6560RqstCd(CONSTANTS.SPACE_2);
         setL6560EffDt(CONSTANTS.SPACE_10);
         	setL6560Cvg((short)0);
			setL6560SurrAmt(BigDecimal.ZERO);
         setL6560SurrChrgTypCd(CONSTANTS.SPACE);
			setL6560PolAcumValuAmt(BigDecimal.ZERO);
			setL6560CvgAcumValuAmt(BigDecimal.ZERO);
			setL6560MthvAdjAmt(BigDecimal.ZERO);
			setL6560MktvalAdjPct(BigDecimal.ZERO);
         setL6560CalcIfTerminatedSw(CONSTANTS.SPACE);
         setL6560FreeWthAppliedInd(CONSTANTS.SPACE);
          getL6560DbscInfo().initialize();
     
         setL6560SurrChrgOvridInd(CONSTANTS.SPACE);
   }


}
  
