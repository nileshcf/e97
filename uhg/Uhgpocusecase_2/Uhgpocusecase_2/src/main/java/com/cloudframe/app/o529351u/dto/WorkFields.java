package com.cloudframe.app.o529351u.dto;

/**
*  The class WorkFields is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class WorkFields extends WorkFieldsSerialized {
   

						@Getter @Setter private char[] paragraph = Field.fillLowValue(4);
				@Getter @Setter private PlanVarInputLines planVarInputLines = new PlanVarInputLines();
				@Getter @Setter private HoldTransData holdTransData = new HoldTransData();
				@Getter @Setter private PrevMatchedKey prevMatchedKey = new PrevMatchedKey();
				@Getter @Setter private HoldTransData2 holdTransData2 = new HoldTransData2();

								@Getter @Setter private short nbrMatched;

								@Getter @Setter private short nbrMatchedPrev;
				@Getter @Setter private Point point = new Point();
				@Getter @Setter private Datecj datecj = new Datecj();

						@Getter @Setter private char[] datecjIn = Field.fillLowValue(8);

						@Getter @Setter private char[] datecjOut = Field.fillLowValue(5);

								@Getter @Setter private long datecjNum;

								@Getter @Setter private long complimentDate;

								@Getter @Setter private long julEffDate;

								@Getter @Setter private long planEffDate;
				@Getter @Setter private PlanEffDt planEffDt = new PlanEffDt();

								@Getter @Setter private long planCanDate;
				@Getter @Setter private PlanCanDt planCanDt = new PlanCanDt();

								@Getter @Setter private long planDosDate;
				@Getter @Setter private PlanDosDt planDosDt = new PlanDosDt();

								@Getter @Setter private long planDate;
				@Getter @Setter private PlanDt planDt = new PlanDt();

								@Getter @Setter private int number;

						@Getter @Setter private char[] polNo = Field.fillLowValue(6);

								@Getter @Setter private long plnNo;

						@Getter @Setter private char[] hold51uPolicy = Field.fillLowValue(6);

								@Getter @Setter private long hold51uPlan;

						@Getter @Setter private char[] ctlCntId1 = new char[1];

								@Getter @Setter private int zero;

						@Getter @Setter private char[] newServiceCode = Field.fillLowValue(6);
				@Getter @Setter private CkServCls ckServCls = new CkServCls();
				@Getter @Setter private ServTop servTop = new ServTop();
				@Getter @Setter private ServAlphaf servAlphaf = new ServAlphaf();
				@Getter @Setter private ServAlphal servAlphal = new ServAlphal();
				@Getter @Setter private FeServFr feServFr = new FeServFr();
				@Getter @Setter private ServToAlphaff servToAlphaff = new ServToAlphaff();
				@Getter @Setter private ServToAlphafl servToAlphafl = new ServToAlphafl();
				@Getter @Setter private FeServTo feServTo = new FeServTo();
				@Getter @Setter private ServToAlphatf servToAlphatf = new ServToAlphatf();
				@Getter @Setter private ServToAlphatl servToAlphatl = new ServToAlphatl();

								@Getter @Setter private int nbrOfLines;

								@Getter @Setter private int nbrOfPlanVar;

								@Getter @Setter private short nbrOfNewPlanVar;

								@Getter @Setter private short planVarPrev;

								@Getter @Setter private short newPlanVarPrev;

								@Getter @Setter private int latestLastDate;

						@Getter @Setter private char[] holdServCd = new char[6];

								@Getter @Setter private int prevDateServ;

								@Getter @Setter private int mcrCondCtr;

								@Getter @Setter private short chargeSub;

						@Getter @Setter private char[] chargeCombined = Field.fillLowValue(1);

						@Getter @Setter private char[] toCauseCdChanged = Field.fillLowValue(1);
				@Getter @Setter private McrCheckTable mcrCheckTable = new McrCheckTable();
	
	/**
	* Constructor for WorkFields
	**/
    public WorkFields() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getPlanVarInputLines().setParent(this,getStartOffset() + 4);
					getHoldTransData().setParent(this,getStartOffset() + 199984);
					getPrevMatchedKey().setParent(this,getStartOffset() + 200009);
					getHoldTransData2().setParent(this,getStartOffset() + 200018);
					getPoint().setParent(this,getStartOffset() + 200087);
					getDatecj().setParent(this,getStartOffset() + 200095);
					getPlanEffDt().setParent(this,getStartOffset() + 200118);
					getPlanCanDt().setParent(this,getStartOffset() + 200126);
					getPlanDosDt().setParent(this,getStartOffset() + 200134);
					getPlanDt().setParent(this,getStartOffset() + 200140);
					getCkServCls().setParent(this,getStartOffset() + 200175);
					getServTop().setParent(this,getStartOffset() + 200181);
					getServAlphaf().setParent(this,getStartOffset() + 200181);
					getServAlphal().setParent(this,getStartOffset() + 200181);
					getFeServFr().setParent(this,getStartOffset() + 200187);
					getServToAlphaff().setParent(this,getStartOffset() + 200187);
					getServToAlphafl().setParent(this,getStartOffset() + 200187);
					getFeServTo().setParent(this,getStartOffset() + 200193);
					getServToAlphatf().setParent(this,getStartOffset() + 200193);
					getServToAlphatl().setParent(this,getStartOffset() + 200193);
					getMcrCheckTable().setParent(this,getStartOffset() + 200246);
	   	/*  end of offset */
								setNbrMatched((short)0);
								setNbrMatchedPrev((short)0);
								setComplimentDate(0L);
								setJulEffDate(0L);
								setPlanEffDate(0L);
								setPlanCanDate(0L);
								setPlanDosDate(0L);
								setPlanDate(0L);
								setNumber(1);
								setPlnNo(0L);
								setHold51uPlan(0L);
								setCtlCntId1(fillSpace(1));
								setZero(0);
								setPlanVarPrev((short)0);
								setNewPlanVarPrev((short)0);
								setLatestLastDate(0);
								setHoldServCd(fillSpace(6));
								setMcrCondCtr(0);
								setChargeSub((short)0);
    }





}
  
