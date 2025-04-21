package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup7Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:55. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup7Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup7Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_7_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P187ReservdS;
            protected  int beginIp65504P187ReservdL;
            protected  int beginIp65504P188ReservdS;
            protected  int beginIp65504P188ReservdL;
            protected  int beginIp65504P189PoiTelS;
            protected  int beginIp65504P189PoiTelL;
            protected  int beginIp65504P190PntrIdS;
            protected  int beginIp65504P190PntrIdL;
            protected  int beginIp65504P191OrgFmtS;
            protected  int beginIp65504P191OrgFmtL;
            protected  int beginIp65504P192ReservdS;
            protected  int beginIp65504P192ReservdL;
            protected  int beginIp65504P193ReservdS;
            protected  int beginIp65504P193ReservdL;
            protected  int beginIp65504P194ReservdS;
            protected  int beginIp65504P194ReservdL;
            protected  int beginIp65504P195ReservdS;
            protected  int beginIp65504P195ReservdL;
            protected  int beginIp65504P196ReservdS;
            protected  int beginIp65504P196ReservdL;
            protected  int beginIp65504P197ReservdS;
            protected  int beginIp65504P197ReservdL;
            protected  int beginIp65504P198ReservdS;
            protected  int beginIp65504P198ReservdL;
            protected  int beginIp65504P199ReservdS;
            protected  int beginIp65504P199ReservdL;
            protected  int beginIp65504P200ReservdS;
            protected  int beginIp65504P200ReservdL;
            protected  int beginIp65504P201ReservdS;
            protected  int beginIp65504P201ReservdL;
            protected  int beginIp65504P202ReservdS;
            protected  int beginIp65504P202ReservdL;
            protected  int beginIp65504P203ReservdS;
            protected  int beginIp65504P203ReservdL;
            protected  int beginIp65504P204ReservdS;
            protected  int beginIp65504P204ReservdL;
            protected  int beginIp65504P205ReservdS;
            protected  int beginIp65504P205ReservdL;
            protected  int beginIp65504P206ReservdS;
            protected  int beginIp65504P206ReservdL;
            protected  int beginIp65504P207ReservdS;
            protected  int beginIp65504P207ReservdL;
            protected  int beginIp65504P208ReservdS;
            protected  int beginIp65504P208ReservdL;
            protected  int beginIp65504P209ReservdS;
            protected  int beginIp65504P209ReservdL;
            protected  int beginIp65504P210ReservdS;
            protected  int beginIp65504P210ReservdL;
            protected  int beginIp65504P211ReservdS;
            protected  int beginIp65504P211ReservdL;
            protected  int beginIp65504P212ReservdS;
            protected  int beginIp65504P212ReservdL;
            protected  int beginIp65504P213ReservdS;
            protected  int beginIp65504P213ReservdL;
            protected  int beginIp65504P214ReservdS;
            protected  int beginIp65504P214ReservdL;
            protected  int beginIp65504P215ReservdS;
            protected  int beginIp65504P215ReservdL;
            protected  int beginIp65504P216ReservdS;
            protected  int beginIp65504P216ReservdL;
            protected  int beginIp65504P217ReservdS;
            protected  int beginIp65504P217ReservdL;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup7Serialized
	**/
    public Ip65504PdsNamesLargeGroup7Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup7Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup7Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup7Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1484); // serialize this field at offset 1484 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup7Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1484 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup7Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_7_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P187ReservdS = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P187ReservdL = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P188ReservdS = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P188ReservdL = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P189PoiTelS = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P189PoiTelL = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P190PntrIdS = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P190PntrIdL = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P191OrgFmtS = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P191OrgFmtL = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P192ReservdS = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P192ReservdL = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P193ReservdS = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P193ReservdL = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P194ReservdS = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P194ReservdL = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P195ReservdS = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P195ReservdL = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P196ReservdS = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P196ReservdL = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P197ReservdS = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P197ReservdL = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P198ReservdS = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P198ReservdL = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P199ReservdS = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P199ReservdL = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P200ReservdS = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P200ReservdL = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P201ReservdS = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P201ReservdL = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P202ReservdS = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P202ReservdL = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P203ReservdS = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P203ReservdL = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P204ReservdS = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P204ReservdL = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P205ReservdS = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P205ReservdL = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P206ReservdS = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P206ReservdL = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P207ReservdS = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P207ReservdL = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P208ReservdS = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P208ReservdL = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P209ReservdS = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P209ReservdL = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P210ReservdS = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P210ReservdL = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P211ReservdS = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P211ReservdL = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P212ReservdS = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P212ReservdL = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P213ReservdS = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P213ReservdL = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P214ReservdS = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P214ReservdL = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P215ReservdS = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P215ReservdL = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P216ReservdS = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P216ReservdL = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P217ReservdS = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P217ReservdL = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P187ReservdSCounter = -1;
         public boolean isIp65504P187ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P187ReservdSCounter != sharedCounter;
            localIp65504P187ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_187_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P187ReservdS
	 */
	protected void serializeIp65504P187ReservdS(short ip65504P187ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P187ReservdS,IP_65504_P_187_RESERVD_S_LEN)
                  ,beginIp65504P187ReservdS
                  ,IP_65504_P_187_RESERVD_S_LEN
                 );
            localIp65504P187ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P187ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P187ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P187ReservdS() {	 
			return (getShort(beginIp65504P187ReservdS));
   	}
         int localIp65504P187ReservdLCounter = -1;
         public boolean isIp65504P187ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P187ReservdLCounter != sharedCounter;
            localIp65504P187ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_187_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P187ReservdL
	 */
	protected void serializeIp65504P187ReservdL(short ip65504P187ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P187ReservdL,IP_65504_P_187_RESERVD_L_LEN)
                  ,beginIp65504P187ReservdL
                  ,IP_65504_P_187_RESERVD_L_LEN
                 );
            localIp65504P187ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P187ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P187ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P187ReservdL() {	 
			return (getShort(beginIp65504P187ReservdL));
   	}
         int localIp65504P188ReservdSCounter = -1;
         public boolean isIp65504P188ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P188ReservdSCounter != sharedCounter;
            localIp65504P188ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_188_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P188ReservdS
	 */
	protected void serializeIp65504P188ReservdS(short ip65504P188ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P188ReservdS,IP_65504_P_188_RESERVD_S_LEN)
                  ,beginIp65504P188ReservdS
                  ,IP_65504_P_188_RESERVD_S_LEN
                 );
            localIp65504P188ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P188ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P188ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P188ReservdS() {	 
			return (getShort(beginIp65504P188ReservdS));
   	}
         int localIp65504P188ReservdLCounter = -1;
         public boolean isIp65504P188ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P188ReservdLCounter != sharedCounter;
            localIp65504P188ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_188_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P188ReservdL
	 */
	protected void serializeIp65504P188ReservdL(short ip65504P188ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P188ReservdL,IP_65504_P_188_RESERVD_L_LEN)
                  ,beginIp65504P188ReservdL
                  ,IP_65504_P_188_RESERVD_L_LEN
                 );
            localIp65504P188ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P188ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P188ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P188ReservdL() {	 
			return (getShort(beginIp65504P188ReservdL));
   	}
         int localIp65504P189PoiTelSCounter = -1;
         public boolean isIp65504P189PoiTelSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P189PoiTelSCounter != sharedCounter;
            localIp65504P189PoiTelSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_189_POI_TEL_S_LEN = 2;
  	/**
	 * serializeIp65504P189PoiTelS
	 */
	protected void serializeIp65504P189PoiTelS(short ip65504P189PoiTelS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P189PoiTelS,IP_65504_P_189_POI_TEL_S_LEN)
                  ,beginIp65504P189PoiTelS
                  ,IP_65504_P_189_POI_TEL_S_LEN
                 );
            localIp65504P189PoiTelSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P189PoiTelSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P189PoiTelS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P189PoiTelS() {	 
			return (getShort(beginIp65504P189PoiTelS));
   	}
         int localIp65504P189PoiTelLCounter = -1;
         public boolean isIp65504P189PoiTelLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P189PoiTelLCounter != sharedCounter;
            localIp65504P189PoiTelLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_189_POI_TEL_L_LEN = 2;
  	/**
	 * serializeIp65504P189PoiTelL
	 */
	protected void serializeIp65504P189PoiTelL(short ip65504P189PoiTelL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P189PoiTelL,IP_65504_P_189_POI_TEL_L_LEN)
                  ,beginIp65504P189PoiTelL
                  ,IP_65504_P_189_POI_TEL_L_LEN
                 );
            localIp65504P189PoiTelLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P189PoiTelLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P189PoiTelL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P189PoiTelL() {	 
			return (getShort(beginIp65504P189PoiTelL));
   	}
         int localIp65504P190PntrIdSCounter = -1;
         public boolean isIp65504P190PntrIdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P190PntrIdSCounter != sharedCounter;
            localIp65504P190PntrIdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_190_PNTR_ID_S_LEN = 2;
  	/**
	 * serializeIp65504P190PntrIdS
	 */
	protected void serializeIp65504P190PntrIdS(short ip65504P190PntrIdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P190PntrIdS,IP_65504_P_190_PNTR_ID_S_LEN)
                  ,beginIp65504P190PntrIdS
                  ,IP_65504_P_190_PNTR_ID_S_LEN
                 );
            localIp65504P190PntrIdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P190PntrIdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P190PntrIdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P190PntrIdS() {	 
			return (getShort(beginIp65504P190PntrIdS));
   	}
         int localIp65504P190PntrIdLCounter = -1;
         public boolean isIp65504P190PntrIdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P190PntrIdLCounter != sharedCounter;
            localIp65504P190PntrIdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_190_PNTR_ID_L_LEN = 2;
  	/**
	 * serializeIp65504P190PntrIdL
	 */
	protected void serializeIp65504P190PntrIdL(short ip65504P190PntrIdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P190PntrIdL,IP_65504_P_190_PNTR_ID_L_LEN)
                  ,beginIp65504P190PntrIdL
                  ,IP_65504_P_190_PNTR_ID_L_LEN
                 );
            localIp65504P190PntrIdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P190PntrIdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P190PntrIdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P190PntrIdL() {	 
			return (getShort(beginIp65504P190PntrIdL));
   	}
         int localIp65504P191OrgFmtSCounter = -1;
         public boolean isIp65504P191OrgFmtSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P191OrgFmtSCounter != sharedCounter;
            localIp65504P191OrgFmtSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_191_ORG_FMT_S_LEN = 2;
  	/**
	 * serializeIp65504P191OrgFmtS
	 */
	protected void serializeIp65504P191OrgFmtS(short ip65504P191OrgFmtS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P191OrgFmtS,IP_65504_P_191_ORG_FMT_S_LEN)
                  ,beginIp65504P191OrgFmtS
                  ,IP_65504_P_191_ORG_FMT_S_LEN
                 );
            localIp65504P191OrgFmtSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P191OrgFmtSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P191OrgFmtS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P191OrgFmtS() {	 
			return (getShort(beginIp65504P191OrgFmtS));
   	}
         int localIp65504P191OrgFmtLCounter = -1;
         public boolean isIp65504P191OrgFmtLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P191OrgFmtLCounter != sharedCounter;
            localIp65504P191OrgFmtLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_191_ORG_FMT_L_LEN = 2;
  	/**
	 * serializeIp65504P191OrgFmtL
	 */
	protected void serializeIp65504P191OrgFmtL(short ip65504P191OrgFmtL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P191OrgFmtL,IP_65504_P_191_ORG_FMT_L_LEN)
                  ,beginIp65504P191OrgFmtL
                  ,IP_65504_P_191_ORG_FMT_L_LEN
                 );
            localIp65504P191OrgFmtLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P191OrgFmtLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P191OrgFmtL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P191OrgFmtL() {	 
			return (getShort(beginIp65504P191OrgFmtL));
   	}
         int localIp65504P192ReservdSCounter = -1;
         public boolean isIp65504P192ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P192ReservdSCounter != sharedCounter;
            localIp65504P192ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_192_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P192ReservdS
	 */
	protected void serializeIp65504P192ReservdS(short ip65504P192ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P192ReservdS,IP_65504_P_192_RESERVD_S_LEN)
                  ,beginIp65504P192ReservdS
                  ,IP_65504_P_192_RESERVD_S_LEN
                 );
            localIp65504P192ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P192ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P192ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P192ReservdS() {	 
			return (getShort(beginIp65504P192ReservdS));
   	}
         int localIp65504P192ReservdLCounter = -1;
         public boolean isIp65504P192ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P192ReservdLCounter != sharedCounter;
            localIp65504P192ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_192_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P192ReservdL
	 */
	protected void serializeIp65504P192ReservdL(short ip65504P192ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P192ReservdL,IP_65504_P_192_RESERVD_L_LEN)
                  ,beginIp65504P192ReservdL
                  ,IP_65504_P_192_RESERVD_L_LEN
                 );
            localIp65504P192ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P192ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P192ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P192ReservdL() {	 
			return (getShort(beginIp65504P192ReservdL));
   	}
         int localIp65504P193ReservdSCounter = -1;
         public boolean isIp65504P193ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P193ReservdSCounter != sharedCounter;
            localIp65504P193ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_193_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P193ReservdS
	 */
	protected void serializeIp65504P193ReservdS(short ip65504P193ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P193ReservdS,IP_65504_P_193_RESERVD_S_LEN)
                  ,beginIp65504P193ReservdS
                  ,IP_65504_P_193_RESERVD_S_LEN
                 );
            localIp65504P193ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P193ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P193ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P193ReservdS() {	 
			return (getShort(beginIp65504P193ReservdS));
   	}
         int localIp65504P193ReservdLCounter = -1;
         public boolean isIp65504P193ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P193ReservdLCounter != sharedCounter;
            localIp65504P193ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_193_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P193ReservdL
	 */
	protected void serializeIp65504P193ReservdL(short ip65504P193ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P193ReservdL,IP_65504_P_193_RESERVD_L_LEN)
                  ,beginIp65504P193ReservdL
                  ,IP_65504_P_193_RESERVD_L_LEN
                 );
            localIp65504P193ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P193ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P193ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P193ReservdL() {	 
			return (getShort(beginIp65504P193ReservdL));
   	}
         int localIp65504P194ReservdSCounter = -1;
         public boolean isIp65504P194ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P194ReservdSCounter != sharedCounter;
            localIp65504P194ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_194_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P194ReservdS
	 */
	protected void serializeIp65504P194ReservdS(short ip65504P194ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P194ReservdS,IP_65504_P_194_RESERVD_S_LEN)
                  ,beginIp65504P194ReservdS
                  ,IP_65504_P_194_RESERVD_S_LEN
                 );
            localIp65504P194ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P194ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P194ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P194ReservdS() {	 
			return (getShort(beginIp65504P194ReservdS));
   	}
         int localIp65504P194ReservdLCounter = -1;
         public boolean isIp65504P194ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P194ReservdLCounter != sharedCounter;
            localIp65504P194ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_194_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P194ReservdL
	 */
	protected void serializeIp65504P194ReservdL(short ip65504P194ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P194ReservdL,IP_65504_P_194_RESERVD_L_LEN)
                  ,beginIp65504P194ReservdL
                  ,IP_65504_P_194_RESERVD_L_LEN
                 );
            localIp65504P194ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P194ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P194ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P194ReservdL() {	 
			return (getShort(beginIp65504P194ReservdL));
   	}
         int localIp65504P195ReservdSCounter = -1;
         public boolean isIp65504P195ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P195ReservdSCounter != sharedCounter;
            localIp65504P195ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_195_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P195ReservdS
	 */
	protected void serializeIp65504P195ReservdS(short ip65504P195ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P195ReservdS,IP_65504_P_195_RESERVD_S_LEN)
                  ,beginIp65504P195ReservdS
                  ,IP_65504_P_195_RESERVD_S_LEN
                 );
            localIp65504P195ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P195ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P195ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P195ReservdS() {	 
			return (getShort(beginIp65504P195ReservdS));
   	}
         int localIp65504P195ReservdLCounter = -1;
         public boolean isIp65504P195ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P195ReservdLCounter != sharedCounter;
            localIp65504P195ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_195_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P195ReservdL
	 */
	protected void serializeIp65504P195ReservdL(short ip65504P195ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P195ReservdL,IP_65504_P_195_RESERVD_L_LEN)
                  ,beginIp65504P195ReservdL
                  ,IP_65504_P_195_RESERVD_L_LEN
                 );
            localIp65504P195ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P195ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P195ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P195ReservdL() {	 
			return (getShort(beginIp65504P195ReservdL));
   	}
         int localIp65504P196ReservdSCounter = -1;
         public boolean isIp65504P196ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P196ReservdSCounter != sharedCounter;
            localIp65504P196ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_196_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P196ReservdS
	 */
	protected void serializeIp65504P196ReservdS(short ip65504P196ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P196ReservdS,IP_65504_P_196_RESERVD_S_LEN)
                  ,beginIp65504P196ReservdS
                  ,IP_65504_P_196_RESERVD_S_LEN
                 );
            localIp65504P196ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P196ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P196ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P196ReservdS() {	 
			return (getShort(beginIp65504P196ReservdS));
   	}
         int localIp65504P196ReservdLCounter = -1;
         public boolean isIp65504P196ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P196ReservdLCounter != sharedCounter;
            localIp65504P196ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_196_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P196ReservdL
	 */
	protected void serializeIp65504P196ReservdL(short ip65504P196ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P196ReservdL,IP_65504_P_196_RESERVD_L_LEN)
                  ,beginIp65504P196ReservdL
                  ,IP_65504_P_196_RESERVD_L_LEN
                 );
            localIp65504P196ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P196ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P196ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P196ReservdL() {	 
			return (getShort(beginIp65504P196ReservdL));
   	}
         int localIp65504P197ReservdSCounter = -1;
         public boolean isIp65504P197ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P197ReservdSCounter != sharedCounter;
            localIp65504P197ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_197_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P197ReservdS
	 */
	protected void serializeIp65504P197ReservdS(short ip65504P197ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P197ReservdS,IP_65504_P_197_RESERVD_S_LEN)
                  ,beginIp65504P197ReservdS
                  ,IP_65504_P_197_RESERVD_S_LEN
                 );
            localIp65504P197ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P197ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P197ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P197ReservdS() {	 
			return (getShort(beginIp65504P197ReservdS));
   	}
         int localIp65504P197ReservdLCounter = -1;
         public boolean isIp65504P197ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P197ReservdLCounter != sharedCounter;
            localIp65504P197ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_197_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P197ReservdL
	 */
	protected void serializeIp65504P197ReservdL(short ip65504P197ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P197ReservdL,IP_65504_P_197_RESERVD_L_LEN)
                  ,beginIp65504P197ReservdL
                  ,IP_65504_P_197_RESERVD_L_LEN
                 );
            localIp65504P197ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P197ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P197ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P197ReservdL() {	 
			return (getShort(beginIp65504P197ReservdL));
   	}
         int localIp65504P198ReservdSCounter = -1;
         public boolean isIp65504P198ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P198ReservdSCounter != sharedCounter;
            localIp65504P198ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_198_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P198ReservdS
	 */
	protected void serializeIp65504P198ReservdS(short ip65504P198ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P198ReservdS,IP_65504_P_198_RESERVD_S_LEN)
                  ,beginIp65504P198ReservdS
                  ,IP_65504_P_198_RESERVD_S_LEN
                 );
            localIp65504P198ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P198ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P198ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P198ReservdS() {	 
			return (getShort(beginIp65504P198ReservdS));
   	}
         int localIp65504P198ReservdLCounter = -1;
         public boolean isIp65504P198ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P198ReservdLCounter != sharedCounter;
            localIp65504P198ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_198_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P198ReservdL
	 */
	protected void serializeIp65504P198ReservdL(short ip65504P198ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P198ReservdL,IP_65504_P_198_RESERVD_L_LEN)
                  ,beginIp65504P198ReservdL
                  ,IP_65504_P_198_RESERVD_L_LEN
                 );
            localIp65504P198ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P198ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P198ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P198ReservdL() {	 
			return (getShort(beginIp65504P198ReservdL));
   	}
         int localIp65504P199ReservdSCounter = -1;
         public boolean isIp65504P199ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P199ReservdSCounter != sharedCounter;
            localIp65504P199ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_199_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P199ReservdS
	 */
	protected void serializeIp65504P199ReservdS(short ip65504P199ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P199ReservdS,IP_65504_P_199_RESERVD_S_LEN)
                  ,beginIp65504P199ReservdS
                  ,IP_65504_P_199_RESERVD_S_LEN
                 );
            localIp65504P199ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P199ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P199ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P199ReservdS() {	 
			return (getShort(beginIp65504P199ReservdS));
   	}
         int localIp65504P199ReservdLCounter = -1;
         public boolean isIp65504P199ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P199ReservdLCounter != sharedCounter;
            localIp65504P199ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_199_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P199ReservdL
	 */
	protected void serializeIp65504P199ReservdL(short ip65504P199ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P199ReservdL,IP_65504_P_199_RESERVD_L_LEN)
                  ,beginIp65504P199ReservdL
                  ,IP_65504_P_199_RESERVD_L_LEN
                 );
            localIp65504P199ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P199ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P199ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P199ReservdL() {	 
			return (getShort(beginIp65504P199ReservdL));
   	}
         int localIp65504P200ReservdSCounter = -1;
         public boolean isIp65504P200ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P200ReservdSCounter != sharedCounter;
            localIp65504P200ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_200_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P200ReservdS
	 */
	protected void serializeIp65504P200ReservdS(short ip65504P200ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P200ReservdS,IP_65504_P_200_RESERVD_S_LEN)
                  ,beginIp65504P200ReservdS
                  ,IP_65504_P_200_RESERVD_S_LEN
                 );
            localIp65504P200ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P200ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P200ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P200ReservdS() {	 
			return (getShort(beginIp65504P200ReservdS));
   	}
         int localIp65504P200ReservdLCounter = -1;
         public boolean isIp65504P200ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P200ReservdLCounter != sharedCounter;
            localIp65504P200ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_200_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P200ReservdL
	 */
	protected void serializeIp65504P200ReservdL(short ip65504P200ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P200ReservdL,IP_65504_P_200_RESERVD_L_LEN)
                  ,beginIp65504P200ReservdL
                  ,IP_65504_P_200_RESERVD_L_LEN
                 );
            localIp65504P200ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P200ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P200ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P200ReservdL() {	 
			return (getShort(beginIp65504P200ReservdL));
   	}
         int localIp65504P201ReservdSCounter = -1;
         public boolean isIp65504P201ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P201ReservdSCounter != sharedCounter;
            localIp65504P201ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_201_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P201ReservdS
	 */
	protected void serializeIp65504P201ReservdS(short ip65504P201ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P201ReservdS,IP_65504_P_201_RESERVD_S_LEN)
                  ,beginIp65504P201ReservdS
                  ,IP_65504_P_201_RESERVD_S_LEN
                 );
            localIp65504P201ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P201ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P201ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P201ReservdS() {	 
			return (getShort(beginIp65504P201ReservdS));
   	}
         int localIp65504P201ReservdLCounter = -1;
         public boolean isIp65504P201ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P201ReservdLCounter != sharedCounter;
            localIp65504P201ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_201_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P201ReservdL
	 */
	protected void serializeIp65504P201ReservdL(short ip65504P201ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P201ReservdL,IP_65504_P_201_RESERVD_L_LEN)
                  ,beginIp65504P201ReservdL
                  ,IP_65504_P_201_RESERVD_L_LEN
                 );
            localIp65504P201ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P201ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P201ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P201ReservdL() {	 
			return (getShort(beginIp65504P201ReservdL));
   	}
         int localIp65504P202ReservdSCounter = -1;
         public boolean isIp65504P202ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P202ReservdSCounter != sharedCounter;
            localIp65504P202ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_202_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P202ReservdS
	 */
	protected void serializeIp65504P202ReservdS(short ip65504P202ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P202ReservdS,IP_65504_P_202_RESERVD_S_LEN)
                  ,beginIp65504P202ReservdS
                  ,IP_65504_P_202_RESERVD_S_LEN
                 );
            localIp65504P202ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P202ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P202ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P202ReservdS() {	 
			return (getShort(beginIp65504P202ReservdS));
   	}
         int localIp65504P202ReservdLCounter = -1;
         public boolean isIp65504P202ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P202ReservdLCounter != sharedCounter;
            localIp65504P202ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_202_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P202ReservdL
	 */
	protected void serializeIp65504P202ReservdL(short ip65504P202ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P202ReservdL,IP_65504_P_202_RESERVD_L_LEN)
                  ,beginIp65504P202ReservdL
                  ,IP_65504_P_202_RESERVD_L_LEN
                 );
            localIp65504P202ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P202ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P202ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P202ReservdL() {	 
			return (getShort(beginIp65504P202ReservdL));
   	}
         int localIp65504P203ReservdSCounter = -1;
         public boolean isIp65504P203ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P203ReservdSCounter != sharedCounter;
            localIp65504P203ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_203_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P203ReservdS
	 */
	protected void serializeIp65504P203ReservdS(short ip65504P203ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P203ReservdS,IP_65504_P_203_RESERVD_S_LEN)
                  ,beginIp65504P203ReservdS
                  ,IP_65504_P_203_RESERVD_S_LEN
                 );
            localIp65504P203ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P203ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P203ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P203ReservdS() {	 
			return (getShort(beginIp65504P203ReservdS));
   	}
         int localIp65504P203ReservdLCounter = -1;
         public boolean isIp65504P203ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P203ReservdLCounter != sharedCounter;
            localIp65504P203ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_203_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P203ReservdL
	 */
	protected void serializeIp65504P203ReservdL(short ip65504P203ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P203ReservdL,IP_65504_P_203_RESERVD_L_LEN)
                  ,beginIp65504P203ReservdL
                  ,IP_65504_P_203_RESERVD_L_LEN
                 );
            localIp65504P203ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P203ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P203ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P203ReservdL() {	 
			return (getShort(beginIp65504P203ReservdL));
   	}
         int localIp65504P204ReservdSCounter = -1;
         public boolean isIp65504P204ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P204ReservdSCounter != sharedCounter;
            localIp65504P204ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_204_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P204ReservdS
	 */
	protected void serializeIp65504P204ReservdS(short ip65504P204ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P204ReservdS,IP_65504_P_204_RESERVD_S_LEN)
                  ,beginIp65504P204ReservdS
                  ,IP_65504_P_204_RESERVD_S_LEN
                 );
            localIp65504P204ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P204ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P204ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P204ReservdS() {	 
			return (getShort(beginIp65504P204ReservdS));
   	}
         int localIp65504P204ReservdLCounter = -1;
         public boolean isIp65504P204ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P204ReservdLCounter != sharedCounter;
            localIp65504P204ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_204_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P204ReservdL
	 */
	protected void serializeIp65504P204ReservdL(short ip65504P204ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P204ReservdL,IP_65504_P_204_RESERVD_L_LEN)
                  ,beginIp65504P204ReservdL
                  ,IP_65504_P_204_RESERVD_L_LEN
                 );
            localIp65504P204ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P204ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P204ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P204ReservdL() {	 
			return (getShort(beginIp65504P204ReservdL));
   	}
         int localIp65504P205ReservdSCounter = -1;
         public boolean isIp65504P205ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P205ReservdSCounter != sharedCounter;
            localIp65504P205ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_205_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P205ReservdS
	 */
	protected void serializeIp65504P205ReservdS(short ip65504P205ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P205ReservdS,IP_65504_P_205_RESERVD_S_LEN)
                  ,beginIp65504P205ReservdS
                  ,IP_65504_P_205_RESERVD_S_LEN
                 );
            localIp65504P205ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P205ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P205ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P205ReservdS() {	 
			return (getShort(beginIp65504P205ReservdS));
   	}
         int localIp65504P205ReservdLCounter = -1;
         public boolean isIp65504P205ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P205ReservdLCounter != sharedCounter;
            localIp65504P205ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_205_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P205ReservdL
	 */
	protected void serializeIp65504P205ReservdL(short ip65504P205ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P205ReservdL,IP_65504_P_205_RESERVD_L_LEN)
                  ,beginIp65504P205ReservdL
                  ,IP_65504_P_205_RESERVD_L_LEN
                 );
            localIp65504P205ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P205ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P205ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P205ReservdL() {	 
			return (getShort(beginIp65504P205ReservdL));
   	}
         int localIp65504P206ReservdSCounter = -1;
         public boolean isIp65504P206ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P206ReservdSCounter != sharedCounter;
            localIp65504P206ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_206_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P206ReservdS
	 */
	protected void serializeIp65504P206ReservdS(short ip65504P206ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P206ReservdS,IP_65504_P_206_RESERVD_S_LEN)
                  ,beginIp65504P206ReservdS
                  ,IP_65504_P_206_RESERVD_S_LEN
                 );
            localIp65504P206ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P206ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P206ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P206ReservdS() {	 
			return (getShort(beginIp65504P206ReservdS));
   	}
         int localIp65504P206ReservdLCounter = -1;
         public boolean isIp65504P206ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P206ReservdLCounter != sharedCounter;
            localIp65504P206ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_206_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P206ReservdL
	 */
	protected void serializeIp65504P206ReservdL(short ip65504P206ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P206ReservdL,IP_65504_P_206_RESERVD_L_LEN)
                  ,beginIp65504P206ReservdL
                  ,IP_65504_P_206_RESERVD_L_LEN
                 );
            localIp65504P206ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P206ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P206ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P206ReservdL() {	 
			return (getShort(beginIp65504P206ReservdL));
   	}
         int localIp65504P207ReservdSCounter = -1;
         public boolean isIp65504P207ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P207ReservdSCounter != sharedCounter;
            localIp65504P207ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_207_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P207ReservdS
	 */
	protected void serializeIp65504P207ReservdS(short ip65504P207ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P207ReservdS,IP_65504_P_207_RESERVD_S_LEN)
                  ,beginIp65504P207ReservdS
                  ,IP_65504_P_207_RESERVD_S_LEN
                 );
            localIp65504P207ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P207ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P207ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P207ReservdS() {	 
			return (getShort(beginIp65504P207ReservdS));
   	}
         int localIp65504P207ReservdLCounter = -1;
         public boolean isIp65504P207ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P207ReservdLCounter != sharedCounter;
            localIp65504P207ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_207_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P207ReservdL
	 */
	protected void serializeIp65504P207ReservdL(short ip65504P207ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P207ReservdL,IP_65504_P_207_RESERVD_L_LEN)
                  ,beginIp65504P207ReservdL
                  ,IP_65504_P_207_RESERVD_L_LEN
                 );
            localIp65504P207ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P207ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P207ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P207ReservdL() {	 
			return (getShort(beginIp65504P207ReservdL));
   	}
         int localIp65504P208ReservdSCounter = -1;
         public boolean isIp65504P208ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P208ReservdSCounter != sharedCounter;
            localIp65504P208ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_208_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P208ReservdS
	 */
	protected void serializeIp65504P208ReservdS(short ip65504P208ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P208ReservdS,IP_65504_P_208_RESERVD_S_LEN)
                  ,beginIp65504P208ReservdS
                  ,IP_65504_P_208_RESERVD_S_LEN
                 );
            localIp65504P208ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P208ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P208ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P208ReservdS() {	 
			return (getShort(beginIp65504P208ReservdS));
   	}
         int localIp65504P208ReservdLCounter = -1;
         public boolean isIp65504P208ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P208ReservdLCounter != sharedCounter;
            localIp65504P208ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_208_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P208ReservdL
	 */
	protected void serializeIp65504P208ReservdL(short ip65504P208ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P208ReservdL,IP_65504_P_208_RESERVD_L_LEN)
                  ,beginIp65504P208ReservdL
                  ,IP_65504_P_208_RESERVD_L_LEN
                 );
            localIp65504P208ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P208ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P208ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P208ReservdL() {	 
			return (getShort(beginIp65504P208ReservdL));
   	}
         int localIp65504P209ReservdSCounter = -1;
         public boolean isIp65504P209ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P209ReservdSCounter != sharedCounter;
            localIp65504P209ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_209_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P209ReservdS
	 */
	protected void serializeIp65504P209ReservdS(short ip65504P209ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P209ReservdS,IP_65504_P_209_RESERVD_S_LEN)
                  ,beginIp65504P209ReservdS
                  ,IP_65504_P_209_RESERVD_S_LEN
                 );
            localIp65504P209ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P209ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P209ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P209ReservdS() {	 
			return (getShort(beginIp65504P209ReservdS));
   	}
         int localIp65504P209ReservdLCounter = -1;
         public boolean isIp65504P209ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P209ReservdLCounter != sharedCounter;
            localIp65504P209ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_209_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P209ReservdL
	 */
	protected void serializeIp65504P209ReservdL(short ip65504P209ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P209ReservdL,IP_65504_P_209_RESERVD_L_LEN)
                  ,beginIp65504P209ReservdL
                  ,IP_65504_P_209_RESERVD_L_LEN
                 );
            localIp65504P209ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P209ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P209ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P209ReservdL() {	 
			return (getShort(beginIp65504P209ReservdL));
   	}
         int localIp65504P210ReservdSCounter = -1;
         public boolean isIp65504P210ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P210ReservdSCounter != sharedCounter;
            localIp65504P210ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_210_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P210ReservdS
	 */
	protected void serializeIp65504P210ReservdS(short ip65504P210ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P210ReservdS,IP_65504_P_210_RESERVD_S_LEN)
                  ,beginIp65504P210ReservdS
                  ,IP_65504_P_210_RESERVD_S_LEN
                 );
            localIp65504P210ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P210ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P210ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P210ReservdS() {	 
			return (getShort(beginIp65504P210ReservdS));
   	}
         int localIp65504P210ReservdLCounter = -1;
         public boolean isIp65504P210ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P210ReservdLCounter != sharedCounter;
            localIp65504P210ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_210_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P210ReservdL
	 */
	protected void serializeIp65504P210ReservdL(short ip65504P210ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P210ReservdL,IP_65504_P_210_RESERVD_L_LEN)
                  ,beginIp65504P210ReservdL
                  ,IP_65504_P_210_RESERVD_L_LEN
                 );
            localIp65504P210ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P210ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P210ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P210ReservdL() {	 
			return (getShort(beginIp65504P210ReservdL));
   	}
         int localIp65504P211ReservdSCounter = -1;
         public boolean isIp65504P211ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P211ReservdSCounter != sharedCounter;
            localIp65504P211ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_211_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P211ReservdS
	 */
	protected void serializeIp65504P211ReservdS(short ip65504P211ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P211ReservdS,IP_65504_P_211_RESERVD_S_LEN)
                  ,beginIp65504P211ReservdS
                  ,IP_65504_P_211_RESERVD_S_LEN
                 );
            localIp65504P211ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P211ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P211ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P211ReservdS() {	 
			return (getShort(beginIp65504P211ReservdS));
   	}
         int localIp65504P211ReservdLCounter = -1;
         public boolean isIp65504P211ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P211ReservdLCounter != sharedCounter;
            localIp65504P211ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_211_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P211ReservdL
	 */
	protected void serializeIp65504P211ReservdL(short ip65504P211ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P211ReservdL,IP_65504_P_211_RESERVD_L_LEN)
                  ,beginIp65504P211ReservdL
                  ,IP_65504_P_211_RESERVD_L_LEN
                 );
            localIp65504P211ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P211ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P211ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P211ReservdL() {	 
			return (getShort(beginIp65504P211ReservdL));
   	}
         int localIp65504P212ReservdSCounter = -1;
         public boolean isIp65504P212ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P212ReservdSCounter != sharedCounter;
            localIp65504P212ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_212_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P212ReservdS
	 */
	protected void serializeIp65504P212ReservdS(short ip65504P212ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P212ReservdS,IP_65504_P_212_RESERVD_S_LEN)
                  ,beginIp65504P212ReservdS
                  ,IP_65504_P_212_RESERVD_S_LEN
                 );
            localIp65504P212ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P212ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P212ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P212ReservdS() {	 
			return (getShort(beginIp65504P212ReservdS));
   	}
         int localIp65504P212ReservdLCounter = -1;
         public boolean isIp65504P212ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P212ReservdLCounter != sharedCounter;
            localIp65504P212ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_212_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P212ReservdL
	 */
	protected void serializeIp65504P212ReservdL(short ip65504P212ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P212ReservdL,IP_65504_P_212_RESERVD_L_LEN)
                  ,beginIp65504P212ReservdL
                  ,IP_65504_P_212_RESERVD_L_LEN
                 );
            localIp65504P212ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P212ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P212ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P212ReservdL() {	 
			return (getShort(beginIp65504P212ReservdL));
   	}
         int localIp65504P213ReservdSCounter = -1;
         public boolean isIp65504P213ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P213ReservdSCounter != sharedCounter;
            localIp65504P213ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_213_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P213ReservdS
	 */
	protected void serializeIp65504P213ReservdS(short ip65504P213ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P213ReservdS,IP_65504_P_213_RESERVD_S_LEN)
                  ,beginIp65504P213ReservdS
                  ,IP_65504_P_213_RESERVD_S_LEN
                 );
            localIp65504P213ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P213ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P213ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P213ReservdS() {	 
			return (getShort(beginIp65504P213ReservdS));
   	}
         int localIp65504P213ReservdLCounter = -1;
         public boolean isIp65504P213ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P213ReservdLCounter != sharedCounter;
            localIp65504P213ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_213_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P213ReservdL
	 */
	protected void serializeIp65504P213ReservdL(short ip65504P213ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P213ReservdL,IP_65504_P_213_RESERVD_L_LEN)
                  ,beginIp65504P213ReservdL
                  ,IP_65504_P_213_RESERVD_L_LEN
                 );
            localIp65504P213ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P213ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P213ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P213ReservdL() {	 
			return (getShort(beginIp65504P213ReservdL));
   	}
         int localIp65504P214ReservdSCounter = -1;
         public boolean isIp65504P214ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P214ReservdSCounter != sharedCounter;
            localIp65504P214ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_214_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P214ReservdS
	 */
	protected void serializeIp65504P214ReservdS(short ip65504P214ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P214ReservdS,IP_65504_P_214_RESERVD_S_LEN)
                  ,beginIp65504P214ReservdS
                  ,IP_65504_P_214_RESERVD_S_LEN
                 );
            localIp65504P214ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P214ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P214ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P214ReservdS() {	 
			return (getShort(beginIp65504P214ReservdS));
   	}
         int localIp65504P214ReservdLCounter = -1;
         public boolean isIp65504P214ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P214ReservdLCounter != sharedCounter;
            localIp65504P214ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_214_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P214ReservdL
	 */
	protected void serializeIp65504P214ReservdL(short ip65504P214ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P214ReservdL,IP_65504_P_214_RESERVD_L_LEN)
                  ,beginIp65504P214ReservdL
                  ,IP_65504_P_214_RESERVD_L_LEN
                 );
            localIp65504P214ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P214ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P214ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P214ReservdL() {	 
			return (getShort(beginIp65504P214ReservdL));
   	}
         int localIp65504P215ReservdSCounter = -1;
         public boolean isIp65504P215ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P215ReservdSCounter != sharedCounter;
            localIp65504P215ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_215_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P215ReservdS
	 */
	protected void serializeIp65504P215ReservdS(short ip65504P215ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P215ReservdS,IP_65504_P_215_RESERVD_S_LEN)
                  ,beginIp65504P215ReservdS
                  ,IP_65504_P_215_RESERVD_S_LEN
                 );
            localIp65504P215ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P215ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P215ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P215ReservdS() {	 
			return (getShort(beginIp65504P215ReservdS));
   	}
         int localIp65504P215ReservdLCounter = -1;
         public boolean isIp65504P215ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P215ReservdLCounter != sharedCounter;
            localIp65504P215ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_215_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P215ReservdL
	 */
	protected void serializeIp65504P215ReservdL(short ip65504P215ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P215ReservdL,IP_65504_P_215_RESERVD_L_LEN)
                  ,beginIp65504P215ReservdL
                  ,IP_65504_P_215_RESERVD_L_LEN
                 );
            localIp65504P215ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P215ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P215ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P215ReservdL() {	 
			return (getShort(beginIp65504P215ReservdL));
   	}
         int localIp65504P216ReservdSCounter = -1;
         public boolean isIp65504P216ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P216ReservdSCounter != sharedCounter;
            localIp65504P216ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_216_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P216ReservdS
	 */
	protected void serializeIp65504P216ReservdS(short ip65504P216ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P216ReservdS,IP_65504_P_216_RESERVD_S_LEN)
                  ,beginIp65504P216ReservdS
                  ,IP_65504_P_216_RESERVD_S_LEN
                 );
            localIp65504P216ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P216ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P216ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P216ReservdS() {	 
			return (getShort(beginIp65504P216ReservdS));
   	}
         int localIp65504P216ReservdLCounter = -1;
         public boolean isIp65504P216ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P216ReservdLCounter != sharedCounter;
            localIp65504P216ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_216_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P216ReservdL
	 */
	protected void serializeIp65504P216ReservdL(short ip65504P216ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P216ReservdL,IP_65504_P_216_RESERVD_L_LEN)
                  ,beginIp65504P216ReservdL
                  ,IP_65504_P_216_RESERVD_L_LEN
                 );
            localIp65504P216ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P216ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P216ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P216ReservdL() {	 
			return (getShort(beginIp65504P216ReservdL));
   	}
         int localIp65504P217ReservdSCounter = -1;
         public boolean isIp65504P217ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P217ReservdSCounter != sharedCounter;
            localIp65504P217ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_217_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P217ReservdS
	 */
	protected void serializeIp65504P217ReservdS(short ip65504P217ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P217ReservdS,IP_65504_P_217_RESERVD_S_LEN)
                  ,beginIp65504P217ReservdS
                  ,IP_65504_P_217_RESERVD_S_LEN
                 );
            localIp65504P217ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P217ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P217ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P217ReservdS() {	 
			return (getShort(beginIp65504P217ReservdS));
   	}
         int localIp65504P217ReservdLCounter = -1;
         public boolean isIp65504P217ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P217ReservdLCounter != sharedCounter;
            localIp65504P217ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_217_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P217ReservdL
	 */
	protected void serializeIp65504P217ReservdL(short ip65504P217ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P217ReservdL,IP_65504_P_217_RESERVD_L_LEN)
                  ,beginIp65504P217ReservdL
                  ,IP_65504_P_217_RESERVD_L_LEN
                 );
            localIp65504P217ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P217ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P217ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P217ReservdL() {	 
			return (getShort(beginIp65504P217ReservdL));
   	}




}
  
