package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup70Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:29. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup70Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup70Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_70_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P2140S;
            protected  int beginIp65504P2140L;
            protected  int beginIp65504P2141S;
            protected  int beginIp65504P2141L;
            protected  int beginIp65504P2142S;
            protected  int beginIp65504P2142L;
            protected  int beginIp65504P2143S;
            protected  int beginIp65504P2143L;
            protected  int beginIp65504P2144S;
            protected  int beginIp65504P2144L;
            protected  int beginIp65504P2145S;
            protected  int beginIp65504P2145L;
            protected  int beginIp65504P2146S;
            protected  int beginIp65504P2146L;
            protected  int beginIp65504P2147S;
            protected  int beginIp65504P2147L;
            protected  int beginIp65504P2148S;
            protected  int beginIp65504P2148L;
            protected  int beginIp65504P2149S;
            protected  int beginIp65504P2149L;
            protected  int beginIp65504P2150S;
            protected  int beginIp65504P2150L;
            protected  int beginIp65504P2151S;
            protected  int beginIp65504P2151L;
            protected  int beginIp65504P2152S;
            protected  int beginIp65504P2152L;
            protected  int beginIp65504P2153S;
            protected  int beginIp65504P2153L;
            protected  int beginIp65504P2154S;
            protected  int beginIp65504P2154L;
            protected  int beginIp65504P2155S;
            protected  int beginIp65504P2155L;
            protected  int beginIp65504P2156S;
            protected  int beginIp65504P2156L;
            protected  int beginIp65504P2157S;
            protected  int beginIp65504P2157L;
            protected  int beginIp65504P2158S;
            protected  int beginIp65504P2158L;
            protected  int beginIp65504P2159S;
            protected  int beginIp65504P2159L;
            protected  int beginIp65504P2160S;
            protected  int beginIp65504P2160L;
            protected  int beginIp65504P2161S;
            protected  int beginIp65504P2161L;
            protected  int beginIp65504P2162S;
            protected  int beginIp65504P2162L;
            protected  int beginIp65504P2163S;
            protected  int beginIp65504P2163L;
            protected  int beginIp65504P2164S;
            protected  int beginIp65504P2164L;
            protected  int beginIp65504P2165S;
            protected  int beginIp65504P2165L;
            protected  int beginIp65504P2166S;
            protected  int beginIp65504P2166L;
            protected  int beginIp65504P2167S;
            protected  int beginIp65504P2167L;
            protected  int beginIp65504P2168S;
            protected  int beginIp65504P2168L;
            protected  int beginIp65504P2169S;
            protected  int beginIp65504P2169L;
            protected  int beginIp65504P2170S;
            protected  int beginIp65504P2170L;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup70Serialized
	**/
    public Ip65504PdsNamesLargeGroup70Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup70Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup70Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup70Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,17108); // serialize this field at offset 17108 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup70Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 17108 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup70Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_70_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P2140S = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P2140L = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P2141S = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P2141L = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P2142S = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P2142L = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P2143S = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P2143L = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P2144S = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P2144L = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P2145S = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P2145L = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P2146S = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P2146L = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P2147S = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P2147L = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P2148S = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P2148L = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P2149S = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P2149L = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P2150S = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P2150L = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P2151S = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P2151L = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P2152S = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P2152L = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P2153S = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P2153L = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P2154S = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P2154L = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P2155S = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P2155L = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P2156S = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P2156L = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P2157S = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P2157L = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P2158S = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P2158L = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P2159S = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P2159L = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P2160S = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P2160L = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P2161S = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P2161L = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P2162S = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P2162L = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P2163S = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P2163L = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P2164S = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P2164L = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P2165S = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P2165L = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P2166S = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P2166L = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P2167S = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P2167L = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P2168S = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P2168L = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P2169S = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P2169L = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P2170S = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P2170L = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P2140SCounter = -1;
         public boolean isIp65504P2140SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2140SCounter != sharedCounter;
            localIp65504P2140SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2140_S_LEN = 2;
  	/**
	 * serializeIp65504P2140S
	 */
	protected void serializeIp65504P2140S(short ip65504P2140S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2140S,IP_65504_P_2140_S_LEN)
                  ,beginIp65504P2140S
                  ,IP_65504_P_2140_S_LEN
                 );
            localIp65504P2140SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2140SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2140S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2140S() {	 
			return (getShort(beginIp65504P2140S));
   	}
         int localIp65504P2140LCounter = -1;
         public boolean isIp65504P2140LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2140LCounter != sharedCounter;
            localIp65504P2140LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2140_L_LEN = 2;
  	/**
	 * serializeIp65504P2140L
	 */
	protected void serializeIp65504P2140L(short ip65504P2140L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2140L,IP_65504_P_2140_L_LEN)
                  ,beginIp65504P2140L
                  ,IP_65504_P_2140_L_LEN
                 );
            localIp65504P2140LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2140LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2140L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2140L() {	 
			return (getShort(beginIp65504P2140L));
   	}
         int localIp65504P2141SCounter = -1;
         public boolean isIp65504P2141SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2141SCounter != sharedCounter;
            localIp65504P2141SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2141_S_LEN = 2;
  	/**
	 * serializeIp65504P2141S
	 */
	protected void serializeIp65504P2141S(short ip65504P2141S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2141S,IP_65504_P_2141_S_LEN)
                  ,beginIp65504P2141S
                  ,IP_65504_P_2141_S_LEN
                 );
            localIp65504P2141SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2141SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2141S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2141S() {	 
			return (getShort(beginIp65504P2141S));
   	}
         int localIp65504P2141LCounter = -1;
         public boolean isIp65504P2141LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2141LCounter != sharedCounter;
            localIp65504P2141LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2141_L_LEN = 2;
  	/**
	 * serializeIp65504P2141L
	 */
	protected void serializeIp65504P2141L(short ip65504P2141L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2141L,IP_65504_P_2141_L_LEN)
                  ,beginIp65504P2141L
                  ,IP_65504_P_2141_L_LEN
                 );
            localIp65504P2141LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2141LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2141L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2141L() {	 
			return (getShort(beginIp65504P2141L));
   	}
         int localIp65504P2142SCounter = -1;
         public boolean isIp65504P2142SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2142SCounter != sharedCounter;
            localIp65504P2142SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2142_S_LEN = 2;
  	/**
	 * serializeIp65504P2142S
	 */
	protected void serializeIp65504P2142S(short ip65504P2142S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2142S,IP_65504_P_2142_S_LEN)
                  ,beginIp65504P2142S
                  ,IP_65504_P_2142_S_LEN
                 );
            localIp65504P2142SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2142SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2142S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2142S() {	 
			return (getShort(beginIp65504P2142S));
   	}
         int localIp65504P2142LCounter = -1;
         public boolean isIp65504P2142LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2142LCounter != sharedCounter;
            localIp65504P2142LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2142_L_LEN = 2;
  	/**
	 * serializeIp65504P2142L
	 */
	protected void serializeIp65504P2142L(short ip65504P2142L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2142L,IP_65504_P_2142_L_LEN)
                  ,beginIp65504P2142L
                  ,IP_65504_P_2142_L_LEN
                 );
            localIp65504P2142LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2142LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2142L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2142L() {	 
			return (getShort(beginIp65504P2142L));
   	}
         int localIp65504P2143SCounter = -1;
         public boolean isIp65504P2143SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2143SCounter != sharedCounter;
            localIp65504P2143SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2143_S_LEN = 2;
  	/**
	 * serializeIp65504P2143S
	 */
	protected void serializeIp65504P2143S(short ip65504P2143S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2143S,IP_65504_P_2143_S_LEN)
                  ,beginIp65504P2143S
                  ,IP_65504_P_2143_S_LEN
                 );
            localIp65504P2143SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2143SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2143S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2143S() {	 
			return (getShort(beginIp65504P2143S));
   	}
         int localIp65504P2143LCounter = -1;
         public boolean isIp65504P2143LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2143LCounter != sharedCounter;
            localIp65504P2143LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2143_L_LEN = 2;
  	/**
	 * serializeIp65504P2143L
	 */
	protected void serializeIp65504P2143L(short ip65504P2143L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2143L,IP_65504_P_2143_L_LEN)
                  ,beginIp65504P2143L
                  ,IP_65504_P_2143_L_LEN
                 );
            localIp65504P2143LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2143LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2143L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2143L() {	 
			return (getShort(beginIp65504P2143L));
   	}
         int localIp65504P2144SCounter = -1;
         public boolean isIp65504P2144SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2144SCounter != sharedCounter;
            localIp65504P2144SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2144_S_LEN = 2;
  	/**
	 * serializeIp65504P2144S
	 */
	protected void serializeIp65504P2144S(short ip65504P2144S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2144S,IP_65504_P_2144_S_LEN)
                  ,beginIp65504P2144S
                  ,IP_65504_P_2144_S_LEN
                 );
            localIp65504P2144SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2144SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2144S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2144S() {	 
			return (getShort(beginIp65504P2144S));
   	}
         int localIp65504P2144LCounter = -1;
         public boolean isIp65504P2144LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2144LCounter != sharedCounter;
            localIp65504P2144LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2144_L_LEN = 2;
  	/**
	 * serializeIp65504P2144L
	 */
	protected void serializeIp65504P2144L(short ip65504P2144L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2144L,IP_65504_P_2144_L_LEN)
                  ,beginIp65504P2144L
                  ,IP_65504_P_2144_L_LEN
                 );
            localIp65504P2144LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2144LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2144L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2144L() {	 
			return (getShort(beginIp65504P2144L));
   	}
         int localIp65504P2145SCounter = -1;
         public boolean isIp65504P2145SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2145SCounter != sharedCounter;
            localIp65504P2145SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2145_S_LEN = 2;
  	/**
	 * serializeIp65504P2145S
	 */
	protected void serializeIp65504P2145S(short ip65504P2145S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2145S,IP_65504_P_2145_S_LEN)
                  ,beginIp65504P2145S
                  ,IP_65504_P_2145_S_LEN
                 );
            localIp65504P2145SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2145SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2145S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2145S() {	 
			return (getShort(beginIp65504P2145S));
   	}
         int localIp65504P2145LCounter = -1;
         public boolean isIp65504P2145LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2145LCounter != sharedCounter;
            localIp65504P2145LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2145_L_LEN = 2;
  	/**
	 * serializeIp65504P2145L
	 */
	protected void serializeIp65504P2145L(short ip65504P2145L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2145L,IP_65504_P_2145_L_LEN)
                  ,beginIp65504P2145L
                  ,IP_65504_P_2145_L_LEN
                 );
            localIp65504P2145LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2145LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2145L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2145L() {	 
			return (getShort(beginIp65504P2145L));
   	}
         int localIp65504P2146SCounter = -1;
         public boolean isIp65504P2146SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2146SCounter != sharedCounter;
            localIp65504P2146SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2146_S_LEN = 2;
  	/**
	 * serializeIp65504P2146S
	 */
	protected void serializeIp65504P2146S(short ip65504P2146S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2146S,IP_65504_P_2146_S_LEN)
                  ,beginIp65504P2146S
                  ,IP_65504_P_2146_S_LEN
                 );
            localIp65504P2146SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2146SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2146S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2146S() {	 
			return (getShort(beginIp65504P2146S));
   	}
         int localIp65504P2146LCounter = -1;
         public boolean isIp65504P2146LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2146LCounter != sharedCounter;
            localIp65504P2146LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2146_L_LEN = 2;
  	/**
	 * serializeIp65504P2146L
	 */
	protected void serializeIp65504P2146L(short ip65504P2146L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2146L,IP_65504_P_2146_L_LEN)
                  ,beginIp65504P2146L
                  ,IP_65504_P_2146_L_LEN
                 );
            localIp65504P2146LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2146LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2146L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2146L() {	 
			return (getShort(beginIp65504P2146L));
   	}
         int localIp65504P2147SCounter = -1;
         public boolean isIp65504P2147SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2147SCounter != sharedCounter;
            localIp65504P2147SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2147_S_LEN = 2;
  	/**
	 * serializeIp65504P2147S
	 */
	protected void serializeIp65504P2147S(short ip65504P2147S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2147S,IP_65504_P_2147_S_LEN)
                  ,beginIp65504P2147S
                  ,IP_65504_P_2147_S_LEN
                 );
            localIp65504P2147SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2147SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2147S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2147S() {	 
			return (getShort(beginIp65504P2147S));
   	}
         int localIp65504P2147LCounter = -1;
         public boolean isIp65504P2147LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2147LCounter != sharedCounter;
            localIp65504P2147LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2147_L_LEN = 2;
  	/**
	 * serializeIp65504P2147L
	 */
	protected void serializeIp65504P2147L(short ip65504P2147L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2147L,IP_65504_P_2147_L_LEN)
                  ,beginIp65504P2147L
                  ,IP_65504_P_2147_L_LEN
                 );
            localIp65504P2147LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2147LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2147L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2147L() {	 
			return (getShort(beginIp65504P2147L));
   	}
         int localIp65504P2148SCounter = -1;
         public boolean isIp65504P2148SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2148SCounter != sharedCounter;
            localIp65504P2148SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2148_S_LEN = 2;
  	/**
	 * serializeIp65504P2148S
	 */
	protected void serializeIp65504P2148S(short ip65504P2148S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2148S,IP_65504_P_2148_S_LEN)
                  ,beginIp65504P2148S
                  ,IP_65504_P_2148_S_LEN
                 );
            localIp65504P2148SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2148SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2148S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2148S() {	 
			return (getShort(beginIp65504P2148S));
   	}
         int localIp65504P2148LCounter = -1;
         public boolean isIp65504P2148LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2148LCounter != sharedCounter;
            localIp65504P2148LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2148_L_LEN = 2;
  	/**
	 * serializeIp65504P2148L
	 */
	protected void serializeIp65504P2148L(short ip65504P2148L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2148L,IP_65504_P_2148_L_LEN)
                  ,beginIp65504P2148L
                  ,IP_65504_P_2148_L_LEN
                 );
            localIp65504P2148LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2148LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2148L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2148L() {	 
			return (getShort(beginIp65504P2148L));
   	}
         int localIp65504P2149SCounter = -1;
         public boolean isIp65504P2149SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2149SCounter != sharedCounter;
            localIp65504P2149SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2149_S_LEN = 2;
  	/**
	 * serializeIp65504P2149S
	 */
	protected void serializeIp65504P2149S(short ip65504P2149S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2149S,IP_65504_P_2149_S_LEN)
                  ,beginIp65504P2149S
                  ,IP_65504_P_2149_S_LEN
                 );
            localIp65504P2149SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2149SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2149S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2149S() {	 
			return (getShort(beginIp65504P2149S));
   	}
         int localIp65504P2149LCounter = -1;
         public boolean isIp65504P2149LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2149LCounter != sharedCounter;
            localIp65504P2149LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2149_L_LEN = 2;
  	/**
	 * serializeIp65504P2149L
	 */
	protected void serializeIp65504P2149L(short ip65504P2149L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2149L,IP_65504_P_2149_L_LEN)
                  ,beginIp65504P2149L
                  ,IP_65504_P_2149_L_LEN
                 );
            localIp65504P2149LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2149LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2149L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2149L() {	 
			return (getShort(beginIp65504P2149L));
   	}
         int localIp65504P2150SCounter = -1;
         public boolean isIp65504P2150SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2150SCounter != sharedCounter;
            localIp65504P2150SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2150_S_LEN = 2;
  	/**
	 * serializeIp65504P2150S
	 */
	protected void serializeIp65504P2150S(short ip65504P2150S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2150S,IP_65504_P_2150_S_LEN)
                  ,beginIp65504P2150S
                  ,IP_65504_P_2150_S_LEN
                 );
            localIp65504P2150SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2150SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2150S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2150S() {	 
			return (getShort(beginIp65504P2150S));
   	}
         int localIp65504P2150LCounter = -1;
         public boolean isIp65504P2150LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2150LCounter != sharedCounter;
            localIp65504P2150LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2150_L_LEN = 2;
  	/**
	 * serializeIp65504P2150L
	 */
	protected void serializeIp65504P2150L(short ip65504P2150L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2150L,IP_65504_P_2150_L_LEN)
                  ,beginIp65504P2150L
                  ,IP_65504_P_2150_L_LEN
                 );
            localIp65504P2150LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2150LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2150L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2150L() {	 
			return (getShort(beginIp65504P2150L));
   	}
         int localIp65504P2151SCounter = -1;
         public boolean isIp65504P2151SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2151SCounter != sharedCounter;
            localIp65504P2151SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2151_S_LEN = 2;
  	/**
	 * serializeIp65504P2151S
	 */
	protected void serializeIp65504P2151S(short ip65504P2151S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2151S,IP_65504_P_2151_S_LEN)
                  ,beginIp65504P2151S
                  ,IP_65504_P_2151_S_LEN
                 );
            localIp65504P2151SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2151SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2151S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2151S() {	 
			return (getShort(beginIp65504P2151S));
   	}
         int localIp65504P2151LCounter = -1;
         public boolean isIp65504P2151LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2151LCounter != sharedCounter;
            localIp65504P2151LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2151_L_LEN = 2;
  	/**
	 * serializeIp65504P2151L
	 */
	protected void serializeIp65504P2151L(short ip65504P2151L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2151L,IP_65504_P_2151_L_LEN)
                  ,beginIp65504P2151L
                  ,IP_65504_P_2151_L_LEN
                 );
            localIp65504P2151LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2151LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2151L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2151L() {	 
			return (getShort(beginIp65504P2151L));
   	}
         int localIp65504P2152SCounter = -1;
         public boolean isIp65504P2152SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2152SCounter != sharedCounter;
            localIp65504P2152SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2152_S_LEN = 2;
  	/**
	 * serializeIp65504P2152S
	 */
	protected void serializeIp65504P2152S(short ip65504P2152S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2152S,IP_65504_P_2152_S_LEN)
                  ,beginIp65504P2152S
                  ,IP_65504_P_2152_S_LEN
                 );
            localIp65504P2152SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2152SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2152S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2152S() {	 
			return (getShort(beginIp65504P2152S));
   	}
         int localIp65504P2152LCounter = -1;
         public boolean isIp65504P2152LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2152LCounter != sharedCounter;
            localIp65504P2152LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2152_L_LEN = 2;
  	/**
	 * serializeIp65504P2152L
	 */
	protected void serializeIp65504P2152L(short ip65504P2152L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2152L,IP_65504_P_2152_L_LEN)
                  ,beginIp65504P2152L
                  ,IP_65504_P_2152_L_LEN
                 );
            localIp65504P2152LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2152LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2152L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2152L() {	 
			return (getShort(beginIp65504P2152L));
   	}
         int localIp65504P2153SCounter = -1;
         public boolean isIp65504P2153SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2153SCounter != sharedCounter;
            localIp65504P2153SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2153_S_LEN = 2;
  	/**
	 * serializeIp65504P2153S
	 */
	protected void serializeIp65504P2153S(short ip65504P2153S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2153S,IP_65504_P_2153_S_LEN)
                  ,beginIp65504P2153S
                  ,IP_65504_P_2153_S_LEN
                 );
            localIp65504P2153SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2153SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2153S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2153S() {	 
			return (getShort(beginIp65504P2153S));
   	}
         int localIp65504P2153LCounter = -1;
         public boolean isIp65504P2153LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2153LCounter != sharedCounter;
            localIp65504P2153LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2153_L_LEN = 2;
  	/**
	 * serializeIp65504P2153L
	 */
	protected void serializeIp65504P2153L(short ip65504P2153L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2153L,IP_65504_P_2153_L_LEN)
                  ,beginIp65504P2153L
                  ,IP_65504_P_2153_L_LEN
                 );
            localIp65504P2153LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2153LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2153L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2153L() {	 
			return (getShort(beginIp65504P2153L));
   	}
         int localIp65504P2154SCounter = -1;
         public boolean isIp65504P2154SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2154SCounter != sharedCounter;
            localIp65504P2154SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2154_S_LEN = 2;
  	/**
	 * serializeIp65504P2154S
	 */
	protected void serializeIp65504P2154S(short ip65504P2154S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2154S,IP_65504_P_2154_S_LEN)
                  ,beginIp65504P2154S
                  ,IP_65504_P_2154_S_LEN
                 );
            localIp65504P2154SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2154SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2154S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2154S() {	 
			return (getShort(beginIp65504P2154S));
   	}
         int localIp65504P2154LCounter = -1;
         public boolean isIp65504P2154LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2154LCounter != sharedCounter;
            localIp65504P2154LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2154_L_LEN = 2;
  	/**
	 * serializeIp65504P2154L
	 */
	protected void serializeIp65504P2154L(short ip65504P2154L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2154L,IP_65504_P_2154_L_LEN)
                  ,beginIp65504P2154L
                  ,IP_65504_P_2154_L_LEN
                 );
            localIp65504P2154LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2154LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2154L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2154L() {	 
			return (getShort(beginIp65504P2154L));
   	}
         int localIp65504P2155SCounter = -1;
         public boolean isIp65504P2155SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2155SCounter != sharedCounter;
            localIp65504P2155SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2155_S_LEN = 2;
  	/**
	 * serializeIp65504P2155S
	 */
	protected void serializeIp65504P2155S(short ip65504P2155S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2155S,IP_65504_P_2155_S_LEN)
                  ,beginIp65504P2155S
                  ,IP_65504_P_2155_S_LEN
                 );
            localIp65504P2155SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2155SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2155S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2155S() {	 
			return (getShort(beginIp65504P2155S));
   	}
         int localIp65504P2155LCounter = -1;
         public boolean isIp65504P2155LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2155LCounter != sharedCounter;
            localIp65504P2155LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2155_L_LEN = 2;
  	/**
	 * serializeIp65504P2155L
	 */
	protected void serializeIp65504P2155L(short ip65504P2155L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2155L,IP_65504_P_2155_L_LEN)
                  ,beginIp65504P2155L
                  ,IP_65504_P_2155_L_LEN
                 );
            localIp65504P2155LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2155LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2155L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2155L() {	 
			return (getShort(beginIp65504P2155L));
   	}
         int localIp65504P2156SCounter = -1;
         public boolean isIp65504P2156SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2156SCounter != sharedCounter;
            localIp65504P2156SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2156_S_LEN = 2;
  	/**
	 * serializeIp65504P2156S
	 */
	protected void serializeIp65504P2156S(short ip65504P2156S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2156S,IP_65504_P_2156_S_LEN)
                  ,beginIp65504P2156S
                  ,IP_65504_P_2156_S_LEN
                 );
            localIp65504P2156SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2156SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2156S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2156S() {	 
			return (getShort(beginIp65504P2156S));
   	}
         int localIp65504P2156LCounter = -1;
         public boolean isIp65504P2156LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2156LCounter != sharedCounter;
            localIp65504P2156LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2156_L_LEN = 2;
  	/**
	 * serializeIp65504P2156L
	 */
	protected void serializeIp65504P2156L(short ip65504P2156L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2156L,IP_65504_P_2156_L_LEN)
                  ,beginIp65504P2156L
                  ,IP_65504_P_2156_L_LEN
                 );
            localIp65504P2156LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2156LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2156L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2156L() {	 
			return (getShort(beginIp65504P2156L));
   	}
         int localIp65504P2157SCounter = -1;
         public boolean isIp65504P2157SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2157SCounter != sharedCounter;
            localIp65504P2157SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2157_S_LEN = 2;
  	/**
	 * serializeIp65504P2157S
	 */
	protected void serializeIp65504P2157S(short ip65504P2157S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2157S,IP_65504_P_2157_S_LEN)
                  ,beginIp65504P2157S
                  ,IP_65504_P_2157_S_LEN
                 );
            localIp65504P2157SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2157SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2157S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2157S() {	 
			return (getShort(beginIp65504P2157S));
   	}
         int localIp65504P2157LCounter = -1;
         public boolean isIp65504P2157LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2157LCounter != sharedCounter;
            localIp65504P2157LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2157_L_LEN = 2;
  	/**
	 * serializeIp65504P2157L
	 */
	protected void serializeIp65504P2157L(short ip65504P2157L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2157L,IP_65504_P_2157_L_LEN)
                  ,beginIp65504P2157L
                  ,IP_65504_P_2157_L_LEN
                 );
            localIp65504P2157LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2157LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2157L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2157L() {	 
			return (getShort(beginIp65504P2157L));
   	}
         int localIp65504P2158SCounter = -1;
         public boolean isIp65504P2158SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2158SCounter != sharedCounter;
            localIp65504P2158SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2158_S_LEN = 2;
  	/**
	 * serializeIp65504P2158S
	 */
	protected void serializeIp65504P2158S(short ip65504P2158S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2158S,IP_65504_P_2158_S_LEN)
                  ,beginIp65504P2158S
                  ,IP_65504_P_2158_S_LEN
                 );
            localIp65504P2158SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2158SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2158S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2158S() {	 
			return (getShort(beginIp65504P2158S));
   	}
         int localIp65504P2158LCounter = -1;
         public boolean isIp65504P2158LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2158LCounter != sharedCounter;
            localIp65504P2158LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2158_L_LEN = 2;
  	/**
	 * serializeIp65504P2158L
	 */
	protected void serializeIp65504P2158L(short ip65504P2158L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2158L,IP_65504_P_2158_L_LEN)
                  ,beginIp65504P2158L
                  ,IP_65504_P_2158_L_LEN
                 );
            localIp65504P2158LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2158LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2158L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2158L() {	 
			return (getShort(beginIp65504P2158L));
   	}
         int localIp65504P2159SCounter = -1;
         public boolean isIp65504P2159SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2159SCounter != sharedCounter;
            localIp65504P2159SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2159_S_LEN = 2;
  	/**
	 * serializeIp65504P2159S
	 */
	protected void serializeIp65504P2159S(short ip65504P2159S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2159S,IP_65504_P_2159_S_LEN)
                  ,beginIp65504P2159S
                  ,IP_65504_P_2159_S_LEN
                 );
            localIp65504P2159SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2159SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2159S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2159S() {	 
			return (getShort(beginIp65504P2159S));
   	}
         int localIp65504P2159LCounter = -1;
         public boolean isIp65504P2159LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2159LCounter != sharedCounter;
            localIp65504P2159LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2159_L_LEN = 2;
  	/**
	 * serializeIp65504P2159L
	 */
	protected void serializeIp65504P2159L(short ip65504P2159L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2159L,IP_65504_P_2159_L_LEN)
                  ,beginIp65504P2159L
                  ,IP_65504_P_2159_L_LEN
                 );
            localIp65504P2159LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2159LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2159L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2159L() {	 
			return (getShort(beginIp65504P2159L));
   	}
         int localIp65504P2160SCounter = -1;
         public boolean isIp65504P2160SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2160SCounter != sharedCounter;
            localIp65504P2160SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2160_S_LEN = 2;
  	/**
	 * serializeIp65504P2160S
	 */
	protected void serializeIp65504P2160S(short ip65504P2160S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2160S,IP_65504_P_2160_S_LEN)
                  ,beginIp65504P2160S
                  ,IP_65504_P_2160_S_LEN
                 );
            localIp65504P2160SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2160SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2160S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2160S() {	 
			return (getShort(beginIp65504P2160S));
   	}
         int localIp65504P2160LCounter = -1;
         public boolean isIp65504P2160LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2160LCounter != sharedCounter;
            localIp65504P2160LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2160_L_LEN = 2;
  	/**
	 * serializeIp65504P2160L
	 */
	protected void serializeIp65504P2160L(short ip65504P2160L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2160L,IP_65504_P_2160_L_LEN)
                  ,beginIp65504P2160L
                  ,IP_65504_P_2160_L_LEN
                 );
            localIp65504P2160LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2160LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2160L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2160L() {	 
			return (getShort(beginIp65504P2160L));
   	}
         int localIp65504P2161SCounter = -1;
         public boolean isIp65504P2161SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2161SCounter != sharedCounter;
            localIp65504P2161SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2161_S_LEN = 2;
  	/**
	 * serializeIp65504P2161S
	 */
	protected void serializeIp65504P2161S(short ip65504P2161S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2161S,IP_65504_P_2161_S_LEN)
                  ,beginIp65504P2161S
                  ,IP_65504_P_2161_S_LEN
                 );
            localIp65504P2161SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2161SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2161S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2161S() {	 
			return (getShort(beginIp65504P2161S));
   	}
         int localIp65504P2161LCounter = -1;
         public boolean isIp65504P2161LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2161LCounter != sharedCounter;
            localIp65504P2161LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2161_L_LEN = 2;
  	/**
	 * serializeIp65504P2161L
	 */
	protected void serializeIp65504P2161L(short ip65504P2161L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2161L,IP_65504_P_2161_L_LEN)
                  ,beginIp65504P2161L
                  ,IP_65504_P_2161_L_LEN
                 );
            localIp65504P2161LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2161LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2161L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2161L() {	 
			return (getShort(beginIp65504P2161L));
   	}
         int localIp65504P2162SCounter = -1;
         public boolean isIp65504P2162SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2162SCounter != sharedCounter;
            localIp65504P2162SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2162_S_LEN = 2;
  	/**
	 * serializeIp65504P2162S
	 */
	protected void serializeIp65504P2162S(short ip65504P2162S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2162S,IP_65504_P_2162_S_LEN)
                  ,beginIp65504P2162S
                  ,IP_65504_P_2162_S_LEN
                 );
            localIp65504P2162SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2162SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2162S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2162S() {	 
			return (getShort(beginIp65504P2162S));
   	}
         int localIp65504P2162LCounter = -1;
         public boolean isIp65504P2162LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2162LCounter != sharedCounter;
            localIp65504P2162LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2162_L_LEN = 2;
  	/**
	 * serializeIp65504P2162L
	 */
	protected void serializeIp65504P2162L(short ip65504P2162L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2162L,IP_65504_P_2162_L_LEN)
                  ,beginIp65504P2162L
                  ,IP_65504_P_2162_L_LEN
                 );
            localIp65504P2162LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2162LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2162L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2162L() {	 
			return (getShort(beginIp65504P2162L));
   	}
         int localIp65504P2163SCounter = -1;
         public boolean isIp65504P2163SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2163SCounter != sharedCounter;
            localIp65504P2163SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2163_S_LEN = 2;
  	/**
	 * serializeIp65504P2163S
	 */
	protected void serializeIp65504P2163S(short ip65504P2163S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2163S,IP_65504_P_2163_S_LEN)
                  ,beginIp65504P2163S
                  ,IP_65504_P_2163_S_LEN
                 );
            localIp65504P2163SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2163SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2163S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2163S() {	 
			return (getShort(beginIp65504P2163S));
   	}
         int localIp65504P2163LCounter = -1;
         public boolean isIp65504P2163LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2163LCounter != sharedCounter;
            localIp65504P2163LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2163_L_LEN = 2;
  	/**
	 * serializeIp65504P2163L
	 */
	protected void serializeIp65504P2163L(short ip65504P2163L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2163L,IP_65504_P_2163_L_LEN)
                  ,beginIp65504P2163L
                  ,IP_65504_P_2163_L_LEN
                 );
            localIp65504P2163LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2163LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2163L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2163L() {	 
			return (getShort(beginIp65504P2163L));
   	}
         int localIp65504P2164SCounter = -1;
         public boolean isIp65504P2164SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2164SCounter != sharedCounter;
            localIp65504P2164SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2164_S_LEN = 2;
  	/**
	 * serializeIp65504P2164S
	 */
	protected void serializeIp65504P2164S(short ip65504P2164S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2164S,IP_65504_P_2164_S_LEN)
                  ,beginIp65504P2164S
                  ,IP_65504_P_2164_S_LEN
                 );
            localIp65504P2164SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2164SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2164S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2164S() {	 
			return (getShort(beginIp65504P2164S));
   	}
         int localIp65504P2164LCounter = -1;
         public boolean isIp65504P2164LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2164LCounter != sharedCounter;
            localIp65504P2164LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2164_L_LEN = 2;
  	/**
	 * serializeIp65504P2164L
	 */
	protected void serializeIp65504P2164L(short ip65504P2164L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2164L,IP_65504_P_2164_L_LEN)
                  ,beginIp65504P2164L
                  ,IP_65504_P_2164_L_LEN
                 );
            localIp65504P2164LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2164LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2164L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2164L() {	 
			return (getShort(beginIp65504P2164L));
   	}
         int localIp65504P2165SCounter = -1;
         public boolean isIp65504P2165SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2165SCounter != sharedCounter;
            localIp65504P2165SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2165_S_LEN = 2;
  	/**
	 * serializeIp65504P2165S
	 */
	protected void serializeIp65504P2165S(short ip65504P2165S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2165S,IP_65504_P_2165_S_LEN)
                  ,beginIp65504P2165S
                  ,IP_65504_P_2165_S_LEN
                 );
            localIp65504P2165SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2165SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2165S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2165S() {	 
			return (getShort(beginIp65504P2165S));
   	}
         int localIp65504P2165LCounter = -1;
         public boolean isIp65504P2165LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2165LCounter != sharedCounter;
            localIp65504P2165LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2165_L_LEN = 2;
  	/**
	 * serializeIp65504P2165L
	 */
	protected void serializeIp65504P2165L(short ip65504P2165L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2165L,IP_65504_P_2165_L_LEN)
                  ,beginIp65504P2165L
                  ,IP_65504_P_2165_L_LEN
                 );
            localIp65504P2165LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2165LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2165L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2165L() {	 
			return (getShort(beginIp65504P2165L));
   	}
         int localIp65504P2166SCounter = -1;
         public boolean isIp65504P2166SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2166SCounter != sharedCounter;
            localIp65504P2166SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2166_S_LEN = 2;
  	/**
	 * serializeIp65504P2166S
	 */
	protected void serializeIp65504P2166S(short ip65504P2166S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2166S,IP_65504_P_2166_S_LEN)
                  ,beginIp65504P2166S
                  ,IP_65504_P_2166_S_LEN
                 );
            localIp65504P2166SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2166SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2166S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2166S() {	 
			return (getShort(beginIp65504P2166S));
   	}
         int localIp65504P2166LCounter = -1;
         public boolean isIp65504P2166LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2166LCounter != sharedCounter;
            localIp65504P2166LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2166_L_LEN = 2;
  	/**
	 * serializeIp65504P2166L
	 */
	protected void serializeIp65504P2166L(short ip65504P2166L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2166L,IP_65504_P_2166_L_LEN)
                  ,beginIp65504P2166L
                  ,IP_65504_P_2166_L_LEN
                 );
            localIp65504P2166LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2166LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2166L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2166L() {	 
			return (getShort(beginIp65504P2166L));
   	}
         int localIp65504P2167SCounter = -1;
         public boolean isIp65504P2167SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2167SCounter != sharedCounter;
            localIp65504P2167SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2167_S_LEN = 2;
  	/**
	 * serializeIp65504P2167S
	 */
	protected void serializeIp65504P2167S(short ip65504P2167S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2167S,IP_65504_P_2167_S_LEN)
                  ,beginIp65504P2167S
                  ,IP_65504_P_2167_S_LEN
                 );
            localIp65504P2167SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2167SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2167S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2167S() {	 
			return (getShort(beginIp65504P2167S));
   	}
         int localIp65504P2167LCounter = -1;
         public boolean isIp65504P2167LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2167LCounter != sharedCounter;
            localIp65504P2167LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2167_L_LEN = 2;
  	/**
	 * serializeIp65504P2167L
	 */
	protected void serializeIp65504P2167L(short ip65504P2167L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2167L,IP_65504_P_2167_L_LEN)
                  ,beginIp65504P2167L
                  ,IP_65504_P_2167_L_LEN
                 );
            localIp65504P2167LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2167LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2167L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2167L() {	 
			return (getShort(beginIp65504P2167L));
   	}
         int localIp65504P2168SCounter = -1;
         public boolean isIp65504P2168SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2168SCounter != sharedCounter;
            localIp65504P2168SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2168_S_LEN = 2;
  	/**
	 * serializeIp65504P2168S
	 */
	protected void serializeIp65504P2168S(short ip65504P2168S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2168S,IP_65504_P_2168_S_LEN)
                  ,beginIp65504P2168S
                  ,IP_65504_P_2168_S_LEN
                 );
            localIp65504P2168SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2168SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2168S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2168S() {	 
			return (getShort(beginIp65504P2168S));
   	}
         int localIp65504P2168LCounter = -1;
         public boolean isIp65504P2168LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2168LCounter != sharedCounter;
            localIp65504P2168LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2168_L_LEN = 2;
  	/**
	 * serializeIp65504P2168L
	 */
	protected void serializeIp65504P2168L(short ip65504P2168L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2168L,IP_65504_P_2168_L_LEN)
                  ,beginIp65504P2168L
                  ,IP_65504_P_2168_L_LEN
                 );
            localIp65504P2168LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2168LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2168L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2168L() {	 
			return (getShort(beginIp65504P2168L));
   	}
         int localIp65504P2169SCounter = -1;
         public boolean isIp65504P2169SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2169SCounter != sharedCounter;
            localIp65504P2169SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2169_S_LEN = 2;
  	/**
	 * serializeIp65504P2169S
	 */
	protected void serializeIp65504P2169S(short ip65504P2169S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2169S,IP_65504_P_2169_S_LEN)
                  ,beginIp65504P2169S
                  ,IP_65504_P_2169_S_LEN
                 );
            localIp65504P2169SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2169SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2169S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2169S() {	 
			return (getShort(beginIp65504P2169S));
   	}
         int localIp65504P2169LCounter = -1;
         public boolean isIp65504P2169LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2169LCounter != sharedCounter;
            localIp65504P2169LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2169_L_LEN = 2;
  	/**
	 * serializeIp65504P2169L
	 */
	protected void serializeIp65504P2169L(short ip65504P2169L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2169L,IP_65504_P_2169_L_LEN)
                  ,beginIp65504P2169L
                  ,IP_65504_P_2169_L_LEN
                 );
            localIp65504P2169LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2169LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2169L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2169L() {	 
			return (getShort(beginIp65504P2169L));
   	}
         int localIp65504P2170SCounter = -1;
         public boolean isIp65504P2170SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2170SCounter != sharedCounter;
            localIp65504P2170SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2170_S_LEN = 2;
  	/**
	 * serializeIp65504P2170S
	 */
	protected void serializeIp65504P2170S(short ip65504P2170S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2170S,IP_65504_P_2170_S_LEN)
                  ,beginIp65504P2170S
                  ,IP_65504_P_2170_S_LEN
                 );
            localIp65504P2170SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2170SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2170S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2170S() {	 
			return (getShort(beginIp65504P2170S));
   	}
         int localIp65504P2170LCounter = -1;
         public boolean isIp65504P2170LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2170LCounter != sharedCounter;
            localIp65504P2170LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2170_L_LEN = 2;
  	/**
	 * serializeIp65504P2170L
	 */
	protected void serializeIp65504P2170L(short ip65504P2170L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2170L,IP_65504_P_2170_L_LEN)
                  ,beginIp65504P2170L
                  ,IP_65504_P_2170_L_LEN
                 );
            localIp65504P2170LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2170LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2170L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2170L() {	 
			return (getShort(beginIp65504P2170L));
   	}




}
  
