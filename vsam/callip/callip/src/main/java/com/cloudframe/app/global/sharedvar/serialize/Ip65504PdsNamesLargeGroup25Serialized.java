package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup25Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:55. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup25Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup25Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_25_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P745ReservdS;
            protected  int beginIp65504P745ReservdL;
            protected  int beginIp65504P746ReservdS;
            protected  int beginIp65504P746ReservdL;
            protected  int beginIp65504P747ReservdS;
            protected  int beginIp65504P747ReservdL;
            protected  int beginIp65504P748ReservdS;
            protected  int beginIp65504P748ReservdL;
            protected  int beginIp65504P749ReservdS;
            protected  int beginIp65504P749ReservdL;
            protected  int beginIp65504P750ReservdS;
            protected  int beginIp65504P750ReservdL;
            protected  int beginIp65504P751ReservdS;
            protected  int beginIp65504P751ReservdL;
            protected  int beginIp65504P752ReservdS;
            protected  int beginIp65504P752ReservdL;
            protected  int beginIp65504P753ReservdS;
            protected  int beginIp65504P753ReservdL;
            protected  int beginIp65504P754ReservdS;
            protected  int beginIp65504P754ReservdL;
            protected  int beginIp65504P755ReservdS;
            protected  int beginIp65504P755ReservdL;
            protected  int beginIp65504P756ReservdS;
            protected  int beginIp65504P756ReservdL;
            protected  int beginIp65504P757ReservdS;
            protected  int beginIp65504P757ReservdL;
            protected  int beginIp65504P758ReservdS;
            protected  int beginIp65504P758ReservdL;
            protected  int beginIp65504P759ReservdS;
            protected  int beginIp65504P759ReservdL;
            protected  int beginIp65504P760ReservdS;
            protected  int beginIp65504P760ReservdL;
            protected  int beginIp65504P761ReservdS;
            protected  int beginIp65504P761ReservdL;
            protected  int beginIp65504P762ReservdS;
            protected  int beginIp65504P762ReservdL;
            protected  int beginIp65504P763ReservdS;
            protected  int beginIp65504P763ReservdL;
            protected  int beginIp65504P764ReservdS;
            protected  int beginIp65504P764ReservdL;
            protected  int beginIp65504P765ReservdS;
            protected  int beginIp65504P765ReservdL;
            protected  int beginIp65504P766ReservdS;
            protected  int beginIp65504P766ReservdL;
            protected  int beginIp65504P767ReservdS;
            protected  int beginIp65504P767ReservdL;
            protected  int beginIp65504P768ReservdS;
            protected  int beginIp65504P768ReservdL;
            protected  int beginIp65504P769ReservdS;
            protected  int beginIp65504P769ReservdL;
            protected  int beginIp65504P770ReservdS;
            protected  int beginIp65504P770ReservdL;
            protected  int beginIp65504P771ReservdS;
            protected  int beginIp65504P771ReservdL;
            protected  int beginIp65504P772ReservdS;
            protected  int beginIp65504P772ReservdL;
            protected  int beginIp65504P773ReservdS;
            protected  int beginIp65504P773ReservdL;
            protected  int beginIp65504P774ReservdS;
            protected  int beginIp65504P774ReservdL;
            protected  int beginIp65504P775ReservdS;
            protected  int beginIp65504P775ReservdL;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup25Serialized
	**/
    public Ip65504PdsNamesLargeGroup25Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup25Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup25Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup25Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5948); // serialize this field at offset 5948 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup25Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5948 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup25Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_25_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P745ReservdS = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P745ReservdL = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P746ReservdS = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P746ReservdL = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P747ReservdS = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P747ReservdL = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P748ReservdS = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P748ReservdL = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P749ReservdS = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P749ReservdL = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P750ReservdS = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P750ReservdL = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P751ReservdS = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P751ReservdL = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P752ReservdS = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P752ReservdL = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P753ReservdS = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P753ReservdL = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P754ReservdS = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P754ReservdL = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P755ReservdS = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P755ReservdL = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P756ReservdS = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P756ReservdL = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P757ReservdS = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P757ReservdL = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P758ReservdS = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P758ReservdL = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P759ReservdS = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P759ReservdL = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P760ReservdS = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P760ReservdL = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P761ReservdS = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P761ReservdL = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P762ReservdS = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P762ReservdL = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P763ReservdS = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P763ReservdL = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P764ReservdS = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P764ReservdL = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P765ReservdS = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P765ReservdL = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P766ReservdS = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P766ReservdL = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P767ReservdS = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P767ReservdL = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P768ReservdS = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P768ReservdL = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P769ReservdS = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P769ReservdL = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P770ReservdS = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P770ReservdL = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P771ReservdS = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P771ReservdL = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P772ReservdS = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P772ReservdL = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P773ReservdS = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P773ReservdL = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P774ReservdS = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P774ReservdL = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P775ReservdS = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P775ReservdL = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P745ReservdSCounter = -1;
         public boolean isIp65504P745ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P745ReservdSCounter != sharedCounter;
            localIp65504P745ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_745_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P745ReservdS
	 */
	protected void serializeIp65504P745ReservdS(short ip65504P745ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P745ReservdS,IP_65504_P_745_RESERVD_S_LEN)
                  ,beginIp65504P745ReservdS
                  ,IP_65504_P_745_RESERVD_S_LEN
                 );
            localIp65504P745ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P745ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P745ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P745ReservdS() {	 
			return (getShort(beginIp65504P745ReservdS));
   	}
         int localIp65504P745ReservdLCounter = -1;
         public boolean isIp65504P745ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P745ReservdLCounter != sharedCounter;
            localIp65504P745ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_745_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P745ReservdL
	 */
	protected void serializeIp65504P745ReservdL(short ip65504P745ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P745ReservdL,IP_65504_P_745_RESERVD_L_LEN)
                  ,beginIp65504P745ReservdL
                  ,IP_65504_P_745_RESERVD_L_LEN
                 );
            localIp65504P745ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P745ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P745ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P745ReservdL() {	 
			return (getShort(beginIp65504P745ReservdL));
   	}
         int localIp65504P746ReservdSCounter = -1;
         public boolean isIp65504P746ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P746ReservdSCounter != sharedCounter;
            localIp65504P746ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_746_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P746ReservdS
	 */
	protected void serializeIp65504P746ReservdS(short ip65504P746ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P746ReservdS,IP_65504_P_746_RESERVD_S_LEN)
                  ,beginIp65504P746ReservdS
                  ,IP_65504_P_746_RESERVD_S_LEN
                 );
            localIp65504P746ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P746ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P746ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P746ReservdS() {	 
			return (getShort(beginIp65504P746ReservdS));
   	}
         int localIp65504P746ReservdLCounter = -1;
         public boolean isIp65504P746ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P746ReservdLCounter != sharedCounter;
            localIp65504P746ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_746_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P746ReservdL
	 */
	protected void serializeIp65504P746ReservdL(short ip65504P746ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P746ReservdL,IP_65504_P_746_RESERVD_L_LEN)
                  ,beginIp65504P746ReservdL
                  ,IP_65504_P_746_RESERVD_L_LEN
                 );
            localIp65504P746ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P746ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P746ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P746ReservdL() {	 
			return (getShort(beginIp65504P746ReservdL));
   	}
         int localIp65504P747ReservdSCounter = -1;
         public boolean isIp65504P747ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P747ReservdSCounter != sharedCounter;
            localIp65504P747ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_747_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P747ReservdS
	 */
	protected void serializeIp65504P747ReservdS(short ip65504P747ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P747ReservdS,IP_65504_P_747_RESERVD_S_LEN)
                  ,beginIp65504P747ReservdS
                  ,IP_65504_P_747_RESERVD_S_LEN
                 );
            localIp65504P747ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P747ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P747ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P747ReservdS() {	 
			return (getShort(beginIp65504P747ReservdS));
   	}
         int localIp65504P747ReservdLCounter = -1;
         public boolean isIp65504P747ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P747ReservdLCounter != sharedCounter;
            localIp65504P747ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_747_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P747ReservdL
	 */
	protected void serializeIp65504P747ReservdL(short ip65504P747ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P747ReservdL,IP_65504_P_747_RESERVD_L_LEN)
                  ,beginIp65504P747ReservdL
                  ,IP_65504_P_747_RESERVD_L_LEN
                 );
            localIp65504P747ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P747ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P747ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P747ReservdL() {	 
			return (getShort(beginIp65504P747ReservdL));
   	}
         int localIp65504P748ReservdSCounter = -1;
         public boolean isIp65504P748ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P748ReservdSCounter != sharedCounter;
            localIp65504P748ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_748_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P748ReservdS
	 */
	protected void serializeIp65504P748ReservdS(short ip65504P748ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P748ReservdS,IP_65504_P_748_RESERVD_S_LEN)
                  ,beginIp65504P748ReservdS
                  ,IP_65504_P_748_RESERVD_S_LEN
                 );
            localIp65504P748ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P748ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P748ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P748ReservdS() {	 
			return (getShort(beginIp65504P748ReservdS));
   	}
         int localIp65504P748ReservdLCounter = -1;
         public boolean isIp65504P748ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P748ReservdLCounter != sharedCounter;
            localIp65504P748ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_748_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P748ReservdL
	 */
	protected void serializeIp65504P748ReservdL(short ip65504P748ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P748ReservdL,IP_65504_P_748_RESERVD_L_LEN)
                  ,beginIp65504P748ReservdL
                  ,IP_65504_P_748_RESERVD_L_LEN
                 );
            localIp65504P748ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P748ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P748ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P748ReservdL() {	 
			return (getShort(beginIp65504P748ReservdL));
   	}
         int localIp65504P749ReservdSCounter = -1;
         public boolean isIp65504P749ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P749ReservdSCounter != sharedCounter;
            localIp65504P749ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_749_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P749ReservdS
	 */
	protected void serializeIp65504P749ReservdS(short ip65504P749ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P749ReservdS,IP_65504_P_749_RESERVD_S_LEN)
                  ,beginIp65504P749ReservdS
                  ,IP_65504_P_749_RESERVD_S_LEN
                 );
            localIp65504P749ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P749ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P749ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P749ReservdS() {	 
			return (getShort(beginIp65504P749ReservdS));
   	}
         int localIp65504P749ReservdLCounter = -1;
         public boolean isIp65504P749ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P749ReservdLCounter != sharedCounter;
            localIp65504P749ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_749_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P749ReservdL
	 */
	protected void serializeIp65504P749ReservdL(short ip65504P749ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P749ReservdL,IP_65504_P_749_RESERVD_L_LEN)
                  ,beginIp65504P749ReservdL
                  ,IP_65504_P_749_RESERVD_L_LEN
                 );
            localIp65504P749ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P749ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P749ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P749ReservdL() {	 
			return (getShort(beginIp65504P749ReservdL));
   	}
         int localIp65504P750ReservdSCounter = -1;
         public boolean isIp65504P750ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P750ReservdSCounter != sharedCounter;
            localIp65504P750ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_750_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P750ReservdS
	 */
	protected void serializeIp65504P750ReservdS(short ip65504P750ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P750ReservdS,IP_65504_P_750_RESERVD_S_LEN)
                  ,beginIp65504P750ReservdS
                  ,IP_65504_P_750_RESERVD_S_LEN
                 );
            localIp65504P750ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P750ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P750ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P750ReservdS() {	 
			return (getShort(beginIp65504P750ReservdS));
   	}
         int localIp65504P750ReservdLCounter = -1;
         public boolean isIp65504P750ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P750ReservdLCounter != sharedCounter;
            localIp65504P750ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_750_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P750ReservdL
	 */
	protected void serializeIp65504P750ReservdL(short ip65504P750ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P750ReservdL,IP_65504_P_750_RESERVD_L_LEN)
                  ,beginIp65504P750ReservdL
                  ,IP_65504_P_750_RESERVD_L_LEN
                 );
            localIp65504P750ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P750ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P750ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P750ReservdL() {	 
			return (getShort(beginIp65504P750ReservdL));
   	}
         int localIp65504P751ReservdSCounter = -1;
         public boolean isIp65504P751ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P751ReservdSCounter != sharedCounter;
            localIp65504P751ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_751_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P751ReservdS
	 */
	protected void serializeIp65504P751ReservdS(short ip65504P751ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P751ReservdS,IP_65504_P_751_RESERVD_S_LEN)
                  ,beginIp65504P751ReservdS
                  ,IP_65504_P_751_RESERVD_S_LEN
                 );
            localIp65504P751ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P751ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P751ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P751ReservdS() {	 
			return (getShort(beginIp65504P751ReservdS));
   	}
         int localIp65504P751ReservdLCounter = -1;
         public boolean isIp65504P751ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P751ReservdLCounter != sharedCounter;
            localIp65504P751ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_751_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P751ReservdL
	 */
	protected void serializeIp65504P751ReservdL(short ip65504P751ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P751ReservdL,IP_65504_P_751_RESERVD_L_LEN)
                  ,beginIp65504P751ReservdL
                  ,IP_65504_P_751_RESERVD_L_LEN
                 );
            localIp65504P751ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P751ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P751ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P751ReservdL() {	 
			return (getShort(beginIp65504P751ReservdL));
   	}
         int localIp65504P752ReservdSCounter = -1;
         public boolean isIp65504P752ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P752ReservdSCounter != sharedCounter;
            localIp65504P752ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_752_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P752ReservdS
	 */
	protected void serializeIp65504P752ReservdS(short ip65504P752ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P752ReservdS,IP_65504_P_752_RESERVD_S_LEN)
                  ,beginIp65504P752ReservdS
                  ,IP_65504_P_752_RESERVD_S_LEN
                 );
            localIp65504P752ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P752ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P752ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P752ReservdS() {	 
			return (getShort(beginIp65504P752ReservdS));
   	}
         int localIp65504P752ReservdLCounter = -1;
         public boolean isIp65504P752ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P752ReservdLCounter != sharedCounter;
            localIp65504P752ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_752_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P752ReservdL
	 */
	protected void serializeIp65504P752ReservdL(short ip65504P752ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P752ReservdL,IP_65504_P_752_RESERVD_L_LEN)
                  ,beginIp65504P752ReservdL
                  ,IP_65504_P_752_RESERVD_L_LEN
                 );
            localIp65504P752ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P752ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P752ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P752ReservdL() {	 
			return (getShort(beginIp65504P752ReservdL));
   	}
         int localIp65504P753ReservdSCounter = -1;
         public boolean isIp65504P753ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P753ReservdSCounter != sharedCounter;
            localIp65504P753ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_753_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P753ReservdS
	 */
	protected void serializeIp65504P753ReservdS(short ip65504P753ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P753ReservdS,IP_65504_P_753_RESERVD_S_LEN)
                  ,beginIp65504P753ReservdS
                  ,IP_65504_P_753_RESERVD_S_LEN
                 );
            localIp65504P753ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P753ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P753ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P753ReservdS() {	 
			return (getShort(beginIp65504P753ReservdS));
   	}
         int localIp65504P753ReservdLCounter = -1;
         public boolean isIp65504P753ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P753ReservdLCounter != sharedCounter;
            localIp65504P753ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_753_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P753ReservdL
	 */
	protected void serializeIp65504P753ReservdL(short ip65504P753ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P753ReservdL,IP_65504_P_753_RESERVD_L_LEN)
                  ,beginIp65504P753ReservdL
                  ,IP_65504_P_753_RESERVD_L_LEN
                 );
            localIp65504P753ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P753ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P753ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P753ReservdL() {	 
			return (getShort(beginIp65504P753ReservdL));
   	}
         int localIp65504P754ReservdSCounter = -1;
         public boolean isIp65504P754ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P754ReservdSCounter != sharedCounter;
            localIp65504P754ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_754_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P754ReservdS
	 */
	protected void serializeIp65504P754ReservdS(short ip65504P754ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P754ReservdS,IP_65504_P_754_RESERVD_S_LEN)
                  ,beginIp65504P754ReservdS
                  ,IP_65504_P_754_RESERVD_S_LEN
                 );
            localIp65504P754ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P754ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P754ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P754ReservdS() {	 
			return (getShort(beginIp65504P754ReservdS));
   	}
         int localIp65504P754ReservdLCounter = -1;
         public boolean isIp65504P754ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P754ReservdLCounter != sharedCounter;
            localIp65504P754ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_754_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P754ReservdL
	 */
	protected void serializeIp65504P754ReservdL(short ip65504P754ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P754ReservdL,IP_65504_P_754_RESERVD_L_LEN)
                  ,beginIp65504P754ReservdL
                  ,IP_65504_P_754_RESERVD_L_LEN
                 );
            localIp65504P754ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P754ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P754ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P754ReservdL() {	 
			return (getShort(beginIp65504P754ReservdL));
   	}
         int localIp65504P755ReservdSCounter = -1;
         public boolean isIp65504P755ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P755ReservdSCounter != sharedCounter;
            localIp65504P755ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_755_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P755ReservdS
	 */
	protected void serializeIp65504P755ReservdS(short ip65504P755ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P755ReservdS,IP_65504_P_755_RESERVD_S_LEN)
                  ,beginIp65504P755ReservdS
                  ,IP_65504_P_755_RESERVD_S_LEN
                 );
            localIp65504P755ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P755ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P755ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P755ReservdS() {	 
			return (getShort(beginIp65504P755ReservdS));
   	}
         int localIp65504P755ReservdLCounter = -1;
         public boolean isIp65504P755ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P755ReservdLCounter != sharedCounter;
            localIp65504P755ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_755_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P755ReservdL
	 */
	protected void serializeIp65504P755ReservdL(short ip65504P755ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P755ReservdL,IP_65504_P_755_RESERVD_L_LEN)
                  ,beginIp65504P755ReservdL
                  ,IP_65504_P_755_RESERVD_L_LEN
                 );
            localIp65504P755ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P755ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P755ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P755ReservdL() {	 
			return (getShort(beginIp65504P755ReservdL));
   	}
         int localIp65504P756ReservdSCounter = -1;
         public boolean isIp65504P756ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P756ReservdSCounter != sharedCounter;
            localIp65504P756ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_756_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P756ReservdS
	 */
	protected void serializeIp65504P756ReservdS(short ip65504P756ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P756ReservdS,IP_65504_P_756_RESERVD_S_LEN)
                  ,beginIp65504P756ReservdS
                  ,IP_65504_P_756_RESERVD_S_LEN
                 );
            localIp65504P756ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P756ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P756ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P756ReservdS() {	 
			return (getShort(beginIp65504P756ReservdS));
   	}
         int localIp65504P756ReservdLCounter = -1;
         public boolean isIp65504P756ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P756ReservdLCounter != sharedCounter;
            localIp65504P756ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_756_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P756ReservdL
	 */
	protected void serializeIp65504P756ReservdL(short ip65504P756ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P756ReservdL,IP_65504_P_756_RESERVD_L_LEN)
                  ,beginIp65504P756ReservdL
                  ,IP_65504_P_756_RESERVD_L_LEN
                 );
            localIp65504P756ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P756ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P756ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P756ReservdL() {	 
			return (getShort(beginIp65504P756ReservdL));
   	}
         int localIp65504P757ReservdSCounter = -1;
         public boolean isIp65504P757ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P757ReservdSCounter != sharedCounter;
            localIp65504P757ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_757_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P757ReservdS
	 */
	protected void serializeIp65504P757ReservdS(short ip65504P757ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P757ReservdS,IP_65504_P_757_RESERVD_S_LEN)
                  ,beginIp65504P757ReservdS
                  ,IP_65504_P_757_RESERVD_S_LEN
                 );
            localIp65504P757ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P757ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P757ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P757ReservdS() {	 
			return (getShort(beginIp65504P757ReservdS));
   	}
         int localIp65504P757ReservdLCounter = -1;
         public boolean isIp65504P757ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P757ReservdLCounter != sharedCounter;
            localIp65504P757ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_757_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P757ReservdL
	 */
	protected void serializeIp65504P757ReservdL(short ip65504P757ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P757ReservdL,IP_65504_P_757_RESERVD_L_LEN)
                  ,beginIp65504P757ReservdL
                  ,IP_65504_P_757_RESERVD_L_LEN
                 );
            localIp65504P757ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P757ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P757ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P757ReservdL() {	 
			return (getShort(beginIp65504P757ReservdL));
   	}
         int localIp65504P758ReservdSCounter = -1;
         public boolean isIp65504P758ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P758ReservdSCounter != sharedCounter;
            localIp65504P758ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_758_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P758ReservdS
	 */
	protected void serializeIp65504P758ReservdS(short ip65504P758ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P758ReservdS,IP_65504_P_758_RESERVD_S_LEN)
                  ,beginIp65504P758ReservdS
                  ,IP_65504_P_758_RESERVD_S_LEN
                 );
            localIp65504P758ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P758ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P758ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P758ReservdS() {	 
			return (getShort(beginIp65504P758ReservdS));
   	}
         int localIp65504P758ReservdLCounter = -1;
         public boolean isIp65504P758ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P758ReservdLCounter != sharedCounter;
            localIp65504P758ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_758_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P758ReservdL
	 */
	protected void serializeIp65504P758ReservdL(short ip65504P758ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P758ReservdL,IP_65504_P_758_RESERVD_L_LEN)
                  ,beginIp65504P758ReservdL
                  ,IP_65504_P_758_RESERVD_L_LEN
                 );
            localIp65504P758ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P758ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P758ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P758ReservdL() {	 
			return (getShort(beginIp65504P758ReservdL));
   	}
         int localIp65504P759ReservdSCounter = -1;
         public boolean isIp65504P759ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P759ReservdSCounter != sharedCounter;
            localIp65504P759ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_759_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P759ReservdS
	 */
	protected void serializeIp65504P759ReservdS(short ip65504P759ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P759ReservdS,IP_65504_P_759_RESERVD_S_LEN)
                  ,beginIp65504P759ReservdS
                  ,IP_65504_P_759_RESERVD_S_LEN
                 );
            localIp65504P759ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P759ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P759ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P759ReservdS() {	 
			return (getShort(beginIp65504P759ReservdS));
   	}
         int localIp65504P759ReservdLCounter = -1;
         public boolean isIp65504P759ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P759ReservdLCounter != sharedCounter;
            localIp65504P759ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_759_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P759ReservdL
	 */
	protected void serializeIp65504P759ReservdL(short ip65504P759ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P759ReservdL,IP_65504_P_759_RESERVD_L_LEN)
                  ,beginIp65504P759ReservdL
                  ,IP_65504_P_759_RESERVD_L_LEN
                 );
            localIp65504P759ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P759ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P759ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P759ReservdL() {	 
			return (getShort(beginIp65504P759ReservdL));
   	}
         int localIp65504P760ReservdSCounter = -1;
         public boolean isIp65504P760ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P760ReservdSCounter != sharedCounter;
            localIp65504P760ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_760_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P760ReservdS
	 */
	protected void serializeIp65504P760ReservdS(short ip65504P760ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P760ReservdS,IP_65504_P_760_RESERVD_S_LEN)
                  ,beginIp65504P760ReservdS
                  ,IP_65504_P_760_RESERVD_S_LEN
                 );
            localIp65504P760ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P760ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P760ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P760ReservdS() {	 
			return (getShort(beginIp65504P760ReservdS));
   	}
         int localIp65504P760ReservdLCounter = -1;
         public boolean isIp65504P760ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P760ReservdLCounter != sharedCounter;
            localIp65504P760ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_760_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P760ReservdL
	 */
	protected void serializeIp65504P760ReservdL(short ip65504P760ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P760ReservdL,IP_65504_P_760_RESERVD_L_LEN)
                  ,beginIp65504P760ReservdL
                  ,IP_65504_P_760_RESERVD_L_LEN
                 );
            localIp65504P760ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P760ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P760ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P760ReservdL() {	 
			return (getShort(beginIp65504P760ReservdL));
   	}
         int localIp65504P761ReservdSCounter = -1;
         public boolean isIp65504P761ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P761ReservdSCounter != sharedCounter;
            localIp65504P761ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_761_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P761ReservdS
	 */
	protected void serializeIp65504P761ReservdS(short ip65504P761ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P761ReservdS,IP_65504_P_761_RESERVD_S_LEN)
                  ,beginIp65504P761ReservdS
                  ,IP_65504_P_761_RESERVD_S_LEN
                 );
            localIp65504P761ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P761ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P761ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P761ReservdS() {	 
			return (getShort(beginIp65504P761ReservdS));
   	}
         int localIp65504P761ReservdLCounter = -1;
         public boolean isIp65504P761ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P761ReservdLCounter != sharedCounter;
            localIp65504P761ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_761_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P761ReservdL
	 */
	protected void serializeIp65504P761ReservdL(short ip65504P761ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P761ReservdL,IP_65504_P_761_RESERVD_L_LEN)
                  ,beginIp65504P761ReservdL
                  ,IP_65504_P_761_RESERVD_L_LEN
                 );
            localIp65504P761ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P761ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P761ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P761ReservdL() {	 
			return (getShort(beginIp65504P761ReservdL));
   	}
         int localIp65504P762ReservdSCounter = -1;
         public boolean isIp65504P762ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P762ReservdSCounter != sharedCounter;
            localIp65504P762ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_762_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P762ReservdS
	 */
	protected void serializeIp65504P762ReservdS(short ip65504P762ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P762ReservdS,IP_65504_P_762_RESERVD_S_LEN)
                  ,beginIp65504P762ReservdS
                  ,IP_65504_P_762_RESERVD_S_LEN
                 );
            localIp65504P762ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P762ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P762ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P762ReservdS() {	 
			return (getShort(beginIp65504P762ReservdS));
   	}
         int localIp65504P762ReservdLCounter = -1;
         public boolean isIp65504P762ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P762ReservdLCounter != sharedCounter;
            localIp65504P762ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_762_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P762ReservdL
	 */
	protected void serializeIp65504P762ReservdL(short ip65504P762ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P762ReservdL,IP_65504_P_762_RESERVD_L_LEN)
                  ,beginIp65504P762ReservdL
                  ,IP_65504_P_762_RESERVD_L_LEN
                 );
            localIp65504P762ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P762ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P762ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P762ReservdL() {	 
			return (getShort(beginIp65504P762ReservdL));
   	}
         int localIp65504P763ReservdSCounter = -1;
         public boolean isIp65504P763ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P763ReservdSCounter != sharedCounter;
            localIp65504P763ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_763_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P763ReservdS
	 */
	protected void serializeIp65504P763ReservdS(short ip65504P763ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P763ReservdS,IP_65504_P_763_RESERVD_S_LEN)
                  ,beginIp65504P763ReservdS
                  ,IP_65504_P_763_RESERVD_S_LEN
                 );
            localIp65504P763ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P763ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P763ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P763ReservdS() {	 
			return (getShort(beginIp65504P763ReservdS));
   	}
         int localIp65504P763ReservdLCounter = -1;
         public boolean isIp65504P763ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P763ReservdLCounter != sharedCounter;
            localIp65504P763ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_763_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P763ReservdL
	 */
	protected void serializeIp65504P763ReservdL(short ip65504P763ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P763ReservdL,IP_65504_P_763_RESERVD_L_LEN)
                  ,beginIp65504P763ReservdL
                  ,IP_65504_P_763_RESERVD_L_LEN
                 );
            localIp65504P763ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P763ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P763ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P763ReservdL() {	 
			return (getShort(beginIp65504P763ReservdL));
   	}
         int localIp65504P764ReservdSCounter = -1;
         public boolean isIp65504P764ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P764ReservdSCounter != sharedCounter;
            localIp65504P764ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_764_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P764ReservdS
	 */
	protected void serializeIp65504P764ReservdS(short ip65504P764ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P764ReservdS,IP_65504_P_764_RESERVD_S_LEN)
                  ,beginIp65504P764ReservdS
                  ,IP_65504_P_764_RESERVD_S_LEN
                 );
            localIp65504P764ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P764ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P764ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P764ReservdS() {	 
			return (getShort(beginIp65504P764ReservdS));
   	}
         int localIp65504P764ReservdLCounter = -1;
         public boolean isIp65504P764ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P764ReservdLCounter != sharedCounter;
            localIp65504P764ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_764_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P764ReservdL
	 */
	protected void serializeIp65504P764ReservdL(short ip65504P764ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P764ReservdL,IP_65504_P_764_RESERVD_L_LEN)
                  ,beginIp65504P764ReservdL
                  ,IP_65504_P_764_RESERVD_L_LEN
                 );
            localIp65504P764ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P764ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P764ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P764ReservdL() {	 
			return (getShort(beginIp65504P764ReservdL));
   	}
         int localIp65504P765ReservdSCounter = -1;
         public boolean isIp65504P765ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P765ReservdSCounter != sharedCounter;
            localIp65504P765ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_765_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P765ReservdS
	 */
	protected void serializeIp65504P765ReservdS(short ip65504P765ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P765ReservdS,IP_65504_P_765_RESERVD_S_LEN)
                  ,beginIp65504P765ReservdS
                  ,IP_65504_P_765_RESERVD_S_LEN
                 );
            localIp65504P765ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P765ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P765ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P765ReservdS() {	 
			return (getShort(beginIp65504P765ReservdS));
   	}
         int localIp65504P765ReservdLCounter = -1;
         public boolean isIp65504P765ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P765ReservdLCounter != sharedCounter;
            localIp65504P765ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_765_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P765ReservdL
	 */
	protected void serializeIp65504P765ReservdL(short ip65504P765ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P765ReservdL,IP_65504_P_765_RESERVD_L_LEN)
                  ,beginIp65504P765ReservdL
                  ,IP_65504_P_765_RESERVD_L_LEN
                 );
            localIp65504P765ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P765ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P765ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P765ReservdL() {	 
			return (getShort(beginIp65504P765ReservdL));
   	}
         int localIp65504P766ReservdSCounter = -1;
         public boolean isIp65504P766ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P766ReservdSCounter != sharedCounter;
            localIp65504P766ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_766_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P766ReservdS
	 */
	protected void serializeIp65504P766ReservdS(short ip65504P766ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P766ReservdS,IP_65504_P_766_RESERVD_S_LEN)
                  ,beginIp65504P766ReservdS
                  ,IP_65504_P_766_RESERVD_S_LEN
                 );
            localIp65504P766ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P766ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P766ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P766ReservdS() {	 
			return (getShort(beginIp65504P766ReservdS));
   	}
         int localIp65504P766ReservdLCounter = -1;
         public boolean isIp65504P766ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P766ReservdLCounter != sharedCounter;
            localIp65504P766ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_766_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P766ReservdL
	 */
	protected void serializeIp65504P766ReservdL(short ip65504P766ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P766ReservdL,IP_65504_P_766_RESERVD_L_LEN)
                  ,beginIp65504P766ReservdL
                  ,IP_65504_P_766_RESERVD_L_LEN
                 );
            localIp65504P766ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P766ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P766ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P766ReservdL() {	 
			return (getShort(beginIp65504P766ReservdL));
   	}
         int localIp65504P767ReservdSCounter = -1;
         public boolean isIp65504P767ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P767ReservdSCounter != sharedCounter;
            localIp65504P767ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_767_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P767ReservdS
	 */
	protected void serializeIp65504P767ReservdS(short ip65504P767ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P767ReservdS,IP_65504_P_767_RESERVD_S_LEN)
                  ,beginIp65504P767ReservdS
                  ,IP_65504_P_767_RESERVD_S_LEN
                 );
            localIp65504P767ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P767ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P767ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P767ReservdS() {	 
			return (getShort(beginIp65504P767ReservdS));
   	}
         int localIp65504P767ReservdLCounter = -1;
         public boolean isIp65504P767ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P767ReservdLCounter != sharedCounter;
            localIp65504P767ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_767_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P767ReservdL
	 */
	protected void serializeIp65504P767ReservdL(short ip65504P767ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P767ReservdL,IP_65504_P_767_RESERVD_L_LEN)
                  ,beginIp65504P767ReservdL
                  ,IP_65504_P_767_RESERVD_L_LEN
                 );
            localIp65504P767ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P767ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P767ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P767ReservdL() {	 
			return (getShort(beginIp65504P767ReservdL));
   	}
         int localIp65504P768ReservdSCounter = -1;
         public boolean isIp65504P768ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P768ReservdSCounter != sharedCounter;
            localIp65504P768ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_768_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P768ReservdS
	 */
	protected void serializeIp65504P768ReservdS(short ip65504P768ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P768ReservdS,IP_65504_P_768_RESERVD_S_LEN)
                  ,beginIp65504P768ReservdS
                  ,IP_65504_P_768_RESERVD_S_LEN
                 );
            localIp65504P768ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P768ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P768ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P768ReservdS() {	 
			return (getShort(beginIp65504P768ReservdS));
   	}
         int localIp65504P768ReservdLCounter = -1;
         public boolean isIp65504P768ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P768ReservdLCounter != sharedCounter;
            localIp65504P768ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_768_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P768ReservdL
	 */
	protected void serializeIp65504P768ReservdL(short ip65504P768ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P768ReservdL,IP_65504_P_768_RESERVD_L_LEN)
                  ,beginIp65504P768ReservdL
                  ,IP_65504_P_768_RESERVD_L_LEN
                 );
            localIp65504P768ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P768ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P768ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P768ReservdL() {	 
			return (getShort(beginIp65504P768ReservdL));
   	}
         int localIp65504P769ReservdSCounter = -1;
         public boolean isIp65504P769ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P769ReservdSCounter != sharedCounter;
            localIp65504P769ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_769_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P769ReservdS
	 */
	protected void serializeIp65504P769ReservdS(short ip65504P769ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P769ReservdS,IP_65504_P_769_RESERVD_S_LEN)
                  ,beginIp65504P769ReservdS
                  ,IP_65504_P_769_RESERVD_S_LEN
                 );
            localIp65504P769ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P769ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P769ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P769ReservdS() {	 
			return (getShort(beginIp65504P769ReservdS));
   	}
         int localIp65504P769ReservdLCounter = -1;
         public boolean isIp65504P769ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P769ReservdLCounter != sharedCounter;
            localIp65504P769ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_769_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P769ReservdL
	 */
	protected void serializeIp65504P769ReservdL(short ip65504P769ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P769ReservdL,IP_65504_P_769_RESERVD_L_LEN)
                  ,beginIp65504P769ReservdL
                  ,IP_65504_P_769_RESERVD_L_LEN
                 );
            localIp65504P769ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P769ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P769ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P769ReservdL() {	 
			return (getShort(beginIp65504P769ReservdL));
   	}
         int localIp65504P770ReservdSCounter = -1;
         public boolean isIp65504P770ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P770ReservdSCounter != sharedCounter;
            localIp65504P770ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_770_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P770ReservdS
	 */
	protected void serializeIp65504P770ReservdS(short ip65504P770ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P770ReservdS,IP_65504_P_770_RESERVD_S_LEN)
                  ,beginIp65504P770ReservdS
                  ,IP_65504_P_770_RESERVD_S_LEN
                 );
            localIp65504P770ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P770ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P770ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P770ReservdS() {	 
			return (getShort(beginIp65504P770ReservdS));
   	}
         int localIp65504P770ReservdLCounter = -1;
         public boolean isIp65504P770ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P770ReservdLCounter != sharedCounter;
            localIp65504P770ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_770_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P770ReservdL
	 */
	protected void serializeIp65504P770ReservdL(short ip65504P770ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P770ReservdL,IP_65504_P_770_RESERVD_L_LEN)
                  ,beginIp65504P770ReservdL
                  ,IP_65504_P_770_RESERVD_L_LEN
                 );
            localIp65504P770ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P770ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P770ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P770ReservdL() {	 
			return (getShort(beginIp65504P770ReservdL));
   	}
         int localIp65504P771ReservdSCounter = -1;
         public boolean isIp65504P771ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P771ReservdSCounter != sharedCounter;
            localIp65504P771ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_771_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P771ReservdS
	 */
	protected void serializeIp65504P771ReservdS(short ip65504P771ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P771ReservdS,IP_65504_P_771_RESERVD_S_LEN)
                  ,beginIp65504P771ReservdS
                  ,IP_65504_P_771_RESERVD_S_LEN
                 );
            localIp65504P771ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P771ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P771ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P771ReservdS() {	 
			return (getShort(beginIp65504P771ReservdS));
   	}
         int localIp65504P771ReservdLCounter = -1;
         public boolean isIp65504P771ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P771ReservdLCounter != sharedCounter;
            localIp65504P771ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_771_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P771ReservdL
	 */
	protected void serializeIp65504P771ReservdL(short ip65504P771ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P771ReservdL,IP_65504_P_771_RESERVD_L_LEN)
                  ,beginIp65504P771ReservdL
                  ,IP_65504_P_771_RESERVD_L_LEN
                 );
            localIp65504P771ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P771ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P771ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P771ReservdL() {	 
			return (getShort(beginIp65504P771ReservdL));
   	}
         int localIp65504P772ReservdSCounter = -1;
         public boolean isIp65504P772ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P772ReservdSCounter != sharedCounter;
            localIp65504P772ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_772_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P772ReservdS
	 */
	protected void serializeIp65504P772ReservdS(short ip65504P772ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P772ReservdS,IP_65504_P_772_RESERVD_S_LEN)
                  ,beginIp65504P772ReservdS
                  ,IP_65504_P_772_RESERVD_S_LEN
                 );
            localIp65504P772ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P772ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P772ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P772ReservdS() {	 
			return (getShort(beginIp65504P772ReservdS));
   	}
         int localIp65504P772ReservdLCounter = -1;
         public boolean isIp65504P772ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P772ReservdLCounter != sharedCounter;
            localIp65504P772ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_772_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P772ReservdL
	 */
	protected void serializeIp65504P772ReservdL(short ip65504P772ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P772ReservdL,IP_65504_P_772_RESERVD_L_LEN)
                  ,beginIp65504P772ReservdL
                  ,IP_65504_P_772_RESERVD_L_LEN
                 );
            localIp65504P772ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P772ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P772ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P772ReservdL() {	 
			return (getShort(beginIp65504P772ReservdL));
   	}
         int localIp65504P773ReservdSCounter = -1;
         public boolean isIp65504P773ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P773ReservdSCounter != sharedCounter;
            localIp65504P773ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_773_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P773ReservdS
	 */
	protected void serializeIp65504P773ReservdS(short ip65504P773ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P773ReservdS,IP_65504_P_773_RESERVD_S_LEN)
                  ,beginIp65504P773ReservdS
                  ,IP_65504_P_773_RESERVD_S_LEN
                 );
            localIp65504P773ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P773ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P773ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P773ReservdS() {	 
			return (getShort(beginIp65504P773ReservdS));
   	}
         int localIp65504P773ReservdLCounter = -1;
         public boolean isIp65504P773ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P773ReservdLCounter != sharedCounter;
            localIp65504P773ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_773_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P773ReservdL
	 */
	protected void serializeIp65504P773ReservdL(short ip65504P773ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P773ReservdL,IP_65504_P_773_RESERVD_L_LEN)
                  ,beginIp65504P773ReservdL
                  ,IP_65504_P_773_RESERVD_L_LEN
                 );
            localIp65504P773ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P773ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P773ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P773ReservdL() {	 
			return (getShort(beginIp65504P773ReservdL));
   	}
         int localIp65504P774ReservdSCounter = -1;
         public boolean isIp65504P774ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P774ReservdSCounter != sharedCounter;
            localIp65504P774ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_774_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P774ReservdS
	 */
	protected void serializeIp65504P774ReservdS(short ip65504P774ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P774ReservdS,IP_65504_P_774_RESERVD_S_LEN)
                  ,beginIp65504P774ReservdS
                  ,IP_65504_P_774_RESERVD_S_LEN
                 );
            localIp65504P774ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P774ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P774ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P774ReservdS() {	 
			return (getShort(beginIp65504P774ReservdS));
   	}
         int localIp65504P774ReservdLCounter = -1;
         public boolean isIp65504P774ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P774ReservdLCounter != sharedCounter;
            localIp65504P774ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_774_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P774ReservdL
	 */
	protected void serializeIp65504P774ReservdL(short ip65504P774ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P774ReservdL,IP_65504_P_774_RESERVD_L_LEN)
                  ,beginIp65504P774ReservdL
                  ,IP_65504_P_774_RESERVD_L_LEN
                 );
            localIp65504P774ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P774ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P774ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P774ReservdL() {	 
			return (getShort(beginIp65504P774ReservdL));
   	}
         int localIp65504P775ReservdSCounter = -1;
         public boolean isIp65504P775ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P775ReservdSCounter != sharedCounter;
            localIp65504P775ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_775_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P775ReservdS
	 */
	protected void serializeIp65504P775ReservdS(short ip65504P775ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P775ReservdS,IP_65504_P_775_RESERVD_S_LEN)
                  ,beginIp65504P775ReservdS
                  ,IP_65504_P_775_RESERVD_S_LEN
                 );
            localIp65504P775ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P775ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P775ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P775ReservdS() {	 
			return (getShort(beginIp65504P775ReservdS));
   	}
         int localIp65504P775ReservdLCounter = -1;
         public boolean isIp65504P775ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P775ReservdLCounter != sharedCounter;
            localIp65504P775ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_775_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P775ReservdL
	 */
	protected void serializeIp65504P775ReservdL(short ip65504P775ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P775ReservdL,IP_65504_P_775_RESERVD_L_LEN)
                  ,beginIp65504P775ReservdL
                  ,IP_65504_P_775_RESERVD_L_LEN
                 );
            localIp65504P775ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P775ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P775ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P775ReservdL() {	 
			return (getShort(beginIp65504P775ReservdL));
   	}




}
  
