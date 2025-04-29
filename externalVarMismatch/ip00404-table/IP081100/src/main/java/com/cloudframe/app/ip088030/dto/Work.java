package com.cloudframe.app.ip088030.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Work extends WorkSerialized {
   

						@Getter @Setter private char[] isTxnQualify100 = new char[1];

						@Getter @Setter private char[] isMccFound100 = new char[1];

						@Getter @Setter private char[] isMaidFound100 = new char[1];

						@Getter @Setter private char[] isArRecFound100 = new char[1];

						@Getter @Setter private char[] isEndOfLoop100 = new char[1];

						@Getter @Setter private char[] isIchgCalculated100 = new char[1];

						@Getter @Setter private char[] sys001FileStatus200 = new char[2];

						@Getter @Setter private char[] sys002FileStatus200 = new char[2];

						@Getter @Setter private char[] sys201FileStatus200 = new char[2];

						@Getter @Setter private char[] pgmId300 = new char[8];

						@Getter @Setter private char[] pgmVersion300 = new char[7];

						@Getter @Setter private char[] pgmIp610010300 = new char[8];

						@Getter @Setter private char[] pgmIp081110300 = new char[8];

						@Getter @Setter private char[] pgmIp280010300 = new char[8];

						@Getter @Setter private char[] pgmIp280510300 = new char[8];

						@Getter @Setter private char[] pgmIp282010300 = new char[8];

						@Getter @Setter private char[] pgmIp288010300 = new char[8];

						@Getter @Setter private char[] pgmIp783510300 = new char[8];

						@Getter @Setter private char[] pgmIp996010300 = new char[8];

						@Getter @Setter private char[] valueC300 = new char[1];

						@Getter @Setter private char[] valueD300 = new char[1];

								@Getter @Setter private short val1300;

								@Getter @Setter private short minus1300;

						@Getter @Setter private char[] abendParaName300 = new char[30];

								@Getter @Setter private int abendCode300;

								@Getter @Setter private long readCnt400;

								@Getter @Setter private long writeCnt400;

						@Getter @Setter private char[] abendMsgTblErr600 = new char[42];

						@Getter @Setter private char[] ptrIp610010800 = new char[8];

						@Getter @Setter private char[] ptrIp081110800 = new char[8];

						@Getter @Setter private char[] ptrIp280010800 = new char[8];

						@Getter @Setter private char[] ptrIp280510800 = new char[8];

						@Getter @Setter private char[] ptrIp282010800 = new char[8];

						@Getter @Setter private char[] ptrIp288010800 = new char[8];

						@Getter @Setter private char[] ptrIp783510800 = new char[8];

						@Getter @Setter private char[] ptrIp996010800 = new char[8];
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setIsTxnQualify100(("N").toCharArray());
								setIsMccFound100(("N").toCharArray());
								setIsMaidFound100(("N").toCharArray());
								setIsArRecFound100(("N").toCharArray());
								setIsEndOfLoop100(("N").toCharArray());
								setIsIchgCalculated100(("N").toCharArray());
								setSys001FileStatus200(fillSpace(2));
								setSys002FileStatus200(fillSpace(2));
								setSys201FileStatus200(fillSpace(2));
								setPgmId300(("IP088030").toCharArray());
								setPgmVersion300(getString(new byte[] {(byte)0x01,(byte)0xD7,(byte)0x2D,(byte)0x00,(byte)0xF5,(byte)0x22,(byte)0x00}).toCharArray());
								setPgmIp610010300(("IP610010").toCharArray());
								setPgmIp081110300(("IP081110").toCharArray());
								setPgmIp280010300(("IP280010").toCharArray());
								setPgmIp280510300(("IP280510").toCharArray());
								setPgmIp282010300(("IP282010").toCharArray());
								setPgmIp288010300(("IP288010").toCharArray());
								setPgmIp783510300(("IP783510").toCharArray());
								setPgmIp996010300(("IP996010").toCharArray());
								setValueC300(("C").toCharArray());
								setValueD300(("D").toCharArray());
								setVal1300((short)1);
								setMinus1300((short)-1);
								setAbendParaName300(fillSpace(30));
								setAbendCode300(0);
								setReadCnt400(0L);
								setWriteCnt400(0L);
								setAbendMsgTblErr600(("INTERNAL TABLE OVERFLOW ERROR             ").toCharArray());
								setPtrIp610010800(("IP610010").toCharArray());
								setPtrIp081110800(("IP081110").toCharArray());
								setPtrIp280010800(("IP280010").toCharArray());
								setPtrIp280510800(("IP280510").toCharArray());
								setPtrIp282010800(("IP282010").toCharArray());
								setPtrIp288010800(("IP288010").toCharArray());
								setPtrIp783510800(("IP783510").toCharArray());
								setPtrIp996010800(("IP996010").toCharArray());
    }





}
  
