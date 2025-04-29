package com.cloudframe.app.init1.dto;

/**
*  The class CycleInfo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class CycleInfo extends CycleInfoSerialized {
   

								@Getter @Setter private int jobIterNo;

						@Getter @Setter private char[] blTypCd = Field.fillLowValue(2);

								@Getter @Setter private int cycNo;

						@Getter @Setter private char[] cycAsofDt = Field.fillLowValue(10);

						@Getter @Setter private char[] cycStartDt = Field.fillLowValue(10);

						@Getter @Setter private char[] cycEndDt = Field.fillLowValue(10);

								@Getter @Setter private long cycStartDtIso;

								@Getter @Setter private long cycEndDtIso;

						@Getter @Setter private char[] cycMthYr = Field.fillLowValue(6);

						@Getter @Setter private char[] blStreamCd = Field.fillLowValue(1);

						@Getter @Setter private char[] visionInstanceCd = Field.fillLowValue(1);

								@Getter @Setter private long chgBlEndIso;
				@Getter @Setter private ChgBlEndIsoRedefined chgBlEndIsoRedefined = new ChgBlEndIsoRedefined();

								@Getter @Setter private long chgDtIso;
				@Getter @Setter private ChgDtIsoRedefined chgDtIsoRedefined = new ChgDtIsoRedefined();

								@Getter @Setter private long chgStartDtIso;
				@Getter @Setter private ChgStartDtIsoRedefined chgStartDtIsoRedefined = new ChgStartDtIsoRedefined();

								@Getter @Setter private long chgStartDtIso2;
				@Getter @Setter private ChgStartDtIso2Redefined chgStartDtIso2Redefined = new ChgStartDtIso2Redefined();

								@Getter @Setter private long chgStartDtIso3;
				@Getter @Setter private ChgStartDtIso3Redefined chgStartDtIso3Redefined = new ChgStartDtIso3Redefined();

								@Getter @Setter private long chgEndDtIso;
				@Getter @Setter private ChgEndDtIsoRedefined chgEndDtIsoRedefined = new ChgEndDtIsoRedefined();

								@Getter @Setter private long chgEndDtIso2;
				@Getter @Setter private ChgEndDtIso2Redefined chgEndDtIso2Redefined = new ChgEndDtIso2Redefined();

								@Getter @Setter private long chgEndDtIso3;
				@Getter @Setter private ChgEndDtIso3Redefined chgEndDtIso3Redefined = new ChgEndDtIso3Redefined();

						@Getter @Setter private char[] cycChangeNo = Field.fillLowValue(2);

								@Getter @Setter private int cycChangeBp;

								@Getter @Setter private int leapYear;

								@Getter @Setter private int leapYearRemainder;
	
	/**
	* Constructor for CycleInfo
	**/
    public CycleInfo() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getChgBlEndIsoRedefined().setParent(this,getStartOffset() + 60);
					getChgDtIsoRedefined().setParent(this,getStartOffset() + 68);
					getChgStartDtIsoRedefined().setParent(this,getStartOffset() + 76);
					getChgStartDtIso2Redefined().setParent(this,getStartOffset() + 84);
					getChgStartDtIso3Redefined().setParent(this,getStartOffset() + 92);
					getChgEndDtIsoRedefined().setParent(this,getStartOffset() + 100);
					getChgEndDtIso2Redefined().setParent(this,getStartOffset() + 108);
					getChgEndDtIso3Redefined().setParent(this,getStartOffset() + 116);
	   	/*  end of offset */
    }



	/**
	 * 	initializes CycleInfo
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setJobIterNo(0);
         setBlTypCd(CONSTANTS.SPACE_2);
                     setCycNo(0);
         setCycAsofDt(CONSTANTS.SPACE_10);
         setCycStartDt(CONSTANTS.SPACE_10);
         setCycEndDt(CONSTANTS.SPACE_10);
                     setCycStartDtIso(0);
                     setCycEndDtIso(0);
         setCycMthYr(CONSTANTS.SPACE_6);
         setBlStreamCd(CONSTANTS.SPACE);
         setVisionInstanceCd(CONSTANTS.SPACE);
                     setChgBlEndIso(0);
                     setChgDtIso(0);
                     setChgStartDtIso(0);
                     setChgStartDtIso2(0);
                     setChgStartDtIso3(0);
                     setChgEndDtIso(0);
                     setChgEndDtIso2(0);
                     setChgEndDtIso3(0);
         setCycChangeNo(CONSTANTS.SPACE_2);
                     setCycChangeBp(0);
                     setLeapYear(0);
                     setLeapYearRemainder(0);
   }


}
  
