package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip16901RewardParms is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip16901RewardParms extends Ip16901RewardParmsSerialized { 
   

						@Getter @Setter private char[] ip16901ProgramId = Field.fillLowValue(11);

						@Getter @Setter private char[] ip16901ProgramEffDate = Field.fillLowValue(10);

						@Getter @Setter private char[] ip16901ProgramDesc = Field.fillLowValue(50);

						@Getter @Setter private char[] ip16901ProgramType = Field.fillLowValue(3);

						@Getter @Setter private char[] ip16901McMbrId = Field.fillLowValue(11);

								@Getter @Setter private int ip16901McPercent;

						@Getter @Setter private char[] ip16901AcqMbrId = Field.fillLowValue(11);

								@Getter @Setter private int ip16901AcqPercent;

						@Getter @Setter private char[] ip16901IssMbrId = Field.fillLowValue(11);

								@Getter @Setter private int ip16901IssPercent;

						@Getter @Setter private char[] ip16901CabCode = Field.fillLowValue(5);

								@Getter @Setter private int ip16901MrchntPaymtPct;

						@Getter @Setter private char[] ip16901ReconMthdCd = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip16901RewardParms
	**/
    public Ip16901RewardParms() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip16901RewardParms. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip16901RewardParms(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip16901RewardParms
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp16901ProgramId(CONSTANTS.SPACE_11);
         setIp16901ProgramEffDate(CONSTANTS.SPACE_10);
         setIp16901ProgramDesc(CONSTANTS.SPACE_50);
         setIp16901ProgramType(CONSTANTS.SPACE_3);
         setIp16901McMbrId(CONSTANTS.SPACE_11);
                     setIp16901McPercent(0);
         setIp16901AcqMbrId(CONSTANTS.SPACE_11);
                     setIp16901AcqPercent(0);
         setIp16901IssMbrId(CONSTANTS.SPACE_11);
                     setIp16901IssPercent(0);
         setIp16901CabCode(CONSTANTS.SPACE_5);
                     setIp16901MrchntPaymtPct(0);
         setIp16901ReconMthdCd(CONSTANTS.SPACE);
   }


}
  
