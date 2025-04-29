package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup9Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:31. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup9Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup9Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_9_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P249ReservdS;
            protected  int beginIp65504P249ReservdL;
            protected  int beginIp65504P250ReservdS;
            protected  int beginIp65504P250ReservdL;
            protected  int beginIp65504P251FeeBasS;
            protected  int beginIp65504P251FeeBasL;
            protected  int beginIp65504P252ReservdS;
            protected  int beginIp65504P252ReservdL;
            protected  int beginIp65504P253ReservdS;
            protected  int beginIp65504P253ReservdL;
            protected  int beginIp65504P254ReservdS;
            protected  int beginIp65504P254ReservdL;
            protected  int beginIp65504P255ReservdS;
            protected  int beginIp65504P255ReservdL;
            protected  int beginIp65504P256ReservdS;
            protected  int beginIp65504P256ReservdL;
            protected  int beginIp65504P257ReservdS;
            protected  int beginIp65504P257ReservdL;
            protected  int beginIp65504P258ReservdS;
            protected  int beginIp65504P258ReservdL;
            protected  int beginIp65504P259ReservdS;
            protected  int beginIp65504P259ReservdL;
            protected  int beginIp65504P260EdExclS;
            protected  int beginIp65504P260EdExclL;
            protected  int beginIp65504P261FrdTypS;
            protected  int beginIp65504P261FrdTypL;
            protected  int beginIp65504P262DocIndS;
            protected  int beginIp65504P262DocIndL;
            protected  int beginIp65504P263OrigCdS;
            protected  int beginIp65504P263OrigCdL;
            protected  int beginIp65504P264OrgReaS;
            protected  int beginIp65504P264OrgReaL;
            protected  int beginIp65504P265IntPreS;
            protected  int beginIp65504P265IntPreL;
            protected  int beginIp65504P2661stCbkS;
            protected  int beginIp65504P2661stCbkL;
            protected  int beginIp65504P2672ndPreS;
            protected  int beginIp65504P2672ndPreL;
            protected  int beginIp65504P268PtlAmtS;
            protected  int beginIp65504P268PtlAmtL;
            protected  int beginIp65504P269ReservdS;
            protected  int beginIp65504P269ReservdL;
            protected  int beginIp65504P270ReservdS;
            protected  int beginIp65504P270ReservdL;
            protected  int beginIp65504P271ReservdS;
            protected  int beginIp65504P271ReservdL;
            protected  int beginIp65504P272ReservdS;
            protected  int beginIp65504P272ReservdL;
            protected  int beginIp65504P273ReservdS;
            protected  int beginIp65504P273ReservdL;
            protected  int beginIp65504P274ReservdS;
            protected  int beginIp65504P274ReservdL;
            protected  int beginIp65504P275ReservdS;
            protected  int beginIp65504P275ReservdL;
            protected  int beginIp65504P276ReservdS;
            protected  int beginIp65504P276ReservdL;
            protected  int beginIp65504P277ReservdS;
            protected  int beginIp65504P277ReservdL;
            protected  int beginIp65504P278ReservdS;
            protected  int beginIp65504P278ReservdL;
            protected  int beginIp65504P279ReservdS;
            protected  int beginIp65504P279ReservdL;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup9Serialized
	**/
    public Ip65504PdsNamesLargeGroup9Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup9Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup9Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup9Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1980); // serialize this field at offset 1980 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup9Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1980 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup9Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_9_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P249ReservdS = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P249ReservdL = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P250ReservdS = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P250ReservdL = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P251FeeBasS = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P251FeeBasL = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P252ReservdS = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P252ReservdL = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P253ReservdS = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P253ReservdL = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P254ReservdS = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P254ReservdL = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P255ReservdS = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P255ReservdL = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P256ReservdS = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P256ReservdL = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P257ReservdS = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P257ReservdL = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P258ReservdS = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P258ReservdL = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P259ReservdS = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P259ReservdL = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P260EdExclS = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P260EdExclL = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P261FrdTypS = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P261FrdTypL = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P262DocIndS = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P262DocIndL = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P263OrigCdS = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P263OrigCdL = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P264OrgReaS = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P264OrgReaL = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P265IntPreS = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P265IntPreL = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P2661stCbkS = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P2661stCbkL = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P2672ndPreS = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P2672ndPreL = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P268PtlAmtS = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P268PtlAmtL = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P269ReservdS = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P269ReservdL = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P270ReservdS = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P270ReservdL = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P271ReservdS = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P271ReservdL = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P272ReservdS = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P272ReservdL = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P273ReservdS = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P273ReservdL = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P274ReservdS = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P274ReservdL = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P275ReservdS = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P275ReservdL = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P276ReservdS = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P276ReservdL = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P277ReservdS = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P277ReservdL = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P278ReservdS = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P278ReservdL = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P279ReservdS = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P279ReservdL = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P249ReservdSCounter = -1;
         public boolean isIp65504P249ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P249ReservdSCounter != sharedCounter;
            localIp65504P249ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_249_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P249ReservdS
	 */
	protected void serializeIp65504P249ReservdS(short ip65504P249ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P249ReservdS,IP_65504_P_249_RESERVD_S_LEN)
                  ,beginIp65504P249ReservdS
                  ,IP_65504_P_249_RESERVD_S_LEN
                 );
            localIp65504P249ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P249ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P249ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P249ReservdS() {	 
			return (getShort(beginIp65504P249ReservdS));
   	}
         int localIp65504P249ReservdLCounter = -1;
         public boolean isIp65504P249ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P249ReservdLCounter != sharedCounter;
            localIp65504P249ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_249_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P249ReservdL
	 */
	protected void serializeIp65504P249ReservdL(short ip65504P249ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P249ReservdL,IP_65504_P_249_RESERVD_L_LEN)
                  ,beginIp65504P249ReservdL
                  ,IP_65504_P_249_RESERVD_L_LEN
                 );
            localIp65504P249ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P249ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P249ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P249ReservdL() {	 
			return (getShort(beginIp65504P249ReservdL));
   	}
         int localIp65504P250ReservdSCounter = -1;
         public boolean isIp65504P250ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P250ReservdSCounter != sharedCounter;
            localIp65504P250ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_250_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P250ReservdS
	 */
	protected void serializeIp65504P250ReservdS(short ip65504P250ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P250ReservdS,IP_65504_P_250_RESERVD_S_LEN)
                  ,beginIp65504P250ReservdS
                  ,IP_65504_P_250_RESERVD_S_LEN
                 );
            localIp65504P250ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P250ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P250ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P250ReservdS() {	 
			return (getShort(beginIp65504P250ReservdS));
   	}
         int localIp65504P250ReservdLCounter = -1;
         public boolean isIp65504P250ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P250ReservdLCounter != sharedCounter;
            localIp65504P250ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_250_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P250ReservdL
	 */
	protected void serializeIp65504P250ReservdL(short ip65504P250ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P250ReservdL,IP_65504_P_250_RESERVD_L_LEN)
                  ,beginIp65504P250ReservdL
                  ,IP_65504_P_250_RESERVD_L_LEN
                 );
            localIp65504P250ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P250ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P250ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P250ReservdL() {	 
			return (getShort(beginIp65504P250ReservdL));
   	}
         int localIp65504P251FeeBasSCounter = -1;
         public boolean isIp65504P251FeeBasSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P251FeeBasSCounter != sharedCounter;
            localIp65504P251FeeBasSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_251_FEE_BAS_S_LEN = 2;
  	/**
	 * serializeIp65504P251FeeBasS
	 */
	protected void serializeIp65504P251FeeBasS(short ip65504P251FeeBasS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P251FeeBasS,IP_65504_P_251_FEE_BAS_S_LEN)
                  ,beginIp65504P251FeeBasS
                  ,IP_65504_P_251_FEE_BAS_S_LEN
                 );
            localIp65504P251FeeBasSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P251FeeBasSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P251FeeBasS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P251FeeBasS() {	 
			return (getShort(beginIp65504P251FeeBasS));
   	}
         int localIp65504P251FeeBasLCounter = -1;
         public boolean isIp65504P251FeeBasLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P251FeeBasLCounter != sharedCounter;
            localIp65504P251FeeBasLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_251_FEE_BAS_L_LEN = 2;
  	/**
	 * serializeIp65504P251FeeBasL
	 */
	protected void serializeIp65504P251FeeBasL(short ip65504P251FeeBasL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P251FeeBasL,IP_65504_P_251_FEE_BAS_L_LEN)
                  ,beginIp65504P251FeeBasL
                  ,IP_65504_P_251_FEE_BAS_L_LEN
                 );
            localIp65504P251FeeBasLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P251FeeBasLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P251FeeBasL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P251FeeBasL() {	 
			return (getShort(beginIp65504P251FeeBasL));
   	}
         int localIp65504P252ReservdSCounter = -1;
         public boolean isIp65504P252ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P252ReservdSCounter != sharedCounter;
            localIp65504P252ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_252_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P252ReservdS
	 */
	protected void serializeIp65504P252ReservdS(short ip65504P252ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P252ReservdS,IP_65504_P_252_RESERVD_S_LEN)
                  ,beginIp65504P252ReservdS
                  ,IP_65504_P_252_RESERVD_S_LEN
                 );
            localIp65504P252ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P252ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P252ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P252ReservdS() {	 
			return (getShort(beginIp65504P252ReservdS));
   	}
         int localIp65504P252ReservdLCounter = -1;
         public boolean isIp65504P252ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P252ReservdLCounter != sharedCounter;
            localIp65504P252ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_252_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P252ReservdL
	 */
	protected void serializeIp65504P252ReservdL(short ip65504P252ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P252ReservdL,IP_65504_P_252_RESERVD_L_LEN)
                  ,beginIp65504P252ReservdL
                  ,IP_65504_P_252_RESERVD_L_LEN
                 );
            localIp65504P252ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P252ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P252ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P252ReservdL() {	 
			return (getShort(beginIp65504P252ReservdL));
   	}
         int localIp65504P253ReservdSCounter = -1;
         public boolean isIp65504P253ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P253ReservdSCounter != sharedCounter;
            localIp65504P253ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_253_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P253ReservdS
	 */
	protected void serializeIp65504P253ReservdS(short ip65504P253ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P253ReservdS,IP_65504_P_253_RESERVD_S_LEN)
                  ,beginIp65504P253ReservdS
                  ,IP_65504_P_253_RESERVD_S_LEN
                 );
            localIp65504P253ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P253ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P253ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P253ReservdS() {	 
			return (getShort(beginIp65504P253ReservdS));
   	}
         int localIp65504P253ReservdLCounter = -1;
         public boolean isIp65504P253ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P253ReservdLCounter != sharedCounter;
            localIp65504P253ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_253_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P253ReservdL
	 */
	protected void serializeIp65504P253ReservdL(short ip65504P253ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P253ReservdL,IP_65504_P_253_RESERVD_L_LEN)
                  ,beginIp65504P253ReservdL
                  ,IP_65504_P_253_RESERVD_L_LEN
                 );
            localIp65504P253ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P253ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P253ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P253ReservdL() {	 
			return (getShort(beginIp65504P253ReservdL));
   	}
         int localIp65504P254ReservdSCounter = -1;
         public boolean isIp65504P254ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P254ReservdSCounter != sharedCounter;
            localIp65504P254ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_254_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P254ReservdS
	 */
	protected void serializeIp65504P254ReservdS(short ip65504P254ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P254ReservdS,IP_65504_P_254_RESERVD_S_LEN)
                  ,beginIp65504P254ReservdS
                  ,IP_65504_P_254_RESERVD_S_LEN
                 );
            localIp65504P254ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P254ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P254ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P254ReservdS() {	 
			return (getShort(beginIp65504P254ReservdS));
   	}
         int localIp65504P254ReservdLCounter = -1;
         public boolean isIp65504P254ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P254ReservdLCounter != sharedCounter;
            localIp65504P254ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_254_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P254ReservdL
	 */
	protected void serializeIp65504P254ReservdL(short ip65504P254ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P254ReservdL,IP_65504_P_254_RESERVD_L_LEN)
                  ,beginIp65504P254ReservdL
                  ,IP_65504_P_254_RESERVD_L_LEN
                 );
            localIp65504P254ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P254ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P254ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P254ReservdL() {	 
			return (getShort(beginIp65504P254ReservdL));
   	}
         int localIp65504P255ReservdSCounter = -1;
         public boolean isIp65504P255ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P255ReservdSCounter != sharedCounter;
            localIp65504P255ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_255_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P255ReservdS
	 */
	protected void serializeIp65504P255ReservdS(short ip65504P255ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P255ReservdS,IP_65504_P_255_RESERVD_S_LEN)
                  ,beginIp65504P255ReservdS
                  ,IP_65504_P_255_RESERVD_S_LEN
                 );
            localIp65504P255ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P255ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P255ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P255ReservdS() {	 
			return (getShort(beginIp65504P255ReservdS));
   	}
         int localIp65504P255ReservdLCounter = -1;
         public boolean isIp65504P255ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P255ReservdLCounter != sharedCounter;
            localIp65504P255ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_255_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P255ReservdL
	 */
	protected void serializeIp65504P255ReservdL(short ip65504P255ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P255ReservdL,IP_65504_P_255_RESERVD_L_LEN)
                  ,beginIp65504P255ReservdL
                  ,IP_65504_P_255_RESERVD_L_LEN
                 );
            localIp65504P255ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P255ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P255ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P255ReservdL() {	 
			return (getShort(beginIp65504P255ReservdL));
   	}
         int localIp65504P256ReservdSCounter = -1;
         public boolean isIp65504P256ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P256ReservdSCounter != sharedCounter;
            localIp65504P256ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_256_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P256ReservdS
	 */
	protected void serializeIp65504P256ReservdS(short ip65504P256ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P256ReservdS,IP_65504_P_256_RESERVD_S_LEN)
                  ,beginIp65504P256ReservdS
                  ,IP_65504_P_256_RESERVD_S_LEN
                 );
            localIp65504P256ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P256ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P256ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P256ReservdS() {	 
			return (getShort(beginIp65504P256ReservdS));
   	}
         int localIp65504P256ReservdLCounter = -1;
         public boolean isIp65504P256ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P256ReservdLCounter != sharedCounter;
            localIp65504P256ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_256_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P256ReservdL
	 */
	protected void serializeIp65504P256ReservdL(short ip65504P256ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P256ReservdL,IP_65504_P_256_RESERVD_L_LEN)
                  ,beginIp65504P256ReservdL
                  ,IP_65504_P_256_RESERVD_L_LEN
                 );
            localIp65504P256ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P256ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P256ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P256ReservdL() {	 
			return (getShort(beginIp65504P256ReservdL));
   	}
         int localIp65504P257ReservdSCounter = -1;
         public boolean isIp65504P257ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P257ReservdSCounter != sharedCounter;
            localIp65504P257ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_257_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P257ReservdS
	 */
	protected void serializeIp65504P257ReservdS(short ip65504P257ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P257ReservdS,IP_65504_P_257_RESERVD_S_LEN)
                  ,beginIp65504P257ReservdS
                  ,IP_65504_P_257_RESERVD_S_LEN
                 );
            localIp65504P257ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P257ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P257ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P257ReservdS() {	 
			return (getShort(beginIp65504P257ReservdS));
   	}
         int localIp65504P257ReservdLCounter = -1;
         public boolean isIp65504P257ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P257ReservdLCounter != sharedCounter;
            localIp65504P257ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_257_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P257ReservdL
	 */
	protected void serializeIp65504P257ReservdL(short ip65504P257ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P257ReservdL,IP_65504_P_257_RESERVD_L_LEN)
                  ,beginIp65504P257ReservdL
                  ,IP_65504_P_257_RESERVD_L_LEN
                 );
            localIp65504P257ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P257ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P257ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P257ReservdL() {	 
			return (getShort(beginIp65504P257ReservdL));
   	}
         int localIp65504P258ReservdSCounter = -1;
         public boolean isIp65504P258ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P258ReservdSCounter != sharedCounter;
            localIp65504P258ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_258_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P258ReservdS
	 */
	protected void serializeIp65504P258ReservdS(short ip65504P258ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P258ReservdS,IP_65504_P_258_RESERVD_S_LEN)
                  ,beginIp65504P258ReservdS
                  ,IP_65504_P_258_RESERVD_S_LEN
                 );
            localIp65504P258ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P258ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P258ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P258ReservdS() {	 
			return (getShort(beginIp65504P258ReservdS));
   	}
         int localIp65504P258ReservdLCounter = -1;
         public boolean isIp65504P258ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P258ReservdLCounter != sharedCounter;
            localIp65504P258ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_258_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P258ReservdL
	 */
	protected void serializeIp65504P258ReservdL(short ip65504P258ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P258ReservdL,IP_65504_P_258_RESERVD_L_LEN)
                  ,beginIp65504P258ReservdL
                  ,IP_65504_P_258_RESERVD_L_LEN
                 );
            localIp65504P258ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P258ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P258ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P258ReservdL() {	 
			return (getShort(beginIp65504P258ReservdL));
   	}
         int localIp65504P259ReservdSCounter = -1;
         public boolean isIp65504P259ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P259ReservdSCounter != sharedCounter;
            localIp65504P259ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_259_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P259ReservdS
	 */
	protected void serializeIp65504P259ReservdS(short ip65504P259ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P259ReservdS,IP_65504_P_259_RESERVD_S_LEN)
                  ,beginIp65504P259ReservdS
                  ,IP_65504_P_259_RESERVD_S_LEN
                 );
            localIp65504P259ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P259ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P259ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P259ReservdS() {	 
			return (getShort(beginIp65504P259ReservdS));
   	}
         int localIp65504P259ReservdLCounter = -1;
         public boolean isIp65504P259ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P259ReservdLCounter != sharedCounter;
            localIp65504P259ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_259_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P259ReservdL
	 */
	protected void serializeIp65504P259ReservdL(short ip65504P259ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P259ReservdL,IP_65504_P_259_RESERVD_L_LEN)
                  ,beginIp65504P259ReservdL
                  ,IP_65504_P_259_RESERVD_L_LEN
                 );
            localIp65504P259ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P259ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P259ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P259ReservdL() {	 
			return (getShort(beginIp65504P259ReservdL));
   	}
         int localIp65504P260EdExclSCounter = -1;
         public boolean isIp65504P260EdExclSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P260EdExclSCounter != sharedCounter;
            localIp65504P260EdExclSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_260_ED_EXCL_S_LEN = 2;
  	/**
	 * serializeIp65504P260EdExclS
	 */
	protected void serializeIp65504P260EdExclS(short ip65504P260EdExclS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P260EdExclS,IP_65504_P_260_ED_EXCL_S_LEN)
                  ,beginIp65504P260EdExclS
                  ,IP_65504_P_260_ED_EXCL_S_LEN
                 );
            localIp65504P260EdExclSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P260EdExclSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P260EdExclS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P260EdExclS() {	 
			return (getShort(beginIp65504P260EdExclS));
   	}
         int localIp65504P260EdExclLCounter = -1;
         public boolean isIp65504P260EdExclLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P260EdExclLCounter != sharedCounter;
            localIp65504P260EdExclLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_260_ED_EXCL_L_LEN = 2;
  	/**
	 * serializeIp65504P260EdExclL
	 */
	protected void serializeIp65504P260EdExclL(short ip65504P260EdExclL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P260EdExclL,IP_65504_P_260_ED_EXCL_L_LEN)
                  ,beginIp65504P260EdExclL
                  ,IP_65504_P_260_ED_EXCL_L_LEN
                 );
            localIp65504P260EdExclLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P260EdExclLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P260EdExclL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P260EdExclL() {	 
			return (getShort(beginIp65504P260EdExclL));
   	}
         int localIp65504P261FrdTypSCounter = -1;
         public boolean isIp65504P261FrdTypSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P261FrdTypSCounter != sharedCounter;
            localIp65504P261FrdTypSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_261_FRD_TYP_S_LEN = 2;
  	/**
	 * serializeIp65504P261FrdTypS
	 */
	protected void serializeIp65504P261FrdTypS(short ip65504P261FrdTypS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P261FrdTypS,IP_65504_P_261_FRD_TYP_S_LEN)
                  ,beginIp65504P261FrdTypS
                  ,IP_65504_P_261_FRD_TYP_S_LEN
                 );
            localIp65504P261FrdTypSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P261FrdTypSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P261FrdTypS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P261FrdTypS() {	 
			return (getShort(beginIp65504P261FrdTypS));
   	}
         int localIp65504P261FrdTypLCounter = -1;
         public boolean isIp65504P261FrdTypLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P261FrdTypLCounter != sharedCounter;
            localIp65504P261FrdTypLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_261_FRD_TYP_L_LEN = 2;
  	/**
	 * serializeIp65504P261FrdTypL
	 */
	protected void serializeIp65504P261FrdTypL(short ip65504P261FrdTypL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P261FrdTypL,IP_65504_P_261_FRD_TYP_L_LEN)
                  ,beginIp65504P261FrdTypL
                  ,IP_65504_P_261_FRD_TYP_L_LEN
                 );
            localIp65504P261FrdTypLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P261FrdTypLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P261FrdTypL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P261FrdTypL() {	 
			return (getShort(beginIp65504P261FrdTypL));
   	}
         int localIp65504P262DocIndSCounter = -1;
         public boolean isIp65504P262DocIndSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P262DocIndSCounter != sharedCounter;
            localIp65504P262DocIndSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_262_DOC_IND_S_LEN = 2;
  	/**
	 * serializeIp65504P262DocIndS
	 */
	protected void serializeIp65504P262DocIndS(short ip65504P262DocIndS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P262DocIndS,IP_65504_P_262_DOC_IND_S_LEN)
                  ,beginIp65504P262DocIndS
                  ,IP_65504_P_262_DOC_IND_S_LEN
                 );
            localIp65504P262DocIndSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P262DocIndSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P262DocIndS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P262DocIndS() {	 
			return (getShort(beginIp65504P262DocIndS));
   	}
         int localIp65504P262DocIndLCounter = -1;
         public boolean isIp65504P262DocIndLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P262DocIndLCounter != sharedCounter;
            localIp65504P262DocIndLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_262_DOC_IND_L_LEN = 2;
  	/**
	 * serializeIp65504P262DocIndL
	 */
	protected void serializeIp65504P262DocIndL(short ip65504P262DocIndL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P262DocIndL,IP_65504_P_262_DOC_IND_L_LEN)
                  ,beginIp65504P262DocIndL
                  ,IP_65504_P_262_DOC_IND_L_LEN
                 );
            localIp65504P262DocIndLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P262DocIndLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P262DocIndL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P262DocIndL() {	 
			return (getShort(beginIp65504P262DocIndL));
   	}
         int localIp65504P263OrigCdSCounter = -1;
         public boolean isIp65504P263OrigCdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P263OrigCdSCounter != sharedCounter;
            localIp65504P263OrigCdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_263_ORIG_CD_S_LEN = 2;
  	/**
	 * serializeIp65504P263OrigCdS
	 */
	protected void serializeIp65504P263OrigCdS(short ip65504P263OrigCdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P263OrigCdS,IP_65504_P_263_ORIG_CD_S_LEN)
                  ,beginIp65504P263OrigCdS
                  ,IP_65504_P_263_ORIG_CD_S_LEN
                 );
            localIp65504P263OrigCdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P263OrigCdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P263OrigCdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P263OrigCdS() {	 
			return (getShort(beginIp65504P263OrigCdS));
   	}
         int localIp65504P263OrigCdLCounter = -1;
         public boolean isIp65504P263OrigCdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P263OrigCdLCounter != sharedCounter;
            localIp65504P263OrigCdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_263_ORIG_CD_L_LEN = 2;
  	/**
	 * serializeIp65504P263OrigCdL
	 */
	protected void serializeIp65504P263OrigCdL(short ip65504P263OrigCdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P263OrigCdL,IP_65504_P_263_ORIG_CD_L_LEN)
                  ,beginIp65504P263OrigCdL
                  ,IP_65504_P_263_ORIG_CD_L_LEN
                 );
            localIp65504P263OrigCdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P263OrigCdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P263OrigCdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P263OrigCdL() {	 
			return (getShort(beginIp65504P263OrigCdL));
   	}
         int localIp65504P264OrgReaSCounter = -1;
         public boolean isIp65504P264OrgReaSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P264OrgReaSCounter != sharedCounter;
            localIp65504P264OrgReaSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_264_ORG_REA_S_LEN = 2;
  	/**
	 * serializeIp65504P264OrgReaS
	 */
	protected void serializeIp65504P264OrgReaS(short ip65504P264OrgReaS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P264OrgReaS,IP_65504_P_264_ORG_REA_S_LEN)
                  ,beginIp65504P264OrgReaS
                  ,IP_65504_P_264_ORG_REA_S_LEN
                 );
            localIp65504P264OrgReaSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P264OrgReaSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P264OrgReaS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P264OrgReaS() {	 
			return (getShort(beginIp65504P264OrgReaS));
   	}
         int localIp65504P264OrgReaLCounter = -1;
         public boolean isIp65504P264OrgReaLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P264OrgReaLCounter != sharedCounter;
            localIp65504P264OrgReaLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_264_ORG_REA_L_LEN = 2;
  	/**
	 * serializeIp65504P264OrgReaL
	 */
	protected void serializeIp65504P264OrgReaL(short ip65504P264OrgReaL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P264OrgReaL,IP_65504_P_264_ORG_REA_L_LEN)
                  ,beginIp65504P264OrgReaL
                  ,IP_65504_P_264_ORG_REA_L_LEN
                 );
            localIp65504P264OrgReaLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P264OrgReaLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P264OrgReaL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P264OrgReaL() {	 
			return (getShort(beginIp65504P264OrgReaL));
   	}
         int localIp65504P265IntPreSCounter = -1;
         public boolean isIp65504P265IntPreSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P265IntPreSCounter != sharedCounter;
            localIp65504P265IntPreSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_265_INT_PRE_S_LEN = 2;
  	/**
	 * serializeIp65504P265IntPreS
	 */
	protected void serializeIp65504P265IntPreS(short ip65504P265IntPreS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P265IntPreS,IP_65504_P_265_INT_PRE_S_LEN)
                  ,beginIp65504P265IntPreS
                  ,IP_65504_P_265_INT_PRE_S_LEN
                 );
            localIp65504P265IntPreSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P265IntPreSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P265IntPreS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P265IntPreS() {	 
			return (getShort(beginIp65504P265IntPreS));
   	}
         int localIp65504P265IntPreLCounter = -1;
         public boolean isIp65504P265IntPreLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P265IntPreLCounter != sharedCounter;
            localIp65504P265IntPreLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_265_INT_PRE_L_LEN = 2;
  	/**
	 * serializeIp65504P265IntPreL
	 */
	protected void serializeIp65504P265IntPreL(short ip65504P265IntPreL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P265IntPreL,IP_65504_P_265_INT_PRE_L_LEN)
                  ,beginIp65504P265IntPreL
                  ,IP_65504_P_265_INT_PRE_L_LEN
                 );
            localIp65504P265IntPreLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P265IntPreLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P265IntPreL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P265IntPreL() {	 
			return (getShort(beginIp65504P265IntPreL));
   	}
         int localIp65504P2661stCbkSCounter = -1;
         public boolean isIp65504P2661stCbkSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2661stCbkSCounter != sharedCounter;
            localIp65504P2661stCbkSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2661ST_CBK_S_LEN = 2;
  	/**
	 * serializeIp65504P2661stCbkS
	 */
	protected void serializeIp65504P2661stCbkS(short ip65504P2661stCbkS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2661stCbkS,IP_65504_P_2661ST_CBK_S_LEN)
                  ,beginIp65504P2661stCbkS
                  ,IP_65504_P_2661ST_CBK_S_LEN
                 );
            localIp65504P2661stCbkSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2661stCbkSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2661stCbkS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2661stCbkS() {	 
			return (getShort(beginIp65504P2661stCbkS));
   	}
         int localIp65504P2661stCbkLCounter = -1;
         public boolean isIp65504P2661stCbkLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2661stCbkLCounter != sharedCounter;
            localIp65504P2661stCbkLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2661ST_CBK_L_LEN = 2;
  	/**
	 * serializeIp65504P2661stCbkL
	 */
	protected void serializeIp65504P2661stCbkL(short ip65504P2661stCbkL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2661stCbkL,IP_65504_P_2661ST_CBK_L_LEN)
                  ,beginIp65504P2661stCbkL
                  ,IP_65504_P_2661ST_CBK_L_LEN
                 );
            localIp65504P2661stCbkLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2661stCbkLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2661stCbkL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2661stCbkL() {	 
			return (getShort(beginIp65504P2661stCbkL));
   	}
         int localIp65504P2672ndPreSCounter = -1;
         public boolean isIp65504P2672ndPreSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2672ndPreSCounter != sharedCounter;
            localIp65504P2672ndPreSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2672ND_PRE_S_LEN = 2;
  	/**
	 * serializeIp65504P2672ndPreS
	 */
	protected void serializeIp65504P2672ndPreS(short ip65504P2672ndPreS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2672ndPreS,IP_65504_P_2672ND_PRE_S_LEN)
                  ,beginIp65504P2672ndPreS
                  ,IP_65504_P_2672ND_PRE_S_LEN
                 );
            localIp65504P2672ndPreSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2672ndPreSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2672ndPreS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2672ndPreS() {	 
			return (getShort(beginIp65504P2672ndPreS));
   	}
         int localIp65504P2672ndPreLCounter = -1;
         public boolean isIp65504P2672ndPreLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2672ndPreLCounter != sharedCounter;
            localIp65504P2672ndPreLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2672ND_PRE_L_LEN = 2;
  	/**
	 * serializeIp65504P2672ndPreL
	 */
	protected void serializeIp65504P2672ndPreL(short ip65504P2672ndPreL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2672ndPreL,IP_65504_P_2672ND_PRE_L_LEN)
                  ,beginIp65504P2672ndPreL
                  ,IP_65504_P_2672ND_PRE_L_LEN
                 );
            localIp65504P2672ndPreLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2672ndPreLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2672ndPreL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2672ndPreL() {	 
			return (getShort(beginIp65504P2672ndPreL));
   	}
         int localIp65504P268PtlAmtSCounter = -1;
         public boolean isIp65504P268PtlAmtSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P268PtlAmtSCounter != sharedCounter;
            localIp65504P268PtlAmtSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_268_PTL_AMT_S_LEN = 2;
  	/**
	 * serializeIp65504P268PtlAmtS
	 */
	protected void serializeIp65504P268PtlAmtS(short ip65504P268PtlAmtS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P268PtlAmtS,IP_65504_P_268_PTL_AMT_S_LEN)
                  ,beginIp65504P268PtlAmtS
                  ,IP_65504_P_268_PTL_AMT_S_LEN
                 );
            localIp65504P268PtlAmtSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P268PtlAmtSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P268PtlAmtS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P268PtlAmtS() {	 
			return (getShort(beginIp65504P268PtlAmtS));
   	}
         int localIp65504P268PtlAmtLCounter = -1;
         public boolean isIp65504P268PtlAmtLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P268PtlAmtLCounter != sharedCounter;
            localIp65504P268PtlAmtLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_268_PTL_AMT_L_LEN = 2;
  	/**
	 * serializeIp65504P268PtlAmtL
	 */
	protected void serializeIp65504P268PtlAmtL(short ip65504P268PtlAmtL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P268PtlAmtL,IP_65504_P_268_PTL_AMT_L_LEN)
                  ,beginIp65504P268PtlAmtL
                  ,IP_65504_P_268_PTL_AMT_L_LEN
                 );
            localIp65504P268PtlAmtLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P268PtlAmtLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P268PtlAmtL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P268PtlAmtL() {	 
			return (getShort(beginIp65504P268PtlAmtL));
   	}
         int localIp65504P269ReservdSCounter = -1;
         public boolean isIp65504P269ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P269ReservdSCounter != sharedCounter;
            localIp65504P269ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_269_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P269ReservdS
	 */
	protected void serializeIp65504P269ReservdS(short ip65504P269ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P269ReservdS,IP_65504_P_269_RESERVD_S_LEN)
                  ,beginIp65504P269ReservdS
                  ,IP_65504_P_269_RESERVD_S_LEN
                 );
            localIp65504P269ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P269ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P269ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P269ReservdS() {	 
			return (getShort(beginIp65504P269ReservdS));
   	}
         int localIp65504P269ReservdLCounter = -1;
         public boolean isIp65504P269ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P269ReservdLCounter != sharedCounter;
            localIp65504P269ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_269_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P269ReservdL
	 */
	protected void serializeIp65504P269ReservdL(short ip65504P269ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P269ReservdL,IP_65504_P_269_RESERVD_L_LEN)
                  ,beginIp65504P269ReservdL
                  ,IP_65504_P_269_RESERVD_L_LEN
                 );
            localIp65504P269ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P269ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P269ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P269ReservdL() {	 
			return (getShort(beginIp65504P269ReservdL));
   	}
         int localIp65504P270ReservdSCounter = -1;
         public boolean isIp65504P270ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P270ReservdSCounter != sharedCounter;
            localIp65504P270ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_270_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P270ReservdS
	 */
	protected void serializeIp65504P270ReservdS(short ip65504P270ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P270ReservdS,IP_65504_P_270_RESERVD_S_LEN)
                  ,beginIp65504P270ReservdS
                  ,IP_65504_P_270_RESERVD_S_LEN
                 );
            localIp65504P270ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P270ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P270ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P270ReservdS() {	 
			return (getShort(beginIp65504P270ReservdS));
   	}
         int localIp65504P270ReservdLCounter = -1;
         public boolean isIp65504P270ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P270ReservdLCounter != sharedCounter;
            localIp65504P270ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_270_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P270ReservdL
	 */
	protected void serializeIp65504P270ReservdL(short ip65504P270ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P270ReservdL,IP_65504_P_270_RESERVD_L_LEN)
                  ,beginIp65504P270ReservdL
                  ,IP_65504_P_270_RESERVD_L_LEN
                 );
            localIp65504P270ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P270ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P270ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P270ReservdL() {	 
			return (getShort(beginIp65504P270ReservdL));
   	}
         int localIp65504P271ReservdSCounter = -1;
         public boolean isIp65504P271ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P271ReservdSCounter != sharedCounter;
            localIp65504P271ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_271_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P271ReservdS
	 */
	protected void serializeIp65504P271ReservdS(short ip65504P271ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P271ReservdS,IP_65504_P_271_RESERVD_S_LEN)
                  ,beginIp65504P271ReservdS
                  ,IP_65504_P_271_RESERVD_S_LEN
                 );
            localIp65504P271ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P271ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P271ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P271ReservdS() {	 
			return (getShort(beginIp65504P271ReservdS));
   	}
         int localIp65504P271ReservdLCounter = -1;
         public boolean isIp65504P271ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P271ReservdLCounter != sharedCounter;
            localIp65504P271ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_271_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P271ReservdL
	 */
	protected void serializeIp65504P271ReservdL(short ip65504P271ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P271ReservdL,IP_65504_P_271_RESERVD_L_LEN)
                  ,beginIp65504P271ReservdL
                  ,IP_65504_P_271_RESERVD_L_LEN
                 );
            localIp65504P271ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P271ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P271ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P271ReservdL() {	 
			return (getShort(beginIp65504P271ReservdL));
   	}
         int localIp65504P272ReservdSCounter = -1;
         public boolean isIp65504P272ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P272ReservdSCounter != sharedCounter;
            localIp65504P272ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_272_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P272ReservdS
	 */
	protected void serializeIp65504P272ReservdS(short ip65504P272ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P272ReservdS,IP_65504_P_272_RESERVD_S_LEN)
                  ,beginIp65504P272ReservdS
                  ,IP_65504_P_272_RESERVD_S_LEN
                 );
            localIp65504P272ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P272ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P272ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P272ReservdS() {	 
			return (getShort(beginIp65504P272ReservdS));
   	}
         int localIp65504P272ReservdLCounter = -1;
         public boolean isIp65504P272ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P272ReservdLCounter != sharedCounter;
            localIp65504P272ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_272_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P272ReservdL
	 */
	protected void serializeIp65504P272ReservdL(short ip65504P272ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P272ReservdL,IP_65504_P_272_RESERVD_L_LEN)
                  ,beginIp65504P272ReservdL
                  ,IP_65504_P_272_RESERVD_L_LEN
                 );
            localIp65504P272ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P272ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P272ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P272ReservdL() {	 
			return (getShort(beginIp65504P272ReservdL));
   	}
         int localIp65504P273ReservdSCounter = -1;
         public boolean isIp65504P273ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P273ReservdSCounter != sharedCounter;
            localIp65504P273ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_273_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P273ReservdS
	 */
	protected void serializeIp65504P273ReservdS(short ip65504P273ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P273ReservdS,IP_65504_P_273_RESERVD_S_LEN)
                  ,beginIp65504P273ReservdS
                  ,IP_65504_P_273_RESERVD_S_LEN
                 );
            localIp65504P273ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P273ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P273ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P273ReservdS() {	 
			return (getShort(beginIp65504P273ReservdS));
   	}
         int localIp65504P273ReservdLCounter = -1;
         public boolean isIp65504P273ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P273ReservdLCounter != sharedCounter;
            localIp65504P273ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_273_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P273ReservdL
	 */
	protected void serializeIp65504P273ReservdL(short ip65504P273ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P273ReservdL,IP_65504_P_273_RESERVD_L_LEN)
                  ,beginIp65504P273ReservdL
                  ,IP_65504_P_273_RESERVD_L_LEN
                 );
            localIp65504P273ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P273ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P273ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P273ReservdL() {	 
			return (getShort(beginIp65504P273ReservdL));
   	}
         int localIp65504P274ReservdSCounter = -1;
         public boolean isIp65504P274ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P274ReservdSCounter != sharedCounter;
            localIp65504P274ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_274_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P274ReservdS
	 */
	protected void serializeIp65504P274ReservdS(short ip65504P274ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P274ReservdS,IP_65504_P_274_RESERVD_S_LEN)
                  ,beginIp65504P274ReservdS
                  ,IP_65504_P_274_RESERVD_S_LEN
                 );
            localIp65504P274ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P274ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P274ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P274ReservdS() {	 
			return (getShort(beginIp65504P274ReservdS));
   	}
         int localIp65504P274ReservdLCounter = -1;
         public boolean isIp65504P274ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P274ReservdLCounter != sharedCounter;
            localIp65504P274ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_274_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P274ReservdL
	 */
	protected void serializeIp65504P274ReservdL(short ip65504P274ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P274ReservdL,IP_65504_P_274_RESERVD_L_LEN)
                  ,beginIp65504P274ReservdL
                  ,IP_65504_P_274_RESERVD_L_LEN
                 );
            localIp65504P274ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P274ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P274ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P274ReservdL() {	 
			return (getShort(beginIp65504P274ReservdL));
   	}
         int localIp65504P275ReservdSCounter = -1;
         public boolean isIp65504P275ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P275ReservdSCounter != sharedCounter;
            localIp65504P275ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_275_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P275ReservdS
	 */
	protected void serializeIp65504P275ReservdS(short ip65504P275ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P275ReservdS,IP_65504_P_275_RESERVD_S_LEN)
                  ,beginIp65504P275ReservdS
                  ,IP_65504_P_275_RESERVD_S_LEN
                 );
            localIp65504P275ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P275ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P275ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P275ReservdS() {	 
			return (getShort(beginIp65504P275ReservdS));
   	}
         int localIp65504P275ReservdLCounter = -1;
         public boolean isIp65504P275ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P275ReservdLCounter != sharedCounter;
            localIp65504P275ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_275_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P275ReservdL
	 */
	protected void serializeIp65504P275ReservdL(short ip65504P275ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P275ReservdL,IP_65504_P_275_RESERVD_L_LEN)
                  ,beginIp65504P275ReservdL
                  ,IP_65504_P_275_RESERVD_L_LEN
                 );
            localIp65504P275ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P275ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P275ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P275ReservdL() {	 
			return (getShort(beginIp65504P275ReservdL));
   	}
         int localIp65504P276ReservdSCounter = -1;
         public boolean isIp65504P276ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P276ReservdSCounter != sharedCounter;
            localIp65504P276ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_276_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P276ReservdS
	 */
	protected void serializeIp65504P276ReservdS(short ip65504P276ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P276ReservdS,IP_65504_P_276_RESERVD_S_LEN)
                  ,beginIp65504P276ReservdS
                  ,IP_65504_P_276_RESERVD_S_LEN
                 );
            localIp65504P276ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P276ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P276ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P276ReservdS() {	 
			return (getShort(beginIp65504P276ReservdS));
   	}
         int localIp65504P276ReservdLCounter = -1;
         public boolean isIp65504P276ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P276ReservdLCounter != sharedCounter;
            localIp65504P276ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_276_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P276ReservdL
	 */
	protected void serializeIp65504P276ReservdL(short ip65504P276ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P276ReservdL,IP_65504_P_276_RESERVD_L_LEN)
                  ,beginIp65504P276ReservdL
                  ,IP_65504_P_276_RESERVD_L_LEN
                 );
            localIp65504P276ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P276ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P276ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P276ReservdL() {	 
			return (getShort(beginIp65504P276ReservdL));
   	}
         int localIp65504P277ReservdSCounter = -1;
         public boolean isIp65504P277ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P277ReservdSCounter != sharedCounter;
            localIp65504P277ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_277_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P277ReservdS
	 */
	protected void serializeIp65504P277ReservdS(short ip65504P277ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P277ReservdS,IP_65504_P_277_RESERVD_S_LEN)
                  ,beginIp65504P277ReservdS
                  ,IP_65504_P_277_RESERVD_S_LEN
                 );
            localIp65504P277ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P277ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P277ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P277ReservdS() {	 
			return (getShort(beginIp65504P277ReservdS));
   	}
         int localIp65504P277ReservdLCounter = -1;
         public boolean isIp65504P277ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P277ReservdLCounter != sharedCounter;
            localIp65504P277ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_277_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P277ReservdL
	 */
	protected void serializeIp65504P277ReservdL(short ip65504P277ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P277ReservdL,IP_65504_P_277_RESERVD_L_LEN)
                  ,beginIp65504P277ReservdL
                  ,IP_65504_P_277_RESERVD_L_LEN
                 );
            localIp65504P277ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P277ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P277ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P277ReservdL() {	 
			return (getShort(beginIp65504P277ReservdL));
   	}
         int localIp65504P278ReservdSCounter = -1;
         public boolean isIp65504P278ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P278ReservdSCounter != sharedCounter;
            localIp65504P278ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_278_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P278ReservdS
	 */
	protected void serializeIp65504P278ReservdS(short ip65504P278ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P278ReservdS,IP_65504_P_278_RESERVD_S_LEN)
                  ,beginIp65504P278ReservdS
                  ,IP_65504_P_278_RESERVD_S_LEN
                 );
            localIp65504P278ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P278ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P278ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P278ReservdS() {	 
			return (getShort(beginIp65504P278ReservdS));
   	}
         int localIp65504P278ReservdLCounter = -1;
         public boolean isIp65504P278ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P278ReservdLCounter != sharedCounter;
            localIp65504P278ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_278_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P278ReservdL
	 */
	protected void serializeIp65504P278ReservdL(short ip65504P278ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P278ReservdL,IP_65504_P_278_RESERVD_L_LEN)
                  ,beginIp65504P278ReservdL
                  ,IP_65504_P_278_RESERVD_L_LEN
                 );
            localIp65504P278ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P278ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P278ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P278ReservdL() {	 
			return (getShort(beginIp65504P278ReservdL));
   	}
         int localIp65504P279ReservdSCounter = -1;
         public boolean isIp65504P279ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P279ReservdSCounter != sharedCounter;
            localIp65504P279ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_279_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P279ReservdS
	 */
	protected void serializeIp65504P279ReservdS(short ip65504P279ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P279ReservdS,IP_65504_P_279_RESERVD_S_LEN)
                  ,beginIp65504P279ReservdS
                  ,IP_65504_P_279_RESERVD_S_LEN
                 );
            localIp65504P279ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P279ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P279ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P279ReservdS() {	 
			return (getShort(beginIp65504P279ReservdS));
   	}
         int localIp65504P279ReservdLCounter = -1;
         public boolean isIp65504P279ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P279ReservdLCounter != sharedCounter;
            localIp65504P279ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_279_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P279ReservdL
	 */
	protected void serializeIp65504P279ReservdL(short ip65504P279ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P279ReservdL,IP_65504_P_279_RESERVD_L_LEN)
                  ,beginIp65504P279ReservdL
                  ,IP_65504_P_279_RESERVD_L_LEN
                 );
            localIp65504P279ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P279ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P279ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P279ReservdL() {	 
			return (getShort(beginIp65504P279ReservdL));
   	}




}
  
