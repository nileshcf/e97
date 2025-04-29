package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504DeNamesLargeGroup1Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:31. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504DeNamesLargeGroup1Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504DeNamesLargeGroup1Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_DE_NAMES_LARGE_GROUP_1_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504D01BitMapS;
            protected  int beginIp65504D01BitMapL;
            protected  int beginIp65504D02PanNbrS;
            protected  int beginIp65504D02PanNbrL;
            protected  int beginIp65504D03ProcCdS;
            protected  int beginIp65504D03ProcCdL;
            protected  int beginIp65504D04TrxAmtS;
            protected  int beginIp65504D04TrxAmtL;
            protected  int beginIp65504D05RecAmtS;
            protected  int beginIp65504D05RecAmtL;
            protected  int beginIp65504D06BilAmtS;
            protected  int beginIp65504D06BilAmtL;
            protected  int beginIp65504D07DteTimS;
            protected  int beginIp65504D07DteTimL;
            protected  int beginIp65504D08BilFeeS;
            protected  int beginIp65504D08BilFeeL;
            protected  int beginIp65504D09RecRteS;
            protected  int beginIp65504D09RecRteL;
            protected  int beginIp65504D10BilRteS;
            protected  int beginIp65504D10BilRteL;
            protected  int beginIp65504D11SysTrcS;
            protected  int beginIp65504D11SysTrcL;
            protected  int beginIp65504D12DteTimS;
            protected  int beginIp65504D12DteTimL;
            protected  int beginIp65504D13EffDteS;
            protected  int beginIp65504D13EffDteL;
            protected  int beginIp65504D14ExpDteS;
            protected  int beginIp65504D14ExpDteL;
            protected  int beginIp65504D15SetDteS;
            protected  int beginIp65504D15SetDteL;
            protected  int beginIp65504D16CnvDteS;
            protected  int beginIp65504D16CnvDteL;
            protected  int beginIp65504D17CapDteS;
            protected  int beginIp65504D17CapDteL;
            protected  int beginIp65504D18MerTypS;
            protected  int beginIp65504D18MerTypL;
            protected  int beginIp65504D19AcqCcdS;
            protected  int beginIp65504D19AcqCcdL;
            protected  int beginIp65504D20PanCcdS;
            protected  int beginIp65504D20PanCcdL;
            protected  int beginIp65504D21FwdCcdS;
            protected  int beginIp65504D21FwdCcdL;
            protected  int beginIp65504D22PoiDcdS;
            protected  int beginIp65504D22PoiDcdL;
            protected  int beginIp65504D23CardSqS;
            protected  int beginIp65504D23CardSqL;
            protected  int beginIp65504D24FuncCdS;
            protected  int beginIp65504D24FuncCdL;
            protected  int beginIp65504D25MsgReaS;
            protected  int beginIp65504D25MsgReaL;
            protected  int beginIp65504D26MccCodS;
            protected  int beginIp65504D26MccCodL;
            protected  int beginIp65504D27AprCodS;
            protected  int beginIp65504D27AprCodL;
            protected  int beginIp65504D28RecDteL;
            protected  int beginIp65504D28RecDteS;
            protected  int beginIp65504D29RecIndS;
            protected  int beginIp65504D29RecIndL;
            protected  int beginIp65504D30OrgAmtS;
            protected  int beginIp65504D30OrgAmtL;
            protected  int beginIp65504D31AcqRefS;
            protected  int beginIp65504D31AcqRefL;
	
	/**
	* Constructor for Ip65504DeNamesLargeGroup1Serialized
	**/
    public Ip65504DeNamesLargeGroup1Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504DeNamesLargeGroup1Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504DeNamesLargeGroup1Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504DeNamesLargeGroup1Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Ip65504DeNamesLargeGroup1Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Ip65504DeNamesLargeGroup1Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_DE_NAMES_LARGE_GROUP_1_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504D01BitMapS = getStartOffset() + 0;	// set offset for serialization
  
             beginIp65504D01BitMapL = getStartOffset() + 2;	// set offset for serialization
  
  
             beginIp65504D02PanNbrS = getStartOffset() + 8;	// set offset for serialization
  
             beginIp65504D02PanNbrL = getStartOffset() + 10;	// set offset for serialization
  
  
             beginIp65504D03ProcCdS = getStartOffset() + 16;	// set offset for serialization
  
             beginIp65504D03ProcCdL = getStartOffset() + 18;	// set offset for serialization
  
  
             beginIp65504D04TrxAmtS = getStartOffset() + 24;	// set offset for serialization
  
             beginIp65504D04TrxAmtL = getStartOffset() + 26;	// set offset for serialization
  
  
             beginIp65504D05RecAmtS = getStartOffset() + 32;	// set offset for serialization
  
             beginIp65504D05RecAmtL = getStartOffset() + 34;	// set offset for serialization
  
  
             beginIp65504D06BilAmtS = getStartOffset() + 40;	// set offset for serialization
  
             beginIp65504D06BilAmtL = getStartOffset() + 42;	// set offset for serialization
  
  
             beginIp65504D07DteTimS = getStartOffset() + 48;	// set offset for serialization
  
             beginIp65504D07DteTimL = getStartOffset() + 50;	// set offset for serialization
  
  
             beginIp65504D08BilFeeS = getStartOffset() + 56;	// set offset for serialization
  
             beginIp65504D08BilFeeL = getStartOffset() + 58;	// set offset for serialization
  
  
             beginIp65504D09RecRteS = getStartOffset() + 64;	// set offset for serialization
  
             beginIp65504D09RecRteL = getStartOffset() + 66;	// set offset for serialization
  
  
             beginIp65504D10BilRteS = getStartOffset() + 72;	// set offset for serialization
  
             beginIp65504D10BilRteL = getStartOffset() + 74;	// set offset for serialization
  
  
             beginIp65504D11SysTrcS = getStartOffset() + 80;	// set offset for serialization
  
             beginIp65504D11SysTrcL = getStartOffset() + 82;	// set offset for serialization
  
  
             beginIp65504D12DteTimS = getStartOffset() + 88;	// set offset for serialization
  
             beginIp65504D12DteTimL = getStartOffset() + 90;	// set offset for serialization
  
  
             beginIp65504D13EffDteS = getStartOffset() + 96;	// set offset for serialization
  
             beginIp65504D13EffDteL = getStartOffset() + 98;	// set offset for serialization
  
  
             beginIp65504D14ExpDteS = getStartOffset() + 104;	// set offset for serialization
  
             beginIp65504D14ExpDteL = getStartOffset() + 106;	// set offset for serialization
  
  
             beginIp65504D15SetDteS = getStartOffset() + 112;	// set offset for serialization
  
             beginIp65504D15SetDteL = getStartOffset() + 114;	// set offset for serialization
  
  
             beginIp65504D16CnvDteS = getStartOffset() + 120;	// set offset for serialization
  
             beginIp65504D16CnvDteL = getStartOffset() + 122;	// set offset for serialization
  
  
             beginIp65504D17CapDteS = getStartOffset() + 128;	// set offset for serialization
  
             beginIp65504D17CapDteL = getStartOffset() + 130;	// set offset for serialization
  
  
             beginIp65504D18MerTypS = getStartOffset() + 136;	// set offset for serialization
  
             beginIp65504D18MerTypL = getStartOffset() + 138;	// set offset for serialization
  
  
             beginIp65504D19AcqCcdS = getStartOffset() + 144;	// set offset for serialization
  
             beginIp65504D19AcqCcdL = getStartOffset() + 146;	// set offset for serialization
  
  
             beginIp65504D20PanCcdS = getStartOffset() + 152;	// set offset for serialization
  
             beginIp65504D20PanCcdL = getStartOffset() + 154;	// set offset for serialization
  
  
             beginIp65504D21FwdCcdS = getStartOffset() + 160;	// set offset for serialization
  
             beginIp65504D21FwdCcdL = getStartOffset() + 162;	// set offset for serialization
  
  
             beginIp65504D22PoiDcdS = getStartOffset() + 168;	// set offset for serialization
  
             beginIp65504D22PoiDcdL = getStartOffset() + 170;	// set offset for serialization
  
  
             beginIp65504D23CardSqS = getStartOffset() + 176;	// set offset for serialization
  
             beginIp65504D23CardSqL = getStartOffset() + 178;	// set offset for serialization
  
  
             beginIp65504D24FuncCdS = getStartOffset() + 184;	// set offset for serialization
  
             beginIp65504D24FuncCdL = getStartOffset() + 186;	// set offset for serialization
  
  
             beginIp65504D25MsgReaS = getStartOffset() + 192;	// set offset for serialization
  
             beginIp65504D25MsgReaL = getStartOffset() + 194;	// set offset for serialization
  
  
             beginIp65504D26MccCodS = getStartOffset() + 200;	// set offset for serialization
  
             beginIp65504D26MccCodL = getStartOffset() + 202;	// set offset for serialization
  
  
             beginIp65504D27AprCodS = getStartOffset() + 208;	// set offset for serialization
  
             beginIp65504D27AprCodL = getStartOffset() + 210;	// set offset for serialization
  
  
             beginIp65504D28RecDteL = getStartOffset() + 216;	// set offset for serialization
  
             beginIp65504D28RecDteS = getStartOffset() + 218;	// set offset for serialization
  
  
             beginIp65504D29RecIndS = getStartOffset() + 224;	// set offset for serialization
  
             beginIp65504D29RecIndL = getStartOffset() + 226;	// set offset for serialization
  
  
             beginIp65504D30OrgAmtS = getStartOffset() + 232;	// set offset for serialization
  
             beginIp65504D30OrgAmtL = getStartOffset() + 234;	// set offset for serialization
  
  
             beginIp65504D31AcqRefS = getStartOffset() + 240;	// set offset for serialization
  
             beginIp65504D31AcqRefL = getStartOffset() + 242;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504D01BitMapSCounter = -1;
         public boolean isIp65504D01BitMapSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D01BitMapSCounter != sharedCounter;
            localIp65504D01BitMapSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_01_BIT_MAP_S_LEN = 2;
  	/**
	 * serializeIp65504D01BitMapS
	 */
	protected void serializeIp65504D01BitMapS(short ip65504D01BitMapS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D01BitMapS,IP_65504_D_01_BIT_MAP_S_LEN)
                  ,beginIp65504D01BitMapS
                  ,IP_65504_D_01_BIT_MAP_S_LEN
                 );
            localIp65504D01BitMapSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D01BitMapSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D01BitMapS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D01BitMapS() {	 
			return (getShort(beginIp65504D01BitMapS));
   	}
         int localIp65504D01BitMapLCounter = -1;
         public boolean isIp65504D01BitMapLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D01BitMapLCounter != sharedCounter;
            localIp65504D01BitMapLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_01_BIT_MAP_L_LEN = 2;
  	/**
	 * serializeIp65504D01BitMapL
	 */
	protected void serializeIp65504D01BitMapL(short ip65504D01BitMapL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D01BitMapL,IP_65504_D_01_BIT_MAP_L_LEN)
                  ,beginIp65504D01BitMapL
                  ,IP_65504_D_01_BIT_MAP_L_LEN
                 );
            localIp65504D01BitMapLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D01BitMapLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D01BitMapL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D01BitMapL() {	 
			return (getShort(beginIp65504D01BitMapL));
   	}
         int localIp65504D02PanNbrSCounter = -1;
         public boolean isIp65504D02PanNbrSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D02PanNbrSCounter != sharedCounter;
            localIp65504D02PanNbrSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_02_PAN_NBR_S_LEN = 2;
  	/**
	 * serializeIp65504D02PanNbrS
	 */
	protected void serializeIp65504D02PanNbrS(short ip65504D02PanNbrS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D02PanNbrS,IP_65504_D_02_PAN_NBR_S_LEN)
                  ,beginIp65504D02PanNbrS
                  ,IP_65504_D_02_PAN_NBR_S_LEN
                 );
            localIp65504D02PanNbrSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D02PanNbrSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D02PanNbrS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D02PanNbrS() {	 
			return (getShort(beginIp65504D02PanNbrS));
   	}
         int localIp65504D02PanNbrLCounter = -1;
         public boolean isIp65504D02PanNbrLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D02PanNbrLCounter != sharedCounter;
            localIp65504D02PanNbrLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_02_PAN_NBR_L_LEN = 2;
  	/**
	 * serializeIp65504D02PanNbrL
	 */
	protected void serializeIp65504D02PanNbrL(short ip65504D02PanNbrL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D02PanNbrL,IP_65504_D_02_PAN_NBR_L_LEN)
                  ,beginIp65504D02PanNbrL
                  ,IP_65504_D_02_PAN_NBR_L_LEN
                 );
            localIp65504D02PanNbrLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D02PanNbrLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D02PanNbrL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D02PanNbrL() {	 
			return (getShort(beginIp65504D02PanNbrL));
   	}
         int localIp65504D03ProcCdSCounter = -1;
         public boolean isIp65504D03ProcCdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D03ProcCdSCounter != sharedCounter;
            localIp65504D03ProcCdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_03_PROC_CD_S_LEN = 2;
  	/**
	 * serializeIp65504D03ProcCdS
	 */
	protected void serializeIp65504D03ProcCdS(short ip65504D03ProcCdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D03ProcCdS,IP_65504_D_03_PROC_CD_S_LEN)
                  ,beginIp65504D03ProcCdS
                  ,IP_65504_D_03_PROC_CD_S_LEN
                 );
            localIp65504D03ProcCdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D03ProcCdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D03ProcCdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D03ProcCdS() {	 
			return (getShort(beginIp65504D03ProcCdS));
   	}
         int localIp65504D03ProcCdLCounter = -1;
         public boolean isIp65504D03ProcCdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D03ProcCdLCounter != sharedCounter;
            localIp65504D03ProcCdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_03_PROC_CD_L_LEN = 2;
  	/**
	 * serializeIp65504D03ProcCdL
	 */
	protected void serializeIp65504D03ProcCdL(short ip65504D03ProcCdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D03ProcCdL,IP_65504_D_03_PROC_CD_L_LEN)
                  ,beginIp65504D03ProcCdL
                  ,IP_65504_D_03_PROC_CD_L_LEN
                 );
            localIp65504D03ProcCdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D03ProcCdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D03ProcCdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D03ProcCdL() {	 
			return (getShort(beginIp65504D03ProcCdL));
   	}
         int localIp65504D04TrxAmtSCounter = -1;
         public boolean isIp65504D04TrxAmtSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D04TrxAmtSCounter != sharedCounter;
            localIp65504D04TrxAmtSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_04_TRX_AMT_S_LEN = 2;
  	/**
	 * serializeIp65504D04TrxAmtS
	 */
	protected void serializeIp65504D04TrxAmtS(short ip65504D04TrxAmtS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D04TrxAmtS,IP_65504_D_04_TRX_AMT_S_LEN)
                  ,beginIp65504D04TrxAmtS
                  ,IP_65504_D_04_TRX_AMT_S_LEN
                 );
            localIp65504D04TrxAmtSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D04TrxAmtSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D04TrxAmtS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D04TrxAmtS() {	 
			return (getShort(beginIp65504D04TrxAmtS));
   	}
         int localIp65504D04TrxAmtLCounter = -1;
         public boolean isIp65504D04TrxAmtLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D04TrxAmtLCounter != sharedCounter;
            localIp65504D04TrxAmtLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_04_TRX_AMT_L_LEN = 2;
  	/**
	 * serializeIp65504D04TrxAmtL
	 */
	protected void serializeIp65504D04TrxAmtL(short ip65504D04TrxAmtL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D04TrxAmtL,IP_65504_D_04_TRX_AMT_L_LEN)
                  ,beginIp65504D04TrxAmtL
                  ,IP_65504_D_04_TRX_AMT_L_LEN
                 );
            localIp65504D04TrxAmtLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D04TrxAmtLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D04TrxAmtL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D04TrxAmtL() {	 
			return (getShort(beginIp65504D04TrxAmtL));
   	}
         int localIp65504D05RecAmtSCounter = -1;
         public boolean isIp65504D05RecAmtSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D05RecAmtSCounter != sharedCounter;
            localIp65504D05RecAmtSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_05_REC_AMT_S_LEN = 2;
  	/**
	 * serializeIp65504D05RecAmtS
	 */
	protected void serializeIp65504D05RecAmtS(short ip65504D05RecAmtS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D05RecAmtS,IP_65504_D_05_REC_AMT_S_LEN)
                  ,beginIp65504D05RecAmtS
                  ,IP_65504_D_05_REC_AMT_S_LEN
                 );
            localIp65504D05RecAmtSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D05RecAmtSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D05RecAmtS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D05RecAmtS() {	 
			return (getShort(beginIp65504D05RecAmtS));
   	}
         int localIp65504D05RecAmtLCounter = -1;
         public boolean isIp65504D05RecAmtLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D05RecAmtLCounter != sharedCounter;
            localIp65504D05RecAmtLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_05_REC_AMT_L_LEN = 2;
  	/**
	 * serializeIp65504D05RecAmtL
	 */
	protected void serializeIp65504D05RecAmtL(short ip65504D05RecAmtL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D05RecAmtL,IP_65504_D_05_REC_AMT_L_LEN)
                  ,beginIp65504D05RecAmtL
                  ,IP_65504_D_05_REC_AMT_L_LEN
                 );
            localIp65504D05RecAmtLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D05RecAmtLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D05RecAmtL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D05RecAmtL() {	 
			return (getShort(beginIp65504D05RecAmtL));
   	}
         int localIp65504D06BilAmtSCounter = -1;
         public boolean isIp65504D06BilAmtSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D06BilAmtSCounter != sharedCounter;
            localIp65504D06BilAmtSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_06_BIL_AMT_S_LEN = 2;
  	/**
	 * serializeIp65504D06BilAmtS
	 */
	protected void serializeIp65504D06BilAmtS(short ip65504D06BilAmtS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D06BilAmtS,IP_65504_D_06_BIL_AMT_S_LEN)
                  ,beginIp65504D06BilAmtS
                  ,IP_65504_D_06_BIL_AMT_S_LEN
                 );
            localIp65504D06BilAmtSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D06BilAmtSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D06BilAmtS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D06BilAmtS() {	 
			return (getShort(beginIp65504D06BilAmtS));
   	}
         int localIp65504D06BilAmtLCounter = -1;
         public boolean isIp65504D06BilAmtLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D06BilAmtLCounter != sharedCounter;
            localIp65504D06BilAmtLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_06_BIL_AMT_L_LEN = 2;
  	/**
	 * serializeIp65504D06BilAmtL
	 */
	protected void serializeIp65504D06BilAmtL(short ip65504D06BilAmtL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D06BilAmtL,IP_65504_D_06_BIL_AMT_L_LEN)
                  ,beginIp65504D06BilAmtL
                  ,IP_65504_D_06_BIL_AMT_L_LEN
                 );
            localIp65504D06BilAmtLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D06BilAmtLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D06BilAmtL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D06BilAmtL() {	 
			return (getShort(beginIp65504D06BilAmtL));
   	}
         int localIp65504D07DteTimSCounter = -1;
         public boolean isIp65504D07DteTimSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D07DteTimSCounter != sharedCounter;
            localIp65504D07DteTimSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_07_DTE_TIM_S_LEN = 2;
  	/**
	 * serializeIp65504D07DteTimS
	 */
	protected void serializeIp65504D07DteTimS(short ip65504D07DteTimS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D07DteTimS,IP_65504_D_07_DTE_TIM_S_LEN)
                  ,beginIp65504D07DteTimS
                  ,IP_65504_D_07_DTE_TIM_S_LEN
                 );
            localIp65504D07DteTimSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D07DteTimSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D07DteTimS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D07DteTimS() {	 
			return (getShort(beginIp65504D07DteTimS));
   	}
         int localIp65504D07DteTimLCounter = -1;
         public boolean isIp65504D07DteTimLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D07DteTimLCounter != sharedCounter;
            localIp65504D07DteTimLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_07_DTE_TIM_L_LEN = 2;
  	/**
	 * serializeIp65504D07DteTimL
	 */
	protected void serializeIp65504D07DteTimL(short ip65504D07DteTimL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D07DteTimL,IP_65504_D_07_DTE_TIM_L_LEN)
                  ,beginIp65504D07DteTimL
                  ,IP_65504_D_07_DTE_TIM_L_LEN
                 );
            localIp65504D07DteTimLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D07DteTimLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D07DteTimL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D07DteTimL() {	 
			return (getShort(beginIp65504D07DteTimL));
   	}
         int localIp65504D08BilFeeSCounter = -1;
         public boolean isIp65504D08BilFeeSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D08BilFeeSCounter != sharedCounter;
            localIp65504D08BilFeeSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_08_BIL_FEE_S_LEN = 2;
  	/**
	 * serializeIp65504D08BilFeeS
	 */
	protected void serializeIp65504D08BilFeeS(short ip65504D08BilFeeS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D08BilFeeS,IP_65504_D_08_BIL_FEE_S_LEN)
                  ,beginIp65504D08BilFeeS
                  ,IP_65504_D_08_BIL_FEE_S_LEN
                 );
            localIp65504D08BilFeeSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D08BilFeeSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D08BilFeeS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D08BilFeeS() {	 
			return (getShort(beginIp65504D08BilFeeS));
   	}
         int localIp65504D08BilFeeLCounter = -1;
         public boolean isIp65504D08BilFeeLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D08BilFeeLCounter != sharedCounter;
            localIp65504D08BilFeeLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_08_BIL_FEE_L_LEN = 2;
  	/**
	 * serializeIp65504D08BilFeeL
	 */
	protected void serializeIp65504D08BilFeeL(short ip65504D08BilFeeL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D08BilFeeL,IP_65504_D_08_BIL_FEE_L_LEN)
                  ,beginIp65504D08BilFeeL
                  ,IP_65504_D_08_BIL_FEE_L_LEN
                 );
            localIp65504D08BilFeeLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D08BilFeeLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D08BilFeeL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D08BilFeeL() {	 
			return (getShort(beginIp65504D08BilFeeL));
   	}
         int localIp65504D09RecRteSCounter = -1;
         public boolean isIp65504D09RecRteSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D09RecRteSCounter != sharedCounter;
            localIp65504D09RecRteSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_09_REC_RTE_S_LEN = 2;
  	/**
	 * serializeIp65504D09RecRteS
	 */
	protected void serializeIp65504D09RecRteS(short ip65504D09RecRteS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D09RecRteS,IP_65504_D_09_REC_RTE_S_LEN)
                  ,beginIp65504D09RecRteS
                  ,IP_65504_D_09_REC_RTE_S_LEN
                 );
            localIp65504D09RecRteSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D09RecRteSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D09RecRteS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D09RecRteS() {	 
			return (getShort(beginIp65504D09RecRteS));
   	}
         int localIp65504D09RecRteLCounter = -1;
         public boolean isIp65504D09RecRteLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D09RecRteLCounter != sharedCounter;
            localIp65504D09RecRteLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_09_REC_RTE_L_LEN = 2;
  	/**
	 * serializeIp65504D09RecRteL
	 */
	protected void serializeIp65504D09RecRteL(short ip65504D09RecRteL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D09RecRteL,IP_65504_D_09_REC_RTE_L_LEN)
                  ,beginIp65504D09RecRteL
                  ,IP_65504_D_09_REC_RTE_L_LEN
                 );
            localIp65504D09RecRteLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D09RecRteLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D09RecRteL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D09RecRteL() {	 
			return (getShort(beginIp65504D09RecRteL));
   	}
         int localIp65504D10BilRteSCounter = -1;
         public boolean isIp65504D10BilRteSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D10BilRteSCounter != sharedCounter;
            localIp65504D10BilRteSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_10_BIL_RTE_S_LEN = 2;
  	/**
	 * serializeIp65504D10BilRteS
	 */
	protected void serializeIp65504D10BilRteS(short ip65504D10BilRteS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D10BilRteS,IP_65504_D_10_BIL_RTE_S_LEN)
                  ,beginIp65504D10BilRteS
                  ,IP_65504_D_10_BIL_RTE_S_LEN
                 );
            localIp65504D10BilRteSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D10BilRteSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D10BilRteS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D10BilRteS() {	 
			return (getShort(beginIp65504D10BilRteS));
   	}
         int localIp65504D10BilRteLCounter = -1;
         public boolean isIp65504D10BilRteLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D10BilRteLCounter != sharedCounter;
            localIp65504D10BilRteLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_10_BIL_RTE_L_LEN = 2;
  	/**
	 * serializeIp65504D10BilRteL
	 */
	protected void serializeIp65504D10BilRteL(short ip65504D10BilRteL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D10BilRteL,IP_65504_D_10_BIL_RTE_L_LEN)
                  ,beginIp65504D10BilRteL
                  ,IP_65504_D_10_BIL_RTE_L_LEN
                 );
            localIp65504D10BilRteLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D10BilRteLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D10BilRteL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D10BilRteL() {	 
			return (getShort(beginIp65504D10BilRteL));
   	}
         int localIp65504D11SysTrcSCounter = -1;
         public boolean isIp65504D11SysTrcSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D11SysTrcSCounter != sharedCounter;
            localIp65504D11SysTrcSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_11_SYS_TRC_S_LEN = 2;
  	/**
	 * serializeIp65504D11SysTrcS
	 */
	protected void serializeIp65504D11SysTrcS(short ip65504D11SysTrcS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D11SysTrcS,IP_65504_D_11_SYS_TRC_S_LEN)
                  ,beginIp65504D11SysTrcS
                  ,IP_65504_D_11_SYS_TRC_S_LEN
                 );
            localIp65504D11SysTrcSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D11SysTrcSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D11SysTrcS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D11SysTrcS() {	 
			return (getShort(beginIp65504D11SysTrcS));
   	}
         int localIp65504D11SysTrcLCounter = -1;
         public boolean isIp65504D11SysTrcLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D11SysTrcLCounter != sharedCounter;
            localIp65504D11SysTrcLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_11_SYS_TRC_L_LEN = 2;
  	/**
	 * serializeIp65504D11SysTrcL
	 */
	protected void serializeIp65504D11SysTrcL(short ip65504D11SysTrcL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D11SysTrcL,IP_65504_D_11_SYS_TRC_L_LEN)
                  ,beginIp65504D11SysTrcL
                  ,IP_65504_D_11_SYS_TRC_L_LEN
                 );
            localIp65504D11SysTrcLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D11SysTrcLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D11SysTrcL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D11SysTrcL() {	 
			return (getShort(beginIp65504D11SysTrcL));
   	}
         int localIp65504D12DteTimSCounter = -1;
         public boolean isIp65504D12DteTimSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D12DteTimSCounter != sharedCounter;
            localIp65504D12DteTimSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_12_DTE_TIM_S_LEN = 2;
  	/**
	 * serializeIp65504D12DteTimS
	 */
	protected void serializeIp65504D12DteTimS(short ip65504D12DteTimS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D12DteTimS,IP_65504_D_12_DTE_TIM_S_LEN)
                  ,beginIp65504D12DteTimS
                  ,IP_65504_D_12_DTE_TIM_S_LEN
                 );
            localIp65504D12DteTimSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D12DteTimSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D12DteTimS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D12DteTimS() {	 
			return (getShort(beginIp65504D12DteTimS));
   	}
         int localIp65504D12DteTimLCounter = -1;
         public boolean isIp65504D12DteTimLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D12DteTimLCounter != sharedCounter;
            localIp65504D12DteTimLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_12_DTE_TIM_L_LEN = 2;
  	/**
	 * serializeIp65504D12DteTimL
	 */
	protected void serializeIp65504D12DteTimL(short ip65504D12DteTimL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D12DteTimL,IP_65504_D_12_DTE_TIM_L_LEN)
                  ,beginIp65504D12DteTimL
                  ,IP_65504_D_12_DTE_TIM_L_LEN
                 );
            localIp65504D12DteTimLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D12DteTimLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D12DteTimL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D12DteTimL() {	 
			return (getShort(beginIp65504D12DteTimL));
   	}
         int localIp65504D13EffDteSCounter = -1;
         public boolean isIp65504D13EffDteSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D13EffDteSCounter != sharedCounter;
            localIp65504D13EffDteSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_13_EFF_DTE_S_LEN = 2;
  	/**
	 * serializeIp65504D13EffDteS
	 */
	protected void serializeIp65504D13EffDteS(short ip65504D13EffDteS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D13EffDteS,IP_65504_D_13_EFF_DTE_S_LEN)
                  ,beginIp65504D13EffDteS
                  ,IP_65504_D_13_EFF_DTE_S_LEN
                 );
            localIp65504D13EffDteSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D13EffDteSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D13EffDteS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D13EffDteS() {	 
			return (getShort(beginIp65504D13EffDteS));
   	}
         int localIp65504D13EffDteLCounter = -1;
         public boolean isIp65504D13EffDteLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D13EffDteLCounter != sharedCounter;
            localIp65504D13EffDteLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_13_EFF_DTE_L_LEN = 2;
  	/**
	 * serializeIp65504D13EffDteL
	 */
	protected void serializeIp65504D13EffDteL(short ip65504D13EffDteL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D13EffDteL,IP_65504_D_13_EFF_DTE_L_LEN)
                  ,beginIp65504D13EffDteL
                  ,IP_65504_D_13_EFF_DTE_L_LEN
                 );
            localIp65504D13EffDteLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D13EffDteLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D13EffDteL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D13EffDteL() {	 
			return (getShort(beginIp65504D13EffDteL));
   	}
         int localIp65504D14ExpDteSCounter = -1;
         public boolean isIp65504D14ExpDteSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D14ExpDteSCounter != sharedCounter;
            localIp65504D14ExpDteSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_14_EXP_DTE_S_LEN = 2;
  	/**
	 * serializeIp65504D14ExpDteS
	 */
	protected void serializeIp65504D14ExpDteS(short ip65504D14ExpDteS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D14ExpDteS,IP_65504_D_14_EXP_DTE_S_LEN)
                  ,beginIp65504D14ExpDteS
                  ,IP_65504_D_14_EXP_DTE_S_LEN
                 );
            localIp65504D14ExpDteSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D14ExpDteSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D14ExpDteS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D14ExpDteS() {	 
			return (getShort(beginIp65504D14ExpDteS));
   	}
         int localIp65504D14ExpDteLCounter = -1;
         public boolean isIp65504D14ExpDteLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D14ExpDteLCounter != sharedCounter;
            localIp65504D14ExpDteLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_14_EXP_DTE_L_LEN = 2;
  	/**
	 * serializeIp65504D14ExpDteL
	 */
	protected void serializeIp65504D14ExpDteL(short ip65504D14ExpDteL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D14ExpDteL,IP_65504_D_14_EXP_DTE_L_LEN)
                  ,beginIp65504D14ExpDteL
                  ,IP_65504_D_14_EXP_DTE_L_LEN
                 );
            localIp65504D14ExpDteLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D14ExpDteLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D14ExpDteL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D14ExpDteL() {	 
			return (getShort(beginIp65504D14ExpDteL));
   	}
         int localIp65504D15SetDteSCounter = -1;
         public boolean isIp65504D15SetDteSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D15SetDteSCounter != sharedCounter;
            localIp65504D15SetDteSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_15_SET_DTE_S_LEN = 2;
  	/**
	 * serializeIp65504D15SetDteS
	 */
	protected void serializeIp65504D15SetDteS(short ip65504D15SetDteS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D15SetDteS,IP_65504_D_15_SET_DTE_S_LEN)
                  ,beginIp65504D15SetDteS
                  ,IP_65504_D_15_SET_DTE_S_LEN
                 );
            localIp65504D15SetDteSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D15SetDteSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D15SetDteS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D15SetDteS() {	 
			return (getShort(beginIp65504D15SetDteS));
   	}
         int localIp65504D15SetDteLCounter = -1;
         public boolean isIp65504D15SetDteLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D15SetDteLCounter != sharedCounter;
            localIp65504D15SetDteLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_15_SET_DTE_L_LEN = 2;
  	/**
	 * serializeIp65504D15SetDteL
	 */
	protected void serializeIp65504D15SetDteL(short ip65504D15SetDteL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D15SetDteL,IP_65504_D_15_SET_DTE_L_LEN)
                  ,beginIp65504D15SetDteL
                  ,IP_65504_D_15_SET_DTE_L_LEN
                 );
            localIp65504D15SetDteLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D15SetDteLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D15SetDteL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D15SetDteL() {	 
			return (getShort(beginIp65504D15SetDteL));
   	}
         int localIp65504D16CnvDteSCounter = -1;
         public boolean isIp65504D16CnvDteSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D16CnvDteSCounter != sharedCounter;
            localIp65504D16CnvDteSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_16_CNV_DTE_S_LEN = 2;
  	/**
	 * serializeIp65504D16CnvDteS
	 */
	protected void serializeIp65504D16CnvDteS(short ip65504D16CnvDteS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D16CnvDteS,IP_65504_D_16_CNV_DTE_S_LEN)
                  ,beginIp65504D16CnvDteS
                  ,IP_65504_D_16_CNV_DTE_S_LEN
                 );
            localIp65504D16CnvDteSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D16CnvDteSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D16CnvDteS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D16CnvDteS() {	 
			return (getShort(beginIp65504D16CnvDteS));
   	}
         int localIp65504D16CnvDteLCounter = -1;
         public boolean isIp65504D16CnvDteLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D16CnvDteLCounter != sharedCounter;
            localIp65504D16CnvDteLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_16_CNV_DTE_L_LEN = 2;
  	/**
	 * serializeIp65504D16CnvDteL
	 */
	protected void serializeIp65504D16CnvDteL(short ip65504D16CnvDteL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D16CnvDteL,IP_65504_D_16_CNV_DTE_L_LEN)
                  ,beginIp65504D16CnvDteL
                  ,IP_65504_D_16_CNV_DTE_L_LEN
                 );
            localIp65504D16CnvDteLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D16CnvDteLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D16CnvDteL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D16CnvDteL() {	 
			return (getShort(beginIp65504D16CnvDteL));
   	}
         int localIp65504D17CapDteSCounter = -1;
         public boolean isIp65504D17CapDteSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D17CapDteSCounter != sharedCounter;
            localIp65504D17CapDteSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_17_CAP_DTE_S_LEN = 2;
  	/**
	 * serializeIp65504D17CapDteS
	 */
	protected void serializeIp65504D17CapDteS(short ip65504D17CapDteS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D17CapDteS,IP_65504_D_17_CAP_DTE_S_LEN)
                  ,beginIp65504D17CapDteS
                  ,IP_65504_D_17_CAP_DTE_S_LEN
                 );
            localIp65504D17CapDteSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D17CapDteSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D17CapDteS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D17CapDteS() {	 
			return (getShort(beginIp65504D17CapDteS));
   	}
         int localIp65504D17CapDteLCounter = -1;
         public boolean isIp65504D17CapDteLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D17CapDteLCounter != sharedCounter;
            localIp65504D17CapDteLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_17_CAP_DTE_L_LEN = 2;
  	/**
	 * serializeIp65504D17CapDteL
	 */
	protected void serializeIp65504D17CapDteL(short ip65504D17CapDteL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D17CapDteL,IP_65504_D_17_CAP_DTE_L_LEN)
                  ,beginIp65504D17CapDteL
                  ,IP_65504_D_17_CAP_DTE_L_LEN
                 );
            localIp65504D17CapDteLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D17CapDteLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D17CapDteL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D17CapDteL() {	 
			return (getShort(beginIp65504D17CapDteL));
   	}
         int localIp65504D18MerTypSCounter = -1;
         public boolean isIp65504D18MerTypSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D18MerTypSCounter != sharedCounter;
            localIp65504D18MerTypSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_18_MER_TYP_S_LEN = 2;
  	/**
	 * serializeIp65504D18MerTypS
	 */
	protected void serializeIp65504D18MerTypS(short ip65504D18MerTypS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D18MerTypS,IP_65504_D_18_MER_TYP_S_LEN)
                  ,beginIp65504D18MerTypS
                  ,IP_65504_D_18_MER_TYP_S_LEN
                 );
            localIp65504D18MerTypSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D18MerTypSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D18MerTypS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D18MerTypS() {	 
			return (getShort(beginIp65504D18MerTypS));
   	}
         int localIp65504D18MerTypLCounter = -1;
         public boolean isIp65504D18MerTypLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D18MerTypLCounter != sharedCounter;
            localIp65504D18MerTypLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_18_MER_TYP_L_LEN = 2;
  	/**
	 * serializeIp65504D18MerTypL
	 */
	protected void serializeIp65504D18MerTypL(short ip65504D18MerTypL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D18MerTypL,IP_65504_D_18_MER_TYP_L_LEN)
                  ,beginIp65504D18MerTypL
                  ,IP_65504_D_18_MER_TYP_L_LEN
                 );
            localIp65504D18MerTypLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D18MerTypLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D18MerTypL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D18MerTypL() {	 
			return (getShort(beginIp65504D18MerTypL));
   	}
         int localIp65504D19AcqCcdSCounter = -1;
         public boolean isIp65504D19AcqCcdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D19AcqCcdSCounter != sharedCounter;
            localIp65504D19AcqCcdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_19_ACQ_CCD_S_LEN = 2;
  	/**
	 * serializeIp65504D19AcqCcdS
	 */
	protected void serializeIp65504D19AcqCcdS(short ip65504D19AcqCcdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D19AcqCcdS,IP_65504_D_19_ACQ_CCD_S_LEN)
                  ,beginIp65504D19AcqCcdS
                  ,IP_65504_D_19_ACQ_CCD_S_LEN
                 );
            localIp65504D19AcqCcdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D19AcqCcdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D19AcqCcdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D19AcqCcdS() {	 
			return (getShort(beginIp65504D19AcqCcdS));
   	}
         int localIp65504D19AcqCcdLCounter = -1;
         public boolean isIp65504D19AcqCcdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D19AcqCcdLCounter != sharedCounter;
            localIp65504D19AcqCcdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_19_ACQ_CCD_L_LEN = 2;
  	/**
	 * serializeIp65504D19AcqCcdL
	 */
	protected void serializeIp65504D19AcqCcdL(short ip65504D19AcqCcdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D19AcqCcdL,IP_65504_D_19_ACQ_CCD_L_LEN)
                  ,beginIp65504D19AcqCcdL
                  ,IP_65504_D_19_ACQ_CCD_L_LEN
                 );
            localIp65504D19AcqCcdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D19AcqCcdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D19AcqCcdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D19AcqCcdL() {	 
			return (getShort(beginIp65504D19AcqCcdL));
   	}
         int localIp65504D20PanCcdSCounter = -1;
         public boolean isIp65504D20PanCcdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D20PanCcdSCounter != sharedCounter;
            localIp65504D20PanCcdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_20_PAN_CCD_S_LEN = 2;
  	/**
	 * serializeIp65504D20PanCcdS
	 */
	protected void serializeIp65504D20PanCcdS(short ip65504D20PanCcdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D20PanCcdS,IP_65504_D_20_PAN_CCD_S_LEN)
                  ,beginIp65504D20PanCcdS
                  ,IP_65504_D_20_PAN_CCD_S_LEN
                 );
            localIp65504D20PanCcdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D20PanCcdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D20PanCcdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D20PanCcdS() {	 
			return (getShort(beginIp65504D20PanCcdS));
   	}
         int localIp65504D20PanCcdLCounter = -1;
         public boolean isIp65504D20PanCcdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D20PanCcdLCounter != sharedCounter;
            localIp65504D20PanCcdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_20_PAN_CCD_L_LEN = 2;
  	/**
	 * serializeIp65504D20PanCcdL
	 */
	protected void serializeIp65504D20PanCcdL(short ip65504D20PanCcdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D20PanCcdL,IP_65504_D_20_PAN_CCD_L_LEN)
                  ,beginIp65504D20PanCcdL
                  ,IP_65504_D_20_PAN_CCD_L_LEN
                 );
            localIp65504D20PanCcdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D20PanCcdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D20PanCcdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D20PanCcdL() {	 
			return (getShort(beginIp65504D20PanCcdL));
   	}
         int localIp65504D21FwdCcdSCounter = -1;
         public boolean isIp65504D21FwdCcdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D21FwdCcdSCounter != sharedCounter;
            localIp65504D21FwdCcdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_21_FWD_CCD_S_LEN = 2;
  	/**
	 * serializeIp65504D21FwdCcdS
	 */
	protected void serializeIp65504D21FwdCcdS(short ip65504D21FwdCcdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D21FwdCcdS,IP_65504_D_21_FWD_CCD_S_LEN)
                  ,beginIp65504D21FwdCcdS
                  ,IP_65504_D_21_FWD_CCD_S_LEN
                 );
            localIp65504D21FwdCcdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D21FwdCcdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D21FwdCcdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D21FwdCcdS() {	 
			return (getShort(beginIp65504D21FwdCcdS));
   	}
         int localIp65504D21FwdCcdLCounter = -1;
         public boolean isIp65504D21FwdCcdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D21FwdCcdLCounter != sharedCounter;
            localIp65504D21FwdCcdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_21_FWD_CCD_L_LEN = 2;
  	/**
	 * serializeIp65504D21FwdCcdL
	 */
	protected void serializeIp65504D21FwdCcdL(short ip65504D21FwdCcdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D21FwdCcdL,IP_65504_D_21_FWD_CCD_L_LEN)
                  ,beginIp65504D21FwdCcdL
                  ,IP_65504_D_21_FWD_CCD_L_LEN
                 );
            localIp65504D21FwdCcdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D21FwdCcdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D21FwdCcdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D21FwdCcdL() {	 
			return (getShort(beginIp65504D21FwdCcdL));
   	}
         int localIp65504D22PoiDcdSCounter = -1;
         public boolean isIp65504D22PoiDcdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D22PoiDcdSCounter != sharedCounter;
            localIp65504D22PoiDcdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_22_POI_DCD_S_LEN = 2;
  	/**
	 * serializeIp65504D22PoiDcdS
	 */
	protected void serializeIp65504D22PoiDcdS(short ip65504D22PoiDcdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D22PoiDcdS,IP_65504_D_22_POI_DCD_S_LEN)
                  ,beginIp65504D22PoiDcdS
                  ,IP_65504_D_22_POI_DCD_S_LEN
                 );
            localIp65504D22PoiDcdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D22PoiDcdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D22PoiDcdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D22PoiDcdS() {	 
			return (getShort(beginIp65504D22PoiDcdS));
   	}
         int localIp65504D22PoiDcdLCounter = -1;
         public boolean isIp65504D22PoiDcdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D22PoiDcdLCounter != sharedCounter;
            localIp65504D22PoiDcdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_22_POI_DCD_L_LEN = 2;
  	/**
	 * serializeIp65504D22PoiDcdL
	 */
	protected void serializeIp65504D22PoiDcdL(short ip65504D22PoiDcdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D22PoiDcdL,IP_65504_D_22_POI_DCD_L_LEN)
                  ,beginIp65504D22PoiDcdL
                  ,IP_65504_D_22_POI_DCD_L_LEN
                 );
            localIp65504D22PoiDcdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D22PoiDcdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D22PoiDcdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D22PoiDcdL() {	 
			return (getShort(beginIp65504D22PoiDcdL));
   	}
         int localIp65504D23CardSqSCounter = -1;
         public boolean isIp65504D23CardSqSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D23CardSqSCounter != sharedCounter;
            localIp65504D23CardSqSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_23_CARD_SQ_S_LEN = 2;
  	/**
	 * serializeIp65504D23CardSqS
	 */
	protected void serializeIp65504D23CardSqS(short ip65504D23CardSqS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D23CardSqS,IP_65504_D_23_CARD_SQ_S_LEN)
                  ,beginIp65504D23CardSqS
                  ,IP_65504_D_23_CARD_SQ_S_LEN
                 );
            localIp65504D23CardSqSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D23CardSqSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D23CardSqS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D23CardSqS() {	 
			return (getShort(beginIp65504D23CardSqS));
   	}
         int localIp65504D23CardSqLCounter = -1;
         public boolean isIp65504D23CardSqLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D23CardSqLCounter != sharedCounter;
            localIp65504D23CardSqLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_23_CARD_SQ_L_LEN = 2;
  	/**
	 * serializeIp65504D23CardSqL
	 */
	protected void serializeIp65504D23CardSqL(short ip65504D23CardSqL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D23CardSqL,IP_65504_D_23_CARD_SQ_L_LEN)
                  ,beginIp65504D23CardSqL
                  ,IP_65504_D_23_CARD_SQ_L_LEN
                 );
            localIp65504D23CardSqLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D23CardSqLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D23CardSqL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D23CardSqL() {	 
			return (getShort(beginIp65504D23CardSqL));
   	}
         int localIp65504D24FuncCdSCounter = -1;
         public boolean isIp65504D24FuncCdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D24FuncCdSCounter != sharedCounter;
            localIp65504D24FuncCdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_24_FUNC_CD_S_LEN = 2;
  	/**
	 * serializeIp65504D24FuncCdS
	 */
	protected void serializeIp65504D24FuncCdS(short ip65504D24FuncCdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D24FuncCdS,IP_65504_D_24_FUNC_CD_S_LEN)
                  ,beginIp65504D24FuncCdS
                  ,IP_65504_D_24_FUNC_CD_S_LEN
                 );
            localIp65504D24FuncCdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D24FuncCdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D24FuncCdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D24FuncCdS() {	 
			return (getShort(beginIp65504D24FuncCdS));
   	}
         int localIp65504D24FuncCdLCounter = -1;
         public boolean isIp65504D24FuncCdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D24FuncCdLCounter != sharedCounter;
            localIp65504D24FuncCdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_24_FUNC_CD_L_LEN = 2;
  	/**
	 * serializeIp65504D24FuncCdL
	 */
	protected void serializeIp65504D24FuncCdL(short ip65504D24FuncCdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D24FuncCdL,IP_65504_D_24_FUNC_CD_L_LEN)
                  ,beginIp65504D24FuncCdL
                  ,IP_65504_D_24_FUNC_CD_L_LEN
                 );
            localIp65504D24FuncCdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D24FuncCdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D24FuncCdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D24FuncCdL() {	 
			return (getShort(beginIp65504D24FuncCdL));
   	}
         int localIp65504D25MsgReaSCounter = -1;
         public boolean isIp65504D25MsgReaSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D25MsgReaSCounter != sharedCounter;
            localIp65504D25MsgReaSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_25_MSG_REA_S_LEN = 2;
  	/**
	 * serializeIp65504D25MsgReaS
	 */
	protected void serializeIp65504D25MsgReaS(short ip65504D25MsgReaS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D25MsgReaS,IP_65504_D_25_MSG_REA_S_LEN)
                  ,beginIp65504D25MsgReaS
                  ,IP_65504_D_25_MSG_REA_S_LEN
                 );
            localIp65504D25MsgReaSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D25MsgReaSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D25MsgReaS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D25MsgReaS() {	 
			return (getShort(beginIp65504D25MsgReaS));
   	}
         int localIp65504D25MsgReaLCounter = -1;
         public boolean isIp65504D25MsgReaLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D25MsgReaLCounter != sharedCounter;
            localIp65504D25MsgReaLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_25_MSG_REA_L_LEN = 2;
  	/**
	 * serializeIp65504D25MsgReaL
	 */
	protected void serializeIp65504D25MsgReaL(short ip65504D25MsgReaL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D25MsgReaL,IP_65504_D_25_MSG_REA_L_LEN)
                  ,beginIp65504D25MsgReaL
                  ,IP_65504_D_25_MSG_REA_L_LEN
                 );
            localIp65504D25MsgReaLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D25MsgReaLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D25MsgReaL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D25MsgReaL() {	 
			return (getShort(beginIp65504D25MsgReaL));
   	}
         int localIp65504D26MccCodSCounter = -1;
         public boolean isIp65504D26MccCodSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D26MccCodSCounter != sharedCounter;
            localIp65504D26MccCodSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_26_MCC_COD_S_LEN = 2;
  	/**
	 * serializeIp65504D26MccCodS
	 */
	protected void serializeIp65504D26MccCodS(short ip65504D26MccCodS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D26MccCodS,IP_65504_D_26_MCC_COD_S_LEN)
                  ,beginIp65504D26MccCodS
                  ,IP_65504_D_26_MCC_COD_S_LEN
                 );
            localIp65504D26MccCodSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D26MccCodSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D26MccCodS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D26MccCodS() {	 
			return (getShort(beginIp65504D26MccCodS));
   	}
         int localIp65504D26MccCodLCounter = -1;
         public boolean isIp65504D26MccCodLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D26MccCodLCounter != sharedCounter;
            localIp65504D26MccCodLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_26_MCC_COD_L_LEN = 2;
  	/**
	 * serializeIp65504D26MccCodL
	 */
	protected void serializeIp65504D26MccCodL(short ip65504D26MccCodL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D26MccCodL,IP_65504_D_26_MCC_COD_L_LEN)
                  ,beginIp65504D26MccCodL
                  ,IP_65504_D_26_MCC_COD_L_LEN
                 );
            localIp65504D26MccCodLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D26MccCodLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D26MccCodL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D26MccCodL() {	 
			return (getShort(beginIp65504D26MccCodL));
   	}
         int localIp65504D27AprCodSCounter = -1;
         public boolean isIp65504D27AprCodSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D27AprCodSCounter != sharedCounter;
            localIp65504D27AprCodSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_27_APR_COD_S_LEN = 2;
  	/**
	 * serializeIp65504D27AprCodS
	 */
	protected void serializeIp65504D27AprCodS(short ip65504D27AprCodS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D27AprCodS,IP_65504_D_27_APR_COD_S_LEN)
                  ,beginIp65504D27AprCodS
                  ,IP_65504_D_27_APR_COD_S_LEN
                 );
            localIp65504D27AprCodSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D27AprCodSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D27AprCodS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D27AprCodS() {	 
			return (getShort(beginIp65504D27AprCodS));
   	}
         int localIp65504D27AprCodLCounter = -1;
         public boolean isIp65504D27AprCodLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D27AprCodLCounter != sharedCounter;
            localIp65504D27AprCodLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_27_APR_COD_L_LEN = 2;
  	/**
	 * serializeIp65504D27AprCodL
	 */
	protected void serializeIp65504D27AprCodL(short ip65504D27AprCodL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D27AprCodL,IP_65504_D_27_APR_COD_L_LEN)
                  ,beginIp65504D27AprCodL
                  ,IP_65504_D_27_APR_COD_L_LEN
                 );
            localIp65504D27AprCodLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D27AprCodLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D27AprCodL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D27AprCodL() {	 
			return (getShort(beginIp65504D27AprCodL));
   	}
         int localIp65504D28RecDteLCounter = -1;
         public boolean isIp65504D28RecDteLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D28RecDteLCounter != sharedCounter;
            localIp65504D28RecDteLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_28_REC_DTE_L_LEN = 2;
  	/**
	 * serializeIp65504D28RecDteL
	 */
	protected void serializeIp65504D28RecDteL(short ip65504D28RecDteL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D28RecDteL,IP_65504_D_28_REC_DTE_L_LEN)
                  ,beginIp65504D28RecDteL
                  ,IP_65504_D_28_REC_DTE_L_LEN
                 );
            localIp65504D28RecDteLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D28RecDteLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D28RecDteL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D28RecDteL() {	 
			return (getShort(beginIp65504D28RecDteL));
   	}
         int localIp65504D28RecDteSCounter = -1;
         public boolean isIp65504D28RecDteSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D28RecDteSCounter != sharedCounter;
            localIp65504D28RecDteSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_28_REC_DTE_S_LEN = 2;
  	/**
	 * serializeIp65504D28RecDteS
	 */
	protected void serializeIp65504D28RecDteS(short ip65504D28RecDteS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D28RecDteS,IP_65504_D_28_REC_DTE_S_LEN)
                  ,beginIp65504D28RecDteS
                  ,IP_65504_D_28_REC_DTE_S_LEN
                 );
            localIp65504D28RecDteSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D28RecDteSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D28RecDteS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D28RecDteS() {	 
			return (getShort(beginIp65504D28RecDteS));
   	}
         int localIp65504D29RecIndSCounter = -1;
         public boolean isIp65504D29RecIndSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D29RecIndSCounter != sharedCounter;
            localIp65504D29RecIndSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_29_REC_IND_S_LEN = 2;
  	/**
	 * serializeIp65504D29RecIndS
	 */
	protected void serializeIp65504D29RecIndS(short ip65504D29RecIndS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D29RecIndS,IP_65504_D_29_REC_IND_S_LEN)
                  ,beginIp65504D29RecIndS
                  ,IP_65504_D_29_REC_IND_S_LEN
                 );
            localIp65504D29RecIndSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D29RecIndSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D29RecIndS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D29RecIndS() {	 
			return (getShort(beginIp65504D29RecIndS));
   	}
         int localIp65504D29RecIndLCounter = -1;
         public boolean isIp65504D29RecIndLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D29RecIndLCounter != sharedCounter;
            localIp65504D29RecIndLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_29_REC_IND_L_LEN = 2;
  	/**
	 * serializeIp65504D29RecIndL
	 */
	protected void serializeIp65504D29RecIndL(short ip65504D29RecIndL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D29RecIndL,IP_65504_D_29_REC_IND_L_LEN)
                  ,beginIp65504D29RecIndL
                  ,IP_65504_D_29_REC_IND_L_LEN
                 );
            localIp65504D29RecIndLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D29RecIndLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D29RecIndL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D29RecIndL() {	 
			return (getShort(beginIp65504D29RecIndL));
   	}
         int localIp65504D30OrgAmtSCounter = -1;
         public boolean isIp65504D30OrgAmtSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D30OrgAmtSCounter != sharedCounter;
            localIp65504D30OrgAmtSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_30_ORG_AMT_S_LEN = 2;
  	/**
	 * serializeIp65504D30OrgAmtS
	 */
	protected void serializeIp65504D30OrgAmtS(short ip65504D30OrgAmtS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D30OrgAmtS,IP_65504_D_30_ORG_AMT_S_LEN)
                  ,beginIp65504D30OrgAmtS
                  ,IP_65504_D_30_ORG_AMT_S_LEN
                 );
            localIp65504D30OrgAmtSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D30OrgAmtSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D30OrgAmtS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D30OrgAmtS() {	 
			return (getShort(beginIp65504D30OrgAmtS));
   	}
         int localIp65504D30OrgAmtLCounter = -1;
         public boolean isIp65504D30OrgAmtLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D30OrgAmtLCounter != sharedCounter;
            localIp65504D30OrgAmtLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_30_ORG_AMT_L_LEN = 2;
  	/**
	 * serializeIp65504D30OrgAmtL
	 */
	protected void serializeIp65504D30OrgAmtL(short ip65504D30OrgAmtL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D30OrgAmtL,IP_65504_D_30_ORG_AMT_L_LEN)
                  ,beginIp65504D30OrgAmtL
                  ,IP_65504_D_30_ORG_AMT_L_LEN
                 );
            localIp65504D30OrgAmtLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D30OrgAmtLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D30OrgAmtL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D30OrgAmtL() {	 
			return (getShort(beginIp65504D30OrgAmtL));
   	}
         int localIp65504D31AcqRefSCounter = -1;
         public boolean isIp65504D31AcqRefSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D31AcqRefSCounter != sharedCounter;
            localIp65504D31AcqRefSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_31_ACQ_REF_S_LEN = 2;
  	/**
	 * serializeIp65504D31AcqRefS
	 */
	protected void serializeIp65504D31AcqRefS(short ip65504D31AcqRefS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D31AcqRefS,IP_65504_D_31_ACQ_REF_S_LEN)
                  ,beginIp65504D31AcqRefS
                  ,IP_65504_D_31_ACQ_REF_S_LEN
                 );
            localIp65504D31AcqRefSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D31AcqRefSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D31AcqRefS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D31AcqRefS() {	 
			return (getShort(beginIp65504D31AcqRefS));
   	}
         int localIp65504D31AcqRefLCounter = -1;
         public boolean isIp65504D31AcqRefLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504D31AcqRefLCounter != sharedCounter;
            localIp65504D31AcqRefLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_D_31_ACQ_REF_L_LEN = 2;
  	/**
	 * serializeIp65504D31AcqRefL
	 */
	protected void serializeIp65504D31AcqRefL(short ip65504D31AcqRefL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504D31AcqRefL,IP_65504_D_31_ACQ_REF_L_LEN)
                  ,beginIp65504D31AcqRefL
                  ,IP_65504_D_31_ACQ_REF_L_LEN
                 );
            localIp65504D31AcqRefLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504D31AcqRefLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504D31AcqRefL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504D31AcqRefL() {	 
			return (getShort(beginIp65504D31AcqRefL));
   	}




}
  
