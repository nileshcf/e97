package com.cloudframe.app.d5427dt1.dto;

/**
*  The class HostVariables is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class HostVariables extends HostVariablesSerialized {
   

						@Getter @Setter private char[] hvProcDt = new char[10];

						@Getter @Setter private char[] hvProcTm = new char[8];

						@Getter @Setter private char[] hvPgmIdLstCharVal = new char[1];

								@Getter @Setter private short hvIcnSufxVersNbr;
				@Getter @Setter private HvInvnCtlNbrGroup hvInvnCtlNbrGroup = new HvInvnCtlNbrGroup();

						@Getter @Setter private char[] hvIcnSufxCd = new char[3];

								@Getter @Setter private short hvLnId;
				@Getter @Setter private HvFstDtGroup hvFstDtGroup = new HvFstDtGroup();
				@Getter @Setter private HvLstSrvcDtGroup hvLstSrvcDtGroup = new HvLstSrvcDtGroup();

						@Getter @Setter private char[] hvProvTinsuff = new char[15];
				@Getter @Setter private HvProvTinsuffRedefined hvProvTinsuffRedefined = new HvProvTinsuffRedefined();

						@Getter @Setter private char[] hvProvTinsuff1 = new char[15];
				@Getter @Setter private HvProvTinsuff1Redefined hvProvTinsuff1Redefined = new HvProvTinsuff1Redefined();
				@Getter @Setter private HvFlnJulianDtNbrGroup hvFlnJulianDtNbrGroup = new HvFlnJulianDtNbrGroup();
				@Getter @Setter private HvFlnSrlNbrGroup hvFlnSrlNbrGroup = new HvFlnSrlNbrGroup();
				@Getter @Setter private HvFilmOfcNbrGroup hvFilmOfcNbrGroup = new HvFilmOfcNbrGroup();
				@Getter @Setter private HvAuthNbrGroup hvAuthNbrGroup = new HvAuthNbrGroup();
				@Getter @Setter private HvSrvcCatgyCdGroup hvSrvcCatgyCdGroup = new HvSrvcCatgyCdGroup();
				@Getter @Setter private HvSpiCtgyCd1Group hvSpiCtgyCd1Group = new HvSpiCtgyCd1Group();
				@Getter @Setter private HvSpiCtgyCd2Group hvSpiCtgyCd2Group = new HvSpiCtgyCd2Group();
				@Getter @Setter private HvSpiCtgyCd3Group hvSpiCtgyCd3Group = new HvSpiCtgyCd3Group();
				@Getter @Setter private HvSpiCtgyCd4Group hvSpiCtgyCd4Group = new HvSpiCtgyCd4Group();
				@Getter @Setter private HvSpiCtgyCd5Group hvSpiCtgyCd5Group = new HvSpiCtgyCd5Group();

						@Getter @Setter private char[] hvCptFrom = new char[7];

						@Getter @Setter private char[] hvCptThru = new char[7];

						@Getter @Setter private char[] hvRevFrom = new char[5];

						@Getter @Setter private char[] hvRevThru = new char[5];

						@Getter @Setter private char[] hvRemarkCd1 = new char[2];

						@Getter @Setter private char[] hvRemarkCd2 = new char[2];

						@Getter @Setter private char[] hvProvSpclCd1 = new char[3];

						@Getter @Setter private char[] hvProvSpclCd2 = new char[3];

						@Getter @Setter private char[] hvCauseCd1 = new char[1];

						@Getter @Setter private char[] hvCauseCd2 = new char[1];

						@Getter @Setter private char[] hvAppliedToOopInd = new char[1];
				@Getter @Setter private HvExtrNtfyNbrGroup hvExtrNtfyNbrGroup = new HvExtrNtfyNbrGroup();
				@Getter @Setter private HvNextKey hvNextKey = new HvNextKey();
	
	/**
	* Constructor for HostVariables
	**/
    public HostVariables() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getHvInvnCtlNbrGroup().setParent(this,getStartOffset() + 21);
					getHvFstDtGroup().setParent(this,getStartOffset() + 36);
					getHvLstSrvcDtGroup().setParent(this,getStartOffset() + 46);
					getHvProvTinsuffRedefined().setParent(this,getStartOffset() + 56);
					getHvProvTinsuff1Redefined().setParent(this,getStartOffset() + 71);
					getHvFlnJulianDtNbrGroup().setParent(this,getStartOffset() + 86);
					getHvFlnSrlNbrGroup().setParent(this,getStartOffset() + 91);
					getHvFilmOfcNbrGroup().setParent(this,getStartOffset() + 96);
					getHvAuthNbrGroup().setParent(this,getStartOffset() + 100);
					getHvSrvcCatgyCdGroup().setParent(this,getStartOffset() + 110);
					getHvSpiCtgyCd1Group().setParent(this,getStartOffset() + 112);
					getHvSpiCtgyCd2Group().setParent(this,getStartOffset() + 114);
					getHvSpiCtgyCd3Group().setParent(this,getStartOffset() + 116);
					getHvSpiCtgyCd4Group().setParent(this,getStartOffset() + 118);
					getHvSpiCtgyCd5Group().setParent(this,getStartOffset() + 120);
					getHvExtrNtfyNbrGroup().setParent(this,getStartOffset() + 159);
					getHvNextKey().setParent(this,getStartOffset() + 209);
	   	/*  end of offset */
								setHvProcDt(("9999-12-31").toCharArray());
								setHvProcTm(("23.59.59").toCharArray());
								setHvPgmIdLstCharVal(("9").toCharArray());
								setHvIcnSufxVersNbr((short)9999);
								setHvIcnSufxCd(("999").toCharArray());
								setHvLnId((short)9999);
								setHvProvTinsuff(("000000000000000").toCharArray());
								setHvProvTinsuff1(("999999999999999").toCharArray());
								setHvCptFrom(fillSpace(7));
								setHvCptThru(fillHighValue(7));
								setHvRevFrom(fillSpace(5));
								setHvRevThru(fillHighValue(5));
								setHvRemarkCd1(fillSpace(2));
								setHvRemarkCd2(fillHighValue(2));
								setHvProvSpclCd1(fillSpace(3));
								setHvProvSpclCd2(fillHighValue(3));
								setHvCauseCd1(fillSpace(1));
								setHvCauseCd2(fillHighValue(1));
								setHvAppliedToOopInd(fillSpace(1));
    }





}
  
