package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup71Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:32. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup71Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup71Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_71_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P2171S;
            protected  int beginIp65504P2171L;
            protected  int beginIp65504P2172S;
            protected  int beginIp65504P2172L;
            protected  int beginIp65504P2173S;
            protected  int beginIp65504P2173L;
            protected  int beginIp65504P2174S;
            protected  int beginIp65504P2174L;
            protected  int beginIp65504P2175S;
            protected  int beginIp65504P2175L;
            protected  int beginIp65504P2176S;
            protected  int beginIp65504P2176L;
            protected  int beginIp65504P2177S;
            protected  int beginIp65504P2177L;
            protected  int beginIp65504P2178S;
            protected  int beginIp65504P2178L;
            protected  int beginIp65504P2179S;
            protected  int beginIp65504P2179L;
            protected  int beginIp65504P2180S;
            protected  int beginIp65504P2180L;
            protected  int beginIp65504P2181S;
            protected  int beginIp65504P2181L;
            protected  int beginIp65504P2182S;
            protected  int beginIp65504P2182L;
            protected  int beginIp65504P2183S;
            protected  int beginIp65504P2183L;
            protected  int beginIp65504P2184S;
            protected  int beginIp65504P2184L;
            protected  int beginIp65504P2185S;
            protected  int beginIp65504P2185L;
            protected  int beginIp65504P2186S;
            protected  int beginIp65504P2186L;
            protected  int beginIp65504P2187S;
            protected  int beginIp65504P2187L;
            protected  int beginIp65504P2188S;
            protected  int beginIp65504P2188L;
            protected  int beginIp65504P2189S;
            protected  int beginIp65504P2189L;
            protected  int beginIp65504P2190S;
            protected  int beginIp65504P2190L;
            protected  int beginIp65504P2191S;
            protected  int beginIp65504P2191L;
            protected  int beginIp65504P2192S;
            protected  int beginIp65504P2192L;
            protected  int beginIp65504P2193S;
            protected  int beginIp65504P2193L;
            protected  int beginIp65504P2194S;
            protected  int beginIp65504P2194L;
            protected  int beginIp65504P2195S;
            protected  int beginIp65504P2195L;
            protected  int beginIp65504P2196S;
            protected  int beginIp65504P2196L;
            protected  int beginIp65504P2197S;
            protected  int beginIp65504P2197L;
            protected  int beginIp65504P2198S;
            protected  int beginIp65504P2198L;
            protected  int beginIp65504P2199S;
            protected  int beginIp65504P2199L;
            protected  int beginIp65504P2200S;
            protected  int beginIp65504P2200L;
            protected  int beginIp65504P2201S;
            protected  int beginIp65504P2201L;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup71Serialized
	**/
    public Ip65504PdsNamesLargeGroup71Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup71Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup71Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup71Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,17356); // serialize this field at offset 17356 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup71Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 17356 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup71Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_71_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P2171S = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P2171L = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P2172S = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P2172L = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P2173S = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P2173L = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P2174S = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P2174L = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P2175S = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P2175L = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P2176S = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P2176L = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P2177S = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P2177L = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P2178S = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P2178L = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P2179S = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P2179L = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P2180S = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P2180L = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P2181S = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P2181L = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P2182S = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P2182L = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P2183S = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P2183L = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P2184S = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P2184L = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P2185S = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P2185L = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P2186S = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P2186L = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P2187S = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P2187L = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P2188S = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P2188L = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P2189S = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P2189L = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P2190S = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P2190L = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P2191S = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P2191L = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P2192S = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P2192L = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P2193S = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P2193L = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P2194S = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P2194L = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P2195S = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P2195L = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P2196S = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P2196L = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P2197S = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P2197L = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P2198S = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P2198L = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P2199S = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P2199L = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P2200S = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P2200L = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P2201S = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P2201L = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P2171SCounter = -1;
         public boolean isIp65504P2171SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2171SCounter != sharedCounter;
            localIp65504P2171SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2171_S_LEN = 2;
  	/**
	 * serializeIp65504P2171S
	 */
	protected void serializeIp65504P2171S(short ip65504P2171S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2171S,IP_65504_P_2171_S_LEN)
                  ,beginIp65504P2171S
                  ,IP_65504_P_2171_S_LEN
                 );
            localIp65504P2171SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2171SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2171S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2171S() {	 
			return (getShort(beginIp65504P2171S));
   	}
         int localIp65504P2171LCounter = -1;
         public boolean isIp65504P2171LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2171LCounter != sharedCounter;
            localIp65504P2171LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2171_L_LEN = 2;
  	/**
	 * serializeIp65504P2171L
	 */
	protected void serializeIp65504P2171L(short ip65504P2171L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2171L,IP_65504_P_2171_L_LEN)
                  ,beginIp65504P2171L
                  ,IP_65504_P_2171_L_LEN
                 );
            localIp65504P2171LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2171LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2171L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2171L() {	 
			return (getShort(beginIp65504P2171L));
   	}
         int localIp65504P2172SCounter = -1;
         public boolean isIp65504P2172SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2172SCounter != sharedCounter;
            localIp65504P2172SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2172_S_LEN = 2;
  	/**
	 * serializeIp65504P2172S
	 */
	protected void serializeIp65504P2172S(short ip65504P2172S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2172S,IP_65504_P_2172_S_LEN)
                  ,beginIp65504P2172S
                  ,IP_65504_P_2172_S_LEN
                 );
            localIp65504P2172SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2172SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2172S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2172S() {	 
			return (getShort(beginIp65504P2172S));
   	}
         int localIp65504P2172LCounter = -1;
         public boolean isIp65504P2172LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2172LCounter != sharedCounter;
            localIp65504P2172LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2172_L_LEN = 2;
  	/**
	 * serializeIp65504P2172L
	 */
	protected void serializeIp65504P2172L(short ip65504P2172L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2172L,IP_65504_P_2172_L_LEN)
                  ,beginIp65504P2172L
                  ,IP_65504_P_2172_L_LEN
                 );
            localIp65504P2172LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2172LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2172L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2172L() {	 
			return (getShort(beginIp65504P2172L));
   	}
         int localIp65504P2173SCounter = -1;
         public boolean isIp65504P2173SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2173SCounter != sharedCounter;
            localIp65504P2173SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2173_S_LEN = 2;
  	/**
	 * serializeIp65504P2173S
	 */
	protected void serializeIp65504P2173S(short ip65504P2173S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2173S,IP_65504_P_2173_S_LEN)
                  ,beginIp65504P2173S
                  ,IP_65504_P_2173_S_LEN
                 );
            localIp65504P2173SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2173SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2173S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2173S() {	 
			return (getShort(beginIp65504P2173S));
   	}
         int localIp65504P2173LCounter = -1;
         public boolean isIp65504P2173LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2173LCounter != sharedCounter;
            localIp65504P2173LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2173_L_LEN = 2;
  	/**
	 * serializeIp65504P2173L
	 */
	protected void serializeIp65504P2173L(short ip65504P2173L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2173L,IP_65504_P_2173_L_LEN)
                  ,beginIp65504P2173L
                  ,IP_65504_P_2173_L_LEN
                 );
            localIp65504P2173LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2173LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2173L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2173L() {	 
			return (getShort(beginIp65504P2173L));
   	}
         int localIp65504P2174SCounter = -1;
         public boolean isIp65504P2174SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2174SCounter != sharedCounter;
            localIp65504P2174SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2174_S_LEN = 2;
  	/**
	 * serializeIp65504P2174S
	 */
	protected void serializeIp65504P2174S(short ip65504P2174S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2174S,IP_65504_P_2174_S_LEN)
                  ,beginIp65504P2174S
                  ,IP_65504_P_2174_S_LEN
                 );
            localIp65504P2174SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2174SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2174S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2174S() {	 
			return (getShort(beginIp65504P2174S));
   	}
         int localIp65504P2174LCounter = -1;
         public boolean isIp65504P2174LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2174LCounter != sharedCounter;
            localIp65504P2174LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2174_L_LEN = 2;
  	/**
	 * serializeIp65504P2174L
	 */
	protected void serializeIp65504P2174L(short ip65504P2174L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2174L,IP_65504_P_2174_L_LEN)
                  ,beginIp65504P2174L
                  ,IP_65504_P_2174_L_LEN
                 );
            localIp65504P2174LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2174LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2174L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2174L() {	 
			return (getShort(beginIp65504P2174L));
   	}
         int localIp65504P2175SCounter = -1;
         public boolean isIp65504P2175SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2175SCounter != sharedCounter;
            localIp65504P2175SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2175_S_LEN = 2;
  	/**
	 * serializeIp65504P2175S
	 */
	protected void serializeIp65504P2175S(short ip65504P2175S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2175S,IP_65504_P_2175_S_LEN)
                  ,beginIp65504P2175S
                  ,IP_65504_P_2175_S_LEN
                 );
            localIp65504P2175SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2175SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2175S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2175S() {	 
			return (getShort(beginIp65504P2175S));
   	}
         int localIp65504P2175LCounter = -1;
         public boolean isIp65504P2175LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2175LCounter != sharedCounter;
            localIp65504P2175LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2175_L_LEN = 2;
  	/**
	 * serializeIp65504P2175L
	 */
	protected void serializeIp65504P2175L(short ip65504P2175L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2175L,IP_65504_P_2175_L_LEN)
                  ,beginIp65504P2175L
                  ,IP_65504_P_2175_L_LEN
                 );
            localIp65504P2175LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2175LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2175L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2175L() {	 
			return (getShort(beginIp65504P2175L));
   	}
         int localIp65504P2176SCounter = -1;
         public boolean isIp65504P2176SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2176SCounter != sharedCounter;
            localIp65504P2176SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2176_S_LEN = 2;
  	/**
	 * serializeIp65504P2176S
	 */
	protected void serializeIp65504P2176S(short ip65504P2176S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2176S,IP_65504_P_2176_S_LEN)
                  ,beginIp65504P2176S
                  ,IP_65504_P_2176_S_LEN
                 );
            localIp65504P2176SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2176SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2176S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2176S() {	 
			return (getShort(beginIp65504P2176S));
   	}
         int localIp65504P2176LCounter = -1;
         public boolean isIp65504P2176LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2176LCounter != sharedCounter;
            localIp65504P2176LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2176_L_LEN = 2;
  	/**
	 * serializeIp65504P2176L
	 */
	protected void serializeIp65504P2176L(short ip65504P2176L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2176L,IP_65504_P_2176_L_LEN)
                  ,beginIp65504P2176L
                  ,IP_65504_P_2176_L_LEN
                 );
            localIp65504P2176LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2176LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2176L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2176L() {	 
			return (getShort(beginIp65504P2176L));
   	}
         int localIp65504P2177SCounter = -1;
         public boolean isIp65504P2177SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2177SCounter != sharedCounter;
            localIp65504P2177SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2177_S_LEN = 2;
  	/**
	 * serializeIp65504P2177S
	 */
	protected void serializeIp65504P2177S(short ip65504P2177S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2177S,IP_65504_P_2177_S_LEN)
                  ,beginIp65504P2177S
                  ,IP_65504_P_2177_S_LEN
                 );
            localIp65504P2177SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2177SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2177S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2177S() {	 
			return (getShort(beginIp65504P2177S));
   	}
         int localIp65504P2177LCounter = -1;
         public boolean isIp65504P2177LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2177LCounter != sharedCounter;
            localIp65504P2177LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2177_L_LEN = 2;
  	/**
	 * serializeIp65504P2177L
	 */
	protected void serializeIp65504P2177L(short ip65504P2177L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2177L,IP_65504_P_2177_L_LEN)
                  ,beginIp65504P2177L
                  ,IP_65504_P_2177_L_LEN
                 );
            localIp65504P2177LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2177LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2177L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2177L() {	 
			return (getShort(beginIp65504P2177L));
   	}
         int localIp65504P2178SCounter = -1;
         public boolean isIp65504P2178SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2178SCounter != sharedCounter;
            localIp65504P2178SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2178_S_LEN = 2;
  	/**
	 * serializeIp65504P2178S
	 */
	protected void serializeIp65504P2178S(short ip65504P2178S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2178S,IP_65504_P_2178_S_LEN)
                  ,beginIp65504P2178S
                  ,IP_65504_P_2178_S_LEN
                 );
            localIp65504P2178SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2178SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2178S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2178S() {	 
			return (getShort(beginIp65504P2178S));
   	}
         int localIp65504P2178LCounter = -1;
         public boolean isIp65504P2178LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2178LCounter != sharedCounter;
            localIp65504P2178LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2178_L_LEN = 2;
  	/**
	 * serializeIp65504P2178L
	 */
	protected void serializeIp65504P2178L(short ip65504P2178L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2178L,IP_65504_P_2178_L_LEN)
                  ,beginIp65504P2178L
                  ,IP_65504_P_2178_L_LEN
                 );
            localIp65504P2178LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2178LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2178L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2178L() {	 
			return (getShort(beginIp65504P2178L));
   	}
         int localIp65504P2179SCounter = -1;
         public boolean isIp65504P2179SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2179SCounter != sharedCounter;
            localIp65504P2179SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2179_S_LEN = 2;
  	/**
	 * serializeIp65504P2179S
	 */
	protected void serializeIp65504P2179S(short ip65504P2179S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2179S,IP_65504_P_2179_S_LEN)
                  ,beginIp65504P2179S
                  ,IP_65504_P_2179_S_LEN
                 );
            localIp65504P2179SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2179SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2179S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2179S() {	 
			return (getShort(beginIp65504P2179S));
   	}
         int localIp65504P2179LCounter = -1;
         public boolean isIp65504P2179LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2179LCounter != sharedCounter;
            localIp65504P2179LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2179_L_LEN = 2;
  	/**
	 * serializeIp65504P2179L
	 */
	protected void serializeIp65504P2179L(short ip65504P2179L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2179L,IP_65504_P_2179_L_LEN)
                  ,beginIp65504P2179L
                  ,IP_65504_P_2179_L_LEN
                 );
            localIp65504P2179LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2179LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2179L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2179L() {	 
			return (getShort(beginIp65504P2179L));
   	}
         int localIp65504P2180SCounter = -1;
         public boolean isIp65504P2180SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2180SCounter != sharedCounter;
            localIp65504P2180SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2180_S_LEN = 2;
  	/**
	 * serializeIp65504P2180S
	 */
	protected void serializeIp65504P2180S(short ip65504P2180S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2180S,IP_65504_P_2180_S_LEN)
                  ,beginIp65504P2180S
                  ,IP_65504_P_2180_S_LEN
                 );
            localIp65504P2180SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2180SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2180S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2180S() {	 
			return (getShort(beginIp65504P2180S));
   	}
         int localIp65504P2180LCounter = -1;
         public boolean isIp65504P2180LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2180LCounter != sharedCounter;
            localIp65504P2180LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2180_L_LEN = 2;
  	/**
	 * serializeIp65504P2180L
	 */
	protected void serializeIp65504P2180L(short ip65504P2180L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2180L,IP_65504_P_2180_L_LEN)
                  ,beginIp65504P2180L
                  ,IP_65504_P_2180_L_LEN
                 );
            localIp65504P2180LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2180LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2180L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2180L() {	 
			return (getShort(beginIp65504P2180L));
   	}
         int localIp65504P2181SCounter = -1;
         public boolean isIp65504P2181SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2181SCounter != sharedCounter;
            localIp65504P2181SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2181_S_LEN = 2;
  	/**
	 * serializeIp65504P2181S
	 */
	protected void serializeIp65504P2181S(short ip65504P2181S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2181S,IP_65504_P_2181_S_LEN)
                  ,beginIp65504P2181S
                  ,IP_65504_P_2181_S_LEN
                 );
            localIp65504P2181SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2181SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2181S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2181S() {	 
			return (getShort(beginIp65504P2181S));
   	}
         int localIp65504P2181LCounter = -1;
         public boolean isIp65504P2181LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2181LCounter != sharedCounter;
            localIp65504P2181LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2181_L_LEN = 2;
  	/**
	 * serializeIp65504P2181L
	 */
	protected void serializeIp65504P2181L(short ip65504P2181L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2181L,IP_65504_P_2181_L_LEN)
                  ,beginIp65504P2181L
                  ,IP_65504_P_2181_L_LEN
                 );
            localIp65504P2181LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2181LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2181L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2181L() {	 
			return (getShort(beginIp65504P2181L));
   	}
         int localIp65504P2182SCounter = -1;
         public boolean isIp65504P2182SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2182SCounter != sharedCounter;
            localIp65504P2182SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2182_S_LEN = 2;
  	/**
	 * serializeIp65504P2182S
	 */
	protected void serializeIp65504P2182S(short ip65504P2182S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2182S,IP_65504_P_2182_S_LEN)
                  ,beginIp65504P2182S
                  ,IP_65504_P_2182_S_LEN
                 );
            localIp65504P2182SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2182SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2182S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2182S() {	 
			return (getShort(beginIp65504P2182S));
   	}
         int localIp65504P2182LCounter = -1;
         public boolean isIp65504P2182LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2182LCounter != sharedCounter;
            localIp65504P2182LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2182_L_LEN = 2;
  	/**
	 * serializeIp65504P2182L
	 */
	protected void serializeIp65504P2182L(short ip65504P2182L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2182L,IP_65504_P_2182_L_LEN)
                  ,beginIp65504P2182L
                  ,IP_65504_P_2182_L_LEN
                 );
            localIp65504P2182LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2182LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2182L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2182L() {	 
			return (getShort(beginIp65504P2182L));
   	}
         int localIp65504P2183SCounter = -1;
         public boolean isIp65504P2183SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2183SCounter != sharedCounter;
            localIp65504P2183SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2183_S_LEN = 2;
  	/**
	 * serializeIp65504P2183S
	 */
	protected void serializeIp65504P2183S(short ip65504P2183S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2183S,IP_65504_P_2183_S_LEN)
                  ,beginIp65504P2183S
                  ,IP_65504_P_2183_S_LEN
                 );
            localIp65504P2183SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2183SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2183S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2183S() {	 
			return (getShort(beginIp65504P2183S));
   	}
         int localIp65504P2183LCounter = -1;
         public boolean isIp65504P2183LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2183LCounter != sharedCounter;
            localIp65504P2183LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2183_L_LEN = 2;
  	/**
	 * serializeIp65504P2183L
	 */
	protected void serializeIp65504P2183L(short ip65504P2183L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2183L,IP_65504_P_2183_L_LEN)
                  ,beginIp65504P2183L
                  ,IP_65504_P_2183_L_LEN
                 );
            localIp65504P2183LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2183LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2183L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2183L() {	 
			return (getShort(beginIp65504P2183L));
   	}
         int localIp65504P2184SCounter = -1;
         public boolean isIp65504P2184SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2184SCounter != sharedCounter;
            localIp65504P2184SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2184_S_LEN = 2;
  	/**
	 * serializeIp65504P2184S
	 */
	protected void serializeIp65504P2184S(short ip65504P2184S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2184S,IP_65504_P_2184_S_LEN)
                  ,beginIp65504P2184S
                  ,IP_65504_P_2184_S_LEN
                 );
            localIp65504P2184SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2184SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2184S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2184S() {	 
			return (getShort(beginIp65504P2184S));
   	}
         int localIp65504P2184LCounter = -1;
         public boolean isIp65504P2184LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2184LCounter != sharedCounter;
            localIp65504P2184LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2184_L_LEN = 2;
  	/**
	 * serializeIp65504P2184L
	 */
	protected void serializeIp65504P2184L(short ip65504P2184L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2184L,IP_65504_P_2184_L_LEN)
                  ,beginIp65504P2184L
                  ,IP_65504_P_2184_L_LEN
                 );
            localIp65504P2184LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2184LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2184L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2184L() {	 
			return (getShort(beginIp65504P2184L));
   	}
         int localIp65504P2185SCounter = -1;
         public boolean isIp65504P2185SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2185SCounter != sharedCounter;
            localIp65504P2185SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2185_S_LEN = 2;
  	/**
	 * serializeIp65504P2185S
	 */
	protected void serializeIp65504P2185S(short ip65504P2185S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2185S,IP_65504_P_2185_S_LEN)
                  ,beginIp65504P2185S
                  ,IP_65504_P_2185_S_LEN
                 );
            localIp65504P2185SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2185SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2185S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2185S() {	 
			return (getShort(beginIp65504P2185S));
   	}
         int localIp65504P2185LCounter = -1;
         public boolean isIp65504P2185LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2185LCounter != sharedCounter;
            localIp65504P2185LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2185_L_LEN = 2;
  	/**
	 * serializeIp65504P2185L
	 */
	protected void serializeIp65504P2185L(short ip65504P2185L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2185L,IP_65504_P_2185_L_LEN)
                  ,beginIp65504P2185L
                  ,IP_65504_P_2185_L_LEN
                 );
            localIp65504P2185LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2185LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2185L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2185L() {	 
			return (getShort(beginIp65504P2185L));
   	}
         int localIp65504P2186SCounter = -1;
         public boolean isIp65504P2186SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2186SCounter != sharedCounter;
            localIp65504P2186SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2186_S_LEN = 2;
  	/**
	 * serializeIp65504P2186S
	 */
	protected void serializeIp65504P2186S(short ip65504P2186S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2186S,IP_65504_P_2186_S_LEN)
                  ,beginIp65504P2186S
                  ,IP_65504_P_2186_S_LEN
                 );
            localIp65504P2186SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2186SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2186S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2186S() {	 
			return (getShort(beginIp65504P2186S));
   	}
         int localIp65504P2186LCounter = -1;
         public boolean isIp65504P2186LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2186LCounter != sharedCounter;
            localIp65504P2186LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2186_L_LEN = 2;
  	/**
	 * serializeIp65504P2186L
	 */
	protected void serializeIp65504P2186L(short ip65504P2186L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2186L,IP_65504_P_2186_L_LEN)
                  ,beginIp65504P2186L
                  ,IP_65504_P_2186_L_LEN
                 );
            localIp65504P2186LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2186LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2186L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2186L() {	 
			return (getShort(beginIp65504P2186L));
   	}
         int localIp65504P2187SCounter = -1;
         public boolean isIp65504P2187SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2187SCounter != sharedCounter;
            localIp65504P2187SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2187_S_LEN = 2;
  	/**
	 * serializeIp65504P2187S
	 */
	protected void serializeIp65504P2187S(short ip65504P2187S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2187S,IP_65504_P_2187_S_LEN)
                  ,beginIp65504P2187S
                  ,IP_65504_P_2187_S_LEN
                 );
            localIp65504P2187SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2187SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2187S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2187S() {	 
			return (getShort(beginIp65504P2187S));
   	}
         int localIp65504P2187LCounter = -1;
         public boolean isIp65504P2187LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2187LCounter != sharedCounter;
            localIp65504P2187LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2187_L_LEN = 2;
  	/**
	 * serializeIp65504P2187L
	 */
	protected void serializeIp65504P2187L(short ip65504P2187L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2187L,IP_65504_P_2187_L_LEN)
                  ,beginIp65504P2187L
                  ,IP_65504_P_2187_L_LEN
                 );
            localIp65504P2187LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2187LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2187L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2187L() {	 
			return (getShort(beginIp65504P2187L));
   	}
         int localIp65504P2188SCounter = -1;
         public boolean isIp65504P2188SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2188SCounter != sharedCounter;
            localIp65504P2188SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2188_S_LEN = 2;
  	/**
	 * serializeIp65504P2188S
	 */
	protected void serializeIp65504P2188S(short ip65504P2188S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2188S,IP_65504_P_2188_S_LEN)
                  ,beginIp65504P2188S
                  ,IP_65504_P_2188_S_LEN
                 );
            localIp65504P2188SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2188SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2188S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2188S() {	 
			return (getShort(beginIp65504P2188S));
   	}
         int localIp65504P2188LCounter = -1;
         public boolean isIp65504P2188LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2188LCounter != sharedCounter;
            localIp65504P2188LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2188_L_LEN = 2;
  	/**
	 * serializeIp65504P2188L
	 */
	protected void serializeIp65504P2188L(short ip65504P2188L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2188L,IP_65504_P_2188_L_LEN)
                  ,beginIp65504P2188L
                  ,IP_65504_P_2188_L_LEN
                 );
            localIp65504P2188LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2188LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2188L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2188L() {	 
			return (getShort(beginIp65504P2188L));
   	}
         int localIp65504P2189SCounter = -1;
         public boolean isIp65504P2189SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2189SCounter != sharedCounter;
            localIp65504P2189SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2189_S_LEN = 2;
  	/**
	 * serializeIp65504P2189S
	 */
	protected void serializeIp65504P2189S(short ip65504P2189S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2189S,IP_65504_P_2189_S_LEN)
                  ,beginIp65504P2189S
                  ,IP_65504_P_2189_S_LEN
                 );
            localIp65504P2189SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2189SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2189S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2189S() {	 
			return (getShort(beginIp65504P2189S));
   	}
         int localIp65504P2189LCounter = -1;
         public boolean isIp65504P2189LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2189LCounter != sharedCounter;
            localIp65504P2189LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2189_L_LEN = 2;
  	/**
	 * serializeIp65504P2189L
	 */
	protected void serializeIp65504P2189L(short ip65504P2189L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2189L,IP_65504_P_2189_L_LEN)
                  ,beginIp65504P2189L
                  ,IP_65504_P_2189_L_LEN
                 );
            localIp65504P2189LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2189LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2189L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2189L() {	 
			return (getShort(beginIp65504P2189L));
   	}
         int localIp65504P2190SCounter = -1;
         public boolean isIp65504P2190SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2190SCounter != sharedCounter;
            localIp65504P2190SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2190_S_LEN = 2;
  	/**
	 * serializeIp65504P2190S
	 */
	protected void serializeIp65504P2190S(short ip65504P2190S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2190S,IP_65504_P_2190_S_LEN)
                  ,beginIp65504P2190S
                  ,IP_65504_P_2190_S_LEN
                 );
            localIp65504P2190SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2190SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2190S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2190S() {	 
			return (getShort(beginIp65504P2190S));
   	}
         int localIp65504P2190LCounter = -1;
         public boolean isIp65504P2190LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2190LCounter != sharedCounter;
            localIp65504P2190LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2190_L_LEN = 2;
  	/**
	 * serializeIp65504P2190L
	 */
	protected void serializeIp65504P2190L(short ip65504P2190L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2190L,IP_65504_P_2190_L_LEN)
                  ,beginIp65504P2190L
                  ,IP_65504_P_2190_L_LEN
                 );
            localIp65504P2190LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2190LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2190L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2190L() {	 
			return (getShort(beginIp65504P2190L));
   	}
         int localIp65504P2191SCounter = -1;
         public boolean isIp65504P2191SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2191SCounter != sharedCounter;
            localIp65504P2191SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2191_S_LEN = 2;
  	/**
	 * serializeIp65504P2191S
	 */
	protected void serializeIp65504P2191S(short ip65504P2191S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2191S,IP_65504_P_2191_S_LEN)
                  ,beginIp65504P2191S
                  ,IP_65504_P_2191_S_LEN
                 );
            localIp65504P2191SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2191SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2191S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2191S() {	 
			return (getShort(beginIp65504P2191S));
   	}
         int localIp65504P2191LCounter = -1;
         public boolean isIp65504P2191LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2191LCounter != sharedCounter;
            localIp65504P2191LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2191_L_LEN = 2;
  	/**
	 * serializeIp65504P2191L
	 */
	protected void serializeIp65504P2191L(short ip65504P2191L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2191L,IP_65504_P_2191_L_LEN)
                  ,beginIp65504P2191L
                  ,IP_65504_P_2191_L_LEN
                 );
            localIp65504P2191LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2191LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2191L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2191L() {	 
			return (getShort(beginIp65504P2191L));
   	}
         int localIp65504P2192SCounter = -1;
         public boolean isIp65504P2192SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2192SCounter != sharedCounter;
            localIp65504P2192SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2192_S_LEN = 2;
  	/**
	 * serializeIp65504P2192S
	 */
	protected void serializeIp65504P2192S(short ip65504P2192S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2192S,IP_65504_P_2192_S_LEN)
                  ,beginIp65504P2192S
                  ,IP_65504_P_2192_S_LEN
                 );
            localIp65504P2192SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2192SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2192S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2192S() {	 
			return (getShort(beginIp65504P2192S));
   	}
         int localIp65504P2192LCounter = -1;
         public boolean isIp65504P2192LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2192LCounter != sharedCounter;
            localIp65504P2192LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2192_L_LEN = 2;
  	/**
	 * serializeIp65504P2192L
	 */
	protected void serializeIp65504P2192L(short ip65504P2192L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2192L,IP_65504_P_2192_L_LEN)
                  ,beginIp65504P2192L
                  ,IP_65504_P_2192_L_LEN
                 );
            localIp65504P2192LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2192LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2192L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2192L() {	 
			return (getShort(beginIp65504P2192L));
   	}
         int localIp65504P2193SCounter = -1;
         public boolean isIp65504P2193SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2193SCounter != sharedCounter;
            localIp65504P2193SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2193_S_LEN = 2;
  	/**
	 * serializeIp65504P2193S
	 */
	protected void serializeIp65504P2193S(short ip65504P2193S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2193S,IP_65504_P_2193_S_LEN)
                  ,beginIp65504P2193S
                  ,IP_65504_P_2193_S_LEN
                 );
            localIp65504P2193SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2193SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2193S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2193S() {	 
			return (getShort(beginIp65504P2193S));
   	}
         int localIp65504P2193LCounter = -1;
         public boolean isIp65504P2193LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2193LCounter != sharedCounter;
            localIp65504P2193LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2193_L_LEN = 2;
  	/**
	 * serializeIp65504P2193L
	 */
	protected void serializeIp65504P2193L(short ip65504P2193L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2193L,IP_65504_P_2193_L_LEN)
                  ,beginIp65504P2193L
                  ,IP_65504_P_2193_L_LEN
                 );
            localIp65504P2193LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2193LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2193L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2193L() {	 
			return (getShort(beginIp65504P2193L));
   	}
         int localIp65504P2194SCounter = -1;
         public boolean isIp65504P2194SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2194SCounter != sharedCounter;
            localIp65504P2194SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2194_S_LEN = 2;
  	/**
	 * serializeIp65504P2194S
	 */
	protected void serializeIp65504P2194S(short ip65504P2194S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2194S,IP_65504_P_2194_S_LEN)
                  ,beginIp65504P2194S
                  ,IP_65504_P_2194_S_LEN
                 );
            localIp65504P2194SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2194SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2194S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2194S() {	 
			return (getShort(beginIp65504P2194S));
   	}
         int localIp65504P2194LCounter = -1;
         public boolean isIp65504P2194LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2194LCounter != sharedCounter;
            localIp65504P2194LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2194_L_LEN = 2;
  	/**
	 * serializeIp65504P2194L
	 */
	protected void serializeIp65504P2194L(short ip65504P2194L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2194L,IP_65504_P_2194_L_LEN)
                  ,beginIp65504P2194L
                  ,IP_65504_P_2194_L_LEN
                 );
            localIp65504P2194LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2194LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2194L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2194L() {	 
			return (getShort(beginIp65504P2194L));
   	}
         int localIp65504P2195SCounter = -1;
         public boolean isIp65504P2195SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2195SCounter != sharedCounter;
            localIp65504P2195SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2195_S_LEN = 2;
  	/**
	 * serializeIp65504P2195S
	 */
	protected void serializeIp65504P2195S(short ip65504P2195S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2195S,IP_65504_P_2195_S_LEN)
                  ,beginIp65504P2195S
                  ,IP_65504_P_2195_S_LEN
                 );
            localIp65504P2195SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2195SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2195S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2195S() {	 
			return (getShort(beginIp65504P2195S));
   	}
         int localIp65504P2195LCounter = -1;
         public boolean isIp65504P2195LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2195LCounter != sharedCounter;
            localIp65504P2195LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2195_L_LEN = 2;
  	/**
	 * serializeIp65504P2195L
	 */
	protected void serializeIp65504P2195L(short ip65504P2195L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2195L,IP_65504_P_2195_L_LEN)
                  ,beginIp65504P2195L
                  ,IP_65504_P_2195_L_LEN
                 );
            localIp65504P2195LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2195LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2195L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2195L() {	 
			return (getShort(beginIp65504P2195L));
   	}
         int localIp65504P2196SCounter = -1;
         public boolean isIp65504P2196SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2196SCounter != sharedCounter;
            localIp65504P2196SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2196_S_LEN = 2;
  	/**
	 * serializeIp65504P2196S
	 */
	protected void serializeIp65504P2196S(short ip65504P2196S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2196S,IP_65504_P_2196_S_LEN)
                  ,beginIp65504P2196S
                  ,IP_65504_P_2196_S_LEN
                 );
            localIp65504P2196SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2196SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2196S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2196S() {	 
			return (getShort(beginIp65504P2196S));
   	}
         int localIp65504P2196LCounter = -1;
         public boolean isIp65504P2196LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2196LCounter != sharedCounter;
            localIp65504P2196LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2196_L_LEN = 2;
  	/**
	 * serializeIp65504P2196L
	 */
	protected void serializeIp65504P2196L(short ip65504P2196L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2196L,IP_65504_P_2196_L_LEN)
                  ,beginIp65504P2196L
                  ,IP_65504_P_2196_L_LEN
                 );
            localIp65504P2196LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2196LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2196L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2196L() {	 
			return (getShort(beginIp65504P2196L));
   	}
         int localIp65504P2197SCounter = -1;
         public boolean isIp65504P2197SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2197SCounter != sharedCounter;
            localIp65504P2197SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2197_S_LEN = 2;
  	/**
	 * serializeIp65504P2197S
	 */
	protected void serializeIp65504P2197S(short ip65504P2197S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2197S,IP_65504_P_2197_S_LEN)
                  ,beginIp65504P2197S
                  ,IP_65504_P_2197_S_LEN
                 );
            localIp65504P2197SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2197SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2197S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2197S() {	 
			return (getShort(beginIp65504P2197S));
   	}
         int localIp65504P2197LCounter = -1;
         public boolean isIp65504P2197LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2197LCounter != sharedCounter;
            localIp65504P2197LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2197_L_LEN = 2;
  	/**
	 * serializeIp65504P2197L
	 */
	protected void serializeIp65504P2197L(short ip65504P2197L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2197L,IP_65504_P_2197_L_LEN)
                  ,beginIp65504P2197L
                  ,IP_65504_P_2197_L_LEN
                 );
            localIp65504P2197LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2197LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2197L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2197L() {	 
			return (getShort(beginIp65504P2197L));
   	}
         int localIp65504P2198SCounter = -1;
         public boolean isIp65504P2198SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2198SCounter != sharedCounter;
            localIp65504P2198SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2198_S_LEN = 2;
  	/**
	 * serializeIp65504P2198S
	 */
	protected void serializeIp65504P2198S(short ip65504P2198S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2198S,IP_65504_P_2198_S_LEN)
                  ,beginIp65504P2198S
                  ,IP_65504_P_2198_S_LEN
                 );
            localIp65504P2198SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2198SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2198S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2198S() {	 
			return (getShort(beginIp65504P2198S));
   	}
         int localIp65504P2198LCounter = -1;
         public boolean isIp65504P2198LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2198LCounter != sharedCounter;
            localIp65504P2198LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2198_L_LEN = 2;
  	/**
	 * serializeIp65504P2198L
	 */
	protected void serializeIp65504P2198L(short ip65504P2198L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2198L,IP_65504_P_2198_L_LEN)
                  ,beginIp65504P2198L
                  ,IP_65504_P_2198_L_LEN
                 );
            localIp65504P2198LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2198LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2198L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2198L() {	 
			return (getShort(beginIp65504P2198L));
   	}
         int localIp65504P2199SCounter = -1;
         public boolean isIp65504P2199SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2199SCounter != sharedCounter;
            localIp65504P2199SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2199_S_LEN = 2;
  	/**
	 * serializeIp65504P2199S
	 */
	protected void serializeIp65504P2199S(short ip65504P2199S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2199S,IP_65504_P_2199_S_LEN)
                  ,beginIp65504P2199S
                  ,IP_65504_P_2199_S_LEN
                 );
            localIp65504P2199SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2199SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2199S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2199S() {	 
			return (getShort(beginIp65504P2199S));
   	}
         int localIp65504P2199LCounter = -1;
         public boolean isIp65504P2199LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2199LCounter != sharedCounter;
            localIp65504P2199LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2199_L_LEN = 2;
  	/**
	 * serializeIp65504P2199L
	 */
	protected void serializeIp65504P2199L(short ip65504P2199L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2199L,IP_65504_P_2199_L_LEN)
                  ,beginIp65504P2199L
                  ,IP_65504_P_2199_L_LEN
                 );
            localIp65504P2199LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2199LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2199L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2199L() {	 
			return (getShort(beginIp65504P2199L));
   	}
         int localIp65504P2200SCounter = -1;
         public boolean isIp65504P2200SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2200SCounter != sharedCounter;
            localIp65504P2200SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2200_S_LEN = 2;
  	/**
	 * serializeIp65504P2200S
	 */
	protected void serializeIp65504P2200S(short ip65504P2200S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2200S,IP_65504_P_2200_S_LEN)
                  ,beginIp65504P2200S
                  ,IP_65504_P_2200_S_LEN
                 );
            localIp65504P2200SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2200SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2200S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2200S() {	 
			return (getShort(beginIp65504P2200S));
   	}
         int localIp65504P2200LCounter = -1;
         public boolean isIp65504P2200LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2200LCounter != sharedCounter;
            localIp65504P2200LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2200_L_LEN = 2;
  	/**
	 * serializeIp65504P2200L
	 */
	protected void serializeIp65504P2200L(short ip65504P2200L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2200L,IP_65504_P_2200_L_LEN)
                  ,beginIp65504P2200L
                  ,IP_65504_P_2200_L_LEN
                 );
            localIp65504P2200LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2200LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2200L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2200L() {	 
			return (getShort(beginIp65504P2200L));
   	}
         int localIp65504P2201SCounter = -1;
         public boolean isIp65504P2201SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2201SCounter != sharedCounter;
            localIp65504P2201SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2201_S_LEN = 2;
  	/**
	 * serializeIp65504P2201S
	 */
	protected void serializeIp65504P2201S(short ip65504P2201S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2201S,IP_65504_P_2201_S_LEN)
                  ,beginIp65504P2201S
                  ,IP_65504_P_2201_S_LEN
                 );
            localIp65504P2201SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2201SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2201S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2201S() {	 
			return (getShort(beginIp65504P2201S));
   	}
         int localIp65504P2201LCounter = -1;
         public boolean isIp65504P2201LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2201LCounter != sharedCounter;
            localIp65504P2201LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2201_L_LEN = 2;
  	/**
	 * serializeIp65504P2201L
	 */
	protected void serializeIp65504P2201L(short ip65504P2201L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2201L,IP_65504_P_2201_L_LEN)
                  ,beginIp65504P2201L
                  ,IP_65504_P_2201_L_LEN
                 );
            localIp65504P2201LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2201LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2201L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2201L() {	 
			return (getShort(beginIp65504P2201L));
   	}




}
  
