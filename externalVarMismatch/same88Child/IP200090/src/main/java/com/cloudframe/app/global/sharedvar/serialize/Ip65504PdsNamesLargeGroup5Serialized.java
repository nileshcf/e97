package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup5Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:05. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup5Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup5Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_5_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P125ReservdS;
            protected  int beginIp65504P125ReservdL;
            protected  int beginIp65504P126ReservdS;
            protected  int beginIp65504P126ReservdL;
            protected  int beginIp65504P127ReservdS;
            protected  int beginIp65504P127ReservdL;
            protected  int beginIp65504P128ReservdS;
            protected  int beginIp65504P128ReservdL;
            protected  int beginIp65504P129ReservdS;
            protected  int beginIp65504P129ReservdL;
            protected  int beginIp65504P130ReservdS;
            protected  int beginIp65504P130ReservdL;
            protected  int beginIp65504P131ReservdS;
            protected  int beginIp65504P131ReservdL;
            protected  int beginIp65504P132ReservdS;
            protected  int beginIp65504P132ReservdL;
            protected  int beginIp65504P133ReservdS;
            protected  int beginIp65504P133ReservdL;
            protected  int beginIp65504P134ReservdS;
            protected  int beginIp65504P134ReservdL;
            protected  int beginIp65504P135FlrejreS;
            protected  int beginIp65504P135FlrejreL;
            protected  int beginIp65504P136ReservdS;
            protected  int beginIp65504P136ReservdL;
            protected  int beginIp65504P137FeeCtlS;
            protected  int beginIp65504P137FeeCtlL;
            protected  int beginIp65504P138SrcMsgS;
            protected  int beginIp65504P138SrcMsgL;
            protected  int beginIp65504P139ReservdS;
            protected  int beginIp65504P139ReservdL;
            protected  int beginIp65504P140ReservdS;
            protected  int beginIp65504P140ReservdL;
            protected  int beginIp65504P141ReservdS;
            protected  int beginIp65504P141ReservdL;
            protected  int beginIp65504P142ReservdS;
            protected  int beginIp65504P142ReservdL;
            protected  int beginIp65504P143ReservdS;
            protected  int beginIp65504P143ReservdL;
            protected  int beginIp65504P144ReservdS;
            protected  int beginIp65504P144ReservdL;
            protected  int beginIp65504P145ReservdS;
            protected  int beginIp65504P145ReservdL;
            protected  int beginIp65504P146TrxAmtS;
            protected  int beginIp65504P146TrxAmtL;
            protected  int beginIp65504P147OrgAmtS;
            protected  int beginIp65504P147OrgAmtL;
            protected  int beginIp65504P148CurExpS;
            protected  int beginIp65504P148CurExpL;
            protected  int beginIp65504P149CurCdsS;
            protected  int beginIp65504P149CurCdsL;
            protected  int beginIp65504P150ReservdS;
            protected  int beginIp65504P150ReservdL;
            protected  int beginIp65504P151ReservdS;
            protected  int beginIp65504P151ReservdL;
            protected  int beginIp65504P152ReservdS;
            protected  int beginIp65504P152ReservdL;
            protected  int beginIp65504P153ReservdS;
            protected  int beginIp65504P153ReservdL;
            protected  int beginIp65504P154ReservdS;
            protected  int beginIp65504P154ReservdL;
            protected  int beginIp65504P155ReservdS;
            protected  int beginIp65504P155ReservdL;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup5Serialized
	**/
    public Ip65504PdsNamesLargeGroup5Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup5Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup5Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup5Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,988); // serialize this field at offset 988 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup5Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 988 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup5Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_5_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P125ReservdS = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P125ReservdL = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P126ReservdS = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P126ReservdL = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P127ReservdS = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P127ReservdL = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P128ReservdS = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P128ReservdL = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P129ReservdS = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P129ReservdL = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P130ReservdS = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P130ReservdL = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P131ReservdS = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P131ReservdL = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P132ReservdS = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P132ReservdL = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P133ReservdS = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P133ReservdL = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P134ReservdS = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P134ReservdL = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P135FlrejreS = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P135FlrejreL = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P136ReservdS = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P136ReservdL = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P137FeeCtlS = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P137FeeCtlL = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P138SrcMsgS = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P138SrcMsgL = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P139ReservdS = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P139ReservdL = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P140ReservdS = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P140ReservdL = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P141ReservdS = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P141ReservdL = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P142ReservdS = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P142ReservdL = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P143ReservdS = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P143ReservdL = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P144ReservdS = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P144ReservdL = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P145ReservdS = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P145ReservdL = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P146TrxAmtS = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P146TrxAmtL = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P147OrgAmtS = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P147OrgAmtL = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P148CurExpS = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P148CurExpL = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P149CurCdsS = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P149CurCdsL = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P150ReservdS = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P150ReservdL = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P151ReservdS = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P151ReservdL = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P152ReservdS = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P152ReservdL = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P153ReservdS = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P153ReservdL = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P154ReservdS = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P154ReservdL = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P155ReservdS = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P155ReservdL = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P125ReservdSCounter = -1;
         public boolean isIp65504P125ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P125ReservdSCounter != sharedCounter;
            localIp65504P125ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_125_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P125ReservdS
	 */
	protected void serializeIp65504P125ReservdS(short ip65504P125ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P125ReservdS,IP_65504_P_125_RESERVD_S_LEN)
                  ,beginIp65504P125ReservdS
                  ,IP_65504_P_125_RESERVD_S_LEN
                 );
            localIp65504P125ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P125ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P125ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P125ReservdS() {	 
			return (getShort(beginIp65504P125ReservdS));
   	}
         int localIp65504P125ReservdLCounter = -1;
         public boolean isIp65504P125ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P125ReservdLCounter != sharedCounter;
            localIp65504P125ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_125_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P125ReservdL
	 */
	protected void serializeIp65504P125ReservdL(short ip65504P125ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P125ReservdL,IP_65504_P_125_RESERVD_L_LEN)
                  ,beginIp65504P125ReservdL
                  ,IP_65504_P_125_RESERVD_L_LEN
                 );
            localIp65504P125ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P125ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P125ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P125ReservdL() {	 
			return (getShort(beginIp65504P125ReservdL));
   	}
         int localIp65504P126ReservdSCounter = -1;
         public boolean isIp65504P126ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P126ReservdSCounter != sharedCounter;
            localIp65504P126ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_126_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P126ReservdS
	 */
	protected void serializeIp65504P126ReservdS(short ip65504P126ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P126ReservdS,IP_65504_P_126_RESERVD_S_LEN)
                  ,beginIp65504P126ReservdS
                  ,IP_65504_P_126_RESERVD_S_LEN
                 );
            localIp65504P126ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P126ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P126ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P126ReservdS() {	 
			return (getShort(beginIp65504P126ReservdS));
   	}
         int localIp65504P126ReservdLCounter = -1;
         public boolean isIp65504P126ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P126ReservdLCounter != sharedCounter;
            localIp65504P126ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_126_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P126ReservdL
	 */
	protected void serializeIp65504P126ReservdL(short ip65504P126ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P126ReservdL,IP_65504_P_126_RESERVD_L_LEN)
                  ,beginIp65504P126ReservdL
                  ,IP_65504_P_126_RESERVD_L_LEN
                 );
            localIp65504P126ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P126ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P126ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P126ReservdL() {	 
			return (getShort(beginIp65504P126ReservdL));
   	}
         int localIp65504P127ReservdSCounter = -1;
         public boolean isIp65504P127ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P127ReservdSCounter != sharedCounter;
            localIp65504P127ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_127_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P127ReservdS
	 */
	protected void serializeIp65504P127ReservdS(short ip65504P127ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P127ReservdS,IP_65504_P_127_RESERVD_S_LEN)
                  ,beginIp65504P127ReservdS
                  ,IP_65504_P_127_RESERVD_S_LEN
                 );
            localIp65504P127ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P127ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P127ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P127ReservdS() {	 
			return (getShort(beginIp65504P127ReservdS));
   	}
         int localIp65504P127ReservdLCounter = -1;
         public boolean isIp65504P127ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P127ReservdLCounter != sharedCounter;
            localIp65504P127ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_127_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P127ReservdL
	 */
	protected void serializeIp65504P127ReservdL(short ip65504P127ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P127ReservdL,IP_65504_P_127_RESERVD_L_LEN)
                  ,beginIp65504P127ReservdL
                  ,IP_65504_P_127_RESERVD_L_LEN
                 );
            localIp65504P127ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P127ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P127ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P127ReservdL() {	 
			return (getShort(beginIp65504P127ReservdL));
   	}
         int localIp65504P128ReservdSCounter = -1;
         public boolean isIp65504P128ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P128ReservdSCounter != sharedCounter;
            localIp65504P128ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_128_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P128ReservdS
	 */
	protected void serializeIp65504P128ReservdS(short ip65504P128ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P128ReservdS,IP_65504_P_128_RESERVD_S_LEN)
                  ,beginIp65504P128ReservdS
                  ,IP_65504_P_128_RESERVD_S_LEN
                 );
            localIp65504P128ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P128ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P128ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P128ReservdS() {	 
			return (getShort(beginIp65504P128ReservdS));
   	}
         int localIp65504P128ReservdLCounter = -1;
         public boolean isIp65504P128ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P128ReservdLCounter != sharedCounter;
            localIp65504P128ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_128_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P128ReservdL
	 */
	protected void serializeIp65504P128ReservdL(short ip65504P128ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P128ReservdL,IP_65504_P_128_RESERVD_L_LEN)
                  ,beginIp65504P128ReservdL
                  ,IP_65504_P_128_RESERVD_L_LEN
                 );
            localIp65504P128ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P128ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P128ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P128ReservdL() {	 
			return (getShort(beginIp65504P128ReservdL));
   	}
         int localIp65504P129ReservdSCounter = -1;
         public boolean isIp65504P129ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P129ReservdSCounter != sharedCounter;
            localIp65504P129ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_129_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P129ReservdS
	 */
	protected void serializeIp65504P129ReservdS(short ip65504P129ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P129ReservdS,IP_65504_P_129_RESERVD_S_LEN)
                  ,beginIp65504P129ReservdS
                  ,IP_65504_P_129_RESERVD_S_LEN
                 );
            localIp65504P129ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P129ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P129ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P129ReservdS() {	 
			return (getShort(beginIp65504P129ReservdS));
   	}
         int localIp65504P129ReservdLCounter = -1;
         public boolean isIp65504P129ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P129ReservdLCounter != sharedCounter;
            localIp65504P129ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_129_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P129ReservdL
	 */
	protected void serializeIp65504P129ReservdL(short ip65504P129ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P129ReservdL,IP_65504_P_129_RESERVD_L_LEN)
                  ,beginIp65504P129ReservdL
                  ,IP_65504_P_129_RESERVD_L_LEN
                 );
            localIp65504P129ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P129ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P129ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P129ReservdL() {	 
			return (getShort(beginIp65504P129ReservdL));
   	}
         int localIp65504P130ReservdSCounter = -1;
         public boolean isIp65504P130ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P130ReservdSCounter != sharedCounter;
            localIp65504P130ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_130_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P130ReservdS
	 */
	protected void serializeIp65504P130ReservdS(short ip65504P130ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P130ReservdS,IP_65504_P_130_RESERVD_S_LEN)
                  ,beginIp65504P130ReservdS
                  ,IP_65504_P_130_RESERVD_S_LEN
                 );
            localIp65504P130ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P130ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P130ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P130ReservdS() {	 
			return (getShort(beginIp65504P130ReservdS));
   	}
         int localIp65504P130ReservdLCounter = -1;
         public boolean isIp65504P130ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P130ReservdLCounter != sharedCounter;
            localIp65504P130ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_130_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P130ReservdL
	 */
	protected void serializeIp65504P130ReservdL(short ip65504P130ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P130ReservdL,IP_65504_P_130_RESERVD_L_LEN)
                  ,beginIp65504P130ReservdL
                  ,IP_65504_P_130_RESERVD_L_LEN
                 );
            localIp65504P130ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P130ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P130ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P130ReservdL() {	 
			return (getShort(beginIp65504P130ReservdL));
   	}
         int localIp65504P131ReservdSCounter = -1;
         public boolean isIp65504P131ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P131ReservdSCounter != sharedCounter;
            localIp65504P131ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_131_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P131ReservdS
	 */
	protected void serializeIp65504P131ReservdS(short ip65504P131ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P131ReservdS,IP_65504_P_131_RESERVD_S_LEN)
                  ,beginIp65504P131ReservdS
                  ,IP_65504_P_131_RESERVD_S_LEN
                 );
            localIp65504P131ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P131ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P131ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P131ReservdS() {	 
			return (getShort(beginIp65504P131ReservdS));
   	}
         int localIp65504P131ReservdLCounter = -1;
         public boolean isIp65504P131ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P131ReservdLCounter != sharedCounter;
            localIp65504P131ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_131_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P131ReservdL
	 */
	protected void serializeIp65504P131ReservdL(short ip65504P131ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P131ReservdL,IP_65504_P_131_RESERVD_L_LEN)
                  ,beginIp65504P131ReservdL
                  ,IP_65504_P_131_RESERVD_L_LEN
                 );
            localIp65504P131ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P131ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P131ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P131ReservdL() {	 
			return (getShort(beginIp65504P131ReservdL));
   	}
         int localIp65504P132ReservdSCounter = -1;
         public boolean isIp65504P132ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P132ReservdSCounter != sharedCounter;
            localIp65504P132ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_132_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P132ReservdS
	 */
	protected void serializeIp65504P132ReservdS(short ip65504P132ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P132ReservdS,IP_65504_P_132_RESERVD_S_LEN)
                  ,beginIp65504P132ReservdS
                  ,IP_65504_P_132_RESERVD_S_LEN
                 );
            localIp65504P132ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P132ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P132ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P132ReservdS() {	 
			return (getShort(beginIp65504P132ReservdS));
   	}
         int localIp65504P132ReservdLCounter = -1;
         public boolean isIp65504P132ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P132ReservdLCounter != sharedCounter;
            localIp65504P132ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_132_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P132ReservdL
	 */
	protected void serializeIp65504P132ReservdL(short ip65504P132ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P132ReservdL,IP_65504_P_132_RESERVD_L_LEN)
                  ,beginIp65504P132ReservdL
                  ,IP_65504_P_132_RESERVD_L_LEN
                 );
            localIp65504P132ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P132ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P132ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P132ReservdL() {	 
			return (getShort(beginIp65504P132ReservdL));
   	}
         int localIp65504P133ReservdSCounter = -1;
         public boolean isIp65504P133ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P133ReservdSCounter != sharedCounter;
            localIp65504P133ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_133_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P133ReservdS
	 */
	protected void serializeIp65504P133ReservdS(short ip65504P133ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P133ReservdS,IP_65504_P_133_RESERVD_S_LEN)
                  ,beginIp65504P133ReservdS
                  ,IP_65504_P_133_RESERVD_S_LEN
                 );
            localIp65504P133ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P133ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P133ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P133ReservdS() {	 
			return (getShort(beginIp65504P133ReservdS));
   	}
         int localIp65504P133ReservdLCounter = -1;
         public boolean isIp65504P133ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P133ReservdLCounter != sharedCounter;
            localIp65504P133ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_133_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P133ReservdL
	 */
	protected void serializeIp65504P133ReservdL(short ip65504P133ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P133ReservdL,IP_65504_P_133_RESERVD_L_LEN)
                  ,beginIp65504P133ReservdL
                  ,IP_65504_P_133_RESERVD_L_LEN
                 );
            localIp65504P133ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P133ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P133ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P133ReservdL() {	 
			return (getShort(beginIp65504P133ReservdL));
   	}
         int localIp65504P134ReservdSCounter = -1;
         public boolean isIp65504P134ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P134ReservdSCounter != sharedCounter;
            localIp65504P134ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_134_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P134ReservdS
	 */
	protected void serializeIp65504P134ReservdS(short ip65504P134ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P134ReservdS,IP_65504_P_134_RESERVD_S_LEN)
                  ,beginIp65504P134ReservdS
                  ,IP_65504_P_134_RESERVD_S_LEN
                 );
            localIp65504P134ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P134ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P134ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P134ReservdS() {	 
			return (getShort(beginIp65504P134ReservdS));
   	}
         int localIp65504P134ReservdLCounter = -1;
         public boolean isIp65504P134ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P134ReservdLCounter != sharedCounter;
            localIp65504P134ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_134_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P134ReservdL
	 */
	protected void serializeIp65504P134ReservdL(short ip65504P134ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P134ReservdL,IP_65504_P_134_RESERVD_L_LEN)
                  ,beginIp65504P134ReservdL
                  ,IP_65504_P_134_RESERVD_L_LEN
                 );
            localIp65504P134ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P134ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P134ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P134ReservdL() {	 
			return (getShort(beginIp65504P134ReservdL));
   	}
         int localIp65504P135FlrejreSCounter = -1;
         public boolean isIp65504P135FlrejreSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P135FlrejreSCounter != sharedCounter;
            localIp65504P135FlrejreSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_135_FLREJRE_S_LEN = 2;
  	/**
	 * serializeIp65504P135FlrejreS
	 */
	protected void serializeIp65504P135FlrejreS(short ip65504P135FlrejreS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P135FlrejreS,IP_65504_P_135_FLREJRE_S_LEN)
                  ,beginIp65504P135FlrejreS
                  ,IP_65504_P_135_FLREJRE_S_LEN
                 );
            localIp65504P135FlrejreSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P135FlrejreSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P135FlrejreS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P135FlrejreS() {	 
			return (getShort(beginIp65504P135FlrejreS));
   	}
         int localIp65504P135FlrejreLCounter = -1;
         public boolean isIp65504P135FlrejreLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P135FlrejreLCounter != sharedCounter;
            localIp65504P135FlrejreLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_135_FLREJRE_L_LEN = 2;
  	/**
	 * serializeIp65504P135FlrejreL
	 */
	protected void serializeIp65504P135FlrejreL(short ip65504P135FlrejreL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P135FlrejreL,IP_65504_P_135_FLREJRE_L_LEN)
                  ,beginIp65504P135FlrejreL
                  ,IP_65504_P_135_FLREJRE_L_LEN
                 );
            localIp65504P135FlrejreLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P135FlrejreLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P135FlrejreL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P135FlrejreL() {	 
			return (getShort(beginIp65504P135FlrejreL));
   	}
         int localIp65504P136ReservdSCounter = -1;
         public boolean isIp65504P136ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P136ReservdSCounter != sharedCounter;
            localIp65504P136ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_136_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P136ReservdS
	 */
	protected void serializeIp65504P136ReservdS(short ip65504P136ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P136ReservdS,IP_65504_P_136_RESERVD_S_LEN)
                  ,beginIp65504P136ReservdS
                  ,IP_65504_P_136_RESERVD_S_LEN
                 );
            localIp65504P136ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P136ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P136ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P136ReservdS() {	 
			return (getShort(beginIp65504P136ReservdS));
   	}
         int localIp65504P136ReservdLCounter = -1;
         public boolean isIp65504P136ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P136ReservdLCounter != sharedCounter;
            localIp65504P136ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_136_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P136ReservdL
	 */
	protected void serializeIp65504P136ReservdL(short ip65504P136ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P136ReservdL,IP_65504_P_136_RESERVD_L_LEN)
                  ,beginIp65504P136ReservdL
                  ,IP_65504_P_136_RESERVD_L_LEN
                 );
            localIp65504P136ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P136ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P136ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P136ReservdL() {	 
			return (getShort(beginIp65504P136ReservdL));
   	}
         int localIp65504P137FeeCtlSCounter = -1;
         public boolean isIp65504P137FeeCtlSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P137FeeCtlSCounter != sharedCounter;
            localIp65504P137FeeCtlSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_137_FEE_CTL_S_LEN = 2;
  	/**
	 * serializeIp65504P137FeeCtlS
	 */
	protected void serializeIp65504P137FeeCtlS(short ip65504P137FeeCtlS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P137FeeCtlS,IP_65504_P_137_FEE_CTL_S_LEN)
                  ,beginIp65504P137FeeCtlS
                  ,IP_65504_P_137_FEE_CTL_S_LEN
                 );
            localIp65504P137FeeCtlSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P137FeeCtlSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P137FeeCtlS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P137FeeCtlS() {	 
			return (getShort(beginIp65504P137FeeCtlS));
   	}
         int localIp65504P137FeeCtlLCounter = -1;
         public boolean isIp65504P137FeeCtlLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P137FeeCtlLCounter != sharedCounter;
            localIp65504P137FeeCtlLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_137_FEE_CTL_L_LEN = 2;
  	/**
	 * serializeIp65504P137FeeCtlL
	 */
	protected void serializeIp65504P137FeeCtlL(short ip65504P137FeeCtlL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P137FeeCtlL,IP_65504_P_137_FEE_CTL_L_LEN)
                  ,beginIp65504P137FeeCtlL
                  ,IP_65504_P_137_FEE_CTL_L_LEN
                 );
            localIp65504P137FeeCtlLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P137FeeCtlLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P137FeeCtlL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P137FeeCtlL() {	 
			return (getShort(beginIp65504P137FeeCtlL));
   	}
         int localIp65504P138SrcMsgSCounter = -1;
         public boolean isIp65504P138SrcMsgSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P138SrcMsgSCounter != sharedCounter;
            localIp65504P138SrcMsgSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_138_SRC_MSG_S_LEN = 2;
  	/**
	 * serializeIp65504P138SrcMsgS
	 */
	protected void serializeIp65504P138SrcMsgS(short ip65504P138SrcMsgS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P138SrcMsgS,IP_65504_P_138_SRC_MSG_S_LEN)
                  ,beginIp65504P138SrcMsgS
                  ,IP_65504_P_138_SRC_MSG_S_LEN
                 );
            localIp65504P138SrcMsgSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P138SrcMsgSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P138SrcMsgS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P138SrcMsgS() {	 
			return (getShort(beginIp65504P138SrcMsgS));
   	}
         int localIp65504P138SrcMsgLCounter = -1;
         public boolean isIp65504P138SrcMsgLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P138SrcMsgLCounter != sharedCounter;
            localIp65504P138SrcMsgLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_138_SRC_MSG_L_LEN = 2;
  	/**
	 * serializeIp65504P138SrcMsgL
	 */
	protected void serializeIp65504P138SrcMsgL(short ip65504P138SrcMsgL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P138SrcMsgL,IP_65504_P_138_SRC_MSG_L_LEN)
                  ,beginIp65504P138SrcMsgL
                  ,IP_65504_P_138_SRC_MSG_L_LEN
                 );
            localIp65504P138SrcMsgLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P138SrcMsgLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P138SrcMsgL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P138SrcMsgL() {	 
			return (getShort(beginIp65504P138SrcMsgL));
   	}
         int localIp65504P139ReservdSCounter = -1;
         public boolean isIp65504P139ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P139ReservdSCounter != sharedCounter;
            localIp65504P139ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_139_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P139ReservdS
	 */
	protected void serializeIp65504P139ReservdS(short ip65504P139ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P139ReservdS,IP_65504_P_139_RESERVD_S_LEN)
                  ,beginIp65504P139ReservdS
                  ,IP_65504_P_139_RESERVD_S_LEN
                 );
            localIp65504P139ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P139ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P139ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P139ReservdS() {	 
			return (getShort(beginIp65504P139ReservdS));
   	}
         int localIp65504P139ReservdLCounter = -1;
         public boolean isIp65504P139ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P139ReservdLCounter != sharedCounter;
            localIp65504P139ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_139_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P139ReservdL
	 */
	protected void serializeIp65504P139ReservdL(short ip65504P139ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P139ReservdL,IP_65504_P_139_RESERVD_L_LEN)
                  ,beginIp65504P139ReservdL
                  ,IP_65504_P_139_RESERVD_L_LEN
                 );
            localIp65504P139ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P139ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P139ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P139ReservdL() {	 
			return (getShort(beginIp65504P139ReservdL));
   	}
         int localIp65504P140ReservdSCounter = -1;
         public boolean isIp65504P140ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P140ReservdSCounter != sharedCounter;
            localIp65504P140ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_140_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P140ReservdS
	 */
	protected void serializeIp65504P140ReservdS(short ip65504P140ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P140ReservdS,IP_65504_P_140_RESERVD_S_LEN)
                  ,beginIp65504P140ReservdS
                  ,IP_65504_P_140_RESERVD_S_LEN
                 );
            localIp65504P140ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P140ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P140ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P140ReservdS() {	 
			return (getShort(beginIp65504P140ReservdS));
   	}
         int localIp65504P140ReservdLCounter = -1;
         public boolean isIp65504P140ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P140ReservdLCounter != sharedCounter;
            localIp65504P140ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_140_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P140ReservdL
	 */
	protected void serializeIp65504P140ReservdL(short ip65504P140ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P140ReservdL,IP_65504_P_140_RESERVD_L_LEN)
                  ,beginIp65504P140ReservdL
                  ,IP_65504_P_140_RESERVD_L_LEN
                 );
            localIp65504P140ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P140ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P140ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P140ReservdL() {	 
			return (getShort(beginIp65504P140ReservdL));
   	}
         int localIp65504P141ReservdSCounter = -1;
         public boolean isIp65504P141ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P141ReservdSCounter != sharedCounter;
            localIp65504P141ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_141_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P141ReservdS
	 */
	protected void serializeIp65504P141ReservdS(short ip65504P141ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P141ReservdS,IP_65504_P_141_RESERVD_S_LEN)
                  ,beginIp65504P141ReservdS
                  ,IP_65504_P_141_RESERVD_S_LEN
                 );
            localIp65504P141ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P141ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P141ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P141ReservdS() {	 
			return (getShort(beginIp65504P141ReservdS));
   	}
         int localIp65504P141ReservdLCounter = -1;
         public boolean isIp65504P141ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P141ReservdLCounter != sharedCounter;
            localIp65504P141ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_141_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P141ReservdL
	 */
	protected void serializeIp65504P141ReservdL(short ip65504P141ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P141ReservdL,IP_65504_P_141_RESERVD_L_LEN)
                  ,beginIp65504P141ReservdL
                  ,IP_65504_P_141_RESERVD_L_LEN
                 );
            localIp65504P141ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P141ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P141ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P141ReservdL() {	 
			return (getShort(beginIp65504P141ReservdL));
   	}
         int localIp65504P142ReservdSCounter = -1;
         public boolean isIp65504P142ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P142ReservdSCounter != sharedCounter;
            localIp65504P142ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_142_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P142ReservdS
	 */
	protected void serializeIp65504P142ReservdS(short ip65504P142ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P142ReservdS,IP_65504_P_142_RESERVD_S_LEN)
                  ,beginIp65504P142ReservdS
                  ,IP_65504_P_142_RESERVD_S_LEN
                 );
            localIp65504P142ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P142ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P142ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P142ReservdS() {	 
			return (getShort(beginIp65504P142ReservdS));
   	}
         int localIp65504P142ReservdLCounter = -1;
         public boolean isIp65504P142ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P142ReservdLCounter != sharedCounter;
            localIp65504P142ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_142_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P142ReservdL
	 */
	protected void serializeIp65504P142ReservdL(short ip65504P142ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P142ReservdL,IP_65504_P_142_RESERVD_L_LEN)
                  ,beginIp65504P142ReservdL
                  ,IP_65504_P_142_RESERVD_L_LEN
                 );
            localIp65504P142ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P142ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P142ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P142ReservdL() {	 
			return (getShort(beginIp65504P142ReservdL));
   	}
         int localIp65504P143ReservdSCounter = -1;
         public boolean isIp65504P143ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P143ReservdSCounter != sharedCounter;
            localIp65504P143ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_143_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P143ReservdS
	 */
	protected void serializeIp65504P143ReservdS(short ip65504P143ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P143ReservdS,IP_65504_P_143_RESERVD_S_LEN)
                  ,beginIp65504P143ReservdS
                  ,IP_65504_P_143_RESERVD_S_LEN
                 );
            localIp65504P143ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P143ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P143ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P143ReservdS() {	 
			return (getShort(beginIp65504P143ReservdS));
   	}
         int localIp65504P143ReservdLCounter = -1;
         public boolean isIp65504P143ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P143ReservdLCounter != sharedCounter;
            localIp65504P143ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_143_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P143ReservdL
	 */
	protected void serializeIp65504P143ReservdL(short ip65504P143ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P143ReservdL,IP_65504_P_143_RESERVD_L_LEN)
                  ,beginIp65504P143ReservdL
                  ,IP_65504_P_143_RESERVD_L_LEN
                 );
            localIp65504P143ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P143ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P143ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P143ReservdL() {	 
			return (getShort(beginIp65504P143ReservdL));
   	}
         int localIp65504P144ReservdSCounter = -1;
         public boolean isIp65504P144ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P144ReservdSCounter != sharedCounter;
            localIp65504P144ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_144_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P144ReservdS
	 */
	protected void serializeIp65504P144ReservdS(short ip65504P144ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P144ReservdS,IP_65504_P_144_RESERVD_S_LEN)
                  ,beginIp65504P144ReservdS
                  ,IP_65504_P_144_RESERVD_S_LEN
                 );
            localIp65504P144ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P144ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P144ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P144ReservdS() {	 
			return (getShort(beginIp65504P144ReservdS));
   	}
         int localIp65504P144ReservdLCounter = -1;
         public boolean isIp65504P144ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P144ReservdLCounter != sharedCounter;
            localIp65504P144ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_144_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P144ReservdL
	 */
	protected void serializeIp65504P144ReservdL(short ip65504P144ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P144ReservdL,IP_65504_P_144_RESERVD_L_LEN)
                  ,beginIp65504P144ReservdL
                  ,IP_65504_P_144_RESERVD_L_LEN
                 );
            localIp65504P144ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P144ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P144ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P144ReservdL() {	 
			return (getShort(beginIp65504P144ReservdL));
   	}
         int localIp65504P145ReservdSCounter = -1;
         public boolean isIp65504P145ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P145ReservdSCounter != sharedCounter;
            localIp65504P145ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_145_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P145ReservdS
	 */
	protected void serializeIp65504P145ReservdS(short ip65504P145ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P145ReservdS,IP_65504_P_145_RESERVD_S_LEN)
                  ,beginIp65504P145ReservdS
                  ,IP_65504_P_145_RESERVD_S_LEN
                 );
            localIp65504P145ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P145ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P145ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P145ReservdS() {	 
			return (getShort(beginIp65504P145ReservdS));
   	}
         int localIp65504P145ReservdLCounter = -1;
         public boolean isIp65504P145ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P145ReservdLCounter != sharedCounter;
            localIp65504P145ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_145_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P145ReservdL
	 */
	protected void serializeIp65504P145ReservdL(short ip65504P145ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P145ReservdL,IP_65504_P_145_RESERVD_L_LEN)
                  ,beginIp65504P145ReservdL
                  ,IP_65504_P_145_RESERVD_L_LEN
                 );
            localIp65504P145ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P145ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P145ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P145ReservdL() {	 
			return (getShort(beginIp65504P145ReservdL));
   	}
         int localIp65504P146TrxAmtSCounter = -1;
         public boolean isIp65504P146TrxAmtSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P146TrxAmtSCounter != sharedCounter;
            localIp65504P146TrxAmtSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_146_TRX_AMT_S_LEN = 2;
  	/**
	 * serializeIp65504P146TrxAmtS
	 */
	protected void serializeIp65504P146TrxAmtS(short ip65504P146TrxAmtS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P146TrxAmtS,IP_65504_P_146_TRX_AMT_S_LEN)
                  ,beginIp65504P146TrxAmtS
                  ,IP_65504_P_146_TRX_AMT_S_LEN
                 );
            localIp65504P146TrxAmtSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P146TrxAmtSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P146TrxAmtS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P146TrxAmtS() {	 
			return (getShort(beginIp65504P146TrxAmtS));
   	}
         int localIp65504P146TrxAmtLCounter = -1;
         public boolean isIp65504P146TrxAmtLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P146TrxAmtLCounter != sharedCounter;
            localIp65504P146TrxAmtLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_146_TRX_AMT_L_LEN = 2;
  	/**
	 * serializeIp65504P146TrxAmtL
	 */
	protected void serializeIp65504P146TrxAmtL(short ip65504P146TrxAmtL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P146TrxAmtL,IP_65504_P_146_TRX_AMT_L_LEN)
                  ,beginIp65504P146TrxAmtL
                  ,IP_65504_P_146_TRX_AMT_L_LEN
                 );
            localIp65504P146TrxAmtLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P146TrxAmtLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P146TrxAmtL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P146TrxAmtL() {	 
			return (getShort(beginIp65504P146TrxAmtL));
   	}
         int localIp65504P147OrgAmtSCounter = -1;
         public boolean isIp65504P147OrgAmtSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P147OrgAmtSCounter != sharedCounter;
            localIp65504P147OrgAmtSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_147_ORG_AMT_S_LEN = 2;
  	/**
	 * serializeIp65504P147OrgAmtS
	 */
	protected void serializeIp65504P147OrgAmtS(short ip65504P147OrgAmtS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P147OrgAmtS,IP_65504_P_147_ORG_AMT_S_LEN)
                  ,beginIp65504P147OrgAmtS
                  ,IP_65504_P_147_ORG_AMT_S_LEN
                 );
            localIp65504P147OrgAmtSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P147OrgAmtSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P147OrgAmtS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P147OrgAmtS() {	 
			return (getShort(beginIp65504P147OrgAmtS));
   	}
         int localIp65504P147OrgAmtLCounter = -1;
         public boolean isIp65504P147OrgAmtLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P147OrgAmtLCounter != sharedCounter;
            localIp65504P147OrgAmtLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_147_ORG_AMT_L_LEN = 2;
  	/**
	 * serializeIp65504P147OrgAmtL
	 */
	protected void serializeIp65504P147OrgAmtL(short ip65504P147OrgAmtL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P147OrgAmtL,IP_65504_P_147_ORG_AMT_L_LEN)
                  ,beginIp65504P147OrgAmtL
                  ,IP_65504_P_147_ORG_AMT_L_LEN
                 );
            localIp65504P147OrgAmtLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P147OrgAmtLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P147OrgAmtL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P147OrgAmtL() {	 
			return (getShort(beginIp65504P147OrgAmtL));
   	}
         int localIp65504P148CurExpSCounter = -1;
         public boolean isIp65504P148CurExpSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P148CurExpSCounter != sharedCounter;
            localIp65504P148CurExpSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_148_CUR_EXP_S_LEN = 2;
  	/**
	 * serializeIp65504P148CurExpS
	 */
	protected void serializeIp65504P148CurExpS(short ip65504P148CurExpS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P148CurExpS,IP_65504_P_148_CUR_EXP_S_LEN)
                  ,beginIp65504P148CurExpS
                  ,IP_65504_P_148_CUR_EXP_S_LEN
                 );
            localIp65504P148CurExpSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P148CurExpSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P148CurExpS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P148CurExpS() {	 
			return (getShort(beginIp65504P148CurExpS));
   	}
         int localIp65504P148CurExpLCounter = -1;
         public boolean isIp65504P148CurExpLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P148CurExpLCounter != sharedCounter;
            localIp65504P148CurExpLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_148_CUR_EXP_L_LEN = 2;
  	/**
	 * serializeIp65504P148CurExpL
	 */
	protected void serializeIp65504P148CurExpL(short ip65504P148CurExpL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P148CurExpL,IP_65504_P_148_CUR_EXP_L_LEN)
                  ,beginIp65504P148CurExpL
                  ,IP_65504_P_148_CUR_EXP_L_LEN
                 );
            localIp65504P148CurExpLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P148CurExpLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P148CurExpL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P148CurExpL() {	 
			return (getShort(beginIp65504P148CurExpL));
   	}
         int localIp65504P149CurCdsSCounter = -1;
         public boolean isIp65504P149CurCdsSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P149CurCdsSCounter != sharedCounter;
            localIp65504P149CurCdsSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_149_CUR_CDS_S_LEN = 2;
  	/**
	 * serializeIp65504P149CurCdsS
	 */
	protected void serializeIp65504P149CurCdsS(short ip65504P149CurCdsS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P149CurCdsS,IP_65504_P_149_CUR_CDS_S_LEN)
                  ,beginIp65504P149CurCdsS
                  ,IP_65504_P_149_CUR_CDS_S_LEN
                 );
            localIp65504P149CurCdsSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P149CurCdsSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P149CurCdsS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P149CurCdsS() {	 
			return (getShort(beginIp65504P149CurCdsS));
   	}
         int localIp65504P149CurCdsLCounter = -1;
         public boolean isIp65504P149CurCdsLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P149CurCdsLCounter != sharedCounter;
            localIp65504P149CurCdsLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_149_CUR_CDS_L_LEN = 2;
  	/**
	 * serializeIp65504P149CurCdsL
	 */
	protected void serializeIp65504P149CurCdsL(short ip65504P149CurCdsL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P149CurCdsL,IP_65504_P_149_CUR_CDS_L_LEN)
                  ,beginIp65504P149CurCdsL
                  ,IP_65504_P_149_CUR_CDS_L_LEN
                 );
            localIp65504P149CurCdsLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P149CurCdsLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P149CurCdsL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P149CurCdsL() {	 
			return (getShort(beginIp65504P149CurCdsL));
   	}
         int localIp65504P150ReservdSCounter = -1;
         public boolean isIp65504P150ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P150ReservdSCounter != sharedCounter;
            localIp65504P150ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_150_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P150ReservdS
	 */
	protected void serializeIp65504P150ReservdS(short ip65504P150ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P150ReservdS,IP_65504_P_150_RESERVD_S_LEN)
                  ,beginIp65504P150ReservdS
                  ,IP_65504_P_150_RESERVD_S_LEN
                 );
            localIp65504P150ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P150ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P150ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P150ReservdS() {	 
			return (getShort(beginIp65504P150ReservdS));
   	}
         int localIp65504P150ReservdLCounter = -1;
         public boolean isIp65504P150ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P150ReservdLCounter != sharedCounter;
            localIp65504P150ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_150_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P150ReservdL
	 */
	protected void serializeIp65504P150ReservdL(short ip65504P150ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P150ReservdL,IP_65504_P_150_RESERVD_L_LEN)
                  ,beginIp65504P150ReservdL
                  ,IP_65504_P_150_RESERVD_L_LEN
                 );
            localIp65504P150ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P150ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P150ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P150ReservdL() {	 
			return (getShort(beginIp65504P150ReservdL));
   	}
         int localIp65504P151ReservdSCounter = -1;
         public boolean isIp65504P151ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P151ReservdSCounter != sharedCounter;
            localIp65504P151ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_151_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P151ReservdS
	 */
	protected void serializeIp65504P151ReservdS(short ip65504P151ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P151ReservdS,IP_65504_P_151_RESERVD_S_LEN)
                  ,beginIp65504P151ReservdS
                  ,IP_65504_P_151_RESERVD_S_LEN
                 );
            localIp65504P151ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P151ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P151ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P151ReservdS() {	 
			return (getShort(beginIp65504P151ReservdS));
   	}
         int localIp65504P151ReservdLCounter = -1;
         public boolean isIp65504P151ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P151ReservdLCounter != sharedCounter;
            localIp65504P151ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_151_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P151ReservdL
	 */
	protected void serializeIp65504P151ReservdL(short ip65504P151ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P151ReservdL,IP_65504_P_151_RESERVD_L_LEN)
                  ,beginIp65504P151ReservdL
                  ,IP_65504_P_151_RESERVD_L_LEN
                 );
            localIp65504P151ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P151ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P151ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P151ReservdL() {	 
			return (getShort(beginIp65504P151ReservdL));
   	}
         int localIp65504P152ReservdSCounter = -1;
         public boolean isIp65504P152ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P152ReservdSCounter != sharedCounter;
            localIp65504P152ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_152_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P152ReservdS
	 */
	protected void serializeIp65504P152ReservdS(short ip65504P152ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P152ReservdS,IP_65504_P_152_RESERVD_S_LEN)
                  ,beginIp65504P152ReservdS
                  ,IP_65504_P_152_RESERVD_S_LEN
                 );
            localIp65504P152ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P152ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P152ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P152ReservdS() {	 
			return (getShort(beginIp65504P152ReservdS));
   	}
         int localIp65504P152ReservdLCounter = -1;
         public boolean isIp65504P152ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P152ReservdLCounter != sharedCounter;
            localIp65504P152ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_152_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P152ReservdL
	 */
	protected void serializeIp65504P152ReservdL(short ip65504P152ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P152ReservdL,IP_65504_P_152_RESERVD_L_LEN)
                  ,beginIp65504P152ReservdL
                  ,IP_65504_P_152_RESERVD_L_LEN
                 );
            localIp65504P152ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P152ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P152ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P152ReservdL() {	 
			return (getShort(beginIp65504P152ReservdL));
   	}
         int localIp65504P153ReservdSCounter = -1;
         public boolean isIp65504P153ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P153ReservdSCounter != sharedCounter;
            localIp65504P153ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_153_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P153ReservdS
	 */
	protected void serializeIp65504P153ReservdS(short ip65504P153ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P153ReservdS,IP_65504_P_153_RESERVD_S_LEN)
                  ,beginIp65504P153ReservdS
                  ,IP_65504_P_153_RESERVD_S_LEN
                 );
            localIp65504P153ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P153ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P153ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P153ReservdS() {	 
			return (getShort(beginIp65504P153ReservdS));
   	}
         int localIp65504P153ReservdLCounter = -1;
         public boolean isIp65504P153ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P153ReservdLCounter != sharedCounter;
            localIp65504P153ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_153_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P153ReservdL
	 */
	protected void serializeIp65504P153ReservdL(short ip65504P153ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P153ReservdL,IP_65504_P_153_RESERVD_L_LEN)
                  ,beginIp65504P153ReservdL
                  ,IP_65504_P_153_RESERVD_L_LEN
                 );
            localIp65504P153ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P153ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P153ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P153ReservdL() {	 
			return (getShort(beginIp65504P153ReservdL));
   	}
         int localIp65504P154ReservdSCounter = -1;
         public boolean isIp65504P154ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P154ReservdSCounter != sharedCounter;
            localIp65504P154ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_154_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P154ReservdS
	 */
	protected void serializeIp65504P154ReservdS(short ip65504P154ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P154ReservdS,IP_65504_P_154_RESERVD_S_LEN)
                  ,beginIp65504P154ReservdS
                  ,IP_65504_P_154_RESERVD_S_LEN
                 );
            localIp65504P154ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P154ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P154ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P154ReservdS() {	 
			return (getShort(beginIp65504P154ReservdS));
   	}
         int localIp65504P154ReservdLCounter = -1;
         public boolean isIp65504P154ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P154ReservdLCounter != sharedCounter;
            localIp65504P154ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_154_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P154ReservdL
	 */
	protected void serializeIp65504P154ReservdL(short ip65504P154ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P154ReservdL,IP_65504_P_154_RESERVD_L_LEN)
                  ,beginIp65504P154ReservdL
                  ,IP_65504_P_154_RESERVD_L_LEN
                 );
            localIp65504P154ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P154ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P154ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P154ReservdL() {	 
			return (getShort(beginIp65504P154ReservdL));
   	}
         int localIp65504P155ReservdSCounter = -1;
         public boolean isIp65504P155ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P155ReservdSCounter != sharedCounter;
            localIp65504P155ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_155_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P155ReservdS
	 */
	protected void serializeIp65504P155ReservdS(short ip65504P155ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P155ReservdS,IP_65504_P_155_RESERVD_S_LEN)
                  ,beginIp65504P155ReservdS
                  ,IP_65504_P_155_RESERVD_S_LEN
                 );
            localIp65504P155ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P155ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P155ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P155ReservdS() {	 
			return (getShort(beginIp65504P155ReservdS));
   	}
         int localIp65504P155ReservdLCounter = -1;
         public boolean isIp65504P155ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P155ReservdLCounter != sharedCounter;
            localIp65504P155ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_155_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P155ReservdL
	 */
	protected void serializeIp65504P155ReservdL(short ip65504P155ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P155ReservdL,IP_65504_P_155_RESERVD_L_LEN)
                  ,beginIp65504P155ReservdL
                  ,IP_65504_P_155_RESERVD_L_LEN
                 );
            localIp65504P155ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P155ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P155ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P155ReservdL() {	 
			return (getShort(beginIp65504P155ReservdL));
   	}




}
  
