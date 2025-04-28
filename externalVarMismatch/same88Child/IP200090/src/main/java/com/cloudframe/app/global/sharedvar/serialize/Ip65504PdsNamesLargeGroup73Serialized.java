package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup73Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:05. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup73Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup73Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_73_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P2233S;
            protected  int beginIp65504P2233L;
            protected  int beginIp65504P2234S;
            protected  int beginIp65504P2234L;
            protected  int beginIp65504P2235S;
            protected  int beginIp65504P2235L;
            protected  int beginIp65504P2236S;
            protected  int beginIp65504P2236L;
            protected  int beginIp65504P2237S;
            protected  int beginIp65504P2237L;
            protected  int beginIp65504P2238S;
            protected  int beginIp65504P2238L;
            protected  int beginIp65504P2239S;
            protected  int beginIp65504P2239L;
            protected  int beginIp65504P2240S;
            protected  int beginIp65504P2240L;
            protected  int beginIp65504P2241S;
            protected  int beginIp65504P2241L;
            protected  int beginIp65504P2242S;
            protected  int beginIp65504P2242L;
            protected  int beginIp65504P2243S;
            protected  int beginIp65504P2243L;
            protected  int beginIp65504P2244S;
            protected  int beginIp65504P2244L;
            protected  int beginIp65504P2245S;
            protected  int beginIp65504P2245L;
            protected  int beginIp65504P2246S;
            protected  int beginIp65504P2246L;
            protected  int beginIp65504P2247S;
            protected  int beginIp65504P2247L;
            protected  int beginIp65504P2248S;
            protected  int beginIp65504P2248L;
            protected  int beginIp65504P2249S;
            protected  int beginIp65504P2249L;
            protected  int beginIp65504P2250S;
            protected  int beginIp65504P2250L;
            protected  int beginIp65504P2251S;
            protected  int beginIp65504P2251L;
            protected  int beginIp65504P2252S;
            protected  int beginIp65504P2252L;
            protected  int beginIp65504P2253S;
            protected  int beginIp65504P2253L;
            protected  int beginIp65504P2254S;
            protected  int beginIp65504P2254L;
            protected  int beginIp65504P2255S;
            protected  int beginIp65504P2255L;
            protected  int beginIp65504P2256S;
            protected  int beginIp65504P2256L;
            protected  int beginIp65504P2257S;
            protected  int beginIp65504P2257L;
            protected  int beginIp65504P2258S;
            protected  int beginIp65504P2258L;
            protected  int beginIp65504P2259S;
            protected  int beginIp65504P2259L;
            protected  int beginIp65504P2260S;
            protected  int beginIp65504P2260L;
            protected  int beginIp65504P2261S;
            protected  int beginIp65504P2261L;
            protected  int beginIp65504P2262S;
            protected  int beginIp65504P2262L;
            protected  int beginIp65504P2263S;
            protected  int beginIp65504P2263L;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup73Serialized
	**/
    public Ip65504PdsNamesLargeGroup73Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup73Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup73Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup73Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,17852); // serialize this field at offset 17852 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup73Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 17852 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup73Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_73_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P2233S = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P2233L = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P2234S = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P2234L = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P2235S = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P2235L = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P2236S = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P2236L = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P2237S = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P2237L = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P2238S = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P2238L = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P2239S = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P2239L = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P2240S = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P2240L = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P2241S = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P2241L = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P2242S = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P2242L = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P2243S = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P2243L = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P2244S = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P2244L = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P2245S = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P2245L = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P2246S = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P2246L = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P2247S = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P2247L = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P2248S = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P2248L = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P2249S = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P2249L = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P2250S = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P2250L = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P2251S = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P2251L = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P2252S = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P2252L = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P2253S = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P2253L = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P2254S = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P2254L = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P2255S = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P2255L = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P2256S = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P2256L = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P2257S = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P2257L = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P2258S = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P2258L = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P2259S = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P2259L = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P2260S = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P2260L = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P2261S = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P2261L = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P2262S = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P2262L = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P2263S = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P2263L = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P2233SCounter = -1;
         public boolean isIp65504P2233SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2233SCounter != sharedCounter;
            localIp65504P2233SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2233_S_LEN = 2;
  	/**
	 * serializeIp65504P2233S
	 */
	protected void serializeIp65504P2233S(short ip65504P2233S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2233S,IP_65504_P_2233_S_LEN)
                  ,beginIp65504P2233S
                  ,IP_65504_P_2233_S_LEN
                 );
            localIp65504P2233SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2233SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2233S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2233S() {	 
			return (getShort(beginIp65504P2233S));
   	}
         int localIp65504P2233LCounter = -1;
         public boolean isIp65504P2233LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2233LCounter != sharedCounter;
            localIp65504P2233LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2233_L_LEN = 2;
  	/**
	 * serializeIp65504P2233L
	 */
	protected void serializeIp65504P2233L(short ip65504P2233L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2233L,IP_65504_P_2233_L_LEN)
                  ,beginIp65504P2233L
                  ,IP_65504_P_2233_L_LEN
                 );
            localIp65504P2233LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2233LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2233L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2233L() {	 
			return (getShort(beginIp65504P2233L));
   	}
         int localIp65504P2234SCounter = -1;
         public boolean isIp65504P2234SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2234SCounter != sharedCounter;
            localIp65504P2234SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2234_S_LEN = 2;
  	/**
	 * serializeIp65504P2234S
	 */
	protected void serializeIp65504P2234S(short ip65504P2234S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2234S,IP_65504_P_2234_S_LEN)
                  ,beginIp65504P2234S
                  ,IP_65504_P_2234_S_LEN
                 );
            localIp65504P2234SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2234SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2234S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2234S() {	 
			return (getShort(beginIp65504P2234S));
   	}
         int localIp65504P2234LCounter = -1;
         public boolean isIp65504P2234LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2234LCounter != sharedCounter;
            localIp65504P2234LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2234_L_LEN = 2;
  	/**
	 * serializeIp65504P2234L
	 */
	protected void serializeIp65504P2234L(short ip65504P2234L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2234L,IP_65504_P_2234_L_LEN)
                  ,beginIp65504P2234L
                  ,IP_65504_P_2234_L_LEN
                 );
            localIp65504P2234LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2234LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2234L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2234L() {	 
			return (getShort(beginIp65504P2234L));
   	}
         int localIp65504P2235SCounter = -1;
         public boolean isIp65504P2235SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2235SCounter != sharedCounter;
            localIp65504P2235SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2235_S_LEN = 2;
  	/**
	 * serializeIp65504P2235S
	 */
	protected void serializeIp65504P2235S(short ip65504P2235S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2235S,IP_65504_P_2235_S_LEN)
                  ,beginIp65504P2235S
                  ,IP_65504_P_2235_S_LEN
                 );
            localIp65504P2235SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2235SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2235S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2235S() {	 
			return (getShort(beginIp65504P2235S));
   	}
         int localIp65504P2235LCounter = -1;
         public boolean isIp65504P2235LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2235LCounter != sharedCounter;
            localIp65504P2235LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2235_L_LEN = 2;
  	/**
	 * serializeIp65504P2235L
	 */
	protected void serializeIp65504P2235L(short ip65504P2235L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2235L,IP_65504_P_2235_L_LEN)
                  ,beginIp65504P2235L
                  ,IP_65504_P_2235_L_LEN
                 );
            localIp65504P2235LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2235LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2235L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2235L() {	 
			return (getShort(beginIp65504P2235L));
   	}
         int localIp65504P2236SCounter = -1;
         public boolean isIp65504P2236SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2236SCounter != sharedCounter;
            localIp65504P2236SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2236_S_LEN = 2;
  	/**
	 * serializeIp65504P2236S
	 */
	protected void serializeIp65504P2236S(short ip65504P2236S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2236S,IP_65504_P_2236_S_LEN)
                  ,beginIp65504P2236S
                  ,IP_65504_P_2236_S_LEN
                 );
            localIp65504P2236SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2236SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2236S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2236S() {	 
			return (getShort(beginIp65504P2236S));
   	}
         int localIp65504P2236LCounter = -1;
         public boolean isIp65504P2236LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2236LCounter != sharedCounter;
            localIp65504P2236LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2236_L_LEN = 2;
  	/**
	 * serializeIp65504P2236L
	 */
	protected void serializeIp65504P2236L(short ip65504P2236L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2236L,IP_65504_P_2236_L_LEN)
                  ,beginIp65504P2236L
                  ,IP_65504_P_2236_L_LEN
                 );
            localIp65504P2236LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2236LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2236L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2236L() {	 
			return (getShort(beginIp65504P2236L));
   	}
         int localIp65504P2237SCounter = -1;
         public boolean isIp65504P2237SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2237SCounter != sharedCounter;
            localIp65504P2237SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2237_S_LEN = 2;
  	/**
	 * serializeIp65504P2237S
	 */
	protected void serializeIp65504P2237S(short ip65504P2237S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2237S,IP_65504_P_2237_S_LEN)
                  ,beginIp65504P2237S
                  ,IP_65504_P_2237_S_LEN
                 );
            localIp65504P2237SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2237SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2237S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2237S() {	 
			return (getShort(beginIp65504P2237S));
   	}
         int localIp65504P2237LCounter = -1;
         public boolean isIp65504P2237LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2237LCounter != sharedCounter;
            localIp65504P2237LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2237_L_LEN = 2;
  	/**
	 * serializeIp65504P2237L
	 */
	protected void serializeIp65504P2237L(short ip65504P2237L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2237L,IP_65504_P_2237_L_LEN)
                  ,beginIp65504P2237L
                  ,IP_65504_P_2237_L_LEN
                 );
            localIp65504P2237LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2237LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2237L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2237L() {	 
			return (getShort(beginIp65504P2237L));
   	}
         int localIp65504P2238SCounter = -1;
         public boolean isIp65504P2238SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2238SCounter != sharedCounter;
            localIp65504P2238SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2238_S_LEN = 2;
  	/**
	 * serializeIp65504P2238S
	 */
	protected void serializeIp65504P2238S(short ip65504P2238S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2238S,IP_65504_P_2238_S_LEN)
                  ,beginIp65504P2238S
                  ,IP_65504_P_2238_S_LEN
                 );
            localIp65504P2238SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2238SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2238S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2238S() {	 
			return (getShort(beginIp65504P2238S));
   	}
         int localIp65504P2238LCounter = -1;
         public boolean isIp65504P2238LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2238LCounter != sharedCounter;
            localIp65504P2238LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2238_L_LEN = 2;
  	/**
	 * serializeIp65504P2238L
	 */
	protected void serializeIp65504P2238L(short ip65504P2238L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2238L,IP_65504_P_2238_L_LEN)
                  ,beginIp65504P2238L
                  ,IP_65504_P_2238_L_LEN
                 );
            localIp65504P2238LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2238LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2238L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2238L() {	 
			return (getShort(beginIp65504P2238L));
   	}
         int localIp65504P2239SCounter = -1;
         public boolean isIp65504P2239SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2239SCounter != sharedCounter;
            localIp65504P2239SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2239_S_LEN = 2;
  	/**
	 * serializeIp65504P2239S
	 */
	protected void serializeIp65504P2239S(short ip65504P2239S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2239S,IP_65504_P_2239_S_LEN)
                  ,beginIp65504P2239S
                  ,IP_65504_P_2239_S_LEN
                 );
            localIp65504P2239SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2239SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2239S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2239S() {	 
			return (getShort(beginIp65504P2239S));
   	}
         int localIp65504P2239LCounter = -1;
         public boolean isIp65504P2239LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2239LCounter != sharedCounter;
            localIp65504P2239LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2239_L_LEN = 2;
  	/**
	 * serializeIp65504P2239L
	 */
	protected void serializeIp65504P2239L(short ip65504P2239L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2239L,IP_65504_P_2239_L_LEN)
                  ,beginIp65504P2239L
                  ,IP_65504_P_2239_L_LEN
                 );
            localIp65504P2239LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2239LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2239L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2239L() {	 
			return (getShort(beginIp65504P2239L));
   	}
         int localIp65504P2240SCounter = -1;
         public boolean isIp65504P2240SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2240SCounter != sharedCounter;
            localIp65504P2240SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2240_S_LEN = 2;
  	/**
	 * serializeIp65504P2240S
	 */
	protected void serializeIp65504P2240S(short ip65504P2240S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2240S,IP_65504_P_2240_S_LEN)
                  ,beginIp65504P2240S
                  ,IP_65504_P_2240_S_LEN
                 );
            localIp65504P2240SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2240SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2240S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2240S() {	 
			return (getShort(beginIp65504P2240S));
   	}
         int localIp65504P2240LCounter = -1;
         public boolean isIp65504P2240LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2240LCounter != sharedCounter;
            localIp65504P2240LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2240_L_LEN = 2;
  	/**
	 * serializeIp65504P2240L
	 */
	protected void serializeIp65504P2240L(short ip65504P2240L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2240L,IP_65504_P_2240_L_LEN)
                  ,beginIp65504P2240L
                  ,IP_65504_P_2240_L_LEN
                 );
            localIp65504P2240LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2240LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2240L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2240L() {	 
			return (getShort(beginIp65504P2240L));
   	}
         int localIp65504P2241SCounter = -1;
         public boolean isIp65504P2241SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2241SCounter != sharedCounter;
            localIp65504P2241SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2241_S_LEN = 2;
  	/**
	 * serializeIp65504P2241S
	 */
	protected void serializeIp65504P2241S(short ip65504P2241S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2241S,IP_65504_P_2241_S_LEN)
                  ,beginIp65504P2241S
                  ,IP_65504_P_2241_S_LEN
                 );
            localIp65504P2241SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2241SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2241S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2241S() {	 
			return (getShort(beginIp65504P2241S));
   	}
         int localIp65504P2241LCounter = -1;
         public boolean isIp65504P2241LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2241LCounter != sharedCounter;
            localIp65504P2241LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2241_L_LEN = 2;
  	/**
	 * serializeIp65504P2241L
	 */
	protected void serializeIp65504P2241L(short ip65504P2241L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2241L,IP_65504_P_2241_L_LEN)
                  ,beginIp65504P2241L
                  ,IP_65504_P_2241_L_LEN
                 );
            localIp65504P2241LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2241LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2241L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2241L() {	 
			return (getShort(beginIp65504P2241L));
   	}
         int localIp65504P2242SCounter = -1;
         public boolean isIp65504P2242SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2242SCounter != sharedCounter;
            localIp65504P2242SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2242_S_LEN = 2;
  	/**
	 * serializeIp65504P2242S
	 */
	protected void serializeIp65504P2242S(short ip65504P2242S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2242S,IP_65504_P_2242_S_LEN)
                  ,beginIp65504P2242S
                  ,IP_65504_P_2242_S_LEN
                 );
            localIp65504P2242SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2242SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2242S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2242S() {	 
			return (getShort(beginIp65504P2242S));
   	}
         int localIp65504P2242LCounter = -1;
         public boolean isIp65504P2242LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2242LCounter != sharedCounter;
            localIp65504P2242LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2242_L_LEN = 2;
  	/**
	 * serializeIp65504P2242L
	 */
	protected void serializeIp65504P2242L(short ip65504P2242L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2242L,IP_65504_P_2242_L_LEN)
                  ,beginIp65504P2242L
                  ,IP_65504_P_2242_L_LEN
                 );
            localIp65504P2242LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2242LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2242L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2242L() {	 
			return (getShort(beginIp65504P2242L));
   	}
         int localIp65504P2243SCounter = -1;
         public boolean isIp65504P2243SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2243SCounter != sharedCounter;
            localIp65504P2243SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2243_S_LEN = 2;
  	/**
	 * serializeIp65504P2243S
	 */
	protected void serializeIp65504P2243S(short ip65504P2243S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2243S,IP_65504_P_2243_S_LEN)
                  ,beginIp65504P2243S
                  ,IP_65504_P_2243_S_LEN
                 );
            localIp65504P2243SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2243SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2243S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2243S() {	 
			return (getShort(beginIp65504P2243S));
   	}
         int localIp65504P2243LCounter = -1;
         public boolean isIp65504P2243LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2243LCounter != sharedCounter;
            localIp65504P2243LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2243_L_LEN = 2;
  	/**
	 * serializeIp65504P2243L
	 */
	protected void serializeIp65504P2243L(short ip65504P2243L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2243L,IP_65504_P_2243_L_LEN)
                  ,beginIp65504P2243L
                  ,IP_65504_P_2243_L_LEN
                 );
            localIp65504P2243LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2243LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2243L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2243L() {	 
			return (getShort(beginIp65504P2243L));
   	}
         int localIp65504P2244SCounter = -1;
         public boolean isIp65504P2244SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2244SCounter != sharedCounter;
            localIp65504P2244SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2244_S_LEN = 2;
  	/**
	 * serializeIp65504P2244S
	 */
	protected void serializeIp65504P2244S(short ip65504P2244S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2244S,IP_65504_P_2244_S_LEN)
                  ,beginIp65504P2244S
                  ,IP_65504_P_2244_S_LEN
                 );
            localIp65504P2244SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2244SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2244S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2244S() {	 
			return (getShort(beginIp65504P2244S));
   	}
         int localIp65504P2244LCounter = -1;
         public boolean isIp65504P2244LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2244LCounter != sharedCounter;
            localIp65504P2244LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2244_L_LEN = 2;
  	/**
	 * serializeIp65504P2244L
	 */
	protected void serializeIp65504P2244L(short ip65504P2244L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2244L,IP_65504_P_2244_L_LEN)
                  ,beginIp65504P2244L
                  ,IP_65504_P_2244_L_LEN
                 );
            localIp65504P2244LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2244LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2244L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2244L() {	 
			return (getShort(beginIp65504P2244L));
   	}
         int localIp65504P2245SCounter = -1;
         public boolean isIp65504P2245SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2245SCounter != sharedCounter;
            localIp65504P2245SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2245_S_LEN = 2;
  	/**
	 * serializeIp65504P2245S
	 */
	protected void serializeIp65504P2245S(short ip65504P2245S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2245S,IP_65504_P_2245_S_LEN)
                  ,beginIp65504P2245S
                  ,IP_65504_P_2245_S_LEN
                 );
            localIp65504P2245SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2245SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2245S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2245S() {	 
			return (getShort(beginIp65504P2245S));
   	}
         int localIp65504P2245LCounter = -1;
         public boolean isIp65504P2245LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2245LCounter != sharedCounter;
            localIp65504P2245LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2245_L_LEN = 2;
  	/**
	 * serializeIp65504P2245L
	 */
	protected void serializeIp65504P2245L(short ip65504P2245L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2245L,IP_65504_P_2245_L_LEN)
                  ,beginIp65504P2245L
                  ,IP_65504_P_2245_L_LEN
                 );
            localIp65504P2245LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2245LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2245L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2245L() {	 
			return (getShort(beginIp65504P2245L));
   	}
         int localIp65504P2246SCounter = -1;
         public boolean isIp65504P2246SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2246SCounter != sharedCounter;
            localIp65504P2246SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2246_S_LEN = 2;
  	/**
	 * serializeIp65504P2246S
	 */
	protected void serializeIp65504P2246S(short ip65504P2246S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2246S,IP_65504_P_2246_S_LEN)
                  ,beginIp65504P2246S
                  ,IP_65504_P_2246_S_LEN
                 );
            localIp65504P2246SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2246SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2246S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2246S() {	 
			return (getShort(beginIp65504P2246S));
   	}
         int localIp65504P2246LCounter = -1;
         public boolean isIp65504P2246LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2246LCounter != sharedCounter;
            localIp65504P2246LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2246_L_LEN = 2;
  	/**
	 * serializeIp65504P2246L
	 */
	protected void serializeIp65504P2246L(short ip65504P2246L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2246L,IP_65504_P_2246_L_LEN)
                  ,beginIp65504P2246L
                  ,IP_65504_P_2246_L_LEN
                 );
            localIp65504P2246LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2246LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2246L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2246L() {	 
			return (getShort(beginIp65504P2246L));
   	}
         int localIp65504P2247SCounter = -1;
         public boolean isIp65504P2247SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2247SCounter != sharedCounter;
            localIp65504P2247SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2247_S_LEN = 2;
  	/**
	 * serializeIp65504P2247S
	 */
	protected void serializeIp65504P2247S(short ip65504P2247S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2247S,IP_65504_P_2247_S_LEN)
                  ,beginIp65504P2247S
                  ,IP_65504_P_2247_S_LEN
                 );
            localIp65504P2247SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2247SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2247S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2247S() {	 
			return (getShort(beginIp65504P2247S));
   	}
         int localIp65504P2247LCounter = -1;
         public boolean isIp65504P2247LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2247LCounter != sharedCounter;
            localIp65504P2247LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2247_L_LEN = 2;
  	/**
	 * serializeIp65504P2247L
	 */
	protected void serializeIp65504P2247L(short ip65504P2247L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2247L,IP_65504_P_2247_L_LEN)
                  ,beginIp65504P2247L
                  ,IP_65504_P_2247_L_LEN
                 );
            localIp65504P2247LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2247LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2247L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2247L() {	 
			return (getShort(beginIp65504P2247L));
   	}
         int localIp65504P2248SCounter = -1;
         public boolean isIp65504P2248SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2248SCounter != sharedCounter;
            localIp65504P2248SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2248_S_LEN = 2;
  	/**
	 * serializeIp65504P2248S
	 */
	protected void serializeIp65504P2248S(short ip65504P2248S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2248S,IP_65504_P_2248_S_LEN)
                  ,beginIp65504P2248S
                  ,IP_65504_P_2248_S_LEN
                 );
            localIp65504P2248SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2248SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2248S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2248S() {	 
			return (getShort(beginIp65504P2248S));
   	}
         int localIp65504P2248LCounter = -1;
         public boolean isIp65504P2248LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2248LCounter != sharedCounter;
            localIp65504P2248LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2248_L_LEN = 2;
  	/**
	 * serializeIp65504P2248L
	 */
	protected void serializeIp65504P2248L(short ip65504P2248L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2248L,IP_65504_P_2248_L_LEN)
                  ,beginIp65504P2248L
                  ,IP_65504_P_2248_L_LEN
                 );
            localIp65504P2248LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2248LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2248L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2248L() {	 
			return (getShort(beginIp65504P2248L));
   	}
         int localIp65504P2249SCounter = -1;
         public boolean isIp65504P2249SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2249SCounter != sharedCounter;
            localIp65504P2249SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2249_S_LEN = 2;
  	/**
	 * serializeIp65504P2249S
	 */
	protected void serializeIp65504P2249S(short ip65504P2249S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2249S,IP_65504_P_2249_S_LEN)
                  ,beginIp65504P2249S
                  ,IP_65504_P_2249_S_LEN
                 );
            localIp65504P2249SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2249SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2249S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2249S() {	 
			return (getShort(beginIp65504P2249S));
   	}
         int localIp65504P2249LCounter = -1;
         public boolean isIp65504P2249LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2249LCounter != sharedCounter;
            localIp65504P2249LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2249_L_LEN = 2;
  	/**
	 * serializeIp65504P2249L
	 */
	protected void serializeIp65504P2249L(short ip65504P2249L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2249L,IP_65504_P_2249_L_LEN)
                  ,beginIp65504P2249L
                  ,IP_65504_P_2249_L_LEN
                 );
            localIp65504P2249LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2249LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2249L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2249L() {	 
			return (getShort(beginIp65504P2249L));
   	}
         int localIp65504P2250SCounter = -1;
         public boolean isIp65504P2250SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2250SCounter != sharedCounter;
            localIp65504P2250SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2250_S_LEN = 2;
  	/**
	 * serializeIp65504P2250S
	 */
	protected void serializeIp65504P2250S(short ip65504P2250S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2250S,IP_65504_P_2250_S_LEN)
                  ,beginIp65504P2250S
                  ,IP_65504_P_2250_S_LEN
                 );
            localIp65504P2250SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2250SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2250S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2250S() {	 
			return (getShort(beginIp65504P2250S));
   	}
         int localIp65504P2250LCounter = -1;
         public boolean isIp65504P2250LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2250LCounter != sharedCounter;
            localIp65504P2250LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2250_L_LEN = 2;
  	/**
	 * serializeIp65504P2250L
	 */
	protected void serializeIp65504P2250L(short ip65504P2250L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2250L,IP_65504_P_2250_L_LEN)
                  ,beginIp65504P2250L
                  ,IP_65504_P_2250_L_LEN
                 );
            localIp65504P2250LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2250LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2250L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2250L() {	 
			return (getShort(beginIp65504P2250L));
   	}
         int localIp65504P2251SCounter = -1;
         public boolean isIp65504P2251SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2251SCounter != sharedCounter;
            localIp65504P2251SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2251_S_LEN = 2;
  	/**
	 * serializeIp65504P2251S
	 */
	protected void serializeIp65504P2251S(short ip65504P2251S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2251S,IP_65504_P_2251_S_LEN)
                  ,beginIp65504P2251S
                  ,IP_65504_P_2251_S_LEN
                 );
            localIp65504P2251SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2251SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2251S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2251S() {	 
			return (getShort(beginIp65504P2251S));
   	}
         int localIp65504P2251LCounter = -1;
         public boolean isIp65504P2251LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2251LCounter != sharedCounter;
            localIp65504P2251LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2251_L_LEN = 2;
  	/**
	 * serializeIp65504P2251L
	 */
	protected void serializeIp65504P2251L(short ip65504P2251L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2251L,IP_65504_P_2251_L_LEN)
                  ,beginIp65504P2251L
                  ,IP_65504_P_2251_L_LEN
                 );
            localIp65504P2251LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2251LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2251L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2251L() {	 
			return (getShort(beginIp65504P2251L));
   	}
         int localIp65504P2252SCounter = -1;
         public boolean isIp65504P2252SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2252SCounter != sharedCounter;
            localIp65504P2252SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2252_S_LEN = 2;
  	/**
	 * serializeIp65504P2252S
	 */
	protected void serializeIp65504P2252S(short ip65504P2252S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2252S,IP_65504_P_2252_S_LEN)
                  ,beginIp65504P2252S
                  ,IP_65504_P_2252_S_LEN
                 );
            localIp65504P2252SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2252SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2252S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2252S() {	 
			return (getShort(beginIp65504P2252S));
   	}
         int localIp65504P2252LCounter = -1;
         public boolean isIp65504P2252LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2252LCounter != sharedCounter;
            localIp65504P2252LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2252_L_LEN = 2;
  	/**
	 * serializeIp65504P2252L
	 */
	protected void serializeIp65504P2252L(short ip65504P2252L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2252L,IP_65504_P_2252_L_LEN)
                  ,beginIp65504P2252L
                  ,IP_65504_P_2252_L_LEN
                 );
            localIp65504P2252LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2252LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2252L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2252L() {	 
			return (getShort(beginIp65504P2252L));
   	}
         int localIp65504P2253SCounter = -1;
         public boolean isIp65504P2253SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2253SCounter != sharedCounter;
            localIp65504P2253SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2253_S_LEN = 2;
  	/**
	 * serializeIp65504P2253S
	 */
	protected void serializeIp65504P2253S(short ip65504P2253S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2253S,IP_65504_P_2253_S_LEN)
                  ,beginIp65504P2253S
                  ,IP_65504_P_2253_S_LEN
                 );
            localIp65504P2253SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2253SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2253S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2253S() {	 
			return (getShort(beginIp65504P2253S));
   	}
         int localIp65504P2253LCounter = -1;
         public boolean isIp65504P2253LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2253LCounter != sharedCounter;
            localIp65504P2253LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2253_L_LEN = 2;
  	/**
	 * serializeIp65504P2253L
	 */
	protected void serializeIp65504P2253L(short ip65504P2253L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2253L,IP_65504_P_2253_L_LEN)
                  ,beginIp65504P2253L
                  ,IP_65504_P_2253_L_LEN
                 );
            localIp65504P2253LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2253LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2253L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2253L() {	 
			return (getShort(beginIp65504P2253L));
   	}
         int localIp65504P2254SCounter = -1;
         public boolean isIp65504P2254SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2254SCounter != sharedCounter;
            localIp65504P2254SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2254_S_LEN = 2;
  	/**
	 * serializeIp65504P2254S
	 */
	protected void serializeIp65504P2254S(short ip65504P2254S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2254S,IP_65504_P_2254_S_LEN)
                  ,beginIp65504P2254S
                  ,IP_65504_P_2254_S_LEN
                 );
            localIp65504P2254SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2254SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2254S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2254S() {	 
			return (getShort(beginIp65504P2254S));
   	}
         int localIp65504P2254LCounter = -1;
         public boolean isIp65504P2254LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2254LCounter != sharedCounter;
            localIp65504P2254LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2254_L_LEN = 2;
  	/**
	 * serializeIp65504P2254L
	 */
	protected void serializeIp65504P2254L(short ip65504P2254L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2254L,IP_65504_P_2254_L_LEN)
                  ,beginIp65504P2254L
                  ,IP_65504_P_2254_L_LEN
                 );
            localIp65504P2254LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2254LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2254L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2254L() {	 
			return (getShort(beginIp65504P2254L));
   	}
         int localIp65504P2255SCounter = -1;
         public boolean isIp65504P2255SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2255SCounter != sharedCounter;
            localIp65504P2255SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2255_S_LEN = 2;
  	/**
	 * serializeIp65504P2255S
	 */
	protected void serializeIp65504P2255S(short ip65504P2255S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2255S,IP_65504_P_2255_S_LEN)
                  ,beginIp65504P2255S
                  ,IP_65504_P_2255_S_LEN
                 );
            localIp65504P2255SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2255SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2255S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2255S() {	 
			return (getShort(beginIp65504P2255S));
   	}
         int localIp65504P2255LCounter = -1;
         public boolean isIp65504P2255LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2255LCounter != sharedCounter;
            localIp65504P2255LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2255_L_LEN = 2;
  	/**
	 * serializeIp65504P2255L
	 */
	protected void serializeIp65504P2255L(short ip65504P2255L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2255L,IP_65504_P_2255_L_LEN)
                  ,beginIp65504P2255L
                  ,IP_65504_P_2255_L_LEN
                 );
            localIp65504P2255LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2255LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2255L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2255L() {	 
			return (getShort(beginIp65504P2255L));
   	}
         int localIp65504P2256SCounter = -1;
         public boolean isIp65504P2256SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2256SCounter != sharedCounter;
            localIp65504P2256SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2256_S_LEN = 2;
  	/**
	 * serializeIp65504P2256S
	 */
	protected void serializeIp65504P2256S(short ip65504P2256S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2256S,IP_65504_P_2256_S_LEN)
                  ,beginIp65504P2256S
                  ,IP_65504_P_2256_S_LEN
                 );
            localIp65504P2256SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2256SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2256S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2256S() {	 
			return (getShort(beginIp65504P2256S));
   	}
         int localIp65504P2256LCounter = -1;
         public boolean isIp65504P2256LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2256LCounter != sharedCounter;
            localIp65504P2256LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2256_L_LEN = 2;
  	/**
	 * serializeIp65504P2256L
	 */
	protected void serializeIp65504P2256L(short ip65504P2256L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2256L,IP_65504_P_2256_L_LEN)
                  ,beginIp65504P2256L
                  ,IP_65504_P_2256_L_LEN
                 );
            localIp65504P2256LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2256LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2256L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2256L() {	 
			return (getShort(beginIp65504P2256L));
   	}
         int localIp65504P2257SCounter = -1;
         public boolean isIp65504P2257SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2257SCounter != sharedCounter;
            localIp65504P2257SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2257_S_LEN = 2;
  	/**
	 * serializeIp65504P2257S
	 */
	protected void serializeIp65504P2257S(short ip65504P2257S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2257S,IP_65504_P_2257_S_LEN)
                  ,beginIp65504P2257S
                  ,IP_65504_P_2257_S_LEN
                 );
            localIp65504P2257SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2257SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2257S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2257S() {	 
			return (getShort(beginIp65504P2257S));
   	}
         int localIp65504P2257LCounter = -1;
         public boolean isIp65504P2257LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2257LCounter != sharedCounter;
            localIp65504P2257LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2257_L_LEN = 2;
  	/**
	 * serializeIp65504P2257L
	 */
	protected void serializeIp65504P2257L(short ip65504P2257L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2257L,IP_65504_P_2257_L_LEN)
                  ,beginIp65504P2257L
                  ,IP_65504_P_2257_L_LEN
                 );
            localIp65504P2257LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2257LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2257L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2257L() {	 
			return (getShort(beginIp65504P2257L));
   	}
         int localIp65504P2258SCounter = -1;
         public boolean isIp65504P2258SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2258SCounter != sharedCounter;
            localIp65504P2258SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2258_S_LEN = 2;
  	/**
	 * serializeIp65504P2258S
	 */
	protected void serializeIp65504P2258S(short ip65504P2258S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2258S,IP_65504_P_2258_S_LEN)
                  ,beginIp65504P2258S
                  ,IP_65504_P_2258_S_LEN
                 );
            localIp65504P2258SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2258SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2258S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2258S() {	 
			return (getShort(beginIp65504P2258S));
   	}
         int localIp65504P2258LCounter = -1;
         public boolean isIp65504P2258LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2258LCounter != sharedCounter;
            localIp65504P2258LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2258_L_LEN = 2;
  	/**
	 * serializeIp65504P2258L
	 */
	protected void serializeIp65504P2258L(short ip65504P2258L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2258L,IP_65504_P_2258_L_LEN)
                  ,beginIp65504P2258L
                  ,IP_65504_P_2258_L_LEN
                 );
            localIp65504P2258LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2258LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2258L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2258L() {	 
			return (getShort(beginIp65504P2258L));
   	}
         int localIp65504P2259SCounter = -1;
         public boolean isIp65504P2259SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2259SCounter != sharedCounter;
            localIp65504P2259SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2259_S_LEN = 2;
  	/**
	 * serializeIp65504P2259S
	 */
	protected void serializeIp65504P2259S(short ip65504P2259S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2259S,IP_65504_P_2259_S_LEN)
                  ,beginIp65504P2259S
                  ,IP_65504_P_2259_S_LEN
                 );
            localIp65504P2259SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2259SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2259S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2259S() {	 
			return (getShort(beginIp65504P2259S));
   	}
         int localIp65504P2259LCounter = -1;
         public boolean isIp65504P2259LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2259LCounter != sharedCounter;
            localIp65504P2259LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2259_L_LEN = 2;
  	/**
	 * serializeIp65504P2259L
	 */
	protected void serializeIp65504P2259L(short ip65504P2259L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2259L,IP_65504_P_2259_L_LEN)
                  ,beginIp65504P2259L
                  ,IP_65504_P_2259_L_LEN
                 );
            localIp65504P2259LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2259LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2259L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2259L() {	 
			return (getShort(beginIp65504P2259L));
   	}
         int localIp65504P2260SCounter = -1;
         public boolean isIp65504P2260SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2260SCounter != sharedCounter;
            localIp65504P2260SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2260_S_LEN = 2;
  	/**
	 * serializeIp65504P2260S
	 */
	protected void serializeIp65504P2260S(short ip65504P2260S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2260S,IP_65504_P_2260_S_LEN)
                  ,beginIp65504P2260S
                  ,IP_65504_P_2260_S_LEN
                 );
            localIp65504P2260SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2260SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2260S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2260S() {	 
			return (getShort(beginIp65504P2260S));
   	}
         int localIp65504P2260LCounter = -1;
         public boolean isIp65504P2260LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2260LCounter != sharedCounter;
            localIp65504P2260LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2260_L_LEN = 2;
  	/**
	 * serializeIp65504P2260L
	 */
	protected void serializeIp65504P2260L(short ip65504P2260L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2260L,IP_65504_P_2260_L_LEN)
                  ,beginIp65504P2260L
                  ,IP_65504_P_2260_L_LEN
                 );
            localIp65504P2260LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2260LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2260L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2260L() {	 
			return (getShort(beginIp65504P2260L));
   	}
         int localIp65504P2261SCounter = -1;
         public boolean isIp65504P2261SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2261SCounter != sharedCounter;
            localIp65504P2261SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2261_S_LEN = 2;
  	/**
	 * serializeIp65504P2261S
	 */
	protected void serializeIp65504P2261S(short ip65504P2261S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2261S,IP_65504_P_2261_S_LEN)
                  ,beginIp65504P2261S
                  ,IP_65504_P_2261_S_LEN
                 );
            localIp65504P2261SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2261SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2261S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2261S() {	 
			return (getShort(beginIp65504P2261S));
   	}
         int localIp65504P2261LCounter = -1;
         public boolean isIp65504P2261LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2261LCounter != sharedCounter;
            localIp65504P2261LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2261_L_LEN = 2;
  	/**
	 * serializeIp65504P2261L
	 */
	protected void serializeIp65504P2261L(short ip65504P2261L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2261L,IP_65504_P_2261_L_LEN)
                  ,beginIp65504P2261L
                  ,IP_65504_P_2261_L_LEN
                 );
            localIp65504P2261LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2261LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2261L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2261L() {	 
			return (getShort(beginIp65504P2261L));
   	}
         int localIp65504P2262SCounter = -1;
         public boolean isIp65504P2262SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2262SCounter != sharedCounter;
            localIp65504P2262SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2262_S_LEN = 2;
  	/**
	 * serializeIp65504P2262S
	 */
	protected void serializeIp65504P2262S(short ip65504P2262S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2262S,IP_65504_P_2262_S_LEN)
                  ,beginIp65504P2262S
                  ,IP_65504_P_2262_S_LEN
                 );
            localIp65504P2262SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2262SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2262S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2262S() {	 
			return (getShort(beginIp65504P2262S));
   	}
         int localIp65504P2262LCounter = -1;
         public boolean isIp65504P2262LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2262LCounter != sharedCounter;
            localIp65504P2262LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2262_L_LEN = 2;
  	/**
	 * serializeIp65504P2262L
	 */
	protected void serializeIp65504P2262L(short ip65504P2262L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2262L,IP_65504_P_2262_L_LEN)
                  ,beginIp65504P2262L
                  ,IP_65504_P_2262_L_LEN
                 );
            localIp65504P2262LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2262LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2262L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2262L() {	 
			return (getShort(beginIp65504P2262L));
   	}
         int localIp65504P2263SCounter = -1;
         public boolean isIp65504P2263SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2263SCounter != sharedCounter;
            localIp65504P2263SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2263_S_LEN = 2;
  	/**
	 * serializeIp65504P2263S
	 */
	protected void serializeIp65504P2263S(short ip65504P2263S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2263S,IP_65504_P_2263_S_LEN)
                  ,beginIp65504P2263S
                  ,IP_65504_P_2263_S_LEN
                 );
            localIp65504P2263SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2263SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2263S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2263S() {	 
			return (getShort(beginIp65504P2263S));
   	}
         int localIp65504P2263LCounter = -1;
         public boolean isIp65504P2263LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2263LCounter != sharedCounter;
            localIp65504P2263LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2263_L_LEN = 2;
  	/**
	 * serializeIp65504P2263L
	 */
	protected void serializeIp65504P2263L(short ip65504P2263L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2263L,IP_65504_P_2263_L_LEN)
                  ,beginIp65504P2263L
                  ,IP_65504_P_2263_L_LEN
                 );
            localIp65504P2263LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2263LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2263L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2263L() {	 
			return (getShort(beginIp65504P2263L));
   	}




}
  
