package com.cloudframe.app.testnum.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:56. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 1970;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginAddValue;
            protected  int beginSubValue;
            protected  int beginTgt39;
            protected  int beginTgt40;
            protected  int beginTgt41;
            protected  int beginTgt42;
            protected  int beginTgt43;
            protected  int beginTgt44;
            protected  int beginTgt45;
            protected  int beginTgt46;
            protected  int beginTgt47;
            protected  int beginTgt48;
            protected  int beginSrc49;
            protected  int beginTgt49;
            protected  int beginSrc50;
            protected  int beginTgt50;
            protected  int beginSrc51;
            protected  int beginTgt51;
            protected  int beginSrc52;
            protected  int beginTgt52;
            protected  int beginSrc53;
            protected  int beginTgt53;
            protected  int beginSrc54;
            protected  int beginTgt54;
            protected  int beginSrc55;
            protected  int beginTgt55;
            protected  int beginSrc56;
            protected  int beginTgt56;
            protected  int beginSrc57;
            protected  int beginTgt57;
            protected  int beginSrc58;
            protected  int beginTgt58;
            protected  int beginSrc59;
            protected  int beginTgt59;
            protected  int beginSrc60;
            protected  int beginTgt60;
            protected  int beginSrc61;
            protected  int beginTgt61;
            protected  int beginSrc62;
            protected  int beginTgt62;
            protected  int beginSrc63;
            protected  int beginTgt63;
            protected  int beginSrc64;
            protected  int beginTgt64;
            protected  int beginSrc65;
            protected  int beginTgt65;
            protected  int beginSrc66;
            protected  int beginTgt66;
            protected  int beginSrc67;
            protected  int beginTgt67;
            protected  int beginSrc68;
            protected  int beginTgt68;
            protected  int beginTgt69;
            protected  int beginTgt70;
            protected  int beginTgt71;
            protected  int beginTgt72;
            protected  int beginTgt73;
            protected  int beginTgt74;
            protected  int beginSrc75;
            protected  int beginTgt75;
            protected  int beginSrc76;
            protected  int beginTgt76;
            protected  int beginSrc77;
            protected  int beginSrc78;
            protected  int beginSrc79;
            protected  int beginSrc80;
            protected  int beginSrc81;
            protected  int beginSrc82;
            protected  int beginSrc83;
            protected  int beginTgt83;
            protected  int beginSrc84;
            protected  int beginTgt84;
            protected  int beginSrc85;
            protected  int beginSrc86;
            protected  int beginSrc87;
            protected  int beginSrc88;
            protected  int beginSrc89;
            protected  int beginSrc90;
            protected  int beginSrc91;
            protected  int beginTgt91;
            protected  int beginSrc92;
            protected  int beginTgt92;
            protected  int beginTgt93;
            protected  int beginTgt94;
            protected  int beginTgt95;
            protected  int beginTgt96;
            protected  int beginTgt97;
            protected  int beginTgt98;
            protected  int beginTgt99;
            protected  int beginTgt100;
            protected  int beginTgt101;
            protected  int beginTgt102;
            protected  int beginSrc103;
            protected  int beginTgt103;
            protected  int beginSrc104;
            protected  int beginTgt104;
            protected  int beginSrc105;
            protected  int beginTgt105;
            protected  int beginSrc106;
            protected  int beginTgt106;
            protected  int beginSrc107;
            protected  int beginTgt107;
            protected  int beginSrc108;
            protected  int beginTgt108;
            protected  int beginSrc109;
            protected  int beginTgt109;
            protected  int beginSrc110;
            protected  int beginTgt110;
            protected  int beginSrc111;
            protected  int beginTgt111;
            protected  int beginSrc112;
            protected  int beginTgt112;
            protected  int beginSrc113;
            protected  int beginTgt113;
            protected  int beginSrc114;
            protected  int beginTgt114;
            protected  int beginSrc115;
            protected  int beginTgt115;
            protected  int beginSrc116;
            protected  int beginTgt116;
            protected  int beginSrc117;
            protected  int beginTgt117;
            protected  int beginSrc118;
            protected  int beginTgt118;
            protected  int beginSrc119;
            protected  int beginTgt119;
            protected  int beginSrc120;
            protected  int beginTgt120;
            protected  int beginSrc121;
            protected  int beginTgt121;
            protected  int beginSrc122;
            protected  int beginTgt122;
            protected  int beginTgt123;
            protected  int beginTgt124;
            protected  int beginTgt125;
            protected  int beginTgt126;
            protected  int beginTgt127;
            protected  int beginTgt128;
            protected  int beginSrc129;
            protected  int beginTgt129;
            protected  int beginSrc130;
            protected  int beginTgt130;
            protected  int beginSrc131;
            protected  int beginSrc132;
            protected  int beginSrc133;
            protected  int beginSrc134;
            protected  int beginSrc135;
            protected  int beginSrc136;
            protected  int beginSrc137;
            protected  int beginTgt137;
            protected  int beginSrc138;
            protected  int beginTgt138;
            protected  int beginSrc139;
            protected  int beginSrc140;
            protected  int beginSrc141;
            protected  int beginSrc142;
            protected  int beginSrc143;
            protected  int beginSrc144;
            protected  int beginSrc145;
            protected  int beginTgt145;
            protected  int beginSrc146;
            protected  int beginTgt146;
            protected  int beginTgt147;
            protected  int beginTgt148;
            protected  int beginTgt151;
            protected  int beginTgt152;
            protected  int beginSrc155;
            protected  int beginTgt155;
            protected  int beginTgt156;
            protected  int beginSrc157;
            protected  int beginSrc159;
            protected  int beginTgt159;
            protected  int beginSrc160;
            protected  int beginTgt160;
            protected  int beginSrc161;
            protected  int beginSrc162;
            protected  int beginSrc163;
            protected  int beginTgt163;
            protected  int beginTgt164;
            protected  int beginSrc165;
            protected  int beginTgt167;
            protected  int beginTgt172;
            protected  int beginTgt177;
            protected  int beginTgt178;
            protected  int beginTgt179;
            protected  int beginTgt180;
            protected  int beginTgt181;
            protected  int beginSrc182;
            protected  int beginTgt182;
            protected  int beginSrc183;
            protected  int beginTgt183;
            protected  int beginSrc184;
            protected  int beginSrc185;
            protected  int beginSrc186;
            protected  int beginSrc187;
            protected  int beginSrc188;
            protected  int beginSrc189;
            protected  int beginSrc190;
            protected  int beginSrc191;
            protected  int beginSrc192;
            protected  int beginTgt192;
            protected  int beginSrc193;
            protected  int beginTgt193;
            protected  int beginSrc194;
            protected  int beginTgt194;
            protected  int beginSrc195;
            protected  int beginTgt195;
            protected  int beginSrc196;
            protected  int beginTgt196;
            protected  int beginTgt197;
            protected  int beginTgt198;
            protected  int beginSrc201;
            protected  int beginNperInv;
            protected  int beginTempResL1;
            protected  int beginTempResL2;
            protected  int beginBpAdjust;
            protected  int beginBpAdjustRelative;
            protected  int beginUpdTotReturn;
            protected  int beginReturnRelative;
            protected  int beginStrikeAmt;
            protected  int beginMsdOptStrikePrice;
            protected  int beginMsdOptStrikePriceS;
            protected  int beginScsecxStrikePrc;
	
	/**
	* Constructor for WorkSerialized
	**/
    public WorkSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in WorkSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WORK_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginAddValue = getStartOffset() + 0;	// set offset for serialization
  
             beginSubValue = getStartOffset() + 3;	// set offset for serialization
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
             beginTgt39 = getStartOffset() + 6;	// set offset for serialization
  
  
             beginTgt40 = getStartOffset() + 12;	// set offset for serialization
  
  
             beginTgt41 = getStartOffset() + 18;	// set offset for serialization
  
  
             beginTgt42 = getStartOffset() + 23;	// set offset for serialization
  
  
             beginTgt43 = getStartOffset() + 31;	// set offset for serialization
  
  
             beginTgt44 = getStartOffset() + 36;	// set offset for serialization
  
  
             beginTgt45 = getStartOffset() + 44;	// set offset for serialization
  
  
             beginTgt46 = getStartOffset() + 49;	// set offset for serialization
  
  
             beginTgt47 = getStartOffset() + 57;	// set offset for serialization
  
  
             beginTgt48 = getStartOffset() + 62;	// set offset for serialization
  
             beginSrc49 = getStartOffset() + 70;	// set offset for serialization
  
             beginTgt49 = getStartOffset() + 77;	// set offset for serialization
  
             beginSrc50 = getStartOffset() + 82;	// set offset for serialization
  
             beginTgt50 = getStartOffset() + 87;	// set offset for serialization
  
             beginSrc51 = getStartOffset() + 95;	// set offset for serialization
  
             beginTgt51 = getStartOffset() + 108;	// set offset for serialization
  
             beginSrc52 = getStartOffset() + 113;	// set offset for serialization
  
             beginTgt52 = getStartOffset() + 121;	// set offset for serialization
  
             beginSrc53 = getStartOffset() + 129;	// set offset for serialization
  
             beginTgt53 = getStartOffset() + 142;	// set offset for serialization
  
             beginSrc54 = getStartOffset() + 147;	// set offset for serialization
  
             beginTgt54 = getStartOffset() + 155;	// set offset for serialization
  
             beginSrc55 = getStartOffset() + 163;	// set offset for serialization
  
             beginTgt55 = getStartOffset() + 176;	// set offset for serialization
  
             beginSrc56 = getStartOffset() + 181;	// set offset for serialization
  
             beginTgt56 = getStartOffset() + 189;	// set offset for serialization
  
             beginSrc57 = getStartOffset() + 197;	// set offset for serialization
  
             beginTgt57 = getStartOffset() + 204;	// set offset for serialization
  
             beginSrc58 = getStartOffset() + 212;	// set offset for serialization
  
             beginTgt58 = getStartOffset() + 217;	// set offset for serialization
  
             beginSrc59 = getStartOffset() + 231;	// set offset for serialization
  
             beginTgt59 = getStartOffset() + 238;	// set offset for serialization
  
             beginSrc60 = getStartOffset() + 246;	// set offset for serialization
  
             beginTgt60 = getStartOffset() + 251;	// set offset for serialization
  
             beginSrc61 = getStartOffset() + 265;	// set offset for serialization
  
             beginTgt61 = getStartOffset() + 272;	// set offset for serialization
  
             beginSrc62 = getStartOffset() + 280;	// set offset for serialization
  
             beginTgt62 = getStartOffset() + 285;	// set offset for serialization
  
             beginSrc63 = getStartOffset() + 299;	// set offset for serialization
  
             beginTgt63 = getStartOffset() + 312;	// set offset for serialization
  
             beginSrc64 = getStartOffset() + 320;	// set offset for serialization
  
             beginTgt64 = getStartOffset() + 328;	// set offset for serialization
  
             beginSrc65 = getStartOffset() + 342;	// set offset for serialization
  
             beginTgt65 = getStartOffset() + 355;	// set offset for serialization
  
             beginSrc66 = getStartOffset() + 363;	// set offset for serialization
  
             beginTgt66 = getStartOffset() + 371;	// set offset for serialization
  
             beginSrc67 = getStartOffset() + 385;	// set offset for serialization
  
             beginTgt67 = getStartOffset() + 398;	// set offset for serialization
  
             beginSrc68 = getStartOffset() + 406;	// set offset for serialization
  
             beginTgt68 = getStartOffset() + 414;	// set offset for serialization
  
  
             beginTgt69 = getStartOffset() + 428;	// set offset for serialization
  
  
             beginTgt70 = getStartOffset() + 438;	// set offset for serialization
  
  
             beginTgt71 = getStartOffset() + 448;	// set offset for serialization
  
  
             beginTgt72 = getStartOffset() + 458;	// set offset for serialization
  
  
             beginTgt73 = getStartOffset() + 468;	// set offset for serialization
  
  
             beginTgt74 = getStartOffset() + 478;	// set offset for serialization
  
             beginSrc75 = getStartOffset() + 488;	// set offset for serialization
  
             beginTgt75 = getStartOffset() + 494;	// set offset for serialization
  
             beginSrc76 = getStartOffset() + 504;	// set offset for serialization
  
             beginTgt76 = getStartOffset() + 510;	// set offset for serialization
  
             beginSrc77 = getStartOffset() + 520;	// set offset for serialization
  
  
             beginSrc78 = getStartOffset() + 530;	// set offset for serialization
  
  
             beginSrc79 = getStartOffset() + 540;	// set offset for serialization
  
  
             beginSrc80 = getStartOffset() + 550;	// set offset for serialization
  
  
             beginSrc81 = getStartOffset() + 560;	// set offset for serialization
  
  
             beginSrc82 = getStartOffset() + 570;	// set offset for serialization
  
  
             beginSrc83 = getStartOffset() + 580;	// set offset for serialization
  
             beginTgt83 = getStartOffset() + 590;	// set offset for serialization
  
             beginSrc84 = getStartOffset() + 596;	// set offset for serialization
  
             beginTgt84 = getStartOffset() + 606;	// set offset for serialization
  
             beginSrc85 = getStartOffset() + 612;	// set offset for serialization
  
  
             beginSrc86 = getStartOffset() + 622;	// set offset for serialization
  
  
             beginSrc87 = getStartOffset() + 632;	// set offset for serialization
  
  
             beginSrc88 = getStartOffset() + 642;	// set offset for serialization
  
  
             beginSrc89 = getStartOffset() + 652;	// set offset for serialization
  
  
             beginSrc90 = getStartOffset() + 662;	// set offset for serialization
  
  
             beginSrc91 = getStartOffset() + 672;	// set offset for serialization
  
             beginTgt91 = getStartOffset() + 682;	// set offset for serialization
  
             beginSrc92 = getStartOffset() + 688;	// set offset for serialization
  
             beginTgt92 = getStartOffset() + 698;	// set offset for serialization
  
  
             beginTgt93 = getStartOffset() + 704;	// set offset for serialization
  
  
             beginTgt94 = getStartOffset() + 710;	// set offset for serialization
  
  
             beginTgt95 = getStartOffset() + 716;	// set offset for serialization
  
  
             beginTgt96 = getStartOffset() + 721;	// set offset for serialization
  
  
             beginTgt97 = getStartOffset() + 729;	// set offset for serialization
  
  
             beginTgt98 = getStartOffset() + 734;	// set offset for serialization
  
  
             beginTgt99 = getStartOffset() + 742;	// set offset for serialization
  
  
             beginTgt100 = getStartOffset() + 747;	// set offset for serialization
  
  
             beginTgt101 = getStartOffset() + 755;	// set offset for serialization
  
  
             beginTgt102 = getStartOffset() + 760;	// set offset for serialization
  
             beginSrc103 = getStartOffset() + 768;	// set offset for serialization
  
             beginTgt103 = getStartOffset() + 775;	// set offset for serialization
  
             beginSrc104 = getStartOffset() + 780;	// set offset for serialization
  
             beginTgt104 = getStartOffset() + 785;	// set offset for serialization
  
             beginSrc105 = getStartOffset() + 793;	// set offset for serialization
  
             beginTgt105 = getStartOffset() + 806;	// set offset for serialization
  
             beginSrc106 = getStartOffset() + 811;	// set offset for serialization
  
             beginTgt106 = getStartOffset() + 819;	// set offset for serialization
  
             beginSrc107 = getStartOffset() + 827;	// set offset for serialization
  
             beginTgt107 = getStartOffset() + 840;	// set offset for serialization
  
             beginSrc108 = getStartOffset() + 845;	// set offset for serialization
  
             beginTgt108 = getStartOffset() + 853;	// set offset for serialization
  
             beginSrc109 = getStartOffset() + 861;	// set offset for serialization
  
             beginTgt109 = getStartOffset() + 874;	// set offset for serialization
  
             beginSrc110 = getStartOffset() + 879;	// set offset for serialization
  
             beginTgt110 = getStartOffset() + 887;	// set offset for serialization
  
             beginSrc111 = getStartOffset() + 895;	// set offset for serialization
  
             beginTgt111 = getStartOffset() + 902;	// set offset for serialization
  
             beginSrc112 = getStartOffset() + 910;	// set offset for serialization
  
             beginTgt112 = getStartOffset() + 915;	// set offset for serialization
  
             beginSrc113 = getStartOffset() + 929;	// set offset for serialization
  
             beginTgt113 = getStartOffset() + 936;	// set offset for serialization
  
             beginSrc114 = getStartOffset() + 944;	// set offset for serialization
  
             beginTgt114 = getStartOffset() + 949;	// set offset for serialization
  
             beginSrc115 = getStartOffset() + 963;	// set offset for serialization
  
             beginTgt115 = getStartOffset() + 970;	// set offset for serialization
  
             beginSrc116 = getStartOffset() + 978;	// set offset for serialization
  
             beginTgt116 = getStartOffset() + 983;	// set offset for serialization
  
             beginSrc117 = getStartOffset() + 997;	// set offset for serialization
  
             beginTgt117 = getStartOffset() + 1010;	// set offset for serialization
  
             beginSrc118 = getStartOffset() + 1018;	// set offset for serialization
  
             beginTgt118 = getStartOffset() + 1026;	// set offset for serialization
  
             beginSrc119 = getStartOffset() + 1040;	// set offset for serialization
  
             beginTgt119 = getStartOffset() + 1053;	// set offset for serialization
  
             beginSrc120 = getStartOffset() + 1061;	// set offset for serialization
  
             beginTgt120 = getStartOffset() + 1069;	// set offset for serialization
  
             beginSrc121 = getStartOffset() + 1083;	// set offset for serialization
  
             beginTgt121 = getStartOffset() + 1096;	// set offset for serialization
  
             beginSrc122 = getStartOffset() + 1104;	// set offset for serialization
  
             beginTgt122 = getStartOffset() + 1112;	// set offset for serialization
  
  
             beginTgt123 = getStartOffset() + 1126;	// set offset for serialization
  
  
             beginTgt124 = getStartOffset() + 1136;	// set offset for serialization
  
  
             beginTgt125 = getStartOffset() + 1146;	// set offset for serialization
  
  
             beginTgt126 = getStartOffset() + 1156;	// set offset for serialization
  
  
             beginTgt127 = getStartOffset() + 1166;	// set offset for serialization
  
  
             beginTgt128 = getStartOffset() + 1176;	// set offset for serialization
  
             beginSrc129 = getStartOffset() + 1186;	// set offset for serialization
  
             beginTgt129 = getStartOffset() + 1192;	// set offset for serialization
  
             beginSrc130 = getStartOffset() + 1202;	// set offset for serialization
  
             beginTgt130 = getStartOffset() + 1208;	// set offset for serialization
  
             beginSrc131 = getStartOffset() + 1218;	// set offset for serialization
  
  
             beginSrc132 = getStartOffset() + 1228;	// set offset for serialization
  
  
             beginSrc133 = getStartOffset() + 1238;	// set offset for serialization
  
  
             beginSrc134 = getStartOffset() + 1248;	// set offset for serialization
  
  
             beginSrc135 = getStartOffset() + 1258;	// set offset for serialization
  
  
             beginSrc136 = getStartOffset() + 1268;	// set offset for serialization
  
  
             beginSrc137 = getStartOffset() + 1278;	// set offset for serialization
  
             beginTgt137 = getStartOffset() + 1288;	// set offset for serialization
  
             beginSrc138 = getStartOffset() + 1294;	// set offset for serialization
  
             beginTgt138 = getStartOffset() + 1304;	// set offset for serialization
  
             beginSrc139 = getStartOffset() + 1310;	// set offset for serialization
  
  
             beginSrc140 = getStartOffset() + 1320;	// set offset for serialization
  
  
             beginSrc141 = getStartOffset() + 1330;	// set offset for serialization
  
  
             beginSrc142 = getStartOffset() + 1340;	// set offset for serialization
  
  
             beginSrc143 = getStartOffset() + 1350;	// set offset for serialization
  
  
             beginSrc144 = getStartOffset() + 1360;	// set offset for serialization
  
  
             beginSrc145 = getStartOffset() + 1370;	// set offset for serialization
  
             beginTgt145 = getStartOffset() + 1380;	// set offset for serialization
  
             beginSrc146 = getStartOffset() + 1386;	// set offset for serialization
  
             beginTgt146 = getStartOffset() + 1396;	// set offset for serialization
  
  
             beginTgt147 = getStartOffset() + 1402;	// set offset for serialization
  
             beginTgt148 = getStartOffset() + 1412;	// set offset for serialization
  
  
  
             beginTgt151 = getStartOffset() + 1422;	// set offset for serialization
  
             beginTgt152 = getStartOffset() + 1432;	// set offset for serialization
  
  
             beginSrc155 = getStartOffset() + 1442;	// set offset for serialization
  
             beginTgt155 = getStartOffset() + 1446;	// set offset for serialization
  
             beginTgt156 = getStartOffset() + 1456;	// set offset for serialization
  
             beginSrc157 = getStartOffset() + 1466;	// set offset for serialization
  
             beginSrc159 = getStartOffset() + 1470;	// set offset for serialization
  
             beginTgt159 = getStartOffset() + 1477;	// set offset for serialization
  
             beginSrc160 = getStartOffset() + 1487;	// set offset for serialization
  
             beginTgt160 = getStartOffset() + 1494;	// set offset for serialization
  
             beginSrc161 = getStartOffset() + 1504;	// set offset for serialization
  
             beginSrc162 = getStartOffset() + 1511;	// set offset for serialization
  
             beginSrc163 = getStartOffset() + 1518;	// set offset for serialization
  
             beginTgt163 = getStartOffset() + 1523;	// set offset for serialization
  
             beginTgt164 = getStartOffset() + 1533;	// set offset for serialization
  
             beginSrc165 = getStartOffset() + 1543;	// set offset for serialization
  
  
             beginTgt167 = getStartOffset() + 1548;	// set offset for serialization
  
  
  
  
  
  
  
  
  
  
             beginTgt172 = getStartOffset() + 1554;	// set offset for serialization
  
  
  
  
  
  
  
  
  
  
             beginTgt177 = getStartOffset() + 1560;	// set offset for serialization
  
  
             beginTgt178 = getStartOffset() + 1567;	// set offset for serialization
  
  
             beginTgt179 = getStartOffset() + 1574;	// set offset for serialization
  
  
             beginTgt180 = getStartOffset() + 1581;	// set offset for serialization
  
  
             beginTgt181 = getStartOffset() + 1592;	// set offset for serialization
  
             beginSrc182 = getStartOffset() + 1603;	// set offset for serialization
  
             beginTgt182 = getStartOffset() + 1611;	// set offset for serialization
  
             beginSrc183 = getStartOffset() + 1621;	// set offset for serialization
  
             beginTgt183 = getStartOffset() + 1635;	// set offset for serialization
  
             beginSrc184 = getStartOffset() + 1641;	// set offset for serialization
  
  
             beginSrc185 = getStartOffset() + 1655;	// set offset for serialization
  
  
             beginSrc186 = getStartOffset() + 1663;	// set offset for serialization
  
  
             beginSrc187 = getStartOffset() + 1671;	// set offset for serialization
  
  
             beginSrc188 = getStartOffset() + 1679;	// set offset for serialization
  
  
             beginSrc189 = getStartOffset() + 1693;	// set offset for serialization
  
  
             beginSrc190 = getStartOffset() + 1707;	// set offset for serialization
  
  
             beginSrc191 = getStartOffset() + 1721;	// set offset for serialization
  
  
             beginSrc192 = getStartOffset() + 1735;	// set offset for serialization
  
             beginTgt192 = getStartOffset() + 1749;	// set offset for serialization
  
             beginSrc193 = getStartOffset() + 1759;	// set offset for serialization
  
             beginTgt193 = getStartOffset() + 1767;	// set offset for serialization
  
             beginSrc194 = getStartOffset() + 1777;	// set offset for serialization
  
             beginTgt194 = getStartOffset() + 1793;	// set offset for serialization
  
             beginSrc195 = getStartOffset() + 1803;	// set offset for serialization
  
             beginTgt195 = getStartOffset() + 1819;	// set offset for serialization
  
             beginSrc196 = getStartOffset() + 1833;	// set offset for serialization
  
             beginTgt196 = getStartOffset() + 1849;	// set offset for serialization
  
  
             beginTgt197 = getStartOffset() + 1857;	// set offset for serialization
  
             beginTgt198 = getStartOffset() + 1862;	// set offset for serialization
  
  
             beginSrc201 = getStartOffset() + 1867;	// set offset for serialization
  
  
  
             beginNperInv = getStartOffset() + 1877;	// set offset for serialization
  
             beginTempResL1 = getStartOffset() + 1881;	// set offset for serialization
  
             beginTempResL2 = getStartOffset() + 1889;	// set offset for serialization
  
             beginBpAdjust = getStartOffset() + 1897;	// set offset for serialization
  
             beginBpAdjustRelative = getStartOffset() + 1900;	// set offset for serialization
  
             beginUpdTotReturn = getStartOffset() + 1904;	// set offset for serialization
  
             beginReturnRelative = getStartOffset() + 1910;	// set offset for serialization
  
             beginStrikeAmt = getStartOffset() + 1920;	// set offset for serialization
  
             beginMsdOptStrikePrice = getStartOffset() + 1928;	// set offset for serialization
  
             beginMsdOptStrikePriceS = getStartOffset() + 1946;	// set offset for serialization
  
             beginScsecxStrikePrc = getStartOffset() + 1964;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localAddValueCounter = -1;
     public boolean isAddValueModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAddValueCounter != sharedCounter;
         localAddValueCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of addValue
	 *	@return addValue
	 */
	public char[]  getAddValueString() {
	     return getCharArray(beginAddValue,ADD_VALUE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean addValueIsNumeric() {
	    return isNumeric(beginAddValue
	                    ,beginAddValue + ADD_VALUE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int ADD_VALUE_LEN = 3;
  	/**
	 * serializeAddValue
	 */
	protected void serializeAddValue(int addValue) {
		 putNumber(beginAddValue,addValue,ADD_VALUE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localAddValueCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeAddValue
	 */
   	protected  int serializeAddValue(char[] value) {
	    int  addValue;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    addValue = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginAddValue
		       ,3
		      );
		 localAddValueCounter = shareString.getSerializedField().getModifiedCounter();
		return  addValue;
    }

   protected int checkAddValueMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshAddValue is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshAddValue() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginAddValue
			                 ,ADD_VALUE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("addValue", beginAddValue,ADD_VALUE_LEN);
    }
   	}
     int localSubValueCounter = -1;
     public boolean isSubValueModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSubValueCounter != sharedCounter;
         localSubValueCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of subValue
	 *	@return subValue
	 */
	public char[]  getSubValueString() {
	     return getCharArray(beginSubValue,SUB_VALUE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean subValueIsNumeric() {
	    return isNumeric(beginSubValue
	                    ,beginSubValue + SUB_VALUE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SUB_VALUE_LEN = 3;
  	/**
	 * serializeSubValue
	 */
	protected void serializeSubValue(int subValue) {
		 putNumber(beginSubValue,subValue,SUB_VALUE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSubValueCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSubValue
	 */
   	protected  int serializeSubValue(char[] value) {
	    int  subValue;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    subValue = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginSubValue
		       ,3
		      );
		 localSubValueCounter = shareString.getSerializedField().getModifiedCounter();
		return  subValue;
    }

   protected int checkSubValueMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSubValue is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSubValue() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginSubValue
			                 ,SUB_VALUE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("subValue", beginSubValue,SUB_VALUE_LEN);
    }
   	}
         int localSrc3Counter = -1;
         public boolean isSrc3Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc3Counter != sharedCounter;
            localSrc3Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSrc3MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,8/*dataLen*/);
   }
         int localTgt3Counter = -1;
         public boolean isTgt3Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt3Counter != sharedCounter;
            localTgt3Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkTgt3MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localSrc4Counter = -1;
         public boolean isSrc4Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc4Counter != sharedCounter;
            localSrc4Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSrc4MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,8/*dataLen*/);
   }
         int localTgt4Counter = -1;
         public boolean isTgt4Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt4Counter != sharedCounter;
            localTgt4Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkTgt4MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localSrc5Counter = -1;
         public boolean isSrc5Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc5Counter != sharedCounter;
            localSrc5Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSrc5MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,8/*dataLen*/);
   }
         int localTgt5Counter = -1;
         public boolean isTgt5Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt5Counter != sharedCounter;
            localTgt5Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkTgt5MaxLimit(long number) {
        return checkMaxLimit(number, true/*isSigned*/,8/*dataLen*/);
   }
         int localSrc6Counter = -1;
         public boolean isSrc6Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc6Counter != sharedCounter;
            localSrc6Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSrc6MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,8/*dataLen*/);
   }
         int localTgt6Counter = -1;
         public boolean isTgt6Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt6Counter != sharedCounter;
            localTgt6Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkTgt6MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,8/*dataLen*/);
   }
         int localSrc7Counter = -1;
         public boolean isSrc7Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc7Counter != sharedCounter;
            localSrc7Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSrc7MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,8/*dataLen*/);
   }
         int localTgt7Counter = -1;
         public boolean isTgt7Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt7Counter != sharedCounter;
            localTgt7Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkTgt7MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localSrc8Counter = -1;
         public boolean isSrc8Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc8Counter != sharedCounter;
            localSrc8Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSrc8MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,8/*dataLen*/);
   }
         int localTgt8Counter = -1;
         public boolean isTgt8Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt8Counter != sharedCounter;
            localTgt8Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkTgt8MaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
         int localSrc9Counter = -1;
         public boolean isSrc9Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc9Counter != sharedCounter;
            localSrc9Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSrc9MaxLimit(long number) {
        return checkMaxLimit(number, true/*isSigned*/,8/*dataLen*/);
   }
         int localTgt9Counter = -1;
         public boolean isTgt9Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt9Counter != sharedCounter;
            localTgt9Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkTgt9MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localSrc10Counter = -1;
         public boolean isSrc10Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc10Counter != sharedCounter;
            localSrc10Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSrc10MaxLimit(long number) {
        return checkMaxLimit(number, true/*isSigned*/,8/*dataLen*/);
   }
         int localTgt10Counter = -1;
         public boolean isTgt10Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt10Counter != sharedCounter;
            localTgt10Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkTgt10MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localSrc11Counter = -1;
         public boolean isSrc11Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc11Counter != sharedCounter;
            localSrc11Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSrc11MaxLimit(long number) {
        return checkMaxLimit(number, true/*isSigned*/,8/*dataLen*/);
   }
         int localTgt11Counter = -1;
         public boolean isTgt11Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt11Counter != sharedCounter;
            localTgt11Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkTgt11MaxLimit(long number) {
        return checkMaxLimit(number, true/*isSigned*/,8/*dataLen*/);
   }
         int localSrc12Counter = -1;
         public boolean isSrc12Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc12Counter != sharedCounter;
            localSrc12Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSrc12MaxLimit(long number) {
        return checkMaxLimit(number, true/*isSigned*/,8/*dataLen*/);
   }
         int localTgt12Counter = -1;
         public boolean isTgt12Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt12Counter != sharedCounter;
            localTgt12Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkTgt12MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,8/*dataLen*/);
   }
         int localSrc13Counter = -1;
         public boolean isSrc13Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc13Counter != sharedCounter;
            localSrc13Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSrc13MaxLimit(long number) {
        return checkMaxLimit(number, true/*isSigned*/,8/*dataLen*/);
   }
         int localTgt13Counter = -1;
         public boolean isTgt13Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt13Counter != sharedCounter;
            localTgt13Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkTgt13MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localSrc14Counter = -1;
         public boolean isSrc14Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc14Counter != sharedCounter;
            localSrc14Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSrc14MaxLimit(long number) {
        return checkMaxLimit(number, true/*isSigned*/,8/*dataLen*/);
   }
         int localTgt14Counter = -1;
         public boolean isTgt14Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt14Counter != sharedCounter;
            localTgt14Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkTgt14MaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
         int localSrc15Counter = -1;
         public boolean isSrc15Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc15Counter != sharedCounter;
            localSrc15Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkSrc15MaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
         int localTgt15Counter = -1;
         public boolean isTgt15Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt15Counter != sharedCounter;
            localTgt15Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkTgt15MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localSrc16Counter = -1;
         public boolean isSrc16Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc16Counter != sharedCounter;
            localSrc16Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkSrc16MaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
         int localTgt16Counter = -1;
         public boolean isTgt16Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt16Counter != sharedCounter;
            localTgt16Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkTgt16MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localSrc17Counter = -1;
         public boolean isSrc17Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc17Counter != sharedCounter;
            localSrc17Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkSrc17MaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
         int localTgt17Counter = -1;
         public boolean isTgt17Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt17Counter != sharedCounter;
            localTgt17Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkTgt17MaxLimit(long number) {
        return checkMaxLimit(number, true/*isSigned*/,8/*dataLen*/);
   }
         int localSrc18Counter = -1;
         public boolean isSrc18Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc18Counter != sharedCounter;
            localSrc18Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkSrc18MaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
         int localTgt18Counter = -1;
         public boolean isTgt18Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt18Counter != sharedCounter;
            localTgt18Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkTgt18MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,8/*dataLen*/);
   }
         int localSrc19Counter = -1;
         public boolean isSrc19Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc19Counter != sharedCounter;
            localSrc19Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkSrc19MaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
         int localTgt19Counter = -1;
         public boolean isTgt19Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt19Counter != sharedCounter;
            localTgt19Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkTgt19MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localSrc20Counter = -1;
         public boolean isSrc20Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc20Counter != sharedCounter;
            localSrc20Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkSrc20MaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
         int localTgt20Counter = -1;
         public boolean isTgt20Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt20Counter != sharedCounter;
            localTgt20Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkTgt20MaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
         int localSrc21Counter = -1;
         public boolean isSrc21Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc21Counter != sharedCounter;
            localSrc21Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkSrc21MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localTgt21Counter = -1;
         public boolean isTgt21Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt21Counter != sharedCounter;
            localTgt21Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkTgt21MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localSrc22Counter = -1;
         public boolean isSrc22Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc22Counter != sharedCounter;
            localSrc22Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkSrc22MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localTgt22Counter = -1;
         public boolean isTgt22Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt22Counter != sharedCounter;
            localTgt22Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkTgt22MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localSrc23Counter = -1;
         public boolean isSrc23Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc23Counter != sharedCounter;
            localSrc23Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkSrc23MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localTgt23Counter = -1;
         public boolean isTgt23Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt23Counter != sharedCounter;
            localTgt23Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkTgt23MaxLimit(long number) {
        return checkMaxLimit(number, true/*isSigned*/,8/*dataLen*/);
   }
         int localSrc24Counter = -1;
         public boolean isSrc24Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc24Counter != sharedCounter;
            localSrc24Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkSrc24MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localTgt24Counter = -1;
         public boolean isTgt24Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt24Counter != sharedCounter;
            localTgt24Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkTgt24MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,8/*dataLen*/);
   }
         int localSrc25Counter = -1;
         public boolean isSrc25Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc25Counter != sharedCounter;
            localSrc25Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkSrc25MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localTgt25Counter = -1;
         public boolean isTgt25Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt25Counter != sharedCounter;
            localTgt25Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkTgt25MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localSrc26Counter = -1;
         public boolean isSrc26Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc26Counter != sharedCounter;
            localSrc26Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkSrc26MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localTgt26Counter = -1;
         public boolean isTgt26Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt26Counter != sharedCounter;
            localTgt26Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkTgt26MaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
         int localSrc27Counter = -1;
         public boolean isSrc27Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc27Counter != sharedCounter;
            localSrc27Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSrc27MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localTgt27Counter = -1;
         public boolean isTgt27Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt27Counter != sharedCounter;
            localTgt27Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkTgt27MaxLimit(long number) {
        return checkMaxLimit(number, true/*isSigned*/,8/*dataLen*/);
   }
         int localSrc28Counter = -1;
         public boolean isSrc28Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc28Counter != sharedCounter;
            localSrc28Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSrc28MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localTgt28Counter = -1;
         public boolean isTgt28Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt28Counter != sharedCounter;
            localTgt28Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkTgt28MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localSrc29Counter = -1;
         public boolean isSrc29Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc29Counter != sharedCounter;
            localSrc29Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSrc29MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localTgt29Counter = -1;
         public boolean isTgt29Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt29Counter != sharedCounter;
            localTgt29Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkTgt29MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localSrc30Counter = -1;
         public boolean isSrc30Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc30Counter != sharedCounter;
            localSrc30Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSrc30MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localTgt30Counter = -1;
         public boolean isTgt30Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt30Counter != sharedCounter;
            localTgt30Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkTgt30MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,8/*dataLen*/);
   }
         int localSrc31Counter = -1;
         public boolean isSrc31Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc31Counter != sharedCounter;
            localSrc31Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSrc31MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localTgt31Counter = -1;
         public boolean isTgt31Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt31Counter != sharedCounter;
            localTgt31Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkTgt31MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localSrc32Counter = -1;
         public boolean isSrc32Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc32Counter != sharedCounter;
            localSrc32Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSrc32MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localTgt32Counter = -1;
         public boolean isTgt32Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt32Counter != sharedCounter;
            localTgt32Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkTgt32MaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
         int localSrc33Counter = -1;
         public boolean isSrc33Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc33Counter != sharedCounter;
            localSrc33Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkSrc33MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localTgt33Counter = -1;
         public boolean isTgt33Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt33Counter != sharedCounter;
            localTgt33Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkTgt33MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localSrc34Counter = -1;
         public boolean isSrc34Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc34Counter != sharedCounter;
            localSrc34Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkSrc34MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localTgt34Counter = -1;
         public boolean isTgt34Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt34Counter != sharedCounter;
            localTgt34Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkTgt34MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localSrc35Counter = -1;
         public boolean isSrc35Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc35Counter != sharedCounter;
            localSrc35Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkSrc35MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localTgt35Counter = -1;
         public boolean isTgt35Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt35Counter != sharedCounter;
            localTgt35Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkTgt35MaxLimit(long number) {
        return checkMaxLimit(number, true/*isSigned*/,8/*dataLen*/);
   }
         int localSrc36Counter = -1;
         public boolean isSrc36Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc36Counter != sharedCounter;
            localSrc36Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkSrc36MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localTgt36Counter = -1;
         public boolean isTgt36Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt36Counter != sharedCounter;
            localTgt36Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkTgt36MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,8/*dataLen*/);
   }
         int localSrc37Counter = -1;
         public boolean isSrc37Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc37Counter != sharedCounter;
            localSrc37Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkSrc37MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localTgt37Counter = -1;
         public boolean isTgt37Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt37Counter != sharedCounter;
            localTgt37Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkTgt37MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localSrc38Counter = -1;
         public boolean isSrc38Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc38Counter != sharedCounter;
            localSrc38Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkSrc38MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localTgt38Counter = -1;
         public boolean isTgt38Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt38Counter != sharedCounter;
            localTgt38Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkTgt38MaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
         int localSrc39Counter = -1;
         public boolean isSrc39Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc39Counter != sharedCounter;
            localSrc39Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkSrc39MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     int localTgt39Counter = -1;
     public boolean isTgt39Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt39Counter != sharedCounter;
         localTgt39Counter = sharedCounter; return hasModified;
     }
	protected static final int TGT_39_LEN = 6;
	/**
	 * 	serialize this Tgt39
	 */
   protected void serializeTgt39(char[] tgt39) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tgt39,0,getStringValue(),beginTgt39,TGT_39_LEN);
       localTgt39Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTgt39Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshTgt39 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTgt39() {	 
   		return (substring(getStringValue(),beginTgt39,beginTgt39 + TGT_39_LEN));
   	}
         int localSrc40Counter = -1;
         public boolean isSrc40Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc40Counter != sharedCounter;
            localSrc40Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkSrc40MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     int localTgt40Counter = -1;
     public boolean isTgt40Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt40Counter != sharedCounter;
         localTgt40Counter = sharedCounter; return hasModified;
     }
	protected static final int TGT_40_LEN = 6;
	/**
	 * 	serialize this Tgt40
	 */
   protected void serializeTgt40(char[] tgt40) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tgt40,0,getStringValue(),beginTgt40,TGT_40_LEN);
       localTgt40Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTgt40Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshTgt40 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTgt40() {	 
   		return (substring(getStringValue(),beginTgt40,beginTgt40 + TGT_40_LEN));
   	}
         int localSrc41Counter = -1;
         public boolean isSrc41Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc41Counter != sharedCounter;
            localSrc41Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkSrc41MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
        int localTgt41Counter = -1;
        public boolean isTgt41Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTgt41Counter != sharedCounter;
           localTgt41Counter = sharedCounter; return hasModified; 
        }
	    public boolean tgt41IsNumeric() {
	      return decimalIsNumeric(beginTgt41,TGT_41_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tgt41String() {
            return getPackedString(beginTgt41,TGT_41_LEN);
         }
   protected static final int TGT_41_LEN = 5;
   protected static final int TGT_41_SCALE = 2;
  	/**
	 * 	serializeTgt41
	 */
	protected void serializeTgt41(BigDecimal tgt41) {
		   putDecimal(beginTgt41,tgt41,TGT_41_LEN,TGT_41_SCALE,false);
		 localTgt41Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTgt41MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }
     /**
	 *	refreshTgt41 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt41() throws CFException {	
   	try { 
		 return (getDecimal(beginTgt41,TGT_41_LEN,TGT_41_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("tgt41", beginTgt41,TGT_41_LEN);
     }
   	}
         int localSrc42Counter = -1;
         public boolean isSrc42Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc42Counter != sharedCounter;
            localSrc42Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkSrc42MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
        int localTgt42Counter = -1;
        public boolean isTgt42Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTgt42Counter != sharedCounter;
           localTgt42Counter = sharedCounter; return hasModified; 
        }
	    public boolean tgt42IsNumeric() {
	      return decimalIsNumeric(beginTgt42,TGT_42_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tgt42String() {
            return getPackedString(beginTgt42,TGT_42_LEN);
         }
   protected static final int TGT_42_LEN = 8;
   protected static final int TGT_42_SCALE = 4;
  	/**
	 * 	serializeTgt42
	 */
	protected void serializeTgt42(BigDecimal tgt42) {
		   putDecimal(beginTgt42,tgt42,TGT_42_LEN,TGT_42_SCALE,false);
		 localTgt42Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTgt42MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,14/*precision*/);
   }
     /**
	 *	refreshTgt42 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt42() throws CFException {	
   	try { 
		 return (getDecimal(beginTgt42,TGT_42_LEN,TGT_42_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("tgt42", beginTgt42,TGT_42_LEN);
     }
   	}
         int localSrc43Counter = -1;
         public boolean isSrc43Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc43Counter != sharedCounter;
            localSrc43Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkSrc43MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
        int localTgt43Counter = -1;
        public boolean isTgt43Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTgt43Counter != sharedCounter;
           localTgt43Counter = sharedCounter; return hasModified; 
        }
	    public boolean tgt43IsNumeric() {
	      return decimalIsNumeric(beginTgt43,TGT_43_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tgt43String() {
            return getPackedString(beginTgt43,TGT_43_LEN);
         }
   protected static final int TGT_43_LEN = 5;
   protected static final int TGT_43_SCALE = 2;
  	/**
	 * 	serializeTgt43
	 */
	protected void serializeTgt43(BigDecimal tgt43) {
		   putDecimal(beginTgt43,tgt43,TGT_43_LEN,TGT_43_SCALE,false);
		 localTgt43Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTgt43MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }
     /**
	 *	refreshTgt43 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt43() throws CFException {	
   	try { 
		 return (getDecimal(beginTgt43,TGT_43_LEN,TGT_43_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("tgt43", beginTgt43,TGT_43_LEN);
     }
   	}
         int localSrc44Counter = -1;
         public boolean isSrc44Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc44Counter != sharedCounter;
            localSrc44Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkSrc44MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
        int localTgt44Counter = -1;
        public boolean isTgt44Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTgt44Counter != sharedCounter;
           localTgt44Counter = sharedCounter; return hasModified; 
        }
	    public boolean tgt44IsNumeric() {
	      return decimalIsNumeric(beginTgt44,TGT_44_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tgt44String() {
            return getPackedString(beginTgt44,TGT_44_LEN);
         }
   protected static final int TGT_44_LEN = 8;
   protected static final int TGT_44_SCALE = 4;
  	/**
	 * 	serializeTgt44
	 */
	protected void serializeTgt44(BigDecimal tgt44) {
		   putDecimal(beginTgt44,tgt44,TGT_44_LEN,TGT_44_SCALE,false);
		 localTgt44Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTgt44MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,14/*precision*/);
   }
     /**
	 *	refreshTgt44 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt44() throws CFException {	
   	try { 
		 return (getDecimal(beginTgt44,TGT_44_LEN,TGT_44_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("tgt44", beginTgt44,TGT_44_LEN);
     }
   	}
         int localSrc45Counter = -1;
         public boolean isSrc45Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc45Counter != sharedCounter;
            localSrc45Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkSrc45MaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
        int localTgt45Counter = -1;
        public boolean isTgt45Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTgt45Counter != sharedCounter;
           localTgt45Counter = sharedCounter; return hasModified; 
        }
	    public boolean tgt45IsNumeric() {
	      return decimalIsNumeric(beginTgt45,TGT_45_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tgt45String() {
            return getPackedString(beginTgt45,TGT_45_LEN);
         }
   protected static final int TGT_45_LEN = 5;
   protected static final int TGT_45_SCALE = 2;
  	/**
	 * 	serializeTgt45
	 */
	protected void serializeTgt45(BigDecimal tgt45) {
		   putDecimal(beginTgt45,tgt45,TGT_45_LEN,TGT_45_SCALE,false);
		 localTgt45Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTgt45MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }
     /**
	 *	refreshTgt45 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt45() throws CFException {	
   	try { 
		 return (getDecimal(beginTgt45,TGT_45_LEN,TGT_45_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("tgt45", beginTgt45,TGT_45_LEN);
     }
   	}
         int localSrc46Counter = -1;
         public boolean isSrc46Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc46Counter != sharedCounter;
            localSrc46Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkSrc46MaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
        int localTgt46Counter = -1;
        public boolean isTgt46Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTgt46Counter != sharedCounter;
           localTgt46Counter = sharedCounter; return hasModified; 
        }
	    public boolean tgt46IsNumeric() {
	      return decimalIsNumeric(beginTgt46,TGT_46_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tgt46String() {
            return getPackedString(beginTgt46,TGT_46_LEN);
         }
   protected static final int TGT_46_LEN = 8;
   protected static final int TGT_46_SCALE = 4;
  	/**
	 * 	serializeTgt46
	 */
	protected void serializeTgt46(BigDecimal tgt46) {
		   putDecimal(beginTgt46,tgt46,TGT_46_LEN,TGT_46_SCALE,false);
		 localTgt46Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTgt46MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,14/*precision*/);
   }
     /**
	 *	refreshTgt46 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt46() throws CFException {	
   	try { 
		 return (getDecimal(beginTgt46,TGT_46_LEN,TGT_46_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("tgt46", beginTgt46,TGT_46_LEN);
     }
   	}
         int localSrc47Counter = -1;
         public boolean isSrc47Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc47Counter != sharedCounter;
            localSrc47Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSrc47MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
        int localTgt47Counter = -1;
        public boolean isTgt47Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTgt47Counter != sharedCounter;
           localTgt47Counter = sharedCounter; return hasModified; 
        }
	    public boolean tgt47IsNumeric() {
	      return decimalIsNumeric(beginTgt47,TGT_47_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tgt47String() {
            return getPackedString(beginTgt47,TGT_47_LEN);
         }
   protected static final int TGT_47_LEN = 5;
   protected static final int TGT_47_SCALE = 2;
  	/**
	 * 	serializeTgt47
	 */
	protected void serializeTgt47(BigDecimal tgt47) {
		   putDecimal(beginTgt47,tgt47,TGT_47_LEN,TGT_47_SCALE,false);
		 localTgt47Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTgt47MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }
     /**
	 *	refreshTgt47 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt47() throws CFException {	
   	try { 
		 return (getDecimal(beginTgt47,TGT_47_LEN,TGT_47_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("tgt47", beginTgt47,TGT_47_LEN);
     }
   	}
         int localSrc48Counter = -1;
         public boolean isSrc48Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc48Counter != sharedCounter;
            localSrc48Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSrc48MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
        int localTgt48Counter = -1;
        public boolean isTgt48Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTgt48Counter != sharedCounter;
           localTgt48Counter = sharedCounter; return hasModified; 
        }
	    public boolean tgt48IsNumeric() {
	      return decimalIsNumeric(beginTgt48,TGT_48_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tgt48String() {
            return getPackedString(beginTgt48,TGT_48_LEN);
         }
   protected static final int TGT_48_LEN = 8;
   protected static final int TGT_48_SCALE = 4;
  	/**
	 * 	serializeTgt48
	 */
	protected void serializeTgt48(BigDecimal tgt48) {
		   putDecimal(beginTgt48,tgt48,TGT_48_LEN,TGT_48_SCALE,false);
		 localTgt48Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTgt48MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,14/*precision*/);
   }
     /**
	 *	refreshTgt48 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt48() throws CFException {	
   	try { 
		 return (getDecimal(beginTgt48,TGT_48_LEN,TGT_48_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("tgt48", beginTgt48,TGT_48_LEN);
     }
   	}
        int localSrc49Counter = -1;
        public boolean isSrc49Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localSrc49Counter != sharedCounter;
           localSrc49Counter = sharedCounter; return hasModified; 
        }
	    public boolean src49IsNumeric() {
	      return decimalIsNumeric(beginSrc49,SRC_49_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] src49String() {
            return getPackedString(beginSrc49,SRC_49_LEN);
         }
   protected static final int SRC_49_LEN = 7;
   protected static final int SRC_49_SCALE = 3;
  	/**
	 * 	serializeSrc49
	 */
	protected void serializeSrc49(BigDecimal src49) {
		   putDecimal(beginSrc49,src49,SRC_49_LEN,SRC_49_SCALE,true);
		 localSrc49Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkSrc49MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,3/*scale*/,13/*precision*/);
   }
     /**
	 *	refreshSrc49 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc49() throws CFException {	
   	try { 
		 return (getDecimal(beginSrc49,SRC_49_LEN,SRC_49_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("src49", beginSrc49,SRC_49_LEN);
     }
   	}
        int localTgt49Counter = -1;
        public boolean isTgt49Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTgt49Counter != sharedCounter;
           localTgt49Counter = sharedCounter; return hasModified; 
        }
	    public boolean tgt49IsNumeric() {
	      return decimalIsNumeric(beginTgt49,TGT_49_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tgt49String() {
            return getPackedString(beginTgt49,TGT_49_LEN);
         }
   protected static final int TGT_49_LEN = 5;
   protected static final int TGT_49_SCALE = 2;
  	/**
	 * 	serializeTgt49
	 */
	protected void serializeTgt49(BigDecimal tgt49) {
		   putDecimal(beginTgt49,tgt49,TGT_49_LEN,TGT_49_SCALE,false);
		 localTgt49Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTgt49MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }
     /**
	 *	refreshTgt49 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt49() throws CFException {	
   	try { 
		 return (getDecimal(beginTgt49,TGT_49_LEN,TGT_49_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("tgt49", beginTgt49,TGT_49_LEN);
     }
   	}
        int localSrc50Counter = -1;
        public boolean isSrc50Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localSrc50Counter != sharedCounter;
           localSrc50Counter = sharedCounter; return hasModified; 
        }
	    public boolean src50IsNumeric() {
	      return decimalIsNumeric(beginSrc50,SRC_50_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] src50String() {
            return getPackedString(beginSrc50,SRC_50_LEN);
         }
   protected static final int SRC_50_LEN = 5;
   protected static final int SRC_50_SCALE = 2;
  	/**
	 * 	serializeSrc50
	 */
	protected void serializeSrc50(BigDecimal src50) {
		   putDecimal(beginSrc50,src50,SRC_50_LEN,SRC_50_SCALE,true);
		 localSrc50Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkSrc50MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }
     /**
	 *	refreshSrc50 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc50() throws CFException {	
   	try { 
		 return (getDecimal(beginSrc50,SRC_50_LEN,SRC_50_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("src50", beginSrc50,SRC_50_LEN);
     }
   	}
        int localTgt50Counter = -1;
        public boolean isTgt50Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTgt50Counter != sharedCounter;
           localTgt50Counter = sharedCounter; return hasModified; 
        }
	    public boolean tgt50IsNumeric() {
	      return decimalIsNumeric(beginTgt50,TGT_50_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tgt50String() {
            return getPackedString(beginTgt50,TGT_50_LEN);
         }
   protected static final int TGT_50_LEN = 8;
   protected static final int TGT_50_SCALE = 4;
  	/**
	 * 	serializeTgt50
	 */
	protected void serializeTgt50(BigDecimal tgt50) {
		   putDecimal(beginTgt50,tgt50,TGT_50_LEN,TGT_50_SCALE,false);
		 localTgt50Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTgt50MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,14/*precision*/);
   }
     /**
	 *	refreshTgt50 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt50() throws CFException {	
   	try { 
		 return (getDecimal(beginTgt50,TGT_50_LEN,TGT_50_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("tgt50", beginTgt50,TGT_50_LEN);
     }
   	}
     int localSrc51Counter = -1;
     
     public boolean isSrc51Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc51Counter != sharedCounter;
         localSrc51Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of src51
	 *	@return src51
	 */
	public char[]  getSrc51String() {
	    return getCharArray(beginSrc51,SRC_51_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src51IsNumeric() {
		    return isNumeric(beginSrc51
	                    ,beginSrc51 + SRC_51_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int SRC_51_LEN = 13;
  protected  static final int SRC_51_SCALE = 3;

   protected BigDecimal checkSrc51MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,3/*scale*/,13/*precision*/);
   }

  	/**
	 * serializeSrc51
	 */
	protected void serializeSrc51(BigDecimal src51) {
	       putNumber(beginSrc51,src51,SRC_51_LEN,SRC_51_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc51Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeSrc51
	 */
   	protected  BigDecimal serializeSrc51(char[] value) throws CFException {
        if (value.length < 13) value = pad(13, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(13,value,true/*isSigned?*/)
		       ,beginSrc51
		       ,13
		      );		 localSrc51Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,SRC_51_LEN,SRC_51_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("src51", beginSrc51,SRC_51_LEN);
    	}
    }
    /**
	 *	refreshSrc51 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc51() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginSrc51
			            ,SRC_51_LEN
			            ,SRC_51_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("src51", beginSrc51,SRC_51_LEN);
    }
   	}
        int localTgt51Counter = -1;
        public boolean isTgt51Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTgt51Counter != sharedCounter;
           localTgt51Counter = sharedCounter; return hasModified; 
        }
	    public boolean tgt51IsNumeric() {
	      return decimalIsNumeric(beginTgt51,TGT_51_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tgt51String() {
            return getPackedString(beginTgt51,TGT_51_LEN);
         }
   protected static final int TGT_51_LEN = 5;
   protected static final int TGT_51_SCALE = 2;
  	/**
	 * 	serializeTgt51
	 */
	protected void serializeTgt51(BigDecimal tgt51) {
		   putDecimal(beginTgt51,tgt51,TGT_51_LEN,TGT_51_SCALE,false);
		 localTgt51Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTgt51MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }
     /**
	 *	refreshTgt51 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt51() throws CFException {	
   	try { 
		 return (getDecimal(beginTgt51,TGT_51_LEN,TGT_51_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("tgt51", beginTgt51,TGT_51_LEN);
     }
   	}
     int localSrc52Counter = -1;
     
     public boolean isSrc52Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc52Counter != sharedCounter;
         localSrc52Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of src52
	 *	@return src52
	 */
	public char[]  getSrc52String() {
	    return getCharArray(beginSrc52,SRC_52_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src52IsNumeric() {
		    return isNumeric(beginSrc52
	                    ,beginSrc52 + SRC_52_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int SRC_52_LEN = 8;
  protected  static final int SRC_52_SCALE = 2;

   protected BigDecimal checkSrc52MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }

  	/**
	 * serializeSrc52
	 */
	protected void serializeSrc52(BigDecimal src52) {
	       putNumber(beginSrc52,src52,SRC_52_LEN,SRC_52_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc52Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeSrc52
	 */
   	protected  BigDecimal serializeSrc52(char[] value) throws CFException {
        if (value.length < 8) value = pad(8, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(8,value,true/*isSigned?*/)
		       ,beginSrc52
		       ,8
		      );		 localSrc52Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,SRC_52_LEN,SRC_52_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("src52", beginSrc52,SRC_52_LEN);
    	}
    }
    /**
	 *	refreshSrc52 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc52() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginSrc52
			            ,SRC_52_LEN
			            ,SRC_52_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("src52", beginSrc52,SRC_52_LEN);
    }
   	}
        int localTgt52Counter = -1;
        public boolean isTgt52Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTgt52Counter != sharedCounter;
           localTgt52Counter = sharedCounter; return hasModified; 
        }
	    public boolean tgt52IsNumeric() {
	      return decimalIsNumeric(beginTgt52,TGT_52_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tgt52String() {
            return getPackedString(beginTgt52,TGT_52_LEN);
         }
   protected static final int TGT_52_LEN = 8;
   protected static final int TGT_52_SCALE = 4;
  	/**
	 * 	serializeTgt52
	 */
	protected void serializeTgt52(BigDecimal tgt52) {
		   putDecimal(beginTgt52,tgt52,TGT_52_LEN,TGT_52_SCALE,false);
		 localTgt52Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTgt52MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,14/*precision*/);
   }
     /**
	 *	refreshTgt52 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt52() throws CFException {	
   	try { 
		 return (getDecimal(beginTgt52,TGT_52_LEN,TGT_52_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("tgt52", beginTgt52,TGT_52_LEN);
     }
   	}
     int localSrc53Counter = -1;
     
     public boolean isSrc53Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc53Counter != sharedCounter;
         localSrc53Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of src53
	 *	@return src53
	 */
	public char[]  getSrc53String() {
	    return getCharArray(beginSrc53,SRC_53_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src53IsNumeric() {
		    return isNumeric(beginSrc53
	                    ,beginSrc53 + SRC_53_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int SRC_53_LEN = 13;
  protected  static final int SRC_53_SCALE = 3;

   protected BigDecimal checkSrc53MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,3/*scale*/,13/*precision*/);
   }

  	/**
	 * serializeSrc53
	 */
	protected void serializeSrc53(BigDecimal src53) {
	       putNumber(beginSrc53,src53,SRC_53_LEN,SRC_53_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc53Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeSrc53
	 */
   	protected  BigDecimal serializeSrc53(char[] value) throws CFException {
        if (value.length < 13) value = pad(13, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(13,value,false/*isSigned?*/)
		       ,beginSrc53
		       ,13
		      );		 localSrc53Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,SRC_53_LEN,SRC_53_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("src53", beginSrc53,SRC_53_LEN);
    	}
    }
    /**
	 *	refreshSrc53 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc53() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginSrc53
			            ,SRC_53_LEN
			            ,SRC_53_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("src53", beginSrc53,SRC_53_LEN);
    }
   	}
        int localTgt53Counter = -1;
        public boolean isTgt53Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTgt53Counter != sharedCounter;
           localTgt53Counter = sharedCounter; return hasModified; 
        }
	    public boolean tgt53IsNumeric() {
	      return decimalIsNumeric(beginTgt53,TGT_53_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tgt53String() {
            return getPackedString(beginTgt53,TGT_53_LEN);
         }
   protected static final int TGT_53_LEN = 5;
   protected static final int TGT_53_SCALE = 2;
  	/**
	 * 	serializeTgt53
	 */
	protected void serializeTgt53(BigDecimal tgt53) {
		   putDecimal(beginTgt53,tgt53,TGT_53_LEN,TGT_53_SCALE,true);
		 localTgt53Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTgt53MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }
     /**
	 *	refreshTgt53 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt53() throws CFException {	
   	try { 
		 return (getDecimal(beginTgt53,TGT_53_LEN,TGT_53_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("tgt53", beginTgt53,TGT_53_LEN);
     }
   	}
     int localSrc54Counter = -1;
     
     public boolean isSrc54Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc54Counter != sharedCounter;
         localSrc54Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of src54
	 *	@return src54
	 */
	public char[]  getSrc54String() {
	    return getCharArray(beginSrc54,SRC_54_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src54IsNumeric() {
		    return isNumeric(beginSrc54
	                    ,beginSrc54 + SRC_54_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int SRC_54_LEN = 8;
  protected  static final int SRC_54_SCALE = 2;

   protected BigDecimal checkSrc54MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }

  	/**
	 * serializeSrc54
	 */
	protected void serializeSrc54(BigDecimal src54) {
	       putNumber(beginSrc54,src54,SRC_54_LEN,SRC_54_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc54Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeSrc54
	 */
   	protected  BigDecimal serializeSrc54(char[] value) throws CFException {
        if (value.length < 8) value = pad(8, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginSrc54
		       ,8
		      );		 localSrc54Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,SRC_54_LEN,SRC_54_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("src54", beginSrc54,SRC_54_LEN);
    	}
    }
    /**
	 *	refreshSrc54 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc54() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginSrc54
			            ,SRC_54_LEN
			            ,SRC_54_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("src54", beginSrc54,SRC_54_LEN);
    }
   	}
        int localTgt54Counter = -1;
        public boolean isTgt54Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTgt54Counter != sharedCounter;
           localTgt54Counter = sharedCounter; return hasModified; 
        }
	    public boolean tgt54IsNumeric() {
	      return decimalIsNumeric(beginTgt54,TGT_54_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tgt54String() {
            return getPackedString(beginTgt54,TGT_54_LEN);
         }
   protected static final int TGT_54_LEN = 8;
   protected static final int TGT_54_SCALE = 4;
  	/**
	 * 	serializeTgt54
	 */
	protected void serializeTgt54(BigDecimal tgt54) {
		   putDecimal(beginTgt54,tgt54,TGT_54_LEN,TGT_54_SCALE,true);
		 localTgt54Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTgt54MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,14/*precision*/);
   }
     /**
	 *	refreshTgt54 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt54() throws CFException {	
   	try { 
		 return (getDecimal(beginTgt54,TGT_54_LEN,TGT_54_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("tgt54", beginTgt54,TGT_54_LEN);
     }
   	}
     int localSrc55Counter = -1;
     
     public boolean isSrc55Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc55Counter != sharedCounter;
         localSrc55Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of src55
	 *	@return src55
	 */
	public char[]  getSrc55String() {
	    return getCharArray(beginSrc55,SRC_55_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src55IsNumeric() {
		    return isNumeric(beginSrc55
	                    ,beginSrc55 + SRC_55_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int SRC_55_LEN = 13;
  protected  static final int SRC_55_SCALE = 3;

   protected BigDecimal checkSrc55MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,3/*scale*/,13/*precision*/);
   }

  	/**
	 * serializeSrc55
	 */
	protected void serializeSrc55(BigDecimal src55) {
	       putNumber(beginSrc55,src55,SRC_55_LEN,SRC_55_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc55Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeSrc55
	 */
   	protected  BigDecimal serializeSrc55(char[] value) throws CFException {
        if (value.length < 13) value = pad(13, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(13,value,false/*isSigned?*/)
		       ,beginSrc55
		       ,13
		      );		 localSrc55Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,SRC_55_LEN,SRC_55_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("src55", beginSrc55,SRC_55_LEN);
    	}
    }
    /**
	 *	refreshSrc55 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc55() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginSrc55
			            ,SRC_55_LEN
			            ,SRC_55_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("src55", beginSrc55,SRC_55_LEN);
    }
   	}
        int localTgt55Counter = -1;
        public boolean isTgt55Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTgt55Counter != sharedCounter;
           localTgt55Counter = sharedCounter; return hasModified; 
        }
	    public boolean tgt55IsNumeric() {
	      return decimalIsNumeric(beginTgt55,TGT_55_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tgt55String() {
            return getPackedString(beginTgt55,TGT_55_LEN);
         }
   protected static final int TGT_55_LEN = 5;
   protected static final int TGT_55_SCALE = 2;
  	/**
	 * 	serializeTgt55
	 */
	protected void serializeTgt55(BigDecimal tgt55) {
		   putDecimal(beginTgt55,tgt55,TGT_55_LEN,TGT_55_SCALE,false);
		 localTgt55Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTgt55MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }
     /**
	 *	refreshTgt55 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt55() throws CFException {	
   	try { 
		 return (getDecimal(beginTgt55,TGT_55_LEN,TGT_55_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("tgt55", beginTgt55,TGT_55_LEN);
     }
   	}
     int localSrc56Counter = -1;
     
     public boolean isSrc56Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc56Counter != sharedCounter;
         localSrc56Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of src56
	 *	@return src56
	 */
	public char[]  getSrc56String() {
	    return getCharArray(beginSrc56,SRC_56_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src56IsNumeric() {
		    return isNumeric(beginSrc56
	                    ,beginSrc56 + SRC_56_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int SRC_56_LEN = 8;
  protected  static final int SRC_56_SCALE = 2;

   protected BigDecimal checkSrc56MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }

  	/**
	 * serializeSrc56
	 */
	protected void serializeSrc56(BigDecimal src56) {
	       putNumber(beginSrc56,src56,SRC_56_LEN,SRC_56_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc56Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeSrc56
	 */
   	protected  BigDecimal serializeSrc56(char[] value) throws CFException {
        if (value.length < 8) value = pad(8, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginSrc56
		       ,8
		      );		 localSrc56Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,SRC_56_LEN,SRC_56_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("src56", beginSrc56,SRC_56_LEN);
    	}
    }
    /**
	 *	refreshSrc56 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc56() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginSrc56
			            ,SRC_56_LEN
			            ,SRC_56_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("src56", beginSrc56,SRC_56_LEN);
    }
   	}
        int localTgt56Counter = -1;
        public boolean isTgt56Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTgt56Counter != sharedCounter;
           localTgt56Counter = sharedCounter; return hasModified; 
        }
	    public boolean tgt56IsNumeric() {
	      return decimalIsNumeric(beginTgt56,TGT_56_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tgt56String() {
            return getPackedString(beginTgt56,TGT_56_LEN);
         }
   protected static final int TGT_56_LEN = 8;
   protected static final int TGT_56_SCALE = 4;
  	/**
	 * 	serializeTgt56
	 */
	protected void serializeTgt56(BigDecimal tgt56) {
		   putDecimal(beginTgt56,tgt56,TGT_56_LEN,TGT_56_SCALE,false);
		 localTgt56Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTgt56MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,14/*precision*/);
   }
     /**
	 *	refreshTgt56 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt56() throws CFException {	
   	try { 
		 return (getDecimal(beginTgt56,TGT_56_LEN,TGT_56_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("tgt56", beginTgt56,TGT_56_LEN);
     }
   	}
        int localSrc57Counter = -1;
        public boolean isSrc57Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localSrc57Counter != sharedCounter;
           localSrc57Counter = sharedCounter; return hasModified; 
        }
	    public boolean src57IsNumeric() {
	      return decimalIsNumeric(beginSrc57,SRC_57_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] src57String() {
            return getPackedString(beginSrc57,SRC_57_LEN);
         }
   protected static final int SRC_57_LEN = 7;
   protected static final int SRC_57_SCALE = 3;
  	/**
	 * 	serializeSrc57
	 */
	protected void serializeSrc57(BigDecimal src57) {
		   putDecimal(beginSrc57,src57,SRC_57_LEN,SRC_57_SCALE,true);
		 localSrc57Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkSrc57MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,3/*scale*/,13/*precision*/);
   }
     /**
	 *	refreshSrc57 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc57() throws CFException {	
   	try { 
		 return (getDecimal(beginSrc57,SRC_57_LEN,SRC_57_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("src57", beginSrc57,SRC_57_LEN);
     }
   	}
     int localTgt57Counter = -1;
     
     public boolean isTgt57Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt57Counter != sharedCounter;
         localTgt57Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of tgt57
	 *	@return tgt57
	 */
	public char[]  getTgt57String() {
	    return getCharArray(beginTgt57,TGT_57_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt57IsNumeric() {
		    return isNumeric(beginTgt57
	                    ,beginTgt57 + TGT_57_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int TGT_57_LEN = 8;
  protected  static final int TGT_57_SCALE = 2;

   protected BigDecimal checkTgt57MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }

  	/**
	 * serializeTgt57
	 */
	protected void serializeTgt57(BigDecimal tgt57) {
	       putNumber(beginTgt57,tgt57,TGT_57_LEN,TGT_57_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt57Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeTgt57
	 */
   	protected  BigDecimal serializeTgt57(char[] value) throws CFException {
        if (value.length < 8) value = pad(8, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginTgt57
		       ,8
		      );		 localTgt57Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,TGT_57_LEN,TGT_57_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("tgt57", beginTgt57,TGT_57_LEN);
    	}
    }
    /**
	 *	refreshTgt57 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt57() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginTgt57
			            ,TGT_57_LEN
			            ,TGT_57_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt57", beginTgt57,TGT_57_LEN);
    }
   	}
        int localSrc58Counter = -1;
        public boolean isSrc58Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localSrc58Counter != sharedCounter;
           localSrc58Counter = sharedCounter; return hasModified; 
        }
	    public boolean src58IsNumeric() {
	      return decimalIsNumeric(beginSrc58,SRC_58_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] src58String() {
            return getPackedString(beginSrc58,SRC_58_LEN);
         }
   protected static final int SRC_58_LEN = 5;
   protected static final int SRC_58_SCALE = 2;
  	/**
	 * 	serializeSrc58
	 */
	protected void serializeSrc58(BigDecimal src58) {
		   putDecimal(beginSrc58,src58,SRC_58_LEN,SRC_58_SCALE,true);
		 localSrc58Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkSrc58MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }
     /**
	 *	refreshSrc58 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc58() throws CFException {	
   	try { 
		 return (getDecimal(beginSrc58,SRC_58_LEN,SRC_58_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("src58", beginSrc58,SRC_58_LEN);
     }
   	}
     int localTgt58Counter = -1;
     
     public boolean isTgt58Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt58Counter != sharedCounter;
         localTgt58Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of tgt58
	 *	@return tgt58
	 */
	public char[]  getTgt58String() {
	    return getCharArray(beginTgt58,TGT_58_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt58IsNumeric() {
		    return isNumeric(beginTgt58
	                    ,beginTgt58 + TGT_58_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int TGT_58_LEN = 14;
  protected  static final int TGT_58_SCALE = 4;

   protected BigDecimal checkTgt58MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,4/*scale*/,14/*precision*/);
   }

  	/**
	 * serializeTgt58
	 */
	protected void serializeTgt58(BigDecimal tgt58) {
	       putNumber(beginTgt58,tgt58,TGT_58_LEN,TGT_58_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt58Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeTgt58
	 */
   	protected  BigDecimal serializeTgt58(char[] value) throws CFException {
        if (value.length < 14) value = pad(14, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(14,value,false/*isSigned?*/)
		       ,beginTgt58
		       ,14
		      );		 localTgt58Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,TGT_58_LEN,TGT_58_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("tgt58", beginTgt58,TGT_58_LEN);
    	}
    }
    /**
	 *	refreshTgt58 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt58() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginTgt58
			            ,TGT_58_LEN
			            ,TGT_58_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt58", beginTgt58,TGT_58_LEN);
    }
   	}
        int localSrc59Counter = -1;
        public boolean isSrc59Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localSrc59Counter != sharedCounter;
           localSrc59Counter = sharedCounter; return hasModified; 
        }
	    public boolean src59IsNumeric() {
	      return decimalIsNumeric(beginSrc59,SRC_59_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] src59String() {
            return getPackedString(beginSrc59,SRC_59_LEN);
         }
   protected static final int SRC_59_LEN = 7;
   protected static final int SRC_59_SCALE = 3;
  	/**
	 * 	serializeSrc59
	 */
	protected void serializeSrc59(BigDecimal src59) {
		   putDecimal(beginSrc59,src59,SRC_59_LEN,SRC_59_SCALE,false);
		 localSrc59Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkSrc59MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,3/*scale*/,13/*precision*/);
   }
     /**
	 *	refreshSrc59 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc59() throws CFException {	
   	try { 
		 return (getDecimal(beginSrc59,SRC_59_LEN,SRC_59_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("src59", beginSrc59,SRC_59_LEN);
     }
   	}
     int localTgt59Counter = -1;
     
     public boolean isTgt59Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt59Counter != sharedCounter;
         localTgt59Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of tgt59
	 *	@return tgt59
	 */
	public char[]  getTgt59String() {
	    return getCharArray(beginTgt59,TGT_59_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt59IsNumeric() {
		    return isNumeric(beginTgt59
	                    ,beginTgt59 + TGT_59_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int TGT_59_LEN = 8;
  protected  static final int TGT_59_SCALE = 2;

   protected BigDecimal checkTgt59MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }

  	/**
	 * serializeTgt59
	 */
	protected void serializeTgt59(BigDecimal tgt59) {
	       putNumber(beginTgt59,tgt59,TGT_59_LEN,TGT_59_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt59Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeTgt59
	 */
   	protected  BigDecimal serializeTgt59(char[] value) throws CFException {
        if (value.length < 8) value = pad(8, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(8,value,true/*isSigned?*/)
		       ,beginTgt59
		       ,8
		      );		 localTgt59Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,TGT_59_LEN,TGT_59_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("tgt59", beginTgt59,TGT_59_LEN);
    	}
    }
    /**
	 *	refreshTgt59 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt59() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginTgt59
			            ,TGT_59_LEN
			            ,TGT_59_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt59", beginTgt59,TGT_59_LEN);
    }
   	}
        int localSrc60Counter = -1;
        public boolean isSrc60Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localSrc60Counter != sharedCounter;
           localSrc60Counter = sharedCounter; return hasModified; 
        }
	    public boolean src60IsNumeric() {
	      return decimalIsNumeric(beginSrc60,SRC_60_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] src60String() {
            return getPackedString(beginSrc60,SRC_60_LEN);
         }
   protected static final int SRC_60_LEN = 5;
   protected static final int SRC_60_SCALE = 2;
  	/**
	 * 	serializeSrc60
	 */
	protected void serializeSrc60(BigDecimal src60) {
		   putDecimal(beginSrc60,src60,SRC_60_LEN,SRC_60_SCALE,false);
		 localSrc60Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkSrc60MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }
     /**
	 *	refreshSrc60 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc60() throws CFException {	
   	try { 
		 return (getDecimal(beginSrc60,SRC_60_LEN,SRC_60_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("src60", beginSrc60,SRC_60_LEN);
     }
   	}
     int localTgt60Counter = -1;
     
     public boolean isTgt60Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt60Counter != sharedCounter;
         localTgt60Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of tgt60
	 *	@return tgt60
	 */
	public char[]  getTgt60String() {
	    return getCharArray(beginTgt60,TGT_60_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt60IsNumeric() {
		    return isNumeric(beginTgt60
	                    ,beginTgt60 + TGT_60_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int TGT_60_LEN = 14;
  protected  static final int TGT_60_SCALE = 4;

   protected BigDecimal checkTgt60MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,4/*scale*/,14/*precision*/);
   }

  	/**
	 * serializeTgt60
	 */
	protected void serializeTgt60(BigDecimal tgt60) {
	       putNumber(beginTgt60,tgt60,TGT_60_LEN,TGT_60_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt60Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeTgt60
	 */
   	protected  BigDecimal serializeTgt60(char[] value) throws CFException {
        if (value.length < 14) value = pad(14, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(14,value,true/*isSigned?*/)
		       ,beginTgt60
		       ,14
		      );		 localTgt60Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,TGT_60_LEN,TGT_60_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("tgt60", beginTgt60,TGT_60_LEN);
    	}
    }
    /**
	 *	refreshTgt60 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt60() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginTgt60
			            ,TGT_60_LEN
			            ,TGT_60_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt60", beginTgt60,TGT_60_LEN);
    }
   	}
        int localSrc61Counter = -1;
        public boolean isSrc61Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localSrc61Counter != sharedCounter;
           localSrc61Counter = sharedCounter; return hasModified; 
        }
	    public boolean src61IsNumeric() {
	      return decimalIsNumeric(beginSrc61,SRC_61_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] src61String() {
            return getPackedString(beginSrc61,SRC_61_LEN);
         }
   protected static final int SRC_61_LEN = 7;
   protected static final int SRC_61_SCALE = 3;
  	/**
	 * 	serializeSrc61
	 */
	protected void serializeSrc61(BigDecimal src61) {
		   putDecimal(beginSrc61,src61,SRC_61_LEN,SRC_61_SCALE,false);
		 localSrc61Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkSrc61MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,3/*scale*/,13/*precision*/);
   }
     /**
	 *	refreshSrc61 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc61() throws CFException {	
   	try { 
		 return (getDecimal(beginSrc61,SRC_61_LEN,SRC_61_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("src61", beginSrc61,SRC_61_LEN);
     }
   	}
     int localTgt61Counter = -1;
     
     public boolean isTgt61Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt61Counter != sharedCounter;
         localTgt61Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of tgt61
	 *	@return tgt61
	 */
	public char[]  getTgt61String() {
	    return getCharArray(beginTgt61,TGT_61_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt61IsNumeric() {
		    return isNumeric(beginTgt61
	                    ,beginTgt61 + TGT_61_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int TGT_61_LEN = 8;
  protected  static final int TGT_61_SCALE = 2;

   protected BigDecimal checkTgt61MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }

  	/**
	 * serializeTgt61
	 */
	protected void serializeTgt61(BigDecimal tgt61) {
	       putNumber(beginTgt61,tgt61,TGT_61_LEN,TGT_61_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt61Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeTgt61
	 */
   	protected  BigDecimal serializeTgt61(char[] value) throws CFException {
        if (value.length < 8) value = pad(8, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginTgt61
		       ,8
		      );		 localTgt61Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,TGT_61_LEN,TGT_61_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("tgt61", beginTgt61,TGT_61_LEN);
    	}
    }
    /**
	 *	refreshTgt61 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt61() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginTgt61
			            ,TGT_61_LEN
			            ,TGT_61_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt61", beginTgt61,TGT_61_LEN);
    }
   	}
        int localSrc62Counter = -1;
        public boolean isSrc62Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localSrc62Counter != sharedCounter;
           localSrc62Counter = sharedCounter; return hasModified; 
        }
	    public boolean src62IsNumeric() {
	      return decimalIsNumeric(beginSrc62,SRC_62_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] src62String() {
            return getPackedString(beginSrc62,SRC_62_LEN);
         }
   protected static final int SRC_62_LEN = 5;
   protected static final int SRC_62_SCALE = 2;
  	/**
	 * 	serializeSrc62
	 */
	protected void serializeSrc62(BigDecimal src62) {
		   putDecimal(beginSrc62,src62,SRC_62_LEN,SRC_62_SCALE,false);
		 localSrc62Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkSrc62MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }
     /**
	 *	refreshSrc62 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc62() throws CFException {	
   	try { 
		 return (getDecimal(beginSrc62,SRC_62_LEN,SRC_62_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("src62", beginSrc62,SRC_62_LEN);
     }
   	}
     int localTgt62Counter = -1;
     
     public boolean isTgt62Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt62Counter != sharedCounter;
         localTgt62Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of tgt62
	 *	@return tgt62
	 */
	public char[]  getTgt62String() {
	    return getCharArray(beginTgt62,TGT_62_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt62IsNumeric() {
		    return isNumeric(beginTgt62
	                    ,beginTgt62 + TGT_62_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int TGT_62_LEN = 14;
  protected  static final int TGT_62_SCALE = 4;

   protected BigDecimal checkTgt62MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,4/*scale*/,14/*precision*/);
   }

  	/**
	 * serializeTgt62
	 */
	protected void serializeTgt62(BigDecimal tgt62) {
	       putNumber(beginTgt62,tgt62,TGT_62_LEN,TGT_62_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt62Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeTgt62
	 */
   	protected  BigDecimal serializeTgt62(char[] value) throws CFException {
        if (value.length < 14) value = pad(14, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(14,value,false/*isSigned?*/)
		       ,beginTgt62
		       ,14
		      );		 localTgt62Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,TGT_62_LEN,TGT_62_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("tgt62", beginTgt62,TGT_62_LEN);
    	}
    }
    /**
	 *	refreshTgt62 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt62() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginTgt62
			            ,TGT_62_LEN
			            ,TGT_62_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt62", beginTgt62,TGT_62_LEN);
    }
   	}
     int localSrc63Counter = -1;
     
     public boolean isSrc63Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc63Counter != sharedCounter;
         localSrc63Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of src63
	 *	@return src63
	 */
	public char[]  getSrc63String() {
	    return getCharArray(beginSrc63,SRC_63_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src63IsNumeric() {
		    return isNumeric(beginSrc63
	                    ,beginSrc63 + SRC_63_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int SRC_63_LEN = 13;
  protected  static final int SRC_63_SCALE = 3;

   protected BigDecimal checkSrc63MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,3/*scale*/,13/*precision*/);
   }

  	/**
	 * serializeSrc63
	 */
	protected void serializeSrc63(BigDecimal src63) {
	       putNumber(beginSrc63,src63,SRC_63_LEN,SRC_63_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc63Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeSrc63
	 */
   	protected  BigDecimal serializeSrc63(char[] value) throws CFException {
        if (value.length < 13) value = pad(13, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(13,value,true/*isSigned?*/)
		       ,beginSrc63
		       ,13
		      );		 localSrc63Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,SRC_63_LEN,SRC_63_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("src63", beginSrc63,SRC_63_LEN);
    	}
    }
    /**
	 *	refreshSrc63 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc63() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginSrc63
			            ,SRC_63_LEN
			            ,SRC_63_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("src63", beginSrc63,SRC_63_LEN);
    }
   	}
     int localTgt63Counter = -1;
     
     public boolean isTgt63Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt63Counter != sharedCounter;
         localTgt63Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of tgt63
	 *	@return tgt63
	 */
	public char[]  getTgt63String() {
	    return getCharArray(beginTgt63,TGT_63_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt63IsNumeric() {
		    return isNumeric(beginTgt63
	                    ,beginTgt63 + TGT_63_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int TGT_63_LEN = 8;
  protected  static final int TGT_63_SCALE = 2;

   protected BigDecimal checkTgt63MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }

  	/**
	 * serializeTgt63
	 */
	protected void serializeTgt63(BigDecimal tgt63) {
	       putNumber(beginTgt63,tgt63,TGT_63_LEN,TGT_63_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt63Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeTgt63
	 */
   	protected  BigDecimal serializeTgt63(char[] value) throws CFException {
        if (value.length < 8) value = pad(8, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginTgt63
		       ,8
		      );		 localTgt63Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,TGT_63_LEN,TGT_63_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("tgt63", beginTgt63,TGT_63_LEN);
    	}
    }
    /**
	 *	refreshTgt63 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt63() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginTgt63
			            ,TGT_63_LEN
			            ,TGT_63_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt63", beginTgt63,TGT_63_LEN);
    }
   	}
     int localSrc64Counter = -1;
     
     public boolean isSrc64Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc64Counter != sharedCounter;
         localSrc64Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of src64
	 *	@return src64
	 */
	public char[]  getSrc64String() {
	    return getCharArray(beginSrc64,SRC_64_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src64IsNumeric() {
		    return isNumeric(beginSrc64
	                    ,beginSrc64 + SRC_64_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int SRC_64_LEN = 8;
  protected  static final int SRC_64_SCALE = 2;

   protected BigDecimal checkSrc64MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }

  	/**
	 * serializeSrc64
	 */
	protected void serializeSrc64(BigDecimal src64) {
	       putNumber(beginSrc64,src64,SRC_64_LEN,SRC_64_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc64Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeSrc64
	 */
   	protected  BigDecimal serializeSrc64(char[] value) throws CFException {
        if (value.length < 8) value = pad(8, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(8,value,true/*isSigned?*/)
		       ,beginSrc64
		       ,8
		      );		 localSrc64Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,SRC_64_LEN,SRC_64_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("src64", beginSrc64,SRC_64_LEN);
    	}
    }
    /**
	 *	refreshSrc64 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc64() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginSrc64
			            ,SRC_64_LEN
			            ,SRC_64_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("src64", beginSrc64,SRC_64_LEN);
    }
   	}
     int localTgt64Counter = -1;
     
     public boolean isTgt64Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt64Counter != sharedCounter;
         localTgt64Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of tgt64
	 *	@return tgt64
	 */
	public char[]  getTgt64String() {
	    return getCharArray(beginTgt64,TGT_64_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt64IsNumeric() {
		    return isNumeric(beginTgt64
	                    ,beginTgt64 + TGT_64_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int TGT_64_LEN = 14;
  protected  static final int TGT_64_SCALE = 4;

   protected BigDecimal checkTgt64MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,4/*scale*/,14/*precision*/);
   }

  	/**
	 * serializeTgt64
	 */
	protected void serializeTgt64(BigDecimal tgt64) {
	       putNumber(beginTgt64,tgt64,TGT_64_LEN,TGT_64_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt64Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeTgt64
	 */
   	protected  BigDecimal serializeTgt64(char[] value) throws CFException {
        if (value.length < 14) value = pad(14, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(14,value,false/*isSigned?*/)
		       ,beginTgt64
		       ,14
		      );		 localTgt64Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,TGT_64_LEN,TGT_64_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("tgt64", beginTgt64,TGT_64_LEN);
    	}
    }
    /**
	 *	refreshTgt64 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt64() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginTgt64
			            ,TGT_64_LEN
			            ,TGT_64_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt64", beginTgt64,TGT_64_LEN);
    }
   	}
     int localSrc65Counter = -1;
     
     public boolean isSrc65Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc65Counter != sharedCounter;
         localSrc65Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of src65
	 *	@return src65
	 */
	public char[]  getSrc65String() {
	    return getCharArray(beginSrc65,SRC_65_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src65IsNumeric() {
		    return isNumeric(beginSrc65
	                    ,beginSrc65 + SRC_65_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int SRC_65_LEN = 13;
  protected  static final int SRC_65_SCALE = 3;

   protected BigDecimal checkSrc65MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,3/*scale*/,13/*precision*/);
   }

  	/**
	 * serializeSrc65
	 */
	protected void serializeSrc65(BigDecimal src65) {
	       putNumber(beginSrc65,src65,SRC_65_LEN,SRC_65_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc65Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeSrc65
	 */
   	protected  BigDecimal serializeSrc65(char[] value) throws CFException {
        if (value.length < 13) value = pad(13, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(13,value,false/*isSigned?*/)
		       ,beginSrc65
		       ,13
		      );		 localSrc65Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,SRC_65_LEN,SRC_65_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("src65", beginSrc65,SRC_65_LEN);
    	}
    }
    /**
	 *	refreshSrc65 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc65() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginSrc65
			            ,SRC_65_LEN
			            ,SRC_65_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("src65", beginSrc65,SRC_65_LEN);
    }
   	}
     int localTgt65Counter = -1;
     
     public boolean isTgt65Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt65Counter != sharedCounter;
         localTgt65Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of tgt65
	 *	@return tgt65
	 */
	public char[]  getTgt65String() {
	    return getCharArray(beginTgt65,TGT_65_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt65IsNumeric() {
		    return isNumeric(beginTgt65
	                    ,beginTgt65 + TGT_65_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int TGT_65_LEN = 8;
  protected  static final int TGT_65_SCALE = 2;

   protected BigDecimal checkTgt65MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }

  	/**
	 * serializeTgt65
	 */
	protected void serializeTgt65(BigDecimal tgt65) {
	       putNumber(beginTgt65,tgt65,TGT_65_LEN,TGT_65_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt65Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeTgt65
	 */
   	protected  BigDecimal serializeTgt65(char[] value) throws CFException {
        if (value.length < 8) value = pad(8, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(8,value,true/*isSigned?*/)
		       ,beginTgt65
		       ,8
		      );		 localTgt65Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,TGT_65_LEN,TGT_65_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("tgt65", beginTgt65,TGT_65_LEN);
    	}
    }
    /**
	 *	refreshTgt65 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt65() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginTgt65
			            ,TGT_65_LEN
			            ,TGT_65_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt65", beginTgt65,TGT_65_LEN);
    }
   	}
     int localSrc66Counter = -1;
     
     public boolean isSrc66Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc66Counter != sharedCounter;
         localSrc66Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of src66
	 *	@return src66
	 */
	public char[]  getSrc66String() {
	    return getCharArray(beginSrc66,SRC_66_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src66IsNumeric() {
		    return isNumeric(beginSrc66
	                    ,beginSrc66 + SRC_66_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int SRC_66_LEN = 8;
  protected  static final int SRC_66_SCALE = 2;

   protected BigDecimal checkSrc66MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }

  	/**
	 * serializeSrc66
	 */
	protected void serializeSrc66(BigDecimal src66) {
	       putNumber(beginSrc66,src66,SRC_66_LEN,SRC_66_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc66Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeSrc66
	 */
   	protected  BigDecimal serializeSrc66(char[] value) throws CFException {
        if (value.length < 8) value = pad(8, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginSrc66
		       ,8
		      );		 localSrc66Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,SRC_66_LEN,SRC_66_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("src66", beginSrc66,SRC_66_LEN);
    	}
    }
    /**
	 *	refreshSrc66 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc66() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginSrc66
			            ,SRC_66_LEN
			            ,SRC_66_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("src66", beginSrc66,SRC_66_LEN);
    }
   	}
     int localTgt66Counter = -1;
     
     public boolean isTgt66Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt66Counter != sharedCounter;
         localTgt66Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of tgt66
	 *	@return tgt66
	 */
	public char[]  getTgt66String() {
	    return getCharArray(beginTgt66,TGT_66_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt66IsNumeric() {
		    return isNumeric(beginTgt66
	                    ,beginTgt66 + TGT_66_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int TGT_66_LEN = 14;
  protected  static final int TGT_66_SCALE = 4;

   protected BigDecimal checkTgt66MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,4/*scale*/,14/*precision*/);
   }

  	/**
	 * serializeTgt66
	 */
	protected void serializeTgt66(BigDecimal tgt66) {
	       putNumber(beginTgt66,tgt66,TGT_66_LEN,TGT_66_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt66Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeTgt66
	 */
   	protected  BigDecimal serializeTgt66(char[] value) throws CFException {
        if (value.length < 14) value = pad(14, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(14,value,true/*isSigned?*/)
		       ,beginTgt66
		       ,14
		      );		 localTgt66Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,TGT_66_LEN,TGT_66_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("tgt66", beginTgt66,TGT_66_LEN);
    	}
    }
    /**
	 *	refreshTgt66 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt66() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginTgt66
			            ,TGT_66_LEN
			            ,TGT_66_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt66", beginTgt66,TGT_66_LEN);
    }
   	}
     int localSrc67Counter = -1;
     
     public boolean isSrc67Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc67Counter != sharedCounter;
         localSrc67Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of src67
	 *	@return src67
	 */
	public char[]  getSrc67String() {
	    return getCharArray(beginSrc67,SRC_67_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src67IsNumeric() {
		    return isNumeric(beginSrc67
	                    ,beginSrc67 + SRC_67_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int SRC_67_LEN = 13;
  protected  static final int SRC_67_SCALE = 3;

   protected BigDecimal checkSrc67MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,3/*scale*/,13/*precision*/);
   }

  	/**
	 * serializeSrc67
	 */
	protected void serializeSrc67(BigDecimal src67) {
	       putNumber(beginSrc67,src67,SRC_67_LEN,SRC_67_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc67Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeSrc67
	 */
   	protected  BigDecimal serializeSrc67(char[] value) throws CFException {
        if (value.length < 13) value = pad(13, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(13,value,false/*isSigned?*/)
		       ,beginSrc67
		       ,13
		      );		 localSrc67Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,SRC_67_LEN,SRC_67_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("src67", beginSrc67,SRC_67_LEN);
    	}
    }
    /**
	 *	refreshSrc67 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc67() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginSrc67
			            ,SRC_67_LEN
			            ,SRC_67_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("src67", beginSrc67,SRC_67_LEN);
    }
   	}
     int localTgt67Counter = -1;
     
     public boolean isTgt67Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt67Counter != sharedCounter;
         localTgt67Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of tgt67
	 *	@return tgt67
	 */
	public char[]  getTgt67String() {
	    return getCharArray(beginTgt67,TGT_67_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt67IsNumeric() {
		    return isNumeric(beginTgt67
	                    ,beginTgt67 + TGT_67_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int TGT_67_LEN = 8;
  protected  static final int TGT_67_SCALE = 2;

   protected BigDecimal checkTgt67MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }

  	/**
	 * serializeTgt67
	 */
	protected void serializeTgt67(BigDecimal tgt67) {
	       putNumber(beginTgt67,tgt67,TGT_67_LEN,TGT_67_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt67Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeTgt67
	 */
   	protected  BigDecimal serializeTgt67(char[] value) throws CFException {
        if (value.length < 8) value = pad(8, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginTgt67
		       ,8
		      );		 localTgt67Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,TGT_67_LEN,TGT_67_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("tgt67", beginTgt67,TGT_67_LEN);
    	}
    }
    /**
	 *	refreshTgt67 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt67() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginTgt67
			            ,TGT_67_LEN
			            ,TGT_67_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt67", beginTgt67,TGT_67_LEN);
    }
   	}
     int localSrc68Counter = -1;
     
     public boolean isSrc68Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc68Counter != sharedCounter;
         localSrc68Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of src68
	 *	@return src68
	 */
	public char[]  getSrc68String() {
	    return getCharArray(beginSrc68,SRC_68_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src68IsNumeric() {
		    return isNumeric(beginSrc68
	                    ,beginSrc68 + SRC_68_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int SRC_68_LEN = 8;
  protected  static final int SRC_68_SCALE = 2;

   protected BigDecimal checkSrc68MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }

  	/**
	 * serializeSrc68
	 */
	protected void serializeSrc68(BigDecimal src68) {
	       putNumber(beginSrc68,src68,SRC_68_LEN,SRC_68_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc68Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeSrc68
	 */
   	protected  BigDecimal serializeSrc68(char[] value) throws CFException {
        if (value.length < 8) value = pad(8, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginSrc68
		       ,8
		      );		 localSrc68Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,SRC_68_LEN,SRC_68_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("src68", beginSrc68,SRC_68_LEN);
    	}
    }
    /**
	 *	refreshSrc68 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc68() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginSrc68
			            ,SRC_68_LEN
			            ,SRC_68_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("src68", beginSrc68,SRC_68_LEN);
    }
   	}
     int localTgt68Counter = -1;
     
     public boolean isTgt68Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt68Counter != sharedCounter;
         localTgt68Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of tgt68
	 *	@return tgt68
	 */
	public char[]  getTgt68String() {
	    return getCharArray(beginTgt68,TGT_68_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt68IsNumeric() {
		    return isNumeric(beginTgt68
	                    ,beginTgt68 + TGT_68_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int TGT_68_LEN = 14;
  protected  static final int TGT_68_SCALE = 4;

   protected BigDecimal checkTgt68MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,4/*scale*/,14/*precision*/);
   }

  	/**
	 * serializeTgt68
	 */
	protected void serializeTgt68(BigDecimal tgt68) {
	       putNumber(beginTgt68,tgt68,TGT_68_LEN,TGT_68_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt68Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeTgt68
	 */
   	protected  BigDecimal serializeTgt68(char[] value) throws CFException {
        if (value.length < 14) value = pad(14, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(14,value,false/*isSigned?*/)
		       ,beginTgt68
		       ,14
		      );		 localTgt68Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,TGT_68_LEN,TGT_68_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("tgt68", beginTgt68,TGT_68_LEN);
    	}
    }
    /**
	 *	refreshTgt68 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt68() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginTgt68
			            ,TGT_68_LEN
			            ,TGT_68_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt68", beginTgt68,TGT_68_LEN);
    }
   	}
         int localSrc69Counter = -1;
         public boolean isSrc69Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc69Counter != sharedCounter;
            localSrc69Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkSrc69MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     int localTgt69Counter = -1;
     public boolean isTgt69Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt69Counter != sharedCounter;
         localTgt69Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tgt69
	 *	@return tgt69
	 */
	public char[]  getTgt69String() {
	     return getCharArray(beginTgt69,TGT_69_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt69IsNumeric() {
	    return isNumeric(beginTgt69
	                    ,beginTgt69 + TGT_69_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TGT_69_LEN = 10;
  	/**
	 * serializeTgt69
	 */
	protected void serializeTgt69(long tgt69) {
		 putNumber(beginTgt69,tgt69,TGT_69_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt69Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTgt69
	 */
   	protected  long serializeTgt69(char[] value) {
	    long  tgt69;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tgt69 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginTgt69
		       ,10
		      );
		 localTgt69Counter = shareString.getSerializedField().getModifiedCounter();
		return  tgt69;
    }

   protected long checkTgt69MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTgt69 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTgt69() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTgt69
			                 ,TGT_69_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt69", beginTgt69,TGT_69_LEN);
    }
   	}
         int localSrc70Counter = -1;
         public boolean isSrc70Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc70Counter != sharedCounter;
            localSrc70Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSrc70MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
     int localTgt70Counter = -1;
     public boolean isTgt70Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt70Counter != sharedCounter;
         localTgt70Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tgt70
	 *	@return tgt70
	 */
	public char[]  getTgt70String() {
	     return getCharArray(beginTgt70,TGT_70_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt70IsNumeric() {
	    return isNumeric(beginTgt70
	                    ,beginTgt70 + TGT_70_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TGT_70_LEN = 10;
  	/**
	 * serializeTgt70
	 */
	protected void serializeTgt70(long tgt70) {
		 putNumber(beginTgt70,tgt70,TGT_70_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt70Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTgt70
	 */
   	protected  long serializeTgt70(char[] value) {
	    long  tgt70;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tgt70 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginTgt70
		       ,10
		      );
		 localTgt70Counter = shareString.getSerializedField().getModifiedCounter();
		return  tgt70;
    }

   protected long checkTgt70MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTgt70 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTgt70() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTgt70
			                 ,TGT_70_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt70", beginTgt70,TGT_70_LEN);
    }
   	}
         int localSrc71Counter = -1;
         public boolean isSrc71Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc71Counter != sharedCounter;
            localSrc71Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSrc71MaxLimit(long number) {
        return checkMaxLimit(number, true/*isSigned*/,8/*dataLen*/);
   }
     int localTgt71Counter = -1;
     public boolean isTgt71Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt71Counter != sharedCounter;
         localTgt71Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tgt71
	 *	@return tgt71
	 */
	public char[]  getTgt71String() {
	     return getCharArray(beginTgt71,TGT_71_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt71IsNumeric() {
	    return isNumeric(beginTgt71
	                    ,beginTgt71 + TGT_71_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TGT_71_LEN = 10;
  	/**
	 * serializeTgt71
	 */
	protected void serializeTgt71(long tgt71) {
		 putNumber(beginTgt71,tgt71,TGT_71_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt71Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTgt71
	 */
   	protected  long serializeTgt71(char[] value) {
	    long  tgt71;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tgt71 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginTgt71
		       ,10
		      );
		 localTgt71Counter = shareString.getSerializedField().getModifiedCounter();
		return  tgt71;
    }

   protected long checkTgt71MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTgt71 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTgt71() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTgt71
			                 ,TGT_71_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt71", beginTgt71,TGT_71_LEN);
    }
   	}
         int localSrc72Counter = -1;
         public boolean isSrc72Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc72Counter != sharedCounter;
            localSrc72Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSrc72MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,8/*dataLen*/);
   }
     int localTgt72Counter = -1;
     public boolean isTgt72Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt72Counter != sharedCounter;
         localTgt72Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tgt72
	 *	@return tgt72
	 */
	public char[]  getTgt72String() {
	     return getCharArray(beginTgt72,TGT_72_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt72IsNumeric() {
	    return isNumeric(beginTgt72
	                    ,beginTgt72 + TGT_72_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TGT_72_LEN = 10;
  	/**
	 * serializeTgt72
	 */
	protected void serializeTgt72(long tgt72) {
		 putNumber(beginTgt72,tgt72,TGT_72_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt72Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTgt72
	 */
   	protected  long serializeTgt72(char[] value) {
	    long  tgt72;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tgt72 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginTgt72
		       ,10
		      );
		 localTgt72Counter = shareString.getSerializedField().getModifiedCounter();
		return  tgt72;
    }

   protected long checkTgt72MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTgt72 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTgt72() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTgt72
			                 ,TGT_72_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt72", beginTgt72,TGT_72_LEN);
    }
   	}
         int localSrc73Counter = -1;
         public boolean isSrc73Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc73Counter != sharedCounter;
            localSrc73Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkSrc73MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     int localTgt73Counter = -1;
     public boolean isTgt73Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt73Counter != sharedCounter;
         localTgt73Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tgt73
	 *	@return tgt73
	 */
	public char[]  getTgt73String() {
	     return getCharArray(beginTgt73,TGT_73_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt73IsNumeric() {
	    return isNumeric(beginTgt73
	                    ,beginTgt73 + TGT_73_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TGT_73_LEN = 10;
  	/**
	 * serializeTgt73
	 */
	protected void serializeTgt73(long tgt73) {
		 putNumber(beginTgt73,tgt73,TGT_73_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt73Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTgt73
	 */
   	protected  long serializeTgt73(char[] value) {
	    long  tgt73;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tgt73 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginTgt73
		       ,10
		      );
		 localTgt73Counter = shareString.getSerializedField().getModifiedCounter();
		return  tgt73;
    }

   protected long checkTgt73MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTgt73 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTgt73() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTgt73
			                 ,TGT_73_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt73", beginTgt73,TGT_73_LEN);
    }
   	}
         int localSrc74Counter = -1;
         public boolean isSrc74Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc74Counter != sharedCounter;
            localSrc74Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkSrc74MaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     int localTgt74Counter = -1;
     public boolean isTgt74Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt74Counter != sharedCounter;
         localTgt74Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tgt74
	 *	@return tgt74
	 */
	public char[]  getTgt74String() {
	     return getCharArray(beginTgt74,TGT_74_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt74IsNumeric() {
	    return isNumeric(beginTgt74
	                    ,beginTgt74 + TGT_74_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TGT_74_LEN = 10;
  	/**
	 * serializeTgt74
	 */
	protected void serializeTgt74(long tgt74) {
		 putNumber(beginTgt74,tgt74,TGT_74_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt74Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTgt74
	 */
   	protected  long serializeTgt74(char[] value) {
	    long  tgt74;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tgt74 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginTgt74
		       ,10
		      );
		 localTgt74Counter = shareString.getSerializedField().getModifiedCounter();
		return  tgt74;
    }

   protected long checkTgt74MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTgt74 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTgt74() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTgt74
			                 ,TGT_74_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt74", beginTgt74,TGT_74_LEN);
    }
   	}
     int localSrc75Counter = -1;
     public boolean isSrc75Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc75Counter != sharedCounter;
         localSrc75Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of src75
	 *	@return src75
	 */
	public char[]  getSrc75String() {
	     return getCharArray(beginSrc75,SRC_75_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src75IsNumeric() {
	    return isNumeric(beginSrc75
	                    ,beginSrc75 + SRC_75_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SRC_75_LEN = 6;
  	/**
	 * serializeSrc75
	 */
	protected void serializeSrc75(long src75) {
		 putNumber(beginSrc75,src75,SRC_75_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc75Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSrc75
	 */
   	protected  long serializeSrc75(char[] value) {
	    long  src75;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    src75 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginSrc75
		       ,6
		      );
		 localSrc75Counter = shareString.getSerializedField().getModifiedCounter();
		return  src75;
    }

   protected long checkSrc75MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSrc75 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSrc75() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSrc75
			                 ,SRC_75_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("src75", beginSrc75,SRC_75_LEN);
    }
   	}
     int localTgt75Counter = -1;
     public boolean isTgt75Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt75Counter != sharedCounter;
         localTgt75Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tgt75
	 *	@return tgt75
	 */
	public char[]  getTgt75String() {
	     return getCharArray(beginTgt75,TGT_75_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt75IsNumeric() {
	    return isNumeric(beginTgt75
	                    ,beginTgt75 + TGT_75_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TGT_75_LEN = 10;
  	/**
	 * serializeTgt75
	 */
	protected void serializeTgt75(long tgt75) {
		 putNumber(beginTgt75,tgt75,TGT_75_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt75Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTgt75
	 */
   	protected  long serializeTgt75(char[] value) {
	    long  tgt75;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tgt75 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginTgt75
		       ,10
		      );
		 localTgt75Counter = shareString.getSerializedField().getModifiedCounter();
		return  tgt75;
    }

   protected long checkTgt75MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTgt75 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTgt75() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTgt75
			                 ,TGT_75_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt75", beginTgt75,TGT_75_LEN);
    }
   	}
     int localSrc76Counter = -1;
     public boolean isSrc76Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc76Counter != sharedCounter;
         localSrc76Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of src76
	 *	@return src76
	 */
	public char[]  getSrc76String() {
	     return getCharArray(beginSrc76,SRC_76_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src76IsNumeric() {
	    return isNumeric(beginSrc76
	                    ,beginSrc76 + SRC_76_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SRC_76_LEN = 6;
  	/**
	 * serializeSrc76
	 */
	protected void serializeSrc76(int src76) {
		 putNumber(beginSrc76,src76,SRC_76_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc76Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSrc76
	 */
   	protected  int serializeSrc76(char[] value) {
	    int  src76;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    src76 = (int) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,true/*isSigned?*/)
		       ,beginSrc76
		       ,6
		      );
		 localSrc76Counter = shareString.getSerializedField().getModifiedCounter();
		return  src76;
    }

   protected int checkSrc76MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1M/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshSrc76 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSrc76() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginSrc76
			                 ,SRC_76_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("src76", beginSrc76,SRC_76_LEN);
    }
   	}
     int localTgt76Counter = -1;
     public boolean isTgt76Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt76Counter != sharedCounter;
         localTgt76Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tgt76
	 *	@return tgt76
	 */
	public char[]  getTgt76String() {
	     return getCharArray(beginTgt76,TGT_76_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt76IsNumeric() {
	    return isNumeric(beginTgt76
	                    ,beginTgt76 + TGT_76_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TGT_76_LEN = 10;
  	/**
	 * serializeTgt76
	 */
	protected void serializeTgt76(long tgt76) {
		 putNumber(beginTgt76,tgt76,TGT_76_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt76Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTgt76
	 */
   	protected  long serializeTgt76(char[] value) {
	    long  tgt76;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tgt76 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginTgt76
		       ,10
		      );
		 localTgt76Counter = shareString.getSerializedField().getModifiedCounter();
		return  tgt76;
    }

   protected long checkTgt76MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTgt76 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTgt76() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTgt76
			                 ,TGT_76_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt76", beginTgt76,TGT_76_LEN);
    }
   	}
     int localSrc77Counter = -1;
     public boolean isSrc77Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc77Counter != sharedCounter;
         localSrc77Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of src77
	 *	@return src77
	 */
	public char[]  getSrc77String() {
	     return getCharArray(beginSrc77,SRC_77_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src77IsNumeric() {
	    return isNumeric(beginSrc77
	                    ,beginSrc77 + SRC_77_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SRC_77_LEN = 10;
  	/**
	 * serializeSrc77
	 */
	protected void serializeSrc77(long src77) {
		 putNumber(beginSrc77,src77,SRC_77_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc77Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSrc77
	 */
   	protected  long serializeSrc77(char[] value) {
	    long  src77;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    src77 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginSrc77
		       ,10
		      );
		 localSrc77Counter = shareString.getSerializedField().getModifiedCounter();
		return  src77;
    }

   protected long checkSrc77MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSrc77 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSrc77() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSrc77
			                 ,SRC_77_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("src77", beginSrc77,SRC_77_LEN);
    }
   	}
         int localTgt77Counter = -1;
         public boolean isTgt77Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt77Counter != sharedCounter;
            localTgt77Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkTgt77MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     int localSrc78Counter = -1;
     public boolean isSrc78Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc78Counter != sharedCounter;
         localSrc78Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of src78
	 *	@return src78
	 */
	public char[]  getSrc78String() {
	     return getCharArray(beginSrc78,SRC_78_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src78IsNumeric() {
	    return isNumeric(beginSrc78
	                    ,beginSrc78 + SRC_78_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SRC_78_LEN = 10;
  	/**
	 * serializeSrc78
	 */
	protected void serializeSrc78(long src78) {
		 putNumber(beginSrc78,src78,SRC_78_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc78Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSrc78
	 */
   	protected  long serializeSrc78(char[] value) {
	    long  src78;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    src78 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginSrc78
		       ,10
		      );
		 localSrc78Counter = shareString.getSerializedField().getModifiedCounter();
		return  src78;
    }

   protected long checkSrc78MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSrc78 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSrc78() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSrc78
			                 ,SRC_78_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("src78", beginSrc78,SRC_78_LEN);
    }
   	}
         int localTgt78Counter = -1;
         public boolean isTgt78Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt78Counter != sharedCounter;
            localTgt78Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkTgt78MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
     int localSrc79Counter = -1;
     public boolean isSrc79Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc79Counter != sharedCounter;
         localSrc79Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of src79
	 *	@return src79
	 */
	public char[]  getSrc79String() {
	     return getCharArray(beginSrc79,SRC_79_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src79IsNumeric() {
	    return isNumeric(beginSrc79
	                    ,beginSrc79 + SRC_79_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SRC_79_LEN = 10;
  	/**
	 * serializeSrc79
	 */
	protected void serializeSrc79(long src79) {
		 putNumber(beginSrc79,src79,SRC_79_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc79Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSrc79
	 */
   	protected  long serializeSrc79(char[] value) {
	    long  src79;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    src79 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginSrc79
		       ,10
		      );
		 localSrc79Counter = shareString.getSerializedField().getModifiedCounter();
		return  src79;
    }

   protected long checkSrc79MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSrc79 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSrc79() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSrc79
			                 ,SRC_79_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("src79", beginSrc79,SRC_79_LEN);
    }
   	}
         int localTgt79Counter = -1;
         public boolean isTgt79Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt79Counter != sharedCounter;
            localTgt79Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkTgt79MaxLimit(long number) {
        return checkMaxLimit(number, true/*isSigned*/,8/*dataLen*/);
   }
     int localSrc80Counter = -1;
     public boolean isSrc80Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc80Counter != sharedCounter;
         localSrc80Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of src80
	 *	@return src80
	 */
	public char[]  getSrc80String() {
	     return getCharArray(beginSrc80,SRC_80_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src80IsNumeric() {
	    return isNumeric(beginSrc80
	                    ,beginSrc80 + SRC_80_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SRC_80_LEN = 10;
  	/**
	 * serializeSrc80
	 */
	protected void serializeSrc80(long src80) {
		 putNumber(beginSrc80,src80,SRC_80_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc80Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSrc80
	 */
   	protected  long serializeSrc80(char[] value) {
	    long  src80;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    src80 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginSrc80
		       ,10
		      );
		 localSrc80Counter = shareString.getSerializedField().getModifiedCounter();
		return  src80;
    }

   protected long checkSrc80MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSrc80 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSrc80() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSrc80
			                 ,SRC_80_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("src80", beginSrc80,SRC_80_LEN);
    }
   	}
         int localTgt80Counter = -1;
         public boolean isTgt80Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt80Counter != sharedCounter;
            localTgt80Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkTgt80MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,8/*dataLen*/);
   }
     int localSrc81Counter = -1;
     public boolean isSrc81Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc81Counter != sharedCounter;
         localSrc81Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of src81
	 *	@return src81
	 */
	public char[]  getSrc81String() {
	     return getCharArray(beginSrc81,SRC_81_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src81IsNumeric() {
	    return isNumeric(beginSrc81
	                    ,beginSrc81 + SRC_81_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SRC_81_LEN = 10;
  	/**
	 * serializeSrc81
	 */
	protected void serializeSrc81(long src81) {
		 putNumber(beginSrc81,src81,SRC_81_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc81Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSrc81
	 */
   	protected  long serializeSrc81(char[] value) {
	    long  src81;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    src81 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginSrc81
		       ,10
		      );
		 localSrc81Counter = shareString.getSerializedField().getModifiedCounter();
		return  src81;
    }

   protected long checkSrc81MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSrc81 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSrc81() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSrc81
			                 ,SRC_81_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("src81", beginSrc81,SRC_81_LEN);
    }
   	}
         int localTgt81Counter = -1;
         public boolean isTgt81Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt81Counter != sharedCounter;
            localTgt81Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkTgt81MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     int localSrc82Counter = -1;
     public boolean isSrc82Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc82Counter != sharedCounter;
         localSrc82Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of src82
	 *	@return src82
	 */
	public char[]  getSrc82String() {
	     return getCharArray(beginSrc82,SRC_82_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src82IsNumeric() {
	    return isNumeric(beginSrc82
	                    ,beginSrc82 + SRC_82_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SRC_82_LEN = 10;
  	/**
	 * serializeSrc82
	 */
	protected void serializeSrc82(long src82) {
		 putNumber(beginSrc82,src82,SRC_82_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc82Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSrc82
	 */
   	protected  long serializeSrc82(char[] value) {
	    long  src82;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    src82 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginSrc82
		       ,10
		      );
		 localSrc82Counter = shareString.getSerializedField().getModifiedCounter();
		return  src82;
    }

   protected long checkSrc82MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSrc82 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSrc82() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSrc82
			                 ,SRC_82_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("src82", beginSrc82,SRC_82_LEN);
    }
   	}
         int localTgt82Counter = -1;
         public boolean isTgt82Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt82Counter != sharedCounter;
            localTgt82Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkTgt82MaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     int localSrc83Counter = -1;
     public boolean isSrc83Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc83Counter != sharedCounter;
         localSrc83Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of src83
	 *	@return src83
	 */
	public char[]  getSrc83String() {
	     return getCharArray(beginSrc83,SRC_83_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src83IsNumeric() {
	    return isNumeric(beginSrc83
	                    ,beginSrc83 + SRC_83_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SRC_83_LEN = 10;
  	/**
	 * serializeSrc83
	 */
	protected void serializeSrc83(long src83) {
		 putNumber(beginSrc83,src83,SRC_83_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc83Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSrc83
	 */
   	protected  long serializeSrc83(char[] value) {
	    long  src83;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    src83 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginSrc83
		       ,10
		      );
		 localSrc83Counter = shareString.getSerializedField().getModifiedCounter();
		return  src83;
    }

   protected long checkSrc83MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSrc83 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSrc83() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSrc83
			                 ,SRC_83_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("src83", beginSrc83,SRC_83_LEN);
    }
   	}
     int localTgt83Counter = -1;
     public boolean isTgt83Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt83Counter != sharedCounter;
         localTgt83Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tgt83
	 *	@return tgt83
	 */
	public char[]  getTgt83String() {
	     return getCharArray(beginTgt83,TGT_83_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt83IsNumeric() {
	    return isNumeric(beginTgt83
	                    ,beginTgt83 + TGT_83_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TGT_83_LEN = 6;
  	/**
	 * serializeTgt83
	 */
	protected void serializeTgt83(long tgt83) {
		 putNumber(beginTgt83,tgt83,TGT_83_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt83Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTgt83
	 */
   	protected  long serializeTgt83(char[] value) {
	    long  tgt83;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tgt83 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginTgt83
		       ,6
		      );
		 localTgt83Counter = shareString.getSerializedField().getModifiedCounter();
		return  tgt83;
    }

   protected long checkTgt83MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTgt83 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTgt83() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTgt83
			                 ,TGT_83_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt83", beginTgt83,TGT_83_LEN);
    }
   	}
     int localSrc84Counter = -1;
     public boolean isSrc84Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc84Counter != sharedCounter;
         localSrc84Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of src84
	 *	@return src84
	 */
	public char[]  getSrc84String() {
	     return getCharArray(beginSrc84,SRC_84_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src84IsNumeric() {
	    return isNumeric(beginSrc84
	                    ,beginSrc84 + SRC_84_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SRC_84_LEN = 10;
  	/**
	 * serializeSrc84
	 */
	protected void serializeSrc84(long src84) {
		 putNumber(beginSrc84,src84,SRC_84_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc84Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSrc84
	 */
   	protected  long serializeSrc84(char[] value) {
	    long  src84;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    src84 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginSrc84
		       ,10
		      );
		 localSrc84Counter = shareString.getSerializedField().getModifiedCounter();
		return  src84;
    }

   protected long checkSrc84MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSrc84 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSrc84() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSrc84
			                 ,SRC_84_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("src84", beginSrc84,SRC_84_LEN);
    }
   	}
     int localTgt84Counter = -1;
     public boolean isTgt84Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt84Counter != sharedCounter;
         localTgt84Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tgt84
	 *	@return tgt84
	 */
	public char[]  getTgt84String() {
	     return getCharArray(beginTgt84,TGT_84_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt84IsNumeric() {
	    return isNumeric(beginTgt84
	                    ,beginTgt84 + TGT_84_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TGT_84_LEN = 6;
  	/**
	 * serializeTgt84
	 */
	protected void serializeTgt84(int tgt84) {
		 putNumber(beginTgt84,tgt84,TGT_84_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt84Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTgt84
	 */
   	protected  int serializeTgt84(char[] value) {
	    int  tgt84;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tgt84 = (int) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,true/*isSigned?*/)
		       ,beginTgt84
		       ,6
		      );
		 localTgt84Counter = shareString.getSerializedField().getModifiedCounter();
		return  tgt84;
    }

   protected int checkTgt84MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1M/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshTgt84 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTgt84() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginTgt84
			                 ,TGT_84_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt84", beginTgt84,TGT_84_LEN);
    }
   	}
     int localSrc85Counter = -1;
     public boolean isSrc85Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc85Counter != sharedCounter;
         localSrc85Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of src85
	 *	@return src85
	 */
	public char[]  getSrc85String() {
	     return getCharArray(beginSrc85,SRC_85_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src85IsNumeric() {
	    return isNumeric(beginSrc85
	                    ,beginSrc85 + SRC_85_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SRC_85_LEN = 10;
  	/**
	 * serializeSrc85
	 */
	protected void serializeSrc85(long src85) {
		 putNumber(beginSrc85,src85,SRC_85_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc85Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSrc85
	 */
   	protected  long serializeSrc85(char[] value) {
	    long  src85;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    src85 = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,true/*isSigned?*/)
		       ,beginSrc85
		       ,10
		      );
		 localSrc85Counter = shareString.getSerializedField().getModifiedCounter();
		return  src85;
    }

   protected long checkSrc85MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshSrc85 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSrc85() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSrc85
			                 ,SRC_85_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("src85", beginSrc85,SRC_85_LEN);
    }
   	}
         int localTgt85Counter = -1;
         public boolean isTgt85Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt85Counter != sharedCounter;
            localTgt85Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkTgt85MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     int localSrc86Counter = -1;
     public boolean isSrc86Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc86Counter != sharedCounter;
         localSrc86Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of src86
	 *	@return src86
	 */
	public char[]  getSrc86String() {
	     return getCharArray(beginSrc86,SRC_86_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src86IsNumeric() {
	    return isNumeric(beginSrc86
	                    ,beginSrc86 + SRC_86_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SRC_86_LEN = 10;
  	/**
	 * serializeSrc86
	 */
	protected void serializeSrc86(long src86) {
		 putNumber(beginSrc86,src86,SRC_86_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc86Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSrc86
	 */
   	protected  long serializeSrc86(char[] value) {
	    long  src86;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    src86 = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,true/*isSigned?*/)
		       ,beginSrc86
		       ,10
		      );
		 localSrc86Counter = shareString.getSerializedField().getModifiedCounter();
		return  src86;
    }

   protected long checkSrc86MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshSrc86 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSrc86() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSrc86
			                 ,SRC_86_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("src86", beginSrc86,SRC_86_LEN);
    }
   	}
         int localTgt86Counter = -1;
         public boolean isTgt86Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt86Counter != sharedCounter;
            localTgt86Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkTgt86MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
     int localSrc87Counter = -1;
     public boolean isSrc87Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc87Counter != sharedCounter;
         localSrc87Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of src87
	 *	@return src87
	 */
	public char[]  getSrc87String() {
	     return getCharArray(beginSrc87,SRC_87_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src87IsNumeric() {
	    return isNumeric(beginSrc87
	                    ,beginSrc87 + SRC_87_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SRC_87_LEN = 10;
  	/**
	 * serializeSrc87
	 */
	protected void serializeSrc87(long src87) {
		 putNumber(beginSrc87,src87,SRC_87_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc87Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSrc87
	 */
   	protected  long serializeSrc87(char[] value) {
	    long  src87;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    src87 = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,true/*isSigned?*/)
		       ,beginSrc87
		       ,10
		      );
		 localSrc87Counter = shareString.getSerializedField().getModifiedCounter();
		return  src87;
    }

   protected long checkSrc87MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshSrc87 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSrc87() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSrc87
			                 ,SRC_87_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("src87", beginSrc87,SRC_87_LEN);
    }
   	}
         int localTgt87Counter = -1;
         public boolean isTgt87Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt87Counter != sharedCounter;
            localTgt87Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkTgt87MaxLimit(long number) {
        return checkMaxLimit(number, true/*isSigned*/,8/*dataLen*/);
   }
     int localSrc88Counter = -1;
     public boolean isSrc88Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc88Counter != sharedCounter;
         localSrc88Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of src88
	 *	@return src88
	 */
	public char[]  getSrc88String() {
	     return getCharArray(beginSrc88,SRC_88_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src88IsNumeric() {
	    return isNumeric(beginSrc88
	                    ,beginSrc88 + SRC_88_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SRC_88_LEN = 10;
  	/**
	 * serializeSrc88
	 */
	protected void serializeSrc88(long src88) {
		 putNumber(beginSrc88,src88,SRC_88_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc88Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSrc88
	 */
   	protected  long serializeSrc88(char[] value) {
	    long  src88;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    src88 = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,true/*isSigned?*/)
		       ,beginSrc88
		       ,10
		      );
		 localSrc88Counter = shareString.getSerializedField().getModifiedCounter();
		return  src88;
    }

   protected long checkSrc88MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshSrc88 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSrc88() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSrc88
			                 ,SRC_88_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("src88", beginSrc88,SRC_88_LEN);
    }
   	}
         int localTgt88Counter = -1;
         public boolean isTgt88Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt88Counter != sharedCounter;
            localTgt88Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkTgt88MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,8/*dataLen*/);
   }
     int localSrc89Counter = -1;
     public boolean isSrc89Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc89Counter != sharedCounter;
         localSrc89Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of src89
	 *	@return src89
	 */
	public char[]  getSrc89String() {
	     return getCharArray(beginSrc89,SRC_89_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src89IsNumeric() {
	    return isNumeric(beginSrc89
	                    ,beginSrc89 + SRC_89_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SRC_89_LEN = 10;
  	/**
	 * serializeSrc89
	 */
	protected void serializeSrc89(long src89) {
		 putNumber(beginSrc89,src89,SRC_89_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc89Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSrc89
	 */
   	protected  long serializeSrc89(char[] value) {
	    long  src89;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    src89 = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,true/*isSigned?*/)
		       ,beginSrc89
		       ,10
		      );
		 localSrc89Counter = shareString.getSerializedField().getModifiedCounter();
		return  src89;
    }

   protected long checkSrc89MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshSrc89 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSrc89() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSrc89
			                 ,SRC_89_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("src89", beginSrc89,SRC_89_LEN);
    }
   	}
         int localTgt89Counter = -1;
         public boolean isTgt89Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt89Counter != sharedCounter;
            localTgt89Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkTgt89MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     int localSrc90Counter = -1;
     public boolean isSrc90Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc90Counter != sharedCounter;
         localSrc90Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of src90
	 *	@return src90
	 */
	public char[]  getSrc90String() {
	     return getCharArray(beginSrc90,SRC_90_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src90IsNumeric() {
	    return isNumeric(beginSrc90
	                    ,beginSrc90 + SRC_90_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SRC_90_LEN = 10;
  	/**
	 * serializeSrc90
	 */
	protected void serializeSrc90(long src90) {
		 putNumber(beginSrc90,src90,SRC_90_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc90Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSrc90
	 */
   	protected  long serializeSrc90(char[] value) {
	    long  src90;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    src90 = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,true/*isSigned?*/)
		       ,beginSrc90
		       ,10
		      );
		 localSrc90Counter = shareString.getSerializedField().getModifiedCounter();
		return  src90;
    }

   protected long checkSrc90MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshSrc90 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSrc90() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSrc90
			                 ,SRC_90_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("src90", beginSrc90,SRC_90_LEN);
    }
   	}
         int localTgt90Counter = -1;
         public boolean isTgt90Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt90Counter != sharedCounter;
            localTgt90Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkTgt90MaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     int localSrc91Counter = -1;
     public boolean isSrc91Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc91Counter != sharedCounter;
         localSrc91Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of src91
	 *	@return src91
	 */
	public char[]  getSrc91String() {
	     return getCharArray(beginSrc91,SRC_91_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src91IsNumeric() {
	    return isNumeric(beginSrc91
	                    ,beginSrc91 + SRC_91_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SRC_91_LEN = 10;
  	/**
	 * serializeSrc91
	 */
	protected void serializeSrc91(long src91) {
		 putNumber(beginSrc91,src91,SRC_91_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc91Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSrc91
	 */
   	protected  long serializeSrc91(char[] value) {
	    long  src91;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    src91 = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,true/*isSigned?*/)
		       ,beginSrc91
		       ,10
		      );
		 localSrc91Counter = shareString.getSerializedField().getModifiedCounter();
		return  src91;
    }

   protected long checkSrc91MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshSrc91 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSrc91() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSrc91
			                 ,SRC_91_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("src91", beginSrc91,SRC_91_LEN);
    }
   	}
     int localTgt91Counter = -1;
     public boolean isTgt91Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt91Counter != sharedCounter;
         localTgt91Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tgt91
	 *	@return tgt91
	 */
	public char[]  getTgt91String() {
	     return getCharArray(beginTgt91,TGT_91_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt91IsNumeric() {
	    return isNumeric(beginTgt91
	                    ,beginTgt91 + TGT_91_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TGT_91_LEN = 6;
  	/**
	 * serializeTgt91
	 */
	protected void serializeTgt91(long tgt91) {
		 putNumber(beginTgt91,tgt91,TGT_91_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt91Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTgt91
	 */
   	protected  long serializeTgt91(char[] value) {
	    long  tgt91;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tgt91 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginTgt91
		       ,6
		      );
		 localTgt91Counter = shareString.getSerializedField().getModifiedCounter();
		return  tgt91;
    }

   protected long checkTgt91MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTgt91 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTgt91() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTgt91
			                 ,TGT_91_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt91", beginTgt91,TGT_91_LEN);
    }
   	}
     int localSrc92Counter = -1;
     public boolean isSrc92Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc92Counter != sharedCounter;
         localSrc92Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of src92
	 *	@return src92
	 */
	public char[]  getSrc92String() {
	     return getCharArray(beginSrc92,SRC_92_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src92IsNumeric() {
	    return isNumeric(beginSrc92
	                    ,beginSrc92 + SRC_92_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SRC_92_LEN = 10;
  	/**
	 * serializeSrc92
	 */
	protected void serializeSrc92(long src92) {
		 putNumber(beginSrc92,src92,SRC_92_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc92Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSrc92
	 */
   	protected  long serializeSrc92(char[] value) {
	    long  src92;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    src92 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginSrc92
		       ,10
		      );
		 localSrc92Counter = shareString.getSerializedField().getModifiedCounter();
		return  src92;
    }

   protected long checkSrc92MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSrc92 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSrc92() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSrc92
			                 ,SRC_92_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("src92", beginSrc92,SRC_92_LEN);
    }
   	}
     int localTgt92Counter = -1;
     public boolean isTgt92Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt92Counter != sharedCounter;
         localTgt92Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tgt92
	 *	@return tgt92
	 */
	public char[]  getTgt92String() {
	     return getCharArray(beginTgt92,TGT_92_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt92IsNumeric() {
	    return isNumeric(beginTgt92
	                    ,beginTgt92 + TGT_92_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TGT_92_LEN = 6;
  	/**
	 * serializeTgt92
	 */
	protected void serializeTgt92(int tgt92) {
		 putNumber(beginTgt92,tgt92,TGT_92_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt92Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTgt92
	 */
   	protected  int serializeTgt92(char[] value) {
	    int  tgt92;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tgt92 = (int) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,true/*isSigned?*/)
		       ,beginTgt92
		       ,6
		      );
		 localTgt92Counter = shareString.getSerializedField().getModifiedCounter();
		return  tgt92;
    }

   protected int checkTgt92MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1M/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshTgt92 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTgt92() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginTgt92
			                 ,TGT_92_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt92", beginTgt92,TGT_92_LEN);
    }
   	}
         int localSrc93Counter = -1;
         public boolean isSrc93Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc93Counter != sharedCounter;
            localSrc93Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkSrc93MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     int localTgt93Counter = -1;
     public boolean isTgt93Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt93Counter != sharedCounter;
         localTgt93Counter = sharedCounter; return hasModified;
     }
	protected static final int TGT_93_LEN = 6;
	/**
	 * 	serialize this Tgt93
	 */
   protected void serializeTgt93(char[] tgt93) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tgt93,0,getStringValue(),beginTgt93,TGT_93_LEN);
       localTgt93Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTgt93Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshTgt93 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTgt93() {	 
   		return (substring(getStringValue(),beginTgt93,beginTgt93 + TGT_93_LEN));
   	}
         int localSrc94Counter = -1;
         public boolean isSrc94Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc94Counter != sharedCounter;
            localSrc94Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkSrc94MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     int localTgt94Counter = -1;
     public boolean isTgt94Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt94Counter != sharedCounter;
         localTgt94Counter = sharedCounter; return hasModified;
     }
	protected static final int TGT_94_LEN = 6;
	/**
	 * 	serialize this Tgt94
	 */
   protected void serializeTgt94(char[] tgt94) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tgt94,0,getStringValue(),beginTgt94,TGT_94_LEN);
       localTgt94Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTgt94Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshTgt94 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTgt94() {	 
   		return (substring(getStringValue(),beginTgt94,beginTgt94 + TGT_94_LEN));
   	}
         int localSrc95Counter = -1;
         public boolean isSrc95Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc95Counter != sharedCounter;
            localSrc95Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkSrc95MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
        int localTgt95Counter = -1;
        public boolean isTgt95Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTgt95Counter != sharedCounter;
           localTgt95Counter = sharedCounter; return hasModified; 
        }
	    public boolean tgt95IsNumeric() {
	      return decimalIsNumeric(beginTgt95,TGT_95_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tgt95String() {
            return getPackedString(beginTgt95,TGT_95_LEN);
         }
   protected static final int TGT_95_LEN = 5;
   protected static final int TGT_95_SCALE = 2;
  	/**
	 * 	serializeTgt95
	 */
	protected void serializeTgt95(BigDecimal tgt95) {
		   putDecimal(beginTgt95,tgt95,TGT_95_LEN,TGT_95_SCALE,false);
		 localTgt95Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTgt95MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }
     /**
	 *	refreshTgt95 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt95() throws CFException {	
   	try { 
		 return (getDecimal(beginTgt95,TGT_95_LEN,TGT_95_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("tgt95", beginTgt95,TGT_95_LEN);
     }
   	}
         int localSrc96Counter = -1;
         public boolean isSrc96Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc96Counter != sharedCounter;
            localSrc96Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkSrc96MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
        int localTgt96Counter = -1;
        public boolean isTgt96Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTgt96Counter != sharedCounter;
           localTgt96Counter = sharedCounter; return hasModified; 
        }
	    public boolean tgt96IsNumeric() {
	      return decimalIsNumeric(beginTgt96,TGT_96_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tgt96String() {
            return getPackedString(beginTgt96,TGT_96_LEN);
         }
   protected static final int TGT_96_LEN = 8;
   protected static final int TGT_96_SCALE = 4;
  	/**
	 * 	serializeTgt96
	 */
	protected void serializeTgt96(BigDecimal tgt96) {
		   putDecimal(beginTgt96,tgt96,TGT_96_LEN,TGT_96_SCALE,false);
		 localTgt96Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTgt96MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,14/*precision*/);
   }
     /**
	 *	refreshTgt96 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt96() throws CFException {	
   	try { 
		 return (getDecimal(beginTgt96,TGT_96_LEN,TGT_96_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("tgt96", beginTgt96,TGT_96_LEN);
     }
   	}
         int localSrc97Counter = -1;
         public boolean isSrc97Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc97Counter != sharedCounter;
            localSrc97Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkSrc97MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
        int localTgt97Counter = -1;
        public boolean isTgt97Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTgt97Counter != sharedCounter;
           localTgt97Counter = sharedCounter; return hasModified; 
        }
	    public boolean tgt97IsNumeric() {
	      return decimalIsNumeric(beginTgt97,TGT_97_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tgt97String() {
            return getPackedString(beginTgt97,TGT_97_LEN);
         }
   protected static final int TGT_97_LEN = 5;
   protected static final int TGT_97_SCALE = 2;
  	/**
	 * 	serializeTgt97
	 */
	protected void serializeTgt97(BigDecimal tgt97) {
		   putDecimal(beginTgt97,tgt97,TGT_97_LEN,TGT_97_SCALE,false);
		 localTgt97Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTgt97MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }
     /**
	 *	refreshTgt97 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt97() throws CFException {	
   	try { 
		 return (getDecimal(beginTgt97,TGT_97_LEN,TGT_97_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("tgt97", beginTgt97,TGT_97_LEN);
     }
   	}
         int localSrc98Counter = -1;
         public boolean isSrc98Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc98Counter != sharedCounter;
            localSrc98Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkSrc98MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
        int localTgt98Counter = -1;
        public boolean isTgt98Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTgt98Counter != sharedCounter;
           localTgt98Counter = sharedCounter; return hasModified; 
        }
	    public boolean tgt98IsNumeric() {
	      return decimalIsNumeric(beginTgt98,TGT_98_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tgt98String() {
            return getPackedString(beginTgt98,TGT_98_LEN);
         }
   protected static final int TGT_98_LEN = 8;
   protected static final int TGT_98_SCALE = 4;
  	/**
	 * 	serializeTgt98
	 */
	protected void serializeTgt98(BigDecimal tgt98) {
		   putDecimal(beginTgt98,tgt98,TGT_98_LEN,TGT_98_SCALE,false);
		 localTgt98Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTgt98MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,14/*precision*/);
   }
     /**
	 *	refreshTgt98 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt98() throws CFException {	
   	try { 
		 return (getDecimal(beginTgt98,TGT_98_LEN,TGT_98_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("tgt98", beginTgt98,TGT_98_LEN);
     }
   	}
         int localSrc99Counter = -1;
         public boolean isSrc99Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc99Counter != sharedCounter;
            localSrc99Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkSrc99MaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
        int localTgt99Counter = -1;
        public boolean isTgt99Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTgt99Counter != sharedCounter;
           localTgt99Counter = sharedCounter; return hasModified; 
        }
	    public boolean tgt99IsNumeric() {
	      return decimalIsNumeric(beginTgt99,TGT_99_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tgt99String() {
            return getPackedString(beginTgt99,TGT_99_LEN);
         }
   protected static final int TGT_99_LEN = 5;
   protected static final int TGT_99_SCALE = 2;
  	/**
	 * 	serializeTgt99
	 */
	protected void serializeTgt99(BigDecimal tgt99) {
		   putDecimal(beginTgt99,tgt99,TGT_99_LEN,TGT_99_SCALE,false);
		 localTgt99Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTgt99MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }
     /**
	 *	refreshTgt99 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt99() throws CFException {	
   	try { 
		 return (getDecimal(beginTgt99,TGT_99_LEN,TGT_99_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("tgt99", beginTgt99,TGT_99_LEN);
     }
   	}
         int localSrc100Counter = -1;
         public boolean isSrc100Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc100Counter != sharedCounter;
            localSrc100Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkSrc100MaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
        int localTgt100Counter = -1;
        public boolean isTgt100Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTgt100Counter != sharedCounter;
           localTgt100Counter = sharedCounter; return hasModified; 
        }
	    public boolean tgt100IsNumeric() {
	      return decimalIsNumeric(beginTgt100,TGT_100_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tgt100String() {
            return getPackedString(beginTgt100,TGT_100_LEN);
         }
   protected static final int TGT_100_LEN = 8;
   protected static final int TGT_100_SCALE = 4;
  	/**
	 * 	serializeTgt100
	 */
	protected void serializeTgt100(BigDecimal tgt100) {
		   putDecimal(beginTgt100,tgt100,TGT_100_LEN,TGT_100_SCALE,false);
		 localTgt100Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTgt100MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,14/*precision*/);
   }
     /**
	 *	refreshTgt100 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt100() throws CFException {	
   	try { 
		 return (getDecimal(beginTgt100,TGT_100_LEN,TGT_100_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("tgt100", beginTgt100,TGT_100_LEN);
     }
   	}
         int localSrc101Counter = -1;
         public boolean isSrc101Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc101Counter != sharedCounter;
            localSrc101Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSrc101MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
        int localTgt101Counter = -1;
        public boolean isTgt101Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTgt101Counter != sharedCounter;
           localTgt101Counter = sharedCounter; return hasModified; 
        }
	    public boolean tgt101IsNumeric() {
	      return decimalIsNumeric(beginTgt101,TGT_101_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tgt101String() {
            return getPackedString(beginTgt101,TGT_101_LEN);
         }
   protected static final int TGT_101_LEN = 5;
   protected static final int TGT_101_SCALE = 2;
  	/**
	 * 	serializeTgt101
	 */
	protected void serializeTgt101(BigDecimal tgt101) {
		   putDecimal(beginTgt101,tgt101,TGT_101_LEN,TGT_101_SCALE,false);
		 localTgt101Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTgt101MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }
     /**
	 *	refreshTgt101 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt101() throws CFException {	
   	try { 
		 return (getDecimal(beginTgt101,TGT_101_LEN,TGT_101_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("tgt101", beginTgt101,TGT_101_LEN);
     }
   	}
         int localSrc102Counter = -1;
         public boolean isSrc102Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc102Counter != sharedCounter;
            localSrc102Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSrc102MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
        int localTgt102Counter = -1;
        public boolean isTgt102Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTgt102Counter != sharedCounter;
           localTgt102Counter = sharedCounter; return hasModified; 
        }
	    public boolean tgt102IsNumeric() {
	      return decimalIsNumeric(beginTgt102,TGT_102_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tgt102String() {
            return getPackedString(beginTgt102,TGT_102_LEN);
         }
   protected static final int TGT_102_LEN = 8;
   protected static final int TGT_102_SCALE = 4;
  	/**
	 * 	serializeTgt102
	 */
	protected void serializeTgt102(BigDecimal tgt102) {
		   putDecimal(beginTgt102,tgt102,TGT_102_LEN,TGT_102_SCALE,false);
		 localTgt102Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTgt102MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,14/*precision*/);
   }
     /**
	 *	refreshTgt102 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt102() throws CFException {	
   	try { 
		 return (getDecimal(beginTgt102,TGT_102_LEN,TGT_102_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("tgt102", beginTgt102,TGT_102_LEN);
     }
   	}
        int localSrc103Counter = -1;
        public boolean isSrc103Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localSrc103Counter != sharedCounter;
           localSrc103Counter = sharedCounter; return hasModified; 
        }
	    public boolean src103IsNumeric() {
	      return decimalIsNumeric(beginSrc103,SRC_103_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] src103String() {
            return getPackedString(beginSrc103,SRC_103_LEN);
         }
   protected static final int SRC_103_LEN = 7;
   protected static final int SRC_103_SCALE = 3;
  	/**
	 * 	serializeSrc103
	 */
	protected void serializeSrc103(BigDecimal src103) {
		   putDecimal(beginSrc103,src103,SRC_103_LEN,SRC_103_SCALE,true);
		 localSrc103Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkSrc103MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,3/*scale*/,13/*precision*/);
   }
     /**
	 *	refreshSrc103 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc103() throws CFException {	
   	try { 
		 return (getDecimal(beginSrc103,SRC_103_LEN,SRC_103_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("src103", beginSrc103,SRC_103_LEN);
     }
   	}
        int localTgt103Counter = -1;
        public boolean isTgt103Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTgt103Counter != sharedCounter;
           localTgt103Counter = sharedCounter; return hasModified; 
        }
	    public boolean tgt103IsNumeric() {
	      return decimalIsNumeric(beginTgt103,TGT_103_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tgt103String() {
            return getPackedString(beginTgt103,TGT_103_LEN);
         }
   protected static final int TGT_103_LEN = 5;
   protected static final int TGT_103_SCALE = 2;
  	/**
	 * 	serializeTgt103
	 */
	protected void serializeTgt103(BigDecimal tgt103) {
		   putDecimal(beginTgt103,tgt103,TGT_103_LEN,TGT_103_SCALE,false);
		 localTgt103Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTgt103MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }
     /**
	 *	refreshTgt103 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt103() throws CFException {	
   	try { 
		 return (getDecimal(beginTgt103,TGT_103_LEN,TGT_103_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("tgt103", beginTgt103,TGT_103_LEN);
     }
   	}
        int localSrc104Counter = -1;
        public boolean isSrc104Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localSrc104Counter != sharedCounter;
           localSrc104Counter = sharedCounter; return hasModified; 
        }
	    public boolean src104IsNumeric() {
	      return decimalIsNumeric(beginSrc104,SRC_104_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] src104String() {
            return getPackedString(beginSrc104,SRC_104_LEN);
         }
   protected static final int SRC_104_LEN = 5;
   protected static final int SRC_104_SCALE = 2;
  	/**
	 * 	serializeSrc104
	 */
	protected void serializeSrc104(BigDecimal src104) {
		   putDecimal(beginSrc104,src104,SRC_104_LEN,SRC_104_SCALE,true);
		 localSrc104Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkSrc104MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }
     /**
	 *	refreshSrc104 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc104() throws CFException {	
   	try { 
		 return (getDecimal(beginSrc104,SRC_104_LEN,SRC_104_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("src104", beginSrc104,SRC_104_LEN);
     }
   	}
        int localTgt104Counter = -1;
        public boolean isTgt104Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTgt104Counter != sharedCounter;
           localTgt104Counter = sharedCounter; return hasModified; 
        }
	    public boolean tgt104IsNumeric() {
	      return decimalIsNumeric(beginTgt104,TGT_104_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tgt104String() {
            return getPackedString(beginTgt104,TGT_104_LEN);
         }
   protected static final int TGT_104_LEN = 8;
   protected static final int TGT_104_SCALE = 4;
  	/**
	 * 	serializeTgt104
	 */
	protected void serializeTgt104(BigDecimal tgt104) {
		   putDecimal(beginTgt104,tgt104,TGT_104_LEN,TGT_104_SCALE,false);
		 localTgt104Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTgt104MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,14/*precision*/);
   }
     /**
	 *	refreshTgt104 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt104() throws CFException {	
   	try { 
		 return (getDecimal(beginTgt104,TGT_104_LEN,TGT_104_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("tgt104", beginTgt104,TGT_104_LEN);
     }
   	}
     int localSrc105Counter = -1;
     
     public boolean isSrc105Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc105Counter != sharedCounter;
         localSrc105Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of src105
	 *	@return src105
	 */
	public char[]  getSrc105String() {
	    return getCharArray(beginSrc105,SRC_105_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src105IsNumeric() {
		    return isNumeric(beginSrc105
	                    ,beginSrc105 + SRC_105_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int SRC_105_LEN = 13;
  protected  static final int SRC_105_SCALE = 3;

   protected BigDecimal checkSrc105MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,3/*scale*/,13/*precision*/);
   }

  	/**
	 * serializeSrc105
	 */
	protected void serializeSrc105(BigDecimal src105) {
	       putNumber(beginSrc105,src105,SRC_105_LEN,SRC_105_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc105Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeSrc105
	 */
   	protected  BigDecimal serializeSrc105(char[] value) throws CFException {
        if (value.length < 13) value = pad(13, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(13,value,true/*isSigned?*/)
		       ,beginSrc105
		       ,13
		      );		 localSrc105Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,SRC_105_LEN,SRC_105_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("src105", beginSrc105,SRC_105_LEN);
    	}
    }
    /**
	 *	refreshSrc105 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc105() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginSrc105
			            ,SRC_105_LEN
			            ,SRC_105_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("src105", beginSrc105,SRC_105_LEN);
    }
   	}
        int localTgt105Counter = -1;
        public boolean isTgt105Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTgt105Counter != sharedCounter;
           localTgt105Counter = sharedCounter; return hasModified; 
        }
	    public boolean tgt105IsNumeric() {
	      return decimalIsNumeric(beginTgt105,TGT_105_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tgt105String() {
            return getPackedString(beginTgt105,TGT_105_LEN);
         }
   protected static final int TGT_105_LEN = 5;
   protected static final int TGT_105_SCALE = 2;
  	/**
	 * 	serializeTgt105
	 */
	protected void serializeTgt105(BigDecimal tgt105) {
		   putDecimal(beginTgt105,tgt105,TGT_105_LEN,TGT_105_SCALE,false);
		 localTgt105Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTgt105MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }
     /**
	 *	refreshTgt105 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt105() throws CFException {	
   	try { 
		 return (getDecimal(beginTgt105,TGT_105_LEN,TGT_105_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("tgt105", beginTgt105,TGT_105_LEN);
     }
   	}
     int localSrc106Counter = -1;
     
     public boolean isSrc106Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc106Counter != sharedCounter;
         localSrc106Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of src106
	 *	@return src106
	 */
	public char[]  getSrc106String() {
	    return getCharArray(beginSrc106,SRC_106_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src106IsNumeric() {
		    return isNumeric(beginSrc106
	                    ,beginSrc106 + SRC_106_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int SRC_106_LEN = 8;
  protected  static final int SRC_106_SCALE = 2;

   protected BigDecimal checkSrc106MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }

  	/**
	 * serializeSrc106
	 */
	protected void serializeSrc106(BigDecimal src106) {
	       putNumber(beginSrc106,src106,SRC_106_LEN,SRC_106_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc106Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeSrc106
	 */
   	protected  BigDecimal serializeSrc106(char[] value) throws CFException {
        if (value.length < 8) value = pad(8, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(8,value,true/*isSigned?*/)
		       ,beginSrc106
		       ,8
		      );		 localSrc106Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,SRC_106_LEN,SRC_106_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("src106", beginSrc106,SRC_106_LEN);
    	}
    }
    /**
	 *	refreshSrc106 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc106() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginSrc106
			            ,SRC_106_LEN
			            ,SRC_106_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("src106", beginSrc106,SRC_106_LEN);
    }
   	}
        int localTgt106Counter = -1;
        public boolean isTgt106Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTgt106Counter != sharedCounter;
           localTgt106Counter = sharedCounter; return hasModified; 
        }
	    public boolean tgt106IsNumeric() {
	      return decimalIsNumeric(beginTgt106,TGT_106_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tgt106String() {
            return getPackedString(beginTgt106,TGT_106_LEN);
         }
   protected static final int TGT_106_LEN = 8;
   protected static final int TGT_106_SCALE = 4;
  	/**
	 * 	serializeTgt106
	 */
	protected void serializeTgt106(BigDecimal tgt106) {
		   putDecimal(beginTgt106,tgt106,TGT_106_LEN,TGT_106_SCALE,false);
		 localTgt106Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTgt106MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,14/*precision*/);
   }
     /**
	 *	refreshTgt106 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt106() throws CFException {	
   	try { 
		 return (getDecimal(beginTgt106,TGT_106_LEN,TGT_106_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("tgt106", beginTgt106,TGT_106_LEN);
     }
   	}
     int localSrc107Counter = -1;
     
     public boolean isSrc107Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc107Counter != sharedCounter;
         localSrc107Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of src107
	 *	@return src107
	 */
	public char[]  getSrc107String() {
	    return getCharArray(beginSrc107,SRC_107_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src107IsNumeric() {
		    return isNumeric(beginSrc107
	                    ,beginSrc107 + SRC_107_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int SRC_107_LEN = 13;
  protected  static final int SRC_107_SCALE = 3;

   protected BigDecimal checkSrc107MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,3/*scale*/,13/*precision*/);
   }

  	/**
	 * serializeSrc107
	 */
	protected void serializeSrc107(BigDecimal src107) {
	       putNumber(beginSrc107,src107,SRC_107_LEN,SRC_107_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc107Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeSrc107
	 */
   	protected  BigDecimal serializeSrc107(char[] value) throws CFException {
        if (value.length < 13) value = pad(13, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(13,value,false/*isSigned?*/)
		       ,beginSrc107
		       ,13
		      );		 localSrc107Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,SRC_107_LEN,SRC_107_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("src107", beginSrc107,SRC_107_LEN);
    	}
    }
    /**
	 *	refreshSrc107 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc107() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginSrc107
			            ,SRC_107_LEN
			            ,SRC_107_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("src107", beginSrc107,SRC_107_LEN);
    }
   	}
        int localTgt107Counter = -1;
        public boolean isTgt107Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTgt107Counter != sharedCounter;
           localTgt107Counter = sharedCounter; return hasModified; 
        }
	    public boolean tgt107IsNumeric() {
	      return decimalIsNumeric(beginTgt107,TGT_107_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tgt107String() {
            return getPackedString(beginTgt107,TGT_107_LEN);
         }
   protected static final int TGT_107_LEN = 5;
   protected static final int TGT_107_SCALE = 2;
  	/**
	 * 	serializeTgt107
	 */
	protected void serializeTgt107(BigDecimal tgt107) {
		   putDecimal(beginTgt107,tgt107,TGT_107_LEN,TGT_107_SCALE,true);
		 localTgt107Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTgt107MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }
     /**
	 *	refreshTgt107 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt107() throws CFException {	
   	try { 
		 return (getDecimal(beginTgt107,TGT_107_LEN,TGT_107_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("tgt107", beginTgt107,TGT_107_LEN);
     }
   	}
     int localSrc108Counter = -1;
     
     public boolean isSrc108Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc108Counter != sharedCounter;
         localSrc108Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of src108
	 *	@return src108
	 */
	public char[]  getSrc108String() {
	    return getCharArray(beginSrc108,SRC_108_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src108IsNumeric() {
		    return isNumeric(beginSrc108
	                    ,beginSrc108 + SRC_108_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int SRC_108_LEN = 8;
  protected  static final int SRC_108_SCALE = 2;

   protected BigDecimal checkSrc108MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }

  	/**
	 * serializeSrc108
	 */
	protected void serializeSrc108(BigDecimal src108) {
	       putNumber(beginSrc108,src108,SRC_108_LEN,SRC_108_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc108Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeSrc108
	 */
   	protected  BigDecimal serializeSrc108(char[] value) throws CFException {
        if (value.length < 8) value = pad(8, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginSrc108
		       ,8
		      );		 localSrc108Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,SRC_108_LEN,SRC_108_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("src108", beginSrc108,SRC_108_LEN);
    	}
    }
    /**
	 *	refreshSrc108 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc108() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginSrc108
			            ,SRC_108_LEN
			            ,SRC_108_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("src108", beginSrc108,SRC_108_LEN);
    }
   	}
        int localTgt108Counter = -1;
        public boolean isTgt108Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTgt108Counter != sharedCounter;
           localTgt108Counter = sharedCounter; return hasModified; 
        }
	    public boolean tgt108IsNumeric() {
	      return decimalIsNumeric(beginTgt108,TGT_108_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tgt108String() {
            return getPackedString(beginTgt108,TGT_108_LEN);
         }
   protected static final int TGT_108_LEN = 8;
   protected static final int TGT_108_SCALE = 4;
  	/**
	 * 	serializeTgt108
	 */
	protected void serializeTgt108(BigDecimal tgt108) {
		   putDecimal(beginTgt108,tgt108,TGT_108_LEN,TGT_108_SCALE,true);
		 localTgt108Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTgt108MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,14/*precision*/);
   }
     /**
	 *	refreshTgt108 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt108() throws CFException {	
   	try { 
		 return (getDecimal(beginTgt108,TGT_108_LEN,TGT_108_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("tgt108", beginTgt108,TGT_108_LEN);
     }
   	}
     int localSrc109Counter = -1;
     
     public boolean isSrc109Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc109Counter != sharedCounter;
         localSrc109Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of src109
	 *	@return src109
	 */
	public char[]  getSrc109String() {
	    return getCharArray(beginSrc109,SRC_109_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src109IsNumeric() {
		    return isNumeric(beginSrc109
	                    ,beginSrc109 + SRC_109_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int SRC_109_LEN = 13;
  protected  static final int SRC_109_SCALE = 3;

   protected BigDecimal checkSrc109MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,3/*scale*/,13/*precision*/);
   }

  	/**
	 * serializeSrc109
	 */
	protected void serializeSrc109(BigDecimal src109) {
	       putNumber(beginSrc109,src109,SRC_109_LEN,SRC_109_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc109Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeSrc109
	 */
   	protected  BigDecimal serializeSrc109(char[] value) throws CFException {
        if (value.length < 13) value = pad(13, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(13,value,false/*isSigned?*/)
		       ,beginSrc109
		       ,13
		      );		 localSrc109Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,SRC_109_LEN,SRC_109_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("src109", beginSrc109,SRC_109_LEN);
    	}
    }
    /**
	 *	refreshSrc109 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc109() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginSrc109
			            ,SRC_109_LEN
			            ,SRC_109_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("src109", beginSrc109,SRC_109_LEN);
    }
   	}
        int localTgt109Counter = -1;
        public boolean isTgt109Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTgt109Counter != sharedCounter;
           localTgt109Counter = sharedCounter; return hasModified; 
        }
	    public boolean tgt109IsNumeric() {
	      return decimalIsNumeric(beginTgt109,TGT_109_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tgt109String() {
            return getPackedString(beginTgt109,TGT_109_LEN);
         }
   protected static final int TGT_109_LEN = 5;
   protected static final int TGT_109_SCALE = 2;
  	/**
	 * 	serializeTgt109
	 */
	protected void serializeTgt109(BigDecimal tgt109) {
		   putDecimal(beginTgt109,tgt109,TGT_109_LEN,TGT_109_SCALE,false);
		 localTgt109Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTgt109MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }
     /**
	 *	refreshTgt109 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt109() throws CFException {	
   	try { 
		 return (getDecimal(beginTgt109,TGT_109_LEN,TGT_109_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("tgt109", beginTgt109,TGT_109_LEN);
     }
   	}
     int localSrc110Counter = -1;
     
     public boolean isSrc110Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc110Counter != sharedCounter;
         localSrc110Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of src110
	 *	@return src110
	 */
	public char[]  getSrc110String() {
	    return getCharArray(beginSrc110,SRC_110_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src110IsNumeric() {
		    return isNumeric(beginSrc110
	                    ,beginSrc110 + SRC_110_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int SRC_110_LEN = 8;
  protected  static final int SRC_110_SCALE = 2;

   protected BigDecimal checkSrc110MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }

  	/**
	 * serializeSrc110
	 */
	protected void serializeSrc110(BigDecimal src110) {
	       putNumber(beginSrc110,src110,SRC_110_LEN,SRC_110_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc110Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeSrc110
	 */
   	protected  BigDecimal serializeSrc110(char[] value) throws CFException {
        if (value.length < 8) value = pad(8, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginSrc110
		       ,8
		      );		 localSrc110Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,SRC_110_LEN,SRC_110_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("src110", beginSrc110,SRC_110_LEN);
    	}
    }
    /**
	 *	refreshSrc110 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc110() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginSrc110
			            ,SRC_110_LEN
			            ,SRC_110_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("src110", beginSrc110,SRC_110_LEN);
    }
   	}
        int localTgt110Counter = -1;
        public boolean isTgt110Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTgt110Counter != sharedCounter;
           localTgt110Counter = sharedCounter; return hasModified; 
        }
	    public boolean tgt110IsNumeric() {
	      return decimalIsNumeric(beginTgt110,TGT_110_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tgt110String() {
            return getPackedString(beginTgt110,TGT_110_LEN);
         }
   protected static final int TGT_110_LEN = 8;
   protected static final int TGT_110_SCALE = 4;
  	/**
	 * 	serializeTgt110
	 */
	protected void serializeTgt110(BigDecimal tgt110) {
		   putDecimal(beginTgt110,tgt110,TGT_110_LEN,TGT_110_SCALE,false);
		 localTgt110Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTgt110MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,14/*precision*/);
   }
     /**
	 *	refreshTgt110 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt110() throws CFException {	
   	try { 
		 return (getDecimal(beginTgt110,TGT_110_LEN,TGT_110_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("tgt110", beginTgt110,TGT_110_LEN);
     }
   	}
        int localSrc111Counter = -1;
        public boolean isSrc111Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localSrc111Counter != sharedCounter;
           localSrc111Counter = sharedCounter; return hasModified; 
        }
	    public boolean src111IsNumeric() {
	      return decimalIsNumeric(beginSrc111,SRC_111_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] src111String() {
            return getPackedString(beginSrc111,SRC_111_LEN);
         }
   protected static final int SRC_111_LEN = 7;
   protected static final int SRC_111_SCALE = 3;
  	/**
	 * 	serializeSrc111
	 */
	protected void serializeSrc111(BigDecimal src111) {
		   putDecimal(beginSrc111,src111,SRC_111_LEN,SRC_111_SCALE,true);
		 localSrc111Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkSrc111MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,3/*scale*/,13/*precision*/);
   }
     /**
	 *	refreshSrc111 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc111() throws CFException {	
   	try { 
		 return (getDecimal(beginSrc111,SRC_111_LEN,SRC_111_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("src111", beginSrc111,SRC_111_LEN);
     }
   	}
     int localTgt111Counter = -1;
     
     public boolean isTgt111Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt111Counter != sharedCounter;
         localTgt111Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of tgt111
	 *	@return tgt111
	 */
	public char[]  getTgt111String() {
	    return getCharArray(beginTgt111,TGT_111_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt111IsNumeric() {
		    return isNumeric(beginTgt111
	                    ,beginTgt111 + TGT_111_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int TGT_111_LEN = 8;
  protected  static final int TGT_111_SCALE = 2;

   protected BigDecimal checkTgt111MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }

  	/**
	 * serializeTgt111
	 */
	protected void serializeTgt111(BigDecimal tgt111) {
	       putNumber(beginTgt111,tgt111,TGT_111_LEN,TGT_111_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt111Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeTgt111
	 */
   	protected  BigDecimal serializeTgt111(char[] value) throws CFException {
        if (value.length < 8) value = pad(8, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginTgt111
		       ,8
		      );		 localTgt111Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,TGT_111_LEN,TGT_111_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("tgt111", beginTgt111,TGT_111_LEN);
    	}
    }
    /**
	 *	refreshTgt111 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt111() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginTgt111
			            ,TGT_111_LEN
			            ,TGT_111_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt111", beginTgt111,TGT_111_LEN);
    }
   	}
        int localSrc112Counter = -1;
        public boolean isSrc112Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localSrc112Counter != sharedCounter;
           localSrc112Counter = sharedCounter; return hasModified; 
        }
	    public boolean src112IsNumeric() {
	      return decimalIsNumeric(beginSrc112,SRC_112_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] src112String() {
            return getPackedString(beginSrc112,SRC_112_LEN);
         }
   protected static final int SRC_112_LEN = 5;
   protected static final int SRC_112_SCALE = 2;
  	/**
	 * 	serializeSrc112
	 */
	protected void serializeSrc112(BigDecimal src112) {
		   putDecimal(beginSrc112,src112,SRC_112_LEN,SRC_112_SCALE,true);
		 localSrc112Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkSrc112MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }
     /**
	 *	refreshSrc112 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc112() throws CFException {	
   	try { 
		 return (getDecimal(beginSrc112,SRC_112_LEN,SRC_112_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("src112", beginSrc112,SRC_112_LEN);
     }
   	}
     int localTgt112Counter = -1;
     
     public boolean isTgt112Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt112Counter != sharedCounter;
         localTgt112Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of tgt112
	 *	@return tgt112
	 */
	public char[]  getTgt112String() {
	    return getCharArray(beginTgt112,TGT_112_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt112IsNumeric() {
		    return isNumeric(beginTgt112
	                    ,beginTgt112 + TGT_112_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int TGT_112_LEN = 14;
  protected  static final int TGT_112_SCALE = 4;

   protected BigDecimal checkTgt112MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,4/*scale*/,14/*precision*/);
   }

  	/**
	 * serializeTgt112
	 */
	protected void serializeTgt112(BigDecimal tgt112) {
	       putNumber(beginTgt112,tgt112,TGT_112_LEN,TGT_112_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt112Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeTgt112
	 */
   	protected  BigDecimal serializeTgt112(char[] value) throws CFException {
        if (value.length < 14) value = pad(14, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(14,value,false/*isSigned?*/)
		       ,beginTgt112
		       ,14
		      );		 localTgt112Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,TGT_112_LEN,TGT_112_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("tgt112", beginTgt112,TGT_112_LEN);
    	}
    }
    /**
	 *	refreshTgt112 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt112() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginTgt112
			            ,TGT_112_LEN
			            ,TGT_112_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt112", beginTgt112,TGT_112_LEN);
    }
   	}
        int localSrc113Counter = -1;
        public boolean isSrc113Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localSrc113Counter != sharedCounter;
           localSrc113Counter = sharedCounter; return hasModified; 
        }
	    public boolean src113IsNumeric() {
	      return decimalIsNumeric(beginSrc113,SRC_113_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] src113String() {
            return getPackedString(beginSrc113,SRC_113_LEN);
         }
   protected static final int SRC_113_LEN = 7;
   protected static final int SRC_113_SCALE = 3;
  	/**
	 * 	serializeSrc113
	 */
	protected void serializeSrc113(BigDecimal src113) {
		   putDecimal(beginSrc113,src113,SRC_113_LEN,SRC_113_SCALE,false);
		 localSrc113Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkSrc113MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,3/*scale*/,13/*precision*/);
   }
     /**
	 *	refreshSrc113 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc113() throws CFException {	
   	try { 
		 return (getDecimal(beginSrc113,SRC_113_LEN,SRC_113_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("src113", beginSrc113,SRC_113_LEN);
     }
   	}
     int localTgt113Counter = -1;
     
     public boolean isTgt113Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt113Counter != sharedCounter;
         localTgt113Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of tgt113
	 *	@return tgt113
	 */
	public char[]  getTgt113String() {
	    return getCharArray(beginTgt113,TGT_113_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt113IsNumeric() {
		    return isNumeric(beginTgt113
	                    ,beginTgt113 + TGT_113_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int TGT_113_LEN = 8;
  protected  static final int TGT_113_SCALE = 2;

   protected BigDecimal checkTgt113MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }

  	/**
	 * serializeTgt113
	 */
	protected void serializeTgt113(BigDecimal tgt113) {
	       putNumber(beginTgt113,tgt113,TGT_113_LEN,TGT_113_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt113Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeTgt113
	 */
   	protected  BigDecimal serializeTgt113(char[] value) throws CFException {
        if (value.length < 8) value = pad(8, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(8,value,true/*isSigned?*/)
		       ,beginTgt113
		       ,8
		      );		 localTgt113Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,TGT_113_LEN,TGT_113_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("tgt113", beginTgt113,TGT_113_LEN);
    	}
    }
    /**
	 *	refreshTgt113 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt113() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginTgt113
			            ,TGT_113_LEN
			            ,TGT_113_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt113", beginTgt113,TGT_113_LEN);
    }
   	}
        int localSrc114Counter = -1;
        public boolean isSrc114Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localSrc114Counter != sharedCounter;
           localSrc114Counter = sharedCounter; return hasModified; 
        }
	    public boolean src114IsNumeric() {
	      return decimalIsNumeric(beginSrc114,SRC_114_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] src114String() {
            return getPackedString(beginSrc114,SRC_114_LEN);
         }
   protected static final int SRC_114_LEN = 5;
   protected static final int SRC_114_SCALE = 2;
  	/**
	 * 	serializeSrc114
	 */
	protected void serializeSrc114(BigDecimal src114) {
		   putDecimal(beginSrc114,src114,SRC_114_LEN,SRC_114_SCALE,false);
		 localSrc114Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkSrc114MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }
     /**
	 *	refreshSrc114 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc114() throws CFException {	
   	try { 
		 return (getDecimal(beginSrc114,SRC_114_LEN,SRC_114_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("src114", beginSrc114,SRC_114_LEN);
     }
   	}
     int localTgt114Counter = -1;
     
     public boolean isTgt114Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt114Counter != sharedCounter;
         localTgt114Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of tgt114
	 *	@return tgt114
	 */
	public char[]  getTgt114String() {
	    return getCharArray(beginTgt114,TGT_114_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt114IsNumeric() {
		    return isNumeric(beginTgt114
	                    ,beginTgt114 + TGT_114_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int TGT_114_LEN = 14;
  protected  static final int TGT_114_SCALE = 4;

   protected BigDecimal checkTgt114MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,4/*scale*/,14/*precision*/);
   }

  	/**
	 * serializeTgt114
	 */
	protected void serializeTgt114(BigDecimal tgt114) {
	       putNumber(beginTgt114,tgt114,TGT_114_LEN,TGT_114_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt114Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeTgt114
	 */
   	protected  BigDecimal serializeTgt114(char[] value) throws CFException {
        if (value.length < 14) value = pad(14, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(14,value,true/*isSigned?*/)
		       ,beginTgt114
		       ,14
		      );		 localTgt114Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,TGT_114_LEN,TGT_114_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("tgt114", beginTgt114,TGT_114_LEN);
    	}
    }
    /**
	 *	refreshTgt114 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt114() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginTgt114
			            ,TGT_114_LEN
			            ,TGT_114_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt114", beginTgt114,TGT_114_LEN);
    }
   	}
        int localSrc115Counter = -1;
        public boolean isSrc115Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localSrc115Counter != sharedCounter;
           localSrc115Counter = sharedCounter; return hasModified; 
        }
	    public boolean src115IsNumeric() {
	      return decimalIsNumeric(beginSrc115,SRC_115_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] src115String() {
            return getPackedString(beginSrc115,SRC_115_LEN);
         }
   protected static final int SRC_115_LEN = 7;
   protected static final int SRC_115_SCALE = 3;
  	/**
	 * 	serializeSrc115
	 */
	protected void serializeSrc115(BigDecimal src115) {
		   putDecimal(beginSrc115,src115,SRC_115_LEN,SRC_115_SCALE,false);
		 localSrc115Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkSrc115MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,3/*scale*/,13/*precision*/);
   }
     /**
	 *	refreshSrc115 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc115() throws CFException {	
   	try { 
		 return (getDecimal(beginSrc115,SRC_115_LEN,SRC_115_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("src115", beginSrc115,SRC_115_LEN);
     }
   	}
     int localTgt115Counter = -1;
     
     public boolean isTgt115Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt115Counter != sharedCounter;
         localTgt115Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of tgt115
	 *	@return tgt115
	 */
	public char[]  getTgt115String() {
	    return getCharArray(beginTgt115,TGT_115_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt115IsNumeric() {
		    return isNumeric(beginTgt115
	                    ,beginTgt115 + TGT_115_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int TGT_115_LEN = 8;
  protected  static final int TGT_115_SCALE = 2;

   protected BigDecimal checkTgt115MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }

  	/**
	 * serializeTgt115
	 */
	protected void serializeTgt115(BigDecimal tgt115) {
	       putNumber(beginTgt115,tgt115,TGT_115_LEN,TGT_115_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt115Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeTgt115
	 */
   	protected  BigDecimal serializeTgt115(char[] value) throws CFException {
        if (value.length < 8) value = pad(8, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginTgt115
		       ,8
		      );		 localTgt115Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,TGT_115_LEN,TGT_115_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("tgt115", beginTgt115,TGT_115_LEN);
    	}
    }
    /**
	 *	refreshTgt115 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt115() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginTgt115
			            ,TGT_115_LEN
			            ,TGT_115_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt115", beginTgt115,TGT_115_LEN);
    }
   	}
        int localSrc116Counter = -1;
        public boolean isSrc116Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localSrc116Counter != sharedCounter;
           localSrc116Counter = sharedCounter; return hasModified; 
        }
	    public boolean src116IsNumeric() {
	      return decimalIsNumeric(beginSrc116,SRC_116_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] src116String() {
            return getPackedString(beginSrc116,SRC_116_LEN);
         }
   protected static final int SRC_116_LEN = 5;
   protected static final int SRC_116_SCALE = 2;
  	/**
	 * 	serializeSrc116
	 */
	protected void serializeSrc116(BigDecimal src116) {
		   putDecimal(beginSrc116,src116,SRC_116_LEN,SRC_116_SCALE,false);
		 localSrc116Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkSrc116MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }
     /**
	 *	refreshSrc116 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc116() throws CFException {	
   	try { 
		 return (getDecimal(beginSrc116,SRC_116_LEN,SRC_116_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("src116", beginSrc116,SRC_116_LEN);
     }
   	}
     int localTgt116Counter = -1;
     
     public boolean isTgt116Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt116Counter != sharedCounter;
         localTgt116Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of tgt116
	 *	@return tgt116
	 */
	public char[]  getTgt116String() {
	    return getCharArray(beginTgt116,TGT_116_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt116IsNumeric() {
		    return isNumeric(beginTgt116
	                    ,beginTgt116 + TGT_116_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int TGT_116_LEN = 14;
  protected  static final int TGT_116_SCALE = 4;

   protected BigDecimal checkTgt116MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,4/*scale*/,14/*precision*/);
   }

  	/**
	 * serializeTgt116
	 */
	protected void serializeTgt116(BigDecimal tgt116) {
	       putNumber(beginTgt116,tgt116,TGT_116_LEN,TGT_116_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt116Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeTgt116
	 */
   	protected  BigDecimal serializeTgt116(char[] value) throws CFException {
        if (value.length < 14) value = pad(14, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(14,value,false/*isSigned?*/)
		       ,beginTgt116
		       ,14
		      );		 localTgt116Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,TGT_116_LEN,TGT_116_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("tgt116", beginTgt116,TGT_116_LEN);
    	}
    }
    /**
	 *	refreshTgt116 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt116() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginTgt116
			            ,TGT_116_LEN
			            ,TGT_116_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt116", beginTgt116,TGT_116_LEN);
    }
   	}
     int localSrc117Counter = -1;
     
     public boolean isSrc117Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc117Counter != sharedCounter;
         localSrc117Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of src117
	 *	@return src117
	 */
	public char[]  getSrc117String() {
	    return getCharArray(beginSrc117,SRC_117_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src117IsNumeric() {
		    return isNumeric(beginSrc117
	                    ,beginSrc117 + SRC_117_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int SRC_117_LEN = 13;
  protected  static final int SRC_117_SCALE = 3;

   protected BigDecimal checkSrc117MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,3/*scale*/,13/*precision*/);
   }

  	/**
	 * serializeSrc117
	 */
	protected void serializeSrc117(BigDecimal src117) {
	       putNumber(beginSrc117,src117,SRC_117_LEN,SRC_117_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc117Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeSrc117
	 */
   	protected  BigDecimal serializeSrc117(char[] value) throws CFException {
        if (value.length < 13) value = pad(13, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(13,value,true/*isSigned?*/)
		       ,beginSrc117
		       ,13
		      );		 localSrc117Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,SRC_117_LEN,SRC_117_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("src117", beginSrc117,SRC_117_LEN);
    	}
    }
    /**
	 *	refreshSrc117 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc117() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginSrc117
			            ,SRC_117_LEN
			            ,SRC_117_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("src117", beginSrc117,SRC_117_LEN);
    }
   	}
     int localTgt117Counter = -1;
     
     public boolean isTgt117Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt117Counter != sharedCounter;
         localTgt117Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of tgt117
	 *	@return tgt117
	 */
	public char[]  getTgt117String() {
	    return getCharArray(beginTgt117,TGT_117_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt117IsNumeric() {
		    return isNumeric(beginTgt117
	                    ,beginTgt117 + TGT_117_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int TGT_117_LEN = 8;
  protected  static final int TGT_117_SCALE = 2;

   protected BigDecimal checkTgt117MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }

  	/**
	 * serializeTgt117
	 */
	protected void serializeTgt117(BigDecimal tgt117) {
	       putNumber(beginTgt117,tgt117,TGT_117_LEN,TGT_117_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt117Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeTgt117
	 */
   	protected  BigDecimal serializeTgt117(char[] value) throws CFException {
        if (value.length < 8) value = pad(8, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginTgt117
		       ,8
		      );		 localTgt117Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,TGT_117_LEN,TGT_117_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("tgt117", beginTgt117,TGT_117_LEN);
    	}
    }
    /**
	 *	refreshTgt117 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt117() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginTgt117
			            ,TGT_117_LEN
			            ,TGT_117_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt117", beginTgt117,TGT_117_LEN);
    }
   	}
     int localSrc118Counter = -1;
     
     public boolean isSrc118Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc118Counter != sharedCounter;
         localSrc118Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of src118
	 *	@return src118
	 */
	public char[]  getSrc118String() {
	    return getCharArray(beginSrc118,SRC_118_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src118IsNumeric() {
		    return isNumeric(beginSrc118
	                    ,beginSrc118 + SRC_118_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int SRC_118_LEN = 8;
  protected  static final int SRC_118_SCALE = 2;

   protected BigDecimal checkSrc118MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }

  	/**
	 * serializeSrc118
	 */
	protected void serializeSrc118(BigDecimal src118) {
	       putNumber(beginSrc118,src118,SRC_118_LEN,SRC_118_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc118Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeSrc118
	 */
   	protected  BigDecimal serializeSrc118(char[] value) throws CFException {
        if (value.length < 8) value = pad(8, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(8,value,true/*isSigned?*/)
		       ,beginSrc118
		       ,8
		      );		 localSrc118Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,SRC_118_LEN,SRC_118_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("src118", beginSrc118,SRC_118_LEN);
    	}
    }
    /**
	 *	refreshSrc118 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc118() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginSrc118
			            ,SRC_118_LEN
			            ,SRC_118_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("src118", beginSrc118,SRC_118_LEN);
    }
   	}
     int localTgt118Counter = -1;
     
     public boolean isTgt118Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt118Counter != sharedCounter;
         localTgt118Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of tgt118
	 *	@return tgt118
	 */
	public char[]  getTgt118String() {
	    return getCharArray(beginTgt118,TGT_118_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt118IsNumeric() {
		    return isNumeric(beginTgt118
	                    ,beginTgt118 + TGT_118_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int TGT_118_LEN = 14;
  protected  static final int TGT_118_SCALE = 4;

   protected BigDecimal checkTgt118MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,4/*scale*/,14/*precision*/);
   }

  	/**
	 * serializeTgt118
	 */
	protected void serializeTgt118(BigDecimal tgt118) {
	       putNumber(beginTgt118,tgt118,TGT_118_LEN,TGT_118_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt118Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeTgt118
	 */
   	protected  BigDecimal serializeTgt118(char[] value) throws CFException {
        if (value.length < 14) value = pad(14, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(14,value,false/*isSigned?*/)
		       ,beginTgt118
		       ,14
		      );		 localTgt118Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,TGT_118_LEN,TGT_118_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("tgt118", beginTgt118,TGT_118_LEN);
    	}
    }
    /**
	 *	refreshTgt118 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt118() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginTgt118
			            ,TGT_118_LEN
			            ,TGT_118_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt118", beginTgt118,TGT_118_LEN);
    }
   	}
     int localSrc119Counter = -1;
     
     public boolean isSrc119Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc119Counter != sharedCounter;
         localSrc119Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of src119
	 *	@return src119
	 */
	public char[]  getSrc119String() {
	    return getCharArray(beginSrc119,SRC_119_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src119IsNumeric() {
		    return isNumeric(beginSrc119
	                    ,beginSrc119 + SRC_119_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int SRC_119_LEN = 13;
  protected  static final int SRC_119_SCALE = 3;

   protected BigDecimal checkSrc119MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,3/*scale*/,13/*precision*/);
   }

  	/**
	 * serializeSrc119
	 */
	protected void serializeSrc119(BigDecimal src119) {
	       putNumber(beginSrc119,src119,SRC_119_LEN,SRC_119_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc119Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeSrc119
	 */
   	protected  BigDecimal serializeSrc119(char[] value) throws CFException {
        if (value.length < 13) value = pad(13, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(13,value,false/*isSigned?*/)
		       ,beginSrc119
		       ,13
		      );		 localSrc119Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,SRC_119_LEN,SRC_119_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("src119", beginSrc119,SRC_119_LEN);
    	}
    }
    /**
	 *	refreshSrc119 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc119() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginSrc119
			            ,SRC_119_LEN
			            ,SRC_119_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("src119", beginSrc119,SRC_119_LEN);
    }
   	}
     int localTgt119Counter = -1;
     
     public boolean isTgt119Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt119Counter != sharedCounter;
         localTgt119Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of tgt119
	 *	@return tgt119
	 */
	public char[]  getTgt119String() {
	    return getCharArray(beginTgt119,TGT_119_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt119IsNumeric() {
		    return isNumeric(beginTgt119
	                    ,beginTgt119 + TGT_119_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int TGT_119_LEN = 8;
  protected  static final int TGT_119_SCALE = 2;

   protected BigDecimal checkTgt119MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }

  	/**
	 * serializeTgt119
	 */
	protected void serializeTgt119(BigDecimal tgt119) {
	       putNumber(beginTgt119,tgt119,TGT_119_LEN,TGT_119_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt119Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeTgt119
	 */
   	protected  BigDecimal serializeTgt119(char[] value) throws CFException {
        if (value.length < 8) value = pad(8, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(8,value,true/*isSigned?*/)
		       ,beginTgt119
		       ,8
		      );		 localTgt119Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,TGT_119_LEN,TGT_119_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("tgt119", beginTgt119,TGT_119_LEN);
    	}
    }
    /**
	 *	refreshTgt119 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt119() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginTgt119
			            ,TGT_119_LEN
			            ,TGT_119_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt119", beginTgt119,TGT_119_LEN);
    }
   	}
     int localSrc120Counter = -1;
     
     public boolean isSrc120Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc120Counter != sharedCounter;
         localSrc120Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of src120
	 *	@return src120
	 */
	public char[]  getSrc120String() {
	    return getCharArray(beginSrc120,SRC_120_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src120IsNumeric() {
		    return isNumeric(beginSrc120
	                    ,beginSrc120 + SRC_120_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int SRC_120_LEN = 8;
  protected  static final int SRC_120_SCALE = 2;

   protected BigDecimal checkSrc120MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }

  	/**
	 * serializeSrc120
	 */
	protected void serializeSrc120(BigDecimal src120) {
	       putNumber(beginSrc120,src120,SRC_120_LEN,SRC_120_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc120Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeSrc120
	 */
   	protected  BigDecimal serializeSrc120(char[] value) throws CFException {
        if (value.length < 8) value = pad(8, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginSrc120
		       ,8
		      );		 localSrc120Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,SRC_120_LEN,SRC_120_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("src120", beginSrc120,SRC_120_LEN);
    	}
    }
    /**
	 *	refreshSrc120 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc120() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginSrc120
			            ,SRC_120_LEN
			            ,SRC_120_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("src120", beginSrc120,SRC_120_LEN);
    }
   	}
     int localTgt120Counter = -1;
     
     public boolean isTgt120Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt120Counter != sharedCounter;
         localTgt120Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of tgt120
	 *	@return tgt120
	 */
	public char[]  getTgt120String() {
	    return getCharArray(beginTgt120,TGT_120_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt120IsNumeric() {
		    return isNumeric(beginTgt120
	                    ,beginTgt120 + TGT_120_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int TGT_120_LEN = 14;
  protected  static final int TGT_120_SCALE = 4;

   protected BigDecimal checkTgt120MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,4/*scale*/,14/*precision*/);
   }

  	/**
	 * serializeTgt120
	 */
	protected void serializeTgt120(BigDecimal tgt120) {
	       putNumber(beginTgt120,tgt120,TGT_120_LEN,TGT_120_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt120Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeTgt120
	 */
   	protected  BigDecimal serializeTgt120(char[] value) throws CFException {
        if (value.length < 14) value = pad(14, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(14,value,true/*isSigned?*/)
		       ,beginTgt120
		       ,14
		      );		 localTgt120Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,TGT_120_LEN,TGT_120_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("tgt120", beginTgt120,TGT_120_LEN);
    	}
    }
    /**
	 *	refreshTgt120 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt120() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginTgt120
			            ,TGT_120_LEN
			            ,TGT_120_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt120", beginTgt120,TGT_120_LEN);
    }
   	}
     int localSrc121Counter = -1;
     
     public boolean isSrc121Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc121Counter != sharedCounter;
         localSrc121Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of src121
	 *	@return src121
	 */
	public char[]  getSrc121String() {
	    return getCharArray(beginSrc121,SRC_121_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src121IsNumeric() {
		    return isNumeric(beginSrc121
	                    ,beginSrc121 + SRC_121_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int SRC_121_LEN = 13;
  protected  static final int SRC_121_SCALE = 3;

   protected BigDecimal checkSrc121MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,3/*scale*/,13/*precision*/);
   }

  	/**
	 * serializeSrc121
	 */
	protected void serializeSrc121(BigDecimal src121) {
	       putNumber(beginSrc121,src121,SRC_121_LEN,SRC_121_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc121Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeSrc121
	 */
   	protected  BigDecimal serializeSrc121(char[] value) throws CFException {
        if (value.length < 13) value = pad(13, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(13,value,false/*isSigned?*/)
		       ,beginSrc121
		       ,13
		      );		 localSrc121Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,SRC_121_LEN,SRC_121_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("src121", beginSrc121,SRC_121_LEN);
    	}
    }
    /**
	 *	refreshSrc121 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc121() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginSrc121
			            ,SRC_121_LEN
			            ,SRC_121_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("src121", beginSrc121,SRC_121_LEN);
    }
   	}
     int localTgt121Counter = -1;
     
     public boolean isTgt121Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt121Counter != sharedCounter;
         localTgt121Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of tgt121
	 *	@return tgt121
	 */
	public char[]  getTgt121String() {
	    return getCharArray(beginTgt121,TGT_121_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt121IsNumeric() {
		    return isNumeric(beginTgt121
	                    ,beginTgt121 + TGT_121_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int TGT_121_LEN = 8;
  protected  static final int TGT_121_SCALE = 2;

   protected BigDecimal checkTgt121MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }

  	/**
	 * serializeTgt121
	 */
	protected void serializeTgt121(BigDecimal tgt121) {
	       putNumber(beginTgt121,tgt121,TGT_121_LEN,TGT_121_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt121Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeTgt121
	 */
   	protected  BigDecimal serializeTgt121(char[] value) throws CFException {
        if (value.length < 8) value = pad(8, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginTgt121
		       ,8
		      );		 localTgt121Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,TGT_121_LEN,TGT_121_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("tgt121", beginTgt121,TGT_121_LEN);
    	}
    }
    /**
	 *	refreshTgt121 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt121() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginTgt121
			            ,TGT_121_LEN
			            ,TGT_121_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt121", beginTgt121,TGT_121_LEN);
    }
   	}
     int localSrc122Counter = -1;
     
     public boolean isSrc122Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc122Counter != sharedCounter;
         localSrc122Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of src122
	 *	@return src122
	 */
	public char[]  getSrc122String() {
	    return getCharArray(beginSrc122,SRC_122_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src122IsNumeric() {
		    return isNumeric(beginSrc122
	                    ,beginSrc122 + SRC_122_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int SRC_122_LEN = 8;
  protected  static final int SRC_122_SCALE = 2;

   protected BigDecimal checkSrc122MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }

  	/**
	 * serializeSrc122
	 */
	protected void serializeSrc122(BigDecimal src122) {
	       putNumber(beginSrc122,src122,SRC_122_LEN,SRC_122_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc122Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeSrc122
	 */
   	protected  BigDecimal serializeSrc122(char[] value) throws CFException {
        if (value.length < 8) value = pad(8, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginSrc122
		       ,8
		      );		 localSrc122Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,SRC_122_LEN,SRC_122_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("src122", beginSrc122,SRC_122_LEN);
    	}
    }
    /**
	 *	refreshSrc122 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc122() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginSrc122
			            ,SRC_122_LEN
			            ,SRC_122_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("src122", beginSrc122,SRC_122_LEN);
    }
   	}
     int localTgt122Counter = -1;
     
     public boolean isTgt122Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt122Counter != sharedCounter;
         localTgt122Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of tgt122
	 *	@return tgt122
	 */
	public char[]  getTgt122String() {
	    return getCharArray(beginTgt122,TGT_122_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt122IsNumeric() {
		    return isNumeric(beginTgt122
	                    ,beginTgt122 + TGT_122_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int TGT_122_LEN = 14;
  protected  static final int TGT_122_SCALE = 4;

   protected BigDecimal checkTgt122MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,4/*scale*/,14/*precision*/);
   }

  	/**
	 * serializeTgt122
	 */
	protected void serializeTgt122(BigDecimal tgt122) {
	       putNumber(beginTgt122,tgt122,TGT_122_LEN,TGT_122_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt122Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeTgt122
	 */
   	protected  BigDecimal serializeTgt122(char[] value) throws CFException {
        if (value.length < 14) value = pad(14, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(14,value,false/*isSigned?*/)
		       ,beginTgt122
		       ,14
		      );		 localTgt122Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,TGT_122_LEN,TGT_122_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("tgt122", beginTgt122,TGT_122_LEN);
    	}
    }
    /**
	 *	refreshTgt122 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt122() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginTgt122
			            ,TGT_122_LEN
			            ,TGT_122_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt122", beginTgt122,TGT_122_LEN);
    }
   	}
         int localSrc123Counter = -1;
         public boolean isSrc123Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc123Counter != sharedCounter;
            localSrc123Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkSrc123MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     int localTgt123Counter = -1;
     public boolean isTgt123Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt123Counter != sharedCounter;
         localTgt123Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tgt123
	 *	@return tgt123
	 */
	public char[]  getTgt123String() {
	     return getCharArray(beginTgt123,TGT_123_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt123IsNumeric() {
	    return isNumeric(beginTgt123
	                    ,beginTgt123 + TGT_123_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TGT_123_LEN = 10;
  	/**
	 * serializeTgt123
	 */
	protected void serializeTgt123(long tgt123) {
		 putNumber(beginTgt123,tgt123,TGT_123_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt123Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTgt123
	 */
   	protected  long serializeTgt123(char[] value) {
	    long  tgt123;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tgt123 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginTgt123
		       ,10
		      );
		 localTgt123Counter = shareString.getSerializedField().getModifiedCounter();
		return  tgt123;
    }

   protected long checkTgt123MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTgt123 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTgt123() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTgt123
			                 ,TGT_123_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt123", beginTgt123,TGT_123_LEN);
    }
   	}
         int localSrc124Counter = -1;
         public boolean isSrc124Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc124Counter != sharedCounter;
            localSrc124Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSrc124MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
     int localTgt124Counter = -1;
     public boolean isTgt124Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt124Counter != sharedCounter;
         localTgt124Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tgt124
	 *	@return tgt124
	 */
	public char[]  getTgt124String() {
	     return getCharArray(beginTgt124,TGT_124_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt124IsNumeric() {
	    return isNumeric(beginTgt124
	                    ,beginTgt124 + TGT_124_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TGT_124_LEN = 10;
  	/**
	 * serializeTgt124
	 */
	protected void serializeTgt124(long tgt124) {
		 putNumber(beginTgt124,tgt124,TGT_124_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt124Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTgt124
	 */
   	protected  long serializeTgt124(char[] value) {
	    long  tgt124;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tgt124 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginTgt124
		       ,10
		      );
		 localTgt124Counter = shareString.getSerializedField().getModifiedCounter();
		return  tgt124;
    }

   protected long checkTgt124MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTgt124 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTgt124() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTgt124
			                 ,TGT_124_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt124", beginTgt124,TGT_124_LEN);
    }
   	}
         int localSrc125Counter = -1;
         public boolean isSrc125Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc125Counter != sharedCounter;
            localSrc125Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSrc125MaxLimit(long number) {
        return checkMaxLimit(number, true/*isSigned*/,8/*dataLen*/);
   }
     int localTgt125Counter = -1;
     public boolean isTgt125Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt125Counter != sharedCounter;
         localTgt125Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tgt125
	 *	@return tgt125
	 */
	public char[]  getTgt125String() {
	     return getCharArray(beginTgt125,TGT_125_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt125IsNumeric() {
	    return isNumeric(beginTgt125
	                    ,beginTgt125 + TGT_125_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TGT_125_LEN = 10;
  	/**
	 * serializeTgt125
	 */
	protected void serializeTgt125(long tgt125) {
		 putNumber(beginTgt125,tgt125,TGT_125_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt125Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTgt125
	 */
   	protected  long serializeTgt125(char[] value) {
	    long  tgt125;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tgt125 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginTgt125
		       ,10
		      );
		 localTgt125Counter = shareString.getSerializedField().getModifiedCounter();
		return  tgt125;
    }

   protected long checkTgt125MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTgt125 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTgt125() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTgt125
			                 ,TGT_125_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt125", beginTgt125,TGT_125_LEN);
    }
   	}
         int localSrc126Counter = -1;
         public boolean isSrc126Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc126Counter != sharedCounter;
            localSrc126Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSrc126MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,8/*dataLen*/);
   }
     int localTgt126Counter = -1;
     public boolean isTgt126Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt126Counter != sharedCounter;
         localTgt126Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tgt126
	 *	@return tgt126
	 */
	public char[]  getTgt126String() {
	     return getCharArray(beginTgt126,TGT_126_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt126IsNumeric() {
	    return isNumeric(beginTgt126
	                    ,beginTgt126 + TGT_126_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TGT_126_LEN = 10;
  	/**
	 * serializeTgt126
	 */
	protected void serializeTgt126(long tgt126) {
		 putNumber(beginTgt126,tgt126,TGT_126_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt126Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTgt126
	 */
   	protected  long serializeTgt126(char[] value) {
	    long  tgt126;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tgt126 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginTgt126
		       ,10
		      );
		 localTgt126Counter = shareString.getSerializedField().getModifiedCounter();
		return  tgt126;
    }

   protected long checkTgt126MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTgt126 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTgt126() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTgt126
			                 ,TGT_126_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt126", beginTgt126,TGT_126_LEN);
    }
   	}
         int localSrc127Counter = -1;
         public boolean isSrc127Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc127Counter != sharedCounter;
            localSrc127Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkSrc127MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     int localTgt127Counter = -1;
     public boolean isTgt127Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt127Counter != sharedCounter;
         localTgt127Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tgt127
	 *	@return tgt127
	 */
	public char[]  getTgt127String() {
	     return getCharArray(beginTgt127,TGT_127_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt127IsNumeric() {
	    return isNumeric(beginTgt127
	                    ,beginTgt127 + TGT_127_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TGT_127_LEN = 10;
  	/**
	 * serializeTgt127
	 */
	protected void serializeTgt127(long tgt127) {
		 putNumber(beginTgt127,tgt127,TGT_127_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt127Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTgt127
	 */
   	protected  long serializeTgt127(char[] value) {
	    long  tgt127;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tgt127 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginTgt127
		       ,10
		      );
		 localTgt127Counter = shareString.getSerializedField().getModifiedCounter();
		return  tgt127;
    }

   protected long checkTgt127MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTgt127 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTgt127() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTgt127
			                 ,TGT_127_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt127", beginTgt127,TGT_127_LEN);
    }
   	}
         int localSrc128Counter = -1;
         public boolean isSrc128Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc128Counter != sharedCounter;
            localSrc128Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkSrc128MaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     int localTgt128Counter = -1;
     public boolean isTgt128Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt128Counter != sharedCounter;
         localTgt128Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tgt128
	 *	@return tgt128
	 */
	public char[]  getTgt128String() {
	     return getCharArray(beginTgt128,TGT_128_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt128IsNumeric() {
	    return isNumeric(beginTgt128
	                    ,beginTgt128 + TGT_128_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TGT_128_LEN = 10;
  	/**
	 * serializeTgt128
	 */
	protected void serializeTgt128(long tgt128) {
		 putNumber(beginTgt128,tgt128,TGT_128_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt128Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTgt128
	 */
   	protected  long serializeTgt128(char[] value) {
	    long  tgt128;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tgt128 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginTgt128
		       ,10
		      );
		 localTgt128Counter = shareString.getSerializedField().getModifiedCounter();
		return  tgt128;
    }

   protected long checkTgt128MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTgt128 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTgt128() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTgt128
			                 ,TGT_128_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt128", beginTgt128,TGT_128_LEN);
    }
   	}
     int localSrc129Counter = -1;
     public boolean isSrc129Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc129Counter != sharedCounter;
         localSrc129Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of src129
	 *	@return src129
	 */
	public char[]  getSrc129String() {
	     return getCharArray(beginSrc129,SRC_129_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src129IsNumeric() {
	    return isNumeric(beginSrc129
	                    ,beginSrc129 + SRC_129_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SRC_129_LEN = 6;
  	/**
	 * serializeSrc129
	 */
	protected void serializeSrc129(long src129) {
		 putNumber(beginSrc129,src129,SRC_129_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc129Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSrc129
	 */
   	protected  long serializeSrc129(char[] value) {
	    long  src129;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    src129 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginSrc129
		       ,6
		      );
		 localSrc129Counter = shareString.getSerializedField().getModifiedCounter();
		return  src129;
    }

   protected long checkSrc129MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSrc129 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSrc129() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSrc129
			                 ,SRC_129_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("src129", beginSrc129,SRC_129_LEN);
    }
   	}
     int localTgt129Counter = -1;
     public boolean isTgt129Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt129Counter != sharedCounter;
         localTgt129Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tgt129
	 *	@return tgt129
	 */
	public char[]  getTgt129String() {
	     return getCharArray(beginTgt129,TGT_129_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt129IsNumeric() {
	    return isNumeric(beginTgt129
	                    ,beginTgt129 + TGT_129_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TGT_129_LEN = 10;
  	/**
	 * serializeTgt129
	 */
	protected void serializeTgt129(long tgt129) {
		 putNumber(beginTgt129,tgt129,TGT_129_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt129Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTgt129
	 */
   	protected  long serializeTgt129(char[] value) {
	    long  tgt129;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tgt129 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginTgt129
		       ,10
		      );
		 localTgt129Counter = shareString.getSerializedField().getModifiedCounter();
		return  tgt129;
    }

   protected long checkTgt129MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTgt129 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTgt129() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTgt129
			                 ,TGT_129_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt129", beginTgt129,TGT_129_LEN);
    }
   	}
     int localSrc130Counter = -1;
     public boolean isSrc130Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc130Counter != sharedCounter;
         localSrc130Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of src130
	 *	@return src130
	 */
	public char[]  getSrc130String() {
	     return getCharArray(beginSrc130,SRC_130_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src130IsNumeric() {
	    return isNumeric(beginSrc130
	                    ,beginSrc130 + SRC_130_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SRC_130_LEN = 6;
  	/**
	 * serializeSrc130
	 */
	protected void serializeSrc130(int src130) {
		 putNumber(beginSrc130,src130,SRC_130_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc130Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSrc130
	 */
   	protected  int serializeSrc130(char[] value) {
	    int  src130;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    src130 = (int) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,true/*isSigned?*/)
		       ,beginSrc130
		       ,6
		      );
		 localSrc130Counter = shareString.getSerializedField().getModifiedCounter();
		return  src130;
    }

   protected int checkSrc130MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1M/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshSrc130 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSrc130() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginSrc130
			                 ,SRC_130_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("src130", beginSrc130,SRC_130_LEN);
    }
   	}
     int localTgt130Counter = -1;
     public boolean isTgt130Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt130Counter != sharedCounter;
         localTgt130Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tgt130
	 *	@return tgt130
	 */
	public char[]  getTgt130String() {
	     return getCharArray(beginTgt130,TGT_130_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt130IsNumeric() {
	    return isNumeric(beginTgt130
	                    ,beginTgt130 + TGT_130_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TGT_130_LEN = 10;
  	/**
	 * serializeTgt130
	 */
	protected void serializeTgt130(long tgt130) {
		 putNumber(beginTgt130,tgt130,TGT_130_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt130Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTgt130
	 */
   	protected  long serializeTgt130(char[] value) {
	    long  tgt130;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tgt130 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginTgt130
		       ,10
		      );
		 localTgt130Counter = shareString.getSerializedField().getModifiedCounter();
		return  tgt130;
    }

   protected long checkTgt130MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTgt130 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTgt130() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTgt130
			                 ,TGT_130_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt130", beginTgt130,TGT_130_LEN);
    }
   	}
     int localSrc131Counter = -1;
     public boolean isSrc131Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc131Counter != sharedCounter;
         localSrc131Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of src131
	 *	@return src131
	 */
	public char[]  getSrc131String() {
	     return getCharArray(beginSrc131,SRC_131_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src131IsNumeric() {
	    return isNumeric(beginSrc131
	                    ,beginSrc131 + SRC_131_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SRC_131_LEN = 10;
  	/**
	 * serializeSrc131
	 */
	protected void serializeSrc131(long src131) {
		 putNumber(beginSrc131,src131,SRC_131_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc131Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSrc131
	 */
   	protected  long serializeSrc131(char[] value) {
	    long  src131;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    src131 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginSrc131
		       ,10
		      );
		 localSrc131Counter = shareString.getSerializedField().getModifiedCounter();
		return  src131;
    }

   protected long checkSrc131MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSrc131 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSrc131() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSrc131
			                 ,SRC_131_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("src131", beginSrc131,SRC_131_LEN);
    }
   	}
         int localTgt131Counter = -1;
         public boolean isTgt131Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt131Counter != sharedCounter;
            localTgt131Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkTgt131MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     int localSrc132Counter = -1;
     public boolean isSrc132Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc132Counter != sharedCounter;
         localSrc132Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of src132
	 *	@return src132
	 */
	public char[]  getSrc132String() {
	     return getCharArray(beginSrc132,SRC_132_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src132IsNumeric() {
	    return isNumeric(beginSrc132
	                    ,beginSrc132 + SRC_132_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SRC_132_LEN = 10;
  	/**
	 * serializeSrc132
	 */
	protected void serializeSrc132(long src132) {
		 putNumber(beginSrc132,src132,SRC_132_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc132Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSrc132
	 */
   	protected  long serializeSrc132(char[] value) {
	    long  src132;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    src132 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginSrc132
		       ,10
		      );
		 localSrc132Counter = shareString.getSerializedField().getModifiedCounter();
		return  src132;
    }

   protected long checkSrc132MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSrc132 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSrc132() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSrc132
			                 ,SRC_132_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("src132", beginSrc132,SRC_132_LEN);
    }
   	}
         int localTgt132Counter = -1;
         public boolean isTgt132Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt132Counter != sharedCounter;
            localTgt132Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkTgt132MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
     int localSrc133Counter = -1;
     public boolean isSrc133Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc133Counter != sharedCounter;
         localSrc133Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of src133
	 *	@return src133
	 */
	public char[]  getSrc133String() {
	     return getCharArray(beginSrc133,SRC_133_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src133IsNumeric() {
	    return isNumeric(beginSrc133
	                    ,beginSrc133 + SRC_133_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SRC_133_LEN = 10;
  	/**
	 * serializeSrc133
	 */
	protected void serializeSrc133(long src133) {
		 putNumber(beginSrc133,src133,SRC_133_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc133Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSrc133
	 */
   	protected  long serializeSrc133(char[] value) {
	    long  src133;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    src133 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginSrc133
		       ,10
		      );
		 localSrc133Counter = shareString.getSerializedField().getModifiedCounter();
		return  src133;
    }

   protected long checkSrc133MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSrc133 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSrc133() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSrc133
			                 ,SRC_133_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("src133", beginSrc133,SRC_133_LEN);
    }
   	}
         int localTgt133Counter = -1;
         public boolean isTgt133Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt133Counter != sharedCounter;
            localTgt133Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkTgt133MaxLimit(long number) {
        return checkMaxLimit(number, true/*isSigned*/,8/*dataLen*/);
   }
     int localSrc134Counter = -1;
     public boolean isSrc134Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc134Counter != sharedCounter;
         localSrc134Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of src134
	 *	@return src134
	 */
	public char[]  getSrc134String() {
	     return getCharArray(beginSrc134,SRC_134_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src134IsNumeric() {
	    return isNumeric(beginSrc134
	                    ,beginSrc134 + SRC_134_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SRC_134_LEN = 10;
  	/**
	 * serializeSrc134
	 */
	protected void serializeSrc134(long src134) {
		 putNumber(beginSrc134,src134,SRC_134_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc134Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSrc134
	 */
   	protected  long serializeSrc134(char[] value) {
	    long  src134;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    src134 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginSrc134
		       ,10
		      );
		 localSrc134Counter = shareString.getSerializedField().getModifiedCounter();
		return  src134;
    }

   protected long checkSrc134MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSrc134 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSrc134() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSrc134
			                 ,SRC_134_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("src134", beginSrc134,SRC_134_LEN);
    }
   	}
         int localTgt134Counter = -1;
         public boolean isTgt134Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt134Counter != sharedCounter;
            localTgt134Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkTgt134MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,8/*dataLen*/);
   }
     int localSrc135Counter = -1;
     public boolean isSrc135Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc135Counter != sharedCounter;
         localSrc135Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of src135
	 *	@return src135
	 */
	public char[]  getSrc135String() {
	     return getCharArray(beginSrc135,SRC_135_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src135IsNumeric() {
	    return isNumeric(beginSrc135
	                    ,beginSrc135 + SRC_135_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SRC_135_LEN = 10;
  	/**
	 * serializeSrc135
	 */
	protected void serializeSrc135(long src135) {
		 putNumber(beginSrc135,src135,SRC_135_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc135Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSrc135
	 */
   	protected  long serializeSrc135(char[] value) {
	    long  src135;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    src135 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginSrc135
		       ,10
		      );
		 localSrc135Counter = shareString.getSerializedField().getModifiedCounter();
		return  src135;
    }

   protected long checkSrc135MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSrc135 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSrc135() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSrc135
			                 ,SRC_135_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("src135", beginSrc135,SRC_135_LEN);
    }
   	}
         int localTgt135Counter = -1;
         public boolean isTgt135Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt135Counter != sharedCounter;
            localTgt135Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkTgt135MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     int localSrc136Counter = -1;
     public boolean isSrc136Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc136Counter != sharedCounter;
         localSrc136Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of src136
	 *	@return src136
	 */
	public char[]  getSrc136String() {
	     return getCharArray(beginSrc136,SRC_136_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src136IsNumeric() {
	    return isNumeric(beginSrc136
	                    ,beginSrc136 + SRC_136_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SRC_136_LEN = 10;
  	/**
	 * serializeSrc136
	 */
	protected void serializeSrc136(long src136) {
		 putNumber(beginSrc136,src136,SRC_136_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc136Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSrc136
	 */
   	protected  long serializeSrc136(char[] value) {
	    long  src136;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    src136 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginSrc136
		       ,10
		      );
		 localSrc136Counter = shareString.getSerializedField().getModifiedCounter();
		return  src136;
    }

   protected long checkSrc136MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSrc136 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSrc136() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSrc136
			                 ,SRC_136_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("src136", beginSrc136,SRC_136_LEN);
    }
   	}
         int localTgt136Counter = -1;
         public boolean isTgt136Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt136Counter != sharedCounter;
            localTgt136Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkTgt136MaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     int localSrc137Counter = -1;
     public boolean isSrc137Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc137Counter != sharedCounter;
         localSrc137Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of src137
	 *	@return src137
	 */
	public char[]  getSrc137String() {
	     return getCharArray(beginSrc137,SRC_137_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src137IsNumeric() {
	    return isNumeric(beginSrc137
	                    ,beginSrc137 + SRC_137_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SRC_137_LEN = 10;
  	/**
	 * serializeSrc137
	 */
	protected void serializeSrc137(long src137) {
		 putNumber(beginSrc137,src137,SRC_137_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc137Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSrc137
	 */
   	protected  long serializeSrc137(char[] value) {
	    long  src137;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    src137 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginSrc137
		       ,10
		      );
		 localSrc137Counter = shareString.getSerializedField().getModifiedCounter();
		return  src137;
    }

   protected long checkSrc137MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSrc137 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSrc137() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSrc137
			                 ,SRC_137_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("src137", beginSrc137,SRC_137_LEN);
    }
   	}
     int localTgt137Counter = -1;
     public boolean isTgt137Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt137Counter != sharedCounter;
         localTgt137Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tgt137
	 *	@return tgt137
	 */
	public char[]  getTgt137String() {
	     return getCharArray(beginTgt137,TGT_137_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt137IsNumeric() {
	    return isNumeric(beginTgt137
	                    ,beginTgt137 + TGT_137_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TGT_137_LEN = 6;
  	/**
	 * serializeTgt137
	 */
	protected void serializeTgt137(long tgt137) {
		 putNumber(beginTgt137,tgt137,TGT_137_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt137Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTgt137
	 */
   	protected  long serializeTgt137(char[] value) {
	    long  tgt137;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tgt137 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginTgt137
		       ,6
		      );
		 localTgt137Counter = shareString.getSerializedField().getModifiedCounter();
		return  tgt137;
    }

   protected long checkTgt137MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTgt137 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTgt137() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTgt137
			                 ,TGT_137_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt137", beginTgt137,TGT_137_LEN);
    }
   	}
     int localSrc138Counter = -1;
     public boolean isSrc138Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc138Counter != sharedCounter;
         localSrc138Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of src138
	 *	@return src138
	 */
	public char[]  getSrc138String() {
	     return getCharArray(beginSrc138,SRC_138_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src138IsNumeric() {
	    return isNumeric(beginSrc138
	                    ,beginSrc138 + SRC_138_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SRC_138_LEN = 10;
  	/**
	 * serializeSrc138
	 */
	protected void serializeSrc138(long src138) {
		 putNumber(beginSrc138,src138,SRC_138_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc138Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSrc138
	 */
   	protected  long serializeSrc138(char[] value) {
	    long  src138;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    src138 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginSrc138
		       ,10
		      );
		 localSrc138Counter = shareString.getSerializedField().getModifiedCounter();
		return  src138;
    }

   protected long checkSrc138MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSrc138 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSrc138() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSrc138
			                 ,SRC_138_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("src138", beginSrc138,SRC_138_LEN);
    }
   	}
     int localTgt138Counter = -1;
     public boolean isTgt138Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt138Counter != sharedCounter;
         localTgt138Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tgt138
	 *	@return tgt138
	 */
	public char[]  getTgt138String() {
	     return getCharArray(beginTgt138,TGT_138_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt138IsNumeric() {
	    return isNumeric(beginTgt138
	                    ,beginTgt138 + TGT_138_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TGT_138_LEN = 6;
  	/**
	 * serializeTgt138
	 */
	protected void serializeTgt138(int tgt138) {
		 putNumber(beginTgt138,tgt138,TGT_138_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt138Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTgt138
	 */
   	protected  int serializeTgt138(char[] value) {
	    int  tgt138;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tgt138 = (int) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,true/*isSigned?*/)
		       ,beginTgt138
		       ,6
		      );
		 localTgt138Counter = shareString.getSerializedField().getModifiedCounter();
		return  tgt138;
    }

   protected int checkTgt138MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1M/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshTgt138 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTgt138() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginTgt138
			                 ,TGT_138_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt138", beginTgt138,TGT_138_LEN);
    }
   	}
     int localSrc139Counter = -1;
     public boolean isSrc139Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc139Counter != sharedCounter;
         localSrc139Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of src139
	 *	@return src139
	 */
	public char[]  getSrc139String() {
	     return getCharArray(beginSrc139,SRC_139_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src139IsNumeric() {
	    return isNumeric(beginSrc139
	                    ,beginSrc139 + SRC_139_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SRC_139_LEN = 10;
  	/**
	 * serializeSrc139
	 */
	protected void serializeSrc139(long src139) {
		 putNumber(beginSrc139,src139,SRC_139_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc139Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSrc139
	 */
   	protected  long serializeSrc139(char[] value) {
	    long  src139;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    src139 = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,true/*isSigned?*/)
		       ,beginSrc139
		       ,10
		      );
		 localSrc139Counter = shareString.getSerializedField().getModifiedCounter();
		return  src139;
    }

   protected long checkSrc139MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshSrc139 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSrc139() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSrc139
			                 ,SRC_139_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("src139", beginSrc139,SRC_139_LEN);
    }
   	}
         int localTgt139Counter = -1;
         public boolean isTgt139Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt139Counter != sharedCounter;
            localTgt139Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkTgt139MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     int localSrc140Counter = -1;
     public boolean isSrc140Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc140Counter != sharedCounter;
         localSrc140Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of src140
	 *	@return src140
	 */
	public char[]  getSrc140String() {
	     return getCharArray(beginSrc140,SRC_140_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src140IsNumeric() {
	    return isNumeric(beginSrc140
	                    ,beginSrc140 + SRC_140_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SRC_140_LEN = 10;
  	/**
	 * serializeSrc140
	 */
	protected void serializeSrc140(long src140) {
		 putNumber(beginSrc140,src140,SRC_140_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc140Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSrc140
	 */
   	protected  long serializeSrc140(char[] value) {
	    long  src140;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    src140 = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,true/*isSigned?*/)
		       ,beginSrc140
		       ,10
		      );
		 localSrc140Counter = shareString.getSerializedField().getModifiedCounter();
		return  src140;
    }

   protected long checkSrc140MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshSrc140 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSrc140() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSrc140
			                 ,SRC_140_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("src140", beginSrc140,SRC_140_LEN);
    }
   	}
         int localTgt140Counter = -1;
         public boolean isTgt140Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt140Counter != sharedCounter;
            localTgt140Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkTgt140MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
     int localSrc141Counter = -1;
     public boolean isSrc141Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc141Counter != sharedCounter;
         localSrc141Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of src141
	 *	@return src141
	 */
	public char[]  getSrc141String() {
	     return getCharArray(beginSrc141,SRC_141_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src141IsNumeric() {
	    return isNumeric(beginSrc141
	                    ,beginSrc141 + SRC_141_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SRC_141_LEN = 10;
  	/**
	 * serializeSrc141
	 */
	protected void serializeSrc141(long src141) {
		 putNumber(beginSrc141,src141,SRC_141_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc141Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSrc141
	 */
   	protected  long serializeSrc141(char[] value) {
	    long  src141;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    src141 = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,true/*isSigned?*/)
		       ,beginSrc141
		       ,10
		      );
		 localSrc141Counter = shareString.getSerializedField().getModifiedCounter();
		return  src141;
    }

   protected long checkSrc141MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshSrc141 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSrc141() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSrc141
			                 ,SRC_141_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("src141", beginSrc141,SRC_141_LEN);
    }
   	}
         int localTgt141Counter = -1;
         public boolean isTgt141Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt141Counter != sharedCounter;
            localTgt141Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkTgt141MaxLimit(long number) {
        return checkMaxLimit(number, true/*isSigned*/,8/*dataLen*/);
   }
     int localSrc142Counter = -1;
     public boolean isSrc142Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc142Counter != sharedCounter;
         localSrc142Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of src142
	 *	@return src142
	 */
	public char[]  getSrc142String() {
	     return getCharArray(beginSrc142,SRC_142_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src142IsNumeric() {
	    return isNumeric(beginSrc142
	                    ,beginSrc142 + SRC_142_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SRC_142_LEN = 10;
  	/**
	 * serializeSrc142
	 */
	protected void serializeSrc142(long src142) {
		 putNumber(beginSrc142,src142,SRC_142_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc142Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSrc142
	 */
   	protected  long serializeSrc142(char[] value) {
	    long  src142;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    src142 = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,true/*isSigned?*/)
		       ,beginSrc142
		       ,10
		      );
		 localSrc142Counter = shareString.getSerializedField().getModifiedCounter();
		return  src142;
    }

   protected long checkSrc142MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshSrc142 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSrc142() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSrc142
			                 ,SRC_142_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("src142", beginSrc142,SRC_142_LEN);
    }
   	}
         int localTgt142Counter = -1;
         public boolean isTgt142Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt142Counter != sharedCounter;
            localTgt142Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkTgt142MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,8/*dataLen*/);
   }
     int localSrc143Counter = -1;
     public boolean isSrc143Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc143Counter != sharedCounter;
         localSrc143Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of src143
	 *	@return src143
	 */
	public char[]  getSrc143String() {
	     return getCharArray(beginSrc143,SRC_143_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src143IsNumeric() {
	    return isNumeric(beginSrc143
	                    ,beginSrc143 + SRC_143_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SRC_143_LEN = 10;
  	/**
	 * serializeSrc143
	 */
	protected void serializeSrc143(long src143) {
		 putNumber(beginSrc143,src143,SRC_143_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc143Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSrc143
	 */
   	protected  long serializeSrc143(char[] value) {
	    long  src143;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    src143 = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,true/*isSigned?*/)
		       ,beginSrc143
		       ,10
		      );
		 localSrc143Counter = shareString.getSerializedField().getModifiedCounter();
		return  src143;
    }

   protected long checkSrc143MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshSrc143 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSrc143() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSrc143
			                 ,SRC_143_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("src143", beginSrc143,SRC_143_LEN);
    }
   	}
         int localTgt143Counter = -1;
         public boolean isTgt143Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt143Counter != sharedCounter;
            localTgt143Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkTgt143MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     int localSrc144Counter = -1;
     public boolean isSrc144Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc144Counter != sharedCounter;
         localSrc144Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of src144
	 *	@return src144
	 */
	public char[]  getSrc144String() {
	     return getCharArray(beginSrc144,SRC_144_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src144IsNumeric() {
	    return isNumeric(beginSrc144
	                    ,beginSrc144 + SRC_144_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SRC_144_LEN = 10;
  	/**
	 * serializeSrc144
	 */
	protected void serializeSrc144(long src144) {
		 putNumber(beginSrc144,src144,SRC_144_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc144Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSrc144
	 */
   	protected  long serializeSrc144(char[] value) {
	    long  src144;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    src144 = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,true/*isSigned?*/)
		       ,beginSrc144
		       ,10
		      );
		 localSrc144Counter = shareString.getSerializedField().getModifiedCounter();
		return  src144;
    }

   protected long checkSrc144MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshSrc144 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSrc144() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSrc144
			                 ,SRC_144_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("src144", beginSrc144,SRC_144_LEN);
    }
   	}
         int localTgt144Counter = -1;
         public boolean isTgt144Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt144Counter != sharedCounter;
            localTgt144Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkTgt144MaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     int localSrc145Counter = -1;
     public boolean isSrc145Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc145Counter != sharedCounter;
         localSrc145Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of src145
	 *	@return src145
	 */
	public char[]  getSrc145String() {
	     return getCharArray(beginSrc145,SRC_145_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src145IsNumeric() {
	    return isNumeric(beginSrc145
	                    ,beginSrc145 + SRC_145_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SRC_145_LEN = 10;
  	/**
	 * serializeSrc145
	 */
	protected void serializeSrc145(long src145) {
		 putNumber(beginSrc145,src145,SRC_145_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc145Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSrc145
	 */
   	protected  long serializeSrc145(char[] value) {
	    long  src145;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    src145 = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,true/*isSigned?*/)
		       ,beginSrc145
		       ,10
		      );
		 localSrc145Counter = shareString.getSerializedField().getModifiedCounter();
		return  src145;
    }

   protected long checkSrc145MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshSrc145 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSrc145() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSrc145
			                 ,SRC_145_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("src145", beginSrc145,SRC_145_LEN);
    }
   	}
     int localTgt145Counter = -1;
     public boolean isTgt145Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt145Counter != sharedCounter;
         localTgt145Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tgt145
	 *	@return tgt145
	 */
	public char[]  getTgt145String() {
	     return getCharArray(beginTgt145,TGT_145_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt145IsNumeric() {
	    return isNumeric(beginTgt145
	                    ,beginTgt145 + TGT_145_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TGT_145_LEN = 6;
  	/**
	 * serializeTgt145
	 */
	protected void serializeTgt145(long tgt145) {
		 putNumber(beginTgt145,tgt145,TGT_145_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt145Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTgt145
	 */
   	protected  long serializeTgt145(char[] value) {
	    long  tgt145;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tgt145 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginTgt145
		       ,6
		      );
		 localTgt145Counter = shareString.getSerializedField().getModifiedCounter();
		return  tgt145;
    }

   protected long checkTgt145MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTgt145 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTgt145() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTgt145
			                 ,TGT_145_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt145", beginTgt145,TGT_145_LEN);
    }
   	}
     int localSrc146Counter = -1;
     public boolean isSrc146Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc146Counter != sharedCounter;
         localSrc146Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of src146
	 *	@return src146
	 */
	public char[]  getSrc146String() {
	     return getCharArray(beginSrc146,SRC_146_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src146IsNumeric() {
	    return isNumeric(beginSrc146
	                    ,beginSrc146 + SRC_146_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SRC_146_LEN = 10;
  	/**
	 * serializeSrc146
	 */
	protected void serializeSrc146(long src146) {
		 putNumber(beginSrc146,src146,SRC_146_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc146Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSrc146
	 */
   	protected  long serializeSrc146(char[] value) {
	    long  src146;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    src146 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginSrc146
		       ,10
		      );
		 localSrc146Counter = shareString.getSerializedField().getModifiedCounter();
		return  src146;
    }

   protected long checkSrc146MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSrc146 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSrc146() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSrc146
			                 ,SRC_146_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("src146", beginSrc146,SRC_146_LEN);
    }
   	}
     int localTgt146Counter = -1;
     public boolean isTgt146Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt146Counter != sharedCounter;
         localTgt146Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tgt146
	 *	@return tgt146
	 */
	public char[]  getTgt146String() {
	     return getCharArray(beginTgt146,TGT_146_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt146IsNumeric() {
	    return isNumeric(beginTgt146
	                    ,beginTgt146 + TGT_146_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TGT_146_LEN = 6;
  	/**
	 * serializeTgt146
	 */
	protected void serializeTgt146(int tgt146) {
		 putNumber(beginTgt146,tgt146,TGT_146_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt146Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTgt146
	 */
   	protected  int serializeTgt146(char[] value) {
	    int  tgt146;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tgt146 = (int) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,true/*isSigned?*/)
		       ,beginTgt146
		       ,6
		      );
		 localTgt146Counter = shareString.getSerializedField().getModifiedCounter();
		return  tgt146;
    }

   protected int checkTgt146MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1M/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshTgt146 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTgt146() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginTgt146
			                 ,TGT_146_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt146", beginTgt146,TGT_146_LEN);
    }
   	}
         int localSrc147Counter = -1;
         public boolean isSrc147Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc147Counter != sharedCounter;
            localSrc147Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkSrc147MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     int localTgt147Counter = -1;
     public boolean isTgt147Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt147Counter != sharedCounter;
         localTgt147Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tgt147
	 *	@return tgt147
	 */
	public char[]  getTgt147String() {
	     return getCharArray(beginTgt147,TGT_147_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt147IsNumeric() {
	    return isNumeric(beginTgt147
	                    ,beginTgt147 + TGT_147_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TGT_147_LEN = 10;
  	/**
	 * serializeTgt147
	 */
	protected void serializeTgt147(long tgt147) {
		 putNumber(beginTgt147,tgt147,TGT_147_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt147Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTgt147
	 */
   	protected  long serializeTgt147(char[] value) {
	    long  tgt147;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tgt147 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginTgt147
		       ,10
		      );
		 localTgt147Counter = shareString.getSerializedField().getModifiedCounter();
		return  tgt147;
    }

   protected long checkTgt147MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTgt147 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTgt147() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTgt147
			                 ,TGT_147_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt147", beginTgt147,TGT_147_LEN);
    }
   	}
     int localTgt148Counter = -1;
     public boolean isTgt148Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt148Counter != sharedCounter;
         localTgt148Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tgt148
	 *	@return tgt148
	 */
	public char[]  getTgt148String() {
	     return getCharArray(beginTgt148,TGT_148_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt148IsNumeric() {
	    return isNumeric(beginTgt148
	                    ,beginTgt148 + TGT_148_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TGT_148_LEN = 10;
  	/**
	 * serializeTgt148
	 */
	protected void serializeTgt148(long tgt148) {
		 putNumber(beginTgt148,tgt148,TGT_148_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt148Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTgt148
	 */
   	protected  long serializeTgt148(char[] value) {
	    long  tgt148;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tgt148 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginTgt148
		       ,10
		      );
		 localTgt148Counter = shareString.getSerializedField().getModifiedCounter();
		return  tgt148;
    }

   protected long checkTgt148MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTgt148 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTgt148() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTgt148
			                 ,TGT_148_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt148", beginTgt148,TGT_148_LEN);
    }
   	}
         int localSrc149Counter = -1;
         public boolean isSrc149Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc149Counter != sharedCounter;
            localSrc149Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkSrc149MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localSrc151Counter = -1;
         public boolean isSrc151Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc151Counter != sharedCounter;
            localSrc151Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkSrc151MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     int localTgt151Counter = -1;
     public boolean isTgt151Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt151Counter != sharedCounter;
         localTgt151Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tgt151
	 *	@return tgt151
	 */
	public char[]  getTgt151String() {
	     return getCharArray(beginTgt151,TGT_151_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt151IsNumeric() {
	    return isNumeric(beginTgt151
	                    ,beginTgt151 + TGT_151_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TGT_151_LEN = 10;
  	/**
	 * serializeTgt151
	 */
	protected void serializeTgt151(long tgt151) {
		 putNumber(beginTgt151,tgt151,TGT_151_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt151Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTgt151
	 */
   	protected  long serializeTgt151(char[] value) {
	    long  tgt151;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tgt151 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginTgt151
		       ,10
		      );
		 localTgt151Counter = shareString.getSerializedField().getModifiedCounter();
		return  tgt151;
    }

   protected long checkTgt151MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTgt151 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTgt151() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTgt151
			                 ,TGT_151_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt151", beginTgt151,TGT_151_LEN);
    }
   	}
     int localTgt152Counter = -1;
     public boolean isTgt152Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt152Counter != sharedCounter;
         localTgt152Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tgt152
	 *	@return tgt152
	 */
	public char[]  getTgt152String() {
	     return getCharArray(beginTgt152,TGT_152_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt152IsNumeric() {
	    return isNumeric(beginTgt152
	                    ,beginTgt152 + TGT_152_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TGT_152_LEN = 10;
  	/**
	 * serializeTgt152
	 */
	protected void serializeTgt152(long tgt152) {
		 putNumber(beginTgt152,tgt152,TGT_152_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt152Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTgt152
	 */
   	protected  long serializeTgt152(char[] value) {
	    long  tgt152;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tgt152 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginTgt152
		       ,10
		      );
		 localTgt152Counter = shareString.getSerializedField().getModifiedCounter();
		return  tgt152;
    }

   protected long checkTgt152MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTgt152 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTgt152() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTgt152
			                 ,TGT_152_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt152", beginTgt152,TGT_152_LEN);
    }
   	}
         int localSrc153Counter = -1;
         public boolean isSrc153Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc153Counter != sharedCounter;
            localSrc153Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkSrc153MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
        int localSrc155Counter = -1;
        public boolean isSrc155Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localSrc155Counter != sharedCounter;
           localSrc155Counter = sharedCounter; return hasModified; 
        }
	    public boolean src155IsNumeric() {
	      return decimalIsNumeric(beginSrc155,SRC_155_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] src155String() {
            return getPackedString(beginSrc155,SRC_155_LEN);
         }
   protected static final int SRC_155_LEN = 4;
   protected static final int SRC_155_SCALE = 2;
  	/**
	 * 	serializeSrc155
	 */
	protected void serializeSrc155(BigDecimal src155) {
		   putDecimal(beginSrc155,src155,SRC_155_LEN,SRC_155_SCALE,true);
		 localSrc155Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkSrc155MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,7/*precision*/);
   }
     /**
	 *	refreshSrc155 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc155() throws CFException {	
   	try { 
		 return (getDecimal(beginSrc155,SRC_155_LEN,SRC_155_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("src155", beginSrc155,SRC_155_LEN);
     }
   	}
     int localTgt155Counter = -1;
     public boolean isTgt155Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt155Counter != sharedCounter;
         localTgt155Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tgt155
	 *	@return tgt155
	 */
	public char[]  getTgt155String() {
	     return getCharArray(beginTgt155,TGT_155_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt155IsNumeric() {
	    return isNumeric(beginTgt155
	                    ,beginTgt155 + TGT_155_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TGT_155_LEN = 10;
  	/**
	 * serializeTgt155
	 */
	protected void serializeTgt155(long tgt155) {
		 putNumber(beginTgt155,tgt155,TGT_155_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt155Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTgt155
	 */
   	protected  long serializeTgt155(char[] value) {
	    long  tgt155;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tgt155 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginTgt155
		       ,10
		      );
		 localTgt155Counter = shareString.getSerializedField().getModifiedCounter();
		return  tgt155;
    }

   protected long checkTgt155MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTgt155 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTgt155() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTgt155
			                 ,TGT_155_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt155", beginTgt155,TGT_155_LEN);
    }
   	}
     int localTgt156Counter = -1;
     public boolean isTgt156Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt156Counter != sharedCounter;
         localTgt156Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tgt156
	 *	@return tgt156
	 */
	public char[]  getTgt156String() {
	     return getCharArray(beginTgt156,TGT_156_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt156IsNumeric() {
	    return isNumeric(beginTgt156
	                    ,beginTgt156 + TGT_156_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TGT_156_LEN = 10;
  	/**
	 * serializeTgt156
	 */
	protected void serializeTgt156(long tgt156) {
		 putNumber(beginTgt156,tgt156,TGT_156_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt156Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTgt156
	 */
   	protected  long serializeTgt156(char[] value) {
	    long  tgt156;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tgt156 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginTgt156
		       ,10
		      );
		 localTgt156Counter = shareString.getSerializedField().getModifiedCounter();
		return  tgt156;
    }

   protected long checkTgt156MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTgt156 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTgt156() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTgt156
			                 ,TGT_156_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt156", beginTgt156,TGT_156_LEN);
    }
   	}
        int localSrc157Counter = -1;
        public boolean isSrc157Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localSrc157Counter != sharedCounter;
           localSrc157Counter = sharedCounter; return hasModified; 
        }
	    public boolean src157IsNumeric() {
	      return decimalIsNumeric(beginSrc157,SRC_157_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] src157String() {
            return getPackedString(beginSrc157,SRC_157_LEN);
         }
   protected static final int SRC_157_LEN = 4;
   protected static final int SRC_157_SCALE = 2;
  	/**
	 * 	serializeSrc157
	 */
	protected void serializeSrc157(BigDecimal src157) {
		   putDecimal(beginSrc157,src157,SRC_157_LEN,SRC_157_SCALE,true);
		 localSrc157Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkSrc157MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,7/*precision*/);
   }
     /**
	 *	refreshSrc157 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc157() throws CFException {	
   	try { 
		 return (getDecimal(beginSrc157,SRC_157_LEN,SRC_157_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("src157", beginSrc157,SRC_157_LEN);
     }
   	}
     int localSrc159Counter = -1;
     
     public boolean isSrc159Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc159Counter != sharedCounter;
         localSrc159Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of src159
	 *	@return src159
	 */
	public char[]  getSrc159String() {
	    return getCharArray(beginSrc159,SRC_159_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src159IsNumeric() {
		    return isNumeric(beginSrc159
	                    ,beginSrc159 + SRC_159_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int SRC_159_LEN = 7;
  protected  static final int SRC_159_SCALE = 2;

   protected BigDecimal checkSrc159MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,7/*precision*/);
   }

  	/**
	 * serializeSrc159
	 */
	protected void serializeSrc159(BigDecimal src159) {
	       putNumber(beginSrc159,src159,SRC_159_LEN,SRC_159_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc159Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeSrc159
	 */
   	protected  BigDecimal serializeSrc159(char[] value) throws CFException {
        if (value.length < 7) value = pad(7, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(7,value,false/*isSigned?*/)
		       ,beginSrc159
		       ,7
		      );		 localSrc159Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,SRC_159_LEN,SRC_159_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("src159", beginSrc159,SRC_159_LEN);
    	}
    }
    /**
	 *	refreshSrc159 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc159() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginSrc159
			            ,SRC_159_LEN
			            ,SRC_159_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("src159", beginSrc159,SRC_159_LEN);
    }
   	}
     int localTgt159Counter = -1;
     public boolean isTgt159Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt159Counter != sharedCounter;
         localTgt159Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tgt159
	 *	@return tgt159
	 */
	public char[]  getTgt159String() {
	     return getCharArray(beginTgt159,TGT_159_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt159IsNumeric() {
	    return isNumeric(beginTgt159
	                    ,beginTgt159 + TGT_159_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TGT_159_LEN = 10;
  	/**
	 * serializeTgt159
	 */
	protected void serializeTgt159(long tgt159) {
		 putNumber(beginTgt159,tgt159,TGT_159_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt159Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTgt159
	 */
   	protected  long serializeTgt159(char[] value) {
	    long  tgt159;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tgt159 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginTgt159
		       ,10
		      );
		 localTgt159Counter = shareString.getSerializedField().getModifiedCounter();
		return  tgt159;
    }

   protected long checkTgt159MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTgt159 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTgt159() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTgt159
			                 ,TGT_159_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt159", beginTgt159,TGT_159_LEN);
    }
   	}
     int localSrc160Counter = -1;
     
     public boolean isSrc160Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc160Counter != sharedCounter;
         localSrc160Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of src160
	 *	@return src160
	 */
	public char[]  getSrc160String() {
	    return getCharArray(beginSrc160,SRC_160_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src160IsNumeric() {
		    return isNumeric(beginSrc160
	                    ,beginSrc160 + SRC_160_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int SRC_160_LEN = 7;
  protected  static final int SRC_160_SCALE = 2;

   protected BigDecimal checkSrc160MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,7/*precision*/);
   }

  	/**
	 * serializeSrc160
	 */
	protected void serializeSrc160(BigDecimal src160) {
	       putNumber(beginSrc160,src160,SRC_160_LEN,SRC_160_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc160Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeSrc160
	 */
   	protected  BigDecimal serializeSrc160(char[] value) throws CFException {
        if (value.length < 7) value = pad(7, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(7,value,false/*isSigned?*/)
		       ,beginSrc160
		       ,7
		      );		 localSrc160Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,SRC_160_LEN,SRC_160_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("src160", beginSrc160,SRC_160_LEN);
    	}
    }
    /**
	 *	refreshSrc160 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc160() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginSrc160
			            ,SRC_160_LEN
			            ,SRC_160_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("src160", beginSrc160,SRC_160_LEN);
    }
   	}
     int localTgt160Counter = -1;
     public boolean isTgt160Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt160Counter != sharedCounter;
         localTgt160Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tgt160
	 *	@return tgt160
	 */
	public char[]  getTgt160String() {
	     return getCharArray(beginTgt160,TGT_160_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt160IsNumeric() {
	    return isNumeric(beginTgt160
	                    ,beginTgt160 + TGT_160_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TGT_160_LEN = 10;
  	/**
	 * serializeTgt160
	 */
	protected void serializeTgt160(long tgt160) {
		 putNumber(beginTgt160,tgt160,TGT_160_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt160Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTgt160
	 */
   	protected  long serializeTgt160(char[] value) {
	    long  tgt160;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tgt160 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginTgt160
		       ,10
		      );
		 localTgt160Counter = shareString.getSerializedField().getModifiedCounter();
		return  tgt160;
    }

   protected long checkTgt160MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTgt160 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTgt160() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTgt160
			                 ,TGT_160_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt160", beginTgt160,TGT_160_LEN);
    }
   	}
     int localSrc161Counter = -1;
     
     public boolean isSrc161Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc161Counter != sharedCounter;
         localSrc161Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of src161
	 *	@return src161
	 */
	public char[]  getSrc161String() {
	    return getCharArray(beginSrc161,SRC_161_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src161IsNumeric() {
		    return isNumeric(beginSrc161
	                    ,beginSrc161 + SRC_161_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int SRC_161_LEN = 7;
  protected  static final int SRC_161_SCALE = 2;

   protected BigDecimal checkSrc161MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,7/*precision*/);
   }

  	/**
	 * serializeSrc161
	 */
	protected void serializeSrc161(BigDecimal src161) {
	       putNumber(beginSrc161,src161,SRC_161_LEN,SRC_161_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc161Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeSrc161
	 */
   	protected  BigDecimal serializeSrc161(char[] value) throws CFException {
        if (value.length < 7) value = pad(7, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(7,value,false/*isSigned?*/)
		       ,beginSrc161
		       ,7
		      );		 localSrc161Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,SRC_161_LEN,SRC_161_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("src161", beginSrc161,SRC_161_LEN);
    	}
    }
    /**
	 *	refreshSrc161 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc161() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginSrc161
			            ,SRC_161_LEN
			            ,SRC_161_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("src161", beginSrc161,SRC_161_LEN);
    }
   	}
     int localSrc162Counter = -1;
     
     public boolean isSrc162Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc162Counter != sharedCounter;
         localSrc162Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of src162
	 *	@return src162
	 */
	public char[]  getSrc162String() {
	    return getCharArray(beginSrc162,SRC_162_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src162IsNumeric() {
		    return isNumeric(beginSrc162
	                    ,beginSrc162 + SRC_162_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int SRC_162_LEN = 7;
  protected  static final int SRC_162_SCALE = 2;

   protected BigDecimal checkSrc162MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,7/*precision*/);
   }

  	/**
	 * serializeSrc162
	 */
	protected void serializeSrc162(BigDecimal src162) {
	       putNumber(beginSrc162,src162,SRC_162_LEN,SRC_162_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc162Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeSrc162
	 */
   	protected  BigDecimal serializeSrc162(char[] value) throws CFException {
        if (value.length < 7) value = pad(7, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(7,value,false/*isSigned?*/)
		       ,beginSrc162
		       ,7
		      );		 localSrc162Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,SRC_162_LEN,SRC_162_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("src162", beginSrc162,SRC_162_LEN);
    	}
    }
    /**
	 *	refreshSrc162 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc162() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginSrc162
			            ,SRC_162_LEN
			            ,SRC_162_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("src162", beginSrc162,SRC_162_LEN);
    }
   	}
     int localSrc163Counter = -1;
     public boolean isSrc163Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc163Counter != sharedCounter;
         localSrc163Counter = sharedCounter; return hasModified;
     }
	protected static final int SRC_163_LEN = 5;
	/**
	 * 	serialize this Src163
	 */
   protected void serializeSrc163(char[] src163) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(src163,0,getStringValue(),beginSrc163,SRC_163_LEN);
       localSrc163Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSrc163Constraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshSrc163 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSrc163() {	 
   		return (substring(getStringValue(),beginSrc163,beginSrc163 + SRC_163_LEN));
   	}
     int localTgt163Counter = -1;
     public boolean isTgt163Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt163Counter != sharedCounter;
         localTgt163Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tgt163
	 *	@return tgt163
	 */
	public char[]  getTgt163String() {
	     return getCharArray(beginTgt163,TGT_163_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt163IsNumeric() {
	    return isNumeric(beginTgt163
	                    ,beginTgt163 + TGT_163_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TGT_163_LEN = 10;
  	/**
	 * serializeTgt163
	 */
	protected void serializeTgt163(long tgt163) {
		 putNumber(beginTgt163,tgt163,TGT_163_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt163Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTgt163
	 */
   	protected  long serializeTgt163(char[] value) {
	    long  tgt163;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tgt163 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginTgt163
		       ,10
		      );
		 localTgt163Counter = shareString.getSerializedField().getModifiedCounter();
		return  tgt163;
    }

   protected long checkTgt163MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTgt163 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTgt163() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTgt163
			                 ,TGT_163_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt163", beginTgt163,TGT_163_LEN);
    }
   	}
     int localTgt164Counter = -1;
     public boolean isTgt164Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt164Counter != sharedCounter;
         localTgt164Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tgt164
	 *	@return tgt164
	 */
	public char[]  getTgt164String() {
	     return getCharArray(beginTgt164,TGT_164_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt164IsNumeric() {
	    return isNumeric(beginTgt164
	                    ,beginTgt164 + TGT_164_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TGT_164_LEN = 10;
  	/**
	 * serializeTgt164
	 */
	protected void serializeTgt164(long tgt164) {
		 putNumber(beginTgt164,tgt164,TGT_164_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt164Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTgt164
	 */
   	protected  long serializeTgt164(char[] value) {
	    long  tgt164;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tgt164 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginTgt164
		       ,10
		      );
		 localTgt164Counter = shareString.getSerializedField().getModifiedCounter();
		return  tgt164;
    }

   protected long checkTgt164MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTgt164 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTgt164() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTgt164
			                 ,TGT_164_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt164", beginTgt164,TGT_164_LEN);
    }
   	}
     int localSrc165Counter = -1;
     public boolean isSrc165Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc165Counter != sharedCounter;
         localSrc165Counter = sharedCounter; return hasModified;
     }
	protected static final int SRC_165_LEN = 5;
	/**
	 * 	serialize this Src165
	 */
   protected void serializeSrc165(char[] src165) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(src165,0,getStringValue(),beginSrc165,SRC_165_LEN);
       localSrc165Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSrc165Constraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshSrc165 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSrc165() {	 
   		return (substring(getStringValue(),beginSrc165,beginSrc165 + SRC_165_LEN));
   	}
         int localSrc167Counter = -1;
         public boolean isSrc167Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc167Counter != sharedCounter;
            localSrc167Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkSrc167MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     int localTgt167Counter = -1;
     public boolean isTgt167Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt167Counter != sharedCounter;
         localTgt167Counter = sharedCounter; return hasModified;
     }
	protected static final int TGT_167_LEN = 6;
	/**
	 * 	serialize this Tgt167
	 */
   protected void serializeTgt167(char[] tgt167) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tgt167,0,getStringValue(),beginTgt167,TGT_167_LEN);
       localTgt167Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTgt167Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshTgt167 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTgt167() {	 
   		return (substring(getStringValue(),beginTgt167,beginTgt167 + TGT_167_LEN));
   	}
         int localSrc168Counter = -1;
         public boolean isSrc168Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc168Counter != sharedCounter;
            localSrc168Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkSrc168MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localTgt168Counter = -1;
         public boolean isTgt168Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt168Counter != sharedCounter;
            localTgt168Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkTgt168MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localSrc169Counter = -1;
         public boolean isSrc169Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc169Counter != sharedCounter;
            localSrc169Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkSrc169MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localTgt169Counter = -1;
         public boolean isTgt169Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt169Counter != sharedCounter;
            localTgt169Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkTgt169MaxLimit(long number) {
        return checkMaxLimit(number, true/*isSigned*/,8/*dataLen*/);
   }
         int localSrc170Counter = -1;
         public boolean isSrc170Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc170Counter != sharedCounter;
            localSrc170Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkSrc170MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localTgt170Counter = -1;
         public boolean isTgt170Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt170Counter != sharedCounter;
            localTgt170Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkTgt170MaxLimit(long number) {
        return checkMaxLimit(number, true/*isSigned*/,8/*dataLen*/);
   }
         int localSrc171Counter = -1;
         public boolean isSrc171Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc171Counter != sharedCounter;
            localSrc171Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkSrc171MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localTgt171Counter = -1;
         public boolean isTgt171Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt171Counter != sharedCounter;
            localTgt171Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkTgt171MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localSrc172Counter = -1;
         public boolean isSrc172Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc172Counter != sharedCounter;
            localSrc172Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkSrc172MaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     int localTgt172Counter = -1;
     public boolean isTgt172Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt172Counter != sharedCounter;
         localTgt172Counter = sharedCounter; return hasModified;
     }
	protected static final int TGT_172_LEN = 6;
	/**
	 * 	serialize this Tgt172
	 */
   protected void serializeTgt172(char[] tgt172) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tgt172,0,getStringValue(),beginTgt172,TGT_172_LEN);
       localTgt172Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTgt172Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshTgt172 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTgt172() {	 
   		return (substring(getStringValue(),beginTgt172,beginTgt172 + TGT_172_LEN));
   	}
         int localSrc173Counter = -1;
         public boolean isSrc173Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc173Counter != sharedCounter;
            localSrc173Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkSrc173MaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
         int localTgt173Counter = -1;
         public boolean isTgt173Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt173Counter != sharedCounter;
            localTgt173Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkTgt173MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localSrc174Counter = -1;
         public boolean isSrc174Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc174Counter != sharedCounter;
            localSrc174Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkSrc174MaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
         int localTgt174Counter = -1;
         public boolean isTgt174Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt174Counter != sharedCounter;
            localTgt174Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkTgt174MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,8/*dataLen*/);
   }
         int localSrc175Counter = -1;
         public boolean isSrc175Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc175Counter != sharedCounter;
            localSrc175Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSrc175MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localTgt175Counter = -1;
         public boolean isTgt175Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt175Counter != sharedCounter;
            localTgt175Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkTgt175MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,8/*dataLen*/);
   }
         int localSrc176Counter = -1;
         public boolean isSrc176Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc176Counter != sharedCounter;
            localSrc176Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSrc176MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localTgt176Counter = -1;
         public boolean isTgt176Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt176Counter != sharedCounter;
            localTgt176Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkTgt176MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localSrc177Counter = -1;
         public boolean isSrc177Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc177Counter != sharedCounter;
            localSrc177Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkSrc177MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     int localTgt177Counter = -1;
     public boolean isTgt177Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt177Counter != sharedCounter;
         localTgt177Counter = sharedCounter; return hasModified;
     }
	protected static final int TGT_177_LEN = 7;
	/**
	 * 	serialize this Tgt177
	 */
   protected void serializeTgt177(char[] tgt177) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tgt177,0,getStringValue(),beginTgt177,TGT_177_LEN);
       localTgt177Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTgt177Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshTgt177 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTgt177() {	 
   		return (substring(getStringValue(),beginTgt177,beginTgt177 + TGT_177_LEN));
   	}
         int localSrc178Counter = -1;
         public boolean isSrc178Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc178Counter != sharedCounter;
            localSrc178Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkSrc178MaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     int localTgt178Counter = -1;
     public boolean isTgt178Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt178Counter != sharedCounter;
         localTgt178Counter = sharedCounter; return hasModified;
     }
	protected static final int TGT_178_LEN = 7;
	/**
	 * 	serialize this Tgt178
	 */
   protected void serializeTgt178(char[] tgt178) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tgt178,0,getStringValue(),beginTgt178,TGT_178_LEN);
       localTgt178Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTgt178Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshTgt178 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTgt178() {	 
   		return (substring(getStringValue(),beginTgt178,beginTgt178 + TGT_178_LEN));
   	}
         int localSrc179Counter = -1;
         public boolean isSrc179Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc179Counter != sharedCounter;
            localSrc179Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkSrc179MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     int localTgt179Counter = -1;
     public boolean isTgt179Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt179Counter != sharedCounter;
         localTgt179Counter = sharedCounter; return hasModified;
     }
	protected static final int TGT_179_LEN = 7;
	/**
	 * 	serialize this Tgt179
	 */
   protected void serializeTgt179(char[] tgt179) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tgt179,0,getStringValue(),beginTgt179,TGT_179_LEN);
       localTgt179Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTgt179Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshTgt179 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTgt179() {	 
   		return (substring(getStringValue(),beginTgt179,beginTgt179 + TGT_179_LEN));
   	}
         int localSrc180Counter = -1;
         public boolean isSrc180Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc180Counter != sharedCounter;
            localSrc180Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSrc180MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
     int localTgt180Counter = -1;
     public boolean isTgt180Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt180Counter != sharedCounter;
         localTgt180Counter = sharedCounter; return hasModified;
     }
	protected static final int TGT_180_LEN = 11;
	/**
	 * 	serialize this Tgt180
	 */
   protected void serializeTgt180(char[] tgt180) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tgt180,0,getStringValue(),beginTgt180,TGT_180_LEN);
       localTgt180Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTgt180Constraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshTgt180 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTgt180() {	 
   		return (substring(getStringValue(),beginTgt180,beginTgt180 + TGT_180_LEN));
   	}
         int localSrc181Counter = -1;
         public boolean isSrc181Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc181Counter != sharedCounter;
            localSrc181Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkSrc181MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     int localTgt181Counter = -1;
     public boolean isTgt181Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt181Counter != sharedCounter;
         localTgt181Counter = sharedCounter; return hasModified;
     }
	protected static final int TGT_181_LEN = 11;
	/**
	 * 	serialize this Tgt181
	 */
   protected void serializeTgt181(char[] tgt181) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tgt181,0,getStringValue(),beginTgt181,TGT_181_LEN);
       localTgt181Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTgt181Constraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshTgt181 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTgt181() {	 
   		return (substring(getStringValue(),beginTgt181,beginTgt181 + TGT_181_LEN));
   	}
        int localSrc182Counter = -1;
        public boolean isSrc182Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localSrc182Counter != sharedCounter;
           localSrc182Counter = sharedCounter; return hasModified; 
        }
	    public boolean src182IsNumeric() {
	      return decimalIsNumeric(beginSrc182,SRC_182_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] src182String() {
            return getPackedString(beginSrc182,SRC_182_LEN);
         }
   protected static final int SRC_182_LEN = 8;
   protected static final int SRC_182_SCALE = 6;
  	/**
	 * 	serializeSrc182
	 */
	protected void serializeSrc182(BigDecimal src182) {
		   putDecimal(beginSrc182,src182,SRC_182_LEN,SRC_182_SCALE,true);
		 localSrc182Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkSrc182MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,6/*scale*/,14/*precision*/);
   }
     /**
	 *	refreshSrc182 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc182() throws CFException {	
   	try { 
		 return (getDecimal(beginSrc182,SRC_182_LEN,SRC_182_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("src182", beginSrc182,SRC_182_LEN);
     }
   	}
     int localTgt182Counter = -1;
     
     public boolean isTgt182Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt182Counter != sharedCounter;
         localTgt182Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of tgt182
	 *	@return tgt182
	 */
	public char[]  getTgt182String() {
	    return getCharArray(beginTgt182,TGT_182_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt182IsNumeric() {
		    return isNumeric(beginTgt182
	                    ,beginTgt182 + TGT_182_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int TGT_182_LEN = 10;
  protected  static final int TGT_182_SCALE = 3;

   protected BigDecimal checkTgt182MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,3/*scale*/,10/*precision*/);
   }

  	/**
	 * serializeTgt182
	 */
	protected void serializeTgt182(BigDecimal tgt182) {
	       putNumber(beginTgt182,tgt182,TGT_182_LEN,TGT_182_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt182Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeTgt182
	 */
   	protected  BigDecimal serializeTgt182(char[] value) throws CFException {
        if (value.length < 10) value = pad(10, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(10,value,true/*isSigned?*/)
		       ,beginTgt182
		       ,10
		      );		 localTgt182Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,TGT_182_LEN,TGT_182_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("tgt182", beginTgt182,TGT_182_LEN);
    	}
    }
    /**
	 *	refreshTgt182 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt182() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginTgt182
			            ,TGT_182_LEN
			            ,TGT_182_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt182", beginTgt182,TGT_182_LEN);
    }
   	}
     int localSrc183Counter = -1;
     
     public boolean isSrc183Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc183Counter != sharedCounter;
         localSrc183Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of src183
	 *	@return src183
	 */
	public char[]  getSrc183String() {
	    return getCharArray(beginSrc183,SRC_183_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src183IsNumeric() {
		    return isNumeric(beginSrc183
	                    ,beginSrc183 + SRC_183_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int SRC_183_LEN = 14;
  protected  static final int SRC_183_SCALE = 6;

   protected BigDecimal checkSrc183MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,6/*scale*/,14/*precision*/);
   }

  	/**
	 * serializeSrc183
	 */
	protected void serializeSrc183(BigDecimal src183) {
	       putNumber(beginSrc183,src183,SRC_183_LEN,SRC_183_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc183Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeSrc183
	 */
   	protected  BigDecimal serializeSrc183(char[] value) throws CFException {
        if (value.length < 14) value = pad(14, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(14,value,true/*isSigned?*/)
		       ,beginSrc183
		       ,14
		      );		 localSrc183Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,SRC_183_LEN,SRC_183_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("src183", beginSrc183,SRC_183_LEN);
    	}
    }
    /**
	 *	refreshSrc183 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc183() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginSrc183
			            ,SRC_183_LEN
			            ,SRC_183_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("src183", beginSrc183,SRC_183_LEN);
    }
   	}
        int localTgt183Counter = -1;
        public boolean isTgt183Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTgt183Counter != sharedCounter;
           localTgt183Counter = sharedCounter; return hasModified; 
        }
	    public boolean tgt183IsNumeric() {
	      return decimalIsNumeric(beginTgt183,TGT_183_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tgt183String() {
            return getPackedString(beginTgt183,TGT_183_LEN);
         }
   protected static final int TGT_183_LEN = 6;
   protected static final int TGT_183_SCALE = 3;
  	/**
	 * 	serializeTgt183
	 */
	protected void serializeTgt183(BigDecimal tgt183) {
		   putDecimal(beginTgt183,tgt183,TGT_183_LEN,TGT_183_SCALE,true);
		 localTgt183Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTgt183MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,3/*scale*/,10/*precision*/);
   }
     /**
	 *	refreshTgt183 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt183() throws CFException {	
   	try { 
		 return (getDecimal(beginTgt183,TGT_183_LEN,TGT_183_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("tgt183", beginTgt183,TGT_183_LEN);
     }
   	}
     int localSrc184Counter = -1;
     
     public boolean isSrc184Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc184Counter != sharedCounter;
         localSrc184Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of src184
	 *	@return src184
	 */
	public char[]  getSrc184String() {
	    return getCharArray(beginSrc184,SRC_184_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src184IsNumeric() {
		    return isNumeric(beginSrc184
	                    ,beginSrc184 + SRC_184_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int SRC_184_LEN = 14;
  protected  static final int SRC_184_SCALE = 6;

   protected BigDecimal checkSrc184MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,6/*scale*/,14/*precision*/);
   }

  	/**
	 * serializeSrc184
	 */
	protected void serializeSrc184(BigDecimal src184) {
	       putNumber(beginSrc184,src184,SRC_184_LEN,SRC_184_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc184Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeSrc184
	 */
   	protected  BigDecimal serializeSrc184(char[] value) throws CFException {
        if (value.length < 14) value = pad(14, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(14,value,true/*isSigned?*/)
		       ,beginSrc184
		       ,14
		      );		 localSrc184Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,SRC_184_LEN,SRC_184_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("src184", beginSrc184,SRC_184_LEN);
    	}
    }
    /**
	 *	refreshSrc184 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc184() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginSrc184
			            ,SRC_184_LEN
			            ,SRC_184_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("src184", beginSrc184,SRC_184_LEN);
    }
   	}
         int localTgt184Counter = -1;
         public boolean isTgt184Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt184Counter != sharedCounter;
            localTgt184Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkTgt184MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
        int localSrc185Counter = -1;
        public boolean isSrc185Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localSrc185Counter != sharedCounter;
           localSrc185Counter = sharedCounter; return hasModified; 
        }
	    public boolean src185IsNumeric() {
	      return decimalIsNumeric(beginSrc185,SRC_185_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] src185String() {
            return getPackedString(beginSrc185,SRC_185_LEN);
         }
   protected static final int SRC_185_LEN = 8;
   protected static final int SRC_185_SCALE = 6;
  	/**
	 * 	serializeSrc185
	 */
	protected void serializeSrc185(BigDecimal src185) {
		   putDecimal(beginSrc185,src185,SRC_185_LEN,SRC_185_SCALE,true);
		 localSrc185Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkSrc185MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,6/*scale*/,14/*precision*/);
   }
     /**
	 *	refreshSrc185 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc185() throws CFException {	
   	try { 
		 return (getDecimal(beginSrc185,SRC_185_LEN,SRC_185_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("src185", beginSrc185,SRC_185_LEN);
     }
   	}
         int localTgt185Counter = -1;
         public boolean isTgt185Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt185Counter != sharedCounter;
            localTgt185Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkTgt185MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
        int localSrc186Counter = -1;
        public boolean isSrc186Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localSrc186Counter != sharedCounter;
           localSrc186Counter = sharedCounter; return hasModified; 
        }
	    public boolean src186IsNumeric() {
	      return decimalIsNumeric(beginSrc186,SRC_186_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] src186String() {
            return getPackedString(beginSrc186,SRC_186_LEN);
         }
   protected static final int SRC_186_LEN = 8;
   protected static final int SRC_186_SCALE = 6;
  	/**
	 * 	serializeSrc186
	 */
	protected void serializeSrc186(BigDecimal src186) {
		   putDecimal(beginSrc186,src186,SRC_186_LEN,SRC_186_SCALE,true);
		 localSrc186Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkSrc186MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,6/*scale*/,14/*precision*/);
   }
     /**
	 *	refreshSrc186 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc186() throws CFException {	
   	try { 
		 return (getDecimal(beginSrc186,SRC_186_LEN,SRC_186_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("src186", beginSrc186,SRC_186_LEN);
     }
   	}
         int localTgt186Counter = -1;
         public boolean isTgt186Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt186Counter != sharedCounter;
            localTgt186Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkTgt186MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
        int localSrc187Counter = -1;
        public boolean isSrc187Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localSrc187Counter != sharedCounter;
           localSrc187Counter = sharedCounter; return hasModified; 
        }
	    public boolean src187IsNumeric() {
	      return decimalIsNumeric(beginSrc187,SRC_187_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] src187String() {
            return getPackedString(beginSrc187,SRC_187_LEN);
         }
   protected static final int SRC_187_LEN = 8;
   protected static final int SRC_187_SCALE = 6;
  	/**
	 * 	serializeSrc187
	 */
	protected void serializeSrc187(BigDecimal src187) {
		   putDecimal(beginSrc187,src187,SRC_187_LEN,SRC_187_SCALE,true);
		 localSrc187Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkSrc187MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,6/*scale*/,14/*precision*/);
   }
     /**
	 *	refreshSrc187 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc187() throws CFException {	
   	try { 
		 return (getDecimal(beginSrc187,SRC_187_LEN,SRC_187_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("src187", beginSrc187,SRC_187_LEN);
     }
   	}
         int localTgt187Counter = -1;
         public boolean isTgt187Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt187Counter != sharedCounter;
            localTgt187Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkTgt187MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     int localSrc188Counter = -1;
     
     public boolean isSrc188Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc188Counter != sharedCounter;
         localSrc188Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of src188
	 *	@return src188
	 */
	public char[]  getSrc188String() {
	    return getCharArray(beginSrc188,SRC_188_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src188IsNumeric() {
		    return isNumeric(beginSrc188
	                    ,beginSrc188 + SRC_188_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int SRC_188_LEN = 14;
  protected  static final int SRC_188_SCALE = 6;

   protected BigDecimal checkSrc188MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,6/*scale*/,14/*precision*/);
   }

  	/**
	 * serializeSrc188
	 */
	protected void serializeSrc188(BigDecimal src188) {
	       putNumber(beginSrc188,src188,SRC_188_LEN,SRC_188_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc188Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeSrc188
	 */
   	protected  BigDecimal serializeSrc188(char[] value) throws CFException {
        if (value.length < 14) value = pad(14, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(14,value,true/*isSigned?*/)
		       ,beginSrc188
		       ,14
		      );		 localSrc188Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,SRC_188_LEN,SRC_188_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("src188", beginSrc188,SRC_188_LEN);
    	}
    }
    /**
	 *	refreshSrc188 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc188() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginSrc188
			            ,SRC_188_LEN
			            ,SRC_188_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("src188", beginSrc188,SRC_188_LEN);
    }
   	}
         int localTgt188Counter = -1;
         public boolean isTgt188Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt188Counter != sharedCounter;
            localTgt188Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkTgt188MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     int localSrc189Counter = -1;
     
     public boolean isSrc189Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc189Counter != sharedCounter;
         localSrc189Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of src189
	 *	@return src189
	 */
	public char[]  getSrc189String() {
	    return getCharArray(beginSrc189,SRC_189_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src189IsNumeric() {
		    return isNumeric(beginSrc189
	                    ,beginSrc189 + SRC_189_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int SRC_189_LEN = 14;
  protected  static final int SRC_189_SCALE = 6;

   protected BigDecimal checkSrc189MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,6/*scale*/,14/*precision*/);
   }

  	/**
	 * serializeSrc189
	 */
	protected void serializeSrc189(BigDecimal src189) {
	       putNumber(beginSrc189,src189,SRC_189_LEN,SRC_189_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc189Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeSrc189
	 */
   	protected  BigDecimal serializeSrc189(char[] value) throws CFException {
        if (value.length < 14) value = pad(14, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(14,value,true/*isSigned?*/)
		       ,beginSrc189
		       ,14
		      );		 localSrc189Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,SRC_189_LEN,SRC_189_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("src189", beginSrc189,SRC_189_LEN);
    	}
    }
    /**
	 *	refreshSrc189 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc189() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginSrc189
			            ,SRC_189_LEN
			            ,SRC_189_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("src189", beginSrc189,SRC_189_LEN);
    }
   	}
         int localTgt189Counter = -1;
         public boolean isTgt189Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt189Counter != sharedCounter;
            localTgt189Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkTgt189MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     int localSrc190Counter = -1;
     
     public boolean isSrc190Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc190Counter != sharedCounter;
         localSrc190Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of src190
	 *	@return src190
	 */
	public char[]  getSrc190String() {
	    return getCharArray(beginSrc190,SRC_190_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src190IsNumeric() {
		    return isNumeric(beginSrc190
	                    ,beginSrc190 + SRC_190_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int SRC_190_LEN = 14;
  protected  static final int SRC_190_SCALE = 6;

   protected BigDecimal checkSrc190MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,6/*scale*/,14/*precision*/);
   }

  	/**
	 * serializeSrc190
	 */
	protected void serializeSrc190(BigDecimal src190) {
	       putNumber(beginSrc190,src190,SRC_190_LEN,SRC_190_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc190Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeSrc190
	 */
   	protected  BigDecimal serializeSrc190(char[] value) throws CFException {
        if (value.length < 14) value = pad(14, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(14,value,true/*isSigned?*/)
		       ,beginSrc190
		       ,14
		      );		 localSrc190Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,SRC_190_LEN,SRC_190_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("src190", beginSrc190,SRC_190_LEN);
    	}
    }
    /**
	 *	refreshSrc190 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc190() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginSrc190
			            ,SRC_190_LEN
			            ,SRC_190_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("src190", beginSrc190,SRC_190_LEN);
    }
   	}
         int localTgt190Counter = -1;
         public boolean isTgt190Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt190Counter != sharedCounter;
            localTgt190Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkTgt190MaxLimit(long number) {
        return checkMaxLimit(number, true/*isSigned*/,8/*dataLen*/);
   }
     int localSrc191Counter = -1;
     
     public boolean isSrc191Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc191Counter != sharedCounter;
         localSrc191Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of src191
	 *	@return src191
	 */
	public char[]  getSrc191String() {
	    return getCharArray(beginSrc191,SRC_191_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src191IsNumeric() {
		    return isNumeric(beginSrc191
	                    ,beginSrc191 + SRC_191_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int SRC_191_LEN = 14;
  protected  static final int SRC_191_SCALE = 6;

   protected BigDecimal checkSrc191MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,6/*scale*/,14/*precision*/);
   }

  	/**
	 * serializeSrc191
	 */
	protected void serializeSrc191(BigDecimal src191) {
	       putNumber(beginSrc191,src191,SRC_191_LEN,SRC_191_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc191Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeSrc191
	 */
   	protected  BigDecimal serializeSrc191(char[] value) throws CFException {
        if (value.length < 14) value = pad(14, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(14,value,true/*isSigned?*/)
		       ,beginSrc191
		       ,14
		      );		 localSrc191Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,SRC_191_LEN,SRC_191_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("src191", beginSrc191,SRC_191_LEN);
    	}
    }
    /**
	 *	refreshSrc191 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc191() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginSrc191
			            ,SRC_191_LEN
			            ,SRC_191_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("src191", beginSrc191,SRC_191_LEN);
    }
   	}
         int localTgt191Counter = -1;
         public boolean isTgt191Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt191Counter != sharedCounter;
            localTgt191Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkTgt191MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     int localSrc192Counter = -1;
     
     public boolean isSrc192Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc192Counter != sharedCounter;
         localSrc192Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of src192
	 *	@return src192
	 */
	public char[]  getSrc192String() {
	    return getCharArray(beginSrc192,SRC_192_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src192IsNumeric() {
		    return isNumeric(beginSrc192
	                    ,beginSrc192 + SRC_192_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int SRC_192_LEN = 14;
  protected  static final int SRC_192_SCALE = 6;

   protected BigDecimal checkSrc192MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,6/*scale*/,14/*precision*/);
   }

  	/**
	 * serializeSrc192
	 */
	protected void serializeSrc192(BigDecimal src192) {
	       putNumber(beginSrc192,src192,SRC_192_LEN,SRC_192_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc192Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeSrc192
	 */
   	protected  BigDecimal serializeSrc192(char[] value) throws CFException {
        if (value.length < 14) value = pad(14, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(14,value,true/*isSigned?*/)
		       ,beginSrc192
		       ,14
		      );		 localSrc192Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,SRC_192_LEN,SRC_192_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("src192", beginSrc192,SRC_192_LEN);
    	}
    }
    /**
	 *	refreshSrc192 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc192() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginSrc192
			            ,SRC_192_LEN
			            ,SRC_192_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("src192", beginSrc192,SRC_192_LEN);
    }
   	}
     int localTgt192Counter = -1;
     public boolean isTgt192Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt192Counter != sharedCounter;
         localTgt192Counter = sharedCounter; return hasModified;
     }
	protected static final int TGT_192_LEN = 10;
	/**
	 * 	serialize this Tgt192
	 */
   protected void serializeTgt192(char[] tgt192) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tgt192,0,getStringValue(),beginTgt192,TGT_192_LEN);
       localTgt192Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTgt192Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshTgt192 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTgt192() {	 
   		return (substring(getStringValue(),beginTgt192,beginTgt192 + TGT_192_LEN));
   	}
        int localSrc193Counter = -1;
        public boolean isSrc193Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localSrc193Counter != sharedCounter;
           localSrc193Counter = sharedCounter; return hasModified; 
        }
	    public boolean src193IsNumeric() {
	      return decimalIsNumeric(beginSrc193,SRC_193_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] src193String() {
            return getPackedString(beginSrc193,SRC_193_LEN);
         }
   protected static final int SRC_193_LEN = 8;
   protected static final int SRC_193_SCALE = 6;
  	/**
	 * 	serializeSrc193
	 */
	protected void serializeSrc193(BigDecimal src193) {
		   putDecimal(beginSrc193,src193,SRC_193_LEN,SRC_193_SCALE,true);
		 localSrc193Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkSrc193MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,6/*scale*/,14/*precision*/);
   }
     /**
	 *	refreshSrc193 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc193() throws CFException {	
   	try { 
		 return (getDecimal(beginSrc193,SRC_193_LEN,SRC_193_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("src193", beginSrc193,SRC_193_LEN);
     }
   	}
     int localTgt193Counter = -1;
     public boolean isTgt193Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt193Counter != sharedCounter;
         localTgt193Counter = sharedCounter; return hasModified;
     }
	protected static final int TGT_193_LEN = 10;
	/**
	 * 	serialize this Tgt193
	 */
   protected void serializeTgt193(char[] tgt193) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tgt193,0,getStringValue(),beginTgt193,TGT_193_LEN);
       localTgt193Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTgt193Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshTgt193 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTgt193() {	 
   		return (substring(getStringValue(),beginTgt193,beginTgt193 + TGT_193_LEN));
   	}
     int localSrc194Counter = -1;
     public boolean isSrc194Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc194Counter != sharedCounter;
         localSrc194Counter = sharedCounter; return hasModified;
     }
	protected static final int SRC_194_LEN = 16;
	/**
	 * 	serialize this Src194
	 */
   protected void serializeSrc194(char[] src194) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(src194,0,getStringValue(),beginSrc194,SRC_194_LEN);
       localSrc194Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSrc194Constraints(char[] value) {
   			return super.checkConstraints(value , 16 ,false, false);
   }
    /**
	 *	refreshSrc194 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSrc194() {	 
   		return (substring(getStringValue(),beginSrc194,beginSrc194 + SRC_194_LEN));
   	}
     int localTgt194Counter = -1;
     public boolean isTgt194Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt194Counter != sharedCounter;
         localTgt194Counter = sharedCounter; return hasModified;
     }
	protected static final int TGT_194_LEN = 10;
	/**
	 * 	serialize this Tgt194
	 */
   protected void serializeTgt194(char[] tgt194) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tgt194,0,getStringValue(),beginTgt194,TGT_194_LEN);
       localTgt194Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTgt194Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshTgt194 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTgt194() {	 
   		return (substring(getStringValue(),beginTgt194,beginTgt194 + TGT_194_LEN));
   	}
     int localSrc195Counter = -1;
     public boolean isSrc195Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc195Counter != sharedCounter;
         localSrc195Counter = sharedCounter; return hasModified;
     }
	protected static final int SRC_195_LEN = 16;
	/**
	 * 	serialize this Src195
	 */
   protected void serializeSrc195(char[] src195) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(src195,0,getStringValue(),beginSrc195,SRC_195_LEN);
       localSrc195Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSrc195Constraints(char[] value) {
   			return super.checkConstraints(value , 16 ,false, false);
   }
    /**
	 *	refreshSrc195 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSrc195() {	 
   		return (substring(getStringValue(),beginSrc195,beginSrc195 + SRC_195_LEN));
   	}
     int localTgt195Counter = -1;
     
     public boolean isTgt195Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt195Counter != sharedCounter;
         localTgt195Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of tgt195
	 *	@return tgt195
	 */
	public char[]  getTgt195String() {
	    return getCharArray(beginTgt195,TGT_195_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt195IsNumeric() {
		    return isNumeric(beginTgt195
	                    ,beginTgt195 + TGT_195_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int TGT_195_LEN = 14;
  protected  static final int TGT_195_SCALE = 6;

   protected BigDecimal checkTgt195MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,6/*scale*/,14/*precision*/);
   }

  	/**
	 * serializeTgt195
	 */
	protected void serializeTgt195(BigDecimal tgt195) {
	       putNumber(beginTgt195,tgt195,TGT_195_LEN,TGT_195_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt195Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeTgt195
	 */
   	protected  BigDecimal serializeTgt195(char[] value) throws CFException {
        if (value.length < 14) value = pad(14, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(14,value,true/*isSigned?*/)
		       ,beginTgt195
		       ,14
		      );		 localTgt195Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,TGT_195_LEN,TGT_195_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("tgt195", beginTgt195,TGT_195_LEN);
    	}
    }
    /**
	 *	refreshTgt195 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt195() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginTgt195
			            ,TGT_195_LEN
			            ,TGT_195_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt195", beginTgt195,TGT_195_LEN);
    }
   	}
     int localSrc196Counter = -1;
     public boolean isSrc196Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc196Counter != sharedCounter;
         localSrc196Counter = sharedCounter; return hasModified;
     }
	protected static final int SRC_196_LEN = 16;
	/**
	 * 	serialize this Src196
	 */
   protected void serializeSrc196(char[] src196) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(src196,0,getStringValue(),beginSrc196,SRC_196_LEN);
       localSrc196Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSrc196Constraints(char[] value) {
   			return super.checkConstraints(value , 16 ,false, false);
   }
    /**
	 *	refreshSrc196 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSrc196() {	 
   		return (substring(getStringValue(),beginSrc196,beginSrc196 + SRC_196_LEN));
   	}
        int localTgt196Counter = -1;
        public boolean isTgt196Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTgt196Counter != sharedCounter;
           localTgt196Counter = sharedCounter; return hasModified; 
        }
	    public boolean tgt196IsNumeric() {
	      return decimalIsNumeric(beginTgt196,TGT_196_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tgt196String() {
            return getPackedString(beginTgt196,TGT_196_LEN);
         }
   protected static final int TGT_196_LEN = 8;
   protected static final int TGT_196_SCALE = 6;
  	/**
	 * 	serializeTgt196
	 */
	protected void serializeTgt196(BigDecimal tgt196) {
		   putDecimal(beginTgt196,tgt196,TGT_196_LEN,TGT_196_SCALE,true);
		 localTgt196Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTgt196MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,6/*scale*/,14/*precision*/);
   }
     /**
	 *	refreshTgt196 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt196() throws CFException {	
   	try { 
		 return (getDecimal(beginTgt196,TGT_196_LEN,TGT_196_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("tgt196", beginTgt196,TGT_196_LEN);
     }
   	}
         int localSrc197Counter = -1;
         public boolean isSrc197Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc197Counter != sharedCounter;
            localSrc197Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkSrc197MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     int localTgt197Counter = -1;
     public boolean isTgt197Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt197Counter != sharedCounter;
         localTgt197Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tgt197
	 *	@return tgt197
	 */
	public char[]  getTgt197String() {
	     return getCharArray(beginTgt197,TGT_197_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt197IsNumeric() {
	    return isNumeric(beginTgt197
	                    ,beginTgt197 + TGT_197_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TGT_197_LEN = 5;
  	/**
	 * serializeTgt197
	 */
	protected void serializeTgt197(long tgt197) {
		 putNumber(beginTgt197,tgt197,TGT_197_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt197Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTgt197
	 */
   	protected  long serializeTgt197(char[] value) {
	    long  tgt197;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tgt197 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginTgt197
		       ,5
		      );
		 localTgt197Counter = shareString.getSerializedField().getModifiedCounter();
		return  tgt197;
    }

   protected long checkTgt197MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTgt197 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTgt197() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTgt197
			                 ,TGT_197_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt197", beginTgt197,TGT_197_LEN);
    }
   	}
     int localTgt198Counter = -1;
     public boolean isTgt198Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt198Counter != sharedCounter;
         localTgt198Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tgt198
	 *	@return tgt198
	 */
	public char[]  getTgt198String() {
	     return getCharArray(beginTgt198,TGT_198_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt198IsNumeric() {
	    return isNumeric(beginTgt198
	                    ,beginTgt198 + TGT_198_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TGT_198_LEN = 5;
  	/**
	 * serializeTgt198
	 */
	protected void serializeTgt198(long tgt198) {
		 putNumber(beginTgt198,tgt198,TGT_198_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt198Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTgt198
	 */
   	protected  long serializeTgt198(char[] value) {
	    long  tgt198;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tgt198 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginTgt198
		       ,5
		      );
		 localTgt198Counter = shareString.getSerializedField().getModifiedCounter();
		return  tgt198;
    }

   protected long checkTgt198MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTgt198 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTgt198() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTgt198
			                 ,TGT_198_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt198", beginTgt198,TGT_198_LEN);
    }
   	}
         int localSrc199Counter = -1;
         public boolean isSrc199Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc199Counter != sharedCounter;
            localSrc199Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkSrc199MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     int localSrc201Counter = -1;
     public boolean isSrc201Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc201Counter != sharedCounter;
         localSrc201Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of src201
	 *	@return src201
	 */
	public char[]  getSrc201String() {
	     return getCharArray(beginSrc201,SRC_201_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src201IsNumeric() {
	    return isNumeric(beginSrc201
	                    ,beginSrc201 + SRC_201_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SRC_201_LEN = 10;
  	/**
	 * serializeSrc201
	 */
	protected void serializeSrc201(long src201) {
		 putNumber(beginSrc201,src201,SRC_201_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc201Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSrc201
	 */
   	protected  long serializeSrc201(char[] value) {
	    long  src201;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    src201 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginSrc201
		       ,10
		      );
		 localSrc201Counter = shareString.getSerializedField().getModifiedCounter();
		return  src201;
    }

   protected long checkSrc201MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSrc201 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSrc201() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSrc201
			                 ,SRC_201_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("src201", beginSrc201,SRC_201_LEN);
    }
   	}
     int localTgt201Counter = -1;
     public boolean isTgt201Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt201Counter != sharedCounter;
         localTgt201Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTgt201Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
         int localNperCounter = -1;
         public boolean isNperModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localNperCounter != sharedCounter;
            localNperCounter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkNperMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     int localNperInvCounter = -1;
     public boolean isNperInvModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNperInvCounter != sharedCounter;
         localNperInvCounter = sharedCounter; return hasModified; 
     }
	/**
	 * 	serialize this NperInv
	 */
   protected void serializeNperInv(BigDecimal nperInv) {	
		shareString.getSerializedField().incrementCounter();
		putComp1(beginNperInv, nperInv);
		localNperInvCounter = shareString.getSerializedField().getModifiedCounter();
   }
     /**
	 *	refreshNperInv is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serilization as well
	 */ 
   	protected BigDecimal refreshNperInv() {
		return getComp1(beginNperInv);
	}
     int localTempResL1Counter = -1;
     public boolean isTempResL1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTempResL1Counter != sharedCounter;
         localTempResL1Counter = sharedCounter; return hasModified;          
     }
	/**
	 * 	serialize this TempResL1
	 */
   protected void serializeTempResL1(BigDecimal tempResL1) {	
		shareString.getSerializedField().incrementCounter();
	 	putComp2(beginTempResL1, tempResL1);
		localTempResL1Counter = shareString.getSerializedField().getModifiedCounter();
   }
     /**
	 *	refreshTempResL1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serilization as well
	 */ 
   	protected BigDecimal refreshTempResL1() {
	 	return getComp2(beginTempResL1);
	}
     int localTempResL2Counter = -1;
     public boolean isTempResL2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTempResL2Counter != sharedCounter;
         localTempResL2Counter = sharedCounter; return hasModified;          
     }
	/**
	 * 	serialize this TempResL2
	 */
   protected void serializeTempResL2(BigDecimal tempResL2) {	
		shareString.getSerializedField().incrementCounter();
	 	putComp2(beginTempResL2, tempResL2);
		localTempResL2Counter = shareString.getSerializedField().getModifiedCounter();
   }
     /**
	 *	refreshTempResL2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serilization as well
	 */ 
   	protected BigDecimal refreshTempResL2() {
	 	return getComp2(beginTempResL2);
	}
        int localBpAdjustCounter = -1;
        public boolean isBpAdjustModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localBpAdjustCounter != sharedCounter;
           localBpAdjustCounter = sharedCounter; return hasModified; 
        }
	    public boolean bpAdjustIsNumeric() {
	      return decimalIsNumeric(beginBpAdjust,BP_ADJUST_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] bpAdjustString() {
            return getPackedString(beginBpAdjust,BP_ADJUST_LEN);
         }
   protected static final int BP_ADJUST_LEN = 3;
   protected static final int BP_ADJUST_SCALE = 2;
  	/**
	 * 	serializeBpAdjust
	 */
	protected void serializeBpAdjust(BigDecimal bpAdjust) {
		   putDecimal(beginBpAdjust,bpAdjust,BP_ADJUST_LEN,BP_ADJUST_SCALE,true);
		 localBpAdjustCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkBpAdjustMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,5/*precision*/);
   }
     /**
	 *	refreshBpAdjust is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshBpAdjust() throws CFException {	
   	try { 
		 return (getDecimal(beginBpAdjust,BP_ADJUST_LEN,BP_ADJUST_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("bpAdjust", beginBpAdjust,BP_ADJUST_LEN);
     }
   	}
        int localBpAdjustRelativeCounter = -1;
        public boolean isBpAdjustRelativeModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localBpAdjustRelativeCounter != sharedCounter;
           localBpAdjustRelativeCounter = sharedCounter; return hasModified; 
        }
	    public boolean bpAdjustRelativeIsNumeric() {
	      return decimalIsNumeric(beginBpAdjustRelative,BP_ADJUST_RELATIVE_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] bpAdjustRelativeString() {
            return getPackedString(beginBpAdjustRelative,BP_ADJUST_RELATIVE_LEN);
         }
   protected static final int BP_ADJUST_RELATIVE_LEN = 4;
   protected static final int BP_ADJUST_RELATIVE_SCALE = 4;
  	/**
	 * 	serializeBpAdjustRelative
	 */
	protected void serializeBpAdjustRelative(BigDecimal bpAdjustRelative) {
		   putDecimal(beginBpAdjustRelative,bpAdjustRelative,BP_ADJUST_RELATIVE_LEN,BP_ADJUST_RELATIVE_SCALE,true);
		 localBpAdjustRelativeCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkBpAdjustRelativeMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,7/*precision*/);
   }
     /**
	 *	refreshBpAdjustRelative is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshBpAdjustRelative() throws CFException {	
   	try { 
		 return (getDecimal(beginBpAdjustRelative,BP_ADJUST_RELATIVE_LEN,BP_ADJUST_RELATIVE_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("bpAdjustRelative", beginBpAdjustRelative,BP_ADJUST_RELATIVE_LEN);
     }
   	}
        int localUpdTotReturnCounter = -1;
        public boolean isUpdTotReturnModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localUpdTotReturnCounter != sharedCounter;
           localUpdTotReturnCounter = sharedCounter; return hasModified; 
        }
	    public boolean updTotReturnIsNumeric() {
	      return decimalIsNumeric(beginUpdTotReturn,UPD_TOT_RETURN_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] updTotReturnString() {
            return getPackedString(beginUpdTotReturn,UPD_TOT_RETURN_LEN);
         }
   protected static final int UPD_TOT_RETURN_LEN = 6;
   protected static final int UPD_TOT_RETURN_SCALE = 6;
  	/**
	 * 	serializeUpdTotReturn
	 */
	protected void serializeUpdTotReturn(BigDecimal updTotReturn) {
		   putDecimal(beginUpdTotReturn,updTotReturn,UPD_TOT_RETURN_LEN,UPD_TOT_RETURN_SCALE,true);
		 localUpdTotReturnCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkUpdTotReturnMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,6/*scale*/,11/*precision*/);
   }
     /**
	 *	refreshUpdTotReturn is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshUpdTotReturn() throws CFException {	
   	try { 
		 return (getDecimal(beginUpdTotReturn,UPD_TOT_RETURN_LEN,UPD_TOT_RETURN_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("updTotReturn", beginUpdTotReturn,UPD_TOT_RETURN_LEN);
     }
   	}
        int localReturnRelativeCounter = -1;
        public boolean isReturnRelativeModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localReturnRelativeCounter != sharedCounter;
           localReturnRelativeCounter = sharedCounter; return hasModified; 
        }
	    public boolean returnRelativeIsNumeric() {
	      return decimalIsNumeric(beginReturnRelative,RETURN_RELATIVE_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] returnRelativeString() {
            return getPackedString(beginReturnRelative,RETURN_RELATIVE_LEN);
         }
   protected static final int RETURN_RELATIVE_LEN = 10;
   protected static final int RETURN_RELATIVE_SCALE = 11;
  	/**
	 * 	serializeReturnRelative
	 */
	protected void serializeReturnRelative(BigDecimal returnRelative) {
		   putDecimal(beginReturnRelative,returnRelative,RETURN_RELATIVE_LEN,RETURN_RELATIVE_SCALE,true);
		 localReturnRelativeCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkReturnRelativeMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,11/*scale*/,18/*precision*/);
   }
     /**
	 *	refreshReturnRelative is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshReturnRelative() throws CFException {	
   	try { 
		 return (getDecimal(beginReturnRelative,RETURN_RELATIVE_LEN,RETURN_RELATIVE_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("returnRelative", beginReturnRelative,RETURN_RELATIVE_LEN);
     }
   	}
     int localStrikeAmtCounter = -1;
     public boolean isStrikeAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localStrikeAmtCounter != sharedCounter;
         localStrikeAmtCounter = sharedCounter; return hasModified;          
     }
	/**
	 * 	serialize this StrikeAmt
	 */
   protected void serializeStrikeAmt(BigDecimal strikeAmt) {	
		shareString.getSerializedField().incrementCounter();
	 	putComp2(beginStrikeAmt, strikeAmt);
		localStrikeAmtCounter = shareString.getSerializedField().getModifiedCounter();
   }
     /**
	 *	refreshStrikeAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serilization as well
	 */ 
   	protected BigDecimal refreshStrikeAmt() {
	 	return getComp2(beginStrikeAmt);
	}
     int localMsdOptStrikePriceCounter = -1;
     
     public boolean isMsdOptStrikePriceModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdOptStrikePriceCounter != sharedCounter;
         localMsdOptStrikePriceCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of msdOptStrikePrice
	 *	@return msdOptStrikePrice
	 */
	public char[]  getMsdOptStrikePriceString() {
	    return getCharArray(beginMsdOptStrikePrice,MSD_OPT_STRIKE_PRICE_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdOptStrikePriceIsNumeric() {
		    return isNumeric(beginMsdOptStrikePrice
	                    ,beginMsdOptStrikePrice + MSD_OPT_STRIKE_PRICE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int MSD_OPT_STRIKE_PRICE_LEN = 18;
  protected  static final int MSD_OPT_STRIKE_PRICE_SCALE = 8;

   protected BigDecimal checkMsdOptStrikePriceMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,8/*scale*/,18/*precision*/);
   }

  	/**
	 * serializeMsdOptStrikePrice
	 */
	protected void serializeMsdOptStrikePrice(BigDecimal msdOptStrikePrice) {
	       putNumber(beginMsdOptStrikePrice,msdOptStrikePrice,MSD_OPT_STRIKE_PRICE_LEN,MSD_OPT_STRIKE_PRICE_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdOptStrikePriceCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeMsdOptStrikePrice
	 */
   	protected  BigDecimal serializeMsdOptStrikePrice(char[] value) throws CFException {
        if (value.length < 18) value = pad(18, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(18,value,false/*isSigned?*/)
		       ,beginMsdOptStrikePrice
		       ,18
		      );		 localMsdOptStrikePriceCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,MSD_OPT_STRIKE_PRICE_LEN,MSD_OPT_STRIKE_PRICE_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("msdOptStrikePrice", beginMsdOptStrikePrice,MSD_OPT_STRIKE_PRICE_LEN);
    	}
    }
    /**
	 *	refreshMsdOptStrikePrice is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshMsdOptStrikePrice() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginMsdOptStrikePrice
			            ,MSD_OPT_STRIKE_PRICE_LEN
			            ,MSD_OPT_STRIKE_PRICE_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("msdOptStrikePrice", beginMsdOptStrikePrice,MSD_OPT_STRIKE_PRICE_LEN);
    }
   	}
     int localMsdOptStrikePriceSCounter = -1;
     
     public boolean isMsdOptStrikePriceSModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdOptStrikePriceSCounter != sharedCounter;
         localMsdOptStrikePriceSCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of msdOptStrikePriceS
	 *	@return msdOptStrikePriceS
	 */
	public char[]  getMsdOptStrikePriceSString() {
	    return getCharArray(beginMsdOptStrikePriceS,MSD_OPT_STRIKE_PRICE_S_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdOptStrikePriceSIsNumeric() {
		    return isNumeric(beginMsdOptStrikePriceS
	                    ,beginMsdOptStrikePriceS + MSD_OPT_STRIKE_PRICE_S_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int MSD_OPT_STRIKE_PRICE_S_LEN = 18;
  protected  static final int MSD_OPT_STRIKE_PRICE_S_SCALE = 8;

   protected BigDecimal checkMsdOptStrikePriceSMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,8/*scale*/,18/*precision*/);
   }

  	/**
	 * serializeMsdOptStrikePriceS
	 */
	protected void serializeMsdOptStrikePriceS(BigDecimal msdOptStrikePriceS) {
	       putNumber(beginMsdOptStrikePriceS,msdOptStrikePriceS,MSD_OPT_STRIKE_PRICE_S_LEN,MSD_OPT_STRIKE_PRICE_S_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdOptStrikePriceSCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeMsdOptStrikePriceS
	 */
   	protected  BigDecimal serializeMsdOptStrikePriceS(char[] value) throws CFException {
        if (value.length < 18) value = pad(18, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(18,value,true/*isSigned?*/)
		       ,beginMsdOptStrikePriceS
		       ,18
		      );		 localMsdOptStrikePriceSCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,MSD_OPT_STRIKE_PRICE_S_LEN,MSD_OPT_STRIKE_PRICE_S_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("msdOptStrikePriceS", beginMsdOptStrikePriceS,MSD_OPT_STRIKE_PRICE_S_LEN);
    	}
    }
    /**
	 *	refreshMsdOptStrikePriceS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshMsdOptStrikePriceS() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginMsdOptStrikePriceS
			            ,MSD_OPT_STRIKE_PRICE_S_LEN
			            ,MSD_OPT_STRIKE_PRICE_S_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("msdOptStrikePriceS", beginMsdOptStrikePriceS,MSD_OPT_STRIKE_PRICE_S_LEN);
    }
   	}
        int localScsecxStrikePrcCounter = -1;
        public boolean isScsecxStrikePrcModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localScsecxStrikePrcCounter != sharedCounter;
           localScsecxStrikePrcCounter = sharedCounter; return hasModified; 
        }
	    public boolean scsecxStrikePrcIsNumeric() {
	      return decimalIsNumeric(beginScsecxStrikePrc,SCSECX_STRIKE_PRC_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] scsecxStrikePrcString() {
            return getPackedString(beginScsecxStrikePrc,SCSECX_STRIKE_PRC_LEN);
         }
   protected static final int SCSECX_STRIKE_PRC_LEN = 6;
   protected static final int SCSECX_STRIKE_PRC_SCALE = 5;
  	/**
	 * 	serializeScsecxStrikePrc
	 */
	protected void serializeScsecxStrikePrc(BigDecimal scsecxStrikePrc) {
		   putDecimal(beginScsecxStrikePrc,scsecxStrikePrc,SCSECX_STRIKE_PRC_LEN,SCSECX_STRIKE_PRC_SCALE,true);
		 localScsecxStrikePrcCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkScsecxStrikePrcMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,5/*scale*/,10/*precision*/);
   }
     /**
	 *	refreshScsecxStrikePrc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshScsecxStrikePrc() throws CFException {	
   	try { 
		 return (getDecimal(beginScsecxStrikePrc,SCSECX_STRIKE_PRC_LEN,SCSECX_STRIKE_PRC_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("scsecxStrikePrc", beginScsecxStrikePrc,SCSECX_STRIKE_PRC_LEN);
     }
   	}




}
  
