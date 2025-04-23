package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup30Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:07. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup30Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup30Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_30_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P900ReservdS;
            protected  int beginIp65504P900ReservdL;
            protected  int beginIp65504P901ReservdS;
            protected  int beginIp65504P901ReservdL;
            protected  int beginIp65504P902ReservdS;
            protected  int beginIp65504P902ReservdL;
            protected  int beginIp65504P903ReservdS;
            protected  int beginIp65504P903ReservdL;
            protected  int beginIp65504P904ReservdS;
            protected  int beginIp65504P904ReservdL;
            protected  int beginIp65504P905ReservdS;
            protected  int beginIp65504P905ReservdL;
            protected  int beginIp65504P906ReservdS;
            protected  int beginIp65504P906ReservdL;
            protected  int beginIp65504P907ReservdS;
            protected  int beginIp65504P907ReservdL;
            protected  int beginIp65504P908ReservdS;
            protected  int beginIp65504P908ReservdL;
            protected  int beginIp65504P909ReservdS;
            protected  int beginIp65504P909ReservdL;
            protected  int beginIp65504P910ReservdS;
            protected  int beginIp65504P910ReservdL;
            protected  int beginIp65504P911ReservdS;
            protected  int beginIp65504P911ReservdL;
            protected  int beginIp65504P912ReservdS;
            protected  int beginIp65504P912ReservdL;
            protected  int beginIp65504P913ReservdS;
            protected  int beginIp65504P913ReservdL;
            protected  int beginIp65504P914ReservdS;
            protected  int beginIp65504P914ReservdL;
            protected  int beginIp65504P915ReservdS;
            protected  int beginIp65504P915ReservdL;
            protected  int beginIp65504P916ReservdS;
            protected  int beginIp65504P916ReservdL;
            protected  int beginIp65504P917ReservdS;
            protected  int beginIp65504P917ReservdL;
            protected  int beginIp65504P918ReservdS;
            protected  int beginIp65504P918ReservdL;
            protected  int beginIp65504P919ReservdS;
            protected  int beginIp65504P919ReservdL;
            protected  int beginIp65504P920ReservdS;
            protected  int beginIp65504P920ReservdL;
            protected  int beginIp65504P921ReservdS;
            protected  int beginIp65504P921ReservdL;
            protected  int beginIp65504P922ReservdS;
            protected  int beginIp65504P922ReservdL;
            protected  int beginIp65504P923ReservdS;
            protected  int beginIp65504P923ReservdL;
            protected  int beginIp65504P924ReservdS;
            protected  int beginIp65504P924ReservdL;
            protected  int beginIp65504P925ReservdS;
            protected  int beginIp65504P925ReservdL;
            protected  int beginIp65504P926ReservdS;
            protected  int beginIp65504P926ReservdL;
            protected  int beginIp65504P927ReservdS;
            protected  int beginIp65504P927ReservdL;
            protected  int beginIp65504P928ReservdS;
            protected  int beginIp65504P928ReservdL;
            protected  int beginIp65504P929ReservdS;
            protected  int beginIp65504P929ReservdL;
            protected  int beginIp65504P930ReservdS;
            protected  int beginIp65504P930ReservdL;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup30Serialized
	**/
    public Ip65504PdsNamesLargeGroup30Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup30Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup30Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup30Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,7188); // serialize this field at offset 7188 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup30Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 7188 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup30Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_30_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P900ReservdS = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P900ReservdL = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P901ReservdS = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P901ReservdL = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P902ReservdS = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P902ReservdL = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P903ReservdS = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P903ReservdL = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P904ReservdS = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P904ReservdL = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P905ReservdS = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P905ReservdL = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P906ReservdS = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P906ReservdL = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P907ReservdS = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P907ReservdL = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P908ReservdS = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P908ReservdL = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P909ReservdS = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P909ReservdL = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P910ReservdS = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P910ReservdL = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P911ReservdS = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P911ReservdL = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P912ReservdS = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P912ReservdL = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P913ReservdS = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P913ReservdL = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P914ReservdS = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P914ReservdL = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P915ReservdS = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P915ReservdL = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P916ReservdS = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P916ReservdL = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P917ReservdS = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P917ReservdL = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P918ReservdS = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P918ReservdL = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P919ReservdS = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P919ReservdL = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P920ReservdS = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P920ReservdL = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P921ReservdS = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P921ReservdL = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P922ReservdS = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P922ReservdL = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P923ReservdS = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P923ReservdL = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P924ReservdS = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P924ReservdL = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P925ReservdS = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P925ReservdL = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P926ReservdS = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P926ReservdL = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P927ReservdS = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P927ReservdL = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P928ReservdS = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P928ReservdL = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P929ReservdS = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P929ReservdL = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P930ReservdS = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P930ReservdL = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P900ReservdSCounter = -1;
         public boolean isIp65504P900ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P900ReservdSCounter != sharedCounter;
            localIp65504P900ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_900_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P900ReservdS
	 */
	protected void serializeIp65504P900ReservdS(short ip65504P900ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P900ReservdS,IP_65504_P_900_RESERVD_S_LEN)
                  ,beginIp65504P900ReservdS
                  ,IP_65504_P_900_RESERVD_S_LEN
                 );
            localIp65504P900ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P900ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P900ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P900ReservdS() {	 
			return (getShort(beginIp65504P900ReservdS));
   	}
         int localIp65504P900ReservdLCounter = -1;
         public boolean isIp65504P900ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P900ReservdLCounter != sharedCounter;
            localIp65504P900ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_900_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P900ReservdL
	 */
	protected void serializeIp65504P900ReservdL(short ip65504P900ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P900ReservdL,IP_65504_P_900_RESERVD_L_LEN)
                  ,beginIp65504P900ReservdL
                  ,IP_65504_P_900_RESERVD_L_LEN
                 );
            localIp65504P900ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P900ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P900ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P900ReservdL() {	 
			return (getShort(beginIp65504P900ReservdL));
   	}
         int localIp65504P901ReservdSCounter = -1;
         public boolean isIp65504P901ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P901ReservdSCounter != sharedCounter;
            localIp65504P901ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_901_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P901ReservdS
	 */
	protected void serializeIp65504P901ReservdS(short ip65504P901ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P901ReservdS,IP_65504_P_901_RESERVD_S_LEN)
                  ,beginIp65504P901ReservdS
                  ,IP_65504_P_901_RESERVD_S_LEN
                 );
            localIp65504P901ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P901ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P901ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P901ReservdS() {	 
			return (getShort(beginIp65504P901ReservdS));
   	}
         int localIp65504P901ReservdLCounter = -1;
         public boolean isIp65504P901ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P901ReservdLCounter != sharedCounter;
            localIp65504P901ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_901_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P901ReservdL
	 */
	protected void serializeIp65504P901ReservdL(short ip65504P901ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P901ReservdL,IP_65504_P_901_RESERVD_L_LEN)
                  ,beginIp65504P901ReservdL
                  ,IP_65504_P_901_RESERVD_L_LEN
                 );
            localIp65504P901ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P901ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P901ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P901ReservdL() {	 
			return (getShort(beginIp65504P901ReservdL));
   	}
         int localIp65504P902ReservdSCounter = -1;
         public boolean isIp65504P902ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P902ReservdSCounter != sharedCounter;
            localIp65504P902ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_902_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P902ReservdS
	 */
	protected void serializeIp65504P902ReservdS(short ip65504P902ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P902ReservdS,IP_65504_P_902_RESERVD_S_LEN)
                  ,beginIp65504P902ReservdS
                  ,IP_65504_P_902_RESERVD_S_LEN
                 );
            localIp65504P902ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P902ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P902ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P902ReservdS() {	 
			return (getShort(beginIp65504P902ReservdS));
   	}
         int localIp65504P902ReservdLCounter = -1;
         public boolean isIp65504P902ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P902ReservdLCounter != sharedCounter;
            localIp65504P902ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_902_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P902ReservdL
	 */
	protected void serializeIp65504P902ReservdL(short ip65504P902ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P902ReservdL,IP_65504_P_902_RESERVD_L_LEN)
                  ,beginIp65504P902ReservdL
                  ,IP_65504_P_902_RESERVD_L_LEN
                 );
            localIp65504P902ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P902ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P902ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P902ReservdL() {	 
			return (getShort(beginIp65504P902ReservdL));
   	}
         int localIp65504P903ReservdSCounter = -1;
         public boolean isIp65504P903ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P903ReservdSCounter != sharedCounter;
            localIp65504P903ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_903_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P903ReservdS
	 */
	protected void serializeIp65504P903ReservdS(short ip65504P903ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P903ReservdS,IP_65504_P_903_RESERVD_S_LEN)
                  ,beginIp65504P903ReservdS
                  ,IP_65504_P_903_RESERVD_S_LEN
                 );
            localIp65504P903ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P903ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P903ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P903ReservdS() {	 
			return (getShort(beginIp65504P903ReservdS));
   	}
         int localIp65504P903ReservdLCounter = -1;
         public boolean isIp65504P903ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P903ReservdLCounter != sharedCounter;
            localIp65504P903ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_903_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P903ReservdL
	 */
	protected void serializeIp65504P903ReservdL(short ip65504P903ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P903ReservdL,IP_65504_P_903_RESERVD_L_LEN)
                  ,beginIp65504P903ReservdL
                  ,IP_65504_P_903_RESERVD_L_LEN
                 );
            localIp65504P903ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P903ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P903ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P903ReservdL() {	 
			return (getShort(beginIp65504P903ReservdL));
   	}
         int localIp65504P904ReservdSCounter = -1;
         public boolean isIp65504P904ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P904ReservdSCounter != sharedCounter;
            localIp65504P904ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_904_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P904ReservdS
	 */
	protected void serializeIp65504P904ReservdS(short ip65504P904ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P904ReservdS,IP_65504_P_904_RESERVD_S_LEN)
                  ,beginIp65504P904ReservdS
                  ,IP_65504_P_904_RESERVD_S_LEN
                 );
            localIp65504P904ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P904ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P904ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P904ReservdS() {	 
			return (getShort(beginIp65504P904ReservdS));
   	}
         int localIp65504P904ReservdLCounter = -1;
         public boolean isIp65504P904ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P904ReservdLCounter != sharedCounter;
            localIp65504P904ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_904_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P904ReservdL
	 */
	protected void serializeIp65504P904ReservdL(short ip65504P904ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P904ReservdL,IP_65504_P_904_RESERVD_L_LEN)
                  ,beginIp65504P904ReservdL
                  ,IP_65504_P_904_RESERVD_L_LEN
                 );
            localIp65504P904ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P904ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P904ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P904ReservdL() {	 
			return (getShort(beginIp65504P904ReservdL));
   	}
         int localIp65504P905ReservdSCounter = -1;
         public boolean isIp65504P905ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P905ReservdSCounter != sharedCounter;
            localIp65504P905ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_905_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P905ReservdS
	 */
	protected void serializeIp65504P905ReservdS(short ip65504P905ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P905ReservdS,IP_65504_P_905_RESERVD_S_LEN)
                  ,beginIp65504P905ReservdS
                  ,IP_65504_P_905_RESERVD_S_LEN
                 );
            localIp65504P905ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P905ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P905ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P905ReservdS() {	 
			return (getShort(beginIp65504P905ReservdS));
   	}
         int localIp65504P905ReservdLCounter = -1;
         public boolean isIp65504P905ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P905ReservdLCounter != sharedCounter;
            localIp65504P905ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_905_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P905ReservdL
	 */
	protected void serializeIp65504P905ReservdL(short ip65504P905ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P905ReservdL,IP_65504_P_905_RESERVD_L_LEN)
                  ,beginIp65504P905ReservdL
                  ,IP_65504_P_905_RESERVD_L_LEN
                 );
            localIp65504P905ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P905ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P905ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P905ReservdL() {	 
			return (getShort(beginIp65504P905ReservdL));
   	}
         int localIp65504P906ReservdSCounter = -1;
         public boolean isIp65504P906ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P906ReservdSCounter != sharedCounter;
            localIp65504P906ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_906_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P906ReservdS
	 */
	protected void serializeIp65504P906ReservdS(short ip65504P906ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P906ReservdS,IP_65504_P_906_RESERVD_S_LEN)
                  ,beginIp65504P906ReservdS
                  ,IP_65504_P_906_RESERVD_S_LEN
                 );
            localIp65504P906ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P906ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P906ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P906ReservdS() {	 
			return (getShort(beginIp65504P906ReservdS));
   	}
         int localIp65504P906ReservdLCounter = -1;
         public boolean isIp65504P906ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P906ReservdLCounter != sharedCounter;
            localIp65504P906ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_906_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P906ReservdL
	 */
	protected void serializeIp65504P906ReservdL(short ip65504P906ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P906ReservdL,IP_65504_P_906_RESERVD_L_LEN)
                  ,beginIp65504P906ReservdL
                  ,IP_65504_P_906_RESERVD_L_LEN
                 );
            localIp65504P906ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P906ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P906ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P906ReservdL() {	 
			return (getShort(beginIp65504P906ReservdL));
   	}
         int localIp65504P907ReservdSCounter = -1;
         public boolean isIp65504P907ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P907ReservdSCounter != sharedCounter;
            localIp65504P907ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_907_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P907ReservdS
	 */
	protected void serializeIp65504P907ReservdS(short ip65504P907ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P907ReservdS,IP_65504_P_907_RESERVD_S_LEN)
                  ,beginIp65504P907ReservdS
                  ,IP_65504_P_907_RESERVD_S_LEN
                 );
            localIp65504P907ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P907ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P907ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P907ReservdS() {	 
			return (getShort(beginIp65504P907ReservdS));
   	}
         int localIp65504P907ReservdLCounter = -1;
         public boolean isIp65504P907ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P907ReservdLCounter != sharedCounter;
            localIp65504P907ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_907_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P907ReservdL
	 */
	protected void serializeIp65504P907ReservdL(short ip65504P907ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P907ReservdL,IP_65504_P_907_RESERVD_L_LEN)
                  ,beginIp65504P907ReservdL
                  ,IP_65504_P_907_RESERVD_L_LEN
                 );
            localIp65504P907ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P907ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P907ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P907ReservdL() {	 
			return (getShort(beginIp65504P907ReservdL));
   	}
         int localIp65504P908ReservdSCounter = -1;
         public boolean isIp65504P908ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P908ReservdSCounter != sharedCounter;
            localIp65504P908ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_908_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P908ReservdS
	 */
	protected void serializeIp65504P908ReservdS(short ip65504P908ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P908ReservdS,IP_65504_P_908_RESERVD_S_LEN)
                  ,beginIp65504P908ReservdS
                  ,IP_65504_P_908_RESERVD_S_LEN
                 );
            localIp65504P908ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P908ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P908ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P908ReservdS() {	 
			return (getShort(beginIp65504P908ReservdS));
   	}
         int localIp65504P908ReservdLCounter = -1;
         public boolean isIp65504P908ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P908ReservdLCounter != sharedCounter;
            localIp65504P908ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_908_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P908ReservdL
	 */
	protected void serializeIp65504P908ReservdL(short ip65504P908ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P908ReservdL,IP_65504_P_908_RESERVD_L_LEN)
                  ,beginIp65504P908ReservdL
                  ,IP_65504_P_908_RESERVD_L_LEN
                 );
            localIp65504P908ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P908ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P908ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P908ReservdL() {	 
			return (getShort(beginIp65504P908ReservdL));
   	}
         int localIp65504P909ReservdSCounter = -1;
         public boolean isIp65504P909ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P909ReservdSCounter != sharedCounter;
            localIp65504P909ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_909_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P909ReservdS
	 */
	protected void serializeIp65504P909ReservdS(short ip65504P909ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P909ReservdS,IP_65504_P_909_RESERVD_S_LEN)
                  ,beginIp65504P909ReservdS
                  ,IP_65504_P_909_RESERVD_S_LEN
                 );
            localIp65504P909ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P909ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P909ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P909ReservdS() {	 
			return (getShort(beginIp65504P909ReservdS));
   	}
         int localIp65504P909ReservdLCounter = -1;
         public boolean isIp65504P909ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P909ReservdLCounter != sharedCounter;
            localIp65504P909ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_909_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P909ReservdL
	 */
	protected void serializeIp65504P909ReservdL(short ip65504P909ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P909ReservdL,IP_65504_P_909_RESERVD_L_LEN)
                  ,beginIp65504P909ReservdL
                  ,IP_65504_P_909_RESERVD_L_LEN
                 );
            localIp65504P909ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P909ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P909ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P909ReservdL() {	 
			return (getShort(beginIp65504P909ReservdL));
   	}
         int localIp65504P910ReservdSCounter = -1;
         public boolean isIp65504P910ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P910ReservdSCounter != sharedCounter;
            localIp65504P910ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_910_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P910ReservdS
	 */
	protected void serializeIp65504P910ReservdS(short ip65504P910ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P910ReservdS,IP_65504_P_910_RESERVD_S_LEN)
                  ,beginIp65504P910ReservdS
                  ,IP_65504_P_910_RESERVD_S_LEN
                 );
            localIp65504P910ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P910ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P910ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P910ReservdS() {	 
			return (getShort(beginIp65504P910ReservdS));
   	}
         int localIp65504P910ReservdLCounter = -1;
         public boolean isIp65504P910ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P910ReservdLCounter != sharedCounter;
            localIp65504P910ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_910_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P910ReservdL
	 */
	protected void serializeIp65504P910ReservdL(short ip65504P910ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P910ReservdL,IP_65504_P_910_RESERVD_L_LEN)
                  ,beginIp65504P910ReservdL
                  ,IP_65504_P_910_RESERVD_L_LEN
                 );
            localIp65504P910ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P910ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P910ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P910ReservdL() {	 
			return (getShort(beginIp65504P910ReservdL));
   	}
         int localIp65504P911ReservdSCounter = -1;
         public boolean isIp65504P911ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P911ReservdSCounter != sharedCounter;
            localIp65504P911ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_911_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P911ReservdS
	 */
	protected void serializeIp65504P911ReservdS(short ip65504P911ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P911ReservdS,IP_65504_P_911_RESERVD_S_LEN)
                  ,beginIp65504P911ReservdS
                  ,IP_65504_P_911_RESERVD_S_LEN
                 );
            localIp65504P911ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P911ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P911ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P911ReservdS() {	 
			return (getShort(beginIp65504P911ReservdS));
   	}
         int localIp65504P911ReservdLCounter = -1;
         public boolean isIp65504P911ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P911ReservdLCounter != sharedCounter;
            localIp65504P911ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_911_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P911ReservdL
	 */
	protected void serializeIp65504P911ReservdL(short ip65504P911ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P911ReservdL,IP_65504_P_911_RESERVD_L_LEN)
                  ,beginIp65504P911ReservdL
                  ,IP_65504_P_911_RESERVD_L_LEN
                 );
            localIp65504P911ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P911ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P911ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P911ReservdL() {	 
			return (getShort(beginIp65504P911ReservdL));
   	}
         int localIp65504P912ReservdSCounter = -1;
         public boolean isIp65504P912ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P912ReservdSCounter != sharedCounter;
            localIp65504P912ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_912_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P912ReservdS
	 */
	protected void serializeIp65504P912ReservdS(short ip65504P912ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P912ReservdS,IP_65504_P_912_RESERVD_S_LEN)
                  ,beginIp65504P912ReservdS
                  ,IP_65504_P_912_RESERVD_S_LEN
                 );
            localIp65504P912ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P912ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P912ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P912ReservdS() {	 
			return (getShort(beginIp65504P912ReservdS));
   	}
         int localIp65504P912ReservdLCounter = -1;
         public boolean isIp65504P912ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P912ReservdLCounter != sharedCounter;
            localIp65504P912ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_912_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P912ReservdL
	 */
	protected void serializeIp65504P912ReservdL(short ip65504P912ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P912ReservdL,IP_65504_P_912_RESERVD_L_LEN)
                  ,beginIp65504P912ReservdL
                  ,IP_65504_P_912_RESERVD_L_LEN
                 );
            localIp65504P912ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P912ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P912ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P912ReservdL() {	 
			return (getShort(beginIp65504P912ReservdL));
   	}
         int localIp65504P913ReservdSCounter = -1;
         public boolean isIp65504P913ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P913ReservdSCounter != sharedCounter;
            localIp65504P913ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_913_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P913ReservdS
	 */
	protected void serializeIp65504P913ReservdS(short ip65504P913ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P913ReservdS,IP_65504_P_913_RESERVD_S_LEN)
                  ,beginIp65504P913ReservdS
                  ,IP_65504_P_913_RESERVD_S_LEN
                 );
            localIp65504P913ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P913ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P913ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P913ReservdS() {	 
			return (getShort(beginIp65504P913ReservdS));
   	}
         int localIp65504P913ReservdLCounter = -1;
         public boolean isIp65504P913ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P913ReservdLCounter != sharedCounter;
            localIp65504P913ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_913_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P913ReservdL
	 */
	protected void serializeIp65504P913ReservdL(short ip65504P913ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P913ReservdL,IP_65504_P_913_RESERVD_L_LEN)
                  ,beginIp65504P913ReservdL
                  ,IP_65504_P_913_RESERVD_L_LEN
                 );
            localIp65504P913ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P913ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P913ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P913ReservdL() {	 
			return (getShort(beginIp65504P913ReservdL));
   	}
         int localIp65504P914ReservdSCounter = -1;
         public boolean isIp65504P914ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P914ReservdSCounter != sharedCounter;
            localIp65504P914ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_914_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P914ReservdS
	 */
	protected void serializeIp65504P914ReservdS(short ip65504P914ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P914ReservdS,IP_65504_P_914_RESERVD_S_LEN)
                  ,beginIp65504P914ReservdS
                  ,IP_65504_P_914_RESERVD_S_LEN
                 );
            localIp65504P914ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P914ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P914ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P914ReservdS() {	 
			return (getShort(beginIp65504P914ReservdS));
   	}
         int localIp65504P914ReservdLCounter = -1;
         public boolean isIp65504P914ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P914ReservdLCounter != sharedCounter;
            localIp65504P914ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_914_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P914ReservdL
	 */
	protected void serializeIp65504P914ReservdL(short ip65504P914ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P914ReservdL,IP_65504_P_914_RESERVD_L_LEN)
                  ,beginIp65504P914ReservdL
                  ,IP_65504_P_914_RESERVD_L_LEN
                 );
            localIp65504P914ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P914ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P914ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P914ReservdL() {	 
			return (getShort(beginIp65504P914ReservdL));
   	}
         int localIp65504P915ReservdSCounter = -1;
         public boolean isIp65504P915ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P915ReservdSCounter != sharedCounter;
            localIp65504P915ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_915_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P915ReservdS
	 */
	protected void serializeIp65504P915ReservdS(short ip65504P915ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P915ReservdS,IP_65504_P_915_RESERVD_S_LEN)
                  ,beginIp65504P915ReservdS
                  ,IP_65504_P_915_RESERVD_S_LEN
                 );
            localIp65504P915ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P915ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P915ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P915ReservdS() {	 
			return (getShort(beginIp65504P915ReservdS));
   	}
         int localIp65504P915ReservdLCounter = -1;
         public boolean isIp65504P915ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P915ReservdLCounter != sharedCounter;
            localIp65504P915ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_915_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P915ReservdL
	 */
	protected void serializeIp65504P915ReservdL(short ip65504P915ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P915ReservdL,IP_65504_P_915_RESERVD_L_LEN)
                  ,beginIp65504P915ReservdL
                  ,IP_65504_P_915_RESERVD_L_LEN
                 );
            localIp65504P915ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P915ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P915ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P915ReservdL() {	 
			return (getShort(beginIp65504P915ReservdL));
   	}
         int localIp65504P916ReservdSCounter = -1;
         public boolean isIp65504P916ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P916ReservdSCounter != sharedCounter;
            localIp65504P916ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_916_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P916ReservdS
	 */
	protected void serializeIp65504P916ReservdS(short ip65504P916ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P916ReservdS,IP_65504_P_916_RESERVD_S_LEN)
                  ,beginIp65504P916ReservdS
                  ,IP_65504_P_916_RESERVD_S_LEN
                 );
            localIp65504P916ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P916ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P916ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P916ReservdS() {	 
			return (getShort(beginIp65504P916ReservdS));
   	}
         int localIp65504P916ReservdLCounter = -1;
         public boolean isIp65504P916ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P916ReservdLCounter != sharedCounter;
            localIp65504P916ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_916_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P916ReservdL
	 */
	protected void serializeIp65504P916ReservdL(short ip65504P916ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P916ReservdL,IP_65504_P_916_RESERVD_L_LEN)
                  ,beginIp65504P916ReservdL
                  ,IP_65504_P_916_RESERVD_L_LEN
                 );
            localIp65504P916ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P916ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P916ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P916ReservdL() {	 
			return (getShort(beginIp65504P916ReservdL));
   	}
         int localIp65504P917ReservdSCounter = -1;
         public boolean isIp65504P917ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P917ReservdSCounter != sharedCounter;
            localIp65504P917ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_917_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P917ReservdS
	 */
	protected void serializeIp65504P917ReservdS(short ip65504P917ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P917ReservdS,IP_65504_P_917_RESERVD_S_LEN)
                  ,beginIp65504P917ReservdS
                  ,IP_65504_P_917_RESERVD_S_LEN
                 );
            localIp65504P917ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P917ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P917ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P917ReservdS() {	 
			return (getShort(beginIp65504P917ReservdS));
   	}
         int localIp65504P917ReservdLCounter = -1;
         public boolean isIp65504P917ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P917ReservdLCounter != sharedCounter;
            localIp65504P917ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_917_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P917ReservdL
	 */
	protected void serializeIp65504P917ReservdL(short ip65504P917ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P917ReservdL,IP_65504_P_917_RESERVD_L_LEN)
                  ,beginIp65504P917ReservdL
                  ,IP_65504_P_917_RESERVD_L_LEN
                 );
            localIp65504P917ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P917ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P917ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P917ReservdL() {	 
			return (getShort(beginIp65504P917ReservdL));
   	}
         int localIp65504P918ReservdSCounter = -1;
         public boolean isIp65504P918ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P918ReservdSCounter != sharedCounter;
            localIp65504P918ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_918_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P918ReservdS
	 */
	protected void serializeIp65504P918ReservdS(short ip65504P918ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P918ReservdS,IP_65504_P_918_RESERVD_S_LEN)
                  ,beginIp65504P918ReservdS
                  ,IP_65504_P_918_RESERVD_S_LEN
                 );
            localIp65504P918ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P918ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P918ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P918ReservdS() {	 
			return (getShort(beginIp65504P918ReservdS));
   	}
         int localIp65504P918ReservdLCounter = -1;
         public boolean isIp65504P918ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P918ReservdLCounter != sharedCounter;
            localIp65504P918ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_918_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P918ReservdL
	 */
	protected void serializeIp65504P918ReservdL(short ip65504P918ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P918ReservdL,IP_65504_P_918_RESERVD_L_LEN)
                  ,beginIp65504P918ReservdL
                  ,IP_65504_P_918_RESERVD_L_LEN
                 );
            localIp65504P918ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P918ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P918ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P918ReservdL() {	 
			return (getShort(beginIp65504P918ReservdL));
   	}
         int localIp65504P919ReservdSCounter = -1;
         public boolean isIp65504P919ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P919ReservdSCounter != sharedCounter;
            localIp65504P919ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_919_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P919ReservdS
	 */
	protected void serializeIp65504P919ReservdS(short ip65504P919ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P919ReservdS,IP_65504_P_919_RESERVD_S_LEN)
                  ,beginIp65504P919ReservdS
                  ,IP_65504_P_919_RESERVD_S_LEN
                 );
            localIp65504P919ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P919ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P919ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P919ReservdS() {	 
			return (getShort(beginIp65504P919ReservdS));
   	}
         int localIp65504P919ReservdLCounter = -1;
         public boolean isIp65504P919ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P919ReservdLCounter != sharedCounter;
            localIp65504P919ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_919_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P919ReservdL
	 */
	protected void serializeIp65504P919ReservdL(short ip65504P919ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P919ReservdL,IP_65504_P_919_RESERVD_L_LEN)
                  ,beginIp65504P919ReservdL
                  ,IP_65504_P_919_RESERVD_L_LEN
                 );
            localIp65504P919ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P919ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P919ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P919ReservdL() {	 
			return (getShort(beginIp65504P919ReservdL));
   	}
         int localIp65504P920ReservdSCounter = -1;
         public boolean isIp65504P920ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P920ReservdSCounter != sharedCounter;
            localIp65504P920ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_920_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P920ReservdS
	 */
	protected void serializeIp65504P920ReservdS(short ip65504P920ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P920ReservdS,IP_65504_P_920_RESERVD_S_LEN)
                  ,beginIp65504P920ReservdS
                  ,IP_65504_P_920_RESERVD_S_LEN
                 );
            localIp65504P920ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P920ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P920ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P920ReservdS() {	 
			return (getShort(beginIp65504P920ReservdS));
   	}
         int localIp65504P920ReservdLCounter = -1;
         public boolean isIp65504P920ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P920ReservdLCounter != sharedCounter;
            localIp65504P920ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_920_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P920ReservdL
	 */
	protected void serializeIp65504P920ReservdL(short ip65504P920ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P920ReservdL,IP_65504_P_920_RESERVD_L_LEN)
                  ,beginIp65504P920ReservdL
                  ,IP_65504_P_920_RESERVD_L_LEN
                 );
            localIp65504P920ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P920ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P920ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P920ReservdL() {	 
			return (getShort(beginIp65504P920ReservdL));
   	}
         int localIp65504P921ReservdSCounter = -1;
         public boolean isIp65504P921ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P921ReservdSCounter != sharedCounter;
            localIp65504P921ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_921_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P921ReservdS
	 */
	protected void serializeIp65504P921ReservdS(short ip65504P921ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P921ReservdS,IP_65504_P_921_RESERVD_S_LEN)
                  ,beginIp65504P921ReservdS
                  ,IP_65504_P_921_RESERVD_S_LEN
                 );
            localIp65504P921ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P921ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P921ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P921ReservdS() {	 
			return (getShort(beginIp65504P921ReservdS));
   	}
         int localIp65504P921ReservdLCounter = -1;
         public boolean isIp65504P921ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P921ReservdLCounter != sharedCounter;
            localIp65504P921ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_921_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P921ReservdL
	 */
	protected void serializeIp65504P921ReservdL(short ip65504P921ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P921ReservdL,IP_65504_P_921_RESERVD_L_LEN)
                  ,beginIp65504P921ReservdL
                  ,IP_65504_P_921_RESERVD_L_LEN
                 );
            localIp65504P921ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P921ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P921ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P921ReservdL() {	 
			return (getShort(beginIp65504P921ReservdL));
   	}
         int localIp65504P922ReservdSCounter = -1;
         public boolean isIp65504P922ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P922ReservdSCounter != sharedCounter;
            localIp65504P922ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_922_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P922ReservdS
	 */
	protected void serializeIp65504P922ReservdS(short ip65504P922ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P922ReservdS,IP_65504_P_922_RESERVD_S_LEN)
                  ,beginIp65504P922ReservdS
                  ,IP_65504_P_922_RESERVD_S_LEN
                 );
            localIp65504P922ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P922ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P922ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P922ReservdS() {	 
			return (getShort(beginIp65504P922ReservdS));
   	}
         int localIp65504P922ReservdLCounter = -1;
         public boolean isIp65504P922ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P922ReservdLCounter != sharedCounter;
            localIp65504P922ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_922_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P922ReservdL
	 */
	protected void serializeIp65504P922ReservdL(short ip65504P922ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P922ReservdL,IP_65504_P_922_RESERVD_L_LEN)
                  ,beginIp65504P922ReservdL
                  ,IP_65504_P_922_RESERVD_L_LEN
                 );
            localIp65504P922ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P922ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P922ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P922ReservdL() {	 
			return (getShort(beginIp65504P922ReservdL));
   	}
         int localIp65504P923ReservdSCounter = -1;
         public boolean isIp65504P923ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P923ReservdSCounter != sharedCounter;
            localIp65504P923ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_923_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P923ReservdS
	 */
	protected void serializeIp65504P923ReservdS(short ip65504P923ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P923ReservdS,IP_65504_P_923_RESERVD_S_LEN)
                  ,beginIp65504P923ReservdS
                  ,IP_65504_P_923_RESERVD_S_LEN
                 );
            localIp65504P923ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P923ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P923ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P923ReservdS() {	 
			return (getShort(beginIp65504P923ReservdS));
   	}
         int localIp65504P923ReservdLCounter = -1;
         public boolean isIp65504P923ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P923ReservdLCounter != sharedCounter;
            localIp65504P923ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_923_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P923ReservdL
	 */
	protected void serializeIp65504P923ReservdL(short ip65504P923ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P923ReservdL,IP_65504_P_923_RESERVD_L_LEN)
                  ,beginIp65504P923ReservdL
                  ,IP_65504_P_923_RESERVD_L_LEN
                 );
            localIp65504P923ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P923ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P923ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P923ReservdL() {	 
			return (getShort(beginIp65504P923ReservdL));
   	}
         int localIp65504P924ReservdSCounter = -1;
         public boolean isIp65504P924ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P924ReservdSCounter != sharedCounter;
            localIp65504P924ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_924_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P924ReservdS
	 */
	protected void serializeIp65504P924ReservdS(short ip65504P924ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P924ReservdS,IP_65504_P_924_RESERVD_S_LEN)
                  ,beginIp65504P924ReservdS
                  ,IP_65504_P_924_RESERVD_S_LEN
                 );
            localIp65504P924ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P924ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P924ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P924ReservdS() {	 
			return (getShort(beginIp65504P924ReservdS));
   	}
         int localIp65504P924ReservdLCounter = -1;
         public boolean isIp65504P924ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P924ReservdLCounter != sharedCounter;
            localIp65504P924ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_924_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P924ReservdL
	 */
	protected void serializeIp65504P924ReservdL(short ip65504P924ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P924ReservdL,IP_65504_P_924_RESERVD_L_LEN)
                  ,beginIp65504P924ReservdL
                  ,IP_65504_P_924_RESERVD_L_LEN
                 );
            localIp65504P924ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P924ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P924ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P924ReservdL() {	 
			return (getShort(beginIp65504P924ReservdL));
   	}
         int localIp65504P925ReservdSCounter = -1;
         public boolean isIp65504P925ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P925ReservdSCounter != sharedCounter;
            localIp65504P925ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_925_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P925ReservdS
	 */
	protected void serializeIp65504P925ReservdS(short ip65504P925ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P925ReservdS,IP_65504_P_925_RESERVD_S_LEN)
                  ,beginIp65504P925ReservdS
                  ,IP_65504_P_925_RESERVD_S_LEN
                 );
            localIp65504P925ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P925ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P925ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P925ReservdS() {	 
			return (getShort(beginIp65504P925ReservdS));
   	}
         int localIp65504P925ReservdLCounter = -1;
         public boolean isIp65504P925ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P925ReservdLCounter != sharedCounter;
            localIp65504P925ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_925_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P925ReservdL
	 */
	protected void serializeIp65504P925ReservdL(short ip65504P925ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P925ReservdL,IP_65504_P_925_RESERVD_L_LEN)
                  ,beginIp65504P925ReservdL
                  ,IP_65504_P_925_RESERVD_L_LEN
                 );
            localIp65504P925ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P925ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P925ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P925ReservdL() {	 
			return (getShort(beginIp65504P925ReservdL));
   	}
         int localIp65504P926ReservdSCounter = -1;
         public boolean isIp65504P926ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P926ReservdSCounter != sharedCounter;
            localIp65504P926ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_926_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P926ReservdS
	 */
	protected void serializeIp65504P926ReservdS(short ip65504P926ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P926ReservdS,IP_65504_P_926_RESERVD_S_LEN)
                  ,beginIp65504P926ReservdS
                  ,IP_65504_P_926_RESERVD_S_LEN
                 );
            localIp65504P926ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P926ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P926ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P926ReservdS() {	 
			return (getShort(beginIp65504P926ReservdS));
   	}
         int localIp65504P926ReservdLCounter = -1;
         public boolean isIp65504P926ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P926ReservdLCounter != sharedCounter;
            localIp65504P926ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_926_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P926ReservdL
	 */
	protected void serializeIp65504P926ReservdL(short ip65504P926ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P926ReservdL,IP_65504_P_926_RESERVD_L_LEN)
                  ,beginIp65504P926ReservdL
                  ,IP_65504_P_926_RESERVD_L_LEN
                 );
            localIp65504P926ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P926ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P926ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P926ReservdL() {	 
			return (getShort(beginIp65504P926ReservdL));
   	}
         int localIp65504P927ReservdSCounter = -1;
         public boolean isIp65504P927ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P927ReservdSCounter != sharedCounter;
            localIp65504P927ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_927_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P927ReservdS
	 */
	protected void serializeIp65504P927ReservdS(short ip65504P927ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P927ReservdS,IP_65504_P_927_RESERVD_S_LEN)
                  ,beginIp65504P927ReservdS
                  ,IP_65504_P_927_RESERVD_S_LEN
                 );
            localIp65504P927ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P927ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P927ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P927ReservdS() {	 
			return (getShort(beginIp65504P927ReservdS));
   	}
         int localIp65504P927ReservdLCounter = -1;
         public boolean isIp65504P927ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P927ReservdLCounter != sharedCounter;
            localIp65504P927ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_927_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P927ReservdL
	 */
	protected void serializeIp65504P927ReservdL(short ip65504P927ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P927ReservdL,IP_65504_P_927_RESERVD_L_LEN)
                  ,beginIp65504P927ReservdL
                  ,IP_65504_P_927_RESERVD_L_LEN
                 );
            localIp65504P927ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P927ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P927ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P927ReservdL() {	 
			return (getShort(beginIp65504P927ReservdL));
   	}
         int localIp65504P928ReservdSCounter = -1;
         public boolean isIp65504P928ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P928ReservdSCounter != sharedCounter;
            localIp65504P928ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_928_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P928ReservdS
	 */
	protected void serializeIp65504P928ReservdS(short ip65504P928ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P928ReservdS,IP_65504_P_928_RESERVD_S_LEN)
                  ,beginIp65504P928ReservdS
                  ,IP_65504_P_928_RESERVD_S_LEN
                 );
            localIp65504P928ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P928ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P928ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P928ReservdS() {	 
			return (getShort(beginIp65504P928ReservdS));
   	}
         int localIp65504P928ReservdLCounter = -1;
         public boolean isIp65504P928ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P928ReservdLCounter != sharedCounter;
            localIp65504P928ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_928_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P928ReservdL
	 */
	protected void serializeIp65504P928ReservdL(short ip65504P928ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P928ReservdL,IP_65504_P_928_RESERVD_L_LEN)
                  ,beginIp65504P928ReservdL
                  ,IP_65504_P_928_RESERVD_L_LEN
                 );
            localIp65504P928ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P928ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P928ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P928ReservdL() {	 
			return (getShort(beginIp65504P928ReservdL));
   	}
         int localIp65504P929ReservdSCounter = -1;
         public boolean isIp65504P929ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P929ReservdSCounter != sharedCounter;
            localIp65504P929ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_929_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P929ReservdS
	 */
	protected void serializeIp65504P929ReservdS(short ip65504P929ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P929ReservdS,IP_65504_P_929_RESERVD_S_LEN)
                  ,beginIp65504P929ReservdS
                  ,IP_65504_P_929_RESERVD_S_LEN
                 );
            localIp65504P929ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P929ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P929ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P929ReservdS() {	 
			return (getShort(beginIp65504P929ReservdS));
   	}
         int localIp65504P929ReservdLCounter = -1;
         public boolean isIp65504P929ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P929ReservdLCounter != sharedCounter;
            localIp65504P929ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_929_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P929ReservdL
	 */
	protected void serializeIp65504P929ReservdL(short ip65504P929ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P929ReservdL,IP_65504_P_929_RESERVD_L_LEN)
                  ,beginIp65504P929ReservdL
                  ,IP_65504_P_929_RESERVD_L_LEN
                 );
            localIp65504P929ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P929ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P929ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P929ReservdL() {	 
			return (getShort(beginIp65504P929ReservdL));
   	}
         int localIp65504P930ReservdSCounter = -1;
         public boolean isIp65504P930ReservdSModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P930ReservdSCounter != sharedCounter;
            localIp65504P930ReservdSCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_930_RESERVD_S_LEN = 2;
  	/**
	 * serializeIp65504P930ReservdS
	 */
	protected void serializeIp65504P930ReservdS(short ip65504P930ReservdS) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P930ReservdS,IP_65504_P_930_RESERVD_S_LEN)
                  ,beginIp65504P930ReservdS
                  ,IP_65504_P_930_RESERVD_S_LEN
                 );
            localIp65504P930ReservdSCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P930ReservdSMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P930ReservdS is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P930ReservdS() {	 
			return (getShort(beginIp65504P930ReservdS));
   	}
         int localIp65504P930ReservdLCounter = -1;
         public boolean isIp65504P930ReservdLModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P930ReservdLCounter != sharedCounter;
            localIp65504P930ReservdLCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_930_RESERVD_L_LEN = 2;
  	/**
	 * serializeIp65504P930ReservdL
	 */
	protected void serializeIp65504P930ReservdL(short ip65504P930ReservdL) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P930ReservdL,IP_65504_P_930_RESERVD_L_LEN)
                  ,beginIp65504P930ReservdL
                  ,IP_65504_P_930_RESERVD_L_LEN
                 );
            localIp65504P930ReservdLCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P930ReservdLMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P930ReservdL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P930ReservdL() {	 
			return (getShort(beginIp65504P930ReservdL));
   	}




}
  
