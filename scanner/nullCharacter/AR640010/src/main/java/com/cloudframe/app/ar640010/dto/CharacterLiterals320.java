package com.cloudframe.app.ar640010.dto;

/**
*  The class CharacterLiterals320 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class CharacterLiterals320 extends CharacterLiterals320Serialized {
   

						@Getter @Setter private char[] charA320 = new char[1];

						@Getter @Setter private char[] charD320 = new char[1];

						@Getter @Setter private char[] charE320 = new char[1];

						@Getter @Setter private char[] charPound320 = new char[1];

						@Getter @Setter private char[] charF320 = new char[1];

						@Getter @Setter private char[] charN320 = new char[1];

						@Getter @Setter private char[] charR320 = new char[1];

						@Getter @Setter private char[] charY320 = new char[1];

						@Getter @Setter private char[] char3320 = new char[1];

						@Getter @Setter private char[] period320 = new char[1];

						@Getter @Setter private char[] commaSpace320 = new char[2];

						@Getter @Setter private char[] tilde320 = new char[1];

						@Getter @Setter private char[] pipe320 = new char[1];

						@Getter @Setter private char[] semicolon320 = new char[1];

						@Getter @Setter private char[] parenLeft320 = new char[1];

						@Getter @Setter private char[] parenRight320 = new char[1];

						@Getter @Setter private char[] null320 = new char[7];

						@Getter @Setter private char[] litNa320 = new char[3];

						@Getter @Setter private char[] pgmAr630010300 = new char[8];

						@Getter @Setter private char[] pgmAr631010300 = new char[8];

						@Getter @Setter private char[] pgmAr630020300 = new char[8];

						@Getter @Setter private char[] addErrPara320 = new char[30];

						@Getter @Setter private char[] bulkErrPara320 = new char[30];

						@Getter @Setter private char[] listErrPara320 = new char[30];

						@Getter @Setter private char[] sendErrPara320 = new char[30];

						@Getter @Setter private char[] reloadErrPara320 = new char[30];

						@Getter @Setter private char[] installErrPara320 = new char[30];

						@Getter @Setter private char[] retrvErrPara320 = new char[30];

						@Getter @Setter private char[] unldCompPara320 = new char[30];

						@Getter @Setter private char[] unldErrPara320 = new char[30];

						@Getter @Setter private char[] restageErrPara320 = new char[30];

						@Getter @Setter private char[] preExitErrPara320 = new char[30];

						@Getter @Setter private char[] capturePara320 = new char[30];

						@Getter @Setter private char[] parmErrPara320 = new char[30];
				@Getter @Setter private EndpointFileProfile320 endpointFileProfile320 = new EndpointFileProfile320();

						@Getter @Setter private char[] applicationFile320 = new char[17];

						@Getter @Setter private char[] gftFile320 = new char[9];

						@Getter @Setter private char[] recordFormat320 = new char[15];

						@Getter @Setter private char[] blockSize320 = new char[12];

						@Getter @Setter private char[] recordLength320 = new char[15];

						@Getter @Setter private char[] systemIdentifier320 = new char[19];

						@Getter @Setter private char[] exitDsn320 = new char[22];

						@Getter @Setter private char[] allocationType320 = new char[22];

						@Getter @Setter private char[] broadcastEndptQual320 = new char[8];

						@Getter @Setter private char[] broadcastStatusCounts320 = new char[45];

						@Getter @Setter private char[] broadcastStatusDashes320 = new char[45];

						@Getter @Setter private char[] broadcastTargetRecords320 = new char[28];

						@Getter @Setter private char[] broadcastTargetBytes320 = new char[28];

						@Getter @Setter private char[] broadcastEndptsValid320 = new char[28];

						@Getter @Setter private char[] broadcastEndptsErrors320 = new char[28];
	
	/**
	* Constructor for CharacterLiterals320
	**/
    public CharacterLiterals320() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getEndpointFileProfile320().setParent(this,getStartOffset() + 441);
	   	/*  end of offset */
								setCharA320(("A").toCharArray());
								setCharD320(("D").toCharArray());
								setCharE320(("E").toCharArray());
								setCharPound320(("#").toCharArray());
								setCharF320(("F").toCharArray());
								setCharN320(("N").toCharArray());
								setCharR320(("R").toCharArray());
								setCharY320(("Y").toCharArray());
								setChar3320(("3").toCharArray());
								setPeriod320((".").toCharArray());
								setCommaSpace320((", ").toCharArray());
								setTilde320(("~").toCharArray());
								setPipe320(("|").toCharArray());
								setSemicolon320((";").toCharArray());
								setParenLeft320(("(").toCharArray());
								setParenRight320((")").toCharArray());
								setNull320(("<NULL> ").toCharArray());
								setLitNa320(("N/A").toCharArray());
								setPgmAr630010300(("AR630010").toCharArray());
								setPgmAr631010300(("AR631010").toCharArray());
								setPgmAr630020300(("AR630020").toCharArray());
								setAddErrPara320(("4120-POST-ADD-TARAFXS         ").toCharArray());
								setBulkErrPara320(("4222-POST-BULK-TARAFXS        ").toCharArray());
								setListErrPara320(("4423-POST-LIST-TARAFXS        ").toCharArray());
								setSendErrPara320(("4620-POST-SEND-TARAFXS        ").toCharArray());
								setReloadErrPara320(("4760-RELOAD-TARAFXA-ROW       ").toCharArray());
								setInstallErrPara320(("4823-INSERT-POST-EXIT-TARAFXS ").toCharArray());
								setRetrvErrPara320(("2542-UPDATE-RETRIEVE          ").toCharArray());
								setUnldCompPara320(("4510-SET-TARAFXS-COMPLETE     ").toCharArray());
								setUnldErrPara320(("4520-SET-TARAFXS-ERROR        ").toCharArray());
								setRestageErrPara320(("4721-UPDATE-TARAFXS-ROW       ").toCharArray());
								setPreExitErrPara320(("4824-UPDATE-PRE-EXIT-TARAFXS  ").toCharArray());
								setCapturePara320(("8610-CAPTURE-RESULT           ").toCharArray());
								setParmErrPara320(("9900-REPORT-ERROR             ").toCharArray());
								setApplicationFile320(("APPLICATION FILE ").toCharArray());
								setGftFile320(("GFT FILE ").toCharArray());
								setRecordFormat320(("RECORD FORMAT: ").toCharArray());
								setBlockSize320(("BLOCK SIZE: ").toCharArray());
								setRecordLength320(("RECORD LENGTH: ").toCharArray());
								setSystemIdentifier320(("SYSTEM IDENTIFIER: ").toCharArray());
								setExitDsn320(("APPLICATION EXIT DSN: ").toCharArray());
								setAllocationType320(("ALLOCATION UNIT TYPE: ").toCharArray());
								setBroadcastEndptQual320(("E0000000").toCharArray());
								setBroadcastStatusCounts320(("B R O A D C A S T   S T A T U S   C O U N T S").toCharArray());
								setBroadcastStatusDashes320(String.join("", java.util.Collections.nCopies(45, "-")).toCharArray());
								setBroadcastTargetRecords320(("BROADCAST TARGET RECORDS    ").toCharArray());
								setBroadcastTargetBytes320(("BROADCAST TARGET BYTES      ").toCharArray());
								setBroadcastEndptsValid320(("BROADCAST ENDPOINTS - VALID ").toCharArray());
								setBroadcastEndptsErrors320(("BROADCAST ENDPOINTS - ERRORS").toCharArray());
    }





}
  
