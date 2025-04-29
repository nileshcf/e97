package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip00724TableEntry is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_ip00724TableEntry")

@Data
public class Ip00724TableEntry extends Ip00724TableEntrySerialized  implements InitializingBean {
   
				@Getter @Setter private Ip00724Key ip00724Key = new Ip00724Key();

						@Getter @Setter private char[] ip00724Filler3 = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00724Filler4 = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00724IchgReg = Field.fillLowValue(1);
				@Getter @Setter private Ip00724Ichg ip00724Ichg = new Ip00724Ichg();

						@Getter @Setter private char[] ip00724ElectronicQualifier = Field.fillLowValue(2);

						@Getter @Setter private char[] ip00724IntUseIca = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00724AcqSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00724AtmInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00724RclRegion = Field.fillLowValue(1);

								@Getter @Setter private long ip00724Endpoint;

						@Getter @Setter private char[] ip00724WorldIcaChbSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00724WorldGrpChbSw1 = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00724WorldGrpChbSw2 = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00724WorldGrpChbSw3 = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00724WorldGrpChbSw4 = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00724WorldGrpChbSw5 = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00724Filler5 = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00724MemberName = Field.fillLowValue(30);

						@Getter @Setter private char[] ip00724CountryCode = Field.fillLowValue(3);

								@Getter @Setter private int ip00724CountryIso;

						@Getter @Setter private char[] ip00724ChbConvExclId = Field.fillLowValue(1);

								@Getter @Setter private long ip00724ChbConvExprDt;

						@Getter @Setter private char[] ip00724ChbEditExcl = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00724HardshipEffectInd = Field.fillLowValue(1);

								@Getter @Setter private long ip00724HardshipEffectDate;

								@Getter @Setter private long ip00724HardshipExpireDate;

						@Getter @Setter private char[] ip00724FormatIndicator = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00724McePartcptnCd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00724EeaAcqCtrySrvIca = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00724IrdDeterminePart = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00724NpgAcqProcInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00724PtaParticipantInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00724MemberFiller = Field.fillLowValue(8);
				@Getter @Setter private Ip00724CentralSiteFields ip00724CentralSiteFields = new Ip00724CentralSiteFields();
	
	/**
	* Constructor for Ip00724TableEntry
	**/
    public Ip00724TableEntry() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
					getIp00724Key().setParent(this,getStartOffset() + 0);
					getIp00724Ichg().setParent(this,getStartOffset() + 13);
					getIp00724CentralSiteFields().setParent(this,getStartOffset() + 105);
	   	/*  end of offset */
    }


	/**
	 * 	initializes Ip00724TableEntry
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getIp00724Key().initialize();
     
         setIp00724Filler3(CONSTANTS.SPACE);
         setIp00724Filler4(CONSTANTS.SPACE);
         setIp00724IchgReg(CONSTANTS.SPACE);
         setIp00724ElectronicQualifier(CONSTANTS.SPACE_2);
         setIp00724IntUseIca(CONSTANTS.SPACE);
         setIp00724AcqSw(CONSTANTS.SPACE);
         setIp00724AtmInd(CONSTANTS.SPACE);
         setIp00724RclRegion(CONSTANTS.SPACE);
                     setIp00724Endpoint(0);
         setIp00724WorldIcaChbSw(CONSTANTS.SPACE);
         setIp00724WorldGrpChbSw1(CONSTANTS.SPACE);
         setIp00724WorldGrpChbSw2(CONSTANTS.SPACE);
         setIp00724WorldGrpChbSw3(CONSTANTS.SPACE);
         setIp00724WorldGrpChbSw4(CONSTANTS.SPACE);
         setIp00724WorldGrpChbSw5(CONSTANTS.SPACE);
         setIp00724Filler5(CONSTANTS.SPACE);
         setIp00724MemberName(CONSTANTS.SPACE_30);
         setIp00724CountryCode(CONSTANTS.SPACE_3);
                     setIp00724CountryIso(0);
         setIp00724ChbConvExclId(CONSTANTS.SPACE);
                     setIp00724ChbConvExprDt(0);
         setIp00724ChbEditExcl(CONSTANTS.SPACE);
         setIp00724HardshipEffectInd(CONSTANTS.SPACE);
                     setIp00724HardshipEffectDate(0);
                     setIp00724HardshipExpireDate(0);
         setIp00724FormatIndicator(CONSTANTS.SPACE);
         setIp00724McePartcptnCd(CONSTANTS.SPACE);
         setIp00724EeaAcqCtrySrvIca(CONSTANTS.SPACE);
         setIp00724IrdDeterminePart(CONSTANTS.SPACE);
         setIp00724NpgAcqProcInd(CONSTANTS.SPACE);
         setIp00724PtaParticipantInd(CONSTANTS.SPACE);
         setIp00724MemberFiller(CONSTANTS.SPACE_8);
          getIp00724CentralSiteFields().initialize();
     
   }


}
  
