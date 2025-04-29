package com.cloudframe.app.s918test.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:37. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 1841;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginAddValue;
            protected  int beginSubValue;
            protected  int beginTgt51;
            protected  int beginTgt52;
            protected  int beginTgt53;
            protected  int beginTgt54;
            protected  int beginTgt55;
            protected  int beginTgt56;
            protected  int beginTgt57;
            protected  int beginTgt58;
            protected  int beginTgt59;
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
            protected  int beginSrc69;
            protected  int beginTgt69;
            protected  int beginSrc70;
            protected  int beginTgt70;
            protected  int beginSrc71;
            protected  int beginTgt71;
            protected  int beginSrc72;
            protected  int beginTgt72;
            protected  int beginSrc73;
            protected  int beginTgt73;
            protected  int beginSrc74;
            protected  int beginTgt74;
            protected  int beginSrc75;
            protected  int beginTgt75;
            protected  int beginSrc76;
            protected  int beginTgt76;
            protected  int beginSrc77;
            protected  int beginTgt77;
            protected  int beginSrc78;
            protected  int beginTgt78;
            protected  int beginSrc79;
            protected  int beginTgt79;
            protected  int beginSrc80;
            protected  int beginTgt80;
            protected  int beginTgt81;
            protected  int beginTgt82;
            protected  int beginTgt83;
            protected  int beginTgt84;
            protected  int beginTgt85;
            protected  int beginTgt86;
            protected  int beginSrc87;
            protected  int beginTgt87;
            protected  int beginSrc88;
            protected  int beginTgt88;
            protected  int beginSrc89;
            protected  int beginSrc90;
            protected  int beginSrc91;
            protected  int beginSrc92;
            protected  int beginSrc93;
            protected  int beginSrc94;
            protected  int beginSrc95;
            protected  int beginTgt95;
            protected  int beginSrc96;
            protected  int beginTgt96;
            protected  int beginSrc97;
            protected  int beginSrc98;
            protected  int beginSrc99;
            protected  int beginSrc100;
            protected  int beginSrc101;
            protected  int beginSrc102;
            protected  int beginSrc103;
            protected  int beginTgt103;
            protected  int beginSrc104;
            protected  int beginTgt104;
            protected  int beginTgt105;
            protected  int beginTgt106;
            protected  int beginTgt107;
            protected  int beginTgt108;
            protected  int beginTgt109;
            protected  int beginTgt110;
            protected  int beginTgt111;
            protected  int beginTgt112;
            protected  int beginTgt113;
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
            protected  int beginSrc123;
            protected  int beginTgt123;
            protected  int beginSrc124;
            protected  int beginTgt124;
            protected  int beginSrc125;
            protected  int beginTgt125;
            protected  int beginSrc126;
            protected  int beginTgt126;
            protected  int beginSrc127;
            protected  int beginTgt127;
            protected  int beginSrc128;
            protected  int beginTgt128;
            protected  int beginSrc129;
            protected  int beginTgt129;
            protected  int beginSrc130;
            protected  int beginTgt130;
            protected  int beginSrc131;
            protected  int beginTgt131;
            protected  int beginSrc132;
            protected  int beginTgt132;
            protected  int beginSrc133;
            protected  int beginTgt133;
            protected  int beginSrc134;
            protected  int beginTgt134;
            protected  int beginTgt135;
            protected  int beginTgt136;
            protected  int beginTgt137;
            protected  int beginTgt138;
            protected  int beginTgt139;
            protected  int beginTgt140;
            protected  int beginSrc141;
            protected  int beginTgt141;
            protected  int beginSrc142;
            protected  int beginTgt142;
            protected  int beginSrc143;
            protected  int beginSrc144;
            protected  int beginSrc145;
            protected  int beginSrc146;
            protected  int beginSrc147;
            protected  int beginSrc148;
            protected  int beginSrc149;
            protected  int beginTgt149;
            protected  int beginSrc150;
            protected  int beginTgt150;
            protected  int beginSrc151;
            protected  int beginSrc152;
            protected  int beginSrc153;
            protected  int beginSrc154;
            protected  int beginSrc155;
            protected  int beginSrc156;
            protected  int beginSrc157;
            protected  int beginTgt157;
            protected  int beginSrc158;
            protected  int beginTgt158;
            protected  int beginTgt159;
            protected  int beginTgt160;
            protected  int beginTgt163;
            protected  int beginTgt164;
            protected  int beginSrc167;
            protected  int beginTgt167;
            protected  int beginTgt168;
            protected  int beginSrc169;
            protected  int beginSrc171;
            protected  int beginTgt171;
            protected  int beginSrc172;
            protected  int beginTgt172;
            protected  int beginSrc173;
            protected  int beginSrc174;
            protected  int beginSrc175;
            protected  int beginTgt175;
            protected  int beginTgt176;
            protected  int beginSrc177;
            protected  int beginTgt179;
            protected  int beginTgt184;
            protected  int beginTgt189;
            protected  int beginTgt190;
            protected  int beginTgt191;
            protected  int beginTgt192;
            protected  int beginTgt193;
            protected  int beginSrc194;
            protected  int beginTgt194;
            protected  int beginSrc195;
            protected  int beginTgt195;
            protected  int beginSrc196;
            protected  int beginSrc197;
            protected  int beginSrc198;
            protected  int beginSrc199;
            protected  int beginSrc200;
            protected  int beginSrc201;
            protected  int beginSrc202;
            protected  int beginSrc203;
            protected  int beginSrc204;
            protected  int beginTgt204;
            protected  int beginSrc205;
            protected  int beginTgt205;
            protected  int beginSrc207;
            protected  int beginTgt207;
            protected  int beginSrc208;
            protected  int beginTgt208;
            protected  int beginTgt209;
            protected  int beginTgt210;
	
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
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
             beginTgt51 = getStartOffset() + 6;	// set offset for serialization
  
  
             beginTgt52 = getStartOffset() + 12;	// set offset for serialization
  
  
             beginTgt53 = getStartOffset() + 18;	// set offset for serialization
  
  
             beginTgt54 = getStartOffset() + 23;	// set offset for serialization
  
  
             beginTgt55 = getStartOffset() + 31;	// set offset for serialization
  
  
             beginTgt56 = getStartOffset() + 36;	// set offset for serialization
  
  
             beginTgt57 = getStartOffset() + 44;	// set offset for serialization
  
  
             beginTgt58 = getStartOffset() + 49;	// set offset for serialization
  
  
             beginTgt59 = getStartOffset() + 57;	// set offset for serialization
  
  
             beginTgt60 = getStartOffset() + 62;	// set offset for serialization
  
             beginSrc61 = getStartOffset() + 70;	// set offset for serialization
  
             beginTgt61 = getStartOffset() + 77;	// set offset for serialization
  
             beginSrc62 = getStartOffset() + 82;	// set offset for serialization
  
             beginTgt62 = getStartOffset() + 87;	// set offset for serialization
  
             beginSrc63 = getStartOffset() + 95;	// set offset for serialization
  
             beginTgt63 = getStartOffset() + 108;	// set offset for serialization
  
             beginSrc64 = getStartOffset() + 113;	// set offset for serialization
  
             beginTgt64 = getStartOffset() + 121;	// set offset for serialization
  
             beginSrc65 = getStartOffset() + 129;	// set offset for serialization
  
             beginTgt65 = getStartOffset() + 142;	// set offset for serialization
  
             beginSrc66 = getStartOffset() + 147;	// set offset for serialization
  
             beginTgt66 = getStartOffset() + 155;	// set offset for serialization
  
             beginSrc67 = getStartOffset() + 163;	// set offset for serialization
  
             beginTgt67 = getStartOffset() + 176;	// set offset for serialization
  
             beginSrc68 = getStartOffset() + 181;	// set offset for serialization
  
             beginTgt68 = getStartOffset() + 189;	// set offset for serialization
  
             beginSrc69 = getStartOffset() + 197;	// set offset for serialization
  
             beginTgt69 = getStartOffset() + 204;	// set offset for serialization
  
             beginSrc70 = getStartOffset() + 212;	// set offset for serialization
  
             beginTgt70 = getStartOffset() + 217;	// set offset for serialization
  
             beginSrc71 = getStartOffset() + 231;	// set offset for serialization
  
             beginTgt71 = getStartOffset() + 238;	// set offset for serialization
  
             beginSrc72 = getStartOffset() + 246;	// set offset for serialization
  
             beginTgt72 = getStartOffset() + 251;	// set offset for serialization
  
             beginSrc73 = getStartOffset() + 265;	// set offset for serialization
  
             beginTgt73 = getStartOffset() + 272;	// set offset for serialization
  
             beginSrc74 = getStartOffset() + 280;	// set offset for serialization
  
             beginTgt74 = getStartOffset() + 285;	// set offset for serialization
  
             beginSrc75 = getStartOffset() + 299;	// set offset for serialization
  
             beginTgt75 = getStartOffset() + 312;	// set offset for serialization
  
             beginSrc76 = getStartOffset() + 320;	// set offset for serialization
  
             beginTgt76 = getStartOffset() + 328;	// set offset for serialization
  
             beginSrc77 = getStartOffset() + 342;	// set offset for serialization
  
             beginTgt77 = getStartOffset() + 355;	// set offset for serialization
  
             beginSrc78 = getStartOffset() + 363;	// set offset for serialization
  
             beginTgt78 = getStartOffset() + 371;	// set offset for serialization
  
             beginSrc79 = getStartOffset() + 385;	// set offset for serialization
  
             beginTgt79 = getStartOffset() + 398;	// set offset for serialization
  
             beginSrc80 = getStartOffset() + 406;	// set offset for serialization
  
             beginTgt80 = getStartOffset() + 414;	// set offset for serialization
  
  
             beginTgt81 = getStartOffset() + 428;	// set offset for serialization
  
  
             beginTgt82 = getStartOffset() + 438;	// set offset for serialization
  
  
             beginTgt83 = getStartOffset() + 448;	// set offset for serialization
  
  
             beginTgt84 = getStartOffset() + 458;	// set offset for serialization
  
  
             beginTgt85 = getStartOffset() + 468;	// set offset for serialization
  
  
             beginTgt86 = getStartOffset() + 478;	// set offset for serialization
  
             beginSrc87 = getStartOffset() + 488;	// set offset for serialization
  
             beginTgt87 = getStartOffset() + 494;	// set offset for serialization
  
             beginSrc88 = getStartOffset() + 504;	// set offset for serialization
  
             beginTgt88 = getStartOffset() + 510;	// set offset for serialization
  
             beginSrc89 = getStartOffset() + 520;	// set offset for serialization
  
  
             beginSrc90 = getStartOffset() + 530;	// set offset for serialization
  
  
             beginSrc91 = getStartOffset() + 540;	// set offset for serialization
  
  
             beginSrc92 = getStartOffset() + 550;	// set offset for serialization
  
  
             beginSrc93 = getStartOffset() + 560;	// set offset for serialization
  
  
             beginSrc94 = getStartOffset() + 570;	// set offset for serialization
  
  
             beginSrc95 = getStartOffset() + 580;	// set offset for serialization
  
             beginTgt95 = getStartOffset() + 590;	// set offset for serialization
  
             beginSrc96 = getStartOffset() + 596;	// set offset for serialization
  
             beginTgt96 = getStartOffset() + 606;	// set offset for serialization
  
             beginSrc97 = getStartOffset() + 612;	// set offset for serialization
  
  
             beginSrc98 = getStartOffset() + 622;	// set offset for serialization
  
  
             beginSrc99 = getStartOffset() + 632;	// set offset for serialization
  
  
             beginSrc100 = getStartOffset() + 642;	// set offset for serialization
  
  
             beginSrc101 = getStartOffset() + 652;	// set offset for serialization
  
  
             beginSrc102 = getStartOffset() + 662;	// set offset for serialization
  
  
             beginSrc103 = getStartOffset() + 672;	// set offset for serialization
  
             beginTgt103 = getStartOffset() + 682;	// set offset for serialization
  
             beginSrc104 = getStartOffset() + 688;	// set offset for serialization
  
             beginTgt104 = getStartOffset() + 698;	// set offset for serialization
  
  
             beginTgt105 = getStartOffset() + 704;	// set offset for serialization
  
  
             beginTgt106 = getStartOffset() + 710;	// set offset for serialization
  
  
             beginTgt107 = getStartOffset() + 716;	// set offset for serialization
  
  
             beginTgt108 = getStartOffset() + 721;	// set offset for serialization
  
  
             beginTgt109 = getStartOffset() + 729;	// set offset for serialization
  
  
             beginTgt110 = getStartOffset() + 734;	// set offset for serialization
  
  
             beginTgt111 = getStartOffset() + 742;	// set offset for serialization
  
  
             beginTgt112 = getStartOffset() + 747;	// set offset for serialization
  
  
             beginTgt113 = getStartOffset() + 755;	// set offset for serialization
  
  
             beginTgt114 = getStartOffset() + 760;	// set offset for serialization
  
             beginSrc115 = getStartOffset() + 768;	// set offset for serialization
  
             beginTgt115 = getStartOffset() + 775;	// set offset for serialization
  
             beginSrc116 = getStartOffset() + 780;	// set offset for serialization
  
             beginTgt116 = getStartOffset() + 785;	// set offset for serialization
  
             beginSrc117 = getStartOffset() + 793;	// set offset for serialization
  
             beginTgt117 = getStartOffset() + 806;	// set offset for serialization
  
             beginSrc118 = getStartOffset() + 811;	// set offset for serialization
  
             beginTgt118 = getStartOffset() + 819;	// set offset for serialization
  
             beginSrc119 = getStartOffset() + 827;	// set offset for serialization
  
             beginTgt119 = getStartOffset() + 840;	// set offset for serialization
  
             beginSrc120 = getStartOffset() + 845;	// set offset for serialization
  
             beginTgt120 = getStartOffset() + 853;	// set offset for serialization
  
             beginSrc121 = getStartOffset() + 861;	// set offset for serialization
  
             beginTgt121 = getStartOffset() + 874;	// set offset for serialization
  
             beginSrc122 = getStartOffset() + 879;	// set offset for serialization
  
             beginTgt122 = getStartOffset() + 887;	// set offset for serialization
  
             beginSrc123 = getStartOffset() + 895;	// set offset for serialization
  
             beginTgt123 = getStartOffset() + 902;	// set offset for serialization
  
             beginSrc124 = getStartOffset() + 910;	// set offset for serialization
  
             beginTgt124 = getStartOffset() + 915;	// set offset for serialization
  
             beginSrc125 = getStartOffset() + 929;	// set offset for serialization
  
             beginTgt125 = getStartOffset() + 936;	// set offset for serialization
  
             beginSrc126 = getStartOffset() + 944;	// set offset for serialization
  
             beginTgt126 = getStartOffset() + 949;	// set offset for serialization
  
             beginSrc127 = getStartOffset() + 963;	// set offset for serialization
  
             beginTgt127 = getStartOffset() + 970;	// set offset for serialization
  
             beginSrc128 = getStartOffset() + 978;	// set offset for serialization
  
             beginTgt128 = getStartOffset() + 983;	// set offset for serialization
  
             beginSrc129 = getStartOffset() + 997;	// set offset for serialization
  
             beginTgt129 = getStartOffset() + 1010;	// set offset for serialization
  
             beginSrc130 = getStartOffset() + 1018;	// set offset for serialization
  
             beginTgt130 = getStartOffset() + 1026;	// set offset for serialization
  
             beginSrc131 = getStartOffset() + 1040;	// set offset for serialization
  
             beginTgt131 = getStartOffset() + 1053;	// set offset for serialization
  
             beginSrc132 = getStartOffset() + 1061;	// set offset for serialization
  
             beginTgt132 = getStartOffset() + 1069;	// set offset for serialization
  
             beginSrc133 = getStartOffset() + 1083;	// set offset for serialization
  
             beginTgt133 = getStartOffset() + 1096;	// set offset for serialization
  
             beginSrc134 = getStartOffset() + 1104;	// set offset for serialization
  
             beginTgt134 = getStartOffset() + 1112;	// set offset for serialization
  
  
             beginTgt135 = getStartOffset() + 1126;	// set offset for serialization
  
  
             beginTgt136 = getStartOffset() + 1136;	// set offset for serialization
  
  
             beginTgt137 = getStartOffset() + 1146;	// set offset for serialization
  
  
             beginTgt138 = getStartOffset() + 1156;	// set offset for serialization
  
  
             beginTgt139 = getStartOffset() + 1166;	// set offset for serialization
  
  
             beginTgt140 = getStartOffset() + 1176;	// set offset for serialization
  
             beginSrc141 = getStartOffset() + 1186;	// set offset for serialization
  
             beginTgt141 = getStartOffset() + 1192;	// set offset for serialization
  
             beginSrc142 = getStartOffset() + 1202;	// set offset for serialization
  
             beginTgt142 = getStartOffset() + 1208;	// set offset for serialization
  
             beginSrc143 = getStartOffset() + 1218;	// set offset for serialization
  
  
             beginSrc144 = getStartOffset() + 1228;	// set offset for serialization
  
  
             beginSrc145 = getStartOffset() + 1238;	// set offset for serialization
  
  
             beginSrc146 = getStartOffset() + 1248;	// set offset for serialization
  
  
             beginSrc147 = getStartOffset() + 1258;	// set offset for serialization
  
  
             beginSrc148 = getStartOffset() + 1268;	// set offset for serialization
  
  
             beginSrc149 = getStartOffset() + 1278;	// set offset for serialization
  
             beginTgt149 = getStartOffset() + 1288;	// set offset for serialization
  
             beginSrc150 = getStartOffset() + 1294;	// set offset for serialization
  
             beginTgt150 = getStartOffset() + 1304;	// set offset for serialization
  
             beginSrc151 = getStartOffset() + 1310;	// set offset for serialization
  
  
             beginSrc152 = getStartOffset() + 1320;	// set offset for serialization
  
  
             beginSrc153 = getStartOffset() + 1330;	// set offset for serialization
  
  
             beginSrc154 = getStartOffset() + 1340;	// set offset for serialization
  
  
             beginSrc155 = getStartOffset() + 1350;	// set offset for serialization
  
  
             beginSrc156 = getStartOffset() + 1360;	// set offset for serialization
  
  
             beginSrc157 = getStartOffset() + 1370;	// set offset for serialization
  
             beginTgt157 = getStartOffset() + 1380;	// set offset for serialization
  
             beginSrc158 = getStartOffset() + 1386;	// set offset for serialization
  
             beginTgt158 = getStartOffset() + 1396;	// set offset for serialization
  
  
             beginTgt159 = getStartOffset() + 1402;	// set offset for serialization
  
             beginTgt160 = getStartOffset() + 1412;	// set offset for serialization
  
  
  
             beginTgt163 = getStartOffset() + 1422;	// set offset for serialization
  
             beginTgt164 = getStartOffset() + 1432;	// set offset for serialization
  
  
             beginSrc167 = getStartOffset() + 1442;	// set offset for serialization
  
             beginTgt167 = getStartOffset() + 1446;	// set offset for serialization
  
             beginTgt168 = getStartOffset() + 1456;	// set offset for serialization
  
             beginSrc169 = getStartOffset() + 1466;	// set offset for serialization
  
             beginSrc171 = getStartOffset() + 1470;	// set offset for serialization
  
             beginTgt171 = getStartOffset() + 1477;	// set offset for serialization
  
             beginSrc172 = getStartOffset() + 1487;	// set offset for serialization
  
             beginTgt172 = getStartOffset() + 1494;	// set offset for serialization
  
             beginSrc173 = getStartOffset() + 1504;	// set offset for serialization
  
             beginSrc174 = getStartOffset() + 1511;	// set offset for serialization
  
             beginSrc175 = getStartOffset() + 1518;	// set offset for serialization
  
             beginTgt175 = getStartOffset() + 1523;	// set offset for serialization
  
             beginTgt176 = getStartOffset() + 1533;	// set offset for serialization
  
             beginSrc177 = getStartOffset() + 1543;	// set offset for serialization
  
  
             beginTgt179 = getStartOffset() + 1548;	// set offset for serialization
  
  
  
  
  
  
  
  
  
  
             beginTgt184 = getStartOffset() + 1554;	// set offset for serialization
  
  
  
  
  
  
  
  
  
  
             beginTgt189 = getStartOffset() + 1560;	// set offset for serialization
  
  
             beginTgt190 = getStartOffset() + 1567;	// set offset for serialization
  
  
             beginTgt191 = getStartOffset() + 1574;	// set offset for serialization
  
  
             beginTgt192 = getStartOffset() + 1581;	// set offset for serialization
  
  
             beginTgt193 = getStartOffset() + 1592;	// set offset for serialization
  
             beginSrc194 = getStartOffset() + 1603;	// set offset for serialization
  
             beginTgt194 = getStartOffset() + 1611;	// set offset for serialization
  
             beginSrc195 = getStartOffset() + 1621;	// set offset for serialization
  
             beginTgt195 = getStartOffset() + 1635;	// set offset for serialization
  
             beginSrc196 = getStartOffset() + 1641;	// set offset for serialization
  
  
             beginSrc197 = getStartOffset() + 1655;	// set offset for serialization
  
  
             beginSrc198 = getStartOffset() + 1663;	// set offset for serialization
  
  
             beginSrc199 = getStartOffset() + 1671;	// set offset for serialization
  
  
             beginSrc200 = getStartOffset() + 1679;	// set offset for serialization
  
  
             beginSrc201 = getStartOffset() + 1693;	// set offset for serialization
  
  
             beginSrc202 = getStartOffset() + 1707;	// set offset for serialization
  
  
             beginSrc203 = getStartOffset() + 1721;	// set offset for serialization
  
  
             beginSrc204 = getStartOffset() + 1735;	// set offset for serialization
  
             beginTgt204 = getStartOffset() + 1749;	// set offset for serialization
  
             beginSrc205 = getStartOffset() + 1759;	// set offset for serialization
  
             beginTgt205 = getStartOffset() + 1767;	// set offset for serialization
  
             beginSrc207 = getStartOffset() + 1777;	// set offset for serialization
  
             beginTgt207 = getStartOffset() + 1793;	// set offset for serialization
  
             beginSrc208 = getStartOffset() + 1807;	// set offset for serialization
  
             beginTgt208 = getStartOffset() + 1823;	// set offset for serialization
  
  
             beginTgt209 = getStartOffset() + 1831;	// set offset for serialization
  
             beginTgt210 = getStartOffset() + 1836;	// set offset for serialization
  
  
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
       
      
   protected int checkSrc3MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     int localTgt3Counter = -1;
     public boolean isTgt3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt3Counter != sharedCounter;
         localTgt3Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTgt3Constraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
         int localSrc4Counter = -1;
         public boolean isSrc4Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc4Counter != sharedCounter;
            localSrc4Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkSrc4MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     int localTgt4Counter = -1;
     public boolean isTgt4Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt4Counter != sharedCounter;
         localTgt4Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTgt4Constraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
         int localSrc5Counter = -1;
         public boolean isSrc5Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc5Counter != sharedCounter;
            localSrc5Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSrc5MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
     int localTgt5Counter = -1;
     public boolean isTgt5Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt5Counter != sharedCounter;
         localTgt5Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTgt5Constraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
         int localSrc6Counter = -1;
         public boolean isSrc6Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc6Counter != sharedCounter;
            localSrc6Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSrc6MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
     int localTgt6Counter = -1;
     public boolean isTgt6Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt6Counter != sharedCounter;
         localTgt6Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTgt6Constraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
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

   protected char[] checkTgt11Constraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
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

   protected char[] checkTgt12Constraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
         int localSrc13Counter = -1;
         public boolean isSrc13Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc13Counter != sharedCounter;
            localSrc13Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSrc13MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,8/*dataLen*/);
   }
     int localTgt13Counter = -1;
     public boolean isTgt13Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt13Counter != sharedCounter;
         localTgt13Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTgt13Constraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
         int localSrc14Counter = -1;
         public boolean isSrc14Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc14Counter != sharedCounter;
            localSrc14Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSrc14MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,8/*dataLen*/);
   }
     int localTgt14Counter = -1;
     public boolean isTgt14Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt14Counter != sharedCounter;
         localTgt14Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTgt14Constraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
         int localSrc15Counter = -1;
         public boolean isSrc15Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc15Counter != sharedCounter;
            localSrc15Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSrc15MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,8/*dataLen*/);
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
       
      
   protected long checkSrc16MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,8/*dataLen*/);
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
       
      
   protected long checkSrc17MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,8/*dataLen*/);
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
       
      
   protected long checkSrc18MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,8/*dataLen*/);
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
       
      
   protected long checkSrc19MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,8/*dataLen*/);
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
       
      
   protected long checkSrc20MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,8/*dataLen*/);
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
       
      
   protected long checkSrc21MaxLimit(long number) {
        return checkMaxLimit(number, true/*isSigned*/,8/*dataLen*/);
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
       
      
   protected long checkSrc22MaxLimit(long number) {
        return checkMaxLimit(number, true/*isSigned*/,8/*dataLen*/);
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
       
      
   protected long checkSrc23MaxLimit(long number) {
        return checkMaxLimit(number, true/*isSigned*/,8/*dataLen*/);
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
       
      
   protected long checkSrc24MaxLimit(long number) {
        return checkMaxLimit(number, true/*isSigned*/,8/*dataLen*/);
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
       
      
   protected long checkSrc25MaxLimit(long number) {
        return checkMaxLimit(number, true/*isSigned*/,8/*dataLen*/);
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
       
      
   protected long checkSrc26MaxLimit(long number) {
        return checkMaxLimit(number, true/*isSigned*/,8/*dataLen*/);
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
       
      
   protected int checkSrc27MaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
         int localTgt27Counter = -1;
         public boolean isTgt27Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt27Counter != sharedCounter;
            localTgt27Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkTgt27MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localSrc28Counter = -1;
         public boolean isSrc28Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc28Counter != sharedCounter;
            localSrc28Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkSrc28MaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
         int localTgt28Counter = -1;
         public boolean isTgt28Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt28Counter != sharedCounter;
            localTgt28Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkTgt28MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localSrc29Counter = -1;
         public boolean isSrc29Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc29Counter != sharedCounter;
            localSrc29Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkSrc29MaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
         int localTgt29Counter = -1;
         public boolean isTgt29Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt29Counter != sharedCounter;
            localTgt29Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkTgt29MaxLimit(long number) {
        return checkMaxLimit(number, true/*isSigned*/,8/*dataLen*/);
   }
         int localSrc30Counter = -1;
         public boolean isSrc30Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc30Counter != sharedCounter;
            localSrc30Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkSrc30MaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
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
       
      
   protected int checkSrc31MaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
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
       
      
   protected int checkSrc32MaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
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
       
      
   protected short checkSrc33MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
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
       
      
   protected short checkSrc34MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
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
       
      
   protected short checkSrc35MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
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
       
      
   protected short checkSrc36MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
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
       
      
   protected short checkSrc37MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
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
       
      
   protected short checkSrc38MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
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
       
      
   protected long checkSrc39MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localTgt39Counter = -1;
         public boolean isTgt39Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt39Counter != sharedCounter;
            localTgt39Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkTgt39MaxLimit(long number) {
        return checkMaxLimit(number, true/*isSigned*/,8/*dataLen*/);
   }
         int localSrc40Counter = -1;
         public boolean isSrc40Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc40Counter != sharedCounter;
            localSrc40Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSrc40MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localTgt40Counter = -1;
         public boolean isTgt40Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt40Counter != sharedCounter;
            localTgt40Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkTgt40MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localSrc41Counter = -1;
         public boolean isSrc41Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc41Counter != sharedCounter;
            localSrc41Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSrc41MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localTgt41Counter = -1;
         public boolean isTgt41Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt41Counter != sharedCounter;
            localTgt41Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkTgt41MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localSrc42Counter = -1;
         public boolean isSrc42Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc42Counter != sharedCounter;
            localSrc42Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSrc42MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localTgt42Counter = -1;
         public boolean isTgt42Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt42Counter != sharedCounter;
            localTgt42Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkTgt42MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,8/*dataLen*/);
   }
         int localSrc43Counter = -1;
         public boolean isSrc43Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc43Counter != sharedCounter;
            localSrc43Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSrc43MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localTgt43Counter = -1;
         public boolean isTgt43Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt43Counter != sharedCounter;
            localTgt43Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkTgt43MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localSrc44Counter = -1;
         public boolean isSrc44Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc44Counter != sharedCounter;
            localSrc44Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSrc44MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localTgt44Counter = -1;
         public boolean isTgt44Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt44Counter != sharedCounter;
            localTgt44Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkTgt44MaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
         int localSrc45Counter = -1;
         public boolean isSrc45Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc45Counter != sharedCounter;
            localSrc45Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkSrc45MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localTgt45Counter = -1;
         public boolean isTgt45Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt45Counter != sharedCounter;
            localTgt45Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkTgt45MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localSrc46Counter = -1;
         public boolean isSrc46Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc46Counter != sharedCounter;
            localSrc46Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkSrc46MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localTgt46Counter = -1;
         public boolean isTgt46Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt46Counter != sharedCounter;
            localTgt46Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkTgt46MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localSrc47Counter = -1;
         public boolean isSrc47Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc47Counter != sharedCounter;
            localSrc47Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkSrc47MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localTgt47Counter = -1;
         public boolean isTgt47Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt47Counter != sharedCounter;
            localTgt47Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkTgt47MaxLimit(long number) {
        return checkMaxLimit(number, true/*isSigned*/,8/*dataLen*/);
   }
         int localSrc48Counter = -1;
         public boolean isSrc48Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc48Counter != sharedCounter;
            localSrc48Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkSrc48MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localTgt48Counter = -1;
         public boolean isTgt48Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt48Counter != sharedCounter;
            localTgt48Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkTgt48MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,8/*dataLen*/);
   }
         int localSrc49Counter = -1;
         public boolean isSrc49Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc49Counter != sharedCounter;
            localSrc49Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkSrc49MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localTgt49Counter = -1;
         public boolean isTgt49Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt49Counter != sharedCounter;
            localTgt49Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkTgt49MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localSrc50Counter = -1;
         public boolean isSrc50Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc50Counter != sharedCounter;
            localSrc50Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkSrc50MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localTgt50Counter = -1;
         public boolean isTgt50Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt50Counter != sharedCounter;
            localTgt50Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkTgt50MaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
         int localSrc51Counter = -1;
         public boolean isSrc51Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc51Counter != sharedCounter;
            localSrc51Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkSrc51MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     int localTgt51Counter = -1;
     public boolean isTgt51Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt51Counter != sharedCounter;
         localTgt51Counter = sharedCounter; return hasModified;
     }
	protected static final int TGT_51_LEN = 6;
	/**
	 * 	serialize this Tgt51
	 */
   protected void serializeTgt51(char[] tgt51) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tgt51,0,getStringValue(),beginTgt51,TGT_51_LEN);
       localTgt51Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTgt51Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshTgt51 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTgt51() {	 
   		return (substring(getStringValue(),beginTgt51,beginTgt51 + TGT_51_LEN));
   	}
         int localSrc52Counter = -1;
         public boolean isSrc52Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc52Counter != sharedCounter;
            localSrc52Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkSrc52MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     int localTgt52Counter = -1;
     public boolean isTgt52Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt52Counter != sharedCounter;
         localTgt52Counter = sharedCounter; return hasModified;
     }
	protected static final int TGT_52_LEN = 6;
	/**
	 * 	serialize this Tgt52
	 */
   protected void serializeTgt52(char[] tgt52) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tgt52,0,getStringValue(),beginTgt52,TGT_52_LEN);
       localTgt52Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTgt52Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshTgt52 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTgt52() {	 
   		return (substring(getStringValue(),beginTgt52,beginTgt52 + TGT_52_LEN));
   	}
         int localSrc53Counter = -1;
         public boolean isSrc53Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc53Counter != sharedCounter;
            localSrc53Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkSrc53MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
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
		   putDecimal(beginTgt53,tgt53,TGT_53_LEN,TGT_53_SCALE,false);
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
       
      
   protected short checkSrc54MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
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
		   putDecimal(beginTgt54,tgt54,TGT_54_LEN,TGT_54_SCALE,false);
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
       
      
   protected int checkSrc55MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
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
       
      
   protected int checkSrc56MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
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
       
      
   protected int checkSrc57MaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
        int localTgt57Counter = -1;
        public boolean isTgt57Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTgt57Counter != sharedCounter;
           localTgt57Counter = sharedCounter; return hasModified; 
        }
	    public boolean tgt57IsNumeric() {
	      return decimalIsNumeric(beginTgt57,TGT_57_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tgt57String() {
            return getPackedString(beginTgt57,TGT_57_LEN);
         }
   protected static final int TGT_57_LEN = 5;
   protected static final int TGT_57_SCALE = 2;
  	/**
	 * 	serializeTgt57
	 */
	protected void serializeTgt57(BigDecimal tgt57) {
		   putDecimal(beginTgt57,tgt57,TGT_57_LEN,TGT_57_SCALE,false);
		 localTgt57Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTgt57MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }
     /**
	 *	refreshTgt57 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt57() throws CFException {	
   	try { 
		 return (getDecimal(beginTgt57,TGT_57_LEN,TGT_57_SCALE));	
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
       
      
   protected int checkSrc58MaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
        int localTgt58Counter = -1;
        public boolean isTgt58Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTgt58Counter != sharedCounter;
           localTgt58Counter = sharedCounter; return hasModified; 
        }
	    public boolean tgt58IsNumeric() {
	      return decimalIsNumeric(beginTgt58,TGT_58_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tgt58String() {
            return getPackedString(beginTgt58,TGT_58_LEN);
         }
   protected static final int TGT_58_LEN = 8;
   protected static final int TGT_58_SCALE = 4;
  	/**
	 * 	serializeTgt58
	 */
	protected void serializeTgt58(BigDecimal tgt58) {
		   putDecimal(beginTgt58,tgt58,TGT_58_LEN,TGT_58_SCALE,false);
		 localTgt58Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTgt58MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,14/*precision*/);
   }
     /**
	 *	refreshTgt58 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt58() throws CFException {	
   	try { 
		 return (getDecimal(beginTgt58,TGT_58_LEN,TGT_58_SCALE));	
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
       
      
   protected long checkSrc59MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
        int localTgt59Counter = -1;
        public boolean isTgt59Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTgt59Counter != sharedCounter;
           localTgt59Counter = sharedCounter; return hasModified; 
        }
	    public boolean tgt59IsNumeric() {
	      return decimalIsNumeric(beginTgt59,TGT_59_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tgt59String() {
            return getPackedString(beginTgt59,TGT_59_LEN);
         }
   protected static final int TGT_59_LEN = 5;
   protected static final int TGT_59_SCALE = 2;
  	/**
	 * 	serializeTgt59
	 */
	protected void serializeTgt59(BigDecimal tgt59) {
		   putDecimal(beginTgt59,tgt59,TGT_59_LEN,TGT_59_SCALE,false);
		 localTgt59Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTgt59MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }
     /**
	 *	refreshTgt59 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt59() throws CFException {	
   	try { 
		 return (getDecimal(beginTgt59,TGT_59_LEN,TGT_59_SCALE));	
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
       
      
   protected long checkSrc60MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
        int localTgt60Counter = -1;
        public boolean isTgt60Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTgt60Counter != sharedCounter;
           localTgt60Counter = sharedCounter; return hasModified; 
        }
	    public boolean tgt60IsNumeric() {
	      return decimalIsNumeric(beginTgt60,TGT_60_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tgt60String() {
            return getPackedString(beginTgt60,TGT_60_LEN);
         }
   protected static final int TGT_60_LEN = 8;
   protected static final int TGT_60_SCALE = 4;
  	/**
	 * 	serializeTgt60
	 */
	protected void serializeTgt60(BigDecimal tgt60) {
		   putDecimal(beginTgt60,tgt60,TGT_60_LEN,TGT_60_SCALE,false);
		 localTgt60Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTgt60MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,14/*precision*/);
   }
     /**
	 *	refreshTgt60 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt60() throws CFException {	
   	try { 
		 return (getDecimal(beginTgt60,TGT_60_LEN,TGT_60_SCALE));	
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
		   putDecimal(beginSrc61,src61,SRC_61_LEN,SRC_61_SCALE,true);
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
	    public boolean tgt61IsNumeric() {
	      return decimalIsNumeric(beginTgt61,TGT_61_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tgt61String() {
            return getPackedString(beginTgt61,TGT_61_LEN);
         }
   protected static final int TGT_61_LEN = 5;
   protected static final int TGT_61_SCALE = 2;
  	/**
	 * 	serializeTgt61
	 */
	protected void serializeTgt61(BigDecimal tgt61) {
		   putDecimal(beginTgt61,tgt61,TGT_61_LEN,TGT_61_SCALE,false);
		 localTgt61Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTgt61MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }
     /**
	 *	refreshTgt61 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt61() throws CFException {	
   	try { 
		 return (getDecimal(beginTgt61,TGT_61_LEN,TGT_61_SCALE));	
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
		   putDecimal(beginSrc62,src62,SRC_62_LEN,SRC_62_SCALE,true);
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
	    public boolean tgt62IsNumeric() {
	      return decimalIsNumeric(beginTgt62,TGT_62_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tgt62String() {
            return getPackedString(beginTgt62,TGT_62_LEN);
         }
   protected static final int TGT_62_LEN = 8;
   protected static final int TGT_62_SCALE = 4;
  	/**
	 * 	serializeTgt62
	 */
	protected void serializeTgt62(BigDecimal tgt62) {
		   putDecimal(beginTgt62,tgt62,TGT_62_LEN,TGT_62_SCALE,false);
		 localTgt62Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTgt62MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,14/*precision*/);
   }
     /**
	 *	refreshTgt62 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt62() throws CFException {	
   	try { 
		 return (getDecimal(beginTgt62,TGT_62_LEN,TGT_62_SCALE));	
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
	    public boolean tgt63IsNumeric() {
	      return decimalIsNumeric(beginTgt63,TGT_63_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tgt63String() {
            return getPackedString(beginTgt63,TGT_63_LEN);
         }
   protected static final int TGT_63_LEN = 5;
   protected static final int TGT_63_SCALE = 2;
  	/**
	 * 	serializeTgt63
	 */
	protected void serializeTgt63(BigDecimal tgt63) {
		   putDecimal(beginTgt63,tgt63,TGT_63_LEN,TGT_63_SCALE,false);
		 localTgt63Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTgt63MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }
     /**
	 *	refreshTgt63 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt63() throws CFException {	
   	try { 
		 return (getDecimal(beginTgt63,TGT_63_LEN,TGT_63_SCALE));	
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
	    public boolean tgt64IsNumeric() {
	      return decimalIsNumeric(beginTgt64,TGT_64_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tgt64String() {
            return getPackedString(beginTgt64,TGT_64_LEN);
         }
   protected static final int TGT_64_LEN = 8;
   protected static final int TGT_64_SCALE = 4;
  	/**
	 * 	serializeTgt64
	 */
	protected void serializeTgt64(BigDecimal tgt64) {
		   putDecimal(beginTgt64,tgt64,TGT_64_LEN,TGT_64_SCALE,false);
		 localTgt64Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTgt64MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,14/*precision*/);
   }
     /**
	 *	refreshTgt64 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt64() throws CFException {	
   	try { 
		 return (getDecimal(beginTgt64,TGT_64_LEN,TGT_64_SCALE));	
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
	    public boolean tgt65IsNumeric() {
	      return decimalIsNumeric(beginTgt65,TGT_65_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tgt65String() {
            return getPackedString(beginTgt65,TGT_65_LEN);
         }
   protected static final int TGT_65_LEN = 5;
   protected static final int TGT_65_SCALE = 2;
  	/**
	 * 	serializeTgt65
	 */
	protected void serializeTgt65(BigDecimal tgt65) {
		   putDecimal(beginTgt65,tgt65,TGT_65_LEN,TGT_65_SCALE,true);
		 localTgt65Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTgt65MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }
     /**
	 *	refreshTgt65 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt65() throws CFException {	
   	try { 
		 return (getDecimal(beginTgt65,TGT_65_LEN,TGT_65_SCALE));	
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
	    public boolean tgt66IsNumeric() {
	      return decimalIsNumeric(beginTgt66,TGT_66_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tgt66String() {
            return getPackedString(beginTgt66,TGT_66_LEN);
         }
   protected static final int TGT_66_LEN = 8;
   protected static final int TGT_66_SCALE = 4;
  	/**
	 * 	serializeTgt66
	 */
	protected void serializeTgt66(BigDecimal tgt66) {
		   putDecimal(beginTgt66,tgt66,TGT_66_LEN,TGT_66_SCALE,true);
		 localTgt66Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTgt66MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,14/*precision*/);
   }
     /**
	 *	refreshTgt66 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt66() throws CFException {	
   	try { 
		 return (getDecimal(beginTgt66,TGT_66_LEN,TGT_66_SCALE));	
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
	    public boolean tgt67IsNumeric() {
	      return decimalIsNumeric(beginTgt67,TGT_67_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tgt67String() {
            return getPackedString(beginTgt67,TGT_67_LEN);
         }
   protected static final int TGT_67_LEN = 5;
   protected static final int TGT_67_SCALE = 2;
  	/**
	 * 	serializeTgt67
	 */
	protected void serializeTgt67(BigDecimal tgt67) {
		   putDecimal(beginTgt67,tgt67,TGT_67_LEN,TGT_67_SCALE,false);
		 localTgt67Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTgt67MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }
     /**
	 *	refreshTgt67 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt67() throws CFException {	
   	try { 
		 return (getDecimal(beginTgt67,TGT_67_LEN,TGT_67_SCALE));	
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
	    public boolean tgt68IsNumeric() {
	      return decimalIsNumeric(beginTgt68,TGT_68_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tgt68String() {
            return getPackedString(beginTgt68,TGT_68_LEN);
         }
   protected static final int TGT_68_LEN = 8;
   protected static final int TGT_68_SCALE = 4;
  	/**
	 * 	serializeTgt68
	 */
	protected void serializeTgt68(BigDecimal tgt68) {
		   putDecimal(beginTgt68,tgt68,TGT_68_LEN,TGT_68_SCALE,false);
		 localTgt68Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTgt68MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,14/*precision*/);
   }
     /**
	 *	refreshTgt68 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt68() throws CFException {	
   	try { 
		 return (getDecimal(beginTgt68,TGT_68_LEN,TGT_68_SCALE));	
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
	    public boolean src69IsNumeric() {
	      return decimalIsNumeric(beginSrc69,SRC_69_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] src69String() {
            return getPackedString(beginSrc69,SRC_69_LEN);
         }
   protected static final int SRC_69_LEN = 7;
   protected static final int SRC_69_SCALE = 3;
  	/**
	 * 	serializeSrc69
	 */
	protected void serializeSrc69(BigDecimal src69) {
		   putDecimal(beginSrc69,src69,SRC_69_LEN,SRC_69_SCALE,true);
		 localSrc69Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkSrc69MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,3/*scale*/,13/*precision*/);
   }
     /**
	 *	refreshSrc69 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc69() throws CFException {	
   	try { 
		 return (getDecimal(beginSrc69,SRC_69_LEN,SRC_69_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("src69", beginSrc69,SRC_69_LEN);
     }
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

  
  protected  static final int TGT_69_LEN = 8;
  protected  static final int TGT_69_SCALE = 2;

   protected BigDecimal checkTgt69MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }

  	/**
	 * serializeTgt69
	 */
	protected void serializeTgt69(BigDecimal tgt69) {
	       putNumber(beginTgt69,tgt69,TGT_69_LEN,TGT_69_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt69Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeTgt69
	 */
   	protected  BigDecimal serializeTgt69(char[] value) throws CFException {
        if (value.length < 8) value = pad(8, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginTgt69
		       ,8
		      );		 localTgt69Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,TGT_69_LEN,TGT_69_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("tgt69", beginTgt69,TGT_69_LEN);
    	}
    }
    /**
	 *	refreshTgt69 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt69() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginTgt69
			            ,TGT_69_LEN
			            ,TGT_69_SCALE
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
	    public boolean src70IsNumeric() {
	      return decimalIsNumeric(beginSrc70,SRC_70_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] src70String() {
            return getPackedString(beginSrc70,SRC_70_LEN);
         }
   protected static final int SRC_70_LEN = 5;
   protected static final int SRC_70_SCALE = 2;
  	/**
	 * 	serializeSrc70
	 */
	protected void serializeSrc70(BigDecimal src70) {
		   putDecimal(beginSrc70,src70,SRC_70_LEN,SRC_70_SCALE,true);
		 localSrc70Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkSrc70MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }
     /**
	 *	refreshSrc70 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc70() throws CFException {	
   	try { 
		 return (getDecimal(beginSrc70,SRC_70_LEN,SRC_70_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("src70", beginSrc70,SRC_70_LEN);
     }
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

  
  protected  static final int TGT_70_LEN = 14;
  protected  static final int TGT_70_SCALE = 4;

   protected BigDecimal checkTgt70MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,4/*scale*/,14/*precision*/);
   }

  	/**
	 * serializeTgt70
	 */
	protected void serializeTgt70(BigDecimal tgt70) {
	       putNumber(beginTgt70,tgt70,TGT_70_LEN,TGT_70_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt70Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeTgt70
	 */
   	protected  BigDecimal serializeTgt70(char[] value) throws CFException {
        if (value.length < 14) value = pad(14, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(14,value,false/*isSigned?*/)
		       ,beginTgt70
		       ,14
		      );		 localTgt70Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,TGT_70_LEN,TGT_70_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("tgt70", beginTgt70,TGT_70_LEN);
    	}
    }
    /**
	 *	refreshTgt70 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt70() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginTgt70
			            ,TGT_70_LEN
			            ,TGT_70_SCALE
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
	    public boolean src71IsNumeric() {
	      return decimalIsNumeric(beginSrc71,SRC_71_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] src71String() {
            return getPackedString(beginSrc71,SRC_71_LEN);
         }
   protected static final int SRC_71_LEN = 7;
   protected static final int SRC_71_SCALE = 3;
  	/**
	 * 	serializeSrc71
	 */
	protected void serializeSrc71(BigDecimal src71) {
		   putDecimal(beginSrc71,src71,SRC_71_LEN,SRC_71_SCALE,false);
		 localSrc71Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkSrc71MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,3/*scale*/,13/*precision*/);
   }
     /**
	 *	refreshSrc71 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc71() throws CFException {	
   	try { 
		 return (getDecimal(beginSrc71,SRC_71_LEN,SRC_71_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("src71", beginSrc71,SRC_71_LEN);
     }
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
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int TGT_71_LEN = 8;
  protected  static final int TGT_71_SCALE = 2;

   protected BigDecimal checkTgt71MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }

  	/**
	 * serializeTgt71
	 */
	protected void serializeTgt71(BigDecimal tgt71) {
	       putNumber(beginTgt71,tgt71,TGT_71_LEN,TGT_71_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt71Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeTgt71
	 */
   	protected  BigDecimal serializeTgt71(char[] value) throws CFException {
        if (value.length < 8) value = pad(8, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(8,value,true/*isSigned?*/)
		       ,beginTgt71
		       ,8
		      );		 localTgt71Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,TGT_71_LEN,TGT_71_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("tgt71", beginTgt71,TGT_71_LEN);
    	}
    }
    /**
	 *	refreshTgt71 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt71() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginTgt71
			            ,TGT_71_LEN
			            ,TGT_71_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
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
	    public boolean src72IsNumeric() {
	      return decimalIsNumeric(beginSrc72,SRC_72_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] src72String() {
            return getPackedString(beginSrc72,SRC_72_LEN);
         }
   protected static final int SRC_72_LEN = 5;
   protected static final int SRC_72_SCALE = 2;
  	/**
	 * 	serializeSrc72
	 */
	protected void serializeSrc72(BigDecimal src72) {
		   putDecimal(beginSrc72,src72,SRC_72_LEN,SRC_72_SCALE,false);
		 localSrc72Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkSrc72MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }
     /**
	 *	refreshSrc72 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc72() throws CFException {	
   	try { 
		 return (getDecimal(beginSrc72,SRC_72_LEN,SRC_72_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("src72", beginSrc72,SRC_72_LEN);
     }
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
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int TGT_72_LEN = 14;
  protected  static final int TGT_72_SCALE = 4;

   protected BigDecimal checkTgt72MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,4/*scale*/,14/*precision*/);
   }

  	/**
	 * serializeTgt72
	 */
	protected void serializeTgt72(BigDecimal tgt72) {
	       putNumber(beginTgt72,tgt72,TGT_72_LEN,TGT_72_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt72Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeTgt72
	 */
   	protected  BigDecimal serializeTgt72(char[] value) throws CFException {
        if (value.length < 14) value = pad(14, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(14,value,true/*isSigned?*/)
		       ,beginTgt72
		       ,14
		      );		 localTgt72Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,TGT_72_LEN,TGT_72_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("tgt72", beginTgt72,TGT_72_LEN);
    	}
    }
    /**
	 *	refreshTgt72 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt72() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginTgt72
			            ,TGT_72_LEN
			            ,TGT_72_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
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
	    public boolean src73IsNumeric() {
	      return decimalIsNumeric(beginSrc73,SRC_73_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] src73String() {
            return getPackedString(beginSrc73,SRC_73_LEN);
         }
   protected static final int SRC_73_LEN = 7;
   protected static final int SRC_73_SCALE = 3;
  	/**
	 * 	serializeSrc73
	 */
	protected void serializeSrc73(BigDecimal src73) {
		   putDecimal(beginSrc73,src73,SRC_73_LEN,SRC_73_SCALE,false);
		 localSrc73Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkSrc73MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,3/*scale*/,13/*precision*/);
   }
     /**
	 *	refreshSrc73 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc73() throws CFException {	
   	try { 
		 return (getDecimal(beginSrc73,SRC_73_LEN,SRC_73_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("src73", beginSrc73,SRC_73_LEN);
     }
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

  
  protected  static final int TGT_73_LEN = 8;
  protected  static final int TGT_73_SCALE = 2;

   protected BigDecimal checkTgt73MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }

  	/**
	 * serializeTgt73
	 */
	protected void serializeTgt73(BigDecimal tgt73) {
	       putNumber(beginTgt73,tgt73,TGT_73_LEN,TGT_73_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt73Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeTgt73
	 */
   	protected  BigDecimal serializeTgt73(char[] value) throws CFException {
        if (value.length < 8) value = pad(8, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginTgt73
		       ,8
		      );		 localTgt73Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,TGT_73_LEN,TGT_73_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("tgt73", beginTgt73,TGT_73_LEN);
    	}
    }
    /**
	 *	refreshTgt73 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt73() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginTgt73
			            ,TGT_73_LEN
			            ,TGT_73_SCALE
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
	    public boolean src74IsNumeric() {
	      return decimalIsNumeric(beginSrc74,SRC_74_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] src74String() {
            return getPackedString(beginSrc74,SRC_74_LEN);
         }
   protected static final int SRC_74_LEN = 5;
   protected static final int SRC_74_SCALE = 2;
  	/**
	 * 	serializeSrc74
	 */
	protected void serializeSrc74(BigDecimal src74) {
		   putDecimal(beginSrc74,src74,SRC_74_LEN,SRC_74_SCALE,false);
		 localSrc74Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkSrc74MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }
     /**
	 *	refreshSrc74 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc74() throws CFException {	
   	try { 
		 return (getDecimal(beginSrc74,SRC_74_LEN,SRC_74_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("src74", beginSrc74,SRC_74_LEN);
     }
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

  
  protected  static final int TGT_74_LEN = 14;
  protected  static final int TGT_74_SCALE = 4;

   protected BigDecimal checkTgt74MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,4/*scale*/,14/*precision*/);
   }

  	/**
	 * serializeTgt74
	 */
	protected void serializeTgt74(BigDecimal tgt74) {
	       putNumber(beginTgt74,tgt74,TGT_74_LEN,TGT_74_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt74Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeTgt74
	 */
   	protected  BigDecimal serializeTgt74(char[] value) throws CFException {
        if (value.length < 14) value = pad(14, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(14,value,false/*isSigned?*/)
		       ,beginTgt74
		       ,14
		      );		 localTgt74Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,TGT_74_LEN,TGT_74_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("tgt74", beginTgt74,TGT_74_LEN);
    	}
    }
    /**
	 *	refreshTgt74 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt74() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginTgt74
			            ,TGT_74_LEN
			            ,TGT_74_SCALE
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
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int SRC_75_LEN = 13;
  protected  static final int SRC_75_SCALE = 3;

   protected BigDecimal checkSrc75MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,3/*scale*/,13/*precision*/);
   }

  	/**
	 * serializeSrc75
	 */
	protected void serializeSrc75(BigDecimal src75) {
	       putNumber(beginSrc75,src75,SRC_75_LEN,SRC_75_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc75Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeSrc75
	 */
   	protected  BigDecimal serializeSrc75(char[] value) throws CFException {
        if (value.length < 13) value = pad(13, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(13,value,true/*isSigned?*/)
		       ,beginSrc75
		       ,13
		      );		 localSrc75Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,SRC_75_LEN,SRC_75_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("src75", beginSrc75,SRC_75_LEN);
    	}
    }
    /**
	 *	refreshSrc75 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc75() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginSrc75
			            ,SRC_75_LEN
			            ,SRC_75_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
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

  
  protected  static final int TGT_75_LEN = 8;
  protected  static final int TGT_75_SCALE = 2;

   protected BigDecimal checkTgt75MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }

  	/**
	 * serializeTgt75
	 */
	protected void serializeTgt75(BigDecimal tgt75) {
	       putNumber(beginTgt75,tgt75,TGT_75_LEN,TGT_75_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt75Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeTgt75
	 */
   	protected  BigDecimal serializeTgt75(char[] value) throws CFException {
        if (value.length < 8) value = pad(8, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginTgt75
		       ,8
		      );		 localTgt75Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,TGT_75_LEN,TGT_75_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("tgt75", beginTgt75,TGT_75_LEN);
    	}
    }
    /**
	 *	refreshTgt75 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt75() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginTgt75
			            ,TGT_75_LEN
			            ,TGT_75_SCALE
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

  
  protected  static final int SRC_76_LEN = 8;
  protected  static final int SRC_76_SCALE = 2;

   protected BigDecimal checkSrc76MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }

  	/**
	 * serializeSrc76
	 */
	protected void serializeSrc76(BigDecimal src76) {
	       putNumber(beginSrc76,src76,SRC_76_LEN,SRC_76_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc76Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeSrc76
	 */
   	protected  BigDecimal serializeSrc76(char[] value) throws CFException {
        if (value.length < 8) value = pad(8, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(8,value,true/*isSigned?*/)
		       ,beginSrc76
		       ,8
		      );		 localSrc76Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,SRC_76_LEN,SRC_76_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("src76", beginSrc76,SRC_76_LEN);
    	}
    }
    /**
	 *	refreshSrc76 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc76() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginSrc76
			            ,SRC_76_LEN
			            ,SRC_76_SCALE
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

  
  protected  static final int TGT_76_LEN = 14;
  protected  static final int TGT_76_SCALE = 4;

   protected BigDecimal checkTgt76MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,4/*scale*/,14/*precision*/);
   }

  	/**
	 * serializeTgt76
	 */
	protected void serializeTgt76(BigDecimal tgt76) {
	       putNumber(beginTgt76,tgt76,TGT_76_LEN,TGT_76_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt76Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeTgt76
	 */
   	protected  BigDecimal serializeTgt76(char[] value) throws CFException {
        if (value.length < 14) value = pad(14, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(14,value,false/*isSigned?*/)
		       ,beginTgt76
		       ,14
		      );		 localTgt76Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,TGT_76_LEN,TGT_76_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("tgt76", beginTgt76,TGT_76_LEN);
    	}
    }
    /**
	 *	refreshTgt76 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt76() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginTgt76
			            ,TGT_76_LEN
			            ,TGT_76_SCALE
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

  
  protected  static final int SRC_77_LEN = 13;
  protected  static final int SRC_77_SCALE = 3;

   protected BigDecimal checkSrc77MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,3/*scale*/,13/*precision*/);
   }

  	/**
	 * serializeSrc77
	 */
	protected void serializeSrc77(BigDecimal src77) {
	       putNumber(beginSrc77,src77,SRC_77_LEN,SRC_77_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc77Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeSrc77
	 */
   	protected  BigDecimal serializeSrc77(char[] value) throws CFException {
        if (value.length < 13) value = pad(13, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(13,value,false/*isSigned?*/)
		       ,beginSrc77
		       ,13
		      );		 localSrc77Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,SRC_77_LEN,SRC_77_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("src77", beginSrc77,SRC_77_LEN);
    	}
    }
    /**
	 *	refreshSrc77 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc77() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginSrc77
			            ,SRC_77_LEN
			            ,SRC_77_SCALE
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
	
	 /**
	 *	Returns String value of tgt77
	 *	@return tgt77
	 */
	public char[]  getTgt77String() {
	    return getCharArray(beginTgt77,TGT_77_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt77IsNumeric() {
		    return isNumeric(beginTgt77
	                    ,beginTgt77 + TGT_77_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int TGT_77_LEN = 8;
  protected  static final int TGT_77_SCALE = 2;

   protected BigDecimal checkTgt77MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }

  	/**
	 * serializeTgt77
	 */
	protected void serializeTgt77(BigDecimal tgt77) {
	       putNumber(beginTgt77,tgt77,TGT_77_LEN,TGT_77_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt77Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeTgt77
	 */
   	protected  BigDecimal serializeTgt77(char[] value) throws CFException {
        if (value.length < 8) value = pad(8, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(8,value,true/*isSigned?*/)
		       ,beginTgt77
		       ,8
		      );		 localTgt77Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,TGT_77_LEN,TGT_77_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("tgt77", beginTgt77,TGT_77_LEN);
    	}
    }
    /**
	 *	refreshTgt77 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt77() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginTgt77
			            ,TGT_77_LEN
			            ,TGT_77_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt77", beginTgt77,TGT_77_LEN);
    }
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

  
  protected  static final int SRC_78_LEN = 8;
  protected  static final int SRC_78_SCALE = 2;

   protected BigDecimal checkSrc78MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }

  	/**
	 * serializeSrc78
	 */
	protected void serializeSrc78(BigDecimal src78) {
	       putNumber(beginSrc78,src78,SRC_78_LEN,SRC_78_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc78Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeSrc78
	 */
   	protected  BigDecimal serializeSrc78(char[] value) throws CFException {
        if (value.length < 8) value = pad(8, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginSrc78
		       ,8
		      );		 localSrc78Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,SRC_78_LEN,SRC_78_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("src78", beginSrc78,SRC_78_LEN);
    	}
    }
    /**
	 *	refreshSrc78 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc78() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginSrc78
			            ,SRC_78_LEN
			            ,SRC_78_SCALE
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
	
	 /**
	 *	Returns String value of tgt78
	 *	@return tgt78
	 */
	public char[]  getTgt78String() {
	    return getCharArray(beginTgt78,TGT_78_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt78IsNumeric() {
		    return isNumeric(beginTgt78
	                    ,beginTgt78 + TGT_78_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int TGT_78_LEN = 14;
  protected  static final int TGT_78_SCALE = 4;

   protected BigDecimal checkTgt78MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,4/*scale*/,14/*precision*/);
   }

  	/**
	 * serializeTgt78
	 */
	protected void serializeTgt78(BigDecimal tgt78) {
	       putNumber(beginTgt78,tgt78,TGT_78_LEN,TGT_78_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt78Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeTgt78
	 */
   	protected  BigDecimal serializeTgt78(char[] value) throws CFException {
        if (value.length < 14) value = pad(14, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(14,value,true/*isSigned?*/)
		       ,beginTgt78
		       ,14
		      );		 localTgt78Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,TGT_78_LEN,TGT_78_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("tgt78", beginTgt78,TGT_78_LEN);
    	}
    }
    /**
	 *	refreshTgt78 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt78() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginTgt78
			            ,TGT_78_LEN
			            ,TGT_78_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt78", beginTgt78,TGT_78_LEN);
    }
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

  
  protected  static final int SRC_79_LEN = 13;
  protected  static final int SRC_79_SCALE = 3;

   protected BigDecimal checkSrc79MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,3/*scale*/,13/*precision*/);
   }

  	/**
	 * serializeSrc79
	 */
	protected void serializeSrc79(BigDecimal src79) {
	       putNumber(beginSrc79,src79,SRC_79_LEN,SRC_79_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc79Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeSrc79
	 */
   	protected  BigDecimal serializeSrc79(char[] value) throws CFException {
        if (value.length < 13) value = pad(13, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(13,value,false/*isSigned?*/)
		       ,beginSrc79
		       ,13
		      );		 localSrc79Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,SRC_79_LEN,SRC_79_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("src79", beginSrc79,SRC_79_LEN);
    	}
    }
    /**
	 *	refreshSrc79 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc79() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginSrc79
			            ,SRC_79_LEN
			            ,SRC_79_SCALE
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
	
	 /**
	 *	Returns String value of tgt79
	 *	@return tgt79
	 */
	public char[]  getTgt79String() {
	    return getCharArray(beginTgt79,TGT_79_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt79IsNumeric() {
		    return isNumeric(beginTgt79
	                    ,beginTgt79 + TGT_79_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int TGT_79_LEN = 8;
  protected  static final int TGT_79_SCALE = 2;

   protected BigDecimal checkTgt79MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }

  	/**
	 * serializeTgt79
	 */
	protected void serializeTgt79(BigDecimal tgt79) {
	       putNumber(beginTgt79,tgt79,TGT_79_LEN,TGT_79_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt79Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeTgt79
	 */
   	protected  BigDecimal serializeTgt79(char[] value) throws CFException {
        if (value.length < 8) value = pad(8, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginTgt79
		       ,8
		      );		 localTgt79Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,TGT_79_LEN,TGT_79_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("tgt79", beginTgt79,TGT_79_LEN);
    	}
    }
    /**
	 *	refreshTgt79 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt79() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginTgt79
			            ,TGT_79_LEN
			            ,TGT_79_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt79", beginTgt79,TGT_79_LEN);
    }
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

  
  protected  static final int SRC_80_LEN = 8;
  protected  static final int SRC_80_SCALE = 2;

   protected BigDecimal checkSrc80MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }

  	/**
	 * serializeSrc80
	 */
	protected void serializeSrc80(BigDecimal src80) {
	       putNumber(beginSrc80,src80,SRC_80_LEN,SRC_80_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc80Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeSrc80
	 */
   	protected  BigDecimal serializeSrc80(char[] value) throws CFException {
        if (value.length < 8) value = pad(8, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginSrc80
		       ,8
		      );		 localSrc80Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,SRC_80_LEN,SRC_80_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("src80", beginSrc80,SRC_80_LEN);
    	}
    }
    /**
	 *	refreshSrc80 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc80() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginSrc80
			            ,SRC_80_LEN
			            ,SRC_80_SCALE
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
	
	 /**
	 *	Returns String value of tgt80
	 *	@return tgt80
	 */
	public char[]  getTgt80String() {
	    return getCharArray(beginTgt80,TGT_80_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt80IsNumeric() {
		    return isNumeric(beginTgt80
	                    ,beginTgt80 + TGT_80_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int TGT_80_LEN = 14;
  protected  static final int TGT_80_SCALE = 4;

   protected BigDecimal checkTgt80MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,4/*scale*/,14/*precision*/);
   }

  	/**
	 * serializeTgt80
	 */
	protected void serializeTgt80(BigDecimal tgt80) {
	       putNumber(beginTgt80,tgt80,TGT_80_LEN,TGT_80_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt80Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeTgt80
	 */
   	protected  BigDecimal serializeTgt80(char[] value) throws CFException {
        if (value.length < 14) value = pad(14, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(14,value,false/*isSigned?*/)
		       ,beginTgt80
		       ,14
		      );		 localTgt80Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,TGT_80_LEN,TGT_80_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("tgt80", beginTgt80,TGT_80_LEN);
    	}
    }
    /**
	 *	refreshTgt80 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt80() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginTgt80
			            ,TGT_80_LEN
			            ,TGT_80_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt80", beginTgt80,TGT_80_LEN);
    }
   	}
         int localSrc81Counter = -1;
         public boolean isSrc81Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc81Counter != sharedCounter;
            localSrc81Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkSrc81MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     int localTgt81Counter = -1;
     public boolean isTgt81Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt81Counter != sharedCounter;
         localTgt81Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tgt81
	 *	@return tgt81
	 */
	public char[]  getTgt81String() {
	     return getCharArray(beginTgt81,TGT_81_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt81IsNumeric() {
	    return isNumeric(beginTgt81
	                    ,beginTgt81 + TGT_81_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TGT_81_LEN = 10;
  	/**
	 * serializeTgt81
	 */
	protected void serializeTgt81(long tgt81) {
		 putNumber(beginTgt81,tgt81,TGT_81_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt81Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTgt81
	 */
   	protected  long serializeTgt81(char[] value) {
	    long  tgt81;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tgt81 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginTgt81
		       ,10
		      );
		 localTgt81Counter = shareString.getSerializedField().getModifiedCounter();
		return  tgt81;
    }

   protected long checkTgt81MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTgt81 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTgt81() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTgt81
			                 ,TGT_81_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt81", beginTgt81,TGT_81_LEN);
    }
   	}
         int localSrc82Counter = -1;
         public boolean isSrc82Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc82Counter != sharedCounter;
            localSrc82Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSrc82MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
     int localTgt82Counter = -1;
     public boolean isTgt82Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt82Counter != sharedCounter;
         localTgt82Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tgt82
	 *	@return tgt82
	 */
	public char[]  getTgt82String() {
	     return getCharArray(beginTgt82,TGT_82_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt82IsNumeric() {
	    return isNumeric(beginTgt82
	                    ,beginTgt82 + TGT_82_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TGT_82_LEN = 10;
  	/**
	 * serializeTgt82
	 */
	protected void serializeTgt82(long tgt82) {
		 putNumber(beginTgt82,tgt82,TGT_82_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt82Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTgt82
	 */
   	protected  long serializeTgt82(char[] value) {
	    long  tgt82;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tgt82 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginTgt82
		       ,10
		      );
		 localTgt82Counter = shareString.getSerializedField().getModifiedCounter();
		return  tgt82;
    }

   protected long checkTgt82MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTgt82 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTgt82() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTgt82
			                 ,TGT_82_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt82", beginTgt82,TGT_82_LEN);
    }
   	}
         int localSrc83Counter = -1;
         public boolean isSrc83Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc83Counter != sharedCounter;
            localSrc83Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSrc83MaxLimit(long number) {
        return checkMaxLimit(number, true/*isSigned*/,8/*dataLen*/);
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

  
   protected  static final int TGT_83_LEN = 10;
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
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tgt83 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginTgt83
		       ,10
		      );
		 localTgt83Counter = shareString.getSerializedField().getModifiedCounter();
		return  tgt83;
    }

   protected long checkTgt83MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
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
       
      
   protected long checkSrc84MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,8/*dataLen*/);
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
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TGT_84_LEN = 10;
  	/**
	 * serializeTgt84
	 */
	protected void serializeTgt84(long tgt84) {
		 putNumber(beginTgt84,tgt84,TGT_84_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt84Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTgt84
	 */
   	protected  long serializeTgt84(char[] value) {
	    long  tgt84;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tgt84 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginTgt84
		       ,10
		      );
		 localTgt84Counter = shareString.getSerializedField().getModifiedCounter();
		return  tgt84;
    }

   protected long checkTgt84MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTgt84 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTgt84() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTgt84
			                 ,TGT_84_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
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
       
      
   protected short checkSrc85MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     int localTgt85Counter = -1;
     public boolean isTgt85Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt85Counter != sharedCounter;
         localTgt85Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tgt85
	 *	@return tgt85
	 */
	public char[]  getTgt85String() {
	     return getCharArray(beginTgt85,TGT_85_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt85IsNumeric() {
	    return isNumeric(beginTgt85
	                    ,beginTgt85 + TGT_85_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TGT_85_LEN = 10;
  	/**
	 * serializeTgt85
	 */
	protected void serializeTgt85(long tgt85) {
		 putNumber(beginTgt85,tgt85,TGT_85_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt85Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTgt85
	 */
   	protected  long serializeTgt85(char[] value) {
	    long  tgt85;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tgt85 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginTgt85
		       ,10
		      );
		 localTgt85Counter = shareString.getSerializedField().getModifiedCounter();
		return  tgt85;
    }

   protected long checkTgt85MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTgt85 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTgt85() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTgt85
			                 ,TGT_85_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt85", beginTgt85,TGT_85_LEN);
    }
   	}
         int localSrc86Counter = -1;
         public boolean isSrc86Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc86Counter != sharedCounter;
            localSrc86Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkSrc86MaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     int localTgt86Counter = -1;
     public boolean isTgt86Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt86Counter != sharedCounter;
         localTgt86Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tgt86
	 *	@return tgt86
	 */
	public char[]  getTgt86String() {
	     return getCharArray(beginTgt86,TGT_86_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt86IsNumeric() {
	    return isNumeric(beginTgt86
	                    ,beginTgt86 + TGT_86_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TGT_86_LEN = 10;
  	/**
	 * serializeTgt86
	 */
	protected void serializeTgt86(long tgt86) {
		 putNumber(beginTgt86,tgt86,TGT_86_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt86Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTgt86
	 */
   	protected  long serializeTgt86(char[] value) {
	    long  tgt86;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tgt86 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginTgt86
		       ,10
		      );
		 localTgt86Counter = shareString.getSerializedField().getModifiedCounter();
		return  tgt86;
    }

   protected long checkTgt86MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTgt86 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTgt86() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTgt86
			                 ,TGT_86_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt86", beginTgt86,TGT_86_LEN);
    }
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
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SRC_87_LEN = 6;
  	/**
	 * serializeSrc87
	 */
	protected void serializeSrc87(long src87) {
		 putNumber(beginSrc87,src87,SRC_87_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc87Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSrc87
	 */
   	protected  long serializeSrc87(char[] value) {
	    long  src87;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    src87 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginSrc87
		       ,6
		      );
		 localSrc87Counter = shareString.getSerializedField().getModifiedCounter();
		return  src87;
    }

   protected long checkSrc87MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
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
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
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

	/**
	 *	Returns String value of tgt87
	 *	@return tgt87
	 */
	public char[]  getTgt87String() {
	     return getCharArray(beginTgt87,TGT_87_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt87IsNumeric() {
	    return isNumeric(beginTgt87
	                    ,beginTgt87 + TGT_87_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TGT_87_LEN = 10;
  	/**
	 * serializeTgt87
	 */
	protected void serializeTgt87(long tgt87) {
		 putNumber(beginTgt87,tgt87,TGT_87_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt87Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTgt87
	 */
   	protected  long serializeTgt87(char[] value) {
	    long  tgt87;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tgt87 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginTgt87
		       ,10
		      );
		 localTgt87Counter = shareString.getSerializedField().getModifiedCounter();
		return  tgt87;
    }

   protected long checkTgt87MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTgt87 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTgt87() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTgt87
			                 ,TGT_87_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt87", beginTgt87,TGT_87_LEN);
    }
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

  
   protected  static final int SRC_88_LEN = 6;
  	/**
	 * serializeSrc88
	 */
	protected void serializeSrc88(int src88) {
		 putNumber(beginSrc88,src88,SRC_88_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc88Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSrc88
	 */
   	protected  int serializeSrc88(char[] value) {
	    int  src88;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    src88 = (int) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,true/*isSigned?*/)
		       ,beginSrc88
		       ,6
		      );
		 localSrc88Counter = shareString.getSerializedField().getModifiedCounter();
		return  src88;
    }

   protected int checkSrc88MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1M/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshSrc88 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSrc88() throws CFException {
   	try {	 
			return (
			          getIntNumber(
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

	/**
	 *	Returns String value of tgt88
	 *	@return tgt88
	 */
	public char[]  getTgt88String() {
	     return getCharArray(beginTgt88,TGT_88_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt88IsNumeric() {
	    return isNumeric(beginTgt88
	                    ,beginTgt88 + TGT_88_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TGT_88_LEN = 10;
  	/**
	 * serializeTgt88
	 */
	protected void serializeTgt88(long tgt88) {
		 putNumber(beginTgt88,tgt88,TGT_88_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt88Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTgt88
	 */
   	protected  long serializeTgt88(char[] value) {
	    long  tgt88;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tgt88 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginTgt88
		       ,10
		      );
		 localTgt88Counter = shareString.getSerializedField().getModifiedCounter();
		return  tgt88;
    }

   protected long checkTgt88MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTgt88 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTgt88() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTgt88
			                 ,TGT_88_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt88", beginTgt88,TGT_88_LEN);
    }
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
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SRC_89_LEN = 10;
  	/**
	 * serializeSrc89
	 */
	protected void serializeSrc89(long src89) {
		 putNumber(beginSrc89,src89,SRC_89_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
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
	    src89 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginSrc89
		       ,10
		      );
		 localSrc89Counter = shareString.getSerializedField().getModifiedCounter();
		return  src89;
    }

   protected long checkSrc89MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
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
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
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
       
      
   protected int checkTgt89MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
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
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SRC_90_LEN = 10;
  	/**
	 * serializeSrc90
	 */
	protected void serializeSrc90(long src90) {
		 putNumber(beginSrc90,src90,SRC_90_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
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
	    src90 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginSrc90
		       ,10
		      );
		 localSrc90Counter = shareString.getSerializedField().getModifiedCounter();
		return  src90;
    }

   protected long checkSrc90MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
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
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
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
       
      
   protected long checkTgt90MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
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
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SRC_91_LEN = 10;
  	/**
	 * serializeSrc91
	 */
	protected void serializeSrc91(long src91) {
		 putNumber(beginSrc91,src91,SRC_91_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
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
	    src91 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginSrc91
		       ,10
		      );
		 localSrc91Counter = shareString.getSerializedField().getModifiedCounter();
		return  src91;
    }

   protected long checkSrc91MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
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
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
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
       
      
   protected long checkTgt91MaxLimit(long number) {
        return checkMaxLimit(number, true/*isSigned*/,8/*dataLen*/);
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
       
      
   protected long checkTgt92MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,8/*dataLen*/);
   }
     int localSrc93Counter = -1;
     public boolean isSrc93Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc93Counter != sharedCounter;
         localSrc93Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of src93
	 *	@return src93
	 */
	public char[]  getSrc93String() {
	     return getCharArray(beginSrc93,SRC_93_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src93IsNumeric() {
	    return isNumeric(beginSrc93
	                    ,beginSrc93 + SRC_93_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SRC_93_LEN = 10;
  	/**
	 * serializeSrc93
	 */
	protected void serializeSrc93(long src93) {
		 putNumber(beginSrc93,src93,SRC_93_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc93Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSrc93
	 */
   	protected  long serializeSrc93(char[] value) {
	    long  src93;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    src93 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginSrc93
		       ,10
		      );
		 localSrc93Counter = shareString.getSerializedField().getModifiedCounter();
		return  src93;
    }

   protected long checkSrc93MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSrc93 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSrc93() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSrc93
			                 ,SRC_93_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("src93", beginSrc93,SRC_93_LEN);
    }
   	}
         int localTgt93Counter = -1;
         public boolean isTgt93Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt93Counter != sharedCounter;
            localTgt93Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkTgt93MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     int localSrc94Counter = -1;
     public boolean isSrc94Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc94Counter != sharedCounter;
         localSrc94Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of src94
	 *	@return src94
	 */
	public char[]  getSrc94String() {
	     return getCharArray(beginSrc94,SRC_94_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src94IsNumeric() {
	    return isNumeric(beginSrc94
	                    ,beginSrc94 + SRC_94_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SRC_94_LEN = 10;
  	/**
	 * serializeSrc94
	 */
	protected void serializeSrc94(long src94) {
		 putNumber(beginSrc94,src94,SRC_94_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc94Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSrc94
	 */
   	protected  long serializeSrc94(char[] value) {
	    long  src94;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    src94 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginSrc94
		       ,10
		      );
		 localSrc94Counter = shareString.getSerializedField().getModifiedCounter();
		return  src94;
    }

   protected long checkSrc94MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSrc94 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSrc94() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSrc94
			                 ,SRC_94_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("src94", beginSrc94,SRC_94_LEN);
    }
   	}
         int localTgt94Counter = -1;
         public boolean isTgt94Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt94Counter != sharedCounter;
            localTgt94Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkTgt94MaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     int localSrc95Counter = -1;
     public boolean isSrc95Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc95Counter != sharedCounter;
         localSrc95Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of src95
	 *	@return src95
	 */
	public char[]  getSrc95String() {
	     return getCharArray(beginSrc95,SRC_95_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src95IsNumeric() {
	    return isNumeric(beginSrc95
	                    ,beginSrc95 + SRC_95_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SRC_95_LEN = 10;
  	/**
	 * serializeSrc95
	 */
	protected void serializeSrc95(long src95) {
		 putNumber(beginSrc95,src95,SRC_95_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc95Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSrc95
	 */
   	protected  long serializeSrc95(char[] value) {
	    long  src95;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    src95 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginSrc95
		       ,10
		      );
		 localSrc95Counter = shareString.getSerializedField().getModifiedCounter();
		return  src95;
    }

   protected long checkSrc95MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSrc95 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSrc95() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSrc95
			                 ,SRC_95_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("src95", beginSrc95,SRC_95_LEN);
    }
   	}
     int localTgt95Counter = -1;
     public boolean isTgt95Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt95Counter != sharedCounter;
         localTgt95Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tgt95
	 *	@return tgt95
	 */
	public char[]  getTgt95String() {
	     return getCharArray(beginTgt95,TGT_95_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt95IsNumeric() {
	    return isNumeric(beginTgt95
	                    ,beginTgt95 + TGT_95_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TGT_95_LEN = 6;
  	/**
	 * serializeTgt95
	 */
	protected void serializeTgt95(long tgt95) {
		 putNumber(beginTgt95,tgt95,TGT_95_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt95Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTgt95
	 */
   	protected  long serializeTgt95(char[] value) {
	    long  tgt95;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tgt95 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginTgt95
		       ,6
		      );
		 localTgt95Counter = shareString.getSerializedField().getModifiedCounter();
		return  tgt95;
    }

   protected long checkTgt95MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTgt95 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTgt95() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTgt95
			                 ,TGT_95_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
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

	/**
	 *	Returns String value of src96
	 *	@return src96
	 */
	public char[]  getSrc96String() {
	     return getCharArray(beginSrc96,SRC_96_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src96IsNumeric() {
	    return isNumeric(beginSrc96
	                    ,beginSrc96 + SRC_96_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SRC_96_LEN = 10;
  	/**
	 * serializeSrc96
	 */
	protected void serializeSrc96(long src96) {
		 putNumber(beginSrc96,src96,SRC_96_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc96Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSrc96
	 */
   	protected  long serializeSrc96(char[] value) {
	    long  src96;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    src96 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginSrc96
		       ,10
		      );
		 localSrc96Counter = shareString.getSerializedField().getModifiedCounter();
		return  src96;
    }

   protected long checkSrc96MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSrc96 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSrc96() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSrc96
			                 ,SRC_96_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("src96", beginSrc96,SRC_96_LEN);
    }
   	}
     int localTgt96Counter = -1;
     public boolean isTgt96Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt96Counter != sharedCounter;
         localTgt96Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tgt96
	 *	@return tgt96
	 */
	public char[]  getTgt96String() {
	     return getCharArray(beginTgt96,TGT_96_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt96IsNumeric() {
	    return isNumeric(beginTgt96
	                    ,beginTgt96 + TGT_96_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TGT_96_LEN = 6;
  	/**
	 * serializeTgt96
	 */
	protected void serializeTgt96(int tgt96) {
		 putNumber(beginTgt96,tgt96,TGT_96_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt96Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTgt96
	 */
   	protected  int serializeTgt96(char[] value) {
	    int  tgt96;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tgt96 = (int) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,true/*isSigned?*/)
		       ,beginTgt96
		       ,6
		      );
		 localTgt96Counter = shareString.getSerializedField().getModifiedCounter();
		return  tgt96;
    }

   protected int checkTgt96MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1M/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshTgt96 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTgt96() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginTgt96
			                 ,TGT_96_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
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

	/**
	 *	Returns String value of src97
	 *	@return src97
	 */
	public char[]  getSrc97String() {
	     return getCharArray(beginSrc97,SRC_97_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src97IsNumeric() {
	    return isNumeric(beginSrc97
	                    ,beginSrc97 + SRC_97_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SRC_97_LEN = 10;
  	/**
	 * serializeSrc97
	 */
	protected void serializeSrc97(long src97) {
		 putNumber(beginSrc97,src97,SRC_97_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc97Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSrc97
	 */
   	protected  long serializeSrc97(char[] value) {
	    long  src97;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    src97 = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,true/*isSigned?*/)
		       ,beginSrc97
		       ,10
		      );
		 localSrc97Counter = shareString.getSerializedField().getModifiedCounter();
		return  src97;
    }

   protected long checkSrc97MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshSrc97 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSrc97() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSrc97
			                 ,SRC_97_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("src97", beginSrc97,SRC_97_LEN);
    }
   	}
         int localTgt97Counter = -1;
         public boolean isTgt97Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt97Counter != sharedCounter;
            localTgt97Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkTgt97MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     int localSrc98Counter = -1;
     public boolean isSrc98Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc98Counter != sharedCounter;
         localSrc98Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of src98
	 *	@return src98
	 */
	public char[]  getSrc98String() {
	     return getCharArray(beginSrc98,SRC_98_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src98IsNumeric() {
	    return isNumeric(beginSrc98
	                    ,beginSrc98 + SRC_98_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SRC_98_LEN = 10;
  	/**
	 * serializeSrc98
	 */
	protected void serializeSrc98(long src98) {
		 putNumber(beginSrc98,src98,SRC_98_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc98Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSrc98
	 */
   	protected  long serializeSrc98(char[] value) {
	    long  src98;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    src98 = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,true/*isSigned?*/)
		       ,beginSrc98
		       ,10
		      );
		 localSrc98Counter = shareString.getSerializedField().getModifiedCounter();
		return  src98;
    }

   protected long checkSrc98MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshSrc98 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSrc98() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSrc98
			                 ,SRC_98_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("src98", beginSrc98,SRC_98_LEN);
    }
   	}
         int localTgt98Counter = -1;
         public boolean isTgt98Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt98Counter != sharedCounter;
            localTgt98Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkTgt98MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
     int localSrc99Counter = -1;
     public boolean isSrc99Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc99Counter != sharedCounter;
         localSrc99Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of src99
	 *	@return src99
	 */
	public char[]  getSrc99String() {
	     return getCharArray(beginSrc99,SRC_99_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src99IsNumeric() {
	    return isNumeric(beginSrc99
	                    ,beginSrc99 + SRC_99_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SRC_99_LEN = 10;
  	/**
	 * serializeSrc99
	 */
	protected void serializeSrc99(long src99) {
		 putNumber(beginSrc99,src99,SRC_99_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc99Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSrc99
	 */
   	protected  long serializeSrc99(char[] value) {
	    long  src99;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    src99 = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,true/*isSigned?*/)
		       ,beginSrc99
		       ,10
		      );
		 localSrc99Counter = shareString.getSerializedField().getModifiedCounter();
		return  src99;
    }

   protected long checkSrc99MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshSrc99 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSrc99() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSrc99
			                 ,SRC_99_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("src99", beginSrc99,SRC_99_LEN);
    }
   	}
         int localTgt99Counter = -1;
         public boolean isTgt99Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt99Counter != sharedCounter;
            localTgt99Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkTgt99MaxLimit(long number) {
        return checkMaxLimit(number, true/*isSigned*/,8/*dataLen*/);
   }
     int localSrc100Counter = -1;
     public boolean isSrc100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc100Counter != sharedCounter;
         localSrc100Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of src100
	 *	@return src100
	 */
	public char[]  getSrc100String() {
	     return getCharArray(beginSrc100,SRC_100_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src100IsNumeric() {
	    return isNumeric(beginSrc100
	                    ,beginSrc100 + SRC_100_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SRC_100_LEN = 10;
  	/**
	 * serializeSrc100
	 */
	protected void serializeSrc100(long src100) {
		 putNumber(beginSrc100,src100,SRC_100_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc100Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSrc100
	 */
   	protected  long serializeSrc100(char[] value) {
	    long  src100;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    src100 = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,true/*isSigned?*/)
		       ,beginSrc100
		       ,10
		      );
		 localSrc100Counter = shareString.getSerializedField().getModifiedCounter();
		return  src100;
    }

   protected long checkSrc100MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshSrc100 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSrc100() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSrc100
			                 ,SRC_100_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("src100", beginSrc100,SRC_100_LEN);
    }
   	}
         int localTgt100Counter = -1;
         public boolean isTgt100Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt100Counter != sharedCounter;
            localTgt100Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkTgt100MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,8/*dataLen*/);
   }
     int localSrc101Counter = -1;
     public boolean isSrc101Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc101Counter != sharedCounter;
         localSrc101Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of src101
	 *	@return src101
	 */
	public char[]  getSrc101String() {
	     return getCharArray(beginSrc101,SRC_101_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src101IsNumeric() {
	    return isNumeric(beginSrc101
	                    ,beginSrc101 + SRC_101_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SRC_101_LEN = 10;
  	/**
	 * serializeSrc101
	 */
	protected void serializeSrc101(long src101) {
		 putNumber(beginSrc101,src101,SRC_101_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc101Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSrc101
	 */
   	protected  long serializeSrc101(char[] value) {
	    long  src101;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    src101 = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,true/*isSigned?*/)
		       ,beginSrc101
		       ,10
		      );
		 localSrc101Counter = shareString.getSerializedField().getModifiedCounter();
		return  src101;
    }

   protected long checkSrc101MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshSrc101 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSrc101() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSrc101
			                 ,SRC_101_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("src101", beginSrc101,SRC_101_LEN);
    }
   	}
         int localTgt101Counter = -1;
         public boolean isTgt101Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt101Counter != sharedCounter;
            localTgt101Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkTgt101MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     int localSrc102Counter = -1;
     public boolean isSrc102Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc102Counter != sharedCounter;
         localSrc102Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of src102
	 *	@return src102
	 */
	public char[]  getSrc102String() {
	     return getCharArray(beginSrc102,SRC_102_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src102IsNumeric() {
	    return isNumeric(beginSrc102
	                    ,beginSrc102 + SRC_102_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SRC_102_LEN = 10;
  	/**
	 * serializeSrc102
	 */
	protected void serializeSrc102(long src102) {
		 putNumber(beginSrc102,src102,SRC_102_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc102Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSrc102
	 */
   	protected  long serializeSrc102(char[] value) {
	    long  src102;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    src102 = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,true/*isSigned?*/)
		       ,beginSrc102
		       ,10
		      );
		 localSrc102Counter = shareString.getSerializedField().getModifiedCounter();
		return  src102;
    }

   protected long checkSrc102MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshSrc102 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSrc102() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSrc102
			                 ,SRC_102_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("src102", beginSrc102,SRC_102_LEN);
    }
   	}
         int localTgt102Counter = -1;
         public boolean isTgt102Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt102Counter != sharedCounter;
            localTgt102Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkTgt102MaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     int localSrc103Counter = -1;
     public boolean isSrc103Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc103Counter != sharedCounter;
         localSrc103Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of src103
	 *	@return src103
	 */
	public char[]  getSrc103String() {
	     return getCharArray(beginSrc103,SRC_103_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src103IsNumeric() {
	    return isNumeric(beginSrc103
	                    ,beginSrc103 + SRC_103_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SRC_103_LEN = 10;
  	/**
	 * serializeSrc103
	 */
	protected void serializeSrc103(long src103) {
		 putNumber(beginSrc103,src103,SRC_103_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc103Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSrc103
	 */
   	protected  long serializeSrc103(char[] value) {
	    long  src103;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    src103 = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,true/*isSigned?*/)
		       ,beginSrc103
		       ,10
		      );
		 localSrc103Counter = shareString.getSerializedField().getModifiedCounter();
		return  src103;
    }

   protected long checkSrc103MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshSrc103 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSrc103() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSrc103
			                 ,SRC_103_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
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

	/**
	 *	Returns String value of tgt103
	 *	@return tgt103
	 */
	public char[]  getTgt103String() {
	     return getCharArray(beginTgt103,TGT_103_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt103IsNumeric() {
	    return isNumeric(beginTgt103
	                    ,beginTgt103 + TGT_103_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TGT_103_LEN = 6;
  	/**
	 * serializeTgt103
	 */
	protected void serializeTgt103(long tgt103) {
		 putNumber(beginTgt103,tgt103,TGT_103_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt103Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTgt103
	 */
   	protected  long serializeTgt103(char[] value) {
	    long  tgt103;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tgt103 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginTgt103
		       ,6
		      );
		 localTgt103Counter = shareString.getSerializedField().getModifiedCounter();
		return  tgt103;
    }

   protected long checkTgt103MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTgt103 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTgt103() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTgt103
			                 ,TGT_103_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
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

	/**
	 *	Returns String value of src104
	 *	@return src104
	 */
	public char[]  getSrc104String() {
	     return getCharArray(beginSrc104,SRC_104_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src104IsNumeric() {
	    return isNumeric(beginSrc104
	                    ,beginSrc104 + SRC_104_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SRC_104_LEN = 10;
  	/**
	 * serializeSrc104
	 */
	protected void serializeSrc104(long src104) {
		 putNumber(beginSrc104,src104,SRC_104_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc104Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSrc104
	 */
   	protected  long serializeSrc104(char[] value) {
	    long  src104;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    src104 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginSrc104
		       ,10
		      );
		 localSrc104Counter = shareString.getSerializedField().getModifiedCounter();
		return  src104;
    }

   protected long checkSrc104MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSrc104 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSrc104() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSrc104
			                 ,SRC_104_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
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

	/**
	 *	Returns String value of tgt104
	 *	@return tgt104
	 */
	public char[]  getTgt104String() {
	     return getCharArray(beginTgt104,TGT_104_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt104IsNumeric() {
	    return isNumeric(beginTgt104
	                    ,beginTgt104 + TGT_104_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TGT_104_LEN = 6;
  	/**
	 * serializeTgt104
	 */
	protected void serializeTgt104(int tgt104) {
		 putNumber(beginTgt104,tgt104,TGT_104_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt104Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTgt104
	 */
   	protected  int serializeTgt104(char[] value) {
	    int  tgt104;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tgt104 = (int) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,true/*isSigned?*/)
		       ,beginTgt104
		       ,6
		      );
		 localTgt104Counter = shareString.getSerializedField().getModifiedCounter();
		return  tgt104;
    }

   protected int checkTgt104MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1M/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshTgt104 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTgt104() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginTgt104
			                 ,TGT_104_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
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
       
      
   protected short checkSrc105MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     int localTgt105Counter = -1;
     public boolean isTgt105Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt105Counter != sharedCounter;
         localTgt105Counter = sharedCounter; return hasModified;
     }
	protected static final int TGT_105_LEN = 6;
	/**
	 * 	serialize this Tgt105
	 */
   protected void serializeTgt105(char[] tgt105) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tgt105,0,getStringValue(),beginTgt105,TGT_105_LEN);
       localTgt105Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTgt105Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshTgt105 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTgt105() {	 
   		return (substring(getStringValue(),beginTgt105,beginTgt105 + TGT_105_LEN));
   	}
         int localSrc106Counter = -1;
         public boolean isSrc106Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc106Counter != sharedCounter;
            localSrc106Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkSrc106MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     int localTgt106Counter = -1;
     public boolean isTgt106Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt106Counter != sharedCounter;
         localTgt106Counter = sharedCounter; return hasModified;
     }
	protected static final int TGT_106_LEN = 6;
	/**
	 * 	serialize this Tgt106
	 */
   protected void serializeTgt106(char[] tgt106) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tgt106,0,getStringValue(),beginTgt106,TGT_106_LEN);
       localTgt106Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTgt106Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshTgt106 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTgt106() {	 
   		return (substring(getStringValue(),beginTgt106,beginTgt106 + TGT_106_LEN));
   	}
         int localSrc107Counter = -1;
         public boolean isSrc107Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc107Counter != sharedCounter;
            localSrc107Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkSrc107MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
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
		   putDecimal(beginTgt107,tgt107,TGT_107_LEN,TGT_107_SCALE,false);
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
       
      
   protected short checkSrc108MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
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
		   putDecimal(beginTgt108,tgt108,TGT_108_LEN,TGT_108_SCALE,false);
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
       
      
   protected int checkSrc109MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
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
       
      
   protected int checkSrc110MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
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
       
      
   protected int checkSrc111MaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
        int localTgt111Counter = -1;
        public boolean isTgt111Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTgt111Counter != sharedCounter;
           localTgt111Counter = sharedCounter; return hasModified; 
        }
	    public boolean tgt111IsNumeric() {
	      return decimalIsNumeric(beginTgt111,TGT_111_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tgt111String() {
            return getPackedString(beginTgt111,TGT_111_LEN);
         }
   protected static final int TGT_111_LEN = 5;
   protected static final int TGT_111_SCALE = 2;
  	/**
	 * 	serializeTgt111
	 */
	protected void serializeTgt111(BigDecimal tgt111) {
		   putDecimal(beginTgt111,tgt111,TGT_111_LEN,TGT_111_SCALE,false);
		 localTgt111Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTgt111MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }
     /**
	 *	refreshTgt111 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt111() throws CFException {	
   	try { 
		 return (getDecimal(beginTgt111,TGT_111_LEN,TGT_111_SCALE));	
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
       
      
   protected int checkSrc112MaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
        int localTgt112Counter = -1;
        public boolean isTgt112Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTgt112Counter != sharedCounter;
           localTgt112Counter = sharedCounter; return hasModified; 
        }
	    public boolean tgt112IsNumeric() {
	      return decimalIsNumeric(beginTgt112,TGT_112_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tgt112String() {
            return getPackedString(beginTgt112,TGT_112_LEN);
         }
   protected static final int TGT_112_LEN = 8;
   protected static final int TGT_112_SCALE = 4;
  	/**
	 * 	serializeTgt112
	 */
	protected void serializeTgt112(BigDecimal tgt112) {
		   putDecimal(beginTgt112,tgt112,TGT_112_LEN,TGT_112_SCALE,false);
		 localTgt112Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTgt112MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,14/*precision*/);
   }
     /**
	 *	refreshTgt112 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt112() throws CFException {	
   	try { 
		 return (getDecimal(beginTgt112,TGT_112_LEN,TGT_112_SCALE));	
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
       
      
   protected long checkSrc113MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
        int localTgt113Counter = -1;
        public boolean isTgt113Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTgt113Counter != sharedCounter;
           localTgt113Counter = sharedCounter; return hasModified; 
        }
	    public boolean tgt113IsNumeric() {
	      return decimalIsNumeric(beginTgt113,TGT_113_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tgt113String() {
            return getPackedString(beginTgt113,TGT_113_LEN);
         }
   protected static final int TGT_113_LEN = 5;
   protected static final int TGT_113_SCALE = 2;
  	/**
	 * 	serializeTgt113
	 */
	protected void serializeTgt113(BigDecimal tgt113) {
		   putDecimal(beginTgt113,tgt113,TGT_113_LEN,TGT_113_SCALE,false);
		 localTgt113Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTgt113MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }
     /**
	 *	refreshTgt113 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt113() throws CFException {	
   	try { 
		 return (getDecimal(beginTgt113,TGT_113_LEN,TGT_113_SCALE));	
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
       
      
   protected long checkSrc114MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
        int localTgt114Counter = -1;
        public boolean isTgt114Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTgt114Counter != sharedCounter;
           localTgt114Counter = sharedCounter; return hasModified; 
        }
	    public boolean tgt114IsNumeric() {
	      return decimalIsNumeric(beginTgt114,TGT_114_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tgt114String() {
            return getPackedString(beginTgt114,TGT_114_LEN);
         }
   protected static final int TGT_114_LEN = 8;
   protected static final int TGT_114_SCALE = 4;
  	/**
	 * 	serializeTgt114
	 */
	protected void serializeTgt114(BigDecimal tgt114) {
		   putDecimal(beginTgt114,tgt114,TGT_114_LEN,TGT_114_SCALE,false);
		 localTgt114Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTgt114MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,14/*precision*/);
   }
     /**
	 *	refreshTgt114 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt114() throws CFException {	
   	try { 
		 return (getDecimal(beginTgt114,TGT_114_LEN,TGT_114_SCALE));	
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
		   putDecimal(beginSrc115,src115,SRC_115_LEN,SRC_115_SCALE,true);
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
	    public boolean tgt115IsNumeric() {
	      return decimalIsNumeric(beginTgt115,TGT_115_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tgt115String() {
            return getPackedString(beginTgt115,TGT_115_LEN);
         }
   protected static final int TGT_115_LEN = 5;
   protected static final int TGT_115_SCALE = 2;
  	/**
	 * 	serializeTgt115
	 */
	protected void serializeTgt115(BigDecimal tgt115) {
		   putDecimal(beginTgt115,tgt115,TGT_115_LEN,TGT_115_SCALE,false);
		 localTgt115Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTgt115MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }
     /**
	 *	refreshTgt115 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt115() throws CFException {	
   	try { 
		 return (getDecimal(beginTgt115,TGT_115_LEN,TGT_115_SCALE));	
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
		   putDecimal(beginSrc116,src116,SRC_116_LEN,SRC_116_SCALE,true);
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
	    public boolean tgt116IsNumeric() {
	      return decimalIsNumeric(beginTgt116,TGT_116_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tgt116String() {
            return getPackedString(beginTgt116,TGT_116_LEN);
         }
   protected static final int TGT_116_LEN = 8;
   protected static final int TGT_116_SCALE = 4;
  	/**
	 * 	serializeTgt116
	 */
	protected void serializeTgt116(BigDecimal tgt116) {
		   putDecimal(beginTgt116,tgt116,TGT_116_LEN,TGT_116_SCALE,false);
		 localTgt116Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTgt116MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,14/*precision*/);
   }
     /**
	 *	refreshTgt116 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt116() throws CFException {	
   	try { 
		 return (getDecimal(beginTgt116,TGT_116_LEN,TGT_116_SCALE));	
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
	    public boolean tgt117IsNumeric() {
	      return decimalIsNumeric(beginTgt117,TGT_117_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tgt117String() {
            return getPackedString(beginTgt117,TGT_117_LEN);
         }
   protected static final int TGT_117_LEN = 5;
   protected static final int TGT_117_SCALE = 2;
  	/**
	 * 	serializeTgt117
	 */
	protected void serializeTgt117(BigDecimal tgt117) {
		   putDecimal(beginTgt117,tgt117,TGT_117_LEN,TGT_117_SCALE,false);
		 localTgt117Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTgt117MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }
     /**
	 *	refreshTgt117 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt117() throws CFException {	
   	try { 
		 return (getDecimal(beginTgt117,TGT_117_LEN,TGT_117_SCALE));	
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
	    public boolean tgt118IsNumeric() {
	      return decimalIsNumeric(beginTgt118,TGT_118_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tgt118String() {
            return getPackedString(beginTgt118,TGT_118_LEN);
         }
   protected static final int TGT_118_LEN = 8;
   protected static final int TGT_118_SCALE = 4;
  	/**
	 * 	serializeTgt118
	 */
	protected void serializeTgt118(BigDecimal tgt118) {
		   putDecimal(beginTgt118,tgt118,TGT_118_LEN,TGT_118_SCALE,false);
		 localTgt118Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTgt118MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,14/*precision*/);
   }
     /**
	 *	refreshTgt118 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt118() throws CFException {	
   	try { 
		 return (getDecimal(beginTgt118,TGT_118_LEN,TGT_118_SCALE));	
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
	    public boolean tgt119IsNumeric() {
	      return decimalIsNumeric(beginTgt119,TGT_119_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tgt119String() {
            return getPackedString(beginTgt119,TGT_119_LEN);
         }
   protected static final int TGT_119_LEN = 5;
   protected static final int TGT_119_SCALE = 2;
  	/**
	 * 	serializeTgt119
	 */
	protected void serializeTgt119(BigDecimal tgt119) {
		   putDecimal(beginTgt119,tgt119,TGT_119_LEN,TGT_119_SCALE,true);
		 localTgt119Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTgt119MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }
     /**
	 *	refreshTgt119 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt119() throws CFException {	
   	try { 
		 return (getDecimal(beginTgt119,TGT_119_LEN,TGT_119_SCALE));	
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
	    public boolean tgt120IsNumeric() {
	      return decimalIsNumeric(beginTgt120,TGT_120_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tgt120String() {
            return getPackedString(beginTgt120,TGT_120_LEN);
         }
   protected static final int TGT_120_LEN = 8;
   protected static final int TGT_120_SCALE = 4;
  	/**
	 * 	serializeTgt120
	 */
	protected void serializeTgt120(BigDecimal tgt120) {
		   putDecimal(beginTgt120,tgt120,TGT_120_LEN,TGT_120_SCALE,true);
		 localTgt120Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTgt120MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,14/*precision*/);
   }
     /**
	 *	refreshTgt120 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt120() throws CFException {	
   	try { 
		 return (getDecimal(beginTgt120,TGT_120_LEN,TGT_120_SCALE));	
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
	    public boolean tgt121IsNumeric() {
	      return decimalIsNumeric(beginTgt121,TGT_121_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tgt121String() {
            return getPackedString(beginTgt121,TGT_121_LEN);
         }
   protected static final int TGT_121_LEN = 5;
   protected static final int TGT_121_SCALE = 2;
  	/**
	 * 	serializeTgt121
	 */
	protected void serializeTgt121(BigDecimal tgt121) {
		   putDecimal(beginTgt121,tgt121,TGT_121_LEN,TGT_121_SCALE,false);
		 localTgt121Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTgt121MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }
     /**
	 *	refreshTgt121 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt121() throws CFException {	
   	try { 
		 return (getDecimal(beginTgt121,TGT_121_LEN,TGT_121_SCALE));	
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
	    public boolean tgt122IsNumeric() {
	      return decimalIsNumeric(beginTgt122,TGT_122_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tgt122String() {
            return getPackedString(beginTgt122,TGT_122_LEN);
         }
   protected static final int TGT_122_LEN = 8;
   protected static final int TGT_122_SCALE = 4;
  	/**
	 * 	serializeTgt122
	 */
	protected void serializeTgt122(BigDecimal tgt122) {
		   putDecimal(beginTgt122,tgt122,TGT_122_LEN,TGT_122_SCALE,false);
		 localTgt122Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTgt122MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,14/*precision*/);
   }
     /**
	 *	refreshTgt122 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt122() throws CFException {	
   	try { 
		 return (getDecimal(beginTgt122,TGT_122_LEN,TGT_122_SCALE));	
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
	    public boolean src123IsNumeric() {
	      return decimalIsNumeric(beginSrc123,SRC_123_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] src123String() {
            return getPackedString(beginSrc123,SRC_123_LEN);
         }
   protected static final int SRC_123_LEN = 7;
   protected static final int SRC_123_SCALE = 3;
  	/**
	 * 	serializeSrc123
	 */
	protected void serializeSrc123(BigDecimal src123) {
		   putDecimal(beginSrc123,src123,SRC_123_LEN,SRC_123_SCALE,true);
		 localSrc123Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkSrc123MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,3/*scale*/,13/*precision*/);
   }
     /**
	 *	refreshSrc123 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc123() throws CFException {	
   	try { 
		 return (getDecimal(beginSrc123,SRC_123_LEN,SRC_123_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("src123", beginSrc123,SRC_123_LEN);
     }
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

  
  protected  static final int TGT_123_LEN = 8;
  protected  static final int TGT_123_SCALE = 2;

   protected BigDecimal checkTgt123MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }

  	/**
	 * serializeTgt123
	 */
	protected void serializeTgt123(BigDecimal tgt123) {
	       putNumber(beginTgt123,tgt123,TGT_123_LEN,TGT_123_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt123Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeTgt123
	 */
   	protected  BigDecimal serializeTgt123(char[] value) throws CFException {
        if (value.length < 8) value = pad(8, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginTgt123
		       ,8
		      );		 localTgt123Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,TGT_123_LEN,TGT_123_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("tgt123", beginTgt123,TGT_123_LEN);
    	}
    }
    /**
	 *	refreshTgt123 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt123() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginTgt123
			            ,TGT_123_LEN
			            ,TGT_123_SCALE
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
	    public boolean src124IsNumeric() {
	      return decimalIsNumeric(beginSrc124,SRC_124_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] src124String() {
            return getPackedString(beginSrc124,SRC_124_LEN);
         }
   protected static final int SRC_124_LEN = 5;
   protected static final int SRC_124_SCALE = 2;
  	/**
	 * 	serializeSrc124
	 */
	protected void serializeSrc124(BigDecimal src124) {
		   putDecimal(beginSrc124,src124,SRC_124_LEN,SRC_124_SCALE,true);
		 localSrc124Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkSrc124MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }
     /**
	 *	refreshSrc124 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc124() throws CFException {	
   	try { 
		 return (getDecimal(beginSrc124,SRC_124_LEN,SRC_124_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("src124", beginSrc124,SRC_124_LEN);
     }
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

  
  protected  static final int TGT_124_LEN = 14;
  protected  static final int TGT_124_SCALE = 4;

   protected BigDecimal checkTgt124MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,4/*scale*/,14/*precision*/);
   }

  	/**
	 * serializeTgt124
	 */
	protected void serializeTgt124(BigDecimal tgt124) {
	       putNumber(beginTgt124,tgt124,TGT_124_LEN,TGT_124_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt124Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeTgt124
	 */
   	protected  BigDecimal serializeTgt124(char[] value) throws CFException {
        if (value.length < 14) value = pad(14, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(14,value,false/*isSigned?*/)
		       ,beginTgt124
		       ,14
		      );		 localTgt124Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,TGT_124_LEN,TGT_124_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("tgt124", beginTgt124,TGT_124_LEN);
    	}
    }
    /**
	 *	refreshTgt124 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt124() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginTgt124
			            ,TGT_124_LEN
			            ,TGT_124_SCALE
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
	    public boolean src125IsNumeric() {
	      return decimalIsNumeric(beginSrc125,SRC_125_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] src125String() {
            return getPackedString(beginSrc125,SRC_125_LEN);
         }
   protected static final int SRC_125_LEN = 7;
   protected static final int SRC_125_SCALE = 3;
  	/**
	 * 	serializeSrc125
	 */
	protected void serializeSrc125(BigDecimal src125) {
		   putDecimal(beginSrc125,src125,SRC_125_LEN,SRC_125_SCALE,false);
		 localSrc125Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkSrc125MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,3/*scale*/,13/*precision*/);
   }
     /**
	 *	refreshSrc125 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc125() throws CFException {	
   	try { 
		 return (getDecimal(beginSrc125,SRC_125_LEN,SRC_125_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("src125", beginSrc125,SRC_125_LEN);
     }
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
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int TGT_125_LEN = 8;
  protected  static final int TGT_125_SCALE = 2;

   protected BigDecimal checkTgt125MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }

  	/**
	 * serializeTgt125
	 */
	protected void serializeTgt125(BigDecimal tgt125) {
	       putNumber(beginTgt125,tgt125,TGT_125_LEN,TGT_125_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt125Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeTgt125
	 */
   	protected  BigDecimal serializeTgt125(char[] value) throws CFException {
        if (value.length < 8) value = pad(8, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(8,value,true/*isSigned?*/)
		       ,beginTgt125
		       ,8
		      );		 localTgt125Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,TGT_125_LEN,TGT_125_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("tgt125", beginTgt125,TGT_125_LEN);
    	}
    }
    /**
	 *	refreshTgt125 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt125() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginTgt125
			            ,TGT_125_LEN
			            ,TGT_125_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
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
	    public boolean src126IsNumeric() {
	      return decimalIsNumeric(beginSrc126,SRC_126_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] src126String() {
            return getPackedString(beginSrc126,SRC_126_LEN);
         }
   protected static final int SRC_126_LEN = 5;
   protected static final int SRC_126_SCALE = 2;
  	/**
	 * 	serializeSrc126
	 */
	protected void serializeSrc126(BigDecimal src126) {
		   putDecimal(beginSrc126,src126,SRC_126_LEN,SRC_126_SCALE,false);
		 localSrc126Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkSrc126MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }
     /**
	 *	refreshSrc126 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc126() throws CFException {	
   	try { 
		 return (getDecimal(beginSrc126,SRC_126_LEN,SRC_126_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("src126", beginSrc126,SRC_126_LEN);
     }
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
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int TGT_126_LEN = 14;
  protected  static final int TGT_126_SCALE = 4;

   protected BigDecimal checkTgt126MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,4/*scale*/,14/*precision*/);
   }

  	/**
	 * serializeTgt126
	 */
	protected void serializeTgt126(BigDecimal tgt126) {
	       putNumber(beginTgt126,tgt126,TGT_126_LEN,TGT_126_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt126Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeTgt126
	 */
   	protected  BigDecimal serializeTgt126(char[] value) throws CFException {
        if (value.length < 14) value = pad(14, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(14,value,true/*isSigned?*/)
		       ,beginTgt126
		       ,14
		      );		 localTgt126Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,TGT_126_LEN,TGT_126_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("tgt126", beginTgt126,TGT_126_LEN);
    	}
    }
    /**
	 *	refreshTgt126 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt126() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginTgt126
			            ,TGT_126_LEN
			            ,TGT_126_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
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
	    public boolean src127IsNumeric() {
	      return decimalIsNumeric(beginSrc127,SRC_127_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] src127String() {
            return getPackedString(beginSrc127,SRC_127_LEN);
         }
   protected static final int SRC_127_LEN = 7;
   protected static final int SRC_127_SCALE = 3;
  	/**
	 * 	serializeSrc127
	 */
	protected void serializeSrc127(BigDecimal src127) {
		   putDecimal(beginSrc127,src127,SRC_127_LEN,SRC_127_SCALE,false);
		 localSrc127Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkSrc127MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,3/*scale*/,13/*precision*/);
   }
     /**
	 *	refreshSrc127 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc127() throws CFException {	
   	try { 
		 return (getDecimal(beginSrc127,SRC_127_LEN,SRC_127_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("src127", beginSrc127,SRC_127_LEN);
     }
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

  
  protected  static final int TGT_127_LEN = 8;
  protected  static final int TGT_127_SCALE = 2;

   protected BigDecimal checkTgt127MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }

  	/**
	 * serializeTgt127
	 */
	protected void serializeTgt127(BigDecimal tgt127) {
	       putNumber(beginTgt127,tgt127,TGT_127_LEN,TGT_127_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt127Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeTgt127
	 */
   	protected  BigDecimal serializeTgt127(char[] value) throws CFException {
        if (value.length < 8) value = pad(8, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginTgt127
		       ,8
		      );		 localTgt127Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,TGT_127_LEN,TGT_127_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("tgt127", beginTgt127,TGT_127_LEN);
    	}
    }
    /**
	 *	refreshTgt127 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt127() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginTgt127
			            ,TGT_127_LEN
			            ,TGT_127_SCALE
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
	    public boolean src128IsNumeric() {
	      return decimalIsNumeric(beginSrc128,SRC_128_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] src128String() {
            return getPackedString(beginSrc128,SRC_128_LEN);
         }
   protected static final int SRC_128_LEN = 5;
   protected static final int SRC_128_SCALE = 2;
  	/**
	 * 	serializeSrc128
	 */
	protected void serializeSrc128(BigDecimal src128) {
		   putDecimal(beginSrc128,src128,SRC_128_LEN,SRC_128_SCALE,false);
		 localSrc128Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkSrc128MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }
     /**
	 *	refreshSrc128 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc128() throws CFException {	
   	try { 
		 return (getDecimal(beginSrc128,SRC_128_LEN,SRC_128_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("src128", beginSrc128,SRC_128_LEN);
     }
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

  
  protected  static final int TGT_128_LEN = 14;
  protected  static final int TGT_128_SCALE = 4;

   protected BigDecimal checkTgt128MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,4/*scale*/,14/*precision*/);
   }

  	/**
	 * serializeTgt128
	 */
	protected void serializeTgt128(BigDecimal tgt128) {
	       putNumber(beginTgt128,tgt128,TGT_128_LEN,TGT_128_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt128Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeTgt128
	 */
   	protected  BigDecimal serializeTgt128(char[] value) throws CFException {
        if (value.length < 14) value = pad(14, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(14,value,false/*isSigned?*/)
		       ,beginTgt128
		       ,14
		      );		 localTgt128Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,TGT_128_LEN,TGT_128_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("tgt128", beginTgt128,TGT_128_LEN);
    	}
    }
    /**
	 *	refreshTgt128 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt128() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginTgt128
			            ,TGT_128_LEN
			            ,TGT_128_SCALE
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
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int SRC_129_LEN = 13;
  protected  static final int SRC_129_SCALE = 3;

   protected BigDecimal checkSrc129MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,3/*scale*/,13/*precision*/);
   }

  	/**
	 * serializeSrc129
	 */
	protected void serializeSrc129(BigDecimal src129) {
	       putNumber(beginSrc129,src129,SRC_129_LEN,SRC_129_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc129Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeSrc129
	 */
   	protected  BigDecimal serializeSrc129(char[] value) throws CFException {
        if (value.length < 13) value = pad(13, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(13,value,true/*isSigned?*/)
		       ,beginSrc129
		       ,13
		      );		 localSrc129Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,SRC_129_LEN,SRC_129_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("src129", beginSrc129,SRC_129_LEN);
    	}
    }
    /**
	 *	refreshSrc129 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc129() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginSrc129
			            ,SRC_129_LEN
			            ,SRC_129_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
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

  
  protected  static final int TGT_129_LEN = 8;
  protected  static final int TGT_129_SCALE = 2;

   protected BigDecimal checkTgt129MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }

  	/**
	 * serializeTgt129
	 */
	protected void serializeTgt129(BigDecimal tgt129) {
	       putNumber(beginTgt129,tgt129,TGT_129_LEN,TGT_129_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt129Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeTgt129
	 */
   	protected  BigDecimal serializeTgt129(char[] value) throws CFException {
        if (value.length < 8) value = pad(8, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginTgt129
		       ,8
		      );		 localTgt129Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,TGT_129_LEN,TGT_129_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("tgt129", beginTgt129,TGT_129_LEN);
    	}
    }
    /**
	 *	refreshTgt129 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt129() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginTgt129
			            ,TGT_129_LEN
			            ,TGT_129_SCALE
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

  
  protected  static final int SRC_130_LEN = 8;
  protected  static final int SRC_130_SCALE = 2;

   protected BigDecimal checkSrc130MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }

  	/**
	 * serializeSrc130
	 */
	protected void serializeSrc130(BigDecimal src130) {
	       putNumber(beginSrc130,src130,SRC_130_LEN,SRC_130_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc130Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeSrc130
	 */
   	protected  BigDecimal serializeSrc130(char[] value) throws CFException {
        if (value.length < 8) value = pad(8, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(8,value,true/*isSigned?*/)
		       ,beginSrc130
		       ,8
		      );		 localSrc130Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,SRC_130_LEN,SRC_130_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("src130", beginSrc130,SRC_130_LEN);
    	}
    }
    /**
	 *	refreshSrc130 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc130() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginSrc130
			            ,SRC_130_LEN
			            ,SRC_130_SCALE
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

  
  protected  static final int TGT_130_LEN = 14;
  protected  static final int TGT_130_SCALE = 4;

   protected BigDecimal checkTgt130MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,4/*scale*/,14/*precision*/);
   }

  	/**
	 * serializeTgt130
	 */
	protected void serializeTgt130(BigDecimal tgt130) {
	       putNumber(beginTgt130,tgt130,TGT_130_LEN,TGT_130_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt130Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeTgt130
	 */
   	protected  BigDecimal serializeTgt130(char[] value) throws CFException {
        if (value.length < 14) value = pad(14, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(14,value,false/*isSigned?*/)
		       ,beginTgt130
		       ,14
		      );		 localTgt130Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,TGT_130_LEN,TGT_130_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("tgt130", beginTgt130,TGT_130_LEN);
    	}
    }
    /**
	 *	refreshTgt130 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt130() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginTgt130
			            ,TGT_130_LEN
			            ,TGT_130_SCALE
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

  
  protected  static final int SRC_131_LEN = 13;
  protected  static final int SRC_131_SCALE = 3;

   protected BigDecimal checkSrc131MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,3/*scale*/,13/*precision*/);
   }

  	/**
	 * serializeSrc131
	 */
	protected void serializeSrc131(BigDecimal src131) {
	       putNumber(beginSrc131,src131,SRC_131_LEN,SRC_131_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc131Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeSrc131
	 */
   	protected  BigDecimal serializeSrc131(char[] value) throws CFException {
        if (value.length < 13) value = pad(13, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(13,value,false/*isSigned?*/)
		       ,beginSrc131
		       ,13
		      );		 localSrc131Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,SRC_131_LEN,SRC_131_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("src131", beginSrc131,SRC_131_LEN);
    	}
    }
    /**
	 *	refreshSrc131 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc131() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginSrc131
			            ,SRC_131_LEN
			            ,SRC_131_SCALE
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
	
	 /**
	 *	Returns String value of tgt131
	 *	@return tgt131
	 */
	public char[]  getTgt131String() {
	    return getCharArray(beginTgt131,TGT_131_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt131IsNumeric() {
		    return isNumeric(beginTgt131
	                    ,beginTgt131 + TGT_131_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int TGT_131_LEN = 8;
  protected  static final int TGT_131_SCALE = 2;

   protected BigDecimal checkTgt131MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }

  	/**
	 * serializeTgt131
	 */
	protected void serializeTgt131(BigDecimal tgt131) {
	       putNumber(beginTgt131,tgt131,TGT_131_LEN,TGT_131_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt131Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeTgt131
	 */
   	protected  BigDecimal serializeTgt131(char[] value) throws CFException {
        if (value.length < 8) value = pad(8, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(8,value,true/*isSigned?*/)
		       ,beginTgt131
		       ,8
		      );		 localTgt131Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,TGT_131_LEN,TGT_131_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("tgt131", beginTgt131,TGT_131_LEN);
    	}
    }
    /**
	 *	refreshTgt131 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt131() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginTgt131
			            ,TGT_131_LEN
			            ,TGT_131_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt131", beginTgt131,TGT_131_LEN);
    }
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

  
  protected  static final int SRC_132_LEN = 8;
  protected  static final int SRC_132_SCALE = 2;

   protected BigDecimal checkSrc132MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }

  	/**
	 * serializeSrc132
	 */
	protected void serializeSrc132(BigDecimal src132) {
	       putNumber(beginSrc132,src132,SRC_132_LEN,SRC_132_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc132Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeSrc132
	 */
   	protected  BigDecimal serializeSrc132(char[] value) throws CFException {
        if (value.length < 8) value = pad(8, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginSrc132
		       ,8
		      );		 localSrc132Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,SRC_132_LEN,SRC_132_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("src132", beginSrc132,SRC_132_LEN);
    	}
    }
    /**
	 *	refreshSrc132 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc132() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginSrc132
			            ,SRC_132_LEN
			            ,SRC_132_SCALE
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
	
	 /**
	 *	Returns String value of tgt132
	 *	@return tgt132
	 */
	public char[]  getTgt132String() {
	    return getCharArray(beginTgt132,TGT_132_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt132IsNumeric() {
		    return isNumeric(beginTgt132
	                    ,beginTgt132 + TGT_132_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int TGT_132_LEN = 14;
  protected  static final int TGT_132_SCALE = 4;

   protected BigDecimal checkTgt132MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,4/*scale*/,14/*precision*/);
   }

  	/**
	 * serializeTgt132
	 */
	protected void serializeTgt132(BigDecimal tgt132) {
	       putNumber(beginTgt132,tgt132,TGT_132_LEN,TGT_132_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt132Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeTgt132
	 */
   	protected  BigDecimal serializeTgt132(char[] value) throws CFException {
        if (value.length < 14) value = pad(14, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(14,value,true/*isSigned?*/)
		       ,beginTgt132
		       ,14
		      );		 localTgt132Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,TGT_132_LEN,TGT_132_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("tgt132", beginTgt132,TGT_132_LEN);
    	}
    }
    /**
	 *	refreshTgt132 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt132() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginTgt132
			            ,TGT_132_LEN
			            ,TGT_132_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt132", beginTgt132,TGT_132_LEN);
    }
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

  
  protected  static final int SRC_133_LEN = 13;
  protected  static final int SRC_133_SCALE = 3;

   protected BigDecimal checkSrc133MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,3/*scale*/,13/*precision*/);
   }

  	/**
	 * serializeSrc133
	 */
	protected void serializeSrc133(BigDecimal src133) {
	       putNumber(beginSrc133,src133,SRC_133_LEN,SRC_133_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc133Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeSrc133
	 */
   	protected  BigDecimal serializeSrc133(char[] value) throws CFException {
        if (value.length < 13) value = pad(13, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(13,value,false/*isSigned?*/)
		       ,beginSrc133
		       ,13
		      );		 localSrc133Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,SRC_133_LEN,SRC_133_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("src133", beginSrc133,SRC_133_LEN);
    	}
    }
    /**
	 *	refreshSrc133 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc133() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginSrc133
			            ,SRC_133_LEN
			            ,SRC_133_SCALE
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
	
	 /**
	 *	Returns String value of tgt133
	 *	@return tgt133
	 */
	public char[]  getTgt133String() {
	    return getCharArray(beginTgt133,TGT_133_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt133IsNumeric() {
		    return isNumeric(beginTgt133
	                    ,beginTgt133 + TGT_133_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int TGT_133_LEN = 8;
  protected  static final int TGT_133_SCALE = 2;

   protected BigDecimal checkTgt133MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }

  	/**
	 * serializeTgt133
	 */
	protected void serializeTgt133(BigDecimal tgt133) {
	       putNumber(beginTgt133,tgt133,TGT_133_LEN,TGT_133_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt133Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeTgt133
	 */
   	protected  BigDecimal serializeTgt133(char[] value) throws CFException {
        if (value.length < 8) value = pad(8, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginTgt133
		       ,8
		      );		 localTgt133Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,TGT_133_LEN,TGT_133_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("tgt133", beginTgt133,TGT_133_LEN);
    	}
    }
    /**
	 *	refreshTgt133 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt133() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginTgt133
			            ,TGT_133_LEN
			            ,TGT_133_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt133", beginTgt133,TGT_133_LEN);
    }
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

  
  protected  static final int SRC_134_LEN = 8;
  protected  static final int SRC_134_SCALE = 2;

   protected BigDecimal checkSrc134MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }

  	/**
	 * serializeSrc134
	 */
	protected void serializeSrc134(BigDecimal src134) {
	       putNumber(beginSrc134,src134,SRC_134_LEN,SRC_134_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc134Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeSrc134
	 */
   	protected  BigDecimal serializeSrc134(char[] value) throws CFException {
        if (value.length < 8) value = pad(8, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginSrc134
		       ,8
		      );		 localSrc134Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,SRC_134_LEN,SRC_134_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("src134", beginSrc134,SRC_134_LEN);
    	}
    }
    /**
	 *	refreshSrc134 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc134() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginSrc134
			            ,SRC_134_LEN
			            ,SRC_134_SCALE
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
	
	 /**
	 *	Returns String value of tgt134
	 *	@return tgt134
	 */
	public char[]  getTgt134String() {
	    return getCharArray(beginTgt134,TGT_134_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt134IsNumeric() {
		    return isNumeric(beginTgt134
	                    ,beginTgt134 + TGT_134_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int TGT_134_LEN = 14;
  protected  static final int TGT_134_SCALE = 4;

   protected BigDecimal checkTgt134MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,4/*scale*/,14/*precision*/);
   }

  	/**
	 * serializeTgt134
	 */
	protected void serializeTgt134(BigDecimal tgt134) {
	       putNumber(beginTgt134,tgt134,TGT_134_LEN,TGT_134_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt134Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeTgt134
	 */
   	protected  BigDecimal serializeTgt134(char[] value) throws CFException {
        if (value.length < 14) value = pad(14, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(14,value,false/*isSigned?*/)
		       ,beginTgt134
		       ,14
		      );		 localTgt134Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,TGT_134_LEN,TGT_134_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("tgt134", beginTgt134,TGT_134_LEN);
    	}
    }
    /**
	 *	refreshTgt134 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt134() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginTgt134
			            ,TGT_134_LEN
			            ,TGT_134_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt134", beginTgt134,TGT_134_LEN);
    }
   	}
         int localSrc135Counter = -1;
         public boolean isSrc135Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc135Counter != sharedCounter;
            localSrc135Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkSrc135MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     int localTgt135Counter = -1;
     public boolean isTgt135Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt135Counter != sharedCounter;
         localTgt135Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tgt135
	 *	@return tgt135
	 */
	public char[]  getTgt135String() {
	     return getCharArray(beginTgt135,TGT_135_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt135IsNumeric() {
	    return isNumeric(beginTgt135
	                    ,beginTgt135 + TGT_135_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TGT_135_LEN = 10;
  	/**
	 * serializeTgt135
	 */
	protected void serializeTgt135(long tgt135) {
		 putNumber(beginTgt135,tgt135,TGT_135_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt135Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTgt135
	 */
   	protected  long serializeTgt135(char[] value) {
	    long  tgt135;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tgt135 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginTgt135
		       ,10
		      );
		 localTgt135Counter = shareString.getSerializedField().getModifiedCounter();
		return  tgt135;
    }

   protected long checkTgt135MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTgt135 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTgt135() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTgt135
			                 ,TGT_135_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt135", beginTgt135,TGT_135_LEN);
    }
   	}
         int localSrc136Counter = -1;
         public boolean isSrc136Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc136Counter != sharedCounter;
            localSrc136Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSrc136MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
     int localTgt136Counter = -1;
     public boolean isTgt136Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt136Counter != sharedCounter;
         localTgt136Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tgt136
	 *	@return tgt136
	 */
	public char[]  getTgt136String() {
	     return getCharArray(beginTgt136,TGT_136_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt136IsNumeric() {
	    return isNumeric(beginTgt136
	                    ,beginTgt136 + TGT_136_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TGT_136_LEN = 10;
  	/**
	 * serializeTgt136
	 */
	protected void serializeTgt136(long tgt136) {
		 putNumber(beginTgt136,tgt136,TGT_136_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt136Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTgt136
	 */
   	protected  long serializeTgt136(char[] value) {
	    long  tgt136;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tgt136 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginTgt136
		       ,10
		      );
		 localTgt136Counter = shareString.getSerializedField().getModifiedCounter();
		return  tgt136;
    }

   protected long checkTgt136MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTgt136 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTgt136() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTgt136
			                 ,TGT_136_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt136", beginTgt136,TGT_136_LEN);
    }
   	}
         int localSrc137Counter = -1;
         public boolean isSrc137Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc137Counter != sharedCounter;
            localSrc137Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSrc137MaxLimit(long number) {
        return checkMaxLimit(number, true/*isSigned*/,8/*dataLen*/);
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

  
   protected  static final int TGT_137_LEN = 10;
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
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tgt137 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginTgt137
		       ,10
		      );
		 localTgt137Counter = shareString.getSerializedField().getModifiedCounter();
		return  tgt137;
    }

   protected long checkTgt137MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
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
       
      
   protected long checkSrc138MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,8/*dataLen*/);
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
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TGT_138_LEN = 10;
  	/**
	 * serializeTgt138
	 */
	protected void serializeTgt138(long tgt138) {
		 putNumber(beginTgt138,tgt138,TGT_138_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt138Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTgt138
	 */
   	protected  long serializeTgt138(char[] value) {
	    long  tgt138;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tgt138 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginTgt138
		       ,10
		      );
		 localTgt138Counter = shareString.getSerializedField().getModifiedCounter();
		return  tgt138;
    }

   protected long checkTgt138MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTgt138 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTgt138() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTgt138
			                 ,TGT_138_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
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
       
      
   protected short checkSrc139MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     int localTgt139Counter = -1;
     public boolean isTgt139Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt139Counter != sharedCounter;
         localTgt139Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tgt139
	 *	@return tgt139
	 */
	public char[]  getTgt139String() {
	     return getCharArray(beginTgt139,TGT_139_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt139IsNumeric() {
	    return isNumeric(beginTgt139
	                    ,beginTgt139 + TGT_139_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TGT_139_LEN = 10;
  	/**
	 * serializeTgt139
	 */
	protected void serializeTgt139(long tgt139) {
		 putNumber(beginTgt139,tgt139,TGT_139_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt139Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTgt139
	 */
   	protected  long serializeTgt139(char[] value) {
	    long  tgt139;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tgt139 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginTgt139
		       ,10
		      );
		 localTgt139Counter = shareString.getSerializedField().getModifiedCounter();
		return  tgt139;
    }

   protected long checkTgt139MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTgt139 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTgt139() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTgt139
			                 ,TGT_139_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt139", beginTgt139,TGT_139_LEN);
    }
   	}
         int localSrc140Counter = -1;
         public boolean isSrc140Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc140Counter != sharedCounter;
            localSrc140Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkSrc140MaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     int localTgt140Counter = -1;
     public boolean isTgt140Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt140Counter != sharedCounter;
         localTgt140Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tgt140
	 *	@return tgt140
	 */
	public char[]  getTgt140String() {
	     return getCharArray(beginTgt140,TGT_140_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt140IsNumeric() {
	    return isNumeric(beginTgt140
	                    ,beginTgt140 + TGT_140_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TGT_140_LEN = 10;
  	/**
	 * serializeTgt140
	 */
	protected void serializeTgt140(long tgt140) {
		 putNumber(beginTgt140,tgt140,TGT_140_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt140Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTgt140
	 */
   	protected  long serializeTgt140(char[] value) {
	    long  tgt140;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tgt140 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginTgt140
		       ,10
		      );
		 localTgt140Counter = shareString.getSerializedField().getModifiedCounter();
		return  tgt140;
    }

   protected long checkTgt140MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTgt140 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTgt140() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTgt140
			                 ,TGT_140_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt140", beginTgt140,TGT_140_LEN);
    }
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
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SRC_141_LEN = 6;
  	/**
	 * serializeSrc141
	 */
	protected void serializeSrc141(long src141) {
		 putNumber(beginSrc141,src141,SRC_141_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc141Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSrc141
	 */
   	protected  long serializeSrc141(char[] value) {
	    long  src141;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    src141 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginSrc141
		       ,6
		      );
		 localSrc141Counter = shareString.getSerializedField().getModifiedCounter();
		return  src141;
    }

   protected long checkSrc141MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
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
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
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

	/**
	 *	Returns String value of tgt141
	 *	@return tgt141
	 */
	public char[]  getTgt141String() {
	     return getCharArray(beginTgt141,TGT_141_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt141IsNumeric() {
	    return isNumeric(beginTgt141
	                    ,beginTgt141 + TGT_141_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TGT_141_LEN = 10;
  	/**
	 * serializeTgt141
	 */
	protected void serializeTgt141(long tgt141) {
		 putNumber(beginTgt141,tgt141,TGT_141_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt141Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTgt141
	 */
   	protected  long serializeTgt141(char[] value) {
	    long  tgt141;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tgt141 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginTgt141
		       ,10
		      );
		 localTgt141Counter = shareString.getSerializedField().getModifiedCounter();
		return  tgt141;
    }

   protected long checkTgt141MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTgt141 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTgt141() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTgt141
			                 ,TGT_141_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt141", beginTgt141,TGT_141_LEN);
    }
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

  
   protected  static final int SRC_142_LEN = 6;
  	/**
	 * serializeSrc142
	 */
	protected void serializeSrc142(int src142) {
		 putNumber(beginSrc142,src142,SRC_142_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc142Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSrc142
	 */
   	protected  int serializeSrc142(char[] value) {
	    int  src142;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    src142 = (int) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,true/*isSigned?*/)
		       ,beginSrc142
		       ,6
		      );
		 localSrc142Counter = shareString.getSerializedField().getModifiedCounter();
		return  src142;
    }

   protected int checkSrc142MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1M/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshSrc142 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSrc142() throws CFException {
   	try {	 
			return (
			          getIntNumber(
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

	/**
	 *	Returns String value of tgt142
	 *	@return tgt142
	 */
	public char[]  getTgt142String() {
	     return getCharArray(beginTgt142,TGT_142_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt142IsNumeric() {
	    return isNumeric(beginTgt142
	                    ,beginTgt142 + TGT_142_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TGT_142_LEN = 10;
  	/**
	 * serializeTgt142
	 */
	protected void serializeTgt142(long tgt142) {
		 putNumber(beginTgt142,tgt142,TGT_142_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt142Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTgt142
	 */
   	protected  long serializeTgt142(char[] value) {
	    long  tgt142;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tgt142 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginTgt142
		       ,10
		      );
		 localTgt142Counter = shareString.getSerializedField().getModifiedCounter();
		return  tgt142;
    }

   protected long checkTgt142MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTgt142 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTgt142() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTgt142
			                 ,TGT_142_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt142", beginTgt142,TGT_142_LEN);
    }
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
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SRC_143_LEN = 10;
  	/**
	 * serializeSrc143
	 */
	protected void serializeSrc143(long src143) {
		 putNumber(beginSrc143,src143,SRC_143_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
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
	    src143 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginSrc143
		       ,10
		      );
		 localSrc143Counter = shareString.getSerializedField().getModifiedCounter();
		return  src143;
    }

   protected long checkSrc143MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
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
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
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
       
      
   protected int checkTgt143MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
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
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SRC_144_LEN = 10;
  	/**
	 * serializeSrc144
	 */
	protected void serializeSrc144(long src144) {
		 putNumber(beginSrc144,src144,SRC_144_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
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
	    src144 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginSrc144
		       ,10
		      );
		 localSrc144Counter = shareString.getSerializedField().getModifiedCounter();
		return  src144;
    }

   protected long checkSrc144MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
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
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
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
       
      
   protected long checkTgt144MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
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
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SRC_145_LEN = 10;
  	/**
	 * serializeSrc145
	 */
	protected void serializeSrc145(long src145) {
		 putNumber(beginSrc145,src145,SRC_145_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
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
	    src145 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginSrc145
		       ,10
		      );
		 localSrc145Counter = shareString.getSerializedField().getModifiedCounter();
		return  src145;
    }

   protected long checkSrc145MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
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
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
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
       
      
   protected long checkTgt145MaxLimit(long number) {
        return checkMaxLimit(number, true/*isSigned*/,8/*dataLen*/);
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
       
      
   protected long checkTgt146MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,8/*dataLen*/);
   }
     int localSrc147Counter = -1;
     public boolean isSrc147Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc147Counter != sharedCounter;
         localSrc147Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of src147
	 *	@return src147
	 */
	public char[]  getSrc147String() {
	     return getCharArray(beginSrc147,SRC_147_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src147IsNumeric() {
	    return isNumeric(beginSrc147
	                    ,beginSrc147 + SRC_147_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SRC_147_LEN = 10;
  	/**
	 * serializeSrc147
	 */
	protected void serializeSrc147(long src147) {
		 putNumber(beginSrc147,src147,SRC_147_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc147Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSrc147
	 */
   	protected  long serializeSrc147(char[] value) {
	    long  src147;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    src147 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginSrc147
		       ,10
		      );
		 localSrc147Counter = shareString.getSerializedField().getModifiedCounter();
		return  src147;
    }

   protected long checkSrc147MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSrc147 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSrc147() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSrc147
			                 ,SRC_147_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("src147", beginSrc147,SRC_147_LEN);
    }
   	}
         int localTgt147Counter = -1;
         public boolean isTgt147Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt147Counter != sharedCounter;
            localTgt147Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkTgt147MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     int localSrc148Counter = -1;
     public boolean isSrc148Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc148Counter != sharedCounter;
         localSrc148Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of src148
	 *	@return src148
	 */
	public char[]  getSrc148String() {
	     return getCharArray(beginSrc148,SRC_148_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src148IsNumeric() {
	    return isNumeric(beginSrc148
	                    ,beginSrc148 + SRC_148_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SRC_148_LEN = 10;
  	/**
	 * serializeSrc148
	 */
	protected void serializeSrc148(long src148) {
		 putNumber(beginSrc148,src148,SRC_148_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc148Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSrc148
	 */
   	protected  long serializeSrc148(char[] value) {
	    long  src148;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    src148 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginSrc148
		       ,10
		      );
		 localSrc148Counter = shareString.getSerializedField().getModifiedCounter();
		return  src148;
    }

   protected long checkSrc148MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSrc148 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSrc148() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSrc148
			                 ,SRC_148_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("src148", beginSrc148,SRC_148_LEN);
    }
   	}
         int localTgt148Counter = -1;
         public boolean isTgt148Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt148Counter != sharedCounter;
            localTgt148Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkTgt148MaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     int localSrc149Counter = -1;
     public boolean isSrc149Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc149Counter != sharedCounter;
         localSrc149Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of src149
	 *	@return src149
	 */
	public char[]  getSrc149String() {
	     return getCharArray(beginSrc149,SRC_149_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src149IsNumeric() {
	    return isNumeric(beginSrc149
	                    ,beginSrc149 + SRC_149_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SRC_149_LEN = 10;
  	/**
	 * serializeSrc149
	 */
	protected void serializeSrc149(long src149) {
		 putNumber(beginSrc149,src149,SRC_149_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc149Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSrc149
	 */
   	protected  long serializeSrc149(char[] value) {
	    long  src149;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    src149 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginSrc149
		       ,10
		      );
		 localSrc149Counter = shareString.getSerializedField().getModifiedCounter();
		return  src149;
    }

   protected long checkSrc149MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSrc149 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSrc149() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSrc149
			                 ,SRC_149_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("src149", beginSrc149,SRC_149_LEN);
    }
   	}
     int localTgt149Counter = -1;
     public boolean isTgt149Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt149Counter != sharedCounter;
         localTgt149Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tgt149
	 *	@return tgt149
	 */
	public char[]  getTgt149String() {
	     return getCharArray(beginTgt149,TGT_149_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt149IsNumeric() {
	    return isNumeric(beginTgt149
	                    ,beginTgt149 + TGT_149_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TGT_149_LEN = 6;
  	/**
	 * serializeTgt149
	 */
	protected void serializeTgt149(long tgt149) {
		 putNumber(beginTgt149,tgt149,TGT_149_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt149Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTgt149
	 */
   	protected  long serializeTgt149(char[] value) {
	    long  tgt149;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tgt149 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginTgt149
		       ,6
		      );
		 localTgt149Counter = shareString.getSerializedField().getModifiedCounter();
		return  tgt149;
    }

   protected long checkTgt149MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTgt149 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTgt149() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTgt149
			                 ,TGT_149_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt149", beginTgt149,TGT_149_LEN);
    }
   	}
     int localSrc150Counter = -1;
     public boolean isSrc150Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc150Counter != sharedCounter;
         localSrc150Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of src150
	 *	@return src150
	 */
	public char[]  getSrc150String() {
	     return getCharArray(beginSrc150,SRC_150_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src150IsNumeric() {
	    return isNumeric(beginSrc150
	                    ,beginSrc150 + SRC_150_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SRC_150_LEN = 10;
  	/**
	 * serializeSrc150
	 */
	protected void serializeSrc150(long src150) {
		 putNumber(beginSrc150,src150,SRC_150_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc150Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSrc150
	 */
   	protected  long serializeSrc150(char[] value) {
	    long  src150;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    src150 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginSrc150
		       ,10
		      );
		 localSrc150Counter = shareString.getSerializedField().getModifiedCounter();
		return  src150;
    }

   protected long checkSrc150MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSrc150 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSrc150() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSrc150
			                 ,SRC_150_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("src150", beginSrc150,SRC_150_LEN);
    }
   	}
     int localTgt150Counter = -1;
     public boolean isTgt150Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt150Counter != sharedCounter;
         localTgt150Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tgt150
	 *	@return tgt150
	 */
	public char[]  getTgt150String() {
	     return getCharArray(beginTgt150,TGT_150_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt150IsNumeric() {
	    return isNumeric(beginTgt150
	                    ,beginTgt150 + TGT_150_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TGT_150_LEN = 6;
  	/**
	 * serializeTgt150
	 */
	protected void serializeTgt150(int tgt150) {
		 putNumber(beginTgt150,tgt150,TGT_150_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt150Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTgt150
	 */
   	protected  int serializeTgt150(char[] value) {
	    int  tgt150;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tgt150 = (int) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,true/*isSigned?*/)
		       ,beginTgt150
		       ,6
		      );
		 localTgt150Counter = shareString.getSerializedField().getModifiedCounter();
		return  tgt150;
    }

   protected int checkTgt150MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1M/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshTgt150 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTgt150() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginTgt150
			                 ,TGT_150_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt150", beginTgt150,TGT_150_LEN);
    }
   	}
     int localSrc151Counter = -1;
     public boolean isSrc151Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc151Counter != sharedCounter;
         localSrc151Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of src151
	 *	@return src151
	 */
	public char[]  getSrc151String() {
	     return getCharArray(beginSrc151,SRC_151_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src151IsNumeric() {
	    return isNumeric(beginSrc151
	                    ,beginSrc151 + SRC_151_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SRC_151_LEN = 10;
  	/**
	 * serializeSrc151
	 */
	protected void serializeSrc151(long src151) {
		 putNumber(beginSrc151,src151,SRC_151_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc151Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSrc151
	 */
   	protected  long serializeSrc151(char[] value) {
	    long  src151;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    src151 = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,true/*isSigned?*/)
		       ,beginSrc151
		       ,10
		      );
		 localSrc151Counter = shareString.getSerializedField().getModifiedCounter();
		return  src151;
    }

   protected long checkSrc151MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshSrc151 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSrc151() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSrc151
			                 ,SRC_151_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("src151", beginSrc151,SRC_151_LEN);
    }
   	}
         int localTgt151Counter = -1;
         public boolean isTgt151Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt151Counter != sharedCounter;
            localTgt151Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkTgt151MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     int localSrc152Counter = -1;
     public boolean isSrc152Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc152Counter != sharedCounter;
         localSrc152Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of src152
	 *	@return src152
	 */
	public char[]  getSrc152String() {
	     return getCharArray(beginSrc152,SRC_152_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src152IsNumeric() {
	    return isNumeric(beginSrc152
	                    ,beginSrc152 + SRC_152_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SRC_152_LEN = 10;
  	/**
	 * serializeSrc152
	 */
	protected void serializeSrc152(long src152) {
		 putNumber(beginSrc152,src152,SRC_152_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc152Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSrc152
	 */
   	protected  long serializeSrc152(char[] value) {
	    long  src152;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    src152 = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,true/*isSigned?*/)
		       ,beginSrc152
		       ,10
		      );
		 localSrc152Counter = shareString.getSerializedField().getModifiedCounter();
		return  src152;
    }

   protected long checkSrc152MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshSrc152 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSrc152() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSrc152
			                 ,SRC_152_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("src152", beginSrc152,SRC_152_LEN);
    }
   	}
         int localTgt152Counter = -1;
         public boolean isTgt152Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt152Counter != sharedCounter;
            localTgt152Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkTgt152MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
     int localSrc153Counter = -1;
     public boolean isSrc153Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc153Counter != sharedCounter;
         localSrc153Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of src153
	 *	@return src153
	 */
	public char[]  getSrc153String() {
	     return getCharArray(beginSrc153,SRC_153_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src153IsNumeric() {
	    return isNumeric(beginSrc153
	                    ,beginSrc153 + SRC_153_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SRC_153_LEN = 10;
  	/**
	 * serializeSrc153
	 */
	protected void serializeSrc153(long src153) {
		 putNumber(beginSrc153,src153,SRC_153_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc153Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSrc153
	 */
   	protected  long serializeSrc153(char[] value) {
	    long  src153;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    src153 = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,true/*isSigned?*/)
		       ,beginSrc153
		       ,10
		      );
		 localSrc153Counter = shareString.getSerializedField().getModifiedCounter();
		return  src153;
    }

   protected long checkSrc153MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshSrc153 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSrc153() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSrc153
			                 ,SRC_153_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("src153", beginSrc153,SRC_153_LEN);
    }
   	}
         int localTgt153Counter = -1;
         public boolean isTgt153Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt153Counter != sharedCounter;
            localTgt153Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkTgt153MaxLimit(long number) {
        return checkMaxLimit(number, true/*isSigned*/,8/*dataLen*/);
   }
     int localSrc154Counter = -1;
     public boolean isSrc154Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc154Counter != sharedCounter;
         localSrc154Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of src154
	 *	@return src154
	 */
	public char[]  getSrc154String() {
	     return getCharArray(beginSrc154,SRC_154_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src154IsNumeric() {
	    return isNumeric(beginSrc154
	                    ,beginSrc154 + SRC_154_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SRC_154_LEN = 10;
  	/**
	 * serializeSrc154
	 */
	protected void serializeSrc154(long src154) {
		 putNumber(beginSrc154,src154,SRC_154_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc154Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSrc154
	 */
   	protected  long serializeSrc154(char[] value) {
	    long  src154;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    src154 = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,true/*isSigned?*/)
		       ,beginSrc154
		       ,10
		      );
		 localSrc154Counter = shareString.getSerializedField().getModifiedCounter();
		return  src154;
    }

   protected long checkSrc154MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshSrc154 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSrc154() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSrc154
			                 ,SRC_154_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("src154", beginSrc154,SRC_154_LEN);
    }
   	}
         int localTgt154Counter = -1;
         public boolean isTgt154Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt154Counter != sharedCounter;
            localTgt154Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkTgt154MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,8/*dataLen*/);
   }
     int localSrc155Counter = -1;
     public boolean isSrc155Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc155Counter != sharedCounter;
         localSrc155Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of src155
	 *	@return src155
	 */
	public char[]  getSrc155String() {
	     return getCharArray(beginSrc155,SRC_155_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src155IsNumeric() {
	    return isNumeric(beginSrc155
	                    ,beginSrc155 + SRC_155_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SRC_155_LEN = 10;
  	/**
	 * serializeSrc155
	 */
	protected void serializeSrc155(long src155) {
		 putNumber(beginSrc155,src155,SRC_155_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc155Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSrc155
	 */
   	protected  long serializeSrc155(char[] value) {
	    long  src155;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    src155 = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,true/*isSigned?*/)
		       ,beginSrc155
		       ,10
		      );
		 localSrc155Counter = shareString.getSerializedField().getModifiedCounter();
		return  src155;
    }

   protected long checkSrc155MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshSrc155 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSrc155() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSrc155
			                 ,SRC_155_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
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
       
      
   protected short checkTgt155MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     int localSrc156Counter = -1;
     public boolean isSrc156Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc156Counter != sharedCounter;
         localSrc156Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of src156
	 *	@return src156
	 */
	public char[]  getSrc156String() {
	     return getCharArray(beginSrc156,SRC_156_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src156IsNumeric() {
	    return isNumeric(beginSrc156
	                    ,beginSrc156 + SRC_156_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SRC_156_LEN = 10;
  	/**
	 * serializeSrc156
	 */
	protected void serializeSrc156(long src156) {
		 putNumber(beginSrc156,src156,SRC_156_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc156Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSrc156
	 */
   	protected  long serializeSrc156(char[] value) {
	    long  src156;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    src156 = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,true/*isSigned?*/)
		       ,beginSrc156
		       ,10
		      );
		 localSrc156Counter = shareString.getSerializedField().getModifiedCounter();
		return  src156;
    }

   protected long checkSrc156MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshSrc156 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSrc156() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSrc156
			                 ,SRC_156_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("src156", beginSrc156,SRC_156_LEN);
    }
   	}
         int localTgt156Counter = -1;
         public boolean isTgt156Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt156Counter != sharedCounter;
            localTgt156Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkTgt156MaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     int localSrc157Counter = -1;
     public boolean isSrc157Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc157Counter != sharedCounter;
         localSrc157Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of src157
	 *	@return src157
	 */
	public char[]  getSrc157String() {
	     return getCharArray(beginSrc157,SRC_157_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src157IsNumeric() {
	    return isNumeric(beginSrc157
	                    ,beginSrc157 + SRC_157_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SRC_157_LEN = 10;
  	/**
	 * serializeSrc157
	 */
	protected void serializeSrc157(long src157) {
		 putNumber(beginSrc157,src157,SRC_157_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc157Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSrc157
	 */
   	protected  long serializeSrc157(char[] value) {
	    long  src157;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    src157 = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,true/*isSigned?*/)
		       ,beginSrc157
		       ,10
		      );
		 localSrc157Counter = shareString.getSerializedField().getModifiedCounter();
		return  src157;
    }

   protected long checkSrc157MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshSrc157 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSrc157() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSrc157
			                 ,SRC_157_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("src157", beginSrc157,SRC_157_LEN);
    }
   	}
     int localTgt157Counter = -1;
     public boolean isTgt157Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt157Counter != sharedCounter;
         localTgt157Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tgt157
	 *	@return tgt157
	 */
	public char[]  getTgt157String() {
	     return getCharArray(beginTgt157,TGT_157_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt157IsNumeric() {
	    return isNumeric(beginTgt157
	                    ,beginTgt157 + TGT_157_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TGT_157_LEN = 6;
  	/**
	 * serializeTgt157
	 */
	protected void serializeTgt157(long tgt157) {
		 putNumber(beginTgt157,tgt157,TGT_157_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt157Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTgt157
	 */
   	protected  long serializeTgt157(char[] value) {
	    long  tgt157;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tgt157 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginTgt157
		       ,6
		      );
		 localTgt157Counter = shareString.getSerializedField().getModifiedCounter();
		return  tgt157;
    }

   protected long checkTgt157MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTgt157 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTgt157() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTgt157
			                 ,TGT_157_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt157", beginTgt157,TGT_157_LEN);
    }
   	}
     int localSrc158Counter = -1;
     public boolean isSrc158Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc158Counter != sharedCounter;
         localSrc158Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of src158
	 *	@return src158
	 */
	public char[]  getSrc158String() {
	     return getCharArray(beginSrc158,SRC_158_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src158IsNumeric() {
	    return isNumeric(beginSrc158
	                    ,beginSrc158 + SRC_158_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SRC_158_LEN = 10;
  	/**
	 * serializeSrc158
	 */
	protected void serializeSrc158(long src158) {
		 putNumber(beginSrc158,src158,SRC_158_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc158Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSrc158
	 */
   	protected  long serializeSrc158(char[] value) {
	    long  src158;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    src158 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginSrc158
		       ,10
		      );
		 localSrc158Counter = shareString.getSerializedField().getModifiedCounter();
		return  src158;
    }

   protected long checkSrc158MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSrc158 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSrc158() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSrc158
			                 ,SRC_158_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("src158", beginSrc158,SRC_158_LEN);
    }
   	}
     int localTgt158Counter = -1;
     public boolean isTgt158Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt158Counter != sharedCounter;
         localTgt158Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tgt158
	 *	@return tgt158
	 */
	public char[]  getTgt158String() {
	     return getCharArray(beginTgt158,TGT_158_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt158IsNumeric() {
	    return isNumeric(beginTgt158
	                    ,beginTgt158 + TGT_158_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TGT_158_LEN = 6;
  	/**
	 * serializeTgt158
	 */
	protected void serializeTgt158(int tgt158) {
		 putNumber(beginTgt158,tgt158,TGT_158_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt158Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTgt158
	 */
   	protected  int serializeTgt158(char[] value) {
	    int  tgt158;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tgt158 = (int) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,true/*isSigned?*/)
		       ,beginTgt158
		       ,6
		      );
		 localTgt158Counter = shareString.getSerializedField().getModifiedCounter();
		return  tgt158;
    }

   protected int checkTgt158MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1M/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshTgt158 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTgt158() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginTgt158
			                 ,TGT_158_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt158", beginTgt158,TGT_158_LEN);
    }
   	}
         int localSrc159Counter = -1;
         public boolean isSrc159Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc159Counter != sharedCounter;
            localSrc159Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkSrc159MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
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
       
      
   protected short checkSrc161MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localSrc163Counter = -1;
         public boolean isSrc163Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc163Counter != sharedCounter;
            localSrc163Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkSrc163MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
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
       
      
   protected int checkSrc165MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
        int localSrc167Counter = -1;
        public boolean isSrc167Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localSrc167Counter != sharedCounter;
           localSrc167Counter = sharedCounter; return hasModified; 
        }
	    public boolean src167IsNumeric() {
	      return decimalIsNumeric(beginSrc167,SRC_167_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] src167String() {
            return getPackedString(beginSrc167,SRC_167_LEN);
         }
   protected static final int SRC_167_LEN = 4;
   protected static final int SRC_167_SCALE = 2;
  	/**
	 * 	serializeSrc167
	 */
	protected void serializeSrc167(BigDecimal src167) {
		   putDecimal(beginSrc167,src167,SRC_167_LEN,SRC_167_SCALE,true);
		 localSrc167Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkSrc167MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,7/*precision*/);
   }
     /**
	 *	refreshSrc167 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc167() throws CFException {	
   	try { 
		 return (getDecimal(beginSrc167,SRC_167_LEN,SRC_167_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("src167", beginSrc167,SRC_167_LEN);
     }
   	}
     int localTgt167Counter = -1;
     public boolean isTgt167Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt167Counter != sharedCounter;
         localTgt167Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tgt167
	 *	@return tgt167
	 */
	public char[]  getTgt167String() {
	     return getCharArray(beginTgt167,TGT_167_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt167IsNumeric() {
	    return isNumeric(beginTgt167
	                    ,beginTgt167 + TGT_167_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TGT_167_LEN = 10;
  	/**
	 * serializeTgt167
	 */
	protected void serializeTgt167(long tgt167) {
		 putNumber(beginTgt167,tgt167,TGT_167_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt167Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTgt167
	 */
   	protected  long serializeTgt167(char[] value) {
	    long  tgt167;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tgt167 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginTgt167
		       ,10
		      );
		 localTgt167Counter = shareString.getSerializedField().getModifiedCounter();
		return  tgt167;
    }

   protected long checkTgt167MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTgt167 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTgt167() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTgt167
			                 ,TGT_167_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt167", beginTgt167,TGT_167_LEN);
    }
   	}
     int localTgt168Counter = -1;
     public boolean isTgt168Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt168Counter != sharedCounter;
         localTgt168Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tgt168
	 *	@return tgt168
	 */
	public char[]  getTgt168String() {
	     return getCharArray(beginTgt168,TGT_168_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt168IsNumeric() {
	    return isNumeric(beginTgt168
	                    ,beginTgt168 + TGT_168_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TGT_168_LEN = 10;
  	/**
	 * serializeTgt168
	 */
	protected void serializeTgt168(long tgt168) {
		 putNumber(beginTgt168,tgt168,TGT_168_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt168Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTgt168
	 */
   	protected  long serializeTgt168(char[] value) {
	    long  tgt168;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tgt168 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginTgt168
		       ,10
		      );
		 localTgt168Counter = shareString.getSerializedField().getModifiedCounter();
		return  tgt168;
    }

   protected long checkTgt168MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTgt168 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTgt168() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTgt168
			                 ,TGT_168_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt168", beginTgt168,TGT_168_LEN);
    }
   	}
        int localSrc169Counter = -1;
        public boolean isSrc169Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localSrc169Counter != sharedCounter;
           localSrc169Counter = sharedCounter; return hasModified; 
        }
	    public boolean src169IsNumeric() {
	      return decimalIsNumeric(beginSrc169,SRC_169_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] src169String() {
            return getPackedString(beginSrc169,SRC_169_LEN);
         }
   protected static final int SRC_169_LEN = 4;
   protected static final int SRC_169_SCALE = 2;
  	/**
	 * 	serializeSrc169
	 */
	protected void serializeSrc169(BigDecimal src169) {
		   putDecimal(beginSrc169,src169,SRC_169_LEN,SRC_169_SCALE,true);
		 localSrc169Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkSrc169MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,7/*precision*/);
   }
     /**
	 *	refreshSrc169 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc169() throws CFException {	
   	try { 
		 return (getDecimal(beginSrc169,SRC_169_LEN,SRC_169_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("src169", beginSrc169,SRC_169_LEN);
     }
   	}
     int localSrc171Counter = -1;
     
     public boolean isSrc171Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc171Counter != sharedCounter;
         localSrc171Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of src171
	 *	@return src171
	 */
	public char[]  getSrc171String() {
	    return getCharArray(beginSrc171,SRC_171_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src171IsNumeric() {
		    return isNumeric(beginSrc171
	                    ,beginSrc171 + SRC_171_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int SRC_171_LEN = 7;
  protected  static final int SRC_171_SCALE = 2;

   protected BigDecimal checkSrc171MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,7/*precision*/);
   }

  	/**
	 * serializeSrc171
	 */
	protected void serializeSrc171(BigDecimal src171) {
	       putNumber(beginSrc171,src171,SRC_171_LEN,SRC_171_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc171Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeSrc171
	 */
   	protected  BigDecimal serializeSrc171(char[] value) throws CFException {
        if (value.length < 7) value = pad(7, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(7,value,false/*isSigned?*/)
		       ,beginSrc171
		       ,7
		      );		 localSrc171Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,SRC_171_LEN,SRC_171_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("src171", beginSrc171,SRC_171_LEN);
    	}
    }
    /**
	 *	refreshSrc171 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc171() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginSrc171
			            ,SRC_171_LEN
			            ,SRC_171_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("src171", beginSrc171,SRC_171_LEN);
    }
   	}
     int localTgt171Counter = -1;
     public boolean isTgt171Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt171Counter != sharedCounter;
         localTgt171Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tgt171
	 *	@return tgt171
	 */
	public char[]  getTgt171String() {
	     return getCharArray(beginTgt171,TGT_171_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt171IsNumeric() {
	    return isNumeric(beginTgt171
	                    ,beginTgt171 + TGT_171_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TGT_171_LEN = 10;
  	/**
	 * serializeTgt171
	 */
	protected void serializeTgt171(long tgt171) {
		 putNumber(beginTgt171,tgt171,TGT_171_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt171Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTgt171
	 */
   	protected  long serializeTgt171(char[] value) {
	    long  tgt171;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tgt171 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginTgt171
		       ,10
		      );
		 localTgt171Counter = shareString.getSerializedField().getModifiedCounter();
		return  tgt171;
    }

   protected long checkTgt171MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTgt171 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTgt171() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTgt171
			                 ,TGT_171_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt171", beginTgt171,TGT_171_LEN);
    }
   	}
     int localSrc172Counter = -1;
     
     public boolean isSrc172Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc172Counter != sharedCounter;
         localSrc172Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of src172
	 *	@return src172
	 */
	public char[]  getSrc172String() {
	    return getCharArray(beginSrc172,SRC_172_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src172IsNumeric() {
		    return isNumeric(beginSrc172
	                    ,beginSrc172 + SRC_172_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int SRC_172_LEN = 7;
  protected  static final int SRC_172_SCALE = 2;

   protected BigDecimal checkSrc172MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,7/*precision*/);
   }

  	/**
	 * serializeSrc172
	 */
	protected void serializeSrc172(BigDecimal src172) {
	       putNumber(beginSrc172,src172,SRC_172_LEN,SRC_172_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc172Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeSrc172
	 */
   	protected  BigDecimal serializeSrc172(char[] value) throws CFException {
        if (value.length < 7) value = pad(7, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(7,value,false/*isSigned?*/)
		       ,beginSrc172
		       ,7
		      );		 localSrc172Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,SRC_172_LEN,SRC_172_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("src172", beginSrc172,SRC_172_LEN);
    	}
    }
    /**
	 *	refreshSrc172 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc172() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginSrc172
			            ,SRC_172_LEN
			            ,SRC_172_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("src172", beginSrc172,SRC_172_LEN);
    }
   	}
     int localTgt172Counter = -1;
     public boolean isTgt172Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt172Counter != sharedCounter;
         localTgt172Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tgt172
	 *	@return tgt172
	 */
	public char[]  getTgt172String() {
	     return getCharArray(beginTgt172,TGT_172_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt172IsNumeric() {
	    return isNumeric(beginTgt172
	                    ,beginTgt172 + TGT_172_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TGT_172_LEN = 10;
  	/**
	 * serializeTgt172
	 */
	protected void serializeTgt172(long tgt172) {
		 putNumber(beginTgt172,tgt172,TGT_172_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt172Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTgt172
	 */
   	protected  long serializeTgt172(char[] value) {
	    long  tgt172;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tgt172 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginTgt172
		       ,10
		      );
		 localTgt172Counter = shareString.getSerializedField().getModifiedCounter();
		return  tgt172;
    }

   protected long checkTgt172MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTgt172 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTgt172() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTgt172
			                 ,TGT_172_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt172", beginTgt172,TGT_172_LEN);
    }
   	}
     int localSrc173Counter = -1;
     
     public boolean isSrc173Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc173Counter != sharedCounter;
         localSrc173Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of src173
	 *	@return src173
	 */
	public char[]  getSrc173String() {
	    return getCharArray(beginSrc173,SRC_173_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src173IsNumeric() {
		    return isNumeric(beginSrc173
	                    ,beginSrc173 + SRC_173_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int SRC_173_LEN = 7;
  protected  static final int SRC_173_SCALE = 2;

   protected BigDecimal checkSrc173MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,7/*precision*/);
   }

  	/**
	 * serializeSrc173
	 */
	protected void serializeSrc173(BigDecimal src173) {
	       putNumber(beginSrc173,src173,SRC_173_LEN,SRC_173_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc173Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeSrc173
	 */
   	protected  BigDecimal serializeSrc173(char[] value) throws CFException {
        if (value.length < 7) value = pad(7, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(7,value,false/*isSigned?*/)
		       ,beginSrc173
		       ,7
		      );		 localSrc173Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,SRC_173_LEN,SRC_173_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("src173", beginSrc173,SRC_173_LEN);
    	}
    }
    /**
	 *	refreshSrc173 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc173() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginSrc173
			            ,SRC_173_LEN
			            ,SRC_173_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("src173", beginSrc173,SRC_173_LEN);
    }
   	}
     int localSrc174Counter = -1;
     
     public boolean isSrc174Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc174Counter != sharedCounter;
         localSrc174Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of src174
	 *	@return src174
	 */
	public char[]  getSrc174String() {
	    return getCharArray(beginSrc174,SRC_174_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src174IsNumeric() {
		    return isNumeric(beginSrc174
	                    ,beginSrc174 + SRC_174_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int SRC_174_LEN = 7;
  protected  static final int SRC_174_SCALE = 2;

   protected BigDecimal checkSrc174MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,7/*precision*/);
   }

  	/**
	 * serializeSrc174
	 */
	protected void serializeSrc174(BigDecimal src174) {
	       putNumber(beginSrc174,src174,SRC_174_LEN,SRC_174_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc174Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeSrc174
	 */
   	protected  BigDecimal serializeSrc174(char[] value) throws CFException {
        if (value.length < 7) value = pad(7, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(7,value,false/*isSigned?*/)
		       ,beginSrc174
		       ,7
		      );		 localSrc174Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,SRC_174_LEN,SRC_174_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("src174", beginSrc174,SRC_174_LEN);
    	}
    }
    /**
	 *	refreshSrc174 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc174() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginSrc174
			            ,SRC_174_LEN
			            ,SRC_174_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("src174", beginSrc174,SRC_174_LEN);
    }
   	}
     int localSrc175Counter = -1;
     public boolean isSrc175Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc175Counter != sharedCounter;
         localSrc175Counter = sharedCounter; return hasModified;
     }
	protected static final int SRC_175_LEN = 5;
	/**
	 * 	serialize this Src175
	 */
   protected void serializeSrc175(char[] src175) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(src175,0,getStringValue(),beginSrc175,SRC_175_LEN);
       localSrc175Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSrc175Constraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshSrc175 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSrc175() {	 
   		return (substring(getStringValue(),beginSrc175,beginSrc175 + SRC_175_LEN));
   	}
     int localTgt175Counter = -1;
     public boolean isTgt175Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt175Counter != sharedCounter;
         localTgt175Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tgt175
	 *	@return tgt175
	 */
	public char[]  getTgt175String() {
	     return getCharArray(beginTgt175,TGT_175_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt175IsNumeric() {
	    return isNumeric(beginTgt175
	                    ,beginTgt175 + TGT_175_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TGT_175_LEN = 10;
  	/**
	 * serializeTgt175
	 */
	protected void serializeTgt175(long tgt175) {
		 putNumber(beginTgt175,tgt175,TGT_175_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt175Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTgt175
	 */
   	protected  long serializeTgt175(char[] value) {
	    long  tgt175;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tgt175 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginTgt175
		       ,10
		      );
		 localTgt175Counter = shareString.getSerializedField().getModifiedCounter();
		return  tgt175;
    }

   protected long checkTgt175MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTgt175 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTgt175() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTgt175
			                 ,TGT_175_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt175", beginTgt175,TGT_175_LEN);
    }
   	}
     int localTgt176Counter = -1;
     public boolean isTgt176Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt176Counter != sharedCounter;
         localTgt176Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tgt176
	 *	@return tgt176
	 */
	public char[]  getTgt176String() {
	     return getCharArray(beginTgt176,TGT_176_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt176IsNumeric() {
	    return isNumeric(beginTgt176
	                    ,beginTgt176 + TGT_176_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TGT_176_LEN = 10;
  	/**
	 * serializeTgt176
	 */
	protected void serializeTgt176(long tgt176) {
		 putNumber(beginTgt176,tgt176,TGT_176_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt176Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTgt176
	 */
   	protected  long serializeTgt176(char[] value) {
	    long  tgt176;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tgt176 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginTgt176
		       ,10
		      );
		 localTgt176Counter = shareString.getSerializedField().getModifiedCounter();
		return  tgt176;
    }

   protected long checkTgt176MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTgt176 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTgt176() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTgt176
			                 ,TGT_176_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt176", beginTgt176,TGT_176_LEN);
    }
   	}
     int localSrc177Counter = -1;
     public boolean isSrc177Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc177Counter != sharedCounter;
         localSrc177Counter = sharedCounter; return hasModified;
     }
	protected static final int SRC_177_LEN = 5;
	/**
	 * 	serialize this Src177
	 */
   protected void serializeSrc177(char[] src177) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(src177,0,getStringValue(),beginSrc177,SRC_177_LEN);
       localSrc177Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSrc177Constraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshSrc177 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSrc177() {	 
   		return (substring(getStringValue(),beginSrc177,beginSrc177 + SRC_177_LEN));
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
	protected static final int TGT_179_LEN = 6;
	/**
	 * 	serialize this Tgt179
	 */
   protected void serializeTgt179(char[] tgt179) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tgt179,0,getStringValue(),beginTgt179,TGT_179_LEN);
       localTgt179Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTgt179Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
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
       
      
   protected short checkSrc180MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localTgt180Counter = -1;
         public boolean isTgt180Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt180Counter != sharedCounter;
            localTgt180Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkTgt180MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localSrc181Counter = -1;
         public boolean isSrc181Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc181Counter != sharedCounter;
            localSrc181Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkSrc181MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localTgt181Counter = -1;
         public boolean isTgt181Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt181Counter != sharedCounter;
            localTgt181Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkTgt181MaxLimit(long number) {
        return checkMaxLimit(number, true/*isSigned*/,8/*dataLen*/);
   }
         int localSrc182Counter = -1;
         public boolean isSrc182Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc182Counter != sharedCounter;
            localSrc182Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkSrc182MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localTgt182Counter = -1;
         public boolean isTgt182Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt182Counter != sharedCounter;
            localTgt182Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkTgt182MaxLimit(long number) {
        return checkMaxLimit(number, true/*isSigned*/,8/*dataLen*/);
   }
         int localSrc183Counter = -1;
         public boolean isSrc183Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc183Counter != sharedCounter;
            localSrc183Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkSrc183MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localTgt183Counter = -1;
         public boolean isTgt183Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt183Counter != sharedCounter;
            localTgt183Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkTgt183MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localSrc184Counter = -1;
         public boolean isSrc184Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc184Counter != sharedCounter;
            localSrc184Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkSrc184MaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     int localTgt184Counter = -1;
     public boolean isTgt184Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt184Counter != sharedCounter;
         localTgt184Counter = sharedCounter; return hasModified;
     }
	protected static final int TGT_184_LEN = 6;
	/**
	 * 	serialize this Tgt184
	 */
   protected void serializeTgt184(char[] tgt184) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tgt184,0,getStringValue(),beginTgt184,TGT_184_LEN);
       localTgt184Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTgt184Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshTgt184 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTgt184() {	 
   		return (substring(getStringValue(),beginTgt184,beginTgt184 + TGT_184_LEN));
   	}
         int localSrc185Counter = -1;
         public boolean isSrc185Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc185Counter != sharedCounter;
            localSrc185Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkSrc185MaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
         int localTgt185Counter = -1;
         public boolean isTgt185Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt185Counter != sharedCounter;
            localTgt185Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkTgt185MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localSrc186Counter = -1;
         public boolean isSrc186Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc186Counter != sharedCounter;
            localSrc186Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkSrc186MaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
         int localTgt186Counter = -1;
         public boolean isTgt186Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt186Counter != sharedCounter;
            localTgt186Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkTgt186MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,8/*dataLen*/);
   }
         int localSrc187Counter = -1;
         public boolean isSrc187Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc187Counter != sharedCounter;
            localSrc187Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSrc187MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localTgt187Counter = -1;
         public boolean isTgt187Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt187Counter != sharedCounter;
            localTgt187Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkTgt187MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,8/*dataLen*/);
   }
         int localSrc188Counter = -1;
         public boolean isSrc188Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc188Counter != sharedCounter;
            localSrc188Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSrc188MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localTgt188Counter = -1;
         public boolean isTgt188Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt188Counter != sharedCounter;
            localTgt188Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkTgt188MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localSrc189Counter = -1;
         public boolean isSrc189Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc189Counter != sharedCounter;
            localSrc189Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkSrc189MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     int localTgt189Counter = -1;
     public boolean isTgt189Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt189Counter != sharedCounter;
         localTgt189Counter = sharedCounter; return hasModified;
     }
	protected static final int TGT_189_LEN = 7;
	/**
	 * 	serialize this Tgt189
	 */
   protected void serializeTgt189(char[] tgt189) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tgt189,0,getStringValue(),beginTgt189,TGT_189_LEN);
       localTgt189Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTgt189Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshTgt189 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTgt189() {	 
   		return (substring(getStringValue(),beginTgt189,beginTgt189 + TGT_189_LEN));
   	}
         int localSrc190Counter = -1;
         public boolean isSrc190Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc190Counter != sharedCounter;
            localSrc190Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkSrc190MaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     int localTgt190Counter = -1;
     public boolean isTgt190Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt190Counter != sharedCounter;
         localTgt190Counter = sharedCounter; return hasModified;
     }
	protected static final int TGT_190_LEN = 7;
	/**
	 * 	serialize this Tgt190
	 */
   protected void serializeTgt190(char[] tgt190) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tgt190,0,getStringValue(),beginTgt190,TGT_190_LEN);
       localTgt190Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTgt190Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshTgt190 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTgt190() {	 
   		return (substring(getStringValue(),beginTgt190,beginTgt190 + TGT_190_LEN));
   	}
         int localSrc191Counter = -1;
         public boolean isSrc191Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc191Counter != sharedCounter;
            localSrc191Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkSrc191MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     int localTgt191Counter = -1;
     public boolean isTgt191Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt191Counter != sharedCounter;
         localTgt191Counter = sharedCounter; return hasModified;
     }
	protected static final int TGT_191_LEN = 7;
	/**
	 * 	serialize this Tgt191
	 */
   protected void serializeTgt191(char[] tgt191) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tgt191,0,getStringValue(),beginTgt191,TGT_191_LEN);
       localTgt191Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTgt191Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshTgt191 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTgt191() {	 
   		return (substring(getStringValue(),beginTgt191,beginTgt191 + TGT_191_LEN));
   	}
         int localSrc192Counter = -1;
         public boolean isSrc192Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc192Counter != sharedCounter;
            localSrc192Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSrc192MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
     int localTgt192Counter = -1;
     public boolean isTgt192Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt192Counter != sharedCounter;
         localTgt192Counter = sharedCounter; return hasModified;
     }
	protected static final int TGT_192_LEN = 11;
	/**
	 * 	serialize this Tgt192
	 */
   protected void serializeTgt192(char[] tgt192) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tgt192,0,getStringValue(),beginTgt192,TGT_192_LEN);
       localTgt192Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTgt192Constraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
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
       
      
   protected int checkSrc193MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     int localTgt193Counter = -1;
     public boolean isTgt193Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt193Counter != sharedCounter;
         localTgt193Counter = sharedCounter; return hasModified;
     }
	protected static final int TGT_193_LEN = 11;
	/**
	 * 	serialize this Tgt193
	 */
   protected void serializeTgt193(char[] tgt193) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tgt193,0,getStringValue(),beginTgt193,TGT_193_LEN);
       localTgt193Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTgt193Constraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
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
	    public boolean src194IsNumeric() {
	      return decimalIsNumeric(beginSrc194,SRC_194_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] src194String() {
            return getPackedString(beginSrc194,SRC_194_LEN);
         }
   protected static final int SRC_194_LEN = 8;
   protected static final int SRC_194_SCALE = 6;
  	/**
	 * 	serializeSrc194
	 */
	protected void serializeSrc194(BigDecimal src194) {
		   putDecimal(beginSrc194,src194,SRC_194_LEN,SRC_194_SCALE,true);
		 localSrc194Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkSrc194MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,6/*scale*/,14/*precision*/);
   }
     /**
	 *	refreshSrc194 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc194() throws CFException {	
   	try { 
		 return (getDecimal(beginSrc194,SRC_194_LEN,SRC_194_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("src194", beginSrc194,SRC_194_LEN);
     }
   	}
     int localTgt194Counter = -1;
     
     public boolean isTgt194Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt194Counter != sharedCounter;
         localTgt194Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of tgt194
	 *	@return tgt194
	 */
	public char[]  getTgt194String() {
	    return getCharArray(beginTgt194,TGT_194_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt194IsNumeric() {
		    return isNumeric(beginTgt194
	                    ,beginTgt194 + TGT_194_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int TGT_194_LEN = 10;
  protected  static final int TGT_194_SCALE = 3;

   protected BigDecimal checkTgt194MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,3/*scale*/,10/*precision*/);
   }

  	/**
	 * serializeTgt194
	 */
	protected void serializeTgt194(BigDecimal tgt194) {
	       putNumber(beginTgt194,tgt194,TGT_194_LEN,TGT_194_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt194Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeTgt194
	 */
   	protected  BigDecimal serializeTgt194(char[] value) throws CFException {
        if (value.length < 10) value = pad(10, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(10,value,true/*isSigned?*/)
		       ,beginTgt194
		       ,10
		      );		 localTgt194Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,TGT_194_LEN,TGT_194_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("tgt194", beginTgt194,TGT_194_LEN);
    	}
    }
    /**
	 *	refreshTgt194 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt194() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginTgt194
			            ,TGT_194_LEN
			            ,TGT_194_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt194", beginTgt194,TGT_194_LEN);
    }
   	}
     int localSrc195Counter = -1;
     
     public boolean isSrc195Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc195Counter != sharedCounter;
         localSrc195Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of src195
	 *	@return src195
	 */
	public char[]  getSrc195String() {
	    return getCharArray(beginSrc195,SRC_195_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src195IsNumeric() {
		    return isNumeric(beginSrc195
	                    ,beginSrc195 + SRC_195_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int SRC_195_LEN = 14;
  protected  static final int SRC_195_SCALE = 6;

   protected BigDecimal checkSrc195MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,6/*scale*/,14/*precision*/);
   }

  	/**
	 * serializeSrc195
	 */
	protected void serializeSrc195(BigDecimal src195) {
	       putNumber(beginSrc195,src195,SRC_195_LEN,SRC_195_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc195Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeSrc195
	 */
   	protected  BigDecimal serializeSrc195(char[] value) throws CFException {
        if (value.length < 14) value = pad(14, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(14,value,true/*isSigned?*/)
		       ,beginSrc195
		       ,14
		      );		 localSrc195Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,SRC_195_LEN,SRC_195_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("src195", beginSrc195,SRC_195_LEN);
    	}
    }
    /**
	 *	refreshSrc195 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc195() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginSrc195
			            ,SRC_195_LEN
			            ,SRC_195_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("src195", beginSrc195,SRC_195_LEN);
    }
   	}
        int localTgt195Counter = -1;
        public boolean isTgt195Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTgt195Counter != sharedCounter;
           localTgt195Counter = sharedCounter; return hasModified; 
        }
	    public boolean tgt195IsNumeric() {
	      return decimalIsNumeric(beginTgt195,TGT_195_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tgt195String() {
            return getPackedString(beginTgt195,TGT_195_LEN);
         }
   protected static final int TGT_195_LEN = 6;
   protected static final int TGT_195_SCALE = 3;
  	/**
	 * 	serializeTgt195
	 */
	protected void serializeTgt195(BigDecimal tgt195) {
		   putDecimal(beginTgt195,tgt195,TGT_195_LEN,TGT_195_SCALE,true);
		 localTgt195Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTgt195MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,3/*scale*/,10/*precision*/);
   }
     /**
	 *	refreshTgt195 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt195() throws CFException {	
   	try { 
		 return (getDecimal(beginTgt195,TGT_195_LEN,TGT_195_SCALE));	
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
	
	 /**
	 *	Returns String value of src196
	 *	@return src196
	 */
	public char[]  getSrc196String() {
	    return getCharArray(beginSrc196,SRC_196_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src196IsNumeric() {
		    return isNumeric(beginSrc196
	                    ,beginSrc196 + SRC_196_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int SRC_196_LEN = 14;
  protected  static final int SRC_196_SCALE = 6;

   protected BigDecimal checkSrc196MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,6/*scale*/,14/*precision*/);
   }

  	/**
	 * serializeSrc196
	 */
	protected void serializeSrc196(BigDecimal src196) {
	       putNumber(beginSrc196,src196,SRC_196_LEN,SRC_196_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc196Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeSrc196
	 */
   	protected  BigDecimal serializeSrc196(char[] value) throws CFException {
        if (value.length < 14) value = pad(14, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(14,value,true/*isSigned?*/)
		       ,beginSrc196
		       ,14
		      );		 localSrc196Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,SRC_196_LEN,SRC_196_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("src196", beginSrc196,SRC_196_LEN);
    	}
    }
    /**
	 *	refreshSrc196 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc196() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginSrc196
			            ,SRC_196_LEN
			            ,SRC_196_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("src196", beginSrc196,SRC_196_LEN);
    }
   	}
         int localTgt196Counter = -1;
         public boolean isTgt196Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt196Counter != sharedCounter;
            localTgt196Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkTgt196MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
        int localSrc197Counter = -1;
        public boolean isSrc197Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localSrc197Counter != sharedCounter;
           localSrc197Counter = sharedCounter; return hasModified; 
        }
	    public boolean src197IsNumeric() {
	      return decimalIsNumeric(beginSrc197,SRC_197_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] src197String() {
            return getPackedString(beginSrc197,SRC_197_LEN);
         }
   protected static final int SRC_197_LEN = 8;
   protected static final int SRC_197_SCALE = 6;
  	/**
	 * 	serializeSrc197
	 */
	protected void serializeSrc197(BigDecimal src197) {
		   putDecimal(beginSrc197,src197,SRC_197_LEN,SRC_197_SCALE,true);
		 localSrc197Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkSrc197MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,6/*scale*/,14/*precision*/);
   }
     /**
	 *	refreshSrc197 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc197() throws CFException {	
   	try { 
		 return (getDecimal(beginSrc197,SRC_197_LEN,SRC_197_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("src197", beginSrc197,SRC_197_LEN);
     }
   	}
         int localTgt197Counter = -1;
         public boolean isTgt197Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt197Counter != sharedCounter;
            localTgt197Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkTgt197MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
        int localSrc198Counter = -1;
        public boolean isSrc198Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localSrc198Counter != sharedCounter;
           localSrc198Counter = sharedCounter; return hasModified; 
        }
	    public boolean src198IsNumeric() {
	      return decimalIsNumeric(beginSrc198,SRC_198_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] src198String() {
            return getPackedString(beginSrc198,SRC_198_LEN);
         }
   protected static final int SRC_198_LEN = 8;
   protected static final int SRC_198_SCALE = 6;
  	/**
	 * 	serializeSrc198
	 */
	protected void serializeSrc198(BigDecimal src198) {
		   putDecimal(beginSrc198,src198,SRC_198_LEN,SRC_198_SCALE,true);
		 localSrc198Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkSrc198MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,6/*scale*/,14/*precision*/);
   }
     /**
	 *	refreshSrc198 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc198() throws CFException {	
   	try { 
		 return (getDecimal(beginSrc198,SRC_198_LEN,SRC_198_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("src198", beginSrc198,SRC_198_LEN);
     }
   	}
         int localTgt198Counter = -1;
         public boolean isTgt198Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt198Counter != sharedCounter;
            localTgt198Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkTgt198MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
        int localSrc199Counter = -1;
        public boolean isSrc199Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localSrc199Counter != sharedCounter;
           localSrc199Counter = sharedCounter; return hasModified; 
        }
	    public boolean src199IsNumeric() {
	      return decimalIsNumeric(beginSrc199,SRC_199_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] src199String() {
            return getPackedString(beginSrc199,SRC_199_LEN);
         }
   protected static final int SRC_199_LEN = 8;
   protected static final int SRC_199_SCALE = 6;
  	/**
	 * 	serializeSrc199
	 */
	protected void serializeSrc199(BigDecimal src199) {
		   putDecimal(beginSrc199,src199,SRC_199_LEN,SRC_199_SCALE,true);
		 localSrc199Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkSrc199MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,6/*scale*/,14/*precision*/);
   }
     /**
	 *	refreshSrc199 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc199() throws CFException {	
   	try { 
		 return (getDecimal(beginSrc199,SRC_199_LEN,SRC_199_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("src199", beginSrc199,SRC_199_LEN);
     }
   	}
         int localTgt199Counter = -1;
         public boolean isTgt199Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt199Counter != sharedCounter;
            localTgt199Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkTgt199MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     int localSrc200Counter = -1;
     
     public boolean isSrc200Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc200Counter != sharedCounter;
         localSrc200Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of src200
	 *	@return src200
	 */
	public char[]  getSrc200String() {
	    return getCharArray(beginSrc200,SRC_200_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src200IsNumeric() {
		    return isNumeric(beginSrc200
	                    ,beginSrc200 + SRC_200_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int SRC_200_LEN = 14;
  protected  static final int SRC_200_SCALE = 6;

   protected BigDecimal checkSrc200MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,6/*scale*/,14/*precision*/);
   }

  	/**
	 * serializeSrc200
	 */
	protected void serializeSrc200(BigDecimal src200) {
	       putNumber(beginSrc200,src200,SRC_200_LEN,SRC_200_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc200Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeSrc200
	 */
   	protected  BigDecimal serializeSrc200(char[] value) throws CFException {
        if (value.length < 14) value = pad(14, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(14,value,true/*isSigned?*/)
		       ,beginSrc200
		       ,14
		      );		 localSrc200Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,SRC_200_LEN,SRC_200_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("src200", beginSrc200,SRC_200_LEN);
    	}
    }
    /**
	 *	refreshSrc200 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc200() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginSrc200
			            ,SRC_200_LEN
			            ,SRC_200_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("src200", beginSrc200,SRC_200_LEN);
    }
   	}
         int localTgt200Counter = -1;
         public boolean isTgt200Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt200Counter != sharedCounter;
            localTgt200Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkTgt200MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
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
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int SRC_201_LEN = 14;
  protected  static final int SRC_201_SCALE = 6;

   protected BigDecimal checkSrc201MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,6/*scale*/,14/*precision*/);
   }

  	/**
	 * serializeSrc201
	 */
	protected void serializeSrc201(BigDecimal src201) {
	       putNumber(beginSrc201,src201,SRC_201_LEN,SRC_201_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc201Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeSrc201
	 */
   	protected  BigDecimal serializeSrc201(char[] value) throws CFException {
        if (value.length < 14) value = pad(14, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(14,value,true/*isSigned?*/)
		       ,beginSrc201
		       ,14
		      );		 localSrc201Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,SRC_201_LEN,SRC_201_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("src201", beginSrc201,SRC_201_LEN);
    	}
    }
    /**
	 *	refreshSrc201 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc201() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginSrc201
			            ,SRC_201_LEN
			            ,SRC_201_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
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
       
      
   protected int checkTgt201MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     int localSrc202Counter = -1;
     
     public boolean isSrc202Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc202Counter != sharedCounter;
         localSrc202Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of src202
	 *	@return src202
	 */
	public char[]  getSrc202String() {
	    return getCharArray(beginSrc202,SRC_202_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src202IsNumeric() {
		    return isNumeric(beginSrc202
	                    ,beginSrc202 + SRC_202_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int SRC_202_LEN = 14;
  protected  static final int SRC_202_SCALE = 6;

   protected BigDecimal checkSrc202MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,6/*scale*/,14/*precision*/);
   }

  	/**
	 * serializeSrc202
	 */
	protected void serializeSrc202(BigDecimal src202) {
	       putNumber(beginSrc202,src202,SRC_202_LEN,SRC_202_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc202Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeSrc202
	 */
   	protected  BigDecimal serializeSrc202(char[] value) throws CFException {
        if (value.length < 14) value = pad(14, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(14,value,true/*isSigned?*/)
		       ,beginSrc202
		       ,14
		      );		 localSrc202Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,SRC_202_LEN,SRC_202_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("src202", beginSrc202,SRC_202_LEN);
    	}
    }
    /**
	 *	refreshSrc202 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc202() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginSrc202
			            ,SRC_202_LEN
			            ,SRC_202_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("src202", beginSrc202,SRC_202_LEN);
    }
   	}
         int localTgt202Counter = -1;
         public boolean isTgt202Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt202Counter != sharedCounter;
            localTgt202Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkTgt202MaxLimit(long number) {
        return checkMaxLimit(number, true/*isSigned*/,8/*dataLen*/);
   }
     int localSrc203Counter = -1;
     
     public boolean isSrc203Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc203Counter != sharedCounter;
         localSrc203Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of src203
	 *	@return src203
	 */
	public char[]  getSrc203String() {
	    return getCharArray(beginSrc203,SRC_203_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src203IsNumeric() {
		    return isNumeric(beginSrc203
	                    ,beginSrc203 + SRC_203_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int SRC_203_LEN = 14;
  protected  static final int SRC_203_SCALE = 6;

   protected BigDecimal checkSrc203MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,6/*scale*/,14/*precision*/);
   }

  	/**
	 * serializeSrc203
	 */
	protected void serializeSrc203(BigDecimal src203) {
	       putNumber(beginSrc203,src203,SRC_203_LEN,SRC_203_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc203Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeSrc203
	 */
   	protected  BigDecimal serializeSrc203(char[] value) throws CFException {
        if (value.length < 14) value = pad(14, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(14,value,true/*isSigned?*/)
		       ,beginSrc203
		       ,14
		      );		 localSrc203Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,SRC_203_LEN,SRC_203_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("src203", beginSrc203,SRC_203_LEN);
    	}
    }
    /**
	 *	refreshSrc203 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc203() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginSrc203
			            ,SRC_203_LEN
			            ,SRC_203_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("src203", beginSrc203,SRC_203_LEN);
    }
   	}
         int localTgt203Counter = -1;
         public boolean isTgt203Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTgt203Counter != sharedCounter;
            localTgt203Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkTgt203MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     int localSrc204Counter = -1;
     
     public boolean isSrc204Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc204Counter != sharedCounter;
         localSrc204Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of src204
	 *	@return src204
	 */
	public char[]  getSrc204String() {
	    return getCharArray(beginSrc204,SRC_204_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src204IsNumeric() {
		    return isNumeric(beginSrc204
	                    ,beginSrc204 + SRC_204_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int SRC_204_LEN = 14;
  protected  static final int SRC_204_SCALE = 6;

   protected BigDecimal checkSrc204MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,6/*scale*/,14/*precision*/);
   }

  	/**
	 * serializeSrc204
	 */
	protected void serializeSrc204(BigDecimal src204) {
	       putNumber(beginSrc204,src204,SRC_204_LEN,SRC_204_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrc204Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeSrc204
	 */
   	protected  BigDecimal serializeSrc204(char[] value) throws CFException {
        if (value.length < 14) value = pad(14, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(14,value,true/*isSigned?*/)
		       ,beginSrc204
		       ,14
		      );		 localSrc204Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,SRC_204_LEN,SRC_204_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("src204", beginSrc204,SRC_204_LEN);
    	}
    }
    /**
	 *	refreshSrc204 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc204() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginSrc204
			            ,SRC_204_LEN
			            ,SRC_204_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("src204", beginSrc204,SRC_204_LEN);
    }
   	}
     int localTgt204Counter = -1;
     public boolean isTgt204Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt204Counter != sharedCounter;
         localTgt204Counter = sharedCounter; return hasModified;
     }
	protected static final int TGT_204_LEN = 10;
	/**
	 * 	serialize this Tgt204
	 */
   protected void serializeTgt204(char[] tgt204) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tgt204,0,getStringValue(),beginTgt204,TGT_204_LEN);
       localTgt204Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTgt204Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshTgt204 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTgt204() {	 
   		return (substring(getStringValue(),beginTgt204,beginTgt204 + TGT_204_LEN));
   	}
        int localSrc205Counter = -1;
        public boolean isSrc205Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localSrc205Counter != sharedCounter;
           localSrc205Counter = sharedCounter; return hasModified; 
        }
	    public boolean src205IsNumeric() {
	      return decimalIsNumeric(beginSrc205,SRC_205_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] src205String() {
            return getPackedString(beginSrc205,SRC_205_LEN);
         }
   protected static final int SRC_205_LEN = 8;
   protected static final int SRC_205_SCALE = 6;
  	/**
	 * 	serializeSrc205
	 */
	protected void serializeSrc205(BigDecimal src205) {
		   putDecimal(beginSrc205,src205,SRC_205_LEN,SRC_205_SCALE,true);
		 localSrc205Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkSrc205MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,6/*scale*/,14/*precision*/);
   }
     /**
	 *	refreshSrc205 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSrc205() throws CFException {	
   	try { 
		 return (getDecimal(beginSrc205,SRC_205_LEN,SRC_205_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("src205", beginSrc205,SRC_205_LEN);
     }
   	}
     int localTgt205Counter = -1;
     public boolean isTgt205Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt205Counter != sharedCounter;
         localTgt205Counter = sharedCounter; return hasModified;
     }
	protected static final int TGT_205_LEN = 10;
	/**
	 * 	serialize this Tgt205
	 */
   protected void serializeTgt205(char[] tgt205) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tgt205,0,getStringValue(),beginTgt205,TGT_205_LEN);
       localTgt205Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTgt205Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshTgt205 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTgt205() {	 
   		return (substring(getStringValue(),beginTgt205,beginTgt205 + TGT_205_LEN));
   	}
     int localSrc207Counter = -1;
     public boolean isSrc207Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc207Counter != sharedCounter;
         localSrc207Counter = sharedCounter; return hasModified;
     }
	protected static final int SRC_207_LEN = 16;
	/**
	 * 	serialize this Src207
	 */
   protected void serializeSrc207(char[] src207) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(src207,0,getStringValue(),beginSrc207,SRC_207_LEN);
       localSrc207Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSrc207Constraints(char[] value) {
   			return super.checkConstraints(value , 16 ,false, false);
   }
    /**
	 *	refreshSrc207 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSrc207() {	 
   		return (substring(getStringValue(),beginSrc207,beginSrc207 + SRC_207_LEN));
   	}
     int localTgt207Counter = -1;
     
     public boolean isTgt207Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt207Counter != sharedCounter;
         localTgt207Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of tgt207
	 *	@return tgt207
	 */
	public char[]  getTgt207String() {
	    return getCharArray(beginTgt207,TGT_207_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt207IsNumeric() {
		    return isNumeric(beginTgt207
	                    ,beginTgt207 + TGT_207_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int TGT_207_LEN = 14;
  protected  static final int TGT_207_SCALE = 6;

   protected BigDecimal checkTgt207MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,6/*scale*/,14/*precision*/);
   }

  	/**
	 * serializeTgt207
	 */
	protected void serializeTgt207(BigDecimal tgt207) {
	       putNumber(beginTgt207,tgt207,TGT_207_LEN,TGT_207_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt207Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeTgt207
	 */
   	protected  BigDecimal serializeTgt207(char[] value) throws CFException {
        if (value.length < 14) value = pad(14, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(14,value,true/*isSigned?*/)
		       ,beginTgt207
		       ,14
		      );		 localTgt207Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,TGT_207_LEN,TGT_207_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("tgt207", beginTgt207,TGT_207_LEN);
    	}
    }
    /**
	 *	refreshTgt207 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt207() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginTgt207
			            ,TGT_207_LEN
			            ,TGT_207_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt207", beginTgt207,TGT_207_LEN);
    }
   	}
     int localSrc208Counter = -1;
     public boolean isSrc208Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrc208Counter != sharedCounter;
         localSrc208Counter = sharedCounter; return hasModified;
     }
	protected static final int SRC_208_LEN = 16;
	/**
	 * 	serialize this Src208
	 */
   protected void serializeSrc208(char[] src208) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(src208,0,getStringValue(),beginSrc208,SRC_208_LEN);
       localSrc208Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSrc208Constraints(char[] value) {
   			return super.checkConstraints(value , 16 ,false, false);
   }
    /**
	 *	refreshSrc208 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSrc208() {	 
   		return (substring(getStringValue(),beginSrc208,beginSrc208 + SRC_208_LEN));
   	}
        int localTgt208Counter = -1;
        public boolean isTgt208Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTgt208Counter != sharedCounter;
           localTgt208Counter = sharedCounter; return hasModified; 
        }
	    public boolean tgt208IsNumeric() {
	      return decimalIsNumeric(beginTgt208,TGT_208_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tgt208String() {
            return getPackedString(beginTgt208,TGT_208_LEN);
         }
   protected static final int TGT_208_LEN = 8;
   protected static final int TGT_208_SCALE = 6;
  	/**
	 * 	serializeTgt208
	 */
	protected void serializeTgt208(BigDecimal tgt208) {
		   putDecimal(beginTgt208,tgt208,TGT_208_LEN,TGT_208_SCALE,true);
		 localTgt208Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTgt208MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,6/*scale*/,14/*precision*/);
   }
     /**
	 *	refreshTgt208 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTgt208() throws CFException {	
   	try { 
		 return (getDecimal(beginTgt208,TGT_208_LEN,TGT_208_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("tgt208", beginTgt208,TGT_208_LEN);
     }
   	}
         int localSrc209Counter = -1;
         public boolean isSrc209Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc209Counter != sharedCounter;
            localSrc209Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkSrc209MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     int localTgt209Counter = -1;
     public boolean isTgt209Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt209Counter != sharedCounter;
         localTgt209Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tgt209
	 *	@return tgt209
	 */
	public char[]  getTgt209String() {
	     return getCharArray(beginTgt209,TGT_209_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt209IsNumeric() {
	    return isNumeric(beginTgt209
	                    ,beginTgt209 + TGT_209_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TGT_209_LEN = 5;
  	/**
	 * serializeTgt209
	 */
	protected void serializeTgt209(long tgt209) {
		 putNumber(beginTgt209,tgt209,TGT_209_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt209Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTgt209
	 */
   	protected  long serializeTgt209(char[] value) {
	    long  tgt209;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tgt209 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginTgt209
		       ,5
		      );
		 localTgt209Counter = shareString.getSerializedField().getModifiedCounter();
		return  tgt209;
    }

   protected long checkTgt209MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTgt209 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTgt209() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTgt209
			                 ,TGT_209_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt209", beginTgt209,TGT_209_LEN);
    }
   	}
     int localTgt210Counter = -1;
     public boolean isTgt210Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTgt210Counter != sharedCounter;
         localTgt210Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tgt210
	 *	@return tgt210
	 */
	public char[]  getTgt210String() {
	     return getCharArray(beginTgt210,TGT_210_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt210IsNumeric() {
	    return isNumeric(beginTgt210
	                    ,beginTgt210 + TGT_210_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TGT_210_LEN = 5;
  	/**
	 * serializeTgt210
	 */
	protected void serializeTgt210(long tgt210) {
		 putNumber(beginTgt210,tgt210,TGT_210_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTgt210Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTgt210
	 */
   	protected  long serializeTgt210(char[] value) {
	    long  tgt210;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tgt210 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginTgt210
		       ,5
		      );
		 localTgt210Counter = shareString.getSerializedField().getModifiedCounter();
		return  tgt210;
    }

   protected long checkTgt210MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTgt210 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTgt210() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTgt210
			                 ,TGT_210_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tgt210", beginTgt210,TGT_210_LEN);
    }
   	}
         int localSrc211Counter = -1;
         public boolean isSrc211Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrc211Counter != sharedCounter;
            localSrc211Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkSrc211MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }




}
  
