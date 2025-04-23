package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup19Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:07. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup19Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup19Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_19_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P559VehInsS;
            protected  int beginIp65504P559VehInsL;
            protected  int beginIp65504P560ReservdS;
            protected  int beginIp65504P560ReservdL;
            protected  int beginIp65504P561AdjAmtS;
            protected  int beginIp65504P561AdjAmtL;
            protected  int beginIp65504P562ReservdS;
            protected  int beginIp65504P562ReservdL;
            protected  int beginIp65504P563PgmCodS;
            protected  int beginIp65504P563PgmCodL;
            protected  int beginIp65504P564RntcityS;
            protected  int beginIp65504P564RntcityL;
            protected  int beginIp65504P565RentStS;
            protected  int beginIp65504P565RentStL;
            protected  int beginIp65504P566RntctryS;
            protected  int beginIp65504P566RntctryL;
            protected  int beginIp65504P567RntLocS;
            protected  int beginIp65504P567RntLocL;
            protected  int beginIp65504P568RntClsS;
            protected  int beginIp65504P568RntClsL;
            protected  int beginIp65504P569ReservdS;
            protected  int beginIp65504P569ReservdL;
            protected  int beginIp65504P570ReservdS;
            protected  int beginIp65504P570ReservdL;
            protected  int beginIp65504P571ReservdS;
            protected  int beginIp65504P571ReservdL;
            protected  int beginIp65504P572ReservdS;
            protected  int beginIp65504P572ReservdL;
            protected  int beginIp65504P573ReservdS;
            protected  int beginIp65504P573ReservdL;
            protected  int beginIp65504P574ArvDteS;
            protected  int beginIp65504P574ArvDteL;
            protected  int beginIp65504P575DepDteS;
            protected  int beginIp65504P575DepDteL;
            protected  int beginIp65504P576FolioNS;
            protected  int beginIp65504P576FolioNL;
            protected  int beginIp65504P577PrpTelS;
            protected  int beginIp65504P577PrpTelL;
            protected  int beginIp65504P578BilAdjS;
            protected  int beginIp65504P578BilAdjL;
            protected  int beginIp65504P579ReservdS;
            protected  int beginIp65504P579ReservdL;
            protected  int beginIp65504P580RoomRtS;
            protected  int beginIp65504P580RoomRtL;
            protected  int beginIp65504P581RoomTxS;
            protected  int beginIp65504P581RoomTxL;
            protected  int beginIp65504P582PgmCodS;
            protected  int beginIp65504P582PgmCodL;
            protected  int beginIp65504P583TelChgS;
            protected  int beginIp65504P583TelChgL;
            protected  int beginIp65504P584RstChgS;
            protected  int beginIp65504P584RstChgL;
            protected  int beginIp65504P585BarChgS;
            protected  int beginIp65504P585BarChgL;
            protected  int beginIp65504P586GifChgS;
            protected  int beginIp65504P586GifChgL;
            protected  int beginIp65504P587LauChgS;
            protected  int beginIp65504P587LauChgL;
            protected  int beginIp65504P588OthSvcS;
            protected  int beginIp65504P588OthSvcL;
            protected  int beginIp65504P589ReservdS;
            protected  int beginIp65504P589ReservdL;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup19Serialized
	**/
    public Ip65504PdsNamesLargeGroup19Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup19Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup19Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup19Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,4460); // serialize this field at offset 4460 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup19Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 4460 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup19Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_19_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P559VehInsS = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P559VehInsL = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P560ReservdS = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P560ReservdL = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P561AdjAmtS = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P561AdjAmtL = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P562ReservdS = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P562ReservdL = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P563PgmCodS = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P563PgmCodL = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P564RntcityS = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P564RntcityL = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P565RentStS = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P565RentStL = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P566RntctryS = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P566RntctryL = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P567RntLocS = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P567RntLocL = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P568RntClsS = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P568RntClsL = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P569ReservdS = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P569ReservdL = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P570ReservdS = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P570ReservdL = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P571ReservdS = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P571ReservdL = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P572ReservdS = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P572ReservdL = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P573ReservdS = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P573ReservdL = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P574ArvDteS = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P574ArvDteL = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P575DepDteS = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P575DepDteL = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P576FolioNS = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P576FolioNL = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P577PrpTelS = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P577PrpTelL = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P578BilAdjS = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P578BilAdjL = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P579ReservdS = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P579ReservdL = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P580RoomRtS = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P580RoomRtL = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P581RoomTxS = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P581RoomTxL = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P582PgmCodS = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P582PgmCodL = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P583TelChgS = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P583TelChgL = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P584RstChgS = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P584RstChgL = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P585BarChgS = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P585BarChgL = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P586GifChgS = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P586GifChgL = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P587LauChgS = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P587LauChgL = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P588OthSvcS = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P588OthSvcL = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P589ReservdS = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P589ReservdL = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P559VehInsSCounter = -1;
         public boolean isIp65504P559VehInsSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P559VehInsSCounter != sharedCounter;
            localIp65504P559VehInsSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_559_VEH_INS_S_LEN = 2;
  	/**
	 * serializeIp65504P559VehInsS
	 */
	protected void serializeIp65504P559VehInsS(short ip65504P559VehInsS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P559VehInsS,IP_65504_P_559_VEH_INS_S_LEN)
                  ,beginIp65504P559VehInsS
                  ,IP_65504_P_559_VEH_INS_S_LEN
                 );
            localIp65504P559VehInsSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P559VehInsSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P559VehInsS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P559VehInsS() {	 
			return (getShort(beginIp65504P559VehInsS));
   	}
         int localIp65504P559VehInsLCounter = -1;
         public boolean isIp65504P559VehInsLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P559VehInsLCounter != sharedCounter;
            localIp65504P559VehInsLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_559_VEH_INS_L_LEN = 2;
  	/**
	 * serializeIp65504P559VehInsL
	 */
	protected void serializeIp65504P559VehInsL(short ip65504P559VehInsL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P559VehInsL,IP_65504_P_559_VEH_INS_L_LEN)
                  ,beginIp65504P559VehInsL
                  ,IP_65504_P_559_VEH_INS_L_LEN
                 );
            localIp65504P559VehInsLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P559VehInsLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P559VehInsL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P559VehInsL() {	 
			return (getShort(beginIp65504P559VehInsL));
   	}
         int localIp65504P560ReservdSCounter = -1;
         public boolean isIp65504P560ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P560ReservdSCounter != sharedCounter;
            localIp65504P560ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_560_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P560ReservdS
	 */
	protected void serializeIp65504P560ReservdS(short ip65504P560ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P560ReservdS,IP_65504_P_560_RESERVD_S_LEN)
                  ,beginIp65504P560ReservdS
                  ,IP_65504_P_560_RESERVD_S_LEN
                 );
            localIp65504P560ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P560ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P560ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P560ReservdS() {	 
			return (getShort(beginIp65504P560ReservdS));
   	}
         int localIp65504P560ReservdLCounter = -1;
         public boolean isIp65504P560ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P560ReservdLCounter != sharedCounter;
            localIp65504P560ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_560_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P560ReservdL
	 */
	protected void serializeIp65504P560ReservdL(short ip65504P560ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P560ReservdL,IP_65504_P_560_RESERVD_L_LEN)
                  ,beginIp65504P560ReservdL
                  ,IP_65504_P_560_RESERVD_L_LEN
                 );
            localIp65504P560ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P560ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P560ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P560ReservdL() {	 
			return (getShort(beginIp65504P560ReservdL));
   	}
         int localIp65504P561AdjAmtSCounter = -1;
         public boolean isIp65504P561AdjAmtSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P561AdjAmtSCounter != sharedCounter;
            localIp65504P561AdjAmtSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_561_ADJ_AMT_S_LEN = 2;
  	/**
	 * serializeIp65504P561AdjAmtS
	 */
	protected void serializeIp65504P561AdjAmtS(short ip65504P561AdjAmtS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P561AdjAmtS,IP_65504_P_561_ADJ_AMT_S_LEN)
                  ,beginIp65504P561AdjAmtS
                  ,IP_65504_P_561_ADJ_AMT_S_LEN
                 );
            localIp65504P561AdjAmtSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P561AdjAmtSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P561AdjAmtS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P561AdjAmtS() {	 
			return (getShort(beginIp65504P561AdjAmtS));
   	}
         int localIp65504P561AdjAmtLCounter = -1;
         public boolean isIp65504P561AdjAmtLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P561AdjAmtLCounter != sharedCounter;
            localIp65504P561AdjAmtLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_561_ADJ_AMT_L_LEN = 2;
  	/**
	 * serializeIp65504P561AdjAmtL
	 */
	protected void serializeIp65504P561AdjAmtL(short ip65504P561AdjAmtL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P561AdjAmtL,IP_65504_P_561_ADJ_AMT_L_LEN)
                  ,beginIp65504P561AdjAmtL
                  ,IP_65504_P_561_ADJ_AMT_L_LEN
                 );
            localIp65504P561AdjAmtLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P561AdjAmtLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P561AdjAmtL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P561AdjAmtL() {	 
			return (getShort(beginIp65504P561AdjAmtL));
   	}
         int localIp65504P562ReservdSCounter = -1;
         public boolean isIp65504P562ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P562ReservdSCounter != sharedCounter;
            localIp65504P562ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_562_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P562ReservdS
	 */
	protected void serializeIp65504P562ReservdS(short ip65504P562ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P562ReservdS,IP_65504_P_562_RESERVD_S_LEN)
                  ,beginIp65504P562ReservdS
                  ,IP_65504_P_562_RESERVD_S_LEN
                 );
            localIp65504P562ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P562ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P562ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P562ReservdS() {	 
			return (getShort(beginIp65504P562ReservdS));
   	}
         int localIp65504P562ReservdLCounter = -1;
         public boolean isIp65504P562ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P562ReservdLCounter != sharedCounter;
            localIp65504P562ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_562_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P562ReservdL
	 */
	protected void serializeIp65504P562ReservdL(short ip65504P562ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P562ReservdL,IP_65504_P_562_RESERVD_L_LEN)
                  ,beginIp65504P562ReservdL
                  ,IP_65504_P_562_RESERVD_L_LEN
                 );
            localIp65504P562ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P562ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P562ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P562ReservdL() {	 
			return (getShort(beginIp65504P562ReservdL));
   	}
         int localIp65504P563PgmCodSCounter = -1;
         public boolean isIp65504P563PgmCodSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P563PgmCodSCounter != sharedCounter;
            localIp65504P563PgmCodSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_563_PGM_COD_S_LEN = 2;
  	/**
	 * serializeIp65504P563PgmCodS
	 */
	protected void serializeIp65504P563PgmCodS(short ip65504P563PgmCodS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P563PgmCodS,IP_65504_P_563_PGM_COD_S_LEN)
                  ,beginIp65504P563PgmCodS
                  ,IP_65504_P_563_PGM_COD_S_LEN
                 );
            localIp65504P563PgmCodSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P563PgmCodSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P563PgmCodS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P563PgmCodS() {	 
			return (getShort(beginIp65504P563PgmCodS));
   	}
         int localIp65504P563PgmCodLCounter = -1;
         public boolean isIp65504P563PgmCodLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P563PgmCodLCounter != sharedCounter;
            localIp65504P563PgmCodLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_563_PGM_COD_L_LEN = 2;
  	/**
	 * serializeIp65504P563PgmCodL
	 */
	protected void serializeIp65504P563PgmCodL(short ip65504P563PgmCodL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P563PgmCodL,IP_65504_P_563_PGM_COD_L_LEN)
                  ,beginIp65504P563PgmCodL
                  ,IP_65504_P_563_PGM_COD_L_LEN
                 );
            localIp65504P563PgmCodLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P563PgmCodLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P563PgmCodL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P563PgmCodL() {	 
			return (getShort(beginIp65504P563PgmCodL));
   	}
         int localIp65504P564RntcitySCounter = -1;
         public boolean isIp65504P564RntcitySModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P564RntcitySCounter != sharedCounter;
            localIp65504P564RntcitySCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_564_RNTCITY_S_LEN = 2;
  	/**
	 * serializeIp65504P564RntcityS
	 */
	protected void serializeIp65504P564RntcityS(short ip65504P564RntcityS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P564RntcityS,IP_65504_P_564_RNTCITY_S_LEN)
                  ,beginIp65504P564RntcityS
                  ,IP_65504_P_564_RNTCITY_S_LEN
                 );
            localIp65504P564RntcitySCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P564RntcitySMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P564RntcityS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P564RntcityS() {	 
			return (getShort(beginIp65504P564RntcityS));
   	}
         int localIp65504P564RntcityLCounter = -1;
         public boolean isIp65504P564RntcityLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P564RntcityLCounter != sharedCounter;
            localIp65504P564RntcityLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_564_RNTCITY_L_LEN = 2;
  	/**
	 * serializeIp65504P564RntcityL
	 */
	protected void serializeIp65504P564RntcityL(short ip65504P564RntcityL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P564RntcityL,IP_65504_P_564_RNTCITY_L_LEN)
                  ,beginIp65504P564RntcityL
                  ,IP_65504_P_564_RNTCITY_L_LEN
                 );
            localIp65504P564RntcityLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P564RntcityLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P564RntcityL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P564RntcityL() {	 
			return (getShort(beginIp65504P564RntcityL));
   	}
         int localIp65504P565RentStSCounter = -1;
         public boolean isIp65504P565RentStSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P565RentStSCounter != sharedCounter;
            localIp65504P565RentStSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_565_RENT_ST_S_LEN = 2;
  	/**
	 * serializeIp65504P565RentStS
	 */
	protected void serializeIp65504P565RentStS(short ip65504P565RentStS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P565RentStS,IP_65504_P_565_RENT_ST_S_LEN)
                  ,beginIp65504P565RentStS
                  ,IP_65504_P_565_RENT_ST_S_LEN
                 );
            localIp65504P565RentStSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P565RentStSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P565RentStS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P565RentStS() {	 
			return (getShort(beginIp65504P565RentStS));
   	}
         int localIp65504P565RentStLCounter = -1;
         public boolean isIp65504P565RentStLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P565RentStLCounter != sharedCounter;
            localIp65504P565RentStLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_565_RENT_ST_L_LEN = 2;
  	/**
	 * serializeIp65504P565RentStL
	 */
	protected void serializeIp65504P565RentStL(short ip65504P565RentStL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P565RentStL,IP_65504_P_565_RENT_ST_L_LEN)
                  ,beginIp65504P565RentStL
                  ,IP_65504_P_565_RENT_ST_L_LEN
                 );
            localIp65504P565RentStLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P565RentStLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P565RentStL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P565RentStL() {	 
			return (getShort(beginIp65504P565RentStL));
   	}
         int localIp65504P566RntctrySCounter = -1;
         public boolean isIp65504P566RntctrySModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P566RntctrySCounter != sharedCounter;
            localIp65504P566RntctrySCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_566_RNTCTRY_S_LEN = 2;
  	/**
	 * serializeIp65504P566RntctryS
	 */
	protected void serializeIp65504P566RntctryS(short ip65504P566RntctryS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P566RntctryS,IP_65504_P_566_RNTCTRY_S_LEN)
                  ,beginIp65504P566RntctryS
                  ,IP_65504_P_566_RNTCTRY_S_LEN
                 );
            localIp65504P566RntctrySCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P566RntctrySMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P566RntctryS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P566RntctryS() {	 
			return (getShort(beginIp65504P566RntctryS));
   	}
         int localIp65504P566RntctryLCounter = -1;
         public boolean isIp65504P566RntctryLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P566RntctryLCounter != sharedCounter;
            localIp65504P566RntctryLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_566_RNTCTRY_L_LEN = 2;
  	/**
	 * serializeIp65504P566RntctryL
	 */
	protected void serializeIp65504P566RntctryL(short ip65504P566RntctryL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P566RntctryL,IP_65504_P_566_RNTCTRY_L_LEN)
                  ,beginIp65504P566RntctryL
                  ,IP_65504_P_566_RNTCTRY_L_LEN
                 );
            localIp65504P566RntctryLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P566RntctryLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P566RntctryL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P566RntctryL() {	 
			return (getShort(beginIp65504P566RntctryL));
   	}
         int localIp65504P567RntLocSCounter = -1;
         public boolean isIp65504P567RntLocSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P567RntLocSCounter != sharedCounter;
            localIp65504P567RntLocSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_567_RNT_LOC_S_LEN = 2;
  	/**
	 * serializeIp65504P567RntLocS
	 */
	protected void serializeIp65504P567RntLocS(short ip65504P567RntLocS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P567RntLocS,IP_65504_P_567_RNT_LOC_S_LEN)
                  ,beginIp65504P567RntLocS
                  ,IP_65504_P_567_RNT_LOC_S_LEN
                 );
            localIp65504P567RntLocSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P567RntLocSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P567RntLocS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P567RntLocS() {	 
			return (getShort(beginIp65504P567RntLocS));
   	}
         int localIp65504P567RntLocLCounter = -1;
         public boolean isIp65504P567RntLocLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P567RntLocLCounter != sharedCounter;
            localIp65504P567RntLocLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_567_RNT_LOC_L_LEN = 2;
  	/**
	 * serializeIp65504P567RntLocL
	 */
	protected void serializeIp65504P567RntLocL(short ip65504P567RntLocL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P567RntLocL,IP_65504_P_567_RNT_LOC_L_LEN)
                  ,beginIp65504P567RntLocL
                  ,IP_65504_P_567_RNT_LOC_L_LEN
                 );
            localIp65504P567RntLocLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P567RntLocLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P567RntLocL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P567RntLocL() {	 
			return (getShort(beginIp65504P567RntLocL));
   	}
         int localIp65504P568RntClsSCounter = -1;
         public boolean isIp65504P568RntClsSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P568RntClsSCounter != sharedCounter;
            localIp65504P568RntClsSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_568_RNT_CLS_S_LEN = 2;
  	/**
	 * serializeIp65504P568RntClsS
	 */
	protected void serializeIp65504P568RntClsS(short ip65504P568RntClsS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P568RntClsS,IP_65504_P_568_RNT_CLS_S_LEN)
                  ,beginIp65504P568RntClsS
                  ,IP_65504_P_568_RNT_CLS_S_LEN
                 );
            localIp65504P568RntClsSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P568RntClsSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P568RntClsS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P568RntClsS() {	 
			return (getShort(beginIp65504P568RntClsS));
   	}
         int localIp65504P568RntClsLCounter = -1;
         public boolean isIp65504P568RntClsLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P568RntClsLCounter != sharedCounter;
            localIp65504P568RntClsLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_568_RNT_CLS_L_LEN = 2;
  	/**
	 * serializeIp65504P568RntClsL
	 */
	protected void serializeIp65504P568RntClsL(short ip65504P568RntClsL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P568RntClsL,IP_65504_P_568_RNT_CLS_L_LEN)
                  ,beginIp65504P568RntClsL
                  ,IP_65504_P_568_RNT_CLS_L_LEN
                 );
            localIp65504P568RntClsLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P568RntClsLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P568RntClsL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P568RntClsL() {	 
			return (getShort(beginIp65504P568RntClsL));
   	}
         int localIp65504P569ReservdSCounter = -1;
         public boolean isIp65504P569ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P569ReservdSCounter != sharedCounter;
            localIp65504P569ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_569_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P569ReservdS
	 */
	protected void serializeIp65504P569ReservdS(short ip65504P569ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P569ReservdS,IP_65504_P_569_RESERVD_S_LEN)
                  ,beginIp65504P569ReservdS
                  ,IP_65504_P_569_RESERVD_S_LEN
                 );
            localIp65504P569ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P569ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P569ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P569ReservdS() {	 
			return (getShort(beginIp65504P569ReservdS));
   	}
         int localIp65504P569ReservdLCounter = -1;
         public boolean isIp65504P569ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P569ReservdLCounter != sharedCounter;
            localIp65504P569ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_569_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P569ReservdL
	 */
	protected void serializeIp65504P569ReservdL(short ip65504P569ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P569ReservdL,IP_65504_P_569_RESERVD_L_LEN)
                  ,beginIp65504P569ReservdL
                  ,IP_65504_P_569_RESERVD_L_LEN
                 );
            localIp65504P569ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P569ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P569ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P569ReservdL() {	 
			return (getShort(beginIp65504P569ReservdL));
   	}
         int localIp65504P570ReservdSCounter = -1;
         public boolean isIp65504P570ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P570ReservdSCounter != sharedCounter;
            localIp65504P570ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_570_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P570ReservdS
	 */
	protected void serializeIp65504P570ReservdS(short ip65504P570ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P570ReservdS,IP_65504_P_570_RESERVD_S_LEN)
                  ,beginIp65504P570ReservdS
                  ,IP_65504_P_570_RESERVD_S_LEN
                 );
            localIp65504P570ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P570ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P570ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P570ReservdS() {	 
			return (getShort(beginIp65504P570ReservdS));
   	}
         int localIp65504P570ReservdLCounter = -1;
         public boolean isIp65504P570ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P570ReservdLCounter != sharedCounter;
            localIp65504P570ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_570_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P570ReservdL
	 */
	protected void serializeIp65504P570ReservdL(short ip65504P570ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P570ReservdL,IP_65504_P_570_RESERVD_L_LEN)
                  ,beginIp65504P570ReservdL
                  ,IP_65504_P_570_RESERVD_L_LEN
                 );
            localIp65504P570ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P570ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P570ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P570ReservdL() {	 
			return (getShort(beginIp65504P570ReservdL));
   	}
         int localIp65504P571ReservdSCounter = -1;
         public boolean isIp65504P571ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P571ReservdSCounter != sharedCounter;
            localIp65504P571ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_571_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P571ReservdS
	 */
	protected void serializeIp65504P571ReservdS(short ip65504P571ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P571ReservdS,IP_65504_P_571_RESERVD_S_LEN)
                  ,beginIp65504P571ReservdS
                  ,IP_65504_P_571_RESERVD_S_LEN
                 );
            localIp65504P571ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P571ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P571ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P571ReservdS() {	 
			return (getShort(beginIp65504P571ReservdS));
   	}
         int localIp65504P571ReservdLCounter = -1;
         public boolean isIp65504P571ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P571ReservdLCounter != sharedCounter;
            localIp65504P571ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_571_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P571ReservdL
	 */
	protected void serializeIp65504P571ReservdL(short ip65504P571ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P571ReservdL,IP_65504_P_571_RESERVD_L_LEN)
                  ,beginIp65504P571ReservdL
                  ,IP_65504_P_571_RESERVD_L_LEN
                 );
            localIp65504P571ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P571ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P571ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P571ReservdL() {	 
			return (getShort(beginIp65504P571ReservdL));
   	}
         int localIp65504P572ReservdSCounter = -1;
         public boolean isIp65504P572ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P572ReservdSCounter != sharedCounter;
            localIp65504P572ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_572_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P572ReservdS
	 */
	protected void serializeIp65504P572ReservdS(short ip65504P572ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P572ReservdS,IP_65504_P_572_RESERVD_S_LEN)
                  ,beginIp65504P572ReservdS
                  ,IP_65504_P_572_RESERVD_S_LEN
                 );
            localIp65504P572ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P572ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P572ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P572ReservdS() {	 
			return (getShort(beginIp65504P572ReservdS));
   	}
         int localIp65504P572ReservdLCounter = -1;
         public boolean isIp65504P572ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P572ReservdLCounter != sharedCounter;
            localIp65504P572ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_572_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P572ReservdL
	 */
	protected void serializeIp65504P572ReservdL(short ip65504P572ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P572ReservdL,IP_65504_P_572_RESERVD_L_LEN)
                  ,beginIp65504P572ReservdL
                  ,IP_65504_P_572_RESERVD_L_LEN
                 );
            localIp65504P572ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P572ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P572ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P572ReservdL() {	 
			return (getShort(beginIp65504P572ReservdL));
   	}
         int localIp65504P573ReservdSCounter = -1;
         public boolean isIp65504P573ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P573ReservdSCounter != sharedCounter;
            localIp65504P573ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_573_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P573ReservdS
	 */
	protected void serializeIp65504P573ReservdS(short ip65504P573ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P573ReservdS,IP_65504_P_573_RESERVD_S_LEN)
                  ,beginIp65504P573ReservdS
                  ,IP_65504_P_573_RESERVD_S_LEN
                 );
            localIp65504P573ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P573ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P573ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P573ReservdS() {	 
			return (getShort(beginIp65504P573ReservdS));
   	}
         int localIp65504P573ReservdLCounter = -1;
         public boolean isIp65504P573ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P573ReservdLCounter != sharedCounter;
            localIp65504P573ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_573_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P573ReservdL
	 */
	protected void serializeIp65504P573ReservdL(short ip65504P573ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P573ReservdL,IP_65504_P_573_RESERVD_L_LEN)
                  ,beginIp65504P573ReservdL
                  ,IP_65504_P_573_RESERVD_L_LEN
                 );
            localIp65504P573ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P573ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P573ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P573ReservdL() {	 
			return (getShort(beginIp65504P573ReservdL));
   	}
         int localIp65504P574ArvDteSCounter = -1;
         public boolean isIp65504P574ArvDteSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P574ArvDteSCounter != sharedCounter;
            localIp65504P574ArvDteSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_574_ARV_DTE_S_LEN = 2;
  	/**
	 * serializeIp65504P574ArvDteS
	 */
	protected void serializeIp65504P574ArvDteS(short ip65504P574ArvDteS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P574ArvDteS,IP_65504_P_574_ARV_DTE_S_LEN)
                  ,beginIp65504P574ArvDteS
                  ,IP_65504_P_574_ARV_DTE_S_LEN
                 );
            localIp65504P574ArvDteSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P574ArvDteSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P574ArvDteS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P574ArvDteS() {	 
			return (getShort(beginIp65504P574ArvDteS));
   	}
         int localIp65504P574ArvDteLCounter = -1;
         public boolean isIp65504P574ArvDteLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P574ArvDteLCounter != sharedCounter;
            localIp65504P574ArvDteLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_574_ARV_DTE_L_LEN = 2;
  	/**
	 * serializeIp65504P574ArvDteL
	 */
	protected void serializeIp65504P574ArvDteL(short ip65504P574ArvDteL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P574ArvDteL,IP_65504_P_574_ARV_DTE_L_LEN)
                  ,beginIp65504P574ArvDteL
                  ,IP_65504_P_574_ARV_DTE_L_LEN
                 );
            localIp65504P574ArvDteLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P574ArvDteLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P574ArvDteL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P574ArvDteL() {	 
			return (getShort(beginIp65504P574ArvDteL));
   	}
         int localIp65504P575DepDteSCounter = -1;
         public boolean isIp65504P575DepDteSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P575DepDteSCounter != sharedCounter;
            localIp65504P575DepDteSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_575_DEP_DTE_S_LEN = 2;
  	/**
	 * serializeIp65504P575DepDteS
	 */
	protected void serializeIp65504P575DepDteS(short ip65504P575DepDteS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P575DepDteS,IP_65504_P_575_DEP_DTE_S_LEN)
                  ,beginIp65504P575DepDteS
                  ,IP_65504_P_575_DEP_DTE_S_LEN
                 );
            localIp65504P575DepDteSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P575DepDteSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P575DepDteS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P575DepDteS() {	 
			return (getShort(beginIp65504P575DepDteS));
   	}
         int localIp65504P575DepDteLCounter = -1;
         public boolean isIp65504P575DepDteLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P575DepDteLCounter != sharedCounter;
            localIp65504P575DepDteLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_575_DEP_DTE_L_LEN = 2;
  	/**
	 * serializeIp65504P575DepDteL
	 */
	protected void serializeIp65504P575DepDteL(short ip65504P575DepDteL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P575DepDteL,IP_65504_P_575_DEP_DTE_L_LEN)
                  ,beginIp65504P575DepDteL
                  ,IP_65504_P_575_DEP_DTE_L_LEN
                 );
            localIp65504P575DepDteLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P575DepDteLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P575DepDteL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P575DepDteL() {	 
			return (getShort(beginIp65504P575DepDteL));
   	}
         int localIp65504P576FolioNSCounter = -1;
         public boolean isIp65504P576FolioNSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P576FolioNSCounter != sharedCounter;
            localIp65504P576FolioNSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_576_FOLIO_NS_LEN = 2;
  	/**
	 * serializeIp65504P576FolioNS
	 */
	protected void serializeIp65504P576FolioNS(short ip65504P576FolioNS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P576FolioNS,IP_65504_P_576_FOLIO_NS_LEN)
                  ,beginIp65504P576FolioNS
                  ,IP_65504_P_576_FOLIO_NS_LEN
                 );
            localIp65504P576FolioNSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P576FolioNSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P576FolioNS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P576FolioNS() {	 
			return (getShort(beginIp65504P576FolioNS));
   	}
         int localIp65504P576FolioNLCounter = -1;
         public boolean isIp65504P576FolioNLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P576FolioNLCounter != sharedCounter;
            localIp65504P576FolioNLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_576_FOLIO_NL_LEN = 2;
  	/**
	 * serializeIp65504P576FolioNL
	 */
	protected void serializeIp65504P576FolioNL(short ip65504P576FolioNL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P576FolioNL,IP_65504_P_576_FOLIO_NL_LEN)
                  ,beginIp65504P576FolioNL
                  ,IP_65504_P_576_FOLIO_NL_LEN
                 );
            localIp65504P576FolioNLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P576FolioNLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P576FolioNL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P576FolioNL() {	 
			return (getShort(beginIp65504P576FolioNL));
   	}
         int localIp65504P577PrpTelSCounter = -1;
         public boolean isIp65504P577PrpTelSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P577PrpTelSCounter != sharedCounter;
            localIp65504P577PrpTelSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_577_PRP_TEL_S_LEN = 2;
  	/**
	 * serializeIp65504P577PrpTelS
	 */
	protected void serializeIp65504P577PrpTelS(short ip65504P577PrpTelS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P577PrpTelS,IP_65504_P_577_PRP_TEL_S_LEN)
                  ,beginIp65504P577PrpTelS
                  ,IP_65504_P_577_PRP_TEL_S_LEN
                 );
            localIp65504P577PrpTelSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P577PrpTelSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P577PrpTelS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P577PrpTelS() {	 
			return (getShort(beginIp65504P577PrpTelS));
   	}
         int localIp65504P577PrpTelLCounter = -1;
         public boolean isIp65504P577PrpTelLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P577PrpTelLCounter != sharedCounter;
            localIp65504P577PrpTelLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_577_PRP_TEL_L_LEN = 2;
  	/**
	 * serializeIp65504P577PrpTelL
	 */
	protected void serializeIp65504P577PrpTelL(short ip65504P577PrpTelL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P577PrpTelL,IP_65504_P_577_PRP_TEL_L_LEN)
                  ,beginIp65504P577PrpTelL
                  ,IP_65504_P_577_PRP_TEL_L_LEN
                 );
            localIp65504P577PrpTelLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P577PrpTelLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P577PrpTelL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P577PrpTelL() {	 
			return (getShort(beginIp65504P577PrpTelL));
   	}
         int localIp65504P578BilAdjSCounter = -1;
         public boolean isIp65504P578BilAdjSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P578BilAdjSCounter != sharedCounter;
            localIp65504P578BilAdjSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_578_BIL_ADJ_S_LEN = 2;
  	/**
	 * serializeIp65504P578BilAdjS
	 */
	protected void serializeIp65504P578BilAdjS(short ip65504P578BilAdjS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P578BilAdjS,IP_65504_P_578_BIL_ADJ_S_LEN)
                  ,beginIp65504P578BilAdjS
                  ,IP_65504_P_578_BIL_ADJ_S_LEN
                 );
            localIp65504P578BilAdjSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P578BilAdjSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P578BilAdjS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P578BilAdjS() {	 
			return (getShort(beginIp65504P578BilAdjS));
   	}
         int localIp65504P578BilAdjLCounter = -1;
         public boolean isIp65504P578BilAdjLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P578BilAdjLCounter != sharedCounter;
            localIp65504P578BilAdjLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_578_BIL_ADJ_L_LEN = 2;
  	/**
	 * serializeIp65504P578BilAdjL
	 */
	protected void serializeIp65504P578BilAdjL(short ip65504P578BilAdjL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P578BilAdjL,IP_65504_P_578_BIL_ADJ_L_LEN)
                  ,beginIp65504P578BilAdjL
                  ,IP_65504_P_578_BIL_ADJ_L_LEN
                 );
            localIp65504P578BilAdjLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P578BilAdjLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P578BilAdjL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P578BilAdjL() {	 
			return (getShort(beginIp65504P578BilAdjL));
   	}
         int localIp65504P579ReservdSCounter = -1;
         public boolean isIp65504P579ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P579ReservdSCounter != sharedCounter;
            localIp65504P579ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_579_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P579ReservdS
	 */
	protected void serializeIp65504P579ReservdS(short ip65504P579ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P579ReservdS,IP_65504_P_579_RESERVD_S_LEN)
                  ,beginIp65504P579ReservdS
                  ,IP_65504_P_579_RESERVD_S_LEN
                 );
            localIp65504P579ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P579ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P579ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P579ReservdS() {	 
			return (getShort(beginIp65504P579ReservdS));
   	}
         int localIp65504P579ReservdLCounter = -1;
         public boolean isIp65504P579ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P579ReservdLCounter != sharedCounter;
            localIp65504P579ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_579_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P579ReservdL
	 */
	protected void serializeIp65504P579ReservdL(short ip65504P579ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P579ReservdL,IP_65504_P_579_RESERVD_L_LEN)
                  ,beginIp65504P579ReservdL
                  ,IP_65504_P_579_RESERVD_L_LEN
                 );
            localIp65504P579ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P579ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P579ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P579ReservdL() {	 
			return (getShort(beginIp65504P579ReservdL));
   	}
         int localIp65504P580RoomRtSCounter = -1;
         public boolean isIp65504P580RoomRtSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P580RoomRtSCounter != sharedCounter;
            localIp65504P580RoomRtSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_580_ROOM_RT_S_LEN = 2;
  	/**
	 * serializeIp65504P580RoomRtS
	 */
	protected void serializeIp65504P580RoomRtS(short ip65504P580RoomRtS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P580RoomRtS,IP_65504_P_580_ROOM_RT_S_LEN)
                  ,beginIp65504P580RoomRtS
                  ,IP_65504_P_580_ROOM_RT_S_LEN
                 );
            localIp65504P580RoomRtSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P580RoomRtSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P580RoomRtS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P580RoomRtS() {	 
			return (getShort(beginIp65504P580RoomRtS));
   	}
         int localIp65504P580RoomRtLCounter = -1;
         public boolean isIp65504P580RoomRtLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P580RoomRtLCounter != sharedCounter;
            localIp65504P580RoomRtLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_580_ROOM_RT_L_LEN = 2;
  	/**
	 * serializeIp65504P580RoomRtL
	 */
	protected void serializeIp65504P580RoomRtL(short ip65504P580RoomRtL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P580RoomRtL,IP_65504_P_580_ROOM_RT_L_LEN)
                  ,beginIp65504P580RoomRtL
                  ,IP_65504_P_580_ROOM_RT_L_LEN
                 );
            localIp65504P580RoomRtLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P580RoomRtLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P580RoomRtL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P580RoomRtL() {	 
			return (getShort(beginIp65504P580RoomRtL));
   	}
         int localIp65504P581RoomTxSCounter = -1;
         public boolean isIp65504P581RoomTxSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P581RoomTxSCounter != sharedCounter;
            localIp65504P581RoomTxSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_581_ROOM_TX_S_LEN = 2;
  	/**
	 * serializeIp65504P581RoomTxS
	 */
	protected void serializeIp65504P581RoomTxS(short ip65504P581RoomTxS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P581RoomTxS,IP_65504_P_581_ROOM_TX_S_LEN)
                  ,beginIp65504P581RoomTxS
                  ,IP_65504_P_581_ROOM_TX_S_LEN
                 );
            localIp65504P581RoomTxSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P581RoomTxSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P581RoomTxS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P581RoomTxS() {	 
			return (getShort(beginIp65504P581RoomTxS));
   	}
         int localIp65504P581RoomTxLCounter = -1;
         public boolean isIp65504P581RoomTxLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P581RoomTxLCounter != sharedCounter;
            localIp65504P581RoomTxLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_581_ROOM_TX_L_LEN = 2;
  	/**
	 * serializeIp65504P581RoomTxL
	 */
	protected void serializeIp65504P581RoomTxL(short ip65504P581RoomTxL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P581RoomTxL,IP_65504_P_581_ROOM_TX_L_LEN)
                  ,beginIp65504P581RoomTxL
                  ,IP_65504_P_581_ROOM_TX_L_LEN
                 );
            localIp65504P581RoomTxLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P581RoomTxLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P581RoomTxL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P581RoomTxL() {	 
			return (getShort(beginIp65504P581RoomTxL));
   	}
         int localIp65504P582PgmCodSCounter = -1;
         public boolean isIp65504P582PgmCodSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P582PgmCodSCounter != sharedCounter;
            localIp65504P582PgmCodSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_582_PGM_COD_S_LEN = 2;
  	/**
	 * serializeIp65504P582PgmCodS
	 */
	protected void serializeIp65504P582PgmCodS(short ip65504P582PgmCodS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P582PgmCodS,IP_65504_P_582_PGM_COD_S_LEN)
                  ,beginIp65504P582PgmCodS
                  ,IP_65504_P_582_PGM_COD_S_LEN
                 );
            localIp65504P582PgmCodSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P582PgmCodSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P582PgmCodS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P582PgmCodS() {	 
			return (getShort(beginIp65504P582PgmCodS));
   	}
         int localIp65504P582PgmCodLCounter = -1;
         public boolean isIp65504P582PgmCodLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P582PgmCodLCounter != sharedCounter;
            localIp65504P582PgmCodLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_582_PGM_COD_L_LEN = 2;
  	/**
	 * serializeIp65504P582PgmCodL
	 */
	protected void serializeIp65504P582PgmCodL(short ip65504P582PgmCodL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P582PgmCodL,IP_65504_P_582_PGM_COD_L_LEN)
                  ,beginIp65504P582PgmCodL
                  ,IP_65504_P_582_PGM_COD_L_LEN
                 );
            localIp65504P582PgmCodLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P582PgmCodLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P582PgmCodL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P582PgmCodL() {	 
			return (getShort(beginIp65504P582PgmCodL));
   	}
         int localIp65504P583TelChgSCounter = -1;
         public boolean isIp65504P583TelChgSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P583TelChgSCounter != sharedCounter;
            localIp65504P583TelChgSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_583_TEL_CHG_S_LEN = 2;
  	/**
	 * serializeIp65504P583TelChgS
	 */
	protected void serializeIp65504P583TelChgS(short ip65504P583TelChgS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P583TelChgS,IP_65504_P_583_TEL_CHG_S_LEN)
                  ,beginIp65504P583TelChgS
                  ,IP_65504_P_583_TEL_CHG_S_LEN
                 );
            localIp65504P583TelChgSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P583TelChgSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P583TelChgS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P583TelChgS() {	 
			return (getShort(beginIp65504P583TelChgS));
   	}
         int localIp65504P583TelChgLCounter = -1;
         public boolean isIp65504P583TelChgLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P583TelChgLCounter != sharedCounter;
            localIp65504P583TelChgLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_583_TEL_CHG_L_LEN = 2;
  	/**
	 * serializeIp65504P583TelChgL
	 */
	protected void serializeIp65504P583TelChgL(short ip65504P583TelChgL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P583TelChgL,IP_65504_P_583_TEL_CHG_L_LEN)
                  ,beginIp65504P583TelChgL
                  ,IP_65504_P_583_TEL_CHG_L_LEN
                 );
            localIp65504P583TelChgLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P583TelChgLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P583TelChgL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P583TelChgL() {	 
			return (getShort(beginIp65504P583TelChgL));
   	}
         int localIp65504P584RstChgSCounter = -1;
         public boolean isIp65504P584RstChgSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P584RstChgSCounter != sharedCounter;
            localIp65504P584RstChgSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_584_RST_CHG_S_LEN = 2;
  	/**
	 * serializeIp65504P584RstChgS
	 */
	protected void serializeIp65504P584RstChgS(short ip65504P584RstChgS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P584RstChgS,IP_65504_P_584_RST_CHG_S_LEN)
                  ,beginIp65504P584RstChgS
                  ,IP_65504_P_584_RST_CHG_S_LEN
                 );
            localIp65504P584RstChgSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P584RstChgSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P584RstChgS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P584RstChgS() {	 
			return (getShort(beginIp65504P584RstChgS));
   	}
         int localIp65504P584RstChgLCounter = -1;
         public boolean isIp65504P584RstChgLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P584RstChgLCounter != sharedCounter;
            localIp65504P584RstChgLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_584_RST_CHG_L_LEN = 2;
  	/**
	 * serializeIp65504P584RstChgL
	 */
	protected void serializeIp65504P584RstChgL(short ip65504P584RstChgL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P584RstChgL,IP_65504_P_584_RST_CHG_L_LEN)
                  ,beginIp65504P584RstChgL
                  ,IP_65504_P_584_RST_CHG_L_LEN
                 );
            localIp65504P584RstChgLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P584RstChgLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P584RstChgL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P584RstChgL() {	 
			return (getShort(beginIp65504P584RstChgL));
   	}
         int localIp65504P585BarChgSCounter = -1;
         public boolean isIp65504P585BarChgSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P585BarChgSCounter != sharedCounter;
            localIp65504P585BarChgSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_585_BAR_CHG_S_LEN = 2;
  	/**
	 * serializeIp65504P585BarChgS
	 */
	protected void serializeIp65504P585BarChgS(short ip65504P585BarChgS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P585BarChgS,IP_65504_P_585_BAR_CHG_S_LEN)
                  ,beginIp65504P585BarChgS
                  ,IP_65504_P_585_BAR_CHG_S_LEN
                 );
            localIp65504P585BarChgSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P585BarChgSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P585BarChgS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P585BarChgS() {	 
			return (getShort(beginIp65504P585BarChgS));
   	}
         int localIp65504P585BarChgLCounter = -1;
         public boolean isIp65504P585BarChgLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P585BarChgLCounter != sharedCounter;
            localIp65504P585BarChgLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_585_BAR_CHG_L_LEN = 2;
  	/**
	 * serializeIp65504P585BarChgL
	 */
	protected void serializeIp65504P585BarChgL(short ip65504P585BarChgL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P585BarChgL,IP_65504_P_585_BAR_CHG_L_LEN)
                  ,beginIp65504P585BarChgL
                  ,IP_65504_P_585_BAR_CHG_L_LEN
                 );
            localIp65504P585BarChgLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P585BarChgLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P585BarChgL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P585BarChgL() {	 
			return (getShort(beginIp65504P585BarChgL));
   	}
         int localIp65504P586GifChgSCounter = -1;
         public boolean isIp65504P586GifChgSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P586GifChgSCounter != sharedCounter;
            localIp65504P586GifChgSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_586_GIF_CHG_S_LEN = 2;
  	/**
	 * serializeIp65504P586GifChgS
	 */
	protected void serializeIp65504P586GifChgS(short ip65504P586GifChgS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P586GifChgS,IP_65504_P_586_GIF_CHG_S_LEN)
                  ,beginIp65504P586GifChgS
                  ,IP_65504_P_586_GIF_CHG_S_LEN
                 );
            localIp65504P586GifChgSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P586GifChgSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P586GifChgS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P586GifChgS() {	 
			return (getShort(beginIp65504P586GifChgS));
   	}
         int localIp65504P586GifChgLCounter = -1;
         public boolean isIp65504P586GifChgLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P586GifChgLCounter != sharedCounter;
            localIp65504P586GifChgLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_586_GIF_CHG_L_LEN = 2;
  	/**
	 * serializeIp65504P586GifChgL
	 */
	protected void serializeIp65504P586GifChgL(short ip65504P586GifChgL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P586GifChgL,IP_65504_P_586_GIF_CHG_L_LEN)
                  ,beginIp65504P586GifChgL
                  ,IP_65504_P_586_GIF_CHG_L_LEN
                 );
            localIp65504P586GifChgLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P586GifChgLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P586GifChgL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P586GifChgL() {	 
			return (getShort(beginIp65504P586GifChgL));
   	}
         int localIp65504P587LauChgSCounter = -1;
         public boolean isIp65504P587LauChgSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P587LauChgSCounter != sharedCounter;
            localIp65504P587LauChgSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_587_LAU_CHG_S_LEN = 2;
  	/**
	 * serializeIp65504P587LauChgS
	 */
	protected void serializeIp65504P587LauChgS(short ip65504P587LauChgS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P587LauChgS,IP_65504_P_587_LAU_CHG_S_LEN)
                  ,beginIp65504P587LauChgS
                  ,IP_65504_P_587_LAU_CHG_S_LEN
                 );
            localIp65504P587LauChgSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P587LauChgSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P587LauChgS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P587LauChgS() {	 
			return (getShort(beginIp65504P587LauChgS));
   	}
         int localIp65504P587LauChgLCounter = -1;
         public boolean isIp65504P587LauChgLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P587LauChgLCounter != sharedCounter;
            localIp65504P587LauChgLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_587_LAU_CHG_L_LEN = 2;
  	/**
	 * serializeIp65504P587LauChgL
	 */
	protected void serializeIp65504P587LauChgL(short ip65504P587LauChgL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P587LauChgL,IP_65504_P_587_LAU_CHG_L_LEN)
                  ,beginIp65504P587LauChgL
                  ,IP_65504_P_587_LAU_CHG_L_LEN
                 );
            localIp65504P587LauChgLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P587LauChgLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P587LauChgL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P587LauChgL() {	 
			return (getShort(beginIp65504P587LauChgL));
   	}
         int localIp65504P588OthSvcSCounter = -1;
         public boolean isIp65504P588OthSvcSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P588OthSvcSCounter != sharedCounter;
            localIp65504P588OthSvcSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_588_OTH_SVC_S_LEN = 2;
  	/**
	 * serializeIp65504P588OthSvcS
	 */
	protected void serializeIp65504P588OthSvcS(short ip65504P588OthSvcS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P588OthSvcS,IP_65504_P_588_OTH_SVC_S_LEN)
                  ,beginIp65504P588OthSvcS
                  ,IP_65504_P_588_OTH_SVC_S_LEN
                 );
            localIp65504P588OthSvcSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P588OthSvcSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P588OthSvcS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P588OthSvcS() {	 
			return (getShort(beginIp65504P588OthSvcS));
   	}
         int localIp65504P588OthSvcLCounter = -1;
         public boolean isIp65504P588OthSvcLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P588OthSvcLCounter != sharedCounter;
            localIp65504P588OthSvcLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_588_OTH_SVC_L_LEN = 2;
  	/**
	 * serializeIp65504P588OthSvcL
	 */
	protected void serializeIp65504P588OthSvcL(short ip65504P588OthSvcL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P588OthSvcL,IP_65504_P_588_OTH_SVC_L_LEN)
                  ,beginIp65504P588OthSvcL
                  ,IP_65504_P_588_OTH_SVC_L_LEN
                 );
            localIp65504P588OthSvcLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P588OthSvcLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P588OthSvcL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P588OthSvcL() {	 
			return (getShort(beginIp65504P588OthSvcL));
   	}
         int localIp65504P589ReservdSCounter = -1;
         public boolean isIp65504P589ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P589ReservdSCounter != sharedCounter;
            localIp65504P589ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_589_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P589ReservdS
	 */
	protected void serializeIp65504P589ReservdS(short ip65504P589ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P589ReservdS,IP_65504_P_589_RESERVD_S_LEN)
                  ,beginIp65504P589ReservdS
                  ,IP_65504_P_589_RESERVD_S_LEN
                 );
            localIp65504P589ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P589ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P589ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P589ReservdS() {	 
			return (getShort(beginIp65504P589ReservdS));
   	}
         int localIp65504P589ReservdLCounter = -1;
         public boolean isIp65504P589ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P589ReservdLCounter != sharedCounter;
            localIp65504P589ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_589_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P589ReservdL
	 */
	protected void serializeIp65504P589ReservdL(short ip65504P589ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P589ReservdL,IP_65504_P_589_RESERVD_L_LEN)
                  ,beginIp65504P589ReservdL
                  ,IP_65504_P_589_RESERVD_L_LEN
                 );
            localIp65504P589ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P589ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P589ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P589ReservdL() {	 
			return (getShort(beginIp65504P589ReservdL));
   	}




}
  
