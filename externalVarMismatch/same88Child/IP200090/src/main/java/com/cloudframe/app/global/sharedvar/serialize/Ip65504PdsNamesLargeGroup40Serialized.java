package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup40Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:05. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup40Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup40Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_40_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P1210S;
            protected  int beginIp65504P1210L;
            protected  int beginIp65504P1211S;
            protected  int beginIp65504P1211L;
            protected  int beginIp65504P1212S;
            protected  int beginIp65504P1212L;
            protected  int beginIp65504P1213S;
            protected  int beginIp65504P1213L;
            protected  int beginIp65504P1214S;
            protected  int beginIp65504P1214L;
            protected  int beginIp65504P1215S;
            protected  int beginIp65504P1215L;
            protected  int beginIp65504P1216S;
            protected  int beginIp65504P1216L;
            protected  int beginIp65504P1217S;
            protected  int beginIp65504P1217L;
            protected  int beginIp65504P1218S;
            protected  int beginIp65504P1218L;
            protected  int beginIp65504P1219S;
            protected  int beginIp65504P1219L;
            protected  int beginIp65504P1220S;
            protected  int beginIp65504P1220L;
            protected  int beginIp65504P1221S;
            protected  int beginIp65504P1221L;
            protected  int beginIp65504P1222S;
            protected  int beginIp65504P1222L;
            protected  int beginIp65504P1223S;
            protected  int beginIp65504P1223L;
            protected  int beginIp65504P1224S;
            protected  int beginIp65504P1224L;
            protected  int beginIp65504P1225S;
            protected  int beginIp65504P1225L;
            protected  int beginIp65504P1226S;
            protected  int beginIp65504P1226L;
            protected  int beginIp65504P1227S;
            protected  int beginIp65504P1227L;
            protected  int beginIp65504P1228S;
            protected  int beginIp65504P1228L;
            protected  int beginIp65504P1229S;
            protected  int beginIp65504P1229L;
            protected  int beginIp65504P1230S;
            protected  int beginIp65504P1230L;
            protected  int beginIp65504P1231S;
            protected  int beginIp65504P1231L;
            protected  int beginIp65504P1232S;
            protected  int beginIp65504P1232L;
            protected  int beginIp65504P1233S;
            protected  int beginIp65504P1233L;
            protected  int beginIp65504P1234S;
            protected  int beginIp65504P1234L;
            protected  int beginIp65504P1235S;
            protected  int beginIp65504P1235L;
            protected  int beginIp65504P1236S;
            protected  int beginIp65504P1236L;
            protected  int beginIp65504P1237S;
            protected  int beginIp65504P1237L;
            protected  int beginIp65504P1238S;
            protected  int beginIp65504P1238L;
            protected  int beginIp65504P1239S;
            protected  int beginIp65504P1239L;
            protected  int beginIp65504P1240S;
            protected  int beginIp65504P1240L;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup40Serialized
	**/
    public Ip65504PdsNamesLargeGroup40Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup40Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup40Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup40Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,9668); // serialize this field at offset 9668 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup40Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 9668 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup40Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_40_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P1210S = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P1210L = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P1211S = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P1211L = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P1212S = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P1212L = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P1213S = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P1213L = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P1214S = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P1214L = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P1215S = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P1215L = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P1216S = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P1216L = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P1217S = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P1217L = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P1218S = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P1218L = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P1219S = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P1219L = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P1220S = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P1220L = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P1221S = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P1221L = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P1222S = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P1222L = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P1223S = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P1223L = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P1224S = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P1224L = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P1225S = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P1225L = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P1226S = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P1226L = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P1227S = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P1227L = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P1228S = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P1228L = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P1229S = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P1229L = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P1230S = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P1230L = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P1231S = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P1231L = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P1232S = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P1232L = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P1233S = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P1233L = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P1234S = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P1234L = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P1235S = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P1235L = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P1236S = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P1236L = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P1237S = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P1237L = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P1238S = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P1238L = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P1239S = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P1239L = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P1240S = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P1240L = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P1210SCounter = -1;
         public boolean isIp65504P1210SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1210SCounter != sharedCounter;
            localIp65504P1210SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1210_S_LEN = 2;
  	/**
	 * serializeIp65504P1210S
	 */
	protected void serializeIp65504P1210S(short ip65504P1210S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1210S,IP_65504_P_1210_S_LEN)
                  ,beginIp65504P1210S
                  ,IP_65504_P_1210_S_LEN
                 );
            localIp65504P1210SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1210SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1210S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1210S() {	 
			return (getShort(beginIp65504P1210S));
   	}
         int localIp65504P1210LCounter = -1;
         public boolean isIp65504P1210LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1210LCounter != sharedCounter;
            localIp65504P1210LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1210_L_LEN = 2;
  	/**
	 * serializeIp65504P1210L
	 */
	protected void serializeIp65504P1210L(short ip65504P1210L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1210L,IP_65504_P_1210_L_LEN)
                  ,beginIp65504P1210L
                  ,IP_65504_P_1210_L_LEN
                 );
            localIp65504P1210LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1210LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1210L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1210L() {	 
			return (getShort(beginIp65504P1210L));
   	}
         int localIp65504P1211SCounter = -1;
         public boolean isIp65504P1211SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1211SCounter != sharedCounter;
            localIp65504P1211SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1211_S_LEN = 2;
  	/**
	 * serializeIp65504P1211S
	 */
	protected void serializeIp65504P1211S(short ip65504P1211S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1211S,IP_65504_P_1211_S_LEN)
                  ,beginIp65504P1211S
                  ,IP_65504_P_1211_S_LEN
                 );
            localIp65504P1211SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1211SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1211S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1211S() {	 
			return (getShort(beginIp65504P1211S));
   	}
         int localIp65504P1211LCounter = -1;
         public boolean isIp65504P1211LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1211LCounter != sharedCounter;
            localIp65504P1211LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1211_L_LEN = 2;
  	/**
	 * serializeIp65504P1211L
	 */
	protected void serializeIp65504P1211L(short ip65504P1211L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1211L,IP_65504_P_1211_L_LEN)
                  ,beginIp65504P1211L
                  ,IP_65504_P_1211_L_LEN
                 );
            localIp65504P1211LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1211LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1211L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1211L() {	 
			return (getShort(beginIp65504P1211L));
   	}
         int localIp65504P1212SCounter = -1;
         public boolean isIp65504P1212SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1212SCounter != sharedCounter;
            localIp65504P1212SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1212_S_LEN = 2;
  	/**
	 * serializeIp65504P1212S
	 */
	protected void serializeIp65504P1212S(short ip65504P1212S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1212S,IP_65504_P_1212_S_LEN)
                  ,beginIp65504P1212S
                  ,IP_65504_P_1212_S_LEN
                 );
            localIp65504P1212SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1212SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1212S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1212S() {	 
			return (getShort(beginIp65504P1212S));
   	}
         int localIp65504P1212LCounter = -1;
         public boolean isIp65504P1212LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1212LCounter != sharedCounter;
            localIp65504P1212LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1212_L_LEN = 2;
  	/**
	 * serializeIp65504P1212L
	 */
	protected void serializeIp65504P1212L(short ip65504P1212L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1212L,IP_65504_P_1212_L_LEN)
                  ,beginIp65504P1212L
                  ,IP_65504_P_1212_L_LEN
                 );
            localIp65504P1212LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1212LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1212L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1212L() {	 
			return (getShort(beginIp65504P1212L));
   	}
         int localIp65504P1213SCounter = -1;
         public boolean isIp65504P1213SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1213SCounter != sharedCounter;
            localIp65504P1213SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1213_S_LEN = 2;
  	/**
	 * serializeIp65504P1213S
	 */
	protected void serializeIp65504P1213S(short ip65504P1213S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1213S,IP_65504_P_1213_S_LEN)
                  ,beginIp65504P1213S
                  ,IP_65504_P_1213_S_LEN
                 );
            localIp65504P1213SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1213SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1213S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1213S() {	 
			return (getShort(beginIp65504P1213S));
   	}
         int localIp65504P1213LCounter = -1;
         public boolean isIp65504P1213LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1213LCounter != sharedCounter;
            localIp65504P1213LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1213_L_LEN = 2;
  	/**
	 * serializeIp65504P1213L
	 */
	protected void serializeIp65504P1213L(short ip65504P1213L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1213L,IP_65504_P_1213_L_LEN)
                  ,beginIp65504P1213L
                  ,IP_65504_P_1213_L_LEN
                 );
            localIp65504P1213LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1213LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1213L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1213L() {	 
			return (getShort(beginIp65504P1213L));
   	}
         int localIp65504P1214SCounter = -1;
         public boolean isIp65504P1214SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1214SCounter != sharedCounter;
            localIp65504P1214SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1214_S_LEN = 2;
  	/**
	 * serializeIp65504P1214S
	 */
	protected void serializeIp65504P1214S(short ip65504P1214S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1214S,IP_65504_P_1214_S_LEN)
                  ,beginIp65504P1214S
                  ,IP_65504_P_1214_S_LEN
                 );
            localIp65504P1214SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1214SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1214S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1214S() {	 
			return (getShort(beginIp65504P1214S));
   	}
         int localIp65504P1214LCounter = -1;
         public boolean isIp65504P1214LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1214LCounter != sharedCounter;
            localIp65504P1214LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1214_L_LEN = 2;
  	/**
	 * serializeIp65504P1214L
	 */
	protected void serializeIp65504P1214L(short ip65504P1214L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1214L,IP_65504_P_1214_L_LEN)
                  ,beginIp65504P1214L
                  ,IP_65504_P_1214_L_LEN
                 );
            localIp65504P1214LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1214LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1214L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1214L() {	 
			return (getShort(beginIp65504P1214L));
   	}
         int localIp65504P1215SCounter = -1;
         public boolean isIp65504P1215SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1215SCounter != sharedCounter;
            localIp65504P1215SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1215_S_LEN = 2;
  	/**
	 * serializeIp65504P1215S
	 */
	protected void serializeIp65504P1215S(short ip65504P1215S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1215S,IP_65504_P_1215_S_LEN)
                  ,beginIp65504P1215S
                  ,IP_65504_P_1215_S_LEN
                 );
            localIp65504P1215SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1215SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1215S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1215S() {	 
			return (getShort(beginIp65504P1215S));
   	}
         int localIp65504P1215LCounter = -1;
         public boolean isIp65504P1215LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1215LCounter != sharedCounter;
            localIp65504P1215LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1215_L_LEN = 2;
  	/**
	 * serializeIp65504P1215L
	 */
	protected void serializeIp65504P1215L(short ip65504P1215L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1215L,IP_65504_P_1215_L_LEN)
                  ,beginIp65504P1215L
                  ,IP_65504_P_1215_L_LEN
                 );
            localIp65504P1215LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1215LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1215L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1215L() {	 
			return (getShort(beginIp65504P1215L));
   	}
         int localIp65504P1216SCounter = -1;
         public boolean isIp65504P1216SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1216SCounter != sharedCounter;
            localIp65504P1216SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1216_S_LEN = 2;
  	/**
	 * serializeIp65504P1216S
	 */
	protected void serializeIp65504P1216S(short ip65504P1216S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1216S,IP_65504_P_1216_S_LEN)
                  ,beginIp65504P1216S
                  ,IP_65504_P_1216_S_LEN
                 );
            localIp65504P1216SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1216SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1216S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1216S() {	 
			return (getShort(beginIp65504P1216S));
   	}
         int localIp65504P1216LCounter = -1;
         public boolean isIp65504P1216LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1216LCounter != sharedCounter;
            localIp65504P1216LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1216_L_LEN = 2;
  	/**
	 * serializeIp65504P1216L
	 */
	protected void serializeIp65504P1216L(short ip65504P1216L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1216L,IP_65504_P_1216_L_LEN)
                  ,beginIp65504P1216L
                  ,IP_65504_P_1216_L_LEN
                 );
            localIp65504P1216LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1216LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1216L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1216L() {	 
			return (getShort(beginIp65504P1216L));
   	}
         int localIp65504P1217SCounter = -1;
         public boolean isIp65504P1217SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1217SCounter != sharedCounter;
            localIp65504P1217SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1217_S_LEN = 2;
  	/**
	 * serializeIp65504P1217S
	 */
	protected void serializeIp65504P1217S(short ip65504P1217S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1217S,IP_65504_P_1217_S_LEN)
                  ,beginIp65504P1217S
                  ,IP_65504_P_1217_S_LEN
                 );
            localIp65504P1217SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1217SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1217S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1217S() {	 
			return (getShort(beginIp65504P1217S));
   	}
         int localIp65504P1217LCounter = -1;
         public boolean isIp65504P1217LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1217LCounter != sharedCounter;
            localIp65504P1217LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1217_L_LEN = 2;
  	/**
	 * serializeIp65504P1217L
	 */
	protected void serializeIp65504P1217L(short ip65504P1217L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1217L,IP_65504_P_1217_L_LEN)
                  ,beginIp65504P1217L
                  ,IP_65504_P_1217_L_LEN
                 );
            localIp65504P1217LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1217LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1217L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1217L() {	 
			return (getShort(beginIp65504P1217L));
   	}
         int localIp65504P1218SCounter = -1;
         public boolean isIp65504P1218SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1218SCounter != sharedCounter;
            localIp65504P1218SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1218_S_LEN = 2;
  	/**
	 * serializeIp65504P1218S
	 */
	protected void serializeIp65504P1218S(short ip65504P1218S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1218S,IP_65504_P_1218_S_LEN)
                  ,beginIp65504P1218S
                  ,IP_65504_P_1218_S_LEN
                 );
            localIp65504P1218SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1218SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1218S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1218S() {	 
			return (getShort(beginIp65504P1218S));
   	}
         int localIp65504P1218LCounter = -1;
         public boolean isIp65504P1218LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1218LCounter != sharedCounter;
            localIp65504P1218LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1218_L_LEN = 2;
  	/**
	 * serializeIp65504P1218L
	 */
	protected void serializeIp65504P1218L(short ip65504P1218L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1218L,IP_65504_P_1218_L_LEN)
                  ,beginIp65504P1218L
                  ,IP_65504_P_1218_L_LEN
                 );
            localIp65504P1218LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1218LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1218L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1218L() {	 
			return (getShort(beginIp65504P1218L));
   	}
         int localIp65504P1219SCounter = -1;
         public boolean isIp65504P1219SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1219SCounter != sharedCounter;
            localIp65504P1219SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1219_S_LEN = 2;
  	/**
	 * serializeIp65504P1219S
	 */
	protected void serializeIp65504P1219S(short ip65504P1219S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1219S,IP_65504_P_1219_S_LEN)
                  ,beginIp65504P1219S
                  ,IP_65504_P_1219_S_LEN
                 );
            localIp65504P1219SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1219SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1219S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1219S() {	 
			return (getShort(beginIp65504P1219S));
   	}
         int localIp65504P1219LCounter = -1;
         public boolean isIp65504P1219LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1219LCounter != sharedCounter;
            localIp65504P1219LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1219_L_LEN = 2;
  	/**
	 * serializeIp65504P1219L
	 */
	protected void serializeIp65504P1219L(short ip65504P1219L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1219L,IP_65504_P_1219_L_LEN)
                  ,beginIp65504P1219L
                  ,IP_65504_P_1219_L_LEN
                 );
            localIp65504P1219LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1219LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1219L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1219L() {	 
			return (getShort(beginIp65504P1219L));
   	}
         int localIp65504P1220SCounter = -1;
         public boolean isIp65504P1220SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1220SCounter != sharedCounter;
            localIp65504P1220SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1220_S_LEN = 2;
  	/**
	 * serializeIp65504P1220S
	 */
	protected void serializeIp65504P1220S(short ip65504P1220S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1220S,IP_65504_P_1220_S_LEN)
                  ,beginIp65504P1220S
                  ,IP_65504_P_1220_S_LEN
                 );
            localIp65504P1220SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1220SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1220S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1220S() {	 
			return (getShort(beginIp65504P1220S));
   	}
         int localIp65504P1220LCounter = -1;
         public boolean isIp65504P1220LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1220LCounter != sharedCounter;
            localIp65504P1220LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1220_L_LEN = 2;
  	/**
	 * serializeIp65504P1220L
	 */
	protected void serializeIp65504P1220L(short ip65504P1220L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1220L,IP_65504_P_1220_L_LEN)
                  ,beginIp65504P1220L
                  ,IP_65504_P_1220_L_LEN
                 );
            localIp65504P1220LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1220LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1220L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1220L() {	 
			return (getShort(beginIp65504P1220L));
   	}
         int localIp65504P1221SCounter = -1;
         public boolean isIp65504P1221SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1221SCounter != sharedCounter;
            localIp65504P1221SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1221_S_LEN = 2;
  	/**
	 * serializeIp65504P1221S
	 */
	protected void serializeIp65504P1221S(short ip65504P1221S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1221S,IP_65504_P_1221_S_LEN)
                  ,beginIp65504P1221S
                  ,IP_65504_P_1221_S_LEN
                 );
            localIp65504P1221SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1221SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1221S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1221S() {	 
			return (getShort(beginIp65504P1221S));
   	}
         int localIp65504P1221LCounter = -1;
         public boolean isIp65504P1221LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1221LCounter != sharedCounter;
            localIp65504P1221LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1221_L_LEN = 2;
  	/**
	 * serializeIp65504P1221L
	 */
	protected void serializeIp65504P1221L(short ip65504P1221L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1221L,IP_65504_P_1221_L_LEN)
                  ,beginIp65504P1221L
                  ,IP_65504_P_1221_L_LEN
                 );
            localIp65504P1221LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1221LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1221L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1221L() {	 
			return (getShort(beginIp65504P1221L));
   	}
         int localIp65504P1222SCounter = -1;
         public boolean isIp65504P1222SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1222SCounter != sharedCounter;
            localIp65504P1222SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1222_S_LEN = 2;
  	/**
	 * serializeIp65504P1222S
	 */
	protected void serializeIp65504P1222S(short ip65504P1222S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1222S,IP_65504_P_1222_S_LEN)
                  ,beginIp65504P1222S
                  ,IP_65504_P_1222_S_LEN
                 );
            localIp65504P1222SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1222SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1222S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1222S() {	 
			return (getShort(beginIp65504P1222S));
   	}
         int localIp65504P1222LCounter = -1;
         public boolean isIp65504P1222LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1222LCounter != sharedCounter;
            localIp65504P1222LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1222_L_LEN = 2;
  	/**
	 * serializeIp65504P1222L
	 */
	protected void serializeIp65504P1222L(short ip65504P1222L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1222L,IP_65504_P_1222_L_LEN)
                  ,beginIp65504P1222L
                  ,IP_65504_P_1222_L_LEN
                 );
            localIp65504P1222LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1222LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1222L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1222L() {	 
			return (getShort(beginIp65504P1222L));
   	}
         int localIp65504P1223SCounter = -1;
         public boolean isIp65504P1223SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1223SCounter != sharedCounter;
            localIp65504P1223SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1223_S_LEN = 2;
  	/**
	 * serializeIp65504P1223S
	 */
	protected void serializeIp65504P1223S(short ip65504P1223S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1223S,IP_65504_P_1223_S_LEN)
                  ,beginIp65504P1223S
                  ,IP_65504_P_1223_S_LEN
                 );
            localIp65504P1223SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1223SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1223S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1223S() {	 
			return (getShort(beginIp65504P1223S));
   	}
         int localIp65504P1223LCounter = -1;
         public boolean isIp65504P1223LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1223LCounter != sharedCounter;
            localIp65504P1223LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1223_L_LEN = 2;
  	/**
	 * serializeIp65504P1223L
	 */
	protected void serializeIp65504P1223L(short ip65504P1223L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1223L,IP_65504_P_1223_L_LEN)
                  ,beginIp65504P1223L
                  ,IP_65504_P_1223_L_LEN
                 );
            localIp65504P1223LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1223LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1223L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1223L() {	 
			return (getShort(beginIp65504P1223L));
   	}
         int localIp65504P1224SCounter = -1;
         public boolean isIp65504P1224SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1224SCounter != sharedCounter;
            localIp65504P1224SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1224_S_LEN = 2;
  	/**
	 * serializeIp65504P1224S
	 */
	protected void serializeIp65504P1224S(short ip65504P1224S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1224S,IP_65504_P_1224_S_LEN)
                  ,beginIp65504P1224S
                  ,IP_65504_P_1224_S_LEN
                 );
            localIp65504P1224SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1224SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1224S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1224S() {	 
			return (getShort(beginIp65504P1224S));
   	}
         int localIp65504P1224LCounter = -1;
         public boolean isIp65504P1224LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1224LCounter != sharedCounter;
            localIp65504P1224LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1224_L_LEN = 2;
  	/**
	 * serializeIp65504P1224L
	 */
	protected void serializeIp65504P1224L(short ip65504P1224L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1224L,IP_65504_P_1224_L_LEN)
                  ,beginIp65504P1224L
                  ,IP_65504_P_1224_L_LEN
                 );
            localIp65504P1224LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1224LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1224L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1224L() {	 
			return (getShort(beginIp65504P1224L));
   	}
         int localIp65504P1225SCounter = -1;
         public boolean isIp65504P1225SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1225SCounter != sharedCounter;
            localIp65504P1225SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1225_S_LEN = 2;
  	/**
	 * serializeIp65504P1225S
	 */
	protected void serializeIp65504P1225S(short ip65504P1225S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1225S,IP_65504_P_1225_S_LEN)
                  ,beginIp65504P1225S
                  ,IP_65504_P_1225_S_LEN
                 );
            localIp65504P1225SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1225SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1225S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1225S() {	 
			return (getShort(beginIp65504P1225S));
   	}
         int localIp65504P1225LCounter = -1;
         public boolean isIp65504P1225LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1225LCounter != sharedCounter;
            localIp65504P1225LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1225_L_LEN = 2;
  	/**
	 * serializeIp65504P1225L
	 */
	protected void serializeIp65504P1225L(short ip65504P1225L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1225L,IP_65504_P_1225_L_LEN)
                  ,beginIp65504P1225L
                  ,IP_65504_P_1225_L_LEN
                 );
            localIp65504P1225LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1225LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1225L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1225L() {	 
			return (getShort(beginIp65504P1225L));
   	}
         int localIp65504P1226SCounter = -1;
         public boolean isIp65504P1226SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1226SCounter != sharedCounter;
            localIp65504P1226SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1226_S_LEN = 2;
  	/**
	 * serializeIp65504P1226S
	 */
	protected void serializeIp65504P1226S(short ip65504P1226S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1226S,IP_65504_P_1226_S_LEN)
                  ,beginIp65504P1226S
                  ,IP_65504_P_1226_S_LEN
                 );
            localIp65504P1226SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1226SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1226S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1226S() {	 
			return (getShort(beginIp65504P1226S));
   	}
         int localIp65504P1226LCounter = -1;
         public boolean isIp65504P1226LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1226LCounter != sharedCounter;
            localIp65504P1226LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1226_L_LEN = 2;
  	/**
	 * serializeIp65504P1226L
	 */
	protected void serializeIp65504P1226L(short ip65504P1226L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1226L,IP_65504_P_1226_L_LEN)
                  ,beginIp65504P1226L
                  ,IP_65504_P_1226_L_LEN
                 );
            localIp65504P1226LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1226LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1226L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1226L() {	 
			return (getShort(beginIp65504P1226L));
   	}
         int localIp65504P1227SCounter = -1;
         public boolean isIp65504P1227SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1227SCounter != sharedCounter;
            localIp65504P1227SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1227_S_LEN = 2;
  	/**
	 * serializeIp65504P1227S
	 */
	protected void serializeIp65504P1227S(short ip65504P1227S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1227S,IP_65504_P_1227_S_LEN)
                  ,beginIp65504P1227S
                  ,IP_65504_P_1227_S_LEN
                 );
            localIp65504P1227SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1227SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1227S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1227S() {	 
			return (getShort(beginIp65504P1227S));
   	}
         int localIp65504P1227LCounter = -1;
         public boolean isIp65504P1227LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1227LCounter != sharedCounter;
            localIp65504P1227LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1227_L_LEN = 2;
  	/**
	 * serializeIp65504P1227L
	 */
	protected void serializeIp65504P1227L(short ip65504P1227L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1227L,IP_65504_P_1227_L_LEN)
                  ,beginIp65504P1227L
                  ,IP_65504_P_1227_L_LEN
                 );
            localIp65504P1227LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1227LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1227L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1227L() {	 
			return (getShort(beginIp65504P1227L));
   	}
         int localIp65504P1228SCounter = -1;
         public boolean isIp65504P1228SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1228SCounter != sharedCounter;
            localIp65504P1228SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1228_S_LEN = 2;
  	/**
	 * serializeIp65504P1228S
	 */
	protected void serializeIp65504P1228S(short ip65504P1228S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1228S,IP_65504_P_1228_S_LEN)
                  ,beginIp65504P1228S
                  ,IP_65504_P_1228_S_LEN
                 );
            localIp65504P1228SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1228SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1228S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1228S() {	 
			return (getShort(beginIp65504P1228S));
   	}
         int localIp65504P1228LCounter = -1;
         public boolean isIp65504P1228LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1228LCounter != sharedCounter;
            localIp65504P1228LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1228_L_LEN = 2;
  	/**
	 * serializeIp65504P1228L
	 */
	protected void serializeIp65504P1228L(short ip65504P1228L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1228L,IP_65504_P_1228_L_LEN)
                  ,beginIp65504P1228L
                  ,IP_65504_P_1228_L_LEN
                 );
            localIp65504P1228LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1228LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1228L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1228L() {	 
			return (getShort(beginIp65504P1228L));
   	}
         int localIp65504P1229SCounter = -1;
         public boolean isIp65504P1229SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1229SCounter != sharedCounter;
            localIp65504P1229SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1229_S_LEN = 2;
  	/**
	 * serializeIp65504P1229S
	 */
	protected void serializeIp65504P1229S(short ip65504P1229S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1229S,IP_65504_P_1229_S_LEN)
                  ,beginIp65504P1229S
                  ,IP_65504_P_1229_S_LEN
                 );
            localIp65504P1229SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1229SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1229S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1229S() {	 
			return (getShort(beginIp65504P1229S));
   	}
         int localIp65504P1229LCounter = -1;
         public boolean isIp65504P1229LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1229LCounter != sharedCounter;
            localIp65504P1229LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1229_L_LEN = 2;
  	/**
	 * serializeIp65504P1229L
	 */
	protected void serializeIp65504P1229L(short ip65504P1229L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1229L,IP_65504_P_1229_L_LEN)
                  ,beginIp65504P1229L
                  ,IP_65504_P_1229_L_LEN
                 );
            localIp65504P1229LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1229LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1229L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1229L() {	 
			return (getShort(beginIp65504P1229L));
   	}
         int localIp65504P1230SCounter = -1;
         public boolean isIp65504P1230SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1230SCounter != sharedCounter;
            localIp65504P1230SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1230_S_LEN = 2;
  	/**
	 * serializeIp65504P1230S
	 */
	protected void serializeIp65504P1230S(short ip65504P1230S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1230S,IP_65504_P_1230_S_LEN)
                  ,beginIp65504P1230S
                  ,IP_65504_P_1230_S_LEN
                 );
            localIp65504P1230SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1230SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1230S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1230S() {	 
			return (getShort(beginIp65504P1230S));
   	}
         int localIp65504P1230LCounter = -1;
         public boolean isIp65504P1230LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1230LCounter != sharedCounter;
            localIp65504P1230LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1230_L_LEN = 2;
  	/**
	 * serializeIp65504P1230L
	 */
	protected void serializeIp65504P1230L(short ip65504P1230L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1230L,IP_65504_P_1230_L_LEN)
                  ,beginIp65504P1230L
                  ,IP_65504_P_1230_L_LEN
                 );
            localIp65504P1230LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1230LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1230L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1230L() {	 
			return (getShort(beginIp65504P1230L));
   	}
         int localIp65504P1231SCounter = -1;
         public boolean isIp65504P1231SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1231SCounter != sharedCounter;
            localIp65504P1231SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1231_S_LEN = 2;
  	/**
	 * serializeIp65504P1231S
	 */
	protected void serializeIp65504P1231S(short ip65504P1231S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1231S,IP_65504_P_1231_S_LEN)
                  ,beginIp65504P1231S
                  ,IP_65504_P_1231_S_LEN
                 );
            localIp65504P1231SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1231SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1231S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1231S() {	 
			return (getShort(beginIp65504P1231S));
   	}
         int localIp65504P1231LCounter = -1;
         public boolean isIp65504P1231LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1231LCounter != sharedCounter;
            localIp65504P1231LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1231_L_LEN = 2;
  	/**
	 * serializeIp65504P1231L
	 */
	protected void serializeIp65504P1231L(short ip65504P1231L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1231L,IP_65504_P_1231_L_LEN)
                  ,beginIp65504P1231L
                  ,IP_65504_P_1231_L_LEN
                 );
            localIp65504P1231LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1231LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1231L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1231L() {	 
			return (getShort(beginIp65504P1231L));
   	}
         int localIp65504P1232SCounter = -1;
         public boolean isIp65504P1232SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1232SCounter != sharedCounter;
            localIp65504P1232SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1232_S_LEN = 2;
  	/**
	 * serializeIp65504P1232S
	 */
	protected void serializeIp65504P1232S(short ip65504P1232S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1232S,IP_65504_P_1232_S_LEN)
                  ,beginIp65504P1232S
                  ,IP_65504_P_1232_S_LEN
                 );
            localIp65504P1232SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1232SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1232S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1232S() {	 
			return (getShort(beginIp65504P1232S));
   	}
         int localIp65504P1232LCounter = -1;
         public boolean isIp65504P1232LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1232LCounter != sharedCounter;
            localIp65504P1232LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1232_L_LEN = 2;
  	/**
	 * serializeIp65504P1232L
	 */
	protected void serializeIp65504P1232L(short ip65504P1232L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1232L,IP_65504_P_1232_L_LEN)
                  ,beginIp65504P1232L
                  ,IP_65504_P_1232_L_LEN
                 );
            localIp65504P1232LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1232LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1232L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1232L() {	 
			return (getShort(beginIp65504P1232L));
   	}
         int localIp65504P1233SCounter = -1;
         public boolean isIp65504P1233SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1233SCounter != sharedCounter;
            localIp65504P1233SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1233_S_LEN = 2;
  	/**
	 * serializeIp65504P1233S
	 */
	protected void serializeIp65504P1233S(short ip65504P1233S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1233S,IP_65504_P_1233_S_LEN)
                  ,beginIp65504P1233S
                  ,IP_65504_P_1233_S_LEN
                 );
            localIp65504P1233SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1233SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1233S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1233S() {	 
			return (getShort(beginIp65504P1233S));
   	}
         int localIp65504P1233LCounter = -1;
         public boolean isIp65504P1233LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1233LCounter != sharedCounter;
            localIp65504P1233LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1233_L_LEN = 2;
  	/**
	 * serializeIp65504P1233L
	 */
	protected void serializeIp65504P1233L(short ip65504P1233L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1233L,IP_65504_P_1233_L_LEN)
                  ,beginIp65504P1233L
                  ,IP_65504_P_1233_L_LEN
                 );
            localIp65504P1233LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1233LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1233L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1233L() {	 
			return (getShort(beginIp65504P1233L));
   	}
         int localIp65504P1234SCounter = -1;
         public boolean isIp65504P1234SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1234SCounter != sharedCounter;
            localIp65504P1234SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1234_S_LEN = 2;
  	/**
	 * serializeIp65504P1234S
	 */
	protected void serializeIp65504P1234S(short ip65504P1234S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1234S,IP_65504_P_1234_S_LEN)
                  ,beginIp65504P1234S
                  ,IP_65504_P_1234_S_LEN
                 );
            localIp65504P1234SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1234SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1234S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1234S() {	 
			return (getShort(beginIp65504P1234S));
   	}
         int localIp65504P1234LCounter = -1;
         public boolean isIp65504P1234LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1234LCounter != sharedCounter;
            localIp65504P1234LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1234_L_LEN = 2;
  	/**
	 * serializeIp65504P1234L
	 */
	protected void serializeIp65504P1234L(short ip65504P1234L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1234L,IP_65504_P_1234_L_LEN)
                  ,beginIp65504P1234L
                  ,IP_65504_P_1234_L_LEN
                 );
            localIp65504P1234LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1234LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1234L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1234L() {	 
			return (getShort(beginIp65504P1234L));
   	}
         int localIp65504P1235SCounter = -1;
         public boolean isIp65504P1235SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1235SCounter != sharedCounter;
            localIp65504P1235SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1235_S_LEN = 2;
  	/**
	 * serializeIp65504P1235S
	 */
	protected void serializeIp65504P1235S(short ip65504P1235S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1235S,IP_65504_P_1235_S_LEN)
                  ,beginIp65504P1235S
                  ,IP_65504_P_1235_S_LEN
                 );
            localIp65504P1235SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1235SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1235S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1235S() {	 
			return (getShort(beginIp65504P1235S));
   	}
         int localIp65504P1235LCounter = -1;
         public boolean isIp65504P1235LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1235LCounter != sharedCounter;
            localIp65504P1235LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1235_L_LEN = 2;
  	/**
	 * serializeIp65504P1235L
	 */
	protected void serializeIp65504P1235L(short ip65504P1235L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1235L,IP_65504_P_1235_L_LEN)
                  ,beginIp65504P1235L
                  ,IP_65504_P_1235_L_LEN
                 );
            localIp65504P1235LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1235LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1235L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1235L() {	 
			return (getShort(beginIp65504P1235L));
   	}
         int localIp65504P1236SCounter = -1;
         public boolean isIp65504P1236SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1236SCounter != sharedCounter;
            localIp65504P1236SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1236_S_LEN = 2;
  	/**
	 * serializeIp65504P1236S
	 */
	protected void serializeIp65504P1236S(short ip65504P1236S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1236S,IP_65504_P_1236_S_LEN)
                  ,beginIp65504P1236S
                  ,IP_65504_P_1236_S_LEN
                 );
            localIp65504P1236SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1236SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1236S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1236S() {	 
			return (getShort(beginIp65504P1236S));
   	}
         int localIp65504P1236LCounter = -1;
         public boolean isIp65504P1236LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1236LCounter != sharedCounter;
            localIp65504P1236LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1236_L_LEN = 2;
  	/**
	 * serializeIp65504P1236L
	 */
	protected void serializeIp65504P1236L(short ip65504P1236L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1236L,IP_65504_P_1236_L_LEN)
                  ,beginIp65504P1236L
                  ,IP_65504_P_1236_L_LEN
                 );
            localIp65504P1236LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1236LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1236L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1236L() {	 
			return (getShort(beginIp65504P1236L));
   	}
         int localIp65504P1237SCounter = -1;
         public boolean isIp65504P1237SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1237SCounter != sharedCounter;
            localIp65504P1237SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1237_S_LEN = 2;
  	/**
	 * serializeIp65504P1237S
	 */
	protected void serializeIp65504P1237S(short ip65504P1237S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1237S,IP_65504_P_1237_S_LEN)
                  ,beginIp65504P1237S
                  ,IP_65504_P_1237_S_LEN
                 );
            localIp65504P1237SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1237SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1237S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1237S() {	 
			return (getShort(beginIp65504P1237S));
   	}
         int localIp65504P1237LCounter = -1;
         public boolean isIp65504P1237LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1237LCounter != sharedCounter;
            localIp65504P1237LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1237_L_LEN = 2;
  	/**
	 * serializeIp65504P1237L
	 */
	protected void serializeIp65504P1237L(short ip65504P1237L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1237L,IP_65504_P_1237_L_LEN)
                  ,beginIp65504P1237L
                  ,IP_65504_P_1237_L_LEN
                 );
            localIp65504P1237LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1237LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1237L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1237L() {	 
			return (getShort(beginIp65504P1237L));
   	}
         int localIp65504P1238SCounter = -1;
         public boolean isIp65504P1238SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1238SCounter != sharedCounter;
            localIp65504P1238SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1238_S_LEN = 2;
  	/**
	 * serializeIp65504P1238S
	 */
	protected void serializeIp65504P1238S(short ip65504P1238S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1238S,IP_65504_P_1238_S_LEN)
                  ,beginIp65504P1238S
                  ,IP_65504_P_1238_S_LEN
                 );
            localIp65504P1238SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1238SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1238S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1238S() {	 
			return (getShort(beginIp65504P1238S));
   	}
         int localIp65504P1238LCounter = -1;
         public boolean isIp65504P1238LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1238LCounter != sharedCounter;
            localIp65504P1238LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1238_L_LEN = 2;
  	/**
	 * serializeIp65504P1238L
	 */
	protected void serializeIp65504P1238L(short ip65504P1238L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1238L,IP_65504_P_1238_L_LEN)
                  ,beginIp65504P1238L
                  ,IP_65504_P_1238_L_LEN
                 );
            localIp65504P1238LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1238LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1238L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1238L() {	 
			return (getShort(beginIp65504P1238L));
   	}
         int localIp65504P1239SCounter = -1;
         public boolean isIp65504P1239SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1239SCounter != sharedCounter;
            localIp65504P1239SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1239_S_LEN = 2;
  	/**
	 * serializeIp65504P1239S
	 */
	protected void serializeIp65504P1239S(short ip65504P1239S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1239S,IP_65504_P_1239_S_LEN)
                  ,beginIp65504P1239S
                  ,IP_65504_P_1239_S_LEN
                 );
            localIp65504P1239SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1239SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1239S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1239S() {	 
			return (getShort(beginIp65504P1239S));
   	}
         int localIp65504P1239LCounter = -1;
         public boolean isIp65504P1239LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1239LCounter != sharedCounter;
            localIp65504P1239LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1239_L_LEN = 2;
  	/**
	 * serializeIp65504P1239L
	 */
	protected void serializeIp65504P1239L(short ip65504P1239L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1239L,IP_65504_P_1239_L_LEN)
                  ,beginIp65504P1239L
                  ,IP_65504_P_1239_L_LEN
                 );
            localIp65504P1239LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1239LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1239L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1239L() {	 
			return (getShort(beginIp65504P1239L));
   	}
         int localIp65504P1240SCounter = -1;
         public boolean isIp65504P1240SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1240SCounter != sharedCounter;
            localIp65504P1240SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1240_S_LEN = 2;
  	/**
	 * serializeIp65504P1240S
	 */
	protected void serializeIp65504P1240S(short ip65504P1240S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1240S,IP_65504_P_1240_S_LEN)
                  ,beginIp65504P1240S
                  ,IP_65504_P_1240_S_LEN
                 );
            localIp65504P1240SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1240SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1240S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1240S() {	 
			return (getShort(beginIp65504P1240S));
   	}
         int localIp65504P1240LCounter = -1;
         public boolean isIp65504P1240LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1240LCounter != sharedCounter;
            localIp65504P1240LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1240_L_LEN = 2;
  	/**
	 * serializeIp65504P1240L
	 */
	protected void serializeIp65504P1240L(short ip65504P1240L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1240L,IP_65504_P_1240_L_LEN)
                  ,beginIp65504P1240L
                  ,IP_65504_P_1240_L_LEN
                 );
            localIp65504P1240LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1240LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1240L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1240L() {	 
			return (getShort(beginIp65504P1240L));
   	}




}
  
