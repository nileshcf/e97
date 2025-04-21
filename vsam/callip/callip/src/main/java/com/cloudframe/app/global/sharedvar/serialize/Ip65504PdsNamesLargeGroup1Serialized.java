package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup1Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:55. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup1Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup1Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_1_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P001MsgMdeS;
            protected  int beginIp65504P001MsgMdeL;
            protected  int beginIp65504P002MsgIndS;
            protected  int beginIp65504P002MsgIndL;
            protected  int beginIp65504P003OrigDtS;
            protected  int beginIp65504P003OrigDtL;
            protected  int beginIp65504P004NtwkAcS;
            protected  int beginIp65504P004NtwkAcL;
            protected  int beginIp65504P005MsgeridS;
            protected  int beginIp65504P005MsgeridL;
            protected  int beginIp65504P006ReservdS;
            protected  int beginIp65504P006ReservdL;
            protected  int beginIp65504P007ReservdS;
            protected  int beginIp65504P007ReservdL;
            protected  int beginIp65504P008ReservdS;
            protected  int beginIp65504P008ReservdL;
            protected  int beginIp65504P009ReservdS;
            protected  int beginIp65504P009ReservdL;
            protected  int beginIp65504P010ReservdS;
            protected  int beginIp65504P010ReservdL;
            protected  int beginIp65504P011ReservdS;
            protected  int beginIp65504P011ReservdL;
            protected  int beginIp65504P012ReservdS;
            protected  int beginIp65504P012ReservdL;
            protected  int beginIp65504P013PasswrdS;
            protected  int beginIp65504P013PasswrdL;
            protected  int beginIp65504P014ReservdS;
            protected  int beginIp65504P014ReservdL;
            protected  int beginIp65504P015ReservdS;
            protected  int beginIp65504P015ReservdL;
            protected  int beginIp65504P016TrxRefS;
            protected  int beginIp65504P016TrxRefL;
            protected  int beginIp65504P017ReservdS;
            protected  int beginIp65504P017ReservdL;
            protected  int beginIp65504P018ReservdS;
            protected  int beginIp65504P018ReservdL;
            protected  int beginIp65504P019ReservdS;
            protected  int beginIp65504P019ReservdL;
            protected  int beginIp65504P020IccreffS;
            protected  int beginIp65504P020IccreffL;
            protected  int beginIp65504P021IccrpctS;
            protected  int beginIp65504P021IccrpctL;
            protected  int beginIp65504P022RecurpyS;
            protected  int beginIp65504P022RecurpyL;
            protected  int beginIp65504P023TermTpS;
            protected  int beginIp65504P023TermTpL;
            protected  int beginIp65504P024NwkMngS;
            protected  int beginIp65504P024NwkMngL;
            protected  int beginIp65504P025RevIndS;
            protected  int beginIp65504P025RevIndL;
            protected  int beginIp65504P026FrevIndS;
            protected  int beginIp65504P026FrevIndL;
            protected  int beginIp65504P027ReservdS;
            protected  int beginIp65504P027ReservdL;
            protected  int beginIp65504P028ReservdS;
            protected  int beginIp65504P028ReservdL;
            protected  int beginIp65504P029ReservdS;
            protected  int beginIp65504P029ReservdL;
            protected  int beginIp65504P030ReservdS;
            protected  int beginIp65504P030ReservdL;
            protected  int beginIp65504P031ReservdS;
            protected  int beginIp65504P031ReservdL;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup1Serialized
	**/
    public Ip65504PdsNamesLargeGroup1Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup1Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup1Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup1Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup1Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup1Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_1_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P001MsgMdeS = getStartOffset() + 0;	// set offset for serialization
  
             beginIp65504P001MsgMdeL = getStartOffset() + 2;	// set offset for serialization
  
  
             beginIp65504P002MsgIndS = getStartOffset() + 8;	// set offset for serialization
  
             beginIp65504P002MsgIndL = getStartOffset() + 10;	// set offset for serialization
  
  
             beginIp65504P003OrigDtS = getStartOffset() + 16;	// set offset for serialization
  
             beginIp65504P003OrigDtL = getStartOffset() + 18;	// set offset for serialization
  
  
             beginIp65504P004NtwkAcS = getStartOffset() + 24;	// set offset for serialization
  
             beginIp65504P004NtwkAcL = getStartOffset() + 26;	// set offset for serialization
  
  
             beginIp65504P005MsgeridS = getStartOffset() + 32;	// set offset for serialization
  
             beginIp65504P005MsgeridL = getStartOffset() + 34;	// set offset for serialization
  
  
             beginIp65504P006ReservdS = getStartOffset() + 40;	// set offset for serialization
  
             beginIp65504P006ReservdL = getStartOffset() + 42;	// set offset for serialization
  
  
             beginIp65504P007ReservdS = getStartOffset() + 48;	// set offset for serialization
  
             beginIp65504P007ReservdL = getStartOffset() + 50;	// set offset for serialization
  
  
             beginIp65504P008ReservdS = getStartOffset() + 56;	// set offset for serialization
  
             beginIp65504P008ReservdL = getStartOffset() + 58;	// set offset for serialization
  
  
             beginIp65504P009ReservdS = getStartOffset() + 64;	// set offset for serialization
  
             beginIp65504P009ReservdL = getStartOffset() + 66;	// set offset for serialization
  
  
             beginIp65504P010ReservdS = getStartOffset() + 72;	// set offset for serialization
  
             beginIp65504P010ReservdL = getStartOffset() + 74;	// set offset for serialization
  
  
             beginIp65504P011ReservdS = getStartOffset() + 80;	// set offset for serialization
  
             beginIp65504P011ReservdL = getStartOffset() + 82;	// set offset for serialization
  
  
             beginIp65504P012ReservdS = getStartOffset() + 88;	// set offset for serialization
  
             beginIp65504P012ReservdL = getStartOffset() + 90;	// set offset for serialization
  
  
             beginIp65504P013PasswrdS = getStartOffset() + 96;	// set offset for serialization
  
             beginIp65504P013PasswrdL = getStartOffset() + 98;	// set offset for serialization
  
  
             beginIp65504P014ReservdS = getStartOffset() + 104;	// set offset for serialization
  
             beginIp65504P014ReservdL = getStartOffset() + 106;	// set offset for serialization
  
  
             beginIp65504P015ReservdS = getStartOffset() + 112;	// set offset for serialization
  
             beginIp65504P015ReservdL = getStartOffset() + 114;	// set offset for serialization
  
  
             beginIp65504P016TrxRefS = getStartOffset() + 120;	// set offset for serialization
  
             beginIp65504P016TrxRefL = getStartOffset() + 122;	// set offset for serialization
  
  
             beginIp65504P017ReservdS = getStartOffset() + 128;	// set offset for serialization
  
             beginIp65504P017ReservdL = getStartOffset() + 130;	// set offset for serialization
  
  
             beginIp65504P018ReservdS = getStartOffset() + 136;	// set offset for serialization
  
             beginIp65504P018ReservdL = getStartOffset() + 138;	// set offset for serialization
  
  
             beginIp65504P019ReservdS = getStartOffset() + 144;	// set offset for serialization
  
             beginIp65504P019ReservdL = getStartOffset() + 146;	// set offset for serialization
  
  
             beginIp65504P020IccreffS = getStartOffset() + 152;	// set offset for serialization
  
             beginIp65504P020IccreffL = getStartOffset() + 154;	// set offset for serialization
  
  
             beginIp65504P021IccrpctS = getStartOffset() + 160;	// set offset for serialization
  
             beginIp65504P021IccrpctL = getStartOffset() + 162;	// set offset for serialization
  
  
             beginIp65504P022RecurpyS = getStartOffset() + 168;	// set offset for serialization
  
             beginIp65504P022RecurpyL = getStartOffset() + 170;	// set offset for serialization
  
  
             beginIp65504P023TermTpS = getStartOffset() + 176;	// set offset for serialization
  
             beginIp65504P023TermTpL = getStartOffset() + 178;	// set offset for serialization
  
  
             beginIp65504P024NwkMngS = getStartOffset() + 184;	// set offset for serialization
  
             beginIp65504P024NwkMngL = getStartOffset() + 186;	// set offset for serialization
  
  
             beginIp65504P025RevIndS = getStartOffset() + 192;	// set offset for serialization
  
             beginIp65504P025RevIndL = getStartOffset() + 194;	// set offset for serialization
  
  
             beginIp65504P026FrevIndS = getStartOffset() + 200;	// set offset for serialization
  
             beginIp65504P026FrevIndL = getStartOffset() + 202;	// set offset for serialization
  
  
             beginIp65504P027ReservdS = getStartOffset() + 208;	// set offset for serialization
  
             beginIp65504P027ReservdL = getStartOffset() + 210;	// set offset for serialization
  
  
             beginIp65504P028ReservdS = getStartOffset() + 216;	// set offset for serialization
  
             beginIp65504P028ReservdL = getStartOffset() + 218;	// set offset for serialization
  
  
             beginIp65504P029ReservdS = getStartOffset() + 224;	// set offset for serialization
  
             beginIp65504P029ReservdL = getStartOffset() + 226;	// set offset for serialization
  
  
             beginIp65504P030ReservdS = getStartOffset() + 232;	// set offset for serialization
  
             beginIp65504P030ReservdL = getStartOffset() + 234;	// set offset for serialization
  
  
             beginIp65504P031ReservdS = getStartOffset() + 240;	// set offset for serialization
  
             beginIp65504P031ReservdL = getStartOffset() + 242;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P001MsgMdeSCounter = -1;
         public boolean isIp65504P001MsgMdeSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P001MsgMdeSCounter != sharedCounter;
            localIp65504P001MsgMdeSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_001_MSG_MDE_S_LEN = 2;
  	/**
	 * serializeIp65504P001MsgMdeS
	 */
	protected void serializeIp65504P001MsgMdeS(short ip65504P001MsgMdeS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P001MsgMdeS,IP_65504_P_001_MSG_MDE_S_LEN)
                  ,beginIp65504P001MsgMdeS
                  ,IP_65504_P_001_MSG_MDE_S_LEN
                 );
            localIp65504P001MsgMdeSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P001MsgMdeSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P001MsgMdeS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P001MsgMdeS() {	 
			return (getShort(beginIp65504P001MsgMdeS));
   	}
         int localIp65504P001MsgMdeLCounter = -1;
         public boolean isIp65504P001MsgMdeLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P001MsgMdeLCounter != sharedCounter;
            localIp65504P001MsgMdeLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_001_MSG_MDE_L_LEN = 2;
  	/**
	 * serializeIp65504P001MsgMdeL
	 */
	protected void serializeIp65504P001MsgMdeL(short ip65504P001MsgMdeL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P001MsgMdeL,IP_65504_P_001_MSG_MDE_L_LEN)
                  ,beginIp65504P001MsgMdeL
                  ,IP_65504_P_001_MSG_MDE_L_LEN
                 );
            localIp65504P001MsgMdeLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P001MsgMdeLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P001MsgMdeL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P001MsgMdeL() {	 
			return (getShort(beginIp65504P001MsgMdeL));
   	}
         int localIp65504P002MsgIndSCounter = -1;
         public boolean isIp65504P002MsgIndSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P002MsgIndSCounter != sharedCounter;
            localIp65504P002MsgIndSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_002_MSG_IND_S_LEN = 2;
  	/**
	 * serializeIp65504P002MsgIndS
	 */
	protected void serializeIp65504P002MsgIndS(short ip65504P002MsgIndS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P002MsgIndS,IP_65504_P_002_MSG_IND_S_LEN)
                  ,beginIp65504P002MsgIndS
                  ,IP_65504_P_002_MSG_IND_S_LEN
                 );
            localIp65504P002MsgIndSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P002MsgIndSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P002MsgIndS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P002MsgIndS() {	 
			return (getShort(beginIp65504P002MsgIndS));
   	}
         int localIp65504P002MsgIndLCounter = -1;
         public boolean isIp65504P002MsgIndLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P002MsgIndLCounter != sharedCounter;
            localIp65504P002MsgIndLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_002_MSG_IND_L_LEN = 2;
  	/**
	 * serializeIp65504P002MsgIndL
	 */
	protected void serializeIp65504P002MsgIndL(short ip65504P002MsgIndL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P002MsgIndL,IP_65504_P_002_MSG_IND_L_LEN)
                  ,beginIp65504P002MsgIndL
                  ,IP_65504_P_002_MSG_IND_L_LEN
                 );
            localIp65504P002MsgIndLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P002MsgIndLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P002MsgIndL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P002MsgIndL() {	 
			return (getShort(beginIp65504P002MsgIndL));
   	}
         int localIp65504P003OrigDtSCounter = -1;
         public boolean isIp65504P003OrigDtSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P003OrigDtSCounter != sharedCounter;
            localIp65504P003OrigDtSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_003_ORIG_DT_S_LEN = 2;
  	/**
	 * serializeIp65504P003OrigDtS
	 */
	protected void serializeIp65504P003OrigDtS(short ip65504P003OrigDtS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P003OrigDtS,IP_65504_P_003_ORIG_DT_S_LEN)
                  ,beginIp65504P003OrigDtS
                  ,IP_65504_P_003_ORIG_DT_S_LEN
                 );
            localIp65504P003OrigDtSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P003OrigDtSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P003OrigDtS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P003OrigDtS() {	 
			return (getShort(beginIp65504P003OrigDtS));
   	}
         int localIp65504P003OrigDtLCounter = -1;
         public boolean isIp65504P003OrigDtLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P003OrigDtLCounter != sharedCounter;
            localIp65504P003OrigDtLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_003_ORIG_DT_L_LEN = 2;
  	/**
	 * serializeIp65504P003OrigDtL
	 */
	protected void serializeIp65504P003OrigDtL(short ip65504P003OrigDtL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P003OrigDtL,IP_65504_P_003_ORIG_DT_L_LEN)
                  ,beginIp65504P003OrigDtL
                  ,IP_65504_P_003_ORIG_DT_L_LEN
                 );
            localIp65504P003OrigDtLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P003OrigDtLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P003OrigDtL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P003OrigDtL() {	 
			return (getShort(beginIp65504P003OrigDtL));
   	}
         int localIp65504P004NtwkAcSCounter = -1;
         public boolean isIp65504P004NtwkAcSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P004NtwkAcSCounter != sharedCounter;
            localIp65504P004NtwkAcSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_004_NTWK_AC_S_LEN = 2;
  	/**
	 * serializeIp65504P004NtwkAcS
	 */
	protected void serializeIp65504P004NtwkAcS(short ip65504P004NtwkAcS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P004NtwkAcS,IP_65504_P_004_NTWK_AC_S_LEN)
                  ,beginIp65504P004NtwkAcS
                  ,IP_65504_P_004_NTWK_AC_S_LEN
                 );
            localIp65504P004NtwkAcSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P004NtwkAcSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P004NtwkAcS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P004NtwkAcS() {	 
			return (getShort(beginIp65504P004NtwkAcS));
   	}
         int localIp65504P004NtwkAcLCounter = -1;
         public boolean isIp65504P004NtwkAcLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P004NtwkAcLCounter != sharedCounter;
            localIp65504P004NtwkAcLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_004_NTWK_AC_L_LEN = 2;
  	/**
	 * serializeIp65504P004NtwkAcL
	 */
	protected void serializeIp65504P004NtwkAcL(short ip65504P004NtwkAcL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P004NtwkAcL,IP_65504_P_004_NTWK_AC_L_LEN)
                  ,beginIp65504P004NtwkAcL
                  ,IP_65504_P_004_NTWK_AC_L_LEN
                 );
            localIp65504P004NtwkAcLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P004NtwkAcLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P004NtwkAcL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P004NtwkAcL() {	 
			return (getShort(beginIp65504P004NtwkAcL));
   	}
         int localIp65504P005MsgeridSCounter = -1;
         public boolean isIp65504P005MsgeridSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P005MsgeridSCounter != sharedCounter;
            localIp65504P005MsgeridSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_005_MSGERID_S_LEN = 2;
  	/**
	 * serializeIp65504P005MsgeridS
	 */
	protected void serializeIp65504P005MsgeridS(short ip65504P005MsgeridS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P005MsgeridS,IP_65504_P_005_MSGERID_S_LEN)
                  ,beginIp65504P005MsgeridS
                  ,IP_65504_P_005_MSGERID_S_LEN
                 );
            localIp65504P005MsgeridSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P005MsgeridSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P005MsgeridS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P005MsgeridS() {	 
			return (getShort(beginIp65504P005MsgeridS));
   	}
         int localIp65504P005MsgeridLCounter = -1;
         public boolean isIp65504P005MsgeridLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P005MsgeridLCounter != sharedCounter;
            localIp65504P005MsgeridLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_005_MSGERID_L_LEN = 2;
  	/**
	 * serializeIp65504P005MsgeridL
	 */
	protected void serializeIp65504P005MsgeridL(short ip65504P005MsgeridL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P005MsgeridL,IP_65504_P_005_MSGERID_L_LEN)
                  ,beginIp65504P005MsgeridL
                  ,IP_65504_P_005_MSGERID_L_LEN
                 );
            localIp65504P005MsgeridLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P005MsgeridLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P005MsgeridL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P005MsgeridL() {	 
			return (getShort(beginIp65504P005MsgeridL));
   	}
         int localIp65504P006ReservdSCounter = -1;
         public boolean isIp65504P006ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P006ReservdSCounter != sharedCounter;
            localIp65504P006ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_006_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P006ReservdS
	 */
	protected void serializeIp65504P006ReservdS(short ip65504P006ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P006ReservdS,IP_65504_P_006_RESERVD_S_LEN)
                  ,beginIp65504P006ReservdS
                  ,IP_65504_P_006_RESERVD_S_LEN
                 );
            localIp65504P006ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P006ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P006ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P006ReservdS() {	 
			return (getShort(beginIp65504P006ReservdS));
   	}
         int localIp65504P006ReservdLCounter = -1;
         public boolean isIp65504P006ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P006ReservdLCounter != sharedCounter;
            localIp65504P006ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_006_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P006ReservdL
	 */
	protected void serializeIp65504P006ReservdL(short ip65504P006ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P006ReservdL,IP_65504_P_006_RESERVD_L_LEN)
                  ,beginIp65504P006ReservdL
                  ,IP_65504_P_006_RESERVD_L_LEN
                 );
            localIp65504P006ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P006ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P006ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P006ReservdL() {	 
			return (getShort(beginIp65504P006ReservdL));
   	}
         int localIp65504P007ReservdSCounter = -1;
         public boolean isIp65504P007ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P007ReservdSCounter != sharedCounter;
            localIp65504P007ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_007_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P007ReservdS
	 */
	protected void serializeIp65504P007ReservdS(short ip65504P007ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P007ReservdS,IP_65504_P_007_RESERVD_S_LEN)
                  ,beginIp65504P007ReservdS
                  ,IP_65504_P_007_RESERVD_S_LEN
                 );
            localIp65504P007ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P007ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P007ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P007ReservdS() {	 
			return (getShort(beginIp65504P007ReservdS));
   	}
         int localIp65504P007ReservdLCounter = -1;
         public boolean isIp65504P007ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P007ReservdLCounter != sharedCounter;
            localIp65504P007ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_007_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P007ReservdL
	 */
	protected void serializeIp65504P007ReservdL(short ip65504P007ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P007ReservdL,IP_65504_P_007_RESERVD_L_LEN)
                  ,beginIp65504P007ReservdL
                  ,IP_65504_P_007_RESERVD_L_LEN
                 );
            localIp65504P007ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P007ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P007ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P007ReservdL() {	 
			return (getShort(beginIp65504P007ReservdL));
   	}
         int localIp65504P008ReservdSCounter = -1;
         public boolean isIp65504P008ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P008ReservdSCounter != sharedCounter;
            localIp65504P008ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_008_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P008ReservdS
	 */
	protected void serializeIp65504P008ReservdS(short ip65504P008ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P008ReservdS,IP_65504_P_008_RESERVD_S_LEN)
                  ,beginIp65504P008ReservdS
                  ,IP_65504_P_008_RESERVD_S_LEN
                 );
            localIp65504P008ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P008ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P008ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P008ReservdS() {	 
			return (getShort(beginIp65504P008ReservdS));
   	}
         int localIp65504P008ReservdLCounter = -1;
         public boolean isIp65504P008ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P008ReservdLCounter != sharedCounter;
            localIp65504P008ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_008_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P008ReservdL
	 */
	protected void serializeIp65504P008ReservdL(short ip65504P008ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P008ReservdL,IP_65504_P_008_RESERVD_L_LEN)
                  ,beginIp65504P008ReservdL
                  ,IP_65504_P_008_RESERVD_L_LEN
                 );
            localIp65504P008ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P008ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P008ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P008ReservdL() {	 
			return (getShort(beginIp65504P008ReservdL));
   	}
         int localIp65504P009ReservdSCounter = -1;
         public boolean isIp65504P009ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P009ReservdSCounter != sharedCounter;
            localIp65504P009ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_009_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P009ReservdS
	 */
	protected void serializeIp65504P009ReservdS(short ip65504P009ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P009ReservdS,IP_65504_P_009_RESERVD_S_LEN)
                  ,beginIp65504P009ReservdS
                  ,IP_65504_P_009_RESERVD_S_LEN
                 );
            localIp65504P009ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P009ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P009ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P009ReservdS() {	 
			return (getShort(beginIp65504P009ReservdS));
   	}
         int localIp65504P009ReservdLCounter = -1;
         public boolean isIp65504P009ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P009ReservdLCounter != sharedCounter;
            localIp65504P009ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_009_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P009ReservdL
	 */
	protected void serializeIp65504P009ReservdL(short ip65504P009ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P009ReservdL,IP_65504_P_009_RESERVD_L_LEN)
                  ,beginIp65504P009ReservdL
                  ,IP_65504_P_009_RESERVD_L_LEN
                 );
            localIp65504P009ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P009ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P009ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P009ReservdL() {	 
			return (getShort(beginIp65504P009ReservdL));
   	}
         int localIp65504P010ReservdSCounter = -1;
         public boolean isIp65504P010ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P010ReservdSCounter != sharedCounter;
            localIp65504P010ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_010_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P010ReservdS
	 */
	protected void serializeIp65504P010ReservdS(short ip65504P010ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P010ReservdS,IP_65504_P_010_RESERVD_S_LEN)
                  ,beginIp65504P010ReservdS
                  ,IP_65504_P_010_RESERVD_S_LEN
                 );
            localIp65504P010ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P010ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P010ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P010ReservdS() {	 
			return (getShort(beginIp65504P010ReservdS));
   	}
         int localIp65504P010ReservdLCounter = -1;
         public boolean isIp65504P010ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P010ReservdLCounter != sharedCounter;
            localIp65504P010ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_010_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P010ReservdL
	 */
	protected void serializeIp65504P010ReservdL(short ip65504P010ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P010ReservdL,IP_65504_P_010_RESERVD_L_LEN)
                  ,beginIp65504P010ReservdL
                  ,IP_65504_P_010_RESERVD_L_LEN
                 );
            localIp65504P010ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P010ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P010ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P010ReservdL() {	 
			return (getShort(beginIp65504P010ReservdL));
   	}
         int localIp65504P011ReservdSCounter = -1;
         public boolean isIp65504P011ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P011ReservdSCounter != sharedCounter;
            localIp65504P011ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_011_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P011ReservdS
	 */
	protected void serializeIp65504P011ReservdS(short ip65504P011ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P011ReservdS,IP_65504_P_011_RESERVD_S_LEN)
                  ,beginIp65504P011ReservdS
                  ,IP_65504_P_011_RESERVD_S_LEN
                 );
            localIp65504P011ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P011ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P011ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P011ReservdS() {	 
			return (getShort(beginIp65504P011ReservdS));
   	}
         int localIp65504P011ReservdLCounter = -1;
         public boolean isIp65504P011ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P011ReservdLCounter != sharedCounter;
            localIp65504P011ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_011_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P011ReservdL
	 */
	protected void serializeIp65504P011ReservdL(short ip65504P011ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P011ReservdL,IP_65504_P_011_RESERVD_L_LEN)
                  ,beginIp65504P011ReservdL
                  ,IP_65504_P_011_RESERVD_L_LEN
                 );
            localIp65504P011ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P011ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P011ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P011ReservdL() {	 
			return (getShort(beginIp65504P011ReservdL));
   	}
         int localIp65504P012ReservdSCounter = -1;
         public boolean isIp65504P012ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P012ReservdSCounter != sharedCounter;
            localIp65504P012ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_012_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P012ReservdS
	 */
	protected void serializeIp65504P012ReservdS(short ip65504P012ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P012ReservdS,IP_65504_P_012_RESERVD_S_LEN)
                  ,beginIp65504P012ReservdS
                  ,IP_65504_P_012_RESERVD_S_LEN
                 );
            localIp65504P012ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P012ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P012ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P012ReservdS() {	 
			return (getShort(beginIp65504P012ReservdS));
   	}
         int localIp65504P012ReservdLCounter = -1;
         public boolean isIp65504P012ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P012ReservdLCounter != sharedCounter;
            localIp65504P012ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_012_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P012ReservdL
	 */
	protected void serializeIp65504P012ReservdL(short ip65504P012ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P012ReservdL,IP_65504_P_012_RESERVD_L_LEN)
                  ,beginIp65504P012ReservdL
                  ,IP_65504_P_012_RESERVD_L_LEN
                 );
            localIp65504P012ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P012ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P012ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P012ReservdL() {	 
			return (getShort(beginIp65504P012ReservdL));
   	}
         int localIp65504P013PasswrdSCounter = -1;
         public boolean isIp65504P013PasswrdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P013PasswrdSCounter != sharedCounter;
            localIp65504P013PasswrdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_013_PASSWRD_S_LEN = 2;
  	/**
	 * serializeIp65504P013PasswrdS
	 */
	protected void serializeIp65504P013PasswrdS(short ip65504P013PasswrdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P013PasswrdS,IP_65504_P_013_PASSWRD_S_LEN)
                  ,beginIp65504P013PasswrdS
                  ,IP_65504_P_013_PASSWRD_S_LEN
                 );
            localIp65504P013PasswrdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P013PasswrdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P013PasswrdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P013PasswrdS() {	 
			return (getShort(beginIp65504P013PasswrdS));
   	}
         int localIp65504P013PasswrdLCounter = -1;
         public boolean isIp65504P013PasswrdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P013PasswrdLCounter != sharedCounter;
            localIp65504P013PasswrdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_013_PASSWRD_L_LEN = 2;
  	/**
	 * serializeIp65504P013PasswrdL
	 */
	protected void serializeIp65504P013PasswrdL(short ip65504P013PasswrdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P013PasswrdL,IP_65504_P_013_PASSWRD_L_LEN)
                  ,beginIp65504P013PasswrdL
                  ,IP_65504_P_013_PASSWRD_L_LEN
                 );
            localIp65504P013PasswrdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P013PasswrdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P013PasswrdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P013PasswrdL() {	 
			return (getShort(beginIp65504P013PasswrdL));
   	}
         int localIp65504P014ReservdSCounter = -1;
         public boolean isIp65504P014ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P014ReservdSCounter != sharedCounter;
            localIp65504P014ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_014_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P014ReservdS
	 */
	protected void serializeIp65504P014ReservdS(short ip65504P014ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P014ReservdS,IP_65504_P_014_RESERVD_S_LEN)
                  ,beginIp65504P014ReservdS
                  ,IP_65504_P_014_RESERVD_S_LEN
                 );
            localIp65504P014ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P014ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P014ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P014ReservdS() {	 
			return (getShort(beginIp65504P014ReservdS));
   	}
         int localIp65504P014ReservdLCounter = -1;
         public boolean isIp65504P014ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P014ReservdLCounter != sharedCounter;
            localIp65504P014ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_014_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P014ReservdL
	 */
	protected void serializeIp65504P014ReservdL(short ip65504P014ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P014ReservdL,IP_65504_P_014_RESERVD_L_LEN)
                  ,beginIp65504P014ReservdL
                  ,IP_65504_P_014_RESERVD_L_LEN
                 );
            localIp65504P014ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P014ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P014ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P014ReservdL() {	 
			return (getShort(beginIp65504P014ReservdL));
   	}
         int localIp65504P015ReservdSCounter = -1;
         public boolean isIp65504P015ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P015ReservdSCounter != sharedCounter;
            localIp65504P015ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_015_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P015ReservdS
	 */
	protected void serializeIp65504P015ReservdS(short ip65504P015ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P015ReservdS,IP_65504_P_015_RESERVD_S_LEN)
                  ,beginIp65504P015ReservdS
                  ,IP_65504_P_015_RESERVD_S_LEN
                 );
            localIp65504P015ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P015ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P015ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P015ReservdS() {	 
			return (getShort(beginIp65504P015ReservdS));
   	}
         int localIp65504P015ReservdLCounter = -1;
         public boolean isIp65504P015ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P015ReservdLCounter != sharedCounter;
            localIp65504P015ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_015_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P015ReservdL
	 */
	protected void serializeIp65504P015ReservdL(short ip65504P015ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P015ReservdL,IP_65504_P_015_RESERVD_L_LEN)
                  ,beginIp65504P015ReservdL
                  ,IP_65504_P_015_RESERVD_L_LEN
                 );
            localIp65504P015ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P015ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P015ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P015ReservdL() {	 
			return (getShort(beginIp65504P015ReservdL));
   	}
         int localIp65504P016TrxRefSCounter = -1;
         public boolean isIp65504P016TrxRefSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P016TrxRefSCounter != sharedCounter;
            localIp65504P016TrxRefSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_016_TRX_REF_S_LEN = 2;
  	/**
	 * serializeIp65504P016TrxRefS
	 */
	protected void serializeIp65504P016TrxRefS(short ip65504P016TrxRefS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P016TrxRefS,IP_65504_P_016_TRX_REF_S_LEN)
                  ,beginIp65504P016TrxRefS
                  ,IP_65504_P_016_TRX_REF_S_LEN
                 );
            localIp65504P016TrxRefSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P016TrxRefSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P016TrxRefS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P016TrxRefS() {	 
			return (getShort(beginIp65504P016TrxRefS));
   	}
         int localIp65504P016TrxRefLCounter = -1;
         public boolean isIp65504P016TrxRefLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P016TrxRefLCounter != sharedCounter;
            localIp65504P016TrxRefLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_016_TRX_REF_L_LEN = 2;
  	/**
	 * serializeIp65504P016TrxRefL
	 */
	protected void serializeIp65504P016TrxRefL(short ip65504P016TrxRefL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P016TrxRefL,IP_65504_P_016_TRX_REF_L_LEN)
                  ,beginIp65504P016TrxRefL
                  ,IP_65504_P_016_TRX_REF_L_LEN
                 );
            localIp65504P016TrxRefLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P016TrxRefLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P016TrxRefL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P016TrxRefL() {	 
			return (getShort(beginIp65504P016TrxRefL));
   	}
         int localIp65504P017ReservdSCounter = -1;
         public boolean isIp65504P017ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P017ReservdSCounter != sharedCounter;
            localIp65504P017ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_017_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P017ReservdS
	 */
	protected void serializeIp65504P017ReservdS(short ip65504P017ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P017ReservdS,IP_65504_P_017_RESERVD_S_LEN)
                  ,beginIp65504P017ReservdS
                  ,IP_65504_P_017_RESERVD_S_LEN
                 );
            localIp65504P017ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P017ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P017ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P017ReservdS() {	 
			return (getShort(beginIp65504P017ReservdS));
   	}
         int localIp65504P017ReservdLCounter = -1;
         public boolean isIp65504P017ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P017ReservdLCounter != sharedCounter;
            localIp65504P017ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_017_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P017ReservdL
	 */
	protected void serializeIp65504P017ReservdL(short ip65504P017ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P017ReservdL,IP_65504_P_017_RESERVD_L_LEN)
                  ,beginIp65504P017ReservdL
                  ,IP_65504_P_017_RESERVD_L_LEN
                 );
            localIp65504P017ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P017ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P017ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P017ReservdL() {	 
			return (getShort(beginIp65504P017ReservdL));
   	}
         int localIp65504P018ReservdSCounter = -1;
         public boolean isIp65504P018ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P018ReservdSCounter != sharedCounter;
            localIp65504P018ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_018_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P018ReservdS
	 */
	protected void serializeIp65504P018ReservdS(short ip65504P018ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P018ReservdS,IP_65504_P_018_RESERVD_S_LEN)
                  ,beginIp65504P018ReservdS
                  ,IP_65504_P_018_RESERVD_S_LEN
                 );
            localIp65504P018ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P018ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P018ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P018ReservdS() {	 
			return (getShort(beginIp65504P018ReservdS));
   	}
         int localIp65504P018ReservdLCounter = -1;
         public boolean isIp65504P018ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P018ReservdLCounter != sharedCounter;
            localIp65504P018ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_018_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P018ReservdL
	 */
	protected void serializeIp65504P018ReservdL(short ip65504P018ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P018ReservdL,IP_65504_P_018_RESERVD_L_LEN)
                  ,beginIp65504P018ReservdL
                  ,IP_65504_P_018_RESERVD_L_LEN
                 );
            localIp65504P018ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P018ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P018ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P018ReservdL() {	 
			return (getShort(beginIp65504P018ReservdL));
   	}
         int localIp65504P019ReservdSCounter = -1;
         public boolean isIp65504P019ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P019ReservdSCounter != sharedCounter;
            localIp65504P019ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_019_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P019ReservdS
	 */
	protected void serializeIp65504P019ReservdS(short ip65504P019ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P019ReservdS,IP_65504_P_019_RESERVD_S_LEN)
                  ,beginIp65504P019ReservdS
                  ,IP_65504_P_019_RESERVD_S_LEN
                 );
            localIp65504P019ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P019ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P019ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P019ReservdS() {	 
			return (getShort(beginIp65504P019ReservdS));
   	}
         int localIp65504P019ReservdLCounter = -1;
         public boolean isIp65504P019ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P019ReservdLCounter != sharedCounter;
            localIp65504P019ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_019_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P019ReservdL
	 */
	protected void serializeIp65504P019ReservdL(short ip65504P019ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P019ReservdL,IP_65504_P_019_RESERVD_L_LEN)
                  ,beginIp65504P019ReservdL
                  ,IP_65504_P_019_RESERVD_L_LEN
                 );
            localIp65504P019ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P019ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P019ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P019ReservdL() {	 
			return (getShort(beginIp65504P019ReservdL));
   	}
         int localIp65504P020IccreffSCounter = -1;
         public boolean isIp65504P020IccreffSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P020IccreffSCounter != sharedCounter;
            localIp65504P020IccreffSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_020_ICCREFF_S_LEN = 2;
  	/**
	 * serializeIp65504P020IccreffS
	 */
	protected void serializeIp65504P020IccreffS(short ip65504P020IccreffS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P020IccreffS,IP_65504_P_020_ICCREFF_S_LEN)
                  ,beginIp65504P020IccreffS
                  ,IP_65504_P_020_ICCREFF_S_LEN
                 );
            localIp65504P020IccreffSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P020IccreffSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P020IccreffS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P020IccreffS() {	 
			return (getShort(beginIp65504P020IccreffS));
   	}
         int localIp65504P020IccreffLCounter = -1;
         public boolean isIp65504P020IccreffLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P020IccreffLCounter != sharedCounter;
            localIp65504P020IccreffLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_020_ICCREFF_L_LEN = 2;
  	/**
	 * serializeIp65504P020IccreffL
	 */
	protected void serializeIp65504P020IccreffL(short ip65504P020IccreffL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P020IccreffL,IP_65504_P_020_ICCREFF_L_LEN)
                  ,beginIp65504P020IccreffL
                  ,IP_65504_P_020_ICCREFF_L_LEN
                 );
            localIp65504P020IccreffLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P020IccreffLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P020IccreffL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P020IccreffL() {	 
			return (getShort(beginIp65504P020IccreffL));
   	}
         int localIp65504P021IccrpctSCounter = -1;
         public boolean isIp65504P021IccrpctSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P021IccrpctSCounter != sharedCounter;
            localIp65504P021IccrpctSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_021_ICCRPCT_S_LEN = 2;
  	/**
	 * serializeIp65504P021IccrpctS
	 */
	protected void serializeIp65504P021IccrpctS(short ip65504P021IccrpctS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P021IccrpctS,IP_65504_P_021_ICCRPCT_S_LEN)
                  ,beginIp65504P021IccrpctS
                  ,IP_65504_P_021_ICCRPCT_S_LEN
                 );
            localIp65504P021IccrpctSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P021IccrpctSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P021IccrpctS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P021IccrpctS() {	 
			return (getShort(beginIp65504P021IccrpctS));
   	}
         int localIp65504P021IccrpctLCounter = -1;
         public boolean isIp65504P021IccrpctLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P021IccrpctLCounter != sharedCounter;
            localIp65504P021IccrpctLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_021_ICCRPCT_L_LEN = 2;
  	/**
	 * serializeIp65504P021IccrpctL
	 */
	protected void serializeIp65504P021IccrpctL(short ip65504P021IccrpctL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P021IccrpctL,IP_65504_P_021_ICCRPCT_L_LEN)
                  ,beginIp65504P021IccrpctL
                  ,IP_65504_P_021_ICCRPCT_L_LEN
                 );
            localIp65504P021IccrpctLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P021IccrpctLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P021IccrpctL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P021IccrpctL() {	 
			return (getShort(beginIp65504P021IccrpctL));
   	}
         int localIp65504P022RecurpySCounter = -1;
         public boolean isIp65504P022RecurpySModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P022RecurpySCounter != sharedCounter;
            localIp65504P022RecurpySCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_022_RECURPY_S_LEN = 2;
  	/**
	 * serializeIp65504P022RecurpyS
	 */
	protected void serializeIp65504P022RecurpyS(short ip65504P022RecurpyS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P022RecurpyS,IP_65504_P_022_RECURPY_S_LEN)
                  ,beginIp65504P022RecurpyS
                  ,IP_65504_P_022_RECURPY_S_LEN
                 );
            localIp65504P022RecurpySCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P022RecurpySMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P022RecurpyS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P022RecurpyS() {	 
			return (getShort(beginIp65504P022RecurpyS));
   	}
         int localIp65504P022RecurpyLCounter = -1;
         public boolean isIp65504P022RecurpyLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P022RecurpyLCounter != sharedCounter;
            localIp65504P022RecurpyLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_022_RECURPY_L_LEN = 2;
  	/**
	 * serializeIp65504P022RecurpyL
	 */
	protected void serializeIp65504P022RecurpyL(short ip65504P022RecurpyL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P022RecurpyL,IP_65504_P_022_RECURPY_L_LEN)
                  ,beginIp65504P022RecurpyL
                  ,IP_65504_P_022_RECURPY_L_LEN
                 );
            localIp65504P022RecurpyLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P022RecurpyLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P022RecurpyL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P022RecurpyL() {	 
			return (getShort(beginIp65504P022RecurpyL));
   	}
         int localIp65504P023TermTpSCounter = -1;
         public boolean isIp65504P023TermTpSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P023TermTpSCounter != sharedCounter;
            localIp65504P023TermTpSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_023_TERM_TP_S_LEN = 2;
  	/**
	 * serializeIp65504P023TermTpS
	 */
	protected void serializeIp65504P023TermTpS(short ip65504P023TermTpS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P023TermTpS,IP_65504_P_023_TERM_TP_S_LEN)
                  ,beginIp65504P023TermTpS
                  ,IP_65504_P_023_TERM_TP_S_LEN
                 );
            localIp65504P023TermTpSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P023TermTpSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P023TermTpS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P023TermTpS() {	 
			return (getShort(beginIp65504P023TermTpS));
   	}
         int localIp65504P023TermTpLCounter = -1;
         public boolean isIp65504P023TermTpLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P023TermTpLCounter != sharedCounter;
            localIp65504P023TermTpLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_023_TERM_TP_L_LEN = 2;
  	/**
	 * serializeIp65504P023TermTpL
	 */
	protected void serializeIp65504P023TermTpL(short ip65504P023TermTpL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P023TermTpL,IP_65504_P_023_TERM_TP_L_LEN)
                  ,beginIp65504P023TermTpL
                  ,IP_65504_P_023_TERM_TP_L_LEN
                 );
            localIp65504P023TermTpLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P023TermTpLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P023TermTpL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P023TermTpL() {	 
			return (getShort(beginIp65504P023TermTpL));
   	}
         int localIp65504P024NwkMngSCounter = -1;
         public boolean isIp65504P024NwkMngSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P024NwkMngSCounter != sharedCounter;
            localIp65504P024NwkMngSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_024_NWK_MNG_S_LEN = 2;
  	/**
	 * serializeIp65504P024NwkMngS
	 */
	protected void serializeIp65504P024NwkMngS(short ip65504P024NwkMngS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P024NwkMngS,IP_65504_P_024_NWK_MNG_S_LEN)
                  ,beginIp65504P024NwkMngS
                  ,IP_65504_P_024_NWK_MNG_S_LEN
                 );
            localIp65504P024NwkMngSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P024NwkMngSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P024NwkMngS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P024NwkMngS() {	 
			return (getShort(beginIp65504P024NwkMngS));
   	}
         int localIp65504P024NwkMngLCounter = -1;
         public boolean isIp65504P024NwkMngLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P024NwkMngLCounter != sharedCounter;
            localIp65504P024NwkMngLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_024_NWK_MNG_L_LEN = 2;
  	/**
	 * serializeIp65504P024NwkMngL
	 */
	protected void serializeIp65504P024NwkMngL(short ip65504P024NwkMngL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P024NwkMngL,IP_65504_P_024_NWK_MNG_L_LEN)
                  ,beginIp65504P024NwkMngL
                  ,IP_65504_P_024_NWK_MNG_L_LEN
                 );
            localIp65504P024NwkMngLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P024NwkMngLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P024NwkMngL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P024NwkMngL() {	 
			return (getShort(beginIp65504P024NwkMngL));
   	}
         int localIp65504P025RevIndSCounter = -1;
         public boolean isIp65504P025RevIndSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P025RevIndSCounter != sharedCounter;
            localIp65504P025RevIndSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_025_REV_IND_S_LEN = 2;
  	/**
	 * serializeIp65504P025RevIndS
	 */
	protected void serializeIp65504P025RevIndS(short ip65504P025RevIndS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P025RevIndS,IP_65504_P_025_REV_IND_S_LEN)
                  ,beginIp65504P025RevIndS
                  ,IP_65504_P_025_REV_IND_S_LEN
                 );
            localIp65504P025RevIndSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P025RevIndSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P025RevIndS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P025RevIndS() {	 
			return (getShort(beginIp65504P025RevIndS));
   	}
         int localIp65504P025RevIndLCounter = -1;
         public boolean isIp65504P025RevIndLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P025RevIndLCounter != sharedCounter;
            localIp65504P025RevIndLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_025_REV_IND_L_LEN = 2;
  	/**
	 * serializeIp65504P025RevIndL
	 */
	protected void serializeIp65504P025RevIndL(short ip65504P025RevIndL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P025RevIndL,IP_65504_P_025_REV_IND_L_LEN)
                  ,beginIp65504P025RevIndL
                  ,IP_65504_P_025_REV_IND_L_LEN
                 );
            localIp65504P025RevIndLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P025RevIndLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P025RevIndL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P025RevIndL() {	 
			return (getShort(beginIp65504P025RevIndL));
   	}
         int localIp65504P026FrevIndSCounter = -1;
         public boolean isIp65504P026FrevIndSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P026FrevIndSCounter != sharedCounter;
            localIp65504P026FrevIndSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_026_FREV_IND_S_LEN = 2;
  	/**
	 * serializeIp65504P026FrevIndS
	 */
	protected void serializeIp65504P026FrevIndS(short ip65504P026FrevIndS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P026FrevIndS,IP_65504_P_026_FREV_IND_S_LEN)
                  ,beginIp65504P026FrevIndS
                  ,IP_65504_P_026_FREV_IND_S_LEN
                 );
            localIp65504P026FrevIndSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P026FrevIndSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P026FrevIndS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P026FrevIndS() {	 
			return (getShort(beginIp65504P026FrevIndS));
   	}
         int localIp65504P026FrevIndLCounter = -1;
         public boolean isIp65504P026FrevIndLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P026FrevIndLCounter != sharedCounter;
            localIp65504P026FrevIndLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_026_FREV_IND_L_LEN = 2;
  	/**
	 * serializeIp65504P026FrevIndL
	 */
	protected void serializeIp65504P026FrevIndL(short ip65504P026FrevIndL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P026FrevIndL,IP_65504_P_026_FREV_IND_L_LEN)
                  ,beginIp65504P026FrevIndL
                  ,IP_65504_P_026_FREV_IND_L_LEN
                 );
            localIp65504P026FrevIndLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P026FrevIndLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P026FrevIndL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P026FrevIndL() {	 
			return (getShort(beginIp65504P026FrevIndL));
   	}
         int localIp65504P027ReservdSCounter = -1;
         public boolean isIp65504P027ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P027ReservdSCounter != sharedCounter;
            localIp65504P027ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_027_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P027ReservdS
	 */
	protected void serializeIp65504P027ReservdS(short ip65504P027ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P027ReservdS,IP_65504_P_027_RESERVD_S_LEN)
                  ,beginIp65504P027ReservdS
                  ,IP_65504_P_027_RESERVD_S_LEN
                 );
            localIp65504P027ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P027ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P027ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P027ReservdS() {	 
			return (getShort(beginIp65504P027ReservdS));
   	}
         int localIp65504P027ReservdLCounter = -1;
         public boolean isIp65504P027ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P027ReservdLCounter != sharedCounter;
            localIp65504P027ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_027_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P027ReservdL
	 */
	protected void serializeIp65504P027ReservdL(short ip65504P027ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P027ReservdL,IP_65504_P_027_RESERVD_L_LEN)
                  ,beginIp65504P027ReservdL
                  ,IP_65504_P_027_RESERVD_L_LEN
                 );
            localIp65504P027ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P027ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P027ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P027ReservdL() {	 
			return (getShort(beginIp65504P027ReservdL));
   	}
         int localIp65504P028ReservdSCounter = -1;
         public boolean isIp65504P028ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P028ReservdSCounter != sharedCounter;
            localIp65504P028ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_028_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P028ReservdS
	 */
	protected void serializeIp65504P028ReservdS(short ip65504P028ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P028ReservdS,IP_65504_P_028_RESERVD_S_LEN)
                  ,beginIp65504P028ReservdS
                  ,IP_65504_P_028_RESERVD_S_LEN
                 );
            localIp65504P028ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P028ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P028ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P028ReservdS() {	 
			return (getShort(beginIp65504P028ReservdS));
   	}
         int localIp65504P028ReservdLCounter = -1;
         public boolean isIp65504P028ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P028ReservdLCounter != sharedCounter;
            localIp65504P028ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_028_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P028ReservdL
	 */
	protected void serializeIp65504P028ReservdL(short ip65504P028ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P028ReservdL,IP_65504_P_028_RESERVD_L_LEN)
                  ,beginIp65504P028ReservdL
                  ,IP_65504_P_028_RESERVD_L_LEN
                 );
            localIp65504P028ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P028ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P028ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P028ReservdL() {	 
			return (getShort(beginIp65504P028ReservdL));
   	}
         int localIp65504P029ReservdSCounter = -1;
         public boolean isIp65504P029ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P029ReservdSCounter != sharedCounter;
            localIp65504P029ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_029_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P029ReservdS
	 */
	protected void serializeIp65504P029ReservdS(short ip65504P029ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P029ReservdS,IP_65504_P_029_RESERVD_S_LEN)
                  ,beginIp65504P029ReservdS
                  ,IP_65504_P_029_RESERVD_S_LEN
                 );
            localIp65504P029ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P029ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P029ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P029ReservdS() {	 
			return (getShort(beginIp65504P029ReservdS));
   	}
         int localIp65504P029ReservdLCounter = -1;
         public boolean isIp65504P029ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P029ReservdLCounter != sharedCounter;
            localIp65504P029ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_029_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P029ReservdL
	 */
	protected void serializeIp65504P029ReservdL(short ip65504P029ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P029ReservdL,IP_65504_P_029_RESERVD_L_LEN)
                  ,beginIp65504P029ReservdL
                  ,IP_65504_P_029_RESERVD_L_LEN
                 );
            localIp65504P029ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P029ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P029ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P029ReservdL() {	 
			return (getShort(beginIp65504P029ReservdL));
   	}
         int localIp65504P030ReservdSCounter = -1;
         public boolean isIp65504P030ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P030ReservdSCounter != sharedCounter;
            localIp65504P030ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_030_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P030ReservdS
	 */
	protected void serializeIp65504P030ReservdS(short ip65504P030ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P030ReservdS,IP_65504_P_030_RESERVD_S_LEN)
                  ,beginIp65504P030ReservdS
                  ,IP_65504_P_030_RESERVD_S_LEN
                 );
            localIp65504P030ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P030ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P030ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P030ReservdS() {	 
			return (getShort(beginIp65504P030ReservdS));
   	}
         int localIp65504P030ReservdLCounter = -1;
         public boolean isIp65504P030ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P030ReservdLCounter != sharedCounter;
            localIp65504P030ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_030_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P030ReservdL
	 */
	protected void serializeIp65504P030ReservdL(short ip65504P030ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P030ReservdL,IP_65504_P_030_RESERVD_L_LEN)
                  ,beginIp65504P030ReservdL
                  ,IP_65504_P_030_RESERVD_L_LEN
                 );
            localIp65504P030ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P030ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P030ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P030ReservdL() {	 
			return (getShort(beginIp65504P030ReservdL));
   	}
         int localIp65504P031ReservdSCounter = -1;
         public boolean isIp65504P031ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P031ReservdSCounter != sharedCounter;
            localIp65504P031ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_031_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P031ReservdS
	 */
	protected void serializeIp65504P031ReservdS(short ip65504P031ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P031ReservdS,IP_65504_P_031_RESERVD_S_LEN)
                  ,beginIp65504P031ReservdS
                  ,IP_65504_P_031_RESERVD_S_LEN
                 );
            localIp65504P031ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P031ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P031ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P031ReservdS() {	 
			return (getShort(beginIp65504P031ReservdS));
   	}
         int localIp65504P031ReservdLCounter = -1;
         public boolean isIp65504P031ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P031ReservdLCounter != sharedCounter;
            localIp65504P031ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_031_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P031ReservdL
	 */
	protected void serializeIp65504P031ReservdL(short ip65504P031ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P031ReservdL,IP_65504_P_031_RESERVD_L_LEN)
                  ,beginIp65504P031ReservdL
                  ,IP_65504_P_031_RESERVD_L_LEN
                 );
            localIp65504P031ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P031ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P031ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P031ReservdL() {	 
			return (getShort(beginIp65504P031ReservdL));
   	}




}
  
